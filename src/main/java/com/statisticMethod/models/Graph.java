package com.statisticMethod.models;

import com.google.gson.JsonObject;

import java.math.BigInteger;

public interface Graph {
    JsonObject getGraphJSON();

    long getId();

    String getName();
}
