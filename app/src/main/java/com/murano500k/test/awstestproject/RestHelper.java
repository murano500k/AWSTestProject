package com.murano500k.test.awstestproject;

import com.murano500k.test.awstestproject.model.Building;
import com.murano500k.test.awstestproject.model.DetailContent;
import com.murano500k.test.awstestproject.model.ResponceDetail;
import com.murano500k.test.awstestproject.model.ResponceList;

import java.io.IOException;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by artem on 9/28/16.
 */

public class RestHelper {
	private Retrofit retrofit;
	static final String BASE_URL="http://sunnyislere.aws4apps.com";

	RestHelper() {
			retrofit = new Retrofit.Builder()
					.baseUrl(BASE_URL)
					.client(new OkHttpClient())
					.addConverterFactory(GsonConverterFactory.create())
					.build();
		}

	List<Building> getItems(){
		Api service = retrofit.create(Api.class);
		Call<ResponceList> responceListCall = service.getList();
		try {
			Response<ResponceList> responceList=responceListCall.execute();
			assertTrue(responceList.isSuccessful());
			List<Building> buildings=responceList.body().getData().getBuildings();
			assertNotNull(buildings);
			return buildings;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
	DetailContent getDetail(long _id){
		Api service = retrofit.create(Api.class);
		int i=(int)_id;
		Call<ResponceDetail> responceDetailCall = service.getDetail(i);
		try {
			Response<ResponceDetail> responceList=responceDetailCall.execute();
			assertTrue(responceList.isSuccessful());
			return responceList.body().getDetailContent();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
