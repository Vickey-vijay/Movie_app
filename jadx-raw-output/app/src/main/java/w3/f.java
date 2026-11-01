package w3;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import g5.g0;
import g5.k0;
import g5.q;
import g5.t;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import q3.r;
import q3.s;
import q3.u;

/* JADX INFO: compiled from: FragmentedMp4Extractor.java */
/* JADX INFO: loaded from: classes2.dex */
public class f implements q3.g {
    public static final q3.k I = new q3.k() { // from class: w3.e
        @Override // q3.k
        public final q3.g[] createExtractors() {
            return f.k();
        }
    };
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final Format K = Format.s(null, "application/x-emsg", Long.MAX_VALUE);
    public int A;
    public int B;
    public int C;
    public boolean D;
    public q3.i E;
    public u[] F;
    public u[] G;
    public boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final l f73383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Format> f73384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<b> f73385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f73386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f73387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f73388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f73389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f73390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final g0 f73391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d4.b f73392k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f73393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque<w3.a.C0773a> f73394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque<a> f73395n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final u f73396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f73397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f73398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f73399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f73400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f73401t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f73402u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f73403v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f73404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f73405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f73406y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f73407z;

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f73410a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public l f73413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f73414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f73415f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f73416g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f73417h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f73418i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f73411b = new n();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f73412c = new t();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final t f73419j = new t(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final t f73420k = new t();

        public final m c() {
            n nVar = this.f73411b;
            int i10 = nVar.f73468a.f73372a;
            m mVarA = nVar.f73482o;
            if (mVarA == null) {
                mVarA = this.f73413d.a(i10);
            }
            if (mVarA == null || !mVarA.f73463a) {
                return null;
            }
            return mVarA;
        }

        public boolean e() {
            this.f73415f++;
            int i10 = this.f73416g + 1;
            this.f73416g = i10;
            int[] iArr = this.f73411b.f73475h;
            int i11 = this.f73417h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f73417h = i11 + 1;
            this.f73416g = 0;
            return false;
        }

        public void g() {
            this.f73411b.f();
            this.f73415f = 0;
            this.f73417h = 0;
            this.f73416g = 0;
            this.f73418i = 0;
        }

        public void h(long j10) {
            int i10 = this.f73415f;
            while (true) {
                n nVar = this.f73411b;
                if (i10 >= nVar.f73473f || nVar.c(i10) >= j10) {
                    return;
                }
                if (this.f73411b.f73479l[i10]) {
                    this.f73418i = i10;
                }
                i10++;
            }
        }

        public void j(DrmInitData drmInitData) {
            m mVarA = this.f73413d.a(this.f73411b.f73468a.f73372a);
            this.f73410a.a(this.f73413d.f73457f.d(drmInitData.c(mVarA != null ? mVarA.f73464b : null)));
        }

        public b(u uVar) {
            this.f73410a = uVar;
        }

        public void d(l lVar, c cVar) {
            this.f73413d = (l) g5.a.e(lVar);
            this.f73414e = (c) g5.a.e(cVar);
            this.f73410a.a(lVar.f73457f);
            g();
        }

        public int f(int i10, int i11) {
            t tVar;
            boolean z10;
            int i12;
            m mVarC = c();
            if (mVarC == null) {
                return 0;
            }
            int length = mVarC.f73466d;
            if (length != 0) {
                tVar = this.f73411b.f73484q;
            } else {
                byte[] bArr = mVarC.f73467e;
                this.f73420k.J(bArr, bArr.length);
                t tVar2 = this.f73420k;
                length = bArr.length;
                tVar = tVar2;
            }
            boolean zG = this.f73411b.g(this.f73415f);
            if (!zG && i11 == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            t tVar3 = this.f73419j;
            byte[] bArr2 = tVar3.f53154a;
            if (z10) {
                i12 = 128;
            } else {
                i12 = 0;
            }
            bArr2[0] = (byte) (i12 | length);
            tVar3.L(0);
            this.f73410a.c(this.f73419j, 1);
            this.f73410a.c(tVar, length);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f73412c.H(8);
                t tVar4 = this.f73412c;
                byte[] bArr3 = tVar4.f53154a;
                bArr3[0] = 0;
                bArr3[1] = 1;
                bArr3[2] = (byte) ((i11 >> 8) & 255);
                bArr3[3] = (byte) (i11 & 255);
                bArr3[4] = (byte) ((i10 >> 24) & 255);
                bArr3[5] = (byte) ((i10 >> 16) & 255);
                bArr3[6] = (byte) ((i10 >> 8) & 255);
                bArr3[7] = (byte) (i10 & 255);
                this.f73410a.c(tVar4, 8);
                return length + 1 + 8;
            }
            t tVar5 = this.f73411b.f73484q;
            int iE = tVar5.E();
            tVar5.M(-2);
            int i13 = (iE * 6) + 2;
            if (i11 != 0) {
                this.f73412c.H(i13);
                this.f73412c.h(tVar5.f53154a, 0, i13);
                tVar5.M(i13);
                tVar5 = this.f73412c;
                byte[] bArr4 = tVar5.f53154a;
                int i14 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i11;
                bArr4[2] = (byte) ((i14 >> 8) & 255);
                bArr4[3] = (byte) (i14 & 255);
            }
            this.f73410a.c(tVar5, i13);
            return length + 1 + i13;
        }

        public final void i() {
            m mVarC = c();
            if (mVarC == null) {
                return;
            }
            t tVar = this.f73411b.f73484q;
            int i10 = mVarC.f73466d;
            if (i10 != 0) {
                tVar.M(i10);
            }
            if (this.f73411b.g(this.f73415f)) {
                tVar.M(tVar.E() * 6);
            }
        }
    }

