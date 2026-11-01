package s3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import g5.j;
import g5.k0;
import g5.t;
import java.io.IOException;
import q3.g;
import q3.h;
import q3.i;
import q3.k;
import q3.l;
import q3.m;
import q3.n;
import q3.r;
import q3.s;
import q3.u;

/* JADX INFO: compiled from: FlacExtractor.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k f67009o = new k() { // from class: s3.c
        @Override // q3.k
        public final g[] createExtractors() {
            return d.i();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f67010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f67011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l.a f67013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f67014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f67015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f67016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Metadata f67017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f67018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f67019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f67020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f67021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f67022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f67023n;

    public d() {
        this(0);
    }

    public static /* synthetic */ g[] i() {
        return new g[]{new d()};
    }

    @Override // q3.g
    public boolean b(h hVar) throws InterruptedException, IOException {
        m.c(hVar, false);
        return m.a(hVar);
    }

    @Override // q3.g
    public void release() {
    }

    public d(int i10) {
        this.f67010a = new byte[42];
        this.f67011b = new t(new byte[32768], 0);
        this.f67012c = (i10 & 1) != 0;
        this.f67013d = new l.a();
        this.f67016g = 0;
    }

    @Override // q3.g
    public int a(h hVar, r rVar) throws InterruptedException, IOException {
        int i10 = this.f67016g;
        if (i10 == 0) {
            l(hVar);
            return 0;
        }
        if (i10 == 1) {
            h(hVar);
            return 0;
        }
        if (i10 == 2) {
            n(hVar);
            return 0;
        }
        if (i10 == 3) {
            m(hVar);
            return 0;
        }
        if (i10 == 4) {
            f(hVar);
            return 0;
        }
        if (i10 == 5) {
            return k(hVar, rVar);
        }
        throw new IllegalStateException();
    }

    @Override // q3.g
    public void c(i iVar) {
        this.f67014e = iVar;
        this.f67015f = iVar.track(0, 1);
        iVar.endTracks();
    }

    public final long e(t tVar, boolean z10) {
        boolean zD;
        g5.a.e(this.f67018i);
        int iC = tVar.c();
        while (iC <= tVar.d() - 16) {
            tVar.L(iC);
            if (l.d(tVar, this.f67018i, this.f67020k, this.f67013d)) {
                tVar.L(iC);
                return this.f67013d.f66455a;
            }
            iC++;
        }
        if (!z10) {
            tVar.L(iC);
            return -1L;
        }
        while (iC <= tVar.d() - this.f67019j) {
            tVar.L(iC);
            try {
                zD = l.d(tVar, this.f67018i, this.f67020k, this.f67013d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (tVar.c() <= tVar.d() ? zD : false) {
                tVar.L(iC);
                return this.f67013d.f66455a;
            }
            iC++;
        }
        tVar.L(tVar.d());
        return -1L;
    }

    public final s g(long j10, long j11) {
        g5.a.e(this.f67018i);
        j jVar = this.f67018i;
        if (jVar.f53103k != null) {
            return new n(jVar, j10);
        }
        if (j11 == -1 || jVar.f53102j <= 0) {
            return new s.b(jVar.h());
        }
        b bVar = new b(jVar, this.f67020k, j10, j11);
        this.f67021l = bVar;
        return bVar.b();
    }

    public final void h(h hVar) throws InterruptedException, IOException {
        byte[] bArr = this.f67010a;
        hVar.peekFully(bArr, 0, bArr.length);
        hVar.resetPeekPosition();
        this.f67016g = 2;
    }

    public final void j() {
        ((u) k0.i(this.f67015f)).d((this.f67023n * 1000000) / ((long) ((j) k0.i(this.f67018i)).f53097e), 1, this.f67022m, 0, null);
    }

    public final int k(h hVar, r rVar) throws InterruptedException, IOException {
        boolean z10;
        g5.a.e(this.f67015f);
        g5.a.e(this.f67018i);
        b bVar = this.f67021l;
        if (bVar != null && bVar.d()) {
            return this.f67021l.c(hVar, rVar);
        }
        if (this.f67023n == -1) {
            this.f67023n = l.i(hVar, this.f67018i);
            return 0;
        }
        int iD = this.f67011b.d();
        if (iD < 32768) {
            int i10 = hVar.read(this.f67011b.f53154a, iD, 32768 - iD);
            z10 = i10 == -1;
            if (!z10) {
                this.f67011b.K(iD + i10);
            } else if (this.f67011b.a() == 0) {
                j();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iC = this.f67011b.c();
        int i11 = this.f67022m;
        int i12 = this.f67019j;
        if (i11 < i12) {
            t tVar = this.f67011b;
            tVar.M(Math.min(i12 - i11, tVar.a()));
        }
        long jE = e(this.f67011b, z10);
        int iC2 = this.f67011b.c() - iC;
        this.f67011b.L(iC);
        this.f67015f.c(this.f67011b, iC2);
        this.f67022m += iC2;
        if (jE != -1) {
            j();
            this.f67022m = 0;
            this.f67023n = jE;
        }
        if (this.f67011b.a() < 16) {
            t tVar2 = this.f67011b;
            byte[] bArr = tVar2.f53154a;
            int iC3 = tVar2.c();
            t tVar3 = this.f67011b;
            System.arraycopy(bArr, iC3, tVar3.f53154a, 0, tVar3.a());
            t tVar4 = this.f67011b;
            tVar4.H(tVar4.a());
        }
        return 0;
    }

    public final void l(h hVar) throws InterruptedException, IOException {
        this.f67017h = m.d(hVar, !this.f67012c);
        this.f67016g = 1;
    }

    public final void m(h hVar) throws InterruptedException, IOException {
        m.a aVar = new m.a(this.f67018i);
        boolean zE = false;
        while (!zE) {
            zE = m.e(hVar, aVar);
            this.f67018i = (j) k0.i(aVar.f66456a);
        }
        g5.a.e(this.f67018i);
        this.f67019j = Math.max(this.f67018i.f53095c, 6);
        ((u) k0.i(this.f67015f)).a(this.f67018i.i(this.f67010a, this.f67017h));
        this.f67016g = 4;
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f67016g = 0;
        } else {
            b bVar = this.f67021l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f67023n = j11 != 0 ? -1L : 0L;
        this.f67022m = 0;
        this.f67011b.G();
    }

    public final void f(h hVar) throws InterruptedException, IOException {
        this.f67020k = m.b(hVar);
        ((i) k0.i(this.f67014e)).e(g(hVar.getPosition(), hVar.getLength()));
        this.f67016g = 5;
    }

    public final void n(h hVar) throws InterruptedException, IOException {
        m.j(hVar);
        this.f67016g = 3;
    }
}
