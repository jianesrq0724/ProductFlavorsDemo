package com.ruiqin.productflavorsdemo;

import android.content.Context;
import android.os.Bundle;


public class TestActivity extends TestBaseActivity {


    public static void startActivity(Context context) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTextView.setText("shenzhen TestActivity");
    }
}
