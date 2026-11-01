package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e0 extends t1<Float, float[], d0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f5399c = new e0();

    @Override // bl.t1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public float[] q() {
        return new float[0];
    }

    public e0() {
        super(yk.a.y(ck.k.f6057a));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int e(float[] fArr) {
        ck.p.j(fArr, "<this>");
        return fArr.length;
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, d0 d0Var, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(d0Var, "builder");
        d0Var.e(cVar.A(getDescriptor(), i10));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public d0 k(float[] fArr) {
        ck.p.j(fArr, "<this>");
        return new d0(fArr);
    }

    @Override // bl.t1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void s(al.d dVar, float[] fArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(fArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.B(getDescriptor(), i11, fArr[i11]);
        }
    }
}
