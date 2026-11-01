package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends t1<Boolean, boolean[], g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f5411c = new h();

    @Override // bl.t1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean[] q() {
        return new boolean[0];
    }

    public h() {
        super(yk.a.u(ck.c.f6045a));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int e(boolean[] zArr) {
        ck.p.j(zArr, "<this>");
        return zArr.length;
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, g gVar, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(gVar, "builder");
        gVar.e(cVar.D(getDescriptor(), i10));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public g k(boolean[] zArr) {
        ck.p.j(zArr, "<this>");
        return new g(zArr);
    }

    @Override // bl.t1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void s(al.d dVar, boolean[] zArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(zArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.o(getDescriptor(), i11, zArr[i11]);
        }
    }
}
