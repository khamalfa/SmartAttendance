package com.example.issp_absencctv.api;

import com.example.issp_absencctv.model.Absen;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("facts/json/progress/all")
    Call<List<Absen>> getJson(@Query("tanggal") String tanggal);
}
