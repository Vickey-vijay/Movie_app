package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f54832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f54833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f54834c = new Object();

    public final void a(Context context) {
        synchronized (this.f54834c) {
            this.f54833b = null;
            this.f54834c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f54834c) {
            this.f54833b = null;
            this.f54834c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f54834c) {
            this.f54834c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f54834c) {
            this.f54833b = iBinder;
            this.f54834c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f54834c) {
            this.f54833b = null;
            this.f54834c.notifyAll();
        }
    }

    public e(Intent intent, String str) {
        this.f54832a = intent;
        String.format("[AdvServiceConnection-%s]", str);
    }
}
