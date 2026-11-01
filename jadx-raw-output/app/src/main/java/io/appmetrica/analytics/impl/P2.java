package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class P2 implements InterfaceC4378mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f55720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f55721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f55722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H5 f55723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IHandlerExecutor f55724e;

    public P2(@NonNull Context context, @NonNull IHandlerExecutor iHandlerExecutor) {
        this(context, iHandlerExecutor, 0);
    }

    @Nullable
    public final synchronized Intent a(@NonNull Consumer<Intent> consumer) {
        this.f55720a.add(consumer);
        return this.f55721b;
    }

    public final void b() {
        this.f55721b = null;
        H5 h10 = this.f55723d;
        Context context = this.f55722c;
        synchronized (h10) {
            if (h10.f55293b) {
                try {
                    context.unregisterReceiver(h10.f55292a);
                    h10.f55293b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4378mk
    public final synchronized void onCreate() {
        Intent intentA = a();
        this.f55721b = intentA;
        Iterator it = this.f55720a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(intentA);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4378mk
    public final synchronized void onDestroy() {
        this.f55721b = null;
        b();
        Iterator it = this.f55720a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public P2(Context context, IHandlerExecutor iHandlerExecutor, int i10) {
        this.f55720a = new ArrayList();
        this.f55721b = null;
        this.f55722c = context;
        this.f55724e = iHandlerExecutor;
        this.f55723d = G5.a(new C4559u2(new O2(this), iHandlerExecutor));
    }

    public final Intent a() {
        Intent intentRegisterReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        H5 h10 = this.f55723d;
        Context context = this.f55722c;
        IHandlerExecutor iHandlerExecutor = this.f55724e;
        synchronized (h10) {
            intentRegisterReceiver = null;
            try {
                intentRegisterReceiver = context.registerReceiver(h10.f55292a, intentFilter, null, iHandlerExecutor.getHandler());
                h10.f55293b = true;
            } catch (Throwable unused) {
            }
        }
        return intentRegisterReceiver;
    }
}
