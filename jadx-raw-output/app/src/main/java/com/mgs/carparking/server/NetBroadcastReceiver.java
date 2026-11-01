package com.mgs.carparking.server;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.mgs.carparking.app.AppApplication;
import sa.c;
import sa.v;

/* JADX INFO: loaded from: classes10.dex */
public class NetBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            int iA = v.a(context);
            if (AppApplication.port > 0 && iA > 0) {
                c.g(iA);
            }
        }
    }
}
