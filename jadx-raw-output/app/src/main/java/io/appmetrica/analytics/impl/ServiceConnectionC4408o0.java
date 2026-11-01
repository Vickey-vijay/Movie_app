package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ServiceConnectionC4408o0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4433p0 f57373a;

    public ServiceConnectionC4408o0(C4433p0 c4433p0) {
        this.f57373a = c4433p0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f57373a) {
            this.f57373a.f57465d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f57373a.f57466e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f57373a) {
            this.f57373a.f57465d = null;
        }
    }
}
