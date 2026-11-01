package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.C3372a4;
import com.ironsource.C3676r4;
import com.ironsource.InterfaceC3747v7;
import com.ironsource.InterfaceC3764w7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class BroadcastReceiverStrategy implements InterfaceC3747v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3764w7 f31208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f31209b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String strB = C3372a4.b(context);
            if (strB.equals("none")) {
                BroadcastReceiverStrategy.this.f31208a.a();
            } else {
                BroadcastReceiverStrategy.this.f31208a.a(strB, IronSourceVideoBridge.jsonObjectInit());
            }
        }
    };

    @Override // com.ironsource.InterfaceC3747v7
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.f31209b);
        } catch (IllegalArgumentException e10) {
            C3676r4.d().a(e10);
        } catch (Exception e11) {
            C3676r4.d().a(e11);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e11);
        }
    }

    @Override // com.ironsource.InterfaceC3747v7
    public void b(Context context) {
        try {
            context.registerReceiver(this.f31209b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public BroadcastReceiverStrategy(InterfaceC3764w7 interfaceC3764w7) {
        this.f31208a = interfaceC3764w7;
    }

    @Override // com.ironsource.InterfaceC3747v7
    public void a() {
        this.f31209b = null;
    }

    @Override // com.ironsource.InterfaceC3747v7
    public JSONObject c(Context context) {
        return IronSourceVideoBridge.jsonObjectInit();
    }
}
