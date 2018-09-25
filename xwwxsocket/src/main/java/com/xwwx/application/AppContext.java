package com.xwwx.application;

import android.app.Application;

import com.xwwx.common.Constant;

/**
 * @功能 系统入口
 * @作者 xwwx
 * @创建日期 2018/9/25
 */

public class AppContext extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Constant.CUP_NUM = Runtime.getRuntime().availableProcessors();
    }
}
