package com.fyber.inneractive.sdk.network;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f16059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f16060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f16062d = new m1(this);

    public n1(t0 t0Var, Thread thread, int i10) {
        this.f16060b = new WeakReference(t0Var);
        this.f16059a = new WeakReference(thread);
        this.f16061c = i10;
    }
}
