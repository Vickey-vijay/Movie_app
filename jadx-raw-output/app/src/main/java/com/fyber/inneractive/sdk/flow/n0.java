package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f15482a;

    public n0(p0 p0Var) {
        this.f15482a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        com.fyber.inneractive.sdk.util.r.f18607b.post(this.f15482a.f15567l);
        p0 p0Var = this.f15482a;
        v1 v1Var = p0Var.f15568m;
        if (v1Var != null) {
            v1Var.f18631e = null;
            p0Var.f15568m = null;
        }
        p0Var.f15572q = false;
    }
}
