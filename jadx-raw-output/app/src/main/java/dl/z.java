package dl;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f52217c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(r0 r0Var, boolean z10) {
        super(r0Var);
        ck.p.j(r0Var, "writer");
        this.f52217c = z10;
    }

    @Override // dl.r
    public void d(byte b10) {
        boolean z10 = this.f52217c;
        String strE = mj.i.e(mj.i.b(b10));
        if (z10) {
            m(strE);
        } else {
            j(strE);
        }
    }

    @Override // dl.r
    public void h(int i10) {
        boolean z10 = this.f52217c;
        int iB = mj.k.b(i10);
        if (z10) {
            m(Long.toString(((long) iB) & 4294967295L, 10));
        } else {
            j(Long.toString(((long) iB) & 4294967295L, 10));
        }
    }

    @Override // dl.r
    public void i(long j10) {
        boolean z10 = this.f52217c;
        long jB = mj.m.b(j10);
        if (z10) {
            m(y.a(jB, 10));
        } else {
            j(x.a(jB, 10));
        }
    }

    @Override // dl.r
    public void k(short s10) {
        boolean z10 = this.f52217c;
        String strE = mj.p.e(mj.p.b(s10));
        if (z10) {
            m(strE);
        } else {
            j(strE);
        }
    }
}
