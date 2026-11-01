package z3;

import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: Id3Reader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.t f86171a = new g5.t(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q3.u f86172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f86174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86176f;

    @Override // z3.m
    public void seek() {
        this.f86173c = false;
    }

    @Override // z3.m
    public void b(g5.t tVar) {
        if (this.f86173c) {
            int iA = tVar.a();
            int i10 = this.f86176f;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(tVar.f53154a, tVar.c(), this.f86171a.f53154a, this.f86176f, iMin);
                if (this.f86176f + iMin == 10) {
                    this.f86171a.L(0);
                    if (73 != this.f86171a.y() || 68 != this.f86171a.y() || 51 != this.f86171a.y()) {
                        g5.m.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f86173c = false;
                        return;
                    } else {
                        this.f86171a.M(3);
                        this.f86175e = this.f86171a.x() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f86175e - this.f86176f);
            this.f86172b.c(tVar, iMin2);
            this.f86176f += iMin2;
        }
    }

    @Override // z3.m
    public void packetFinished() {
        int i10;
        if (this.f86173c && (i10 = this.f86175e) != 0 && this.f86176f == i10) {
            this.f86172b.d(this.f86174d, 1, i10, 0, null);
            this.f86173c = false;
        }
    }

    @Override // z3.m
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f86173c = true;
        this.f86174d = j10;
        this.f86175e = 0;
        this.f86176f = 0;
    }

    @Override // z3.m
    public void c(q3.i iVar, h0.d dVar) {
        dVar.a();
        q3.u uVarTrack = iVar.track(dVar.c(), 4);
        this.f86172b = uVarTrack;
        uVarTrack.a(Format.t(dVar.b(), "application/id3", null, -1, null));
    }
}
