package com.kumbhthon.meditracker.Utils;


import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

public class TickService extends Service {
    static final String LOGGING_TAG = "Tick";
    private TickReceiver tickReceiver;

    @Override
    public void onCreate() {
        super.onCreate();

        tickReceiver = new TickReceiver();
        registerReceiver
                (
                        tickReceiver,
                        new IntentFilter(Intent.ACTION_TIME_TICK)
                );
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(tickReceiver);

        startService(new Intent(getApplicationContext(), TickService.class));
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
