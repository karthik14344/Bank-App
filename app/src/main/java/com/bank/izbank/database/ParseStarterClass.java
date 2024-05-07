package com.bank.izbank.database;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("bYGeBj5zQAvPGnDDiZsQBytMazzoSAoZSofMLgPC")
                // if desired
                .clientKey("BPFztBueiDnM3Rfzyqicn4Ijkr2t36MH6IyW1Xr9")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
