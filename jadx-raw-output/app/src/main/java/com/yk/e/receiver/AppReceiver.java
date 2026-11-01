package com.yk.e.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes8.dex */
public class AppReceiver extends BroadcastReceiver {
    public Handler handler;

    public AppReceiver() {
    }

    public AppReceiver(Handler handler) {
        this.handler = handler;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.obj = intent;
        messageObtainMessage.sendToTarget();
    }
}
