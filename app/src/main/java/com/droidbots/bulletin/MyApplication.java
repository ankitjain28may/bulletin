package com.droidbots.bulletin;

import android.app.Application;
import android.content.Context;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Ashish on 11/21/2015.
 */
public class MyApplication extends Application{

    Context context;
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/OpenSans-Semibold.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
    }
}
