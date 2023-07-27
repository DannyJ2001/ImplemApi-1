package com.example.implemapi.io;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HolidayApiService {
    @GET("holidays")
    Call<HolidayResponse> getHolidays(
            @Query("country") String country,
            @Query("year") int year,
            @Query("key") String apiKey
    );
}