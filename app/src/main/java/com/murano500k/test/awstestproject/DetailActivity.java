package com.murano500k.test.awstestproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.murano500k.test.awstestproject.model.DetailContent;
import com.squareup.picasso.Picasso;

import java.util.Random;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

import static com.murano500k.test.awstestproject.RestHelper.BASE_URL;
import static junit.framework.Assert.assertNotNull;

public class DetailActivity extends AppCompatActivity {
	public static final String INTENT_ACTION_DETAIL = "com.murano500k.test.awstestproject.INTENT_ACTION_DETAIL";
	public static final String INTENT_EXTRA_ID = "com.murano500k.test.awstestproject.INTENT_EXTRA_ID";

	TextView idText;

	TextView titleText;

	TextView addressText;

	TextView descriptionText;

	ImageView image;

	private Subscription mSubscription;

	ProgressBar progressBar;
	DetailContent detailContent;
	long detailId;
	private Toast toast;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		idText =(TextView) findViewById(R.id.textViewId);
		titleText =(TextView) findViewById(R.id.textViewTitle);
		addressText =(TextView) findViewById(R.id.textViewAddress);
		descriptionText =(TextView) findViewById(R.id.textViewDescription);
		image =(ImageView) findViewById(R.id.imageView);
		progressBar =(ProgressBar) findViewById(R.id.progressBarDetail);

		Intent intent=getIntent();
		if(intent==null
				|| intent.getAction()==null
				|| !intent.getAction().contains(INTENT_ACTION_DETAIL)) {
			Log.e("ERROR", "NO DATA RECIEVED");
			finish();
		}else {
			detailId = intent.getLongExtra(INTENT_EXTRA_ID, -1);
			Log.v("IntentRecieved", "Detail ID "+ detailId);
			loadContent();
		}
	}
	private void loadContent() {
		progressBar.setVisibility(View.VISIBLE);
		if (detailId >0) {
			if(detailContent!=null){
				initUi(detailContent);
			}else {
				if (mSubscription != null && !mSubscription.isUnsubscribed())
					mSubscription.unsubscribe();
				mSubscription = Observable.just(1)
						.doOnNext(i -> {
							Log.w("OK", "Loading started");
						})
						.flatMap(integer -> {
							return observeGetDetailContent(detailId)
									.observeOn(AndroidSchedulers.mainThread())//interaction with UI must be performed on main thread
									.doOnError(throwable -> {
										Log.e("ERROR",throwable.getMessage()+". Loading error");
										progressBar.setVisibility(View.VISIBLE);

									})
									.onErrorResumeNext(Observable.empty());//prevent observable from breaking
						})
						.subscribe(detail -> {
							assertNotNull(detail);
							detailContent=detail;
							initUi(detailContent);
							progressBar.setVisibility(View.GONE);
							Log.w("SUCCESS","Loading success");
							if(mSubscription!=null && !mSubscription.isUnsubscribed()) mSubscription.unsubscribe();

						});
			}
		}else{
			Log.e("ERROR", "No detailId");
			finish();
		}

	}
	private void initUi(DetailContent detail){
		String idString ="id: " +String.valueOf(detail.getId());
		idText.setText(idString);
		titleText.setText(detail.getTitle());
		addressText.setText(detail.getAddress());
		descriptionText.setText(detail.getDescription());
		String imgUrl = BASE_URL+ "/" + detail.getImage();
		Log.w("Picasso detail url", imgUrl);
		Picasso.with(getApplicationContext()).load(Uri.parse(imgUrl)).into(image);
	}

	public Observable<DetailContent> observeGetDetailContent(long i) {
		return Observable.just(new Random().nextInt())
				.observeOn(Schedulers.computation())
				.flatMap(new Func1<Integer, Observable<DetailContent>>() {
					@Override
					public Observable<DetailContent> call(Integer integer) {
						RestHelper restHelper= new RestHelper();
						DetailContent detailContent=restHelper.getDetail(i);
						Log.v("download","Download list result "+ detailContent.getDescription());
						assertNotNull(detailContent);
						return Observable.just(detailContent);
					}
				});
	}
	@Override
	protected void onStop() {
		if(mSubscription!=null && !mSubscription.isUnsubscribed()) mSubscription.unsubscribe();
		super.onStop();
	}
}
