package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.C3676r4;
import com.ironsource.Cc;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: loaded from: classes10.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectivityManager f28824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Cc f28825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28826c = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            Cc cc2 = networkStateReceiver.f28825b;
            if (cc2 != null) {
                cc2.a(networkStateReceiver.f28826c);
            }
        }
    }

    private boolean a() {
        boolean z10 = this.f28826c;
        ConnectivityManager connectivityManager = this.f28824a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.f28826c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                this.f28826c = false;
            }
        } else {
            this.f28826c = false;
        }
        return z10 != this.f28826c;
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }

    public NetworkStateReceiver(Context context, Cc cc2) {
        this.f28825b = cc2;
        if (context != null) {
            this.f28824a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }
}
