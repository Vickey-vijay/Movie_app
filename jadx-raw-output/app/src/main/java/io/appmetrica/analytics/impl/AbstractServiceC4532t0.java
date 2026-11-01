package io.appmetrica.analytics.impl;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractServiceC4532t0 extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M1 f57694a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        M1 m10 = this.f57694a;
        if (m10 == null) {
            ck.p.B("serviceDelegate");
            m10 = null;
        }
        return m10.a(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        M1 m10 = this.f57694a;
        if (m10 == null) {
            ck.p.B("serviceDelegate");
            m10 = null;
        }
        return m10.a(intent, i10, i11);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        M1 m10 = this.f57694a;
        if (m10 == null) {
            ck.p.B("serviceDelegate");
            m10 = null;
        }
        return m10.c(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        M1 m10 = this.f57694a;
        if (m10 == null) {
            ck.p.B("serviceDelegate");
            m10 = null;
        }
        m10.a(configuration);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.f57694a == null) {
            this.f57694a = new M1(this, new C4557u0(this));
        }
        M1 m10 = this.f57694a;
        if (m10 == null) {
            ck.p.B("serviceDelegate");
            m10 = null;
        }
        m10.b();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        M1 m10 = this.f57694a;
        if (m10 == null) {
            ck.p.B("serviceDelegate");
            m10 = null;
        }
        m10.c();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        M1 m10 = this.f57694a;
        if (m10 == null) {
            ck.p.B("serviceDelegate");
            m10 = null;
        }
        m10.b(intent);
    }
}
