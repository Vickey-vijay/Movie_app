package z3;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: AdtsReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f86030v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f86031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.s f86032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5.t f86033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f86034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f86035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q3.u f86036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q3.u f86037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f86038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f86041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f86042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f86043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f86044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f86045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f86046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f86047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f86048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f86049s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q3.u f86050t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f86051u;

    public i(boolean z10) {
        this(z10, null);
    }

    public static boolean i(int i10) {
        return (i10 & 65526) == 65520;
    }

    public final void m() {
        this.f86042l = false;
        o();
    }

    public final void n() {
        this.f86038h = 1;
        this.f86039i = 0;
    }

    public final void o() {
        this.f86038h = 0;
        this.f86039i = 0;
        this.f86040j = 256;
    }

    public final void p() {
        this.f86038h = 3;
        this.f86039i = 0;
    }

    @Override // z3.m
    public void packetFinished() {
    }

    public final void q() {
        this.f86038h = 2;
        this.f86039i = f86030v.length;
        this.f86048r = 0;
        this.f86033c.L(0);
    }

    public final void r(q3.u uVar, long j10, int i10, int i11) {
        this.f86038h = 4;
        this.f86039i = i10;
        this.f86050t = uVar;
        this.f86051u = j10;
        this.f86048r = i11;
    }

    public i(boolean z10, String str) {
        this.f86032b = new g5.s(new byte[7]);
        this.f86033c = new g5.t(Arrays.copyOf(f86030v, 10));
        o();
        this.f86043m = -1;
        this.f86044n = -1;
        this.f86047q = -9223372036854775807L;
        this.f86031a = z10;
        this.f86034d = str;
    }

    public final boolean d(g5.t tVar, int i10) {
        tVar.L(i10 + 1);
        if (!s(tVar, this.f86032b.f53150a, 1)) {
            return false;
        }
        this.f86032b.o(4);
        int iH = this.f86032b.h(1);
        int i11 = this.f86043m;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f86044n != -1) {
            if (!s(tVar, this.f86032b.f53150a, 1)) {
                return true;
            }
            this.f86032b.o(2);
            if (this.f86032b.h(4) != this.f86044n) {
                return false;
            }
            tVar.L(i10 + 2);
        }
        if (!s(tVar, this.f86032b.f53150a, 4)) {
            return true;
        }
        this.f86032b.o(14);
        int iH2 = this.f86032b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArr = tVar.f53154a;
        int iD = tVar.d();
        int i12 = i10 + iH2;
        if (i12 >= iD) {
            return true;
        }
        byte b10 = bArr[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iD) {
                return true;
            }
            return h((byte) -1, bArr[i13]) && ((bArr[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iD) {
            return true;
        }
        if (bArr[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iD || bArr[i15] == 51;
    }

    public final void f(g5.t tVar) {
        byte[] bArr = tVar.f53154a;
        int iC = tVar.c();
        int iD = tVar.d();
        while (iC < iD) {
            int i10 = iC + 1;
            int i11 = bArr[iC] & 255;
            if (this.f86040j == 512 && h((byte) -1, (byte) i11) && (this.f86042l || d(tVar, i10 - 2))) {
                this.f86045o = (i11 & 8) >> 3;
                this.f86041k = (i11 & 1) == 0;
                if (this.f86042l) {
                    p();
                } else {
                    n();
                }
                tVar.L(i10);
                return;
            }
            int i12 = this.f86040j;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f86040j = 768;
            } else if (i13 == 511) {
                this.f86040j = 512;
            } else if (i13 == 836) {
                this.f86040j = 1024;
            } else if (i13 == 1075) {
                q();
                tVar.L(i10);
                return;
            } else if (i12 != 256) {
                this.f86040j = 256;
                i10--;
            }
            iC = i10;
        }
        tVar.L(iC);
    }

    public long g() {
        return this.f86047q;
    }

    public final boolean h(byte b10, byte b11) {
        return i(((b10 & 255) << 8) | (b11 & 255));
    }

    public final void j() throws ParserException {
        this.f86032b.o(0);
        if (this.f86046p) {
            this.f86032b.q(10);
        } else {
            int iH = this.f86032b.h(2) + 1;
            if (iH != 2) {
                g5.m.h("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
                iH = 2;
            }
            this.f86032b.q(5);
            byte[] bArrA = g5.d.a(iH, this.f86044n, this.f86032b.h(3));
            Pair<Integer, Integer> pairJ = g5.d.j(bArrA);
            Format formatP = Format.p(this.f86035e, "audio/mp4a-latm", null, -1, -1, ((Integer) pairJ.second).intValue(), ((Integer) pairJ.first).intValue(), Collections.singletonList(bArrA), null, 0, this.f86034d);
            this.f86047q = 1024000000 / ((long) formatP.f18984x);
            this.f86036f.a(formatP);
            this.f86046p = true;
        }
        this.f86032b.q(4);
        int iH2 = (this.f86032b.h(13) - 2) - 5;
        if (this.f86041k) {
            iH2 -= 2;
        }
        r(this.f86036f, this.f86047q, 0, iH2);
    }

    public final void k() {
        this.f86037g.c(this.f86033c, 10);
        this.f86033c.L(6);
        r(this.f86037g, 0L, 10, this.f86033c.x() + 10);
    }

    @Override // z3.m
    public void packetStarted(long j10, int i10) {
        this.f86049s = j10;
    }

    public final void a(g5.t tVar) {
        if (tVar.a() == 0) {
            return;
        }
        this.f86032b.f53150a[0] = tVar.f53154a[tVar.c()];
        this.f86032b.o(2);
        int iH = this.f86032b.h(4);
        int i10 = this.f86044n;
        if (i10 != -1 && iH != i10) {
            m();
            return;
        }
        if (!this.f86042l) {
            this.f86042l = true;
            this.f86043m = this.f86045o;
            this.f86044n = iH;
        }
        p();
    }

    @Override // z3.m
    public void b(g5.t tVar) throws ParserException {
        int i10;
        while (tVar.a() > 0) {
            int i11 = this.f86038h;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                l(tVar);
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f86041k) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            if (e(tVar, this.f86032b.f53150a, i10)) {
                                j();
                            }
                        }
                    } else if (e(tVar, this.f86033c.f53154a, 10)) {
                        k();
                    }
                } else {
                    a(tVar);
                }
            } else {
                f(tVar);
            }
        }
    }

    @Override // z3.m
    public void c(q3.i iVar, h0.d dVar) {
        dVar.a();
        this.f86035e = dVar.b();
        this.f86036f = iVar.track(dVar.c(), 1);
        if (this.f86031a) {
            dVar.a();
            q3.u uVarTrack = iVar.track(dVar.c(), 4);
            this.f86037g = uVarTrack;
            uVarTrack.a(Format.t(dVar.b(), "application/id3", null, -1, null));
            return;
        }
        this.f86037g = new q3.f();
    }

    public final boolean e(g5.t tVar, byte[] bArr, int i10) {
        int iMin = Math.min(tVar.a(), i10 - this.f86039i);
        tVar.h(bArr, this.f86039i, iMin);
        int i11 = this.f86039i + iMin;
        this.f86039i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    public final void l(g5.t tVar) {
        int iMin = Math.min(tVar.a(), this.f86048r - this.f86039i);
        this.f86050t.c(tVar, iMin);
        int i10 = this.f86039i + iMin;
        this.f86039i = i10;
        int i11 = this.f86048r;
        if (i10 == i11) {
            this.f86050t.d(this.f86049s, 1, i11, 0, null);
            this.f86049s += this.f86051u;
            o();
        }
    }

    public final boolean s(g5.t tVar, byte[] bArr, int i10) {
        if (tVar.a() < i10) {
            return false;
        }
        tVar.h(bArr, 0, i10);
        return true;
    }

    @Override // z3.m
    public void seek() {
        m();
    }
}
