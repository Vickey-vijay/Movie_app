package com.mbridge.msdk.config.component.status;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: MBNetworkEventPublisher.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConnectivityManager f33563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f33564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33565d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.mbridge.msdk.config.component.status.a> f33562a = new ArrayList<>(5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RequiresApi(api = 21)
    private final ConnectivityManager.NetworkCallback f33566e = new a();

    /* JADX INFO: compiled from: MBNetworkEventPublisher.java */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            int iC;
            super.onCapabilitiesChanged(network, networkCapabilities);
            boolean zHasTransport = networkCapabilities.hasTransport(1);
            boolean zHasTransport2 = networkCapabilities.hasTransport(0);
            if (zHasTransport) {
                iC = 9;
            } else {
                iC = -1;
            }
            if (zHasTransport2) {
                iC = c.this.c();
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("NetworkChanged");
            HashMap map = new HashMap();
            map.put("networkType", String.valueOf(iC));
            bVar.a(map);
            c.this.a(bVar);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            super.onLost(network);
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("NetworkChanged");
            HashMap map = new HashMap();
            map.put("networkType", String.valueOf(c.this.c()));
            bVar.a(map);
            c.this.a(bVar);
        }
    }

    /* JADX INFO: compiled from: MBNetworkEventPublisher.java */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        public /* synthetic */ b(c cVar, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                int iC = c.this.c();
                com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
                bVar.b("NetworkChanged");
                HashMap map = new HashMap();
                map.put("networkType", String.valueOf(iC));
                bVar.a(map);
                c.this.a(bVar);
            } catch (Throwable th2) {
                q0.b("MBNetworkEventPublisher", th2.getMessage());
            }
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        this.f33562a.remove(aVar);
    }

    private void a() {
        int iCheckSelfPermission = ContextCompat.checkSelfPermission(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_PHONE_STATE");
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 33) {
            this.f33565d = iCheckSelfPermission == 0;
            return;
        }
        int iCheckSelfPermission2 = ContextCompat.checkSelfPermission(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_BASIC_PHONE_STATE");
        if (iCheckSelfPermission != 0 && iCheckSelfPermission2 != 0) {
            z10 = false;
        }
        this.f33565d = z10;
    }

    public void b() {
        if (this.f33563b == null) {
            this.f33563b = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
        }
        this.f33563b.unregisterNetworkCallback(this.f33566e);
        this.f33563b = null;
    }

    @SuppressLint({"MissingPermission"})
    public int c() {
        NetworkInfo activeNetworkInfo;
        if (this.f33565d) {
            TelephonyManager telephonyManager = (TelephonyManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("phone");
            return m0.c(telephonyManager != null ? telephonyManager.getDataNetworkType() : 0);
        }
        ConnectivityManager connectivityManager = this.f33563b;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        return m0.c(activeNetworkInfo.getSubtype());
    }

    public void d() {
        if (this.f33562a.isEmpty()) {
            b();
        }
    }

    public c() {
        a(com.mbridge.msdk.foundation.controller.c.n().d());
        a();
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar == null || this.f33562a.contains(aVar)) {
            return;
        }
        this.f33562a.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        Iterator<com.mbridge.msdk.config.component.status.a> it = this.f33562a.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void a(Context context) {
        this.f33563b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f33563b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(11).addCapability(12).build(), this.f33566e);
    }
}
