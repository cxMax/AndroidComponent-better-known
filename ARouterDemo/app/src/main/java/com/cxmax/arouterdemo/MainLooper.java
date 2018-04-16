package com.cxmax.arouterdemo;


import android.os.Handler;
import android.os.Looper;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-3-30.
 */

public class MainLooper extends Handler {

    private static MainLooper instance = new MainLooper(Looper.getMainLooper());

    private MainLooper(Looper looper) {
        super(looper);
    }

    public static MainLooper getInstance() {
        return instance;
    }

    public static void runOnUiThread(Runnable runnable) {
        if(Looper.getMainLooper().equals(Looper.myLooper())) {
            runnable.run();
        } else {
            instance.post(runnable);
        }

    }

}
