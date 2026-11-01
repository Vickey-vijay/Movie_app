package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f17105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17110f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f17114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17116l;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f17110f = 0;
        this.f17111g = 0;
        this.f17112h = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public b(String str) {
        byte[] bArr = new byte[8];
        this.f17105a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(bArr);
        this.f17106b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        this.f17107c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f17108d = e0Var.f17165e;
        e0Var.b();
        this.f17109e = jVar.a(e0Var.f17164d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f17116l = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iA;
        int i10;
        String str;
        int iA2;
        int i11;
        int i12;
        while (true) {
            int i13 = nVar.f17847c - nVar.f17846b;
            if (i13 <= 0) {
                return;
            }
            int i14 = this.f17110f;
            if (i14 == 0) {
                while (nVar.f17847c - nVar.f17846b > 0) {
                    if (!this.f17112h) {
                        this.f17112h = nVar.j() == 11;
                    } else {
                        int iJ = nVar.j();
                        if (iJ == 119) {
                            this.f17112h = false;
                            this.f17110f = 1;
                            byte[] bArr = this.f17106b.f17845a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f17111g = 2;
                            break;
                        }
                        this.f17112h = iJ == 11;
                    }
                }
            } else if (i14 == 1) {
                byte[] bArr2 = this.f17106b.f17845a;
                int iMin = Math.min(i13, 8 - this.f17111g);
                nVar.a(bArr2, this.f17111g, iMin);
                int i15 = this.f17111g + iMin;
                this.f17111g = i15;
                if (i15 == 8) {
                    this.f17105a.b(0);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f17105a;
                    int i16 = (mVar.f17842b * 8) + mVar.f17843c;
                    mVar.c(40);
                    Object[] objArr = mVar.a(5) == 16;
                    mVar.b(i16);
                    int i17 = 6;
                    if (objArr != false) {
                        mVar.c(21);
                        iA2 = (mVar.a(11) + 1) * 2;
                        int iA3 = mVar.a(2);
                        if (iA3 == 3) {
                            i12 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f16293c[mVar.a(2)];
                        } else {
                            i17 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f16291a[mVar.a(2)];
                            i12 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f16292b[iA3];
                        }
                        i11 = i17 * 256;
                        iA = mVar.a(3);
                        i10 = i12;
                        str = "audio/eac3";
                    } else {
                        mVar.c(32);
                        int iA4 = mVar.a(2);
                        int iA5 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a(iA4, mVar.a(6));
                        mVar.c(8);
                        iA = mVar.a(3);
                        if ((iA & 1) != 0 && iA != 1) {
                            mVar.c(2);
                        }
                        if ((iA & 4) != 0) {
                            mVar.c(2);
                        }
                        if (iA == 2) {
                            mVar.c(2);
                        }
                        i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f16292b[iA4];
                        str = "audio/ac3";
                        iA2 = iA5;
                        i11 = 1536;
                    }
                    int i18 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f16294d[iA] + (mVar.b() ? 1 : 0);
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar = this.f17114j;
                    if (oVar == null || i18 != oVar.f17516r || i10 != oVar.f17517s || str != oVar.f17504f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f17108d, str, -1, -1, i18, i10, null, null, this.f17107c);
                        this.f17114j = oVarA;
                        this.f17109e.a(oVarA);
                    }
                    this.f17115k = iA2;
                    this.f17113i = (((long) i11) * 1000000) / ((long) this.f17114j.f17517s);
                    this.f17106b.e(0);
                    this.f17109e.a(8, this.f17106b);
                    this.f17110f = 2;
                }
            } else if (i14 == 2) {
                int iMin2 = Math.min(i13, this.f17115k - this.f17111g);
                this.f17109e.a(iMin2, nVar);
                int i19 = this.f17111g + iMin2;
                this.f17111g = i19;
                int i20 = this.f17115k;
                if (i19 == i20) {
                    this.f17109e.a(this.f17116l, 1, i20, 0, null);
                    this.f17116l += this.f17113i;
                    this.f17110f = 0;
                }
            }
        }
    }
}
