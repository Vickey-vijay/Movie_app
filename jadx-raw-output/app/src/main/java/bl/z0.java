package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends t1<Long, long[], y0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f5494c = new z0();

    @Override // bl.t1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public long[] q() {
        return new long[0];
    }

    public z0() {
        super(yk.a.A(ck.q.f6059a));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int e(long[] jArr) {
        ck.p.j(jArr, "<this>");
        return jArr.length;
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, y0 y0Var, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(y0Var, "builder");
        y0Var.e(cVar.e(getDescriptor(), i10));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public y0 k(long[] jArr) {
        ck.p.j(jArr, "<this>");
        return new y0(jArr);
    }

    @Override // bl.t1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void s(al.d dVar, long[] jArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.u(getDescriptor(), i11, jArr[i11]);
        }
    }
}
