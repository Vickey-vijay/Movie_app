package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class Dk implements ServiceWakeLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ck f55149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f55150c = new HashMap();

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        if (this.f55150c.get(str) == null) {
            HashMap map = this.f55150c;
            Ck ck2 = this.f55149b;
            Context context = this.f55148a;
            String strA = a(str);
            ck2.f55112a.getClass();
            Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
            intent.setAction(strA);
            Bk bk2 = new Bk();
            try {
                context.bindService(intent, bk2, 1);
            } catch (Throwable unused) {
                bk2 = null;
            }
            map.put(str, bk2);
        }
        return this.f55150c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f55150c.get(str);
        if (serviceConnection != null) {
            Ck ck2 = this.f55149b;
            a(str);
            Context context = this.f55148a;
            ck2.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }

    public final String a(String str) {
        return "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK." + str;
    }

    public Dk(Context context, Ck ck2) {
        this.f55148a = context;
        this.f55149b = ck2;
    }
}
