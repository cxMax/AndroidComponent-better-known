package com.cxmax.arouterdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.cxmax.arouterdemo.base.BaseActivity;
import com.cxmax.arouterdemo.model.Human;
import com.cxmax.arouterdemo.service.HelloService;

public class MainActivity extends BaseActivity {

    private static Activity activity;

    public static Activity getThis() {
        return activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        setContentView(R.layout.activity_main);
        findViewById(R.id.navigate1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build("/test/activity1")
                        .withString("name", "老王")
                        .withBoolean("boy", false)
                        .withObject("person", new Human("丽莎", 21))
                        .navigation();
            }
        });
        findViewById(R.id.navigate2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build("/test/activity1")
                        .navigation(MainActivity.this, 666);
            }
        });
        findViewById(R.id.navigate3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build("/test/activity3")
                        .navigation(MainActivity.this, new NavCallback() {
                            @Override
                            public void onArrival(Postcard postcard) {

                            }

                            @Override
                            public void onInterrupt(Postcard postcard) {
                                MainLooper.runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(MainActivity.this, "未登录", Toast.LENGTH_LONG).show();
                                    }
                                });
                            }
                        });
            }
        });
        findViewById(R.id.navigate4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build("/test/webview")
                        .withString("url", "www.baidu.com")
                        .navigation();
            }
        });
        findViewById(R.id.navigate5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = (Fragment) ARouter.getInstance().build("/test/fragment").navigation();
                Toast.makeText(MainActivity.this, "找到Fragment:" + fragment.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.navigate6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((HelloService)ARouter.getInstance()
                        .build("/service/hello")
                        .navigation()).sayHello("lilei");
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 666:
                ((Button)findViewById(R.id.navigate2)).setText(String.valueOf(resultCode));
                break;
            default:
                break;
        }
    }
}
