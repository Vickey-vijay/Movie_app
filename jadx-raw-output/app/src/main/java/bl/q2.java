package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class q2 extends t1<mj.p, mj.q, p2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q2 f5458c = new q2();

    public short[] u() {
        return mj.q.f(0);
    }

    public q2() {
        super(yk.a.G(mj.p.f64557c));
    }

    @Override // bl.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return t(((mj.q) obj).v());
    }

    @Override // bl.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return w(((mj.q) obj).v());
    }

    @Override // bl.t1
    public /* bridge */ /* synthetic */ void s(al.d dVar, mj.q qVar, int i10) {
        x(dVar, qVar.v(), i10);
    }

    public int t(short[] sArr) {
        ck.p.j(sArr, "$this$collectionSize");
        return mj.q.p(sArr);
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, p2 p2Var, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(p2Var, "builder");
        p2Var.e(mj.p.b(cVar.k(getDescriptor(), i10).l()));
    }

    public p2 w(short[] sArr) {
        ck.p.j(sArr, "$this$toBuilder");
        return new p2(sArr, null);
    }

    public void x(al.d dVar, short[] sArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.w(getDescriptor(), i11).j(mj.q.n(sArr, i11));
        }
    }

    @Override // bl.t1
    public /* bridge */ /* synthetic */ mj.q q() {
        return mj.q.e(u());
    }
}
