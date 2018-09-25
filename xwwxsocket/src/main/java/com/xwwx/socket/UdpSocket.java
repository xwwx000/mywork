package com.xwwx.socket;

import android.content.Context;
import android.util.Log;

import com.xwwx.common.Constant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @功能 UdpSocket封装类
 * @作者 xwwx
 * @创建日期 2018/9/25
 */

public class UdpSocket {

    private static final String TAG = "UDPSocket";
    private ExecutorService mThreadPool;

    public UdpSocket(Context context){

        //获取CUP数量
        int cupNumber = Constant.CUP_NUM;
        // 根据CPU数目初始化线程池
        mThreadPool = Executors.newFixedThreadPool(cupNumber * Constant.POOL_SIZE);
        Log.v(TAG,"创建UDP对象,线程池数量:"+cupNumber * Constant.POOL_SIZE);
    }

    /**
     * 释放资源
     */
    public void stopUDPSocket() {

        if (mThreadPool != null) {
            mThreadPool.shutdown();
        }
    }
}
