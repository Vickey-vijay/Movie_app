package y5;

/* JADX INFO: compiled from: PlanarYUVLuminanceSource.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f75283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f75286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f75287g;

    @Override // y5.d
    public byte[] c(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i10)));
        }
        int iD = d();
        if (bArr == null || bArr.length < iD) {
            bArr = new byte[iD];
        }
        System.arraycopy(this.f75283c, ((i10 + this.f75287g) * this.f75284d) + this.f75286f, bArr, 0, iD);
        return bArr;
    }

    public final void g(int i10, int i11) {
        byte[] bArr = this.f75283c;
        int i12 = (this.f75287g * this.f75284d) + this.f75286f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = (i10 / 2) + i12;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14) {
                byte b10 = bArr[i16];
                bArr[i16] = bArr[i15];
                bArr[i15] = b10;
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f75284d;
        }
    }

    public g(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 <= i10 && i13 + i15 <= i11) {
            this.f75283c = bArr;
            this.f75284d = i10;
            this.f75285e = i11;
            this.f75286f = i12;
            this.f75287g = i13;
            if (z10) {
                g(i14, i15);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override // y5.d
    public byte[] b() {
        int iD = d();
        int iA = a();
        int i10 = this.f75284d;
        if (iD == i10 && iA == this.f75285e) {
            return this.f75283c;
        }
        int i11 = iD * iA;
        byte[] bArr = new byte[i11];
        int i12 = (this.f75287g * i10) + this.f75286f;
        if (iD == i10) {
            System.arraycopy(this.f75283c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < iA; i13++) {
            System.arraycopy(this.f75283c, i12, bArr, i13 * iD, iD);
            i12 += this.f75284d;
        }
        return bArr;
    }
}
