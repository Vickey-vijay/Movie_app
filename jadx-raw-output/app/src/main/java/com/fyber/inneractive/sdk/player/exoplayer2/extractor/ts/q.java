package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f17283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17287f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17293l;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f17287f = 0;
        this.f17288g = 0;
        this.f17290i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public q(String str) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);
        this.f17282a = nVar;
        nVar.f17845a[0] = -1;
        this.f17283b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();
        this.f17284c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f17285d = e0Var.f17165e;
        e0Var.b();
        this.f17286e = jVar.a(e0Var.f17164d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f17293l = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        while (true) {
            int i10 = nVar.f17847c;
            int i11 = nVar.f17846b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f17287f;
            if (i13 == 0) {
                byte[] bArr = nVar.f17845a;
                while (true) {
                    if (i11 < i10) {
                        byte b10 = bArr[i11];
                        boolean z10 = (b10 & 255) == 255;
                        boolean z11 = this.f17290i && (b10 & 224) == 224;
                        this.f17290i = z10;
                        if (z11) {
                            nVar.e(i11 + 1);
                            this.f17290i = false;
                            this.f17282a.f17845a[1] = bArr[i11];
                            this.f17288g = 2;
                            this.f17287f = 1;
                            break;
                        }
                        i11++;
                    } else {
                        nVar.e(i10);
                        break;
                    }
                }
            } else if (i13 == 1) {
                int iMin = Math.min(i12, 4 - this.f17288g);
                nVar.a(this.f17282a.f17845a, this.f17288g, iMin);
                int i14 = this.f17288g + iMin;
                this.f17288g = i14;
                if (i14 >= 4) {
                    this.f17282a.e(0);
                    if (!com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.f17282a.b(), this.f17283b)) {
                        this.f17288g = 0;
                        this.f17287f = 1;
                    } else {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar2 = this.f17283b;
                        this.f17292k = nVar2.f17016c;
                        if (!this.f17289h) {
                            long j10 = ((long) nVar2.f17020g) * 1000000;
                            int i15 = nVar2.f17017d;
                            this.f17291j = j10 / ((long) i15);
                            this.f17286e.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f17285d, nVar2.f17015b, -1, 4096, nVar2.f17018e, i15, null, null, this.f17284c));
                            this.f17289h = true;
                        }
                        this.f17282a.e(0);
                        this.f17286e.a(4, this.f17282a);
                        this.f17287f = 2;
                    }
                }
            } else if (i13 == 2) {
                int iMin2 = Math.min(i12, this.f17292k - this.f17288g);
                this.f17286e.a(iMin2, nVar);
                int i16 = this.f17288g + iMin2;
                this.f17288g = i16;
                int i17 = this.f17292k;
                if (i16 >= i17) {
                    this.f17286e.a(this.f17293l, 1, i17, 0, null);
                    this.f17293l += this.f17291j;
                    this.f17288g = 0;
                    this.f17287f = 0;
                }
            }
        }
    }
}
