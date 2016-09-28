package com.murano500k.test.awstestproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.murano500k.test.awstestproject.fblogin.PrefUtils;
import com.murano500k.test.awstestproject.fblogin.User;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


	private CallbackManager callbackManager;
	private LoginButton loginButton;
	private TextView btnLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

	}

	@Override
	protected void onResume() {
		super.onResume();
		if(PrefUtils.getCurrentUser(MainActivity.this) != null){
			Intent homeIntent = new Intent(MainActivity.this, ListActivity.class);
			startActivity(homeIntent);
			finish();
		}else {
			callbackManager= CallbackManager.Factory.create();
			btnLogin= (TextView) findViewById(R.id.btnLogin);
			btnLogin.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					loginButton= (LoginButton)findViewById(R.id.login_button);
					loginButton.setReadPermissions("public_profile", "email","user_friends");
					loginButton.performClick();
					loginButton.setPressed(true);
					loginButton.invalidate();
					loginButton.registerCallback(callbackManager, mCallBack);
					loginButton.setPressed(false);
					loginButton.invalidate();
				}
			});
		}

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if(callbackManager!=null) callbackManager.onActivityResult(requestCode, resultCode, data);
	}


	private FacebookCallback<LoginResult> mCallBack = new FacebookCallback<LoginResult>() {
		@Override
		public void onSuccess(LoginResult loginResult) {
			GraphRequest request = GraphRequest.newMeRequest(
					loginResult.getAccessToken(),
					new GraphRequest.GraphJSONObjectCallback() {
						@Override
						public void onCompleted(
								JSONObject object,
								GraphResponse response) {

							Log.e("response: ", response + "");
							try {
								User user = new User();
								user.facebookID = object.getString("id").toString();
								user.email = object.getString("email").toString();
								user.name = object.getString("name").toString();
								user.gender = object.getString("gender").toString();
								PrefUtils.setCurrentUser(user,MainActivity.this);
								Toast.makeText(MainActivity.this,"welcome "+user.name,Toast.LENGTH_LONG).show();
							}catch (Exception e){
								e.printStackTrace();
							}
							Intent intent=new Intent(MainActivity.this,ListActivity.class);
							startActivity(intent);
							finish();

						}

					});

			Bundle parameters = new Bundle();
			parameters.putString("fields", "id,name,email,gender, birthday");
			request.setParameters(parameters);
			request.executeAsync();
		}

		@Override
		public void onCancel() {
		}

		@Override
		public void onError(FacebookException e){
			Toast.makeText(getApplicationContext(), "Login ERROR", Toast.LENGTH_SHORT).show();
			e.printStackTrace();

		}
	};
}
