package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class F5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4407o f55219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IReporter f55220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f55221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E5 f55222d;

    public F5(C4407o c4407o) {
        this(c4407o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f55221c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f55219a.a(applicationContext);
            this.f55219a.registerListener(this.f55222d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f55221c = applicationContext;
        }
    }

    public F5(C4407o c4407o, IReporter iReporter) {
        this.f55219a = c4407o;
        this.f55220b = iReporter;
        this.f55222d = new E5(this);
    }

    public /* synthetic */ F5(C4407o c4407o, int i10) {
        this(c4407o, AbstractC4658y1.a());
    }

    public final synchronized Context a() {
        return this.f55221c;
    }
}
