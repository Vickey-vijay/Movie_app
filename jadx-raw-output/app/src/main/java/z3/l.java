package z3;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: DvbSubtitleReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h0.a> f86067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3.u[] f86068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f86072f;

    @Override // z3.m
    public void c(q3.i iVar, h0.d dVar) {
        for (int i10 = 0; i10 < this.f86068b.length; i10++) {
            h0.a aVar = this.f86067a.get(i10);
            dVar.a();
            q3.u uVarTrack = iVar.track(dVar.c(), 3);
            uVarTrack.a(Format.r(dVar.b(), "application/dvbsubs", null, -1, 0, Collections.singletonList(aVar.f86020c), aVar.f86018a, null));
            this.f86068b[i10] = uVarTrack;
        }
    }

    @Override // z3.m
    public void seek() {
        this.f86069c = false;
    }

    @Override // z3.m
    public void b(g5.t tVar) {
        if (this.f86069c) {
            if (this.f86070d != 2 || a(tVar, 32)) {
                if (this.f86070d != 1 || a(tVar, 0)) {
                    int iC = tVar.c();
                    int iA = tVar.a();
                    for (q3.u uVar : this.f86068b) {
                        tVar.L(iC);
                        uVar.c(tVar, iA);
                    }
                    this.f86071e += iA;
                }
            }
        }
    }

    @Override // z3.m
    public void packetFinished() {
        if (this.f86069c) {
            for (q3.u uVar : this.f86068b) {
                uVar.d(this.f86072f, 1, this.f86071e, 0, null);
            }
            this.f86069c = false;
        }
    }

    @Override // z3.m
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f86069c = true;
        this.f86072f = j10;
        this.f86071e = 0;
        this.f86070d = 2;
    }

    public l(List<h0.a> list) {
        this.f86067a = list;
        this.f86068b = new q3.u[list.size()];
    }

    public final boolean a(g5.t tVar, int i10) {
        if (tVar.a() == 0) {
            return false;
        }
        if (tVar.y() != i10) {
            this.f86069c = false;
        }
        this.f86070d--;
        return this.f86069c;
    }
}
