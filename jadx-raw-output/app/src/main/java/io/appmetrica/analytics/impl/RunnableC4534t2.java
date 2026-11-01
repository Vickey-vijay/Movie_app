package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4534t2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f57697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f57698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4559u2 f57699c;

    public RunnableC4534t2(C4559u2 c4559u2, Context context, Intent intent) {
        this.f57699c = c4559u2;
        this.f57697a = context;
        this.f57698b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f57699c.f57751a.consume(this.f57697a, this.f57698b);
    }
}
