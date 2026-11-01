package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4282j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f56989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f56990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f56991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56992d;

    public RunnableC4282j1(C4558u1 c4558u1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f56992d = c4558u1;
        this.f56989a = context;
        this.f56990b = startupParamsCallback;
        this.f56991c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4682z0 c4682z0 = this.f56992d.f57743a;
        Context applicationContext = this.f56989a.getApplicationContext();
        c4682z0.getClass();
        C4657y0 c4657y0A = C4657y0.a(applicationContext);
        c4657y0A.f().a(this.f56990b, this.f56991c);
    }
}
