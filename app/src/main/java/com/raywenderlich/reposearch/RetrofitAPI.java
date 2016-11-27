package com.raywenderlich.reposearch;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by scheng on 11/27/16.
 */

public interface RetrofitAPI {
    @GET("/repositories")
    Call<ArrayList<Repository>> retrieveRepositories();
}
