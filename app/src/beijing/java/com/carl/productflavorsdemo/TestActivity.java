package com.carl.productflavorsdemo;

import android.os.Bundle;

import com.carl.productflavorsdemo.TestBaseActivity;


public class TestActivity extends TestBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTextView.setText("beijing TestActivity");
    }
}
