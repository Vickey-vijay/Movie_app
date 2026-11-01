package z3;

import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: Ac4Reader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.s f85966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.t f85967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f85969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q3.u f85970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f85973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f85974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f85975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Format f85976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f85977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f85978m;

    public f() {
        this(null);
    }

    @Override // z3.m
    public void packetFinished() {
    }

    @Override // z3.m
    public void seek() {
        this.f85971f = 0;
        this.f85972g = 0;
        this.f85973h = false;
        this.f85974i = false;
    }

    public f(String str) {
        g5.s sVar = new g5.s(new byte[16]);
        this.f85966a = sVar;
        this.f85967b = new g5.t(sVar.f53150a);
        this.f85971f = 0;
        this.f85972g = 0;
        this.f85973h = false;
        this.f85974i = false;
        this.f85968c = str;
    }

    public final void d() {
        this.f85966a.o(0);
        m3.b.C0580b c0580bD = m3.b.d(this.f85966a);
        Format format = this.f85976k;
        if (format == null || c0580bD.f63961c != format.f18983w || c0580bD.f63960b != format.f18984x || !"audio/ac4".equals(format.f18970j)) {
            Format formatP = Format.p(this.f85969d, "audio/ac4", null, -1, -1, c0580bD.f63961c, c0580bD.f63960b, null, null, 0, this.f85968c);
            this.f85976k = formatP;
            this.f85970e.a(formatP);
        }
        this.f85977l = c0580bD.f63962d;
        this.f85975j = (((long) c0580bD.f63963e) * 1000000) / ((long) this.f85976k.f18984x);
    }

    @Override // z3.m
    public void packetStarted(long j10, int i10) {
        this.f85978m = j10;
    }

    public final boolean a(g5.t tVar, byte[] bArr, int i10) {
        int iMin = Math.min(tVar.a(), i10 - this.f85972g);
        tVar.h(bArr, this.f85972g, iMin);
        int i11 = this.f85972g + iMin;
        this.f85972g = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override // z3.m
    public void b(g5.t tVar) {
        int i10;
        while (tVar.a() > 0) {
            int i11 = this.f85971f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int iMin = Math.min(tVar.a(), this.f85977l - this.f85972g);
                        this.f85970e.c(tVar, iMin);
                        int i12 = this.f85972g + iMin;
                        this.f85972g = i12;
                        int i13 = this.f85977l;
                        if (i12 == i13) {
                            this.f85970e.d(this.f85978m, 1, i13, 0, null);
                            this.f85978m += this.f85975j;
                            this.f85971f = 0;
                        }
                    }
                } else if (a(tVar, this.f85967b.f53154a, 16)) {
                    d();
                    this.f85967b.L(0);
                    this.f85970e.c(this.f85967b, 16);
                    this.f85971f = 2;
                }
            } else if (e(tVar)) {
                this.f85971f = 1;
                byte[] bArr = this.f85967b.f53154a;
                bArr[0] = -84;
                if (this.f85974i) {
                    i10 = 65;
                } else {
                    i10 = 64;
                }
                bArr[1] = (byte) i10;
                this.f85972g = 2;
            }
        }
    }

    @Override // z3.m
    public void c(q3.i iVar, h0.d dVar) {
        dVar.a();
        this.f85969d = dVar.b();
        this.f85970e = iVar.track(dVar.c(), 1);
    }

    public final boolean e(g5.t tVar) {
        boolean z10;
        while (true) {
            boolean z11 = false;
            if (tVar.a() <= 0) {
                return false;
            }
            if (!this.f85973h) {
                if (tVar.y() == 172) {
                    z11 = true;
                }
                this.f85973h = z11;
            } else {
                int iY = tVar.y();
                if (iY == 172) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f85973h = z10;
                if (iY == 64 || iY == 65) {
                    if (iY == 65) {
                        z11 = true;
                    }
                    this.f85974i = z11;
                    return true;
                }
            }
        }
    }
}
