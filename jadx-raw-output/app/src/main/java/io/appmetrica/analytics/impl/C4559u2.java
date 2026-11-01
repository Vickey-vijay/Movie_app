package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4559u2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiConsumer f57751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f57752b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f57752b.execute(new RunnableC4534t2(this, context, intent));
    }

    public C4559u2(O2 o10, ICommonExecutor iCommonExecutor) {
        this.f57751a = o10;
        this.f57752b = iCommonExecutor;
    }
}
