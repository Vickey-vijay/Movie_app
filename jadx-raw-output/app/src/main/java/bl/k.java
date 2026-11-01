package bl;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends t1<Byte, byte[], j> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f5429c = new k();

    @Override // bl.t1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public byte[] q() {
        return new byte[0];
    }

    public k() {
        super(yk.a.v(ck.d.f6046a));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int e(byte[] bArr) {
        ck.p.j(bArr, "<this>");
        return bArr.length;
    }

    @Override // bl.t, bl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(al.c cVar, int i10, j jVar, boolean z10) {
        ck.p.j(cVar, "decoder");
        ck.p.j(jVar, "builder");
        jVar.e(cVar.C(getDescriptor(), i10));
    }

    @Override // bl.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public j k(byte[] bArr) {
        ck.p.j(bArr, "<this>");
        return new j(bArr);
    }

    @Override // bl.t1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void s(al.d dVar, byte[] bArr, int i10) {
        ck.p.j(dVar, "encoder");
        ck.p.j(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.i(getDescriptor(), i11, bArr[i11]);
        }
    }
}
