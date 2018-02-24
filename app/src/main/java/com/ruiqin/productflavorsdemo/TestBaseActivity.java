package com.ruiqin.productflavorsdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class TestBaseActivity extends AppCompatActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent();
        intent.setAction(BuildConfig.APPLICATION_ID + ".TestBaseActivity");
        context.startActivity(intent);
    }


    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_base);

        mTextView = (TextView) findViewById(R.id.textView);
    }
}
