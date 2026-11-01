package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import java.io.EOFException;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f16772d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16773a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16775c;

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10, boolean z11, int i10) throws InterruptedException, EOFException {
        int i11;
        if (this.f16774b == 0) {
            if (!bVar.b(this.f16773a, 0, 1, z10)) {
                return -1L;
            }
            int i12 = this.f16773a[0] & 255;
            int i13 = 0;
            while (true) {
                long[] jArr = f16772d;
                if (i13 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((((long) i12) & jArr[i13]) != 0) {
                    i11 = i13 + 1;
                    break;
                }
                i13++;
            }
            this.f16775c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f16774b = 1;
        }
        int i14 = this.f16775c;
        if (i14 > i10) {
            this.f16774b = 0;
            return -2L;
        }
        if (i14 != 1) {
            bVar.b(this.f16773a, 1, i14 - 1, false);
        }
        this.f16774b = 0;
        return a(this.f16773a, this.f16775c, z11);
    }

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f16772d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }
}
