package t6;

/* JADX INFO: compiled from: BarcodeRow.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f72257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72258b = 0;

    public void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f72258b;
            this.f72258b = i12 + 1;
            c(i12, z10);
        }
    }

    public byte[] b(int i10) {
        int length = this.f72257a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f72257a[i11 / i10];
        }
        return bArr;
    }

    public final void c(int i10, boolean z10) {
        this.f72257a[i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public b(int i10) {
        this.f72257a = new byte[i10];
    }
}
