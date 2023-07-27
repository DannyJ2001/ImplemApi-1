package com.example.implemapi.io;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HolidayResponse {
    @SerializedName("holidays")
    private List<Holiday> holidays;

    public List<Holiday> getHolidays() {
        return holidays;
    }
}


