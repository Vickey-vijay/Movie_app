package z3;

import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: Ac3Reader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.s f85936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.t f85937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f85939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q3.u f85940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f85943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f85944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Format f85945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f85946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f85947l;

    public c() {
        this(null);
    }

    @Override // z3.m
    public void packetFinished() {
    }

    @Override // z3.m
    public void seek() {
        this.f85941f = 0;
        this.f85942g = 0;
        this.f85943h = false;
    }

    public c(String str) {
        g5.s sVar = new g5.s(new byte[128]);
        this.f85936a = sVar;
        this.f85937b = new g5.t(sVar.f53150a);
        this.f85941f = 0;
        this.f85938c = str;
    }

    public final void d() {
        this.f85936a.o(0);
        m3.a.b bVarE = m3.a.e(this.f85936a);
        Format format = this.f85945j;
        if (format == null || bVarE.f63955d != format.f18983w || bVarE.f63954c != format.f18984x || bVarE.f63952a != format.f18970j) {
            Format formatP = Format.p(this.f85939d, bVarE.f63952a, null, -1, -1, bVarE.f63955d, bVarE.f63954c, null, null, 0, this.f85938c);
            this.f85945j = formatP;
            this.f85940e.a(formatP);
        }
        this.f85946k = bVarE.f63956e;
        this.f85944i = (((long) bVarE.f63957f) * 1000000) / ((long) this.f85945j.f18984x);
    }

    @Override // z3.m
    public void packetStarted(long j10, int i10) {
        this.f85947l = j10;
    }

    public final boolean a(g5.t tVar, byte[] bArr, int i10) {
        int iMin = Math.min(tVar.a(), i10 - this.f85942g);
        tVar.h(bArr, this.f85942g, iMin);
        int i11 = this.f85942g + iMin;
        this.f85942g = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override // z3.m
    public void b(g5.t tVar) {
        while (tVar.a() > 0) {
            int i10 = this.f85941f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(tVar.a(), this.f85946k - this.f85942g);
                        this.f85940e.c(tVar, iMin);
                        int i11 = this.f85942g + iMin;
                        this.f85942g = i11;
                        int i12 = this.f85946k;
                        if (i11 == i12) {
                            this.f85940e.d(this.f85947l, 1, i12, 0, null);
                            this.f85947l += this.f85944i;
                            this.f85941f = 0;
                        }
                    }
                } else if (a(tVar, this.f85937b.f53154a, 128)) {
                    d();
                    this.f85937b.L(0);
                    this.f85940e.c(this.f85937b, 128);
                    this.f85941f = 2;
                }
            } else if (e(tVar)) {
                this.f85941f = 1;
                byte[] bArr = this.f85937b.f53154a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.f85942g = 2;
            }
        }
    }

    @Override // z3.m
    public void c(q3.i iVar, h0.d dVar) {
        dVar.a();
        this.f85939d = dVar.b();
        this.f85940e = iVar.track(dVar.c(), 1);
    }

    public final boolean e(g5.t tVar) {
        while (true) {
            boolean z10 = false;
            if (tVar.a() <= 0) {
                return false;
            }
            if (!this.f85943h) {
                if (tVar.y() == 11) {
                    z10 = true;
                }
                this.f85943h = z10;
            } else {
                int iY = tVar.y();
                if (iY == 119) {
                    this.f85943h = false;
                    return true;
                }
                if (iY == 11) {
                    z10 = true;
                }
                this.f85943h = z10;
            }
        }
    }
}
