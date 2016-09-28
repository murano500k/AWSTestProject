package com.murano500k.test.awstestproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.murano500k.test.awstestproject.fblogin.PrefUtils;
import com.murano500k.test.awstestproject.fblogin.User;
import com.murano500k.test.awstestproject.model.Building;

import java.util.List;
import java.util.Random;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class ListActivity extends AppCompatActivity {
	RecyclerView recyclerView;
	private MyListAdapter listAdapter;
	Toast toast;

	ProgressBar progressBar;
	private Subscription mSubscription;
	private List<Building> listItems;
	TextView name, email;
	Button btnLogout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		progressBar=(ProgressBar) findViewById(R.id.progressBar);
		name = (TextView)findViewById(R.id.textViewName);
		email = (TextView)findViewById(R.id.textViewEmail);

		User user = PrefUtils.getCurrentUser(this);
		if(user == null ) {
			Log.e("ERROR", "user is empty");
			finish();
		} else {
			String title = user.name+" "+user.email;
			showToast("Hello "+title);
			name.setText(user.name);
			email.setText(user.email);
			loadContent();
		}
	}
	private void loadContent() {
		if (listItems != null && listItems.size() > 0) {
			initList(listItems);
		} else {
			if (mSubscription != null && !mSubscription.isUnsubscribed())
				mSubscription.unsubscribe();
			mSubscription = Observable.just(1)
					.doOnNext(i -> {
						showToast("Loading started");
						Log.w("OK", "Loading started");
						progressBar.setVisibility(View.VISIBLE);
					})
					.flatMap(integer -> {
						return observeGetListContent()
								.observeOn(AndroidSchedulers.mainThread())//interaction with UI must be performed on main thread
								.doOnError(throwable -> {
									showToast("Loading error " + throwable.getMessage());
									Log.e("ERROR", throwable.getMessage() + ". Loading error");
								})
								.onErrorResumeNext(Observable.empty());//prevent observable from breaking
					})
					.subscribe(list -> {
						assertNotNull(list);
						assertTrue(list.size() > 0);
						listItems = list;
						initList(listItems);
						progressBar.setVisibility(View.GONE);
						Log.w("SUCCESS", "Loading success");
						showToast("Loading success ");
						if (mSubscription != null && !mSubscription.isUnsubscribed())
							mSubscription.unsubscribe();

					});
		}
	}
	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}

	private void initList(List<Building> list){
		listAdapter= new MyListAdapter(list);
		listAdapter.setHasStableIds(true);
		recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
		RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
		recyclerView.setLayoutManager(mLayoutManager);
		recyclerView.setItemAnimator(new DefaultItemAnimator());
		recyclerView.setAdapter(listAdapter);
		recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
			@Override
			public void onClick(View view, int position) {
				long i = listAdapter.getItemId(position);
				Log.v("Intent", "Detail ID "+ i);
				assertTrue(i>0);
				Intent intent=new Intent(ListActivity.this, DetailActivity.class);
				intent.setAction(DetailActivity.INTENT_ACTION_DETAIL);
				intent.putExtra(DetailActivity.INTENT_EXTRA_ID, i);
				startActivity(intent);
			}

			@Override
			public void onLongClick(View view, int position) {

			}
		}));
		listAdapter.notifyDataSetChanged();
		return;
	}

	public static Observable<List<Building>> observeGetListContent() {
		return Observable.just(new Random().nextInt())
				.observeOn(Schedulers.computation())
				.flatMap(new Func1<Integer, Observable<List<Building>>>() {
					@Override
					public Observable<List<Building>> call(Integer integer) {
						RestHelper restHelper=new RestHelper();
						List<Building> list =restHelper.getItems();
						Log.v("download","Download list result "+ list.toString());
						assertNotNull(list);
						return Observable.just(list);
					}
				});
	}

	public void showToast(String text){
		Observable.just(1)
				.subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(integer -> {
					if(toast!=null){
						toast.cancel();
						toast=null;
					}
					toast= Toast.makeText(getApplicationContext(), text,Toast.LENGTH_SHORT);
					toast.show();
				});
	}
	public void hideToast(){
		Observable.just(1)
				.subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(integer -> {
					if(toast!=null){
						toast.cancel();
						toast=null;
					}
				});
	}
	public interface ClickListener {
		void onClick(View view, int position);

		void onLongClick(View view, int position);
	}
}
