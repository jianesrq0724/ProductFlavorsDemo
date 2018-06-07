package com.ruiqin.productflavorsdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ruiqin.productflavorsdemo.util.ActivityUtils;


public class TestBaseActivity extends AppCompatActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent();
        String className = "com.ruiqin.productflavorsdemo.TestActivity";
        if (!ActivityUtils.isExist(className)) {
            className = "com.ruiqin.productflavorsdemo.TestBaseActivity";
        }
        intent.setClassName(BuildConfig.APPLICATION_ID, className);
        context.startActivity(intent);
    }

    public TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_base);

        mTextView = (TextView) findViewById(R.id.textView);
    }
}
