package z3;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;

/* JADX INFO: compiled from: LatmReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.t f86178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5.s f86179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q3.u f86180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Format f86181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f86182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f86184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f86187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f86188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f86189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f86190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f86191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f86192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f86193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f86194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f86195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f86196t;

    public static long a(g5.s sVar) {
        return sVar.h((sVar.h(2) + 1) * 8);
    }

    public final void f(g5.s sVar) {
        int iH = sVar.h(3);
        this.f86191o = iH;
        if (iH == 0) {
            sVar.q(8);
            return;
        }
        if (iH == 1) {
            sVar.q(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            sVar.q(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            sVar.q(1);
        }
    }

    @Override // z3.m
    public void packetFinished() {
    }

    @Override // z3.m
    public void seek() {
        this.f86183g = 0;
        this.f86188l = false;
    }

    public final int g(g5.s sVar) throws ParserException {
        int iH;
        if (this.f86191o != 0) {
            throw new ParserException();
        }
        int i10 = 0;
        do {
            iH = sVar.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    public final void i(g5.s sVar) throws ParserException {
        boolean zG;
        int iH = sVar.h(1);
        int iH2 = iH == 1 ? sVar.h(1) : 0;
        this.f86189m = iH2;
        if (iH2 != 0) {
            throw new ParserException();
        }
        if (iH == 1) {
            a(sVar);
        }
        if (!sVar.g()) {
            throw new ParserException();
        }
        this.f86190n = sVar.h(6);
        int iH3 = sVar.h(4);
        int iH4 = sVar.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw new ParserException();
        }
        if (iH == 0) {
            int iE = sVar.e();
            int iE2 = e(sVar);
            sVar.o(iE);
            byte[] bArr = new byte[(iE2 + 7) / 8];
            sVar.i(bArr, 0, iE2);
            Format formatP = Format.p(this.f86182f, "audio/mp4a-latm", null, -1, -1, this.f86196t, this.f86194r, Collections.singletonList(bArr), null, 0, this.f86177a);
            if (!formatP.equals(this.f86181e)) {
                this.f86181e = formatP;
                this.f86195s = 1024000000 / ((long) formatP.f18984x);
                this.f86180d.a(formatP);
            }
        } else {
            sVar.q(((int) a(sVar)) - e(sVar));
        }
        f(sVar);
        boolean zG2 = sVar.g();
        this.f86192p = zG2;
        this.f86193q = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f86193q = a(sVar);
            } else {
                do {
                    zG = sVar.g();
                    this.f86193q = (this.f86193q << 8) + ((long) sVar.h(8));
                } while (zG);
            }
        }
        if (sVar.g()) {
            sVar.q(8);
        }
    }

    public final void j(int i10) {
        this.f86178b.H(i10);
        this.f86179c.m(this.f86178b.f53154a);
    }

    @Override // z3.m
    public void packetStarted(long j10, int i10) {
        this.f86187k = j10;
    }

    public r(@Nullable String str) {
        this.f86177a = str;
        g5.t tVar = new g5.t(1024);
        this.f86178b = tVar;
        this.f86179c = new g5.s(tVar.f53154a);
    }

    @Override // z3.m
    public void b(g5.t tVar) throws ParserException {
        while (tVar.a() > 0) {
            int i10 = this.f86183g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            int iMin = Math.min(tVar.a(), this.f86185i - this.f86184h);
                            tVar.h(this.f86179c.f53150a, this.f86184h, iMin);
                            int i11 = this.f86184h + iMin;
                            this.f86184h = i11;
                            if (i11 == this.f86185i) {
                                this.f86179c.o(0);
                                d(this.f86179c);
                                this.f86183g = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int iY = ((this.f86186j & (-225)) << 8) | tVar.y();
                        this.f86185i = iY;
                        if (iY > this.f86178b.f53154a.length) {
                            j(iY);
                        }
                        this.f86184h = 0;
                        this.f86183g = 3;
                    }
                } else {
                    int iY2 = tVar.y();
                    if ((iY2 & 224) == 224) {
                        this.f86186j = iY2;
                        this.f86183g = 2;
                    } else if (iY2 != 86) {
                        this.f86183g = 0;
                    }
                }
            } else if (tVar.y() == 86) {
                this.f86183g = 1;
            }
        }
    }

    @Override // z3.m
    public void c(q3.i iVar, h0.d dVar) {
        dVar.a();
        this.f86180d = iVar.track(dVar.c(), 1);
        this.f86182f = dVar.b();
    }

    public final void d(g5.s sVar) throws ParserException {
        if (!sVar.g()) {
            this.f86188l = true;
            i(sVar);
        } else if (!this.f86188l) {
            return;
        }
        if (this.f86189m == 0) {
            if (this.f86190n == 0) {
                h(sVar, g(sVar));
                if (this.f86192p) {
                    sVar.q((int) this.f86193q);
                    return;
                }
                return;
            }
            throw new ParserException();
        }
        throw new ParserException();
    }

    public final int e(g5.s sVar) throws ParserException {
        int iB = sVar.b();
        Pair<Integer, Integer> pairI = g5.d.i(sVar, true);
        this.f86194r = ((Integer) pairI.first).intValue();
        this.f86196t = ((Integer) pairI.second).intValue();
        return iB - sVar.b();
    }

    public final void h(g5.s sVar, int i10) {
        int iE = sVar.e();
        if ((iE & 7) == 0) {
            this.f86178b.L(iE >> 3);
        } else {
            sVar.i(this.f86178b.f53154a, 0, i10 * 8);
            this.f86178b.L(0);
        }
        this.f86180d.c(this.f86178b, i10);
        this.f86180d.d(this.f86187k, 1, i10, 0, null);
        this.f86187k += this.f86195s;
    }
}
