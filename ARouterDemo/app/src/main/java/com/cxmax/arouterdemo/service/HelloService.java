package com.cxmax.arouterdemo.service;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-4-16.
 */
public interface HelloService extends IProvider {

    void sayHello(String name);

}
