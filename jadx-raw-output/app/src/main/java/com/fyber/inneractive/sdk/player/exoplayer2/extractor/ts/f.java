package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f17174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17176k;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f17170e = 0;
        this.f17171f = 0;
        this.f17172g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public f(String str) {
        byte[] bArr = new byte[15];
        this.f17166a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        bArr[0] = 127;
        bArr[1] = -2;
        bArr[2] = -128;
        bArr[3] = 1;
        this.f17170e = 0;
        this.f17167b = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f17168c = e0Var.f17165e;
        e0Var.b();
        this.f17169d = jVar.a(e0Var.f17164d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f17176k = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        while (true) {
            int i10 = nVar.f17847c - nVar.f17846b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f17170e;
            if (i11 == 0) {
                while (nVar.f17847c - nVar.f17846b > 0) {
                    int i12 = this.f17172g << 8;
                    this.f17172g = i12;
                    int iJ = i12 | nVar.j();
                    this.f17172g = iJ;
                    if (iJ == 2147385345) {
                        this.f17172g = 0;
                        this.f17171f = 4;
                        this.f17170e = 1;
                        break;
                    }
                }
            } else if (i11 == 1) {
                byte[] bArr = this.f17166a.f17845a;
                int iMin = Math.min(i10, 15 - this.f17171f);
                nVar.a(bArr, this.f17171f, iMin);
                int i13 = this.f17171f + iMin;
                this.f17171f = i13;
                if (i13 == 15) {
                    byte[] bArr2 = this.f17166a.f17845a;
                    if (this.f17174i == null) {
                        String str = this.f17168c;
                        String str2 = this.f17167b;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(bArr2);
                        mVar.c(60);
                        int i14 = com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f16369a[mVar.a(6)];
                        int i15 = com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f16370b[mVar.a(4)];
                        int iA = mVar.a(5);
                        int i16 = iA >= 29 ? -1 : (com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f16371c[iA] * 1000) / 2;
                        mVar.c(10);
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "audio/vnd.dts", i16, -1, i14 + (mVar.a(2) > 0 ? 1 : 0), i15, null, null, str2);
                        this.f17174i = oVarA;
                        this.f17169d.a(oVarA);
                    }
                    byte b10 = bArr2[5];
                    this.f17175j = (((b10 & 2) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f17173h = (int) ((((long) (((((bArr2[4] & 1) << 6) | ((b10 & 252) >> 2)) + 1) * 32)) * 1000000) / ((long) this.f17174i.f17517s));
                    this.f17166a.e(0);
                    this.f17169d.a(15, this.f17166a);
                    this.f17170e = 2;
                }
            } else if (i11 == 2) {
                int iMin2 = Math.min(i10, this.f17175j - this.f17171f);
                this.f17169d.a(iMin2, nVar);
                int i17 = this.f17171f + iMin2;
                this.f17171f = i17;
                int i18 = this.f17175j;
                if (i17 == i18) {
                    this.f17169d.a(this.f17176k, 1, i18, 0, null);
                    this.f17176k += this.f17173h;
                    this.f17170e = 0;
                }
            }
        }
    }
}
