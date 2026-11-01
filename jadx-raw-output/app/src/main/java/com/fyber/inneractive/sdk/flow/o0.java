package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f15564a;

    public o0(p0 p0Var) {
        this.f15564a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        Runnable runnable = this.f15564a.f15569n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f18607b.post(runnable);
        }
        p0 p0Var = this.f15564a;
        v1 v1Var = p0Var.f15570o;
        if (v1Var != null) {
            v1Var.f18631e = null;
            p0Var.f15570o = null;
        }
    }
}
