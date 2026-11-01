package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f17824b = new long[32];

    public final void a(long j10) {
        int i10 = this.f17823a;
        long[] jArr = this.f17824b;
        if (i10 == jArr.length) {
            this.f17824b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f17824b;
        int i11 = this.f17823a;
        this.f17823a = i11 + 1;
        jArr2[i11] = j10;
    }
}
