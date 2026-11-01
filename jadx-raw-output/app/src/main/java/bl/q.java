package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends t1<Character, char[], p> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f5456c = new q();

    @Override // bl.t1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public char[] q() {
        return new char[0];
    }

    public q() {
        super(yk.a.w(ck.e.f6047a));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int e(char[] cArr) {
        ck.p.j(cArr, "<this>");
        return cArr.length;
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, p pVar, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(pVar, "builder");
        pVar.e(cVar.q(getDescriptor(), i10));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public p k(char[] cArr) {
        ck.p.j(cArr, "<this>");
        return new p(cArr);
    }

    @Override // bl.t1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void s(al.d dVar, char[] cArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(cArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.h(getDescriptor(), i11, cArr[i11]);
        }
    }
}
