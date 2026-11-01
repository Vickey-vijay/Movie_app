package z3;

import java.io.IOException;

/* JADX INFO: compiled from: Ac3Extractor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements q3.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q3.k f85930d = new q3.k() { // from class: z3.a
        @Override // q3.k
        public final q3.g[] createExtractors() {
            return b.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f85931a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.t f85932b = new g5.t(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85933c;

    public static /* synthetic */ q3.g[] e() {
        return new q3.g[]{new b()};
    }

    @Override // q3.g
    public void release() {
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        this.f85933c = false;
        this.f85931a.seek();
    }

    @Override // q3.g
    public int a(q3.h hVar, q3.r rVar) throws InterruptedException, IOException {
        int i10 = hVar.read(this.f85932b.f53154a, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.f85932b.L(0);
        this.f85932b.K(i10);
        if (!this.f85933c) {
            this.f85931a.packetStarted(0L, 4);
            this.f85933c = true;
        }
        this.f85931a.b(this.f85932b);
        return 0;
    }

    @Override // q3.g
    public boolean b(q3.h hVar) throws InterruptedException, IOException {
        g5.t tVar = new g5.t(10);
        int i10 = 0;
        while (true) {
            hVar.peekFully(tVar.f53154a, 0, 10);
            tVar.L(0);
            if (tVar.B() != 4801587) {
                break;
            }
            tVar.M(3);
            int iX = tVar.x();
            i10 += iX + 10;
            hVar.advancePeekPosition(iX);
        }
        hVar.resetPeekPosition();
        hVar.advancePeekPosition(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            hVar.peekFully(tVar.f53154a, 0, 6);
            tVar.L(0);
            if (tVar.E() != 2935) {
                hVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                hVar.advancePeekPosition(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iF = m3.a.f(tVar.f53154a);
                if (iF == -1) {
                    return false;
                }
                hVar.advancePeekPosition(iF - 6);
            }
        }
    }

    @Override // q3.g
    public void c(q3.i iVar) {
        this.f85931a.c(iVar, new h0.d(0, 1));
        iVar.endTracks();
        iVar.e(new q3.s.b(-9223372036854775807L));
    }
}
