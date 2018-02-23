package com.ruiqin.productflavorsdemo;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/test/TestActivity")
public class TestActivity extends TestBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTextView.setText("beijing TestActivity");
    }
}
