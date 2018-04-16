package com.cxmax.arouterdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.cxmax.arouterdemo.R;
import com.cxmax.arouterdemo.base.BaseActivity;
import com.cxmax.arouterdemo.model.Human;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-3-30.
 */

@Route(path = "/test/activity1")
public class Test1Activity extends BaseActivity {

    @Autowired
    String name = "jack";

    @Autowired(name = "boy")
    boolean girl;

    @Autowired(name = "person")
    Human human;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        String params = String.format("name=%s, girl=%s, human=%s", name, girl, human);
        ((TextView)findViewById(R.id.textView)).setText(params);
        setResult(999);
    }
}
