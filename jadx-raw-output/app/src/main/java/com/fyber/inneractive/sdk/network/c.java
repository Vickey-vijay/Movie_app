package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f16001c;

    public c(f fVar, int i10, long j10) {
        this.f16001c = fVar;
        this.f15999a = i10;
        this.f16000b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16001c.f16018d.sendEmptyMessageDelayed(this.f15999a, this.f16000b);
    }
}
