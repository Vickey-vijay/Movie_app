package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class ui1 extends s63 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fm1 f83488c;

    @Override // yads.s63
    public final int a() {
        return 1;
    }

    @Override // yads.s63
    public final int a(Object obj) {
        return obj == ti1.f83059f ? 0 : -1;
    }

    @Override // yads.s63
    public final int b() {
        return 1;
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        p63Var.a(z10 ? 0 : null, z10 ? ti1.f83059f : null, 0, -9223372036854775807L, 0L, e6.f76925h, true);
        return p63Var;
    }

    public ui1(fm1 fm1Var) {
        this.f83488c = fm1Var;
    }

    @Override // yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        r63Var.a(r63.f82114s, this.f83488c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        r63Var.f82129m = true;
        return r63Var;
    }

    @Override // yads.s63
    public final Object a(int i10) {
        return ti1.f83059f;
    }
}
