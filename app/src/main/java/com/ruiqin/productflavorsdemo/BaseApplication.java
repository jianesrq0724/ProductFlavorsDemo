package com.ruiqin.productflavorsdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/2/23
 * 版权所有：深圳市亿车科技有限公司
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ARouter.init(this);
    }
}
