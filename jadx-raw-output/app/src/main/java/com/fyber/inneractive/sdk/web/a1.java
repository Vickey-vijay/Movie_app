package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes11.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f18640a;

    public a1(b1 b1Var) {
        this.f18640a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f18640a.f18643a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
