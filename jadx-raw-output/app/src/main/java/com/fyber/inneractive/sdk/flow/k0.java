package com.fyber.inneractive.sdk.flow;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f15475a;

    public k0(l0 l0Var) {
        this.f15475a = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0 p0Var = this.f15475a.f15479b;
        p0Var.d(!p0Var.f15575t);
        this.f15475a.f15479b.f15569n = null;
    }
}
