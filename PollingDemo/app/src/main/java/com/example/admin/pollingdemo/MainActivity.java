package com.example.admin.pollingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.admin.pollingdemo.PollingService.ACTION_CHECK_CIRCLE_UPDATE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PollingUtil.startPollingService(this, ACTION_CHECK_CIRCLE_UPDATE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        PollingUtil.stopPollingServices();
    }
}
