package t6;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: BarcodeMatrix.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b[] f72253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72256d;

    public b a() {
        return this.f72253a[this.f72254b];
    }

    public byte[][] b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f72255c * i11, this.f72256d * i10);
        int i12 = this.f72255c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f72253a[i13 / i11].b(i10);
        }
        return bArr;
    }

    public void c() {
        this.f72254b++;
    }

    public a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f72253a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f72253a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f72256d = i11 * 17;
        this.f72255c = i10;
        this.f72254b = -1;
    }
}
