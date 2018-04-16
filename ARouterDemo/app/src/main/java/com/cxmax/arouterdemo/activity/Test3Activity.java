package com.cxmax.arouterdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cxmax.arouterdemo.R;
import com.cxmax.arouterdemo.base.BaseActivity;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-3-30.
 */

@Route(path = "/test/activity3")
public class Test3Activity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
}
