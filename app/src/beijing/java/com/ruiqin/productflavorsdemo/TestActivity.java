package com.ruiqin.productflavorsdemo;

import android.os.Bundle;


public class TestActivity extends TestBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTextView.setText("beijing TestActivity");
    }
}
