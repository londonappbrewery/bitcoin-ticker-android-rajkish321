package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class BitCoinModel {

    private double price;

    public static BitCoinModel fromJson(JSONObject jsonObject) {
        try {
            BitCoinModel bitCoinModel = new BitCoinModel();


            bitCoinModel.price = jsonObject.getDouble("last");
            return bitCoinModel;
        } catch (JSONException e) {

            e.printStackTrace();
            Log.d("BitTracker","Error: " + e.toString());
            return null;
        }


    }

    public double getPrice() {
        return price;
    }
}
