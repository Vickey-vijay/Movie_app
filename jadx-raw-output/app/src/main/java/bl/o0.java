package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class o0 extends t1<Integer, int[], n0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f5447c = new o0();

    @Override // bl.t1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int[] q() {
        return new int[0];
    }

    public o0() {
        super(yk.a.z(ck.o.f6058a));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        ck.p.j(iArr, "<this>");
        return iArr.length;
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, n0 n0Var, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(n0Var, "builder");
        n0Var.e(cVar.f(getDescriptor(), i10));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public n0 k(int[] iArr) {
        ck.p.j(iArr, "<this>");
        return new n0(iArr);
    }

    @Override // bl.t1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void s(al.d dVar, int[] iArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.n(getDescriptor(), i11, iArr[i11]);
        }
    }
}
