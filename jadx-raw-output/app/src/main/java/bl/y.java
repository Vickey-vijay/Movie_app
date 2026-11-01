package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends t1<Double, double[], x> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f5489c = new y();

    @Override // bl.t1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public double[] q() {
        return new double[0];
    }

    public y() {
        super(yk.a.x(ck.j.f6056a));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int e(double[] dArr) {
        ck.p.j(dArr, "<this>");
        return dArr.length;
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, x xVar, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(xVar, "builder");
        xVar.e(cVar.G(getDescriptor(), i10));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public x k(double[] dArr) {
        ck.p.j(dArr, "<this>");
        return new x(dArr);
    }

    @Override // bl.t1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void s(al.d dVar, double[] dArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(dArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.G(getDescriptor(), i11, dArr[i11]);
        }
    }
}