    public f() {
        this(0);
    }

    public static void G(w3.a.C0773a c0773a, b bVar, long j10, int i10) throws ParserException {
        List<w3.a.b> list = c0773a.f73344c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            w3.a.b bVar2 = list.get(i13);
            if (bVar2.f73342a == 1953658222) {
                t tVar = bVar2.f73346b;
                tVar.L(12);
                int iC = tVar.C();
                if (iC > 0) {
                    i12 += iC;
                    i11++;
                }
            }
        }
        bVar.f73417h = 0;
        bVar.f73416g = 0;
        bVar.f73415f = 0;
        bVar.f73411b.e(i11, i12);
        int i14 = 0;
        int iF = 0;
        for (int i15 = 0; i15 < size; i15++) {
            w3.a.b bVar3 = list.get(i15);
            if (bVar3.f73342a == 1953658222) {
                iF = F(bVar, i14, j10, i10, bVar3.f73346b, iF);
                i14++;
            }
        }
    }

    public static boolean N(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    public static boolean O(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    public static /* synthetic */ q3.g[] k() {
        return new q3.g[]{new f()};
    }

    public static void y(t tVar, n nVar) throws ParserException {
        x(tVar, 0, nVar);
    }

    public final void f() {
        this.f73397p = 0;
        this.f73400s = 0;
    }

    @Nullable
    public l m(@Nullable l lVar) {
        return lVar;
    }

    @Override // q3.g
    public void release() {
    }

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f73408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73409b;

        public a(long j10, int i10) {
            this.f73408a = j10;
            this.f73409b = i10;
        }
    }

    public f(int i10) {
        this(i10, null);
    }

    public static Pair<Long, q3.b> A(t tVar, long j10) throws ParserException {
        long jD;
        long jD2;
        tVar.L(8);
        int iC = w3.a.c(tVar.j());
        tVar.M(4);
        long jA = tVar.A();
        if (iC == 0) {
            jD = tVar.A();
            jD2 = tVar.A();
        } else {
            jD = tVar.D();
            jD2 = tVar.D();
        }
        long j11 = jD;
        long j12 = j10 + jD2;
        long jY0 = k0.y0(j11, 1000000L, jA);
        tVar.M(2);
        int iE = tVar.E();
        int[] iArr = new int[iE];
        long[] jArr = new long[iE];
        long[] jArr2 = new long[iE];
        long[] jArr3 = new long[iE];
        long j13 = jY0;
        int i10 = 0;
        long j14 = j11;
        while (i10 < iE) {
            int iJ = tVar.j();
            if ((iJ & Integer.MIN_VALUE) != 0) {
                throw new ParserException("Unhandled indirect reference");
            }
            long jA2 = tVar.A();
            iArr[i10] = iJ & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + jA2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i11 = iE;
            int[] iArr2 = iArr;
            long jY1 = k0.y0(j15, 1000000L, jA);
            jArr4[i10] = jY1 - jArr5[i10];
            tVar.M(4);
            j12 += (long) iArr2[i10];
            i10++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iE = i11;
            j14 = j15;
            j13 = jY1;
        }
        return Pair.create(Long.valueOf(jY0), new q3.b(iArr, jArr, jArr2, jArr3));
    }

    public static long B(t tVar) {
        tVar.L(8);
        return w3.a.c(tVar.j()) == 1 ? tVar.D() : tVar.A();
    }

    public static b C(t tVar, SparseArray<b> sparseArray) {
        tVar.L(8);
        int iB = w3.a.b(tVar.j());
        b bVarJ = j(sparseArray, tVar.j());
        if (bVarJ == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jD = tVar.D();
            n nVar = bVarJ.f73411b;
            nVar.f73470c = jD;
            nVar.f73471d = jD;
        }
        c cVar = bVarJ.f73414e;
        bVarJ.f73411b.f73468a = new c((iB & 2) != 0 ? tVar.j() - 1 : cVar.f73372a, (iB & 8) != 0 ? tVar.j() : cVar.f73373b, (iB & 16) != 0 ? tVar.j() : cVar.f73374c, (iB & 32) != 0 ? tVar.j() : cVar.f73375d);
        return bVarJ;
    }

    public static Pair<Integer, c> E(t tVar) {
        tVar.L(12);
        return Pair.create(Integer.valueOf(tVar.j()), new c(tVar.j() - 1, tVar.j(), tVar.j(), tVar.j()));
    }

    public static int F(b bVar, int i10, long j10, int i11, t tVar, int i12) throws ParserException {
        int iJ;
        boolean z10;
        tVar.L(8);
        int iB = w3.a.b(tVar.j());
        l lVar = bVar.f73413d;
        n nVar = bVar.f73411b;
        c cVar = nVar.f73468a;
        nVar.f73475h[i10] = tVar.C();
        long[] jArr = nVar.f73474g;
        long j11 = nVar.f73470c;
        jArr[i10] = j11;
        if ((iB & 1) != 0) {
            jArr[i10] = j11 + ((long) tVar.j());
        }
        boolean z11 = (iB & 4) != 0;
        int iJ2 = cVar.f73375d;
        if (z11) {
            iJ2 = tVar.j();
        }
        boolean z12 = (iB & 256) != 0;
        boolean z13 = (iB & 512) != 0;
        boolean z14 = (iB & 1024) != 0;
        boolean z15 = (iB & 2048) != 0;
        long[] jArr2 = lVar.f73459h;
        long jY0 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            jY0 = k0.y0(lVar.f73460i[0], 1000000L, lVar.f73454c);
        }
        int[] iArr = nVar.f73476i;
        int[] iArr2 = nVar.f73477j;
        long[] jArr3 = nVar.f73478k;
        boolean[] zArr = nVar.f73479l;
        int i13 = iJ2;
        boolean z16 = lVar.f73453b == 2 && (i11 & 1) != 0;
        int i14 = i12 + nVar.f73475h[i10];
        long j12 = lVar.f73454c;
        long j13 = jY0;
        long j14 = i10 > 0 ? nVar.f73486s : j10;
        int i15 = i12;
        while (i15 < i14) {
            int iE = e(z12 ? tVar.j() : cVar.f73373b);
            int iE2 = e(z13 ? tVar.j() : cVar.f73374c);
            if (i15 == 0 && z11) {
                iJ = i13;
            } else {
                iJ = z14 ? tVar.j() : cVar.f73375d;
            }
            if (z15) {
                iArr2[i15] = (int) ((((long) tVar.j()) * 1000000) / j12);
                z10 = false;
            } else {
                z10 = false;
                iArr2[i15] = 0;
            }
            jArr3[i15] = k0.y0(j14, 1000000L, j12) - j13;
            iArr[i15] = iE2;
            zArr[i15] = (((iJ >> 16) & 1) != 0 || (z16 && i15 != 0)) ? z10 : true;
            i15++;
            j14 += (long) iE;
            j12 = j12;
            z12 = z12;
            z11 = z11;
            z15 = z15;
            z13 = z13;
            z14 = z14;
        }
        nVar.f73486s = j14;
        return i14;
    }

    public static void H(t tVar, n nVar, byte[] bArr) throws ParserException {
        tVar.L(8);
        tVar.h(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            x(tVar, 16, nVar);
        }
    }

    public static int e(int i10) throws ParserException {
        if (i10 >= 0) {
            return i10;
        }
        throw new ParserException("Unexpected negtive value: " + i10);
    }

    public static long t(t tVar) {
        tVar.L(8);
        return w3.a.c(tVar.j()) == 0 ? tVar.A() : tVar.D();
    }

    public static void u(w3.a.C0773a c0773a, SparseArray<b> sparseArray, int i10, byte[] bArr) throws ParserException {
        int size = c0773a.f73345d.size();
        for (int i11 = 0; i11 < size; i11++) {
            w3.a.C0773a c0773a2 = c0773a.f73345d.get(i11);
            if (c0773a2.f73342a == 1953653094) {
                D(c0773a2, sparseArray, i10, bArr);
            }
        }
    }

    public static void v(t tVar, n nVar) throws ParserException {
        tVar.L(8);
        int iJ = tVar.j();
        if ((w3.a.b(iJ) & 1) == 1) {
            tVar.M(8);
        }
        int iC = tVar.C();
        if (iC == 1) {
            nVar.f73471d += w3.a.c(iJ) == 0 ? tVar.A() : tVar.D();
        } else {
            throw new ParserException("Unexpected saio entry count: " + iC);
        }
    }

    public static void w(m mVar, t tVar, n nVar) throws ParserException {
        int i10;
        int i11 = mVar.f73466d;
        tVar.L(8);
        if ((w3.a.b(tVar.j()) & 1) == 1) {
            tVar.M(8);
        }
        int iY = tVar.y();
        int iC = tVar.C();
        if (iC != nVar.f73473f) {
            throw new ParserException("Length mismatch: " + iC + ", " + nVar.f73473f);
        }
        if (iY == 0) {
            boolean[] zArr = nVar.f73481n;
            i10 = 0;
            for (int i12 = 0; i12 < iC; i12++) {
                int iY2 = tVar.y();
                i10 += iY2;
                zArr[i12] = iY2 > i11;
            }
        } else {
            i10 = (iY * iC) + 0;
            Arrays.fill(nVar.f73481n, 0, iC, iY > i11);
        }
        nVar.d(i10);
    }

    public static void x(t tVar, int i10, n nVar) throws ParserException {
        tVar.L(i10 + 8);
        int iB = w3.a.b(tVar.j());
        if ((iB & 1) != 0) {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iB & 2) != 0;
        int iC = tVar.C();
        if (iC == nVar.f73473f) {
            Arrays.fill(nVar.f73481n, 0, iC, z10);
            nVar.d(tVar.a());
            nVar.a(tVar);
        } else {
            throw new ParserException("Length mismatch: " + iC + ", " + nVar.f73473f);
        }
    }

    public static void z(t tVar, t tVar2, String str, n nVar) throws ParserException {
        byte[] bArr;
        tVar.L(8);
        int iJ = tVar.j();
        if (tVar.j() != 1936025959) {
            return;
        }
        if (w3.a.c(iJ) == 1) {
            tVar.M(4);
        }
        if (tVar.j() != 1) {
            throw new ParserException("Entry count in sbgp != 1 (unsupported).");
        }
        tVar2.L(8);
        int iJ2 = tVar2.j();
        if (tVar2.j() != 1936025959) {
            return;
        }
        int iC = w3.a.c(iJ2);
        if (iC == 1) {
            if (tVar2.A() == 0) {
                throw new ParserException("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC >= 2) {
            tVar2.M(4);
        }
        if (tVar2.A() != 1) {
            throw new ParserException("Entry count in sgpd != 1 (unsupported).");
        }
        tVar2.M(1);
        int iY = tVar2.y();
        int i10 = (iY & 240) >> 4;
        int i11 = iY & 15;
        boolean z10 = tVar2.y() == 1;
        if (z10) {
            int iY2 = tVar2.y();
            byte[] bArr2 = new byte[16];
            tVar2.h(bArr2, 0, 16);
            if (iY2 == 0) {
                int iY3 = tVar2.y();
                byte[] bArr3 = new byte[iY3];
                tVar2.h(bArr3, 0, iY3);
                bArr = bArr3;
            } else {
                bArr = null;
            }
            nVar.f73480m = true;
            nVar.f73482o = new m(z10, str, iY2, bArr2, i10, i11, bArr);
        }
    }

    public final void I(long j10) throws ParserException {
        while (!this.f73394m.isEmpty() && this.f73394m.peek().f73343b == j10) {
            n(this.f73394m.pop());
        }
        f();
    }

    public final boolean J(q3.h hVar) throws InterruptedException, IOException {
        if (this.f73400s == 0) {
            if (!hVar.readFully(this.f73393l.f53154a, 0, 8, true)) {
                return false;
            }
            this.f73400s = 8;
            this.f73393l.L(0);
            this.f73399r = this.f73393l.A();
            this.f73398q = this.f73393l.j();
        }
        long j10 = this.f73399r;
        if (j10 == 1) {
            hVar.readFully(this.f73393l.f53154a, 8, 8);
            this.f73400s += 8;
            this.f73399r = this.f73393l.D();
        } else if (j10 == 0) {
            long length = hVar.getLength();
            if (length == -1 && !this.f73394m.isEmpty()) {
                length = this.f73394m.peek().f73343b;
            }
            if (length != -1) {
                this.f73399r = (length - hVar.getPosition()) + ((long) this.f73400s);
            }
        }
        if (this.f73399r < this.f73400s) {
            throw new ParserException("Atom size less than header length (unsupported).");
        }
        long position = hVar.getPosition() - ((long) this.f73400s);
        if (this.f73398q == 1836019558) {
            int size = this.f73385d.size();
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = this.f73385d.valueAt(i10).f73411b;
                nVar.f73469b = position;
                nVar.f73471d = position;
                nVar.f73470c = position;
            }
        }
        int i11 = this.f73398q;
        if (i11 == 1835295092) {
            this.f73407z = null;
            this.f73402u = this.f73399r + position;
            if (!this.H) {
                this.E.e(new s.b(this.f73405x, position));
                this.H = true;
            }
            this.f73397p = 2;
            return true;
        }
        if (N(i11)) {
            long position2 = (hVar.getPosition() + this.f73399r) - 8;
            this.f73394m.push(new w3.a.C0773a(this.f73398q, position2));
            if (this.f73399r == this.f73400s) {
                I(position2);
            } else {
                f();
            }
        } else if (O(this.f73398q)) {
            if (this.f73400s != 8) {
                throw new ParserException("Leaf atom defines extended atom size (unsupported).");
            }
            long j11 = this.f73399r;
            if (j11 > 2147483647L) {
                throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
            }
            t tVar = new t((int) j11);
            this.f73401t = tVar;
            System.arraycopy(this.f73393l.f53154a, 0, tVar.f53154a, 0, 8);
            this.f73397p = 1;
        } else {
            if (this.f73399r > 2147483647L) {
                throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f73401t = null;
            this.f73397p = 1;
        }
        return true;
    }

    public final void K(q3.h hVar) throws InterruptedException, IOException {
        int i10 = ((int) this.f73399r) - this.f73400s;
        t tVar = this.f73401t;
        if (tVar != null) {
            hVar.readFully(tVar.f53154a, 8, i10);
            p(new w3.a.b(this.f73398q, this.f73401t), hVar.getPosition());
        } else {
            hVar.skipFully(i10);
        }
        I(hVar.getPosition());
    }

    public final void L(q3.h hVar) throws InterruptedException, IOException {
        int size = this.f73385d.size();
        b bVarValueAt = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = this.f73385d.valueAt(i10).f73411b;
            if (nVar.f73485r) {
                long j11 = nVar.f73471d;
                if (j11 < j10) {
                    bVarValueAt = this.f73385d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f73397p = 3;
            return;
        }
        int position = (int) (j10 - hVar.getPosition());
        if (position < 0) {
            throw new ParserException("Offset to encryption data was negative.");
        }
        hVar.skipFully(position);
        bVarValueAt.f73411b.b(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean M(q3.h hVar) throws InterruptedException, IOException {
        int i10;
        u.a aVar;
        int iB;
        int i11 = 4;
        int i12 = 1;
        int i13 = 0;
        if (this.f73397p == 3) {
            if (this.f73407z == null) {
                b bVarI = i(this.f73385d);
                if (bVarI == null) {
                    int position = (int) (this.f73402u - hVar.getPosition());
                    if (position < 0) {
                        throw new ParserException("Offset to end of mdat was negative.");
                    }
                    hVar.skipFully(position);
                    f();
                    return false;
                }
                int position2 = (int) (bVarI.f73411b.f73474g[bVarI.f73417h] - hVar.getPosition());
                if (position2 < 0) {
                    g5.m.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    position2 = 0;
                }
                hVar.skipFully(position2);
                this.f73407z = bVarI;
            }
            b bVar = this.f73407z;
            int[] iArr = bVar.f73411b.f73476i;
            int i14 = bVar.f73415f;
            int i15 = iArr[i14];
            this.A = i15;
            if (i14 < bVar.f73418i) {
                hVar.skipFully(i15);
                this.f73407z.i();
                if (!this.f73407z.e()) {
                    this.f73407z = null;
                }
                this.f73397p = 3;
                return true;
            }
            if (bVar.f73413d.f73458g == 1) {
                this.A = i15 - 8;
                hVar.skipFully(8);
            }
            if ("audio/ac4".equals(this.f73407z.f73413d.f73457f.f18970j)) {
                this.B = this.f73407z.f(this.A, 7);
                m3.b.a(this.A, this.f73390i);
                this.f73407z.f73410a.c(this.f73390i, 7);
                this.B += 7;
            } else {
                this.B = this.f73407z.f(this.A, 0);
            }
            this.A += this.B;
            this.f73397p = 4;
            this.C = 0;
        }
        b bVar2 = this.f73407z;
        n nVar = bVar2.f73411b;
        l lVar = bVar2.f73413d;
        u uVar = bVar2.f73410a;
        int i16 = bVar2.f73415f;
        long jC = nVar.c(i16);
        g0 g0Var = this.f73391j;
        if (g0Var != null) {
            jC = g0Var.a(jC);
        }
        long j10 = jC;
        int i17 = lVar.f73461j;
        if (i17 == 0) {
            while (true) {
                int i18 = this.B;
                int i19 = this.A;
                if (i18 >= i19) {
                    break;
                }
                this.B += uVar.b(hVar, i19 - i18, false);
            }
        } else {
            byte[] bArr = this.f73387f.f53154a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i20 = i17 + 1;
            int i21 = 4 - i17;
            while (this.B < this.A) {
                int i22 = this.C;
                if (i22 == 0) {
                    hVar.readFully(bArr, i21, i20);
                    this.f73387f.L(i13);
                    int iJ = this.f73387f.j();
                    if (iJ < i12) {
                        throw new ParserException("Invalid NAL length");
                    }
                    this.C = iJ - 1;
                    this.f73386e.L(i13);
                    uVar.c(this.f73386e, i11);
                    uVar.c(this.f73387f, i12);
                    this.D = (this.G.length <= 0 || !q.g(lVar.f73457f.f18970j, bArr[i11])) ? i13 : i12;
                    this.B += 5;
                    this.A += i21;
                } else {
                    if (this.D) {
                        this.f73388g.H(i22);
                        hVar.readFully(this.f73388g.f53154a, i13, this.C);
                        uVar.c(this.f73388g, this.C);
                        iB = this.C;
                        t tVar = this.f73388g;
                        int iK = q.k(tVar.f53154a, tVar.d());
                        this.f73388g.L("video/hevc".equals(lVar.f73457f.f18970j) ? 1 : 0);
                        this.f73388g.K(iK);
                        u4.g.a(j10, this.f73388g, this.G);
                    } else {
                        iB = uVar.b(hVar, i22, i13);
                    }
                    this.B += iB;
                    this.C -= iB;
                    i11 = 4;
                    i12 = 1;
                    i13 = 0;
                }
            }
        }
        boolean z10 = nVar.f73479l[i16];
        m mVarC = this.f73407z.c();
        if (mVarC != null) {
            i10 = (z10 ? 1 : 0) | 1073741824;
            aVar = mVarC.f73465c;
        } else {
            i10 = z10 ? 1 : 0;
            aVar = null;
        }
        uVar.d(j10, i10, this.A, 0, aVar);
        s(j10);
        if (!this.f73407z.e()) {
            this.f73407z = null;
        }
        this.f73397p = 3;
        return true;
    }

    @Override // q3.g
    public int a(q3.h hVar, r rVar) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f73397p;
            if (i10 != 0) {
                if (i10 == 1) {
                    K(hVar);
                } else if (i10 == 2) {
                    L(hVar);
                } else if (M(hVar)) {
                    return 0;
                }
            } else if (!J(hVar)) {
                return -1;
            }
        }
    }

    @Override // q3.g
    public void c(q3.i iVar) {
        this.E = iVar;
        l lVar = this.f73383b;
        if (lVar != null) {
            b bVar = new b(iVar.track(0, lVar.f73453b));
            bVar.d(this.f73383b, new c(0, 0, 0, 0));
            this.f73385d.put(0, bVar);
            l();
            this.E.endTracks();
        }
    }

    public final void l() {
        int i10;
        if (this.F == null) {
            u[] uVarArr = new u[2];
            this.F = uVarArr;
            u uVar = this.f73396o;
            if (uVar != null) {
                uVarArr[0] = uVar;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((this.f73382a & 4) != 0) {
                uVarArr[i10] = this.E.track(this.f73385d.size(), 4);
                i10++;
            }
            u[] uVarArr2 = (u[]) Arrays.copyOf(this.F, i10);
            this.F = uVarArr2;
            for (u uVar2 : uVarArr2) {
                uVar2.a(K);
            }
        }
        if (this.G == null) {
            this.G = new u[this.f73384c.size()];
            for (int i11 = 0; i11 < this.G.length; i11++) {
                u uVarTrack = this.E.track(this.f73385d.size() + 1 + i11, 3);
                uVarTrack.a(this.f73384c.get(i11));
                this.G[i11] = uVarTrack;
            }
        }
    }

    public final void n(w3.a.C0773a c0773a) throws ParserException {
        int i10 = c0773a.f73342a;
        if (i10 == 1836019574) {
            r(c0773a);
        } else if (i10 == 1836019558) {
            q(c0773a);
        } else {
            if (this.f73394m.isEmpty()) {
                return;
            }
            this.f73394m.peek().d(c0773a);
        }
    }

    public final void o(t tVar) {
        long jY0;
        String str;
        long jY1;
        String str2;
        long jA;
        long jA2;
        u[] uVarArr = this.F;
        if (uVarArr == null || uVarArr.length == 0) {
            return;
        }
        tVar.L(8);
        int iC = w3.a.c(tVar.j());
        if (iC == 0) {
            String str3 = (String) g5.a.e(tVar.s());
            String str4 = (String) g5.a.e(tVar.s());
            long jA3 = tVar.A();
            jY0 = k0.y0(tVar.A(), 1000000L, jA3);
            long j10 = this.f73406y;
            long j11 = j10 != -9223372036854775807L ? j10 + jY0 : -9223372036854775807L;
            str = str3;
            jY1 = k0.y0(tVar.A(), 1000L, jA3);
            str2 = str4;
            jA = tVar.A();
            jA2 = j11;
        } else {
            if (iC != 1) {
                g5.m.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iC);
                return;
            }
            long jA4 = tVar.A();
            jA2 = k0.y0(tVar.D(), 1000000L, jA4);
            long jY2 = k0.y0(tVar.A(), 1000L, jA4);
            long jA5 = tVar.A();
            str = (String) g5.a.e(tVar.s());
            jY1 = jY2;
            jA = jA5;
            str2 = (String) g5.a.e(tVar.s());
            jY0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[tVar.a()];
        tVar.h(bArr, 0, tVar.a());
        t tVar2 = new t(this.f73392k.a(new EventMessage(str, str2, jY1, jA, bArr)));
        int iA = tVar2.a();
        for (u uVar : this.F) {
            tVar2.L(0);
            uVar.c(tVar2, iA);
        }
        if (jA2 == -9223372036854775807L) {
            this.f73395n.addLast(new a(jY0, iA));
            this.f73403v += iA;
            return;
        }
        g0 g0Var = this.f73391j;
        if (g0Var != null) {
            jA2 = g0Var.a(jA2);
        }
        for (u uVar2 : this.F) {
            uVar2.d(jA2, 1, iA, 0, null);
        }
    }

    public final void p(w3.a.b bVar, long j10) throws ParserException {
        if (!this.f73394m.isEmpty()) {
            this.f73394m.peek().e(bVar);
            return;
        }
        int i10 = bVar.f73342a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                o(bVar.f73346b);
            }
        } else {
            Pair<Long, q3.b> pairA = A(bVar.f73346b, j10);
            this.f73406y = ((Long) pairA.first).longValue();
            this.E.e((s) pairA.second);
            this.H = true;
        }
    }

    public final void q(w3.a.C0773a c0773a) throws ParserException {
        u(c0773a, this.f73385d, this.f73382a, this.f73389h);
        DrmInitData drmInitDataH = h(c0773a.f73344c);
        if (drmInitDataH != null) {
            int size = this.f73385d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f73385d.valueAt(i10).j(drmInitDataH);
            }
        }
        if (this.f73404w != -9223372036854775807L) {
            int size2 = this.f73385d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f73385d.valueAt(i11).h(this.f73404w);
            }
            this.f73404w = -9223372036854775807L;
        }
    }

    public final void r(w3.a.C0773a c0773a) throws ParserException {
        int i10;
        int i11;
        int i12 = 0;
        g5.a.g(this.f73383b == null, "Unexpected moov box.");
        DrmInitData drmInitDataH = h(c0773a.f73344c);
        w3.a.C0773a c0773aF = c0773a.f(1836475768);
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0773aF.f73344c.size();
        long jT = -9223372036854775807L;
        for (int i13 = 0; i13 < size; i13++) {
            w3.a.b bVar = c0773aF.f73344c.get(i13);
            int i14 = bVar.f73342a;
            if (i14 == 1953654136) {
                Pair<Integer, c> pairE = E(bVar.f73346b);
                sparseArray.put(((Integer) pairE.first).intValue(), (c) pairE.second);
            } else if (i14 == 1835362404) {
                jT = t(bVar.f73346b);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c0773a.f73345d.size();
        int i15 = 0;
        while (i15 < size2) {
            w3.a.C0773a c0773a2 = c0773a.f73345d.get(i15);
            if (c0773a2.f73342a == 1953653099) {
                i10 = i15;
                i11 = size2;
                l lVarM = m(w3.b.v(c0773a2, c0773a.g(1836476516), jT, drmInitDataH, (this.f73382a & 16) != 0, false));
                if (lVarM != null) {
                    sparseArray2.put(lVarM.f73452a, lVarM);
                }
            } else {
                i10 = i15;
                i11 = size2;
            }
            i15 = i10 + 1;
            size2 = i11;
        }
        int size3 = sparseArray2.size();
        if (this.f73385d.size() != 0) {
            g5.a.f(this.f73385d.size() == size3);
            while (i12 < size3) {
                l lVar = (l) sparseArray2.valueAt(i12);
                this.f73385d.get(lVar.f73452a).d(lVar, g(sparseArray, lVar.f73452a));
                i12++;
            }
            return;
        }
        while (i12 < size3) {
            l lVar2 = (l) sparseArray2.valueAt(i12);
            b bVar2 = new b(this.E.track(i12, lVar2.f73453b));
            bVar2.d(lVar2, g(sparseArray, lVar2.f73452a));
            this.f73385d.put(lVar2.f73452a, bVar2);
            this.f73405x = Math.max(this.f73405x, lVar2.f73456e);
            i12++;
        }
        l();
        this.E.endTracks();
    }

    public final void s(long j10) {
        while (!this.f73395n.isEmpty()) {
            a aVarRemoveFirst = this.f73395n.removeFirst();
            this.f73403v -= aVarRemoveFirst.f73409b;
            long jA = aVarRemoveFirst.f73408a + j10;
            g0 g0Var = this.f73391j;
            if (g0Var != null) {
                jA = g0Var.a(jA);
            }
            for (u uVar : this.F) {
                uVar.d(jA, 1, aVarRemoveFirst.f73409b, this.f73403v, null);
            }
        }
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        int size = this.f73385d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f73385d.valueAt(i10).g();
        }
        this.f73395n.clear();
        this.f73403v = 0;
        this.f73404w = j11;
        this.f73394m.clear();
        f();
    }

    public f(int i10, @Nullable g0 g0Var) {
        this(i10, g0Var, null, Collections.emptyList());
    }

    public static void D(w3.a.C0773a c0773a, SparseArray<b> sparseArray, int i10, byte[] bArr) throws ParserException {
        String str;
        b bVarC = C(c0773a.g(1952868452).f73346b, sparseArray);
        if (bVarC == null) {
            return;
        }
        n nVar = bVarC.f73411b;
        long jB = nVar.f73486s;
        bVarC.g();
        if (c0773a.g(1952867444) != null && (i10 & 2) == 0) {
            jB = B(c0773a.g(1952867444).f73346b);
        }
        G(c0773a, bVarC, jB, i10);
        m mVarA = bVarC.f73413d.a(nVar.f73468a.f73372a);
        w3.a.b bVarG = c0773a.g(1935763834);
        if (bVarG != null) {
            w(mVarA, bVarG.f73346b, nVar);
        }
        w3.a.b bVarG2 = c0773a.g(1935763823);
        if (bVarG2 != null) {
            v(bVarG2.f73346b, nVar);
        }
        w3.a.b bVarG3 = c0773a.g(1936027235);
        if (bVarG3 != null) {
            y(bVarG3.f73346b, nVar);
        }
        w3.a.b bVarG4 = c0773a.g(1935828848);
        w3.a.b bVarG5 = c0773a.g(1936158820);
        if (bVarG4 != null && bVarG5 != null) {
            t tVar = bVarG4.f73346b;
            t tVar2 = bVarG5.f73346b;
            if (mVarA != null) {
                str = mVarA.f73464b;
            } else {
                str = null;
            }
            z(tVar, tVar2, str, nVar);
        }
        int size = c0773a.f73344c.size();
        for (int i11 = 0; i11 < size; i11++) {
            w3.a.b bVar = c0773a.f73344c.get(i11);
            if (bVar.f73342a == 1970628964) {
                H(bVar.f73346b, nVar, bArr);
            }
        }
    }

    @Nullable
    public static DrmInitData h(List<w3.a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            w3.a.b bVar = list.get(i10);
            if (bVar.f73342a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f73346b.f53154a;
                UUID uuidD = j.d(bArr);
                if (uuidD == null) {
                    g5.m.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidD, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    public static b i(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVarValueAt = sparseArray.valueAt(i10);
            int i11 = bVarValueAt.f73417h;
            n nVar = bVarValueAt.f73411b;
            if (i11 != nVar.f73472e) {
                long j11 = nVar.f73474g[i11];
                if (j11 < j10) {
                    bVar = bVarValueAt;
                    j10 = j11;
                }
            }
        }
        return bVar;
    }

    @Nullable
    public static b j(SparseArray<b> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i10);
    }

    @Override // q3.g
    public boolean b(q3.h hVar) throws InterruptedException, IOException {
        return k.b(hVar);
    }

    public final c g(SparseArray<c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (c) g5.a.e(sparseArray.get(i10));
    }

    public f(int i10, @Nullable g0 g0Var, @Nullable l lVar) {
        this(i10, g0Var, lVar, Collections.emptyList());
    }

    public f(int i10, @Nullable g0 g0Var, @Nullable l lVar, List<Format> list) {
        this(i10, g0Var, lVar, list, null);
    }

    public f(int i10, @Nullable g0 g0Var, @Nullable l lVar, List<Format> list, @Nullable u uVar) {
        this.f73382a = i10 | (lVar != null ? 8 : 0);
        this.f73391j = g0Var;
        this.f73383b = lVar;
        this.f73384c = Collections.unmodifiableList(list);
        this.f73396o = uVar;
        this.f73392k = new d4.b();
        this.f73393l = new t(16);
        this.f73386e = new t(q.f53130a);
        this.f73387f = new t(5);
        this.f73388g = new t();
        byte[] bArr = new byte[16];
        this.f73389h = bArr;
        this.f73390i = new t(bArr);
        this.f73394m = new ArrayDeque<>();
        this.f73395n = new ArrayDeque<>();
        this.f73385d = new SparseArray<>();
        this.f73405x = -9223372036854775807L;
        this.f73404w = -9223372036854775807L;
        this.f73406y = -9223372036854775807L;
        f();
    }
}
