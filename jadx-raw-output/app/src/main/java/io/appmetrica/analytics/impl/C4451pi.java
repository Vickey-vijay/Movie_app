package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4451pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f57518a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4682z0 f57519b;

    public static C4451pi a() {
        return AbstractC4426oi.f57449a;
    }

    public final C4248hi a(Context context, String str) {
        C4248hi c4248hi = (C4248hi) this.f57518a.get(str);
        if (c4248hi == null) {
            synchronized (this.f57518a) {
                c4248hi = (C4248hi) this.f57518a.get(str);
                if (c4248hi == null) {
                    IHandlerExecutor iHandlerExecutorA = C4105c4.l().f56438c.a();
                    this.f57519b.getClass();
                    if (C4657y0.f57980e == null) {
                        ((A9) iHandlerExecutorA).f54955b.post(new RunnableC4401ni(this, context));
                    }
                    c4248hi = new C4248hi(context.getApplicationContext(), str, new C4682z0());
                    this.f57518a.put(str, c4248hi);
                    c4248hi.d(str);
                }
            }
        }
        return c4248hi;
    }

    public C4451pi(C4682z0 c4682z0) {
        this.f57519b = c4682z0;
    }
}
