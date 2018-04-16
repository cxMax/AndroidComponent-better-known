package com.cxmax.arouterdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-3-30.
 */

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}
