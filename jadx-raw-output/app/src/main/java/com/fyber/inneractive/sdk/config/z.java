package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f15226a;

    public z(a0 a0Var) {
        this.f15226a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15226a.f15032a.K = new com.fyber.inneractive.sdk.measurement.e();
        a0 a0Var = this.f15226a;
        com.fyber.inneractive.sdk.measurement.e eVar = a0Var.f15032a.K;
        Context context = a0Var.f15033b;
        if (eVar.f15806a) {
            return;
        }
        eVar.f15806a = true;
        com.fyber.inneractive.sdk.util.r.f18607b.post(new com.fyber.inneractive.sdk.measurement.d(eVar, context));
    }
}
