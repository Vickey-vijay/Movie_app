package t3;

import g5.t;
import java.io.IOException;
import q3.g;
import q3.h;
import q3.i;
import q3.k;
import q3.r;
import q3.s;

/* JADX INFO: compiled from: FlvExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f72194q = new k() { // from class: t3.a
        @Override // q3.k
        public final g[] createExtractors() {
            return b.g();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f72200f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f72202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f72203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f72204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f72205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f72206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f72207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f72208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.flv.a f72209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.flv.b f72210p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f72195a = new t(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f72196b = new t(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f72197c = new t(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f72198d = new t();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f72199e = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f72201g = 1;

    public static /* synthetic */ g[] g() {
        return new g[]{new b()};
    }

    @Override // q3.g
    public void release() {
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        this.f72201g = 1;
        this.f72202h = false;
        this.f72204j = 0;
    }

    @Override // q3.g
    public int a(h hVar, r rVar) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f72201g;
            if (i10 != 1) {
                if (i10 == 2) {
                    l(hVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (j(hVar)) {
                        return 0;
                    }
                } else if (!k(hVar)) {
                    return -1;
                }
            } else if (!i(hVar)) {
                return -1;
            }
        }
    }

    @Override // q3.g
    public boolean b(h hVar) throws InterruptedException, IOException {
        hVar.peekFully(this.f72195a.f53154a, 0, 3);
        this.f72195a.L(0);
        if (this.f72195a.B() != 4607062) {
            return false;
        }
        hVar.peekFully(this.f72195a.f53154a, 0, 2);
        this.f72195a.L(0);
        if ((this.f72195a.E() & 250) != 0) {
            return false;
        }
        hVar.peekFully(this.f72195a.f53154a, 0, 4);
        this.f72195a.L(0);
        int iJ = this.f72195a.j();
        hVar.resetPeekPosition();
        hVar.advancePeekPosition(iJ);
        hVar.peekFully(this.f72195a.f53154a, 0, 4);
        this.f72195a.L(0);
        return this.f72195a.j() == 0;
    }

    @Override // q3.g
    public void c(i iVar) {
        this.f72200f = iVar;
    }

    public final void e() {
        if (this.f72208n) {
            return;
        }
        this.f72200f.e(new s.b(-9223372036854775807L));
        this.f72208n = true;
    }

    public final long f() {
        if (this.f72202h) {
            return this.f72203i + this.f72207m;
        }
        if (this.f72199e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f72207m;
    }

    public final t h(h hVar) throws InterruptedException, IOException {
        if (this.f72206l > this.f72198d.b()) {
            t tVar = this.f72198d;
            tVar.J(new byte[Math.max(tVar.b() * 2, this.f72206l)], 0);
        } else {
            this.f72198d.L(0);
        }
        this.f72198d.K(this.f72206l);
        hVar.readFully(this.f72198d.f53154a, 0, this.f72206l);
        return this.f72198d;
    }

    public final boolean i(h hVar) throws InterruptedException, IOException {
        if (!hVar.readFully(this.f72196b.f53154a, 0, 9, true)) {
            return false;
        }
        this.f72196b.L(0);
        this.f72196b.M(4);
        int iY = this.f72196b.y();
        boolean z10 = (iY & 4) != 0;
        boolean z11 = (iY & 1) != 0;
        if (z10 && this.f72209o == null) {
            this.f72209o = new com.google.android.exoplayer2.extractor.flv.a(this.f72200f.track(8, 1));
        }
        if (z11 && this.f72210p == null) {
            this.f72210p = new com.google.android.exoplayer2.extractor.flv.b(this.f72200f.track(9, 2));
        }
        this.f72200f.endTracks();
        this.f72204j = (this.f72196b.j() - 9) + 4;
        this.f72201g = 2;
        return true;
    }

    public final boolean k(h hVar) throws InterruptedException, IOException {
        if (!hVar.readFully(this.f72197c.f53154a, 0, 11, true)) {
            return false;
        }
        this.f72197c.L(0);
        this.f72205k = this.f72197c.y();
        this.f72206l = this.f72197c.B();
        this.f72207m = this.f72197c.B();
        this.f72207m = (((long) (this.f72197c.y() << 24)) | this.f72207m) * 1000;
        this.f72197c.M(3);
        this.f72201g = 4;
        return true;
    }

    public final void l(h hVar) throws InterruptedException, IOException {
        hVar.skipFully(this.f72204j);
        this.f72204j = 0;
        this.f72201g = 3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    public final boolean j(h hVar) throws InterruptedException, IOException {
        boolean z10;
        long j10;
        long jF = f();
        int i10 = this.f72205k;
        boolean zA = false;
        if (i10 == 8 && this.f72209o != null) {
            e();
            zA = this.f72209o.a(h(hVar), jF);
        } else if (i10 == 9 && this.f72210p != null) {
            e();
            zA = this.f72210p.a(h(hVar), jF);
        } else {
            if (i10 == 18 && !this.f72208n) {
                zA = this.f72199e.a(h(hVar), jF);
                long jD = this.f72199e.d();
                if (jD != -9223372036854775807L) {
                    this.f72200f.e(new s.b(jD));
                    this.f72208n = true;
                }
            } else {
                hVar.skipFully(this.f72206l);
                z10 = false;
            }
            if (!this.f72202h && zA) {
                this.f72202h = true;
                if (this.f72199e.d() == -9223372036854775807L) {
                    j10 = -this.f72207m;
                } else {
                    j10 = 0;
                }
                this.f72203i = j10;
            }
            this.f72204j = 4;
            this.f72201g = 2;
            return z10;
        }
        z10 = true;
        if (!this.f72202h) {
            this.f72202h = true;
            if (this.f72199e.d() == -9223372036854775807L) {
                j10 = -this.f72207m;
            } else {
                j10 = 0;
            }
            this.f72203i = j10;
        }
        this.f72204j = 4;
        this.f72201g = 2;
        return z10;
    }
}
