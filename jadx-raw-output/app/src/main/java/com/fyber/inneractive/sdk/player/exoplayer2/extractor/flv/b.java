package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements i, q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f16483n = z.a("FLV");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f16488e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f16494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f16495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f16496m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16484a = new n(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f16485b = new n(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f16486c = new n(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f16487d = new n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16489f = 1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        bVar.a(this.f16484a.f17845a, 0, 3, false);
        this.f16484a.e(0);
        if (this.f16484a.l() != f16483n) {
            return false;
        }
        bVar.a(this.f16484a.f17845a, 0, 2, false);
        this.f16484a.e(0);
        if ((this.f16484a.o() & 250) != 0) {
            return false;
        }
        bVar.a(this.f16484a.f17845a, 0, 4, false);
        this.f16484a.e(0);
        int iB = this.f16484a.b();
        bVar.f16454e = 0;
        bVar.a(iB, false);
        bVar.a(this.f16484a.f17845a, 0, 4, false);
        this.f16484a.e(0);
        return this.f16484a.b() == 0;
    }

    public final n b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        if (this.f16492i > this.f16487d.a()) {
            n nVar = this.f16487d;
            nVar.f17845a = new byte[Math.max(nVar.a() * 2, this.f16492i)];
            nVar.f17847c = 0;
            nVar.f17846b = 0;
        } else {
            this.f16487d.e(0);
        }
        this.f16487d.d(this.f16492i);
        bVar.b(this.f16487d.f17845a, 0, this.f16492i, false);
        return this.f16487d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f16496m.f16497b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f16488e = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f16489f = 1;
        this.f16490g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, r, EOFException {
        c cVar;
        f fVar;
        a aVar;
        while (true) {
            int i10 = this.f16489f;
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    bVar.a(this.f16490g);
                    this.f16490g = 0;
                    this.f16489f = 3;
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        int i11 = this.f16491h;
                        if (i11 == 8 && (aVar = this.f16494k) != null) {
                            n nVarB = b(bVar);
                            long j10 = this.f16493j;
                            aVar.a(nVarB);
                            aVar.a(nVarB, j10);
                        } else if (i11 == 9 && (fVar = this.f16495l) != null) {
                            n nVarB2 = b(bVar);
                            long j11 = this.f16493j;
                            if (fVar.a(nVarB2)) {
                                fVar.a(nVarB2, j11);
                            }
                        } else if (i11 == 18 && (cVar = this.f16496m) != null) {
                            cVar.a(b(bVar), this.f16493j);
                        } else {
                            bVar.a(this.f16492i);
                            z10 = false;
                        }
                        this.f16490g = 4;
                        this.f16489f = 2;
                        if (z10) {
                            return 0;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (!bVar.b(this.f16486c.f17845a, 0, 11, true)) {
                        return -1;
                    }
                    this.f16486c.e(0);
                    this.f16491h = this.f16486c.j();
                    this.f16492i = this.f16486c.l();
                    this.f16493j = this.f16486c.l();
                    this.f16493j = (((long) (this.f16486c.j() << 24)) | this.f16493j) * 1000;
                    n nVar = this.f16486c;
                    nVar.e(nVar.f17846b + 3);
                    this.f16489f = 4;
                }
            } else {
                if (!bVar.b(this.f16485b.f17845a, 0, 9, true)) {
                    return -1;
                }
                this.f16485b.e(0);
                n nVar2 = this.f16485b;
                nVar2.e(nVar2.f17846b + 4);
                int iJ = this.f16485b.j();
                boolean z11 = (iJ & 4) != 0;
                boolean z12 = (iJ & 1) != 0;
                if (z11 && this.f16494k == null) {
                    this.f16494k = new a(this.f16488e.a(8, 1));
                }
                if (z12 && this.f16495l == null) {
                    this.f16495l = new f(this.f16488e.a(9, 2));
                }
                if (this.f16496m == null) {
                    this.f16496m = new c();
                }
                this.f16488e.b();
                this.f16488e.a(this);
                this.f16490g = this.f16485b.b() - 5;
                this.f16489f = 2;
            }
        }
    }
}
