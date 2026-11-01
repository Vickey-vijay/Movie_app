package z3;

import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: SpliceInfoSectionReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g5.g0 f85948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q3.u f85949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85950c;

    @Override // z3.z
    public void a(g5.g0 g0Var, q3.i iVar, h0.d dVar) {
        this.f85948a = g0Var;
        dVar.a();
        q3.u uVarTrack = iVar.track(dVar.c(), 4);
        this.f85949b = uVarTrack;
        uVarTrack.a(Format.t(dVar.b(), "application/x-scte35", null, -1, null));
    }

    @Override // z3.z
    public void b(g5.t tVar) {
        if (!this.f85950c) {
            if (this.f85948a.e() == -9223372036854775807L) {
                return;
            }
            this.f85949b.a(Format.s(null, "application/x-scte35", this.f85948a.e()));
            this.f85950c = true;
        }
        int iA = tVar.a();
        this.f85949b.c(tVar, iA);
        this.f85949b.d(this.f85948a.d(), 1, iA, 0, null);
    }
}
