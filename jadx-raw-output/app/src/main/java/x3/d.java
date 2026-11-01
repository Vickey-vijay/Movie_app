package x3;

import com.google.android.exoplayer2.ParserException;
import g5.t;
import java.io.IOException;
import q3.k;
import q3.r;
import q3.u;

/* JADX INFO: compiled from: OggExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public class d implements q3.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f74291d = new k() { // from class: x3.c
        @Override // q3.k
        public final q3.g[] createExtractors() {
            return d.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q3.i f74292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f74293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f74294c;

    public static /* synthetic */ q3.g[] e() {
        return new q3.g[]{new d()};
    }

    public static t f(t tVar) {
        tVar.L(0);
        return tVar;
    }

    @Override // q3.g
    public void release() {
    }

    @Override // q3.g
    public int a(q3.h hVar, r rVar) throws InterruptedException, IOException {
        if (this.f74293b == null) {
            if (!g(hVar)) {
                throw new ParserException("Failed to determine bitstream type");
            }
            hVar.resetPeekPosition();
        }
        if (!this.f74294c) {
            u uVarTrack = this.f74292a.track(0, 1);
            this.f74292a.endTracks();
            this.f74293b.c(this.f74292a, uVarTrack);
            this.f74294c = true;
        }
        return this.f74293b.f(hVar, rVar);
    }

    @Override // q3.g
    public void c(q3.i iVar) {
        this.f74292a = iVar;
    }

    public final boolean g(q3.h hVar) throws InterruptedException, IOException {
        f fVar = new f();
        if (fVar.a(hVar, true) && (fVar.f74301b & 2) == 2) {
            int iMin = Math.min(fVar.f74308i, 8);
            t tVar = new t(iMin);
            hVar.peekFully(tVar.f53154a, 0, iMin);
            if (b.o(f(tVar))) {
                this.f74293b = new b();
            } else if (j.p(f(tVar))) {
                this.f74293b = new j();
            } else if (h.n(f(tVar))) {
                this.f74293b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        i iVar = this.f74293b;
        if (iVar != null) {
            iVar.k(j10, j11);
        }
    }

    @Override // q3.g
    public boolean b(q3.h hVar) throws InterruptedException, IOException {
        try {
            return g(hVar);
        } catch (ParserException unused) {
            return false;
        }
    }
}
