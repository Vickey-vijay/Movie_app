package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b2 extends t1<Short, short[], a2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b2 f5389c = new b2();

    @Override // bl.t1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public short[] q() {
        return new short[0];
    }

    public b2() {
        super(yk.a.B(ck.u.f6064a));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int e(short[] sArr) {
        ck.p.j(sArr, "<this>");
        return sArr.length;
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, a2 a2Var, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(a2Var, "builder");
        a2Var.e(cVar.F(getDescriptor(), i10));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a2 k(short[] sArr) {
        ck.p.j(sArr, "<this>");
        return new a2(sArr);
    }

    @Override // bl.t1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void s(al.d dVar, short[] sArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.t(getDescriptor(), i11, sArr[i11]);
        }
    }
}
