package com.miguelangelboti.books.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pdf {

    @Expose
    @SerializedName("isAvailable")
    public Boolean isAvailable;

    public Boolean getIsAvailable() {
        return isAvailable;
    }
}
