package z3;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* JADX INFO: compiled from: PsExtractor.java */
/* JADX INFO: loaded from: classes10.dex */
public final class y implements q3.g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q3.k f86236l = new q3.k() { // from class: z3.x
        @Override // q3.k
        public final q3.g[] createExtractors() {
            return y.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.g0 f86237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f86238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5.t f86239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f86240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f86243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f86244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v f86245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q3.i f86246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f86247k;

    /* JADX INFO: compiled from: PsExtractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f86248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g5.g0 f86249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g5.s f86250c = new g5.s(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f86251d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f86252e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f86253f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f86254g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f86255h;

        public void d() {
            this.f86253f = false;
            this.f86248a.seek();
        }

        public void a(g5.t tVar) throws ParserException {
            tVar.h(this.f86250c.f53150a, 0, 3);
            this.f86250c.o(0);
            b();
            tVar.h(this.f86250c.f53150a, 0, this.f86254g);
            this.f86250c.o(0);
            c();
            this.f86248a.packetStarted(this.f86255h, 4);
            this.f86248a.b(tVar);
            this.f86248a.packetFinished();
        }

        public final void b() {
            this.f86250c.q(8);
            this.f86251d = this.f86250c.g();
            this.f86252e = this.f86250c.g();
            this.f86250c.q(6);
            this.f86254g = this.f86250c.h(8);
        }

        public final void c() {
            this.f86255h = 0L;
            if (this.f86251d) {
                this.f86250c.q(4);
                long jH = ((long) this.f86250c.h(3)) << 30;
                this.f86250c.q(1);
                long jH2 = jH | ((long) (this.f86250c.h(15) << 15));
                this.f86250c.q(1);
                long jH3 = jH2 | ((long) this.f86250c.h(15));
                this.f86250c.q(1);
                if (!this.f86253f && this.f86252e) {
                    this.f86250c.q(4);
                    long jH4 = ((long) this.f86250c.h(3)) << 30;
                    this.f86250c.q(1);
                    long jH5 = jH4 | ((long) (this.f86250c.h(15) << 15));
                    this.f86250c.q(1);
                    long jH6 = jH5 | ((long) this.f86250c.h(15));
                    this.f86250c.q(1);
                    this.f86249b.b(jH6);
                    this.f86253f = true;
                }
                this.f86255h = this.f86249b.b(jH3);
            }
        }

        public a(m mVar, g5.g0 g0Var) {
            this.f86248a = mVar;
            this.f86249b = g0Var;
        }
    }

    public y() {
        this(new g5.g0(0L));
    }

    public static /* synthetic */ q3.g[] e() {
        return new q3.g[]{new y()};
    }

    @Override // q3.g
    public void release() {
    }

    public y(g5.g0 g0Var) {
        this.f86237a = g0Var;
        this.f86239c = new g5.t(4096);
        this.f86238b = new SparseArray<>();
        this.f86240d = new w();
    }

    @Override // q3.g
    public boolean b(q3.h hVar) throws InterruptedException, IOException {
        byte[] bArr = new byte[14];
        hVar.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        hVar.advancePeekPosition(bArr[13] & 7);
        hVar.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // q3.g
    public void c(q3.i iVar) {
        this.f86246j = iVar;
    }

    public final void f(long j10) {
        if (this.f86247k) {
            return;
        }
        this.f86247k = true;
        if (this.f86240d.c() == -9223372036854775807L) {
            this.f86246j.e(new q3.s.b(this.f86240d.c()));
            return;
        }
        v vVar = new v(this.f86240d.d(), this.f86240d.c(), j10);
        this.f86245i = vVar;
        this.f86246j.e(vVar.b());
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        if ((this.f86237a.e() == -9223372036854775807L) || (this.f86237a.c() != 0 && this.f86237a.c() != j11)) {
            this.f86237a.g();
            this.f86237a.h(j11);
        }
        v vVar = this.f86245i;
        if (vVar != null) {
            vVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f86238b.size(); i10++) {
            this.f86238b.valueAt(i10).d();
        }
    }

    @Override // q3.g
    public int a(q3.h hVar, q3.r rVar) throws InterruptedException, IOException {
        boolean z10;
        long peekPosition;
        long j10;
        long length = hVar.getLength();
        if (length != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f86240d.e()) {
            return this.f86240d.g(hVar, rVar);
        }
        f(length);
        v vVar = this.f86245i;
        if (vVar != null && vVar.d()) {
            return this.f86245i.c(hVar, rVar);
        }
        hVar.resetPeekPosition();
        if (length != -1) {
            peekPosition = length - hVar.getPeekPosition();
        } else {
            peekPosition = -1;
        }
        if ((peekPosition != -1 && peekPosition < 4) || !hVar.peekFully(this.f86239c.f53154a, 0, 4, true)) {
            return -1;
        }
        this.f86239c.L(0);
        int iJ = this.f86239c.j();
        if (iJ == 441) {
            return -1;
        }
        if (iJ == 442) {
            hVar.peekFully(this.f86239c.f53154a, 0, 10);
            this.f86239c.L(9);
            hVar.skipFully((this.f86239c.y() & 7) + 14);
            return 0;
        }
        if (iJ == 443) {
            hVar.peekFully(this.f86239c.f53154a, 0, 2);
            this.f86239c.L(0);
            hVar.skipFully(this.f86239c.E() + 6);
            return 0;
        }
        if (((iJ & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            hVar.skipFully(1);
            return 0;
        }
        int i10 = iJ & 255;
        a aVar = this.f86238b.get(i10);
        if (!this.f86241e) {
            if (aVar == null) {
                m nVar = null;
                if (i10 == 189) {
                    nVar = new c();
                    this.f86242f = true;
                    this.f86244h = hVar.getPosition();
                } else if ((i10 & 224) == 192) {
                    nVar = new s();
                    this.f86242f = true;
                    this.f86244h = hVar.getPosition();
                } else if ((i10 & 240) == 224) {
                    nVar = new n();
                    this.f86243g = true;
                    this.f86244h = hVar.getPosition();
                }
                if (nVar != null) {
                    nVar.c(this.f86246j, new h0.d(i10, 256));
                    aVar = new a(nVar, this.f86237a);
                    this.f86238b.put(i10, aVar);
                }
            }
            if (this.f86242f && this.f86243g) {
                j10 = this.f86244h + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            } else {
                j10 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            if (hVar.getPosition() > j10) {
                this.f86241e = true;
                this.f86246j.endTracks();
            }
        }
        hVar.peekFully(this.f86239c.f53154a, 0, 2);
        this.f86239c.L(0);
        int iE = this.f86239c.E() + 6;
        if (aVar == null) {
            hVar.skipFully(iE);
        } else {
            this.f86239c.H(iE);
            hVar.readFully(this.f86239c.f53154a, 0, iE);
            this.f86239c.L(6);
            aVar.a(this.f86239c);
            g5.t tVar = this.f86239c;
            tVar.K(tVar.b());
        }
        return 0;
    }
}
