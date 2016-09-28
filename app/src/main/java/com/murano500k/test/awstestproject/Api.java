package com.murano500k.test.awstestproject;

import com.murano500k.test.awstestproject.model.ResponceDetail;
import com.murano500k.test.awstestproject.model.ResponceList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by artem on 9/28/16.
 */

public interface Api {
	@GET("/v1/building/list")
	Call<ResponceList> getList();

	@GET("/v1/building/detail")
	Call<ResponceDetail> getDetail(@Query("id") int id);



/*
	@GET("/detail")
	Call<> getDetail(@Path("user") String user);
*/

}
