package com.xwwx.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xwwx.R;
import com.xwwx.socket.UdpSocket;

/**
 * @功能 首页
 *
 * @作者 xwwx
 *
 * @创建日期 2018/9/25 上午 10:20
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UdpSocket udpSocket = new UdpSocket(this);

        udpSocket.stopUDPSocket();
    }
}
