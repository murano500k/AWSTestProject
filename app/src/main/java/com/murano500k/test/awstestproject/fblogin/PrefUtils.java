package com.murano500k.test.awstestproject.fblogin;

import android.content.Context;

/**
 * Created by artem on 9/28/16.
 */

public class PrefUtils {
	public static void setCurrentUser(User currentUser, Context ctx){
		ComplexPreferences complexPreferences = ComplexPreferences.getComplexPreferences(ctx, "user_prefs", 0);
		complexPreferences.putObject("current_user_value", currentUser);
		complexPreferences.commit();
	}

	public static User getCurrentUser(Context ctx){
		ComplexPreferences complexPreferences = ComplexPreferences.getComplexPreferences(ctx, "user_prefs", 0);
				return complexPreferences.getObject("current_user_value", User.class);
	}


}
