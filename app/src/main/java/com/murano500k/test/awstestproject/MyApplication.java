package com.murano500k.test.awstestproject;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by artem on 9/28/16.
 */

public class MyApplication  extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		FacebookSdk.sdkInitialize(this);
		AppEventsLogger.activateApp(getApplicationContext(), getApplicationContext().getResources().getString(R.string.facebook_app_id));
	}
}

