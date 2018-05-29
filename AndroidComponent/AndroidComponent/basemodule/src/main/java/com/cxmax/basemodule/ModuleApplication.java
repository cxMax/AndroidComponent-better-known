package com.cxmax.basemodule;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-5-1.
 */
public class ModuleApplication extends Application {

    private static ModuleApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();


    }

    public static ModuleApplication getInstance() {
        return instance;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // 65535
        instance = this;
        MultiDex.install(this);
    }
}
