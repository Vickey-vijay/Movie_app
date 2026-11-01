package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class k2 extends t1<mj.k, mj.l, j2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k2 f5432c = new k2();

    public int[] u() {
        return mj.l.f(0);
    }

    public k2() {
        super(yk.a.E(mj.k.f64546c));
    }

    @Override // bl.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return t(((mj.l) obj).v());
    }

    @Override // bl.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return w(((mj.l) obj).v());
    }

    @Override // bl.t1
    public /* bridge */ /* synthetic */ void s(al.d dVar, mj.l lVar, int i10) {
        x(dVar, lVar.v(), i10);
    }

    public int t(int[] iArr) {
        ck.p.j(iArr, "$this$collectionSize");
        return mj.l.p(iArr);
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, j2 j2Var, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(j2Var, "builder");
        j2Var.e(mj.k.b(cVar.k(getDescriptor(), i10).u()));
    }

    public j2 w(int[] iArr) {
        ck.p.j(iArr, "$this$toBuilder");
        return new j2(iArr, null);
    }

    public void x(al.d dVar, int[] iArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.w(getDescriptor(), i11).s(mj.l.n(iArr, i11));
        }
    }

    @Override // bl.t1
    public /* bridge */ /* synthetic */ mj.l q() {
        return mj.l.e(u());
    }
}
