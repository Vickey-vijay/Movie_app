package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class M1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static B1 f55538d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A1 f55540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BinderC4683z1 f55541c;

    public final void b() {
        C4418oa.a(this.f55539a);
        PublicLogger.INSTANCE.init(this.f55539a);
        Context context = this.f55539a;
        A1 a10 = this.f55540b;
        if (f55538d == null) {
            C1 c10 = new C1(context, a10, new C4157e5(context));
            C4198fk c4198fk = C4418oa.I.f57424v;
            F1 f10 = new F1(c10);
            LinkedHashMap linkedHashMap = c4198fk.f56779a;
            Object arrayList = linkedHashMap.get(1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(1, arrayList);
            }
            ((List) arrayList).add(f10);
            f55538d = c10;
        }
        B1 b10 = f55538d;
        if (b10 != null) {
            this.f55541c = new BinderC4683z1(b10);
            C4418oa c4418oa = C4418oa.I;
            c4418oa.f57408f = new C4402nj(c4418oa.f57403a, new C4427oj(b10));
            ((C1) b10).onCreate();
        }
    }

    public final boolean c(Intent intent) {
        B1 b10 = f55538d;
        if (b10 != null) {
            ((C1) b10).b(intent);
        }
        String action = intent.getAction();
        return (action == null || !lk.x.R(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false, 2, null)) && intent.getData() == null;
    }

    @VisibleForTesting
    public final void d() {
        f55538d = null;
    }

    public M1(Context context, A1 a10) {
        this.f55539a = context;
        this.f55540b = a10;
    }

    public final void a(Intent intent, int i10) {
        B1 b10 = f55538d;
        if (b10 != null) {
            ((C4557u0) ((C1) b10).f55064c).f57742a.stopSelf(i10);
        }
    }

    public final void c() {
        B1 b10 = f55538d;
        if (b10 != null) {
            ((C1) b10).onDestroy();
        }
    }

    public final int a(Intent intent, int i10, int i11) {
        B1 b10 = f55538d;
        if (b10 == null) {
            return 2;
        }
        ((C4557u0) ((C1) b10).f55064c).f57742a.stopSelf(i11);
        return 2;
    }

    public final IBinder a(Intent intent) {
        B1 b10 = f55538d;
        if (b10 != null) {
            ((C1) b10).a(intent);
        }
        String action = intent.getAction();
        if (action != null && lk.x.R(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false, 2, null)) {
            return new Do();
        }
        BinderC4683z1 binderC4683z1 = this.f55541c;
        if (binderC4683z1 != null) {
            return binderC4683z1;
        }
        ck.p.B("coreBinder");
        return null;
    }

    public final void a(Configuration configuration) {
        if (f55538d != null) {
            C4418oa.I.v().a(configuration);
        }
    }

    public final void b(Intent intent) {
        B1 b10 = f55538d;
        if (b10 != null) {
            ((C1) b10).c(intent);
        }
    }
}
