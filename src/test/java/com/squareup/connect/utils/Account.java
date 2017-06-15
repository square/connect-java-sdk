package com.squareup.connect.utils;

import com.google.gson.annotations.SerializedName;

// Represent the account info
public class Account {
    @SerializedName("email")
    public String email;
    @SerializedName("access_token")
    public String accessToken;
    @SerializedName("location_id")
    public String locationId;
    @SerializedName("application_id")
    public String applicationId;
}