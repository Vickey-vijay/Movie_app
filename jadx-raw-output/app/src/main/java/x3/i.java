package x3;

import com.google.android.exoplayer2.Format;
import g5.t;
import java.io.IOException;
import q3.r;
import q3.s;
import q3.u;

/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f74313a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f74314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q3.i f74315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f74316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f74317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f74318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f74319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f74320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f74321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f74322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f74323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f74324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f74325m;

    /* JADX INFO: compiled from: StreamReader.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Format f74326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f74327b;
    }

    /* JADX INFO: compiled from: StreamReader.java */
    public static final class c implements g {
        public c() {
        }

        @Override // x3.g
        public long a(q3.h hVar) {
            return -1L;
        }

        @Override // x3.g
        public void startSeek(long j10) {
        }

        @Override // x3.g
        public s createSeekMap() {
            return new s.b(-9223372036854775807L);
        }
    }

    public abstract long e(t tVar);

    public abstract boolean h(t tVar, long j10, b bVar) throws InterruptedException, IOException;

    public long b(long j10) {
        return (((long) this.f74321i) * j10) / 1000000;
    }

    public void c(q3.i iVar, u uVar) {
        this.f74315c = iVar;
        this.f74314b = uVar;
        j(true);
    }

    public void d(long j10) {
        this.f74319g = j10;
    }

    public final int f(q3.h hVar, r rVar) throws InterruptedException, IOException {
        int i10 = this.f74320h;
        if (i10 == 0) {
            return g(hVar);
        }
        if (i10 != 1) {
            if (i10 == 2) {
                return i(hVar, rVar);
            }
            throw new IllegalStateException();
        }
        hVar.skipFully((int) this.f74318f);
        this.f74320h = 2;
        return 0;
    }

    public final int g(q3.h hVar) throws InterruptedException, IOException {
        boolean zH = true;
        while (zH) {
            if (!this.f74313a.d(hVar)) {
                this.f74320h = 3;
                return -1;
            }
            this.f74323k = hVar.getPosition() - this.f74318f;
            zH = h(this.f74313a.c(), this.f74318f, this.f74322j);
            if (zH) {
                this.f74318f = hVar.getPosition();
            }
        }
        Format format = this.f74322j.f74326a;
        this.f74321i = format.f18984x;
        if (!this.f74325m) {
            this.f74314b.a(format);
            this.f74325m = true;
        }
        g gVar = this.f74322j.f74327b;
        if (gVar != null) {
            this.f74316d = gVar;
        } else if (hVar.getLength() == -1) {
            this.f74316d = new c();
        } else {
            f fVarB = this.f74313a.b();
            this.f74316d = new x3.a(this, this.f74318f, hVar.getLength(), fVarB.f74307h + fVarB.f74308i, fVarB.f74302c, (fVarB.f74301b & 4) != 0);
        }
        this.f74322j = null;
        this.f74320h = 2;
        this.f74313a.f();
        return 0;
    }

    public final int i(q3.h hVar, r rVar) throws InterruptedException, IOException {
        long jA = this.f74316d.a(hVar);
        if (jA >= 0) {
            rVar.f66477a = jA;
            return 1;
        }
        if (jA < -1) {
            d(-(jA + 2));
        }
        if (!this.f74324l) {
            this.f74315c.e(this.f74316d.createSeekMap());
            this.f74324l = true;
        }
        if (this.f74323k <= 0 && !this.f74313a.d(hVar)) {
            this.f74320h = 3;
            return -1;
        }
        this.f74323k = 0L;
        t tVarC = this.f74313a.c();
        long jE = e(tVarC);
        if (jE >= 0) {
            long j10 = this.f74319g;
            if (j10 + jE >= this.f74317e) {
                long jA2 = a(j10);
                this.f74314b.c(tVarC, tVarC.d());
                this.f74314b.d(jA2, 1, tVarC.d(), 0, null);
                this.f74317e = -1L;
            }
        }
        this.f74319g += jE;
        return 0;
    }

    public void j(boolean z10) {
        if (z10) {
            this.f74322j = new b();
            this.f74318f = 0L;
            this.f74320h = 0;
        } else {
            this.f74320h = 1;
        }
        this.f74317e = -1L;
        this.f74319g = 0L;
    }

    public final void k(long j10, long j11) {
        this.f74313a.e();
        if (j10 == 0) {
            j(!this.f74324l);
        } else if (this.f74320h != 0) {
            long jB = b(j11);
            this.f74317e = jB;
            this.f74316d.startSeek(jB);
            this.f74320h = 2;
        }
    }

    public long a(long j10) {
        return (j10 * 1000000) / ((long) this.f74321i);
    }
}
