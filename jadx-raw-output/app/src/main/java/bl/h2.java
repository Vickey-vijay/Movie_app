package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h2 extends t1<mj.i, mj.j, g2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h2 f5415c = new h2();

    public byte[] u() {
        return mj.j.f(0);
    }

    public h2() {
        super(yk.a.D(mj.i.f64541c));
    }

    @Override // bl.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return t(((mj.j) obj).v());
    }

    @Override // bl.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return w(((mj.j) obj).v());
    }

    @Override // bl.t1
    public /* bridge */ /* synthetic */ void s(al.d dVar, mj.j jVar, int i10) {
        x(dVar, jVar.v(), i10);
    }

    public int t(byte[] bArr) {
        ck.p.j(bArr, "$this$collectionSize");
        return mj.j.p(bArr);
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, g2 g2Var, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(g2Var, "builder");
        g2Var.e(mj.i.b(cVar.k(getDescriptor(), i10).H()));
    }

    public g2 w(byte[] bArr) {
        ck.p.j(bArr, "$this$toBuilder");
        return new g2(bArr, null);
    }

    public void x(al.d dVar, byte[] bArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.w(getDescriptor(), i11).e(mj.j.n(bArr, i11));
        }
    }

    @Override // bl.t1
    public /* bridge */ /* synthetic */ mj.j q() {
        return mj.j.e(u());
    }
}
