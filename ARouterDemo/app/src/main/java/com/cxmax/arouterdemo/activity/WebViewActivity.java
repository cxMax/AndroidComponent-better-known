package com.cxmax.arouterdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.cxmax.arouterdemo.MainActivity;
import com.cxmax.arouterdemo.R;
import com.cxmax.arouterdemo.base.BaseActivity;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-3-30.
 */

@Route(path = "/test/webview")
public class WebViewActivity extends BaseActivity {

    @Autowired
    String url;

    WebView webview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        Toast.makeText(WebViewActivity.this, "url = " + url, Toast.LENGTH_LONG).show();
        webview = (WebView) findViewById(R.id.webview);
        webview.loadUrl(url);
    }
}
