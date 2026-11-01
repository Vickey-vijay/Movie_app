package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f17299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f17300b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17301c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v f17303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17309k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17310l;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f17303e = vVar;
        this.f17299a.a(jVar, e0Var);
    }

    public s(h hVar) {
        this.f17299a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f17301c = 0;
        this.f17302d = 0;
        this.f17306h = false;
        this.f17299a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10) {
        int i10;
        if (z10) {
            int i11 = this.f17301c;
            if (i11 == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i11 == 3) {
                if (this.f17308j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f17308j + " more bytes");
                }
                this.f17299a.b();
            }
            this.f17301c = 1;
            this.f17302d = 0;
        }
        while (true) {
            int i12 = nVar.f17847c;
            int i13 = nVar.f17846b;
            int i14 = i12 - i13;
            if (i14 <= 0) {
                return;
            }
            int i15 = this.f17301c;
            if (i15 == 0) {
                nVar.e(i14 + i13);
            } else if (i15 != 1) {
                if (i15 == 2) {
                    if (a(nVar, this.f17300b.f17841a, Math.min(10, this.f17307i)) && a(nVar, (byte[]) null, this.f17307i)) {
                        this.f17300b.b(0);
                        this.f17310l = -9223372036854775807L;
                        if (this.f17304f) {
                            this.f17300b.c(4);
                            long jA = ((long) this.f17300b.a(3)) << 30;
                            this.f17300b.c(1);
                            long jA2 = jA | ((long) (this.f17300b.a(15) << 15));
                            this.f17300b.c(1);
                            long jA3 = jA2 | ((long) this.f17300b.a(15));
                            this.f17300b.c(1);
                            if (!this.f17306h && this.f17305g) {
                                this.f17300b.c(4);
                                long jA4 = ((long) this.f17300b.a(3)) << 30;
                                this.f17300b.c(1);
                                long jA5 = jA4 | ((long) (this.f17300b.a(15) << 15));
                                this.f17300b.c(1);
                                long jA6 = jA5 | ((long) this.f17300b.a(15));
                                this.f17300b.c(1);
                                this.f17303e.b(jA6);
                                this.f17306h = true;
                            }
                            this.f17310l = this.f17303e.b(jA3);
                        }
                        this.f17299a.a(this.f17309k, this.f17310l);
                        this.f17301c = 3;
                        this.f17302d = 0;
                    }
                } else if (i15 == 3) {
                    int i16 = this.f17308j;
                    int i17 = i16 == -1 ? 0 : i14 - i16;
                    if (i17 > 0) {
                        i14 -= i17;
                        nVar.d(i13 + i14);
                    }
                    this.f17299a.a(nVar);
                    int i18 = this.f17308j;
                    if (i18 != -1) {
                        int i19 = i18 - i14;
                        this.f17308j = i19;
                        if (i19 == 0) {
                            this.f17299a.b();
                            this.f17301c = 1;
                            this.f17302d = 0;
                        }
                    }
                }
            } else if (a(nVar, this.f17300b.f17841a, 9)) {
                this.f17300b.b(0);
                int iA = this.f17300b.a(24);
                if (iA != 1) {
                    Log.w("PesReader", "Unexpected start code prefix: " + iA);
                    this.f17308j = -1;
                    i10 = 0;
                } else {
                    this.f17300b.c(8);
                    int iA2 = this.f17300b.a(16);
                    this.f17300b.c(5);
                    this.f17309k = this.f17300b.b();
                    this.f17300b.c(2);
                    this.f17304f = this.f17300b.b();
                    this.f17305g = this.f17300b.b();
                    this.f17300b.c(6);
                    int iA3 = this.f17300b.a(8);
                    this.f17307i = iA3;
                    if (iA2 == 0) {
                        this.f17308j = -1;
                    } else {
                        this.f17308j = (iA2 - 3) - iA3;
                    }
                    i10 = 2;
                }
                this.f17301c = i10;
                this.f17302d = 0;
            }
        }
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, byte[] bArr, int i10) {
        int iMin = Math.min(nVar.f17847c - nVar.f17846b, i10 - this.f17302d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            nVar.e(nVar.f17846b + iMin);
        } else {
            nVar.a(bArr, this.f17302d, iMin);
        }
        int i11 = this.f17302d + iMin;
        this.f17302d = i11;
        return i11 == i10;
    }
}
