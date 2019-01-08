package com.example.admin.pollingdemo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created time 19:46.
 *
 * @author huhanjun
 * @since 2019/1/4
 */
public class PollingService extends PollingIntentService {
    public static final long DEFAULT_MIN_POLLING_INTERVAL = 60000;//最短轮询间隔1分钟
    public static final String ACTION_CHECK_CIRCLE_UPDATE = "ACTION_CHECK_CIRCLE_UPDATE";
    public static final String TAG = "hanking.log";

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    public PollingService() {
        super("PollingService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d(TAG, "onHandleIntent");
        if (intent == null)
            return;
        Log.d(TAG, "action " + intent.getAction());
        final String action = intent.getAction();
        if (ACTION_CHECK_CIRCLE_UPDATE.equals(action)) {
            CheckCircleOfFriendsUpdate();//这个是访问服务器获取朋友圈是否更新
        }

    }

    private void CheckCircleOfFriendsUpdate() {
        Log.d(TAG, "轮询中............");//这里可以向服务器请求数据
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy............");
    }
}
