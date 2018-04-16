package com.cxmax.arouterdemo.service;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-4-16.
 */
@Route(path = "/service/hello")
public class HelloServiceImpl implements HelloService {

    private Context context;

    @Override
    public void sayHello(String name) {
        Toast.makeText(context, "Hello " + name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {
        this.context = context;
    }
}
