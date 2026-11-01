package com.mgs.carparking.androidupnp.service;

import android.content.Intent;
import android.os.IBinder;
import co.c;
import fn.b;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;
import un.e;

/* JADX INFO: loaded from: classes2.dex */
public class ClingUpnpService extends AndroidUpnpServiceImpl {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f39689d = null;

    public class a extends AndroidUpnpServiceImpl.b {
        public a() {
            super();
        }

        public ClingUpnpService b() {
            return ClingUpnpService.this;
        }

        @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl.b, gn.c
        public /* bridge */ /* synthetic */ b get() {
            return super.get();
        }

        @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl.b, gn.c
        public /* bridge */ /* synthetic */ c getRegistry() {
            return super.getRegistry();
        }
    }

    public ln.b c() {
        return this.f65749b.b();
    }

    public c d() {
        return this.f65749b.getRegistry();
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f65750c;
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f65750c = new a();
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}
