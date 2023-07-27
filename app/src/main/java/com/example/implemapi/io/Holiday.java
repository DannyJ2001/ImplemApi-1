package com.example.implemapi.io;

import com.google.gson.annotations.SerializedName;

public class Holiday {
    @SerializedName("name")
    private String name;

    @SerializedName("date")
    private String date;

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}


