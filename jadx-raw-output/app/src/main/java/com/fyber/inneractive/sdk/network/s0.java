package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f16082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f16084d;

    public s0(t0 t0Var, Object obj, Exception exc, boolean z10) {
        this.f16084d = t0Var;
        this.f16081a = obj;
        this.f16082b = exc;
        this.f16083c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16084d.f16086b.a(this.f16081a, this.f16082b, this.f16083c);
    }
}
