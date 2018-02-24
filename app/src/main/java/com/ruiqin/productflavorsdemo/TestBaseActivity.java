package com.ruiqin.productflavorsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/test/TestBaseActivity1", priority = 2)
public class TestBaseActivity extends AppCompatActivity {


    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_base);

        mTextView = (TextView) findViewById(R.id.textView);
    }
}
