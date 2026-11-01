package b6;

/* JADX INFO: compiled from: SimpleToken.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f4826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f4827d;

    @Override // b6.g
    public void c(c6.a aVar, byte[] bArr) {
        aVar.c(this.f4826c, this.f4827d);
    }

    public String toString() {
        short s10 = this.f4826c;
        short s11 = this.f4827d;
        return "<" + Integer.toBinaryString((s10 & ((1 << s11) - 1)) | (1 << s11) | (1 << this.f4827d)).substring(1) + '>';
    }

    public e(g gVar, int i10, int i11) {
        super(gVar);
        this.f4826c = (short) i10;
        this.f4827d = (short) i11;
    }
}
