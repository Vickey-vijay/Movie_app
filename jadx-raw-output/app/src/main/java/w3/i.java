package w3;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import g5.q;
import g5.t;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import q3.r;
import q3.s;
import q3.u;

/* JADX INFO: compiled from: Mp4Extractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i implements q3.g, s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q3.k f73422v = new q3.k() { // from class: w3.h
        @Override // q3.k
        public final q3.g[] createExtractors() {
            return i.j();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f73424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f73425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f73426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f73427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<w3.a.C0773a> f73428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f73429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f73430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f73431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f73432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f73433k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f73434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f73435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f73436n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f73437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q3.i f73438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a[] f73439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long[][] f73440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f73441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f73442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f73443u;

    public i() {
        this(0);
    }

    public static long[][] e(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f73445b.f73488b];
            jArr2[i10] = aVarArr[i10].f73445b.f73492f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            o oVar = aVarArr[i12].f73445b;
            j10 += (long) oVar.f73490d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = oVar.f73492f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    public static /* synthetic */ q3.g[] j() {
        return new q3.g[]{new i()};
    }

    public static boolean s(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    public static boolean t(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    public final void f() {
        this.f73429g = 0;
        this.f73432j = 0;
    }

    @Override // q3.s
    public boolean isSeekable() {
        return true;
    }

    @Override // q3.g
    public void release() {
    }

    /* JADX INFO: compiled from: Mp4Extractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f73444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f73445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f73446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f73447d;

        public a(l lVar, o oVar, u uVar) {
            this.f73444a = lVar;
            this.f73445b = oVar;
            this.f73446c = uVar;
        }
    }

    public i(int i10) {
        this.f73423a = i10;
        this.f73427e = new t(16);
        this.f73428f = new ArrayDeque<>();
        this.f73424b = new t(q.f53130a);
        this.f73425c = new t(4);
        this.f73426d = new t();
        this.f73434l = -1;
    }

    public static boolean n(t tVar) {
        tVar.L(8);
        if (tVar.j() == 1903435808) {
            return true;
        }
        tVar.M(4);
        while (tVar.a() > 0) {
            if (tVar.j() == 1903435808) {
                return true;
            }
        }
        return false;
    }

    @Override // q3.g
    public int a(q3.h hVar, r rVar) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f73429g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return r(hVar, rVar);
                    }
                    throw new IllegalStateException();
                }
                if (q(hVar, rVar)) {
                    return 1;
                }
            } else if (!p(hVar)) {
                return -1;
            }
        }
    }

    @Override // q3.g
    public void c(q3.i iVar) {
        this.f73438p = iVar;
    }

    @Override // q3.s
    public long getDurationUs() {
        return this.f73442t;
    }

    @Override // q3.s
    public s.a getSeekPoints(long j10) {
        long j11;
        long jK;
        long j12;
        long j13;
        int iB;
        a[] aVarArr = this.f73439q;
        if (aVarArr.length == 0) {
            return new s.a(q3.t.f66482c);
        }
        int i10 = this.f73441s;
        if (i10 != -1) {
            o oVar = aVarArr[i10].f73445b;
            int iG = g(oVar, j10);
            if (iG == -1) {
                return new s.a(q3.t.f66482c);
            }
            long j14 = oVar.f73492f[iG];
            j11 = oVar.f73489c[iG];
            if (j14 >= j10 || iG >= oVar.f73488b - 1 || (iB = oVar.b(j10)) == -1 || iB == iG) {
                j13 = -1;
                j12 = -9223372036854775807L;
            } else {
                j12 = oVar.f73492f[iB];
                j13 = oVar.f73489c[iB];
            }
            jK = j13;
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            jK = -1;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr2 = this.f73439q;
            if (i11 >= aVarArr2.length) {
                break;
            }
            if (i11 != this.f73441s) {
                o oVar2 = aVarArr2[i11].f73445b;
                long jK2 = k(oVar2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    jK = k(oVar2, j12, jK);
                }
                j11 = jK2;
            }
            i11++;
        }
        q3.t tVar = new q3.t(j10, j11);
        return j12 == -9223372036854775807L ? new s.a(tVar) : new s.a(tVar, new q3.t(j12, jK));
    }

    public final int h(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f73439q;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f73447d;
            o oVar = aVar.f73445b;
            if (i13 != oVar.f73488b) {
                long j14 = oVar.f73489c[i13];
                long j15 = this.f73440r[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    public final ArrayList<o> i(w3.a.C0773a c0773a, q3.o oVar, boolean z10) throws ParserException {
        l lVarV;
        ArrayList<o> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < c0773a.f73345d.size(); i10++) {
            w3.a.C0773a c0773a2 = c0773a.f73345d.get(i10);
            if (c0773a2.f73342a == 1953653099 && (lVarV = b.v(c0773a2, c0773a.g(1836476516), -9223372036854775807L, null, z10, this.f73443u)) != null) {
                o oVarR = b.r(lVarV, c0773a2.f(1835297121).f(1835626086).f(1937007212), oVar);
                if (oVarR.f73488b != 0) {
                    arrayList.add(oVarR);
                }
            }
        }
        return arrayList;
    }

    public final void l(q3.h hVar) throws InterruptedException, IOException {
        this.f73426d.H(8);
        hVar.peekFully(this.f73426d.f53154a, 0, 8);
        this.f73426d.M(4);
        if (this.f73426d.j() == 1751411826) {
            hVar.resetPeekPosition();
        } else {
            hVar.skipFully(4);
        }
    }

    public final void m(long j10) throws ParserException {
        while (!this.f73428f.isEmpty() && this.f73428f.peek().f73343b == j10) {
            w3.a.C0773a c0773aPop = this.f73428f.pop();
            if (c0773aPop.f73342a == 1836019574) {
                o(c0773aPop);
                this.f73428f.clear();
                this.f73429g = 2;
            } else if (!this.f73428f.isEmpty()) {
                this.f73428f.peek().d(c0773aPop);
            }
        }
        if (this.f73429g != 2) {
            f();
        }
    }

    public final void o(w3.a.C0773a c0773a) throws ParserException {
        Metadata metadataW;
        o oVar;
        long j10;
        ArrayList arrayList = new ArrayList();
        q3.o oVar2 = new q3.o();
        w3.a.b bVarG = c0773a.g(1969517665);
        if (bVarG != null) {
            metadataW = b.w(bVarG, this.f73443u);
            if (metadataW != null) {
                oVar2.c(metadataW);
            }
        } else {
            metadataW = null;
        }
        w3.a.C0773a c0773aF = c0773a.f(1835365473);
        Metadata metadataL = c0773aF != null ? b.l(c0773aF) : null;
        ArrayList<o> arrayListI = i(c0773a, oVar2, (this.f73423a & 1) != 0);
        int size = arrayListI.size();
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        int i10 = 0;
        int size2 = -1;
        while (i10 < size) {
            o oVar3 = arrayListI.get(i10);
            l lVar = oVar3.f73487a;
            long j13 = lVar.f73456e;
            if (j13 != j11) {
                j10 = j13;
                oVar = oVar3;
            } else {
                oVar = oVar3;
                j10 = oVar.f73494h;
            }
            long jMax = Math.max(j12, j10);
            ArrayList<o> arrayList2 = arrayListI;
            int i11 = size;
            a aVar = new a(lVar, oVar, this.f73438p.track(i10, lVar.f73453b));
            Format formatJ = lVar.f73457f.j(oVar.f73491e + 30);
            if (lVar.f73453b == 2 && j10 > 0) {
                int i12 = oVar.f73488b;
                if (i12 > 1) {
                    formatJ = formatJ.f(i12 / (j10 / 1000000.0f));
                }
            }
            aVar.f73446c.a(g.a(lVar.f73453b, formatJ, metadataW, metadataL, oVar2));
            if (lVar.f73453b == 2 && size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(aVar);
            i10++;
            arrayListI = arrayList2;
            size = i11;
            j12 = jMax;
            j11 = -9223372036854775807L;
        }
        this.f73441s = size2;
        this.f73442t = j12;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f73439q = aVarArr;
        this.f73440r = e(aVarArr);
        this.f73438p.endTracks();
        this.f73438p.e(this);
    }

    public final boolean p(q3.h hVar) throws InterruptedException, IOException {
        if (this.f73432j == 0) {
            if (!hVar.readFully(this.f73427e.f53154a, 0, 8, true)) {
                return false;
            }
            this.f73432j = 8;
            this.f73427e.L(0);
            this.f73431i = this.f73427e.A();
            this.f73430h = this.f73427e.j();
        }
        long j10 = this.f73431i;
        if (j10 == 1) {
            hVar.readFully(this.f73427e.f53154a, 8, 8);
            this.f73432j += 8;
            this.f73431i = this.f73427e.D();
        } else if (j10 == 0) {
            long length = hVar.getLength();
            if (length == -1 && !this.f73428f.isEmpty()) {
                length = this.f73428f.peek().f73343b;
            }
            if (length != -1) {
                this.f73431i = (length - hVar.getPosition()) + ((long) this.f73432j);
            }
        }
        if (this.f73431i < this.f73432j) {
            throw new ParserException("Atom size less than header length (unsupported).");
        }
        if (s(this.f73430h)) {
            long position = hVar.getPosition();
            long j11 = this.f73431i;
            int i10 = this.f73432j;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f73430h == 1835365473) {
                l(hVar);
            }
            this.f73428f.push(new w3.a.C0773a(this.f73430h, j12));
            if (this.f73431i == this.f73432j) {
                m(j12);
            } else {
                f();
            }
        } else if (t(this.f73430h)) {
            g5.a.f(this.f73432j == 8);
            g5.a.f(this.f73431i <= 2147483647L);
            t tVar = new t((int) this.f73431i);
            this.f73433k = tVar;
            System.arraycopy(this.f73427e.f53154a, 0, tVar.f53154a, 0, 8);
            this.f73429g = 1;
        } else {
            this.f73433k = null;
            this.f73429g = 1;
        }
        return true;
    }

    public final boolean q(q3.h hVar, r rVar) throws InterruptedException, IOException {
        boolean z10;
        long j10 = this.f73431i - ((long) this.f73432j);
        long position = hVar.getPosition() + j10;
        t tVar = this.f73433k;
        if (tVar == null) {
            if (j10 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                hVar.skipFully((int) j10);
            } else {
                rVar.f66477a = hVar.getPosition() + j10;
                z10 = true;
            }
            m(position);
            return (z10 || this.f73429g == 2) ? false : true;
        }
        hVar.readFully(tVar.f53154a, this.f73432j, (int) j10);
        if (this.f73430h == 1718909296) {
            this.f73443u = n(this.f73433k);
        } else if (!this.f73428f.isEmpty()) {
            this.f73428f.peek().e(new w3.a.b(this.f73430h, this.f73433k));
        }
        z10 = false;
        m(position);
        if (z10) {
        }
    }

    public final int r(q3.h hVar, r rVar) throws InterruptedException, IOException {
        long position = hVar.getPosition();
        if (this.f73434l == -1) {
            int iH = h(position);
            this.f73434l = iH;
            if (iH == -1) {
                return -1;
            }
        }
        a aVar = this.f73439q[this.f73434l];
        u uVar = aVar.f73446c;
        int i10 = aVar.f73447d;
        o oVar = aVar.f73445b;
        long j10 = oVar.f73489c[i10];
        int i11 = oVar.f73490d[i10];
        long j11 = (j10 - position) + ((long) this.f73435m);
        if (j11 < 0 || j11 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            rVar.f66477a = j10;
            return 1;
        }
        if (aVar.f73444a.f73458g == 1) {
            j11 += 8;
            i11 -= 8;
        }
        hVar.skipFully((int) j11);
        l lVar = aVar.f73444a;
        int i12 = lVar.f73461j;
        if (i12 == 0) {
            if ("audio/ac4".equals(lVar.f73457f.f18970j)) {
                if (this.f73436n == 0) {
                    m3.b.a(i11, this.f73426d);
                    uVar.c(this.f73426d, 7);
                    this.f73436n += 7;
                }
                i11 += 7;
            }
            while (true) {
                int i13 = this.f73436n;
                if (i13 >= i11) {
                    break;
                }
                int iB = uVar.b(hVar, i11 - i13, false);
                this.f73435m += iB;
                this.f73436n += iB;
                this.f73437o -= iB;
            }
        } else {
            byte[] bArr = this.f73425c.f53154a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i14 = 4 - i12;
            while (this.f73436n < i11) {
                int i15 = this.f73437o;
                if (i15 == 0) {
                    hVar.readFully(bArr, i14, i12);
                    this.f73435m += i12;
                    this.f73425c.L(0);
                    int iJ = this.f73425c.j();
                    if (iJ < 0) {
                        throw new ParserException("Invalid NAL length");
                    }
                    this.f73437o = iJ;
                    this.f73424b.L(0);
                    uVar.c(this.f73424b, 4);
                    this.f73436n += 4;
                    i11 += i14;
                } else {
                    int iB2 = uVar.b(hVar, i15, false);
                    this.f73435m += iB2;
                    this.f73436n += iB2;
                    this.f73437o -= iB2;
                }
            }
        }
        o oVar2 = aVar.f73445b;
        uVar.d(oVar2.f73492f[i10], oVar2.f73493g[i10], i11, 0, null);
        aVar.f73447d++;
        this.f73434l = -1;
        this.f73435m = 0;
        this.f73436n = 0;
        this.f73437o = 0;
        return 0;
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        this.f73428f.clear();
        this.f73432j = 0;
        this.f73434l = -1;
        this.f73435m = 0;
        this.f73436n = 0;
        this.f73437o = 0;
        if (j10 == 0) {
            f();
        } else if (this.f73439q != null) {
            u(j11);
        }
    }

    public final void u(long j10) {
        for (a aVar : this.f73439q) {
            o oVar = aVar.f73445b;
            int iA = oVar.a(j10);
            if (iA == -1) {
                iA = oVar.b(j10);
            }
            aVar.f73447d = iA;
        }
    }

    public static int g(o oVar, long j10) {
        int iA = oVar.a(j10);
        if (iA == -1) {
            return oVar.b(j10);
        }
        return iA;
    }

    public static long k(o oVar, long j10, long j11) {
        int iG = g(oVar, j10);
        if (iG == -1) {
            return j11;
        }
        return Math.min(oVar.f73489c[iG], j11);
    }

    @Override // q3.g
    public boolean b(q3.h hVar) throws InterruptedException, IOException {
        return k.d(hVar);
    }
}
