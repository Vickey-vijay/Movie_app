package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: loaded from: classes6.dex */
public final class Jg implements Ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bm f55428a;

    @Override // io.appmetrica.analytics.impl.Ll
    public final void a() {
        NetworkTask networkTaskC = this.f55428a.c();
        if (networkTaskC != null) {
            C4418oa.I.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskC);
        }
    }

    public Jg(@NonNull Bm bm2) {
        this.f55428a = bm2;
    }
}
