package z3;

import java.io.IOException;

/* JADX INFO: compiled from: Ac4Extractor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements q3.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q3.k f85954d = new q3.k() { // from class: z3.d
        @Override // q3.k
        public final q3.g[] createExtractors() {
            return e.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f85955a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.t f85956b = new g5.t(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85957c;

    public static /* synthetic */ q3.g[] e() {
        return new q3.g[]{new e()};
    }

    @Override // q3.g
    public void release() {
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        this.f85957c = false;
        this.f85955a.seek();
    }

    @Override // q3.g
    public int a(q3.h hVar, q3.r rVar) throws InterruptedException, IOException {
        int i10 = hVar.read(this.f85956b.f53154a, 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.f85956b.L(0);
        this.f85956b.K(i10);
        if (!this.f85957c) {
            this.f85955a.packetStarted(0L, 4);
            this.f85957c = true;
        }
        this.f85955a.b(this.f85956b);
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
            hVar.peekFully(tVar.f53154a, 0, 7);
            tVar.L(0);
            int iE = tVar.E();
            if (iE == 44096 || iE == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iE2 = m3.b.e(tVar.f53154a, iE);
                if (iE2 == -1) {
                    return false;
                }
                hVar.advancePeekPosition(iE2 - 7);
            } else {
                hVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                hVar.advancePeekPosition(i12);
                i11 = 0;
            }
        }
    }

    @Override // q3.g
    public void c(q3.i iVar) {
        this.f85955a.c(iVar, new h0.d(0, 1));
        iVar.endTracks();
        iVar.e(new q3.s.b(-9223372036854775807L));
    }
}
