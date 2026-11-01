package z3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import g5.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TsExtractor.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements q3.g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q3.k f85979s = new q3.k() { // from class: z3.f0
        @Override // q3.k
        public final q3.g[] createExtractors() {
            return g0.v();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g5.g0> f85981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5.t f85982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f85983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.c f85984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<h0> f85985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f85986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f85987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f85988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d0 f85989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q3.i f85990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f85991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f85992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f85993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f85994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h0 f85995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f85996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f85997r;

    /* JADX INFO: compiled from: TsExtractor.java */
    public class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g5.s f85998a = new g5.s(new byte[4]);

        @Override // z3.z
        public void a(g5.g0 g0Var, q3.i iVar, h0.d dVar) {
        }

        public a() {
        }

        @Override // z3.z
        public void b(g5.t tVar) {
            if (tVar.y() != 0 || (tVar.y() & 128) == 0) {
                return;
            }
            tVar.M(6);
            int iA = tVar.a() / 4;
            for (int i10 = 0; i10 < iA; i10++) {
                tVar.g(this.f85998a, 4);
                int iH = this.f85998a.h(16);
                this.f85998a.q(3);
                if (iH == 0) {
                    this.f85998a.q(13);
                } else {
                    int iH2 = this.f85998a.h(13);
                    g0.this.f85985f.put(iH2, new a0(g0.this.new b(iH2)));
                    g0.j(g0.this);
                }
            }
            if (g0.this.f85980a != 2) {
                g0.this.f85985f.remove(0);
            }
        }
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    public class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g5.s f86000a = new g5.s(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<h0> f86001b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseIntArray f86002c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f86003d;

        @Override // z3.z
        public void a(g5.g0 g0Var, q3.i iVar, h0.d dVar) {
        }

        public b(int i10) {
            this.f86003d = i10;
        }

        @Override // z3.z
        public void b(g5.t tVar) {
            g5.g0 g0Var;
            if (tVar.y() != 2) {
                return;
            }
            if (g0.this.f85980a == 1 || g0.this.f85980a == 2 || g0.this.f85991l == 1) {
                g0Var = (g5.g0) g0.this.f85981b.get(0);
            } else {
                g0Var = new g5.g0(((g5.g0) g0.this.f85981b.get(0)).c());
                g0.this.f85981b.add(g0Var);
            }
            if ((tVar.y() & 128) == 0) {
                return;
            }
            tVar.M(1);
            int iE = tVar.E();
            int i10 = 3;
            tVar.M(3);
            tVar.g(this.f86000a, 2);
            this.f86000a.q(3);
            int i11 = 13;
            g0.this.f85997r = this.f86000a.h(13);
            tVar.g(this.f86000a, 2);
            int i12 = 4;
            this.f86000a.q(4);
            tVar.M(this.f86000a.h(12));
            if (g0.this.f85980a == 2 && g0.this.f85995p == null) {
                h0.b bVar = new h0.b(21, null, null, k0.f53113f);
                g0 g0Var2 = g0.this;
                g0Var2.f85995p = g0Var2.f85984e.a(21, bVar);
                g0.this.f85995p.a(g0Var, g0.this.f85990k, new h0.d(iE, 21, 8192));
            }
            this.f86001b.clear();
            this.f86002c.clear();
            int iA = tVar.a();
            while (iA > 0) {
                tVar.g(this.f86000a, 5);
                int iH = this.f86000a.h(8);
                this.f86000a.q(i10);
                int iH2 = this.f86000a.h(i11);
                this.f86000a.q(i12);
                int iH3 = this.f86000a.h(12);
                h0.b bVarC = c(tVar, iH3);
                if (iH == 6) {
                    iH = bVarC.f86021a;
                }
                iA -= iH3 + 5;
                int i13 = g0.this.f85980a == 2 ? iH : iH2;
                if (!g0.this.f85986g.get(i13)) {
                    h0 h0VarA = (g0.this.f85980a == 2 && iH == 21) ? g0.this.f85995p : g0.this.f85984e.a(iH, bVarC);
                    if (g0.this.f85980a != 2 || iH2 < this.f86002c.get(i13, 8192)) {
                        this.f86002c.put(i13, iH2);
                        this.f86001b.put(i13, h0VarA);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f86002c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f86002c.keyAt(i14);
                int iValueAt = this.f86002c.valueAt(i14);
                g0.this.f85986g.put(iKeyAt, true);
                g0.this.f85987h.put(iValueAt, true);
                h0 h0VarValueAt = this.f86001b.valueAt(i14);
                if (h0VarValueAt != null) {
                    if (h0VarValueAt != g0.this.f85995p) {
                        h0VarValueAt.a(g0Var, g0.this.f85990k, new h0.d(iE, iKeyAt, 8192));
                    }
                    g0.this.f85985f.put(iValueAt, h0VarValueAt);
                }
            }
            if (g0.this.f85980a == 2) {
                if (g0.this.f85992m) {
                    return;
                }
                g0.this.f85990k.endTracks();
                g0.this.f85991l = 0;
                g0.this.f85992m = true;
                return;
            }
            g0.this.f85985f.remove(this.f86003d);
            g0 g0Var3 = g0.this;
            g0Var3.f85991l = g0Var3.f85980a != 1 ? g0.this.f85991l - 1 : 0;
            if (g0.this.f85991l == 0) {
                g0.this.f85990k.endTracks();
                g0.this.f85992m = true;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0042  */
        /* JADX WARN: Code duplicated, block: B:21:0x0053  */
        /* JADX WARN: Code duplicated, block: B:24:0x0059  */
        public final h0.b c(g5.t tVar, int i10) {
            int iC = tVar.c();
            int i11 = i10 + iC;
            String strTrim = null;
            int i12 = -1;
            ArrayList arrayList = null;
            while (tVar.c() < i11) {
                int iY = tVar.y();
                int iC2 = tVar.c() + tVar.y();
                if (iY == 5) {
                    long jA = tVar.A();
                    if (jA != 1094921523) {
                        if (jA != 1161904947) {
                            if (jA == 1094921524) {
                                i12 = 172;
                            } else if (jA == 1212503619) {
                                i12 = 36;
                            }
                        } else {
                            i12 = 135;
                        }
                    } else {
                        i12 = 129;
                    }
                } else if (iY == 106) {
                    i12 = 129;
                } else if (iY == 122) {
                    i12 = 135;
                } else if (iY == 127) {
                    if (tVar.y() == 21) {
                        i12 = 172;
                    }
                } else if (iY == 123) {
                    i12 = 138;
                } else if (iY == 10) {
                    strTrim = tVar.v(3).trim();
                } else if (iY == 89) {
                    arrayList = new ArrayList();
                    while (tVar.c() < iC2) {
                        String strTrim2 = tVar.v(3).trim();
                        int iY2 = tVar.y();
                        byte[] bArr = new byte[4];
                        tVar.h(bArr, 0, 4);
                        arrayList.add(new h0.a(strTrim2, iY2, bArr));
                    }
                    i12 = 89;
                }
                tVar.M(iC2 - tVar.c());
            }
            tVar.L(i11);
            return new h0.b(i12, strTrim, arrayList, Arrays.copyOfRange(tVar.f53154a, iC, i11));
        }
    }

    public g0() {
        this(0);
    }

    public static /* synthetic */ q3.g[] v() {
        return new q3.g[]{new g0()};
    }

    @Override // q3.g
    public void release() {
    }

    public g0(int i10) {
        this(1, i10);
    }

    public static /* synthetic */ int j(g0 g0Var) {
        int i10 = g0Var.f85991l;
        g0Var.f85991l = i10 + 1;
        return i10;
    }

    @Override // q3.g
    public int a(q3.h hVar, q3.r rVar) throws InterruptedException, IOException {
        long length = hVar.getLength();
        if (this.f85992m) {
            if (((length == -1 || this.f85980a == 2) ? false : true) && !this.f85988i.d()) {
                return this.f85988i.e(hVar, rVar, this.f85997r);
            }
            w(length);
            if (this.f85994o) {
                this.f85994o = false;
                seek(0L, 0L);
                if (hVar.getPosition() != 0) {
                    rVar.f66477a = 0L;
                    return 1;
                }
            }
            d0 d0Var = this.f85989j;
            if (d0Var != null && d0Var.d()) {
                return this.f85989j.c(hVar, rVar);
            }
        }
        if (!t(hVar)) {
            return -1;
        }
        int iU = u();
        int iD = this.f85982c.d();
        if (iU > iD) {
            return 0;
        }
        int iJ = this.f85982c.j();
        if ((8388608 & iJ) != 0) {
            this.f85982c.L(iU);
            return 0;
        }
        int i10 = ((4194304 & iJ) != 0 ? 1 : 0) | 0;
        int i11 = (2096896 & iJ) >> 8;
        boolean z10 = (iJ & 32) != 0;
        h0 h0Var = (iJ & 16) != 0 ? this.f85985f.get(i11) : null;
        if (h0Var == null) {
            this.f85982c.L(iU);
            return 0;
        }
        if (this.f85980a != 2) {
            int i12 = iJ & 15;
            int i13 = this.f85983d.get(i11, i12 - 1);
            this.f85983d.put(i11, i12);
            if (i13 == i12) {
                this.f85982c.L(iU);
                return 0;
            }
            if (i12 != ((i13 + 1) & 15)) {
                h0Var.seek();
            }
        }
        if (z10) {
            int iY = this.f85982c.y();
            i10 |= (this.f85982c.y() & 64) != 0 ? 2 : 0;
            this.f85982c.M(iY - 1);
        }
        boolean z11 = this.f85992m;
        if (y(i11)) {
            this.f85982c.K(iU);
            h0Var.b(this.f85982c, i10);
            this.f85982c.K(iD);
        }
        if (this.f85980a != 2 && !z11 && this.f85992m && length != -1) {
            this.f85994o = true;
        }
        this.f85982c.L(iU);
        return 0;
    }

    @Override // q3.g
    public boolean b(q3.h hVar) throws InterruptedException, IOException {
        boolean z10;
        byte[] bArr = this.f85982c.f53154a;
        hVar.peekFully(bArr, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                hVar.skipFully(i10);
                return true;
            }
        }
        return false;
    }

    @Override // q3.g
    public void c(q3.i iVar) {
        this.f85990k = iVar;
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        d0 d0Var;
        g5.a.f(this.f85980a != 2);
        int size = this.f85981b.size();
        for (int i10 = 0; i10 < size; i10++) {
            g5.g0 g0Var = this.f85981b.get(i10);
            if ((g0Var.e() == -9223372036854775807L) || (g0Var.e() != 0 && g0Var.c() != j11)) {
                g0Var.g();
                g0Var.h(j11);
            }
        }
        if (j11 != 0 && (d0Var = this.f85989j) != null) {
            d0Var.h(j11);
        }
        this.f85982c.G();
        this.f85983d.clear();
        for (int i11 = 0; i11 < this.f85985f.size(); i11++) {
            this.f85985f.valueAt(i11).seek();
        }
        this.f85996q = 0;
    }

    public final boolean t(q3.h hVar) throws InterruptedException, IOException {
        g5.t tVar = this.f85982c;
        byte[] bArr = tVar.f53154a;
        if (9400 - tVar.c() < 188) {
            int iA = this.f85982c.a();
            if (iA > 0) {
                System.arraycopy(bArr, this.f85982c.c(), bArr, 0, iA);
            }
            this.f85982c.J(bArr, iA);
        }
        while (this.f85982c.a() < 188) {
            int iD = this.f85982c.d();
            int i10 = hVar.read(bArr, iD, 9400 - iD);
            if (i10 == -1) {
                return false;
            }
            this.f85982c.K(iD + i10);
        }
        return true;
    }

    public final int u() throws ParserException {
        int iC = this.f85982c.c();
        int iD = this.f85982c.d();
        int iA = i0.a(this.f85982c.f53154a, iC, iD);
        this.f85982c.L(iA);
        int i10 = iA + 188;
        if (i10 > iD) {
            int i11 = this.f85996q + (iA - iC);
            this.f85996q = i11;
            if (this.f85980a == 2 && i11 > 376) {
                throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f85996q = 0;
        }
        return i10;
    }

    public final void w(long j10) {
        if (this.f85993n) {
            return;
        }
        this.f85993n = true;
        if (this.f85988i.b() == -9223372036854775807L) {
            this.f85990k.e(new q3.s.b(this.f85988i.b()));
            return;
        }
        d0 d0Var = new d0(this.f85988i.c(), this.f85988i.b(), j10, this.f85997r);
        this.f85989j = d0Var;
        this.f85990k.e(d0Var.b());
    }

    public final void x() {
        this.f85986g.clear();
        this.f85985f.clear();
        SparseArray<h0> sparseArrayCreateInitialPayloadReaders = this.f85984e.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f85985f.put(sparseArrayCreateInitialPayloadReaders.keyAt(i10), sparseArrayCreateInitialPayloadReaders.valueAt(i10));
        }
        this.f85985f.put(0, new a0(new a()));
        this.f85995p = null;
    }

    public final boolean y(int i10) {
        return this.f85980a == 2 || this.f85992m || !this.f85987h.get(i10, false);
    }

    public g0(int i10, int i11) {
        this(i10, new g5.g0(0L), new j(i11));
    }

    public g0(int i10, g5.g0 g0Var, h0.c cVar) {
        this.f85984e = (h0.c) g5.a.e(cVar);
        this.f85980a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f85981b = arrayList;
            arrayList.add(g0Var);
        } else {
            this.f85981b = Collections.singletonList(g0Var);
        }
        this.f85982c = new g5.t(new byte[9400], 0);
        this.f85986g = new SparseBooleanArray();
        this.f85987h = new SparseBooleanArray();
        this.f85985f = new SparseArray<>();
        this.f85983d = new SparseIntArray();
        this.f85988i = new e0();
        this.f85997r = -1;
        x();
    }
}
