package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f54835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.l f54836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f54838d;

    public f(e eVar, bk.l lVar, String str, SafePackageManager safePackageManager) {
        this.f54835a = eVar;
        this.f54836b = lVar;
        this.f54837c = str;
        this.f54838d = safePackageManager;
    }

    public final Object a(Context context) throws g {
        if (this.f54838d.resolveService(context, this.f54835a.f54832a, 0) == null) {
            throw new l("could not resolve " + this.f54837c + " services");
        }
        IBinder iBinder = null;
        try {
            e eVar = this.f54835a;
            if (context.bindService(eVar.f54832a, eVar, 1)) {
                e eVar2 = this.f54835a;
                if (eVar2.f54833b == null) {
                    synchronized (eVar2.f54834c) {
                        if (eVar2.f54833b == null) {
                            try {
                                eVar2.f54834c.wait(3000L);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
                iBinder = eVar2.f54833b;
            }
        } catch (Throwable unused2) {
        }
        if (iBinder != null) {
            return this.f54836b.invoke(iBinder);
        }
        throw new g("could not bind to " + this.f54837c + " services");
    }

    public final void b(Context context) {
        try {
            this.f54835a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, bk.l lVar, String str) {
        this(new e(intent, str), lVar, str, new SafePackageManager());
    }
}
