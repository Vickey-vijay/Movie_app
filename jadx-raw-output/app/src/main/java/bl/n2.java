package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class n2 extends t1<mj.m, mj.n, m2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n2 f5445c = new n2();

    public long[] u() {
        return mj.n.f(0);
    }

    public n2() {
        super(yk.a.F(mj.m.f64551c));
    }

    @Override // bl.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return t(((mj.n) obj).v());
    }

    @Override // bl.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return w(((mj.n) obj).v());
    }

    @Override // bl.t1
    public /* bridge */ /* synthetic */ void s(al.d dVar, mj.n nVar, int i10) {
        x(dVar, nVar.v(), i10);
    }

    public int t(long[] jArr) {
        ck.p.j(jArr, "$this$collectionSize");
        return mj.n.p(jArr);
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, m2 m2Var, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(m2Var, "builder");
        m2Var.e(mj.m.b(cVar.k(getDescriptor(), i10).h()));
    }

    public m2 w(long[] jArr) {
        ck.p.j(jArr, "$this$toBuilder");
        return new m2(jArr, null);
    }

    public void x(al.d dVar, long[] jArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.w(getDescriptor(), i11).z(mj.n.n(jArr, i11));
        }
    }

    @Override // bl.t1
    public /* bridge */ /* synthetic */ mj.n q() {
        return mj.n.e(u());
    }
}
