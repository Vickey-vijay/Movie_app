package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f17138r = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17139a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17145g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f17153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f17155q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f17140b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[7]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17141c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(Arrays.copyOf(f17138r, 10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17146h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17147i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17148j = 256;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        while (true) {
            int i10 = nVar.f17847c;
            int i11 = nVar.f17846b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f17146h;
            if (i13 == 0) {
                byte[] bArr = nVar.f17845a;
                while (true) {
                    if (i11 >= i10) {
                        nVar.e(i11);
                        break;
                    }
                    int i14 = i11 + 1;
                    byte b10 = bArr[i11];
                    int i15 = b10 & 255;
                    int i16 = this.f17148j;
                    if (i16 == 512 && i15 >= 240 && i15 != 255) {
                        this.f17149k = (b10 & 1) == 0;
                        this.f17146h = 2;
                        this.f17147i = 0;
                        nVar.e(i14);
                        break;
                    }
                    int i17 = i16 | i15;
                    if (i17 == 329) {
                        this.f17148j = 768;
                    } else if (i17 == 511) {
                        this.f17148j = 512;
                    } else if (i17 == 836) {
                        this.f17148j = 1024;
                    } else {
                        if (i17 == 1075) {
                            this.f17146h = 1;
                            this.f17147i = 3;
                            this.f17152n = 0;
                            this.f17141c.e(0);
                            nVar.e(i14);
                            break;
                        }
                        if (i16 != 256) {
                            this.f17148j = 256;
                        }
                    }
                    i11 = i14;
                }
            } else if (i13 == 1) {
                byte[] bArr2 = this.f17141c.f17845a;
                int iMin = Math.min(i12, 10 - this.f17147i);
                nVar.a(bArr2, this.f17147i, iMin);
                int i18 = this.f17147i + iMin;
                this.f17147i = i18;
                if (i18 == 10) {
                    this.f17145g.a(10, this.f17141c);
                    this.f17141c.e(6);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f17145g;
                    int i19 = this.f17141c.i() + 10;
                    this.f17146h = 3;
                    this.f17147i = 10;
                    this.f17154p = rVar;
                    this.f17155q = 0L;
                    this.f17152n = i19;
                }
            } else if (i13 == 2) {
                int i20 = this.f17149k ? 7 : 5;
                byte[] bArr3 = this.f17140b.f17841a;
                int iMin2 = Math.min(i12, i20 - this.f17147i);
                nVar.a(bArr3, this.f17147i, iMin2);
                int i21 = this.f17147i + iMin2;
                this.f17147i = i21;
                if (i21 == i20) {
                    this.f17140b.b(0);
                    if (this.f17150l) {
                        this.f17140b.c(10);
                    } else {
                        int iA = this.f17140b.a(2) + 1;
                        if (iA != 2) {
                            Log.w("AdtsReader", "Detected audio object type: " + iA + ", but assuming AAC LC.");
                            iA = 2;
                        }
                        int iA2 = this.f17140b.a(4);
                        this.f17140b.c(1);
                        byte[] bArr4 = {(byte) (((iA << 3) & 248) | ((iA2 >> 1) & 7)), (byte) (((iA2 << 7) & 128) | ((this.f17140b.a(3) << 3) & 120))};
                        Pair pairA = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr4);
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f17143e, "audio/mp4a-latm", -1, -1, ((Integer) pairA.second).intValue(), ((Integer) pairA.first).intValue(), Collections.singletonList(bArr4), null, this.f17142d);
                        this.f17151m = 1024000000 / ((long) oVarA.f17517s);
                        this.f17144f.a(oVarA);
                        this.f17150l = true;
                    }
                    this.f17140b.c(4);
                    int iA3 = this.f17140b.a(13);
                    int i22 = iA3 - 7;
                    if (this.f17149k) {
                        i22 = iA3 - 9;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f17144f;
                    long j10 = this.f17151m;
                    this.f17146h = 3;
                    this.f17147i = 0;
                    this.f17154p = rVar2;
                    this.f17155q = j10;
                    this.f17152n = i22;
                }
            } else if (i13 == 3) {
                int iMin3 = Math.min(i12, this.f17152n - this.f17147i);
                this.f17154p.a(iMin3, nVar);
                int i23 = this.f17147i + iMin3;
                this.f17147i = i23;
                int i24 = this.f17152n;
                if (i23 == i24) {
                    this.f17154p.a(this.f17153o, 1, i24, 0, null);
                    this.f17153o += this.f17155q;
                    this.f17146h = 0;
                    this.f17147i = 0;
                    this.f17148j = 256;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public d(boolean z10, String str) {
        this.f17139a = z10;
        this.f17142d = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f17143e = e0Var.f17165e;
        e0Var.b();
        this.f17144f = jVar.a(e0Var.f17164d, 1);
        if (this.f17139a) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f17164d, 4);
            this.f17145g = gVarA;
            e0Var.b();
            gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f17165e, "application/id3", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
            return;
        }
        this.f17145g = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.h();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f17153o = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f17146h = 0;
        this.f17147i = 0;
        this.f17148j = 256;
    }
}
