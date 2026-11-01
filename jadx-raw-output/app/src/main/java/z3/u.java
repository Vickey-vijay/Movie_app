package z3;

import com.google.android.exoplayer2.ParserException;

/* JADX INFO: compiled from: PesReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f86214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.s f86215b = new g5.s(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86216c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g5.g0 f86218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f86220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f86221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f86224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f86225l;

    @Override // z3.h0
    public final void seek() {
        this.f86216c = 0;
        this.f86217d = 0;
        this.f86221h = false;
        this.f86214a.seek();
    }

    @Override // z3.h0
    public void a(g5.g0 g0Var, q3.i iVar, h0.d dVar) {
        this.f86218e = g0Var;
        this.f86214a.c(iVar, dVar);
    }

    @Override // z3.h0
    public final void b(g5.t tVar, int i10) throws ParserException {
        if ((i10 & 1) != 0) {
            int i11 = this.f86216c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    g5.m.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f86223j != -1) {
                        g5.m.h("PesReader", "Unexpected start indicator: expected " + this.f86223j + " more bytes");
                    }
                    this.f86214a.packetFinished();
                }
            }
            f(1);
        }
        while (tVar.a() > 0) {
            int i12 = this.f86216c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (c(tVar, this.f86215b.f53150a, Math.min(10, this.f86222i)) && c(tVar, null, this.f86222i)) {
                            e();
                            i10 |= this.f86224k ? 4 : 0;
                            this.f86214a.packetStarted(this.f86225l, i10);
                            f(3);
                        }
                    } else {
                        if (i12 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = tVar.a();
                        int i13 = this.f86223j;
                        int i14 = i13 != -1 ? iA - i13 : 0;
                        if (i14 > 0) {
                            iA -= i14;
                            tVar.K(tVar.c() + iA);
                        }
                        this.f86214a.b(tVar);
                        int i15 = this.f86223j;
                        if (i15 != -1) {
                            int i16 = i15 - iA;
                            this.f86223j = i16;
                            if (i16 == 0) {
                                this.f86214a.packetFinished();
                                f(1);
                            }
                        }
                    }
                } else if (c(tVar, this.f86215b.f53150a, 9)) {
                    f(d() ? 2 : 0);
                }
            } else {
                tVar.M(tVar.a());
            }
        }
    }

    public final boolean d() {
        this.f86215b.o(0);
        int iH = this.f86215b.h(24);
        if (iH != 1) {
            g5.m.h("PesReader", "Unexpected start code prefix: " + iH);
            this.f86223j = -1;
            return false;
        }
        this.f86215b.q(8);
        int iH2 = this.f86215b.h(16);
        this.f86215b.q(5);
        this.f86224k = this.f86215b.g();
        this.f86215b.q(2);
        this.f86219f = this.f86215b.g();
        this.f86220g = this.f86215b.g();
        this.f86215b.q(6);
        int iH3 = this.f86215b.h(8);
        this.f86222i = iH3;
        if (iH2 == 0) {
            this.f86223j = -1;
        } else {
            this.f86223j = ((iH2 + 6) - 9) - iH3;
        }
        return true;
    }

    public final void e() {
        this.f86215b.o(0);
        this.f86225l = -9223372036854775807L;
        if (this.f86219f) {
            this.f86215b.q(4);
            long jH = ((long) this.f86215b.h(3)) << 30;
            this.f86215b.q(1);
            long jH2 = jH | ((long) (this.f86215b.h(15) << 15));
            this.f86215b.q(1);
            long jH3 = jH2 | ((long) this.f86215b.h(15));
            this.f86215b.q(1);
            if (!this.f86221h && this.f86220g) {
                this.f86215b.q(4);
                long jH4 = ((long) this.f86215b.h(3)) << 30;
                this.f86215b.q(1);
                long jH5 = jH4 | ((long) (this.f86215b.h(15) << 15));
                this.f86215b.q(1);
                long jH6 = jH5 | ((long) this.f86215b.h(15));
                this.f86215b.q(1);
                this.f86218e.b(jH6);
                this.f86221h = true;
            }
            this.f86225l = this.f86218e.b(jH3);
        }
    }

    public final void f(int i10) {
        this.f86216c = i10;
        this.f86217d = 0;
    }

    public u(m mVar) {
        this.f86214a = mVar;
    }

    public final boolean c(g5.t tVar, byte[] bArr, int i10) {
        int iMin = Math.min(tVar.a(), i10 - this.f86217d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            tVar.M(iMin);
        } else {
            tVar.h(bArr, this.f86217d, iMin);
        }
        int i11 = this.f86217d + iMin;
        this.f86217d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }
}
