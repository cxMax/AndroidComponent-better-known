package com.cxmax.androidcomponent.debug;

import com.cxmax.androidcomponent.R;
import com.cxmax.basemodule.BaseActivity;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-5-1.
 */
public class MainDebugActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main_debug;
    }

    @Override
    protected void initView() {
        setTitle("主页面");
    }
}
