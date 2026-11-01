package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16472l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f16477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16478r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16461a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16462b = new int[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f16463c = new long[1000];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f16466f = new long[1000];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f16465e = new int[1000];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f16464d = new int[1000];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[][] f16467g = new byte[1000][];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] f16468h = new com.fyber.inneractive.sdk.player.exoplayer2.o[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16473m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f16474n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16476p = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16475o = true;

    public final synchronized void a(long j10, int i10, long j11, int i11, byte[] bArr) {
        if (this.f16475o) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.f16475o = false;
            }
        }
        if (!(!this.f16476p)) {
            throw new IllegalStateException();
        }
        b(j10);
        long[] jArr = this.f16466f;
        int i12 = this.f16472l;
        jArr[i12] = j10;
        long[] jArr2 = this.f16463c;
        jArr2[i12] = j11;
        this.f16464d[i12] = i11;
        this.f16465e[i12] = i10;
        this.f16467g[i12] = bArr;
        this.f16468h[i12] = this.f16477q;
        this.f16462b[i12] = this.f16478r;
        int i13 = this.f16469i + 1;
        this.f16469i = i13;
        int i14 = this.f16461a;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr3 = new long[i15];
            long[] jArr4 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            byte[][] bArr2 = new byte[i15][];
            com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i15];
            int i16 = this.f16471k;
            int i17 = i14 - i16;
            System.arraycopy(jArr2, i16, jArr3, 0, i17);
            System.arraycopy(this.f16466f, this.f16471k, jArr4, 0, i17);
            System.arraycopy(this.f16465e, this.f16471k, iArr2, 0, i17);
            System.arraycopy(this.f16464d, this.f16471k, iArr3, 0, i17);
            System.arraycopy(this.f16467g, this.f16471k, bArr2, 0, i17);
            System.arraycopy(this.f16468h, this.f16471k, oVarArr, 0, i17);
            System.arraycopy(this.f16462b, this.f16471k, iArr, 0, i17);
            int i18 = this.f16471k;
            System.arraycopy(this.f16463c, 0, jArr3, i17, i18);
            System.arraycopy(this.f16466f, 0, jArr4, i17, i18);
            System.arraycopy(this.f16465e, 0, iArr2, i17, i18);
            System.arraycopy(this.f16464d, 0, iArr3, i17, i18);
            System.arraycopy(this.f16467g, 0, bArr2, i17, i18);
            System.arraycopy(this.f16468h, 0, oVarArr, i17, i18);
            System.arraycopy(this.f16462b, 0, iArr, i17, i18);
            this.f16463c = jArr3;
            this.f16466f = jArr4;
            this.f16465e = iArr2;
            this.f16464d = iArr3;
            this.f16467g = bArr2;
            this.f16468h = oVarArr;
            this.f16462b = iArr;
            this.f16471k = 0;
            int i19 = this.f16461a;
            this.f16472l = i19;
            this.f16469i = i19;
            this.f16461a = i15;
        } else {
            int i20 = i12 + 1;
            this.f16472l = i20;
            if (i20 == i14) {
                this.f16472l = 0;
            }
        }
    }

    public final synchronized void b(long j10) {
        this.f16474n = Math.max(this.f16474n, j10);
    }

    public final synchronized boolean a(long j10) {
        if (this.f16473m >= j10) {
            return false;
        }
        int i10 = this.f16469i;
        while (i10 > 0 && this.f16466f[((this.f16471k + i10) - 1) % this.f16461a] >= j10) {
            i10--;
        }
        int i11 = this.f16470j;
        int i12 = this.f16469i;
        int i13 = (i11 + i12) - (i10 + i11);
        if (i13 < 0 || i13 > i12) {
            throw new IllegalArgumentException();
        }
        if (i13 != 0) {
            int i14 = i12 - i13;
            this.f16469i = i14;
            int i15 = this.f16472l;
            int i16 = this.f16461a;
            this.f16472l = ((i15 + i16) - i13) % i16;
            this.f16474n = Long.MIN_VALUE;
            for (int i17 = i14 - 1; i17 >= 0; i17--) {
                int i18 = (this.f16471k + i17) % this.f16461a;
                this.f16474n = Math.max(this.f16474n, this.f16466f[i18]);
                if ((this.f16465e[i18] & 1) != 0) {
                    break;
                }
            }
            long j11 = this.f16463c[this.f16472l];
        } else if (i11 != 0) {
            int i19 = this.f16472l;
            if (i19 == 0) {
                i19 = this.f16461a;
            }
            int i20 = i19 - 1;
            long j12 = this.f16463c[i20];
            int i21 = this.f16464d[i20];
        }
        return true;
    }
}
