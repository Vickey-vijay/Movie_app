package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17822d;

    public f(byte[] bArr) {
        m mVar = new m(bArr);
        mVar.b(136);
        mVar.a(16);
        mVar.a(16);
        mVar.a(24);
        mVar.a(24);
        this.f17819a = mVar.a(20);
        this.f17820b = mVar.a(3) + 1;
        this.f17821c = mVar.a(5) + 1;
        this.f17822d = ((((long) mVar.a(4)) & 15) << 32) | (((long) mVar.a(32)) & 4294967295L);
    }
}
