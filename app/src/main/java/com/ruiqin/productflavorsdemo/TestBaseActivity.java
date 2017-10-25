package com.ruiqin.productflavorsdemo;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class TestBaseActivity extends AppCompatActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent();
        intent.setAction("TestBaseActivity");
        intent.setData(Uri.parse("content://main"));
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveInfo = packageManager.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY);
        if (resolveInfo == null) {
            intent.setData(Uri.parse("content://" + BuildConfig.FLAVOR));
        }
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
