package ue;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: BitmapLuminanceSource.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends y5.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f72829c;

    @Override // y5.d
    public byte[] b() {
        return this.f72829c;
    }

    @Override // y5.d
    public byte[] c(int i10, byte[] bArr) {
        System.arraycopy(this.f72829c, i10 * d(), bArr, 0, d());
        return bArr;
    }

    public a(Bitmap bitmap) {
        super(bitmap.getWidth(), bitmap.getHeight());
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        this.f72829c = new byte[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, d(), 0, 0, d(), a());
        for (int i10 = 0; i10 < width; i10++) {
            this.f72829c[i10] = (byte) iArr[i10];
        }
    }
}
