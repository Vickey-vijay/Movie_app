package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f16446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f16447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16448c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f16446a[z.a(this.f16447b, j10, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f16448c;
    }

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f16446a = jArr;
        this.f16447b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i10 = length - 1;
            this.f16448c = jArr2[i10] + jArr3[i10];
        } else {
            this.f16448c = 0L;
        }
    }
}
