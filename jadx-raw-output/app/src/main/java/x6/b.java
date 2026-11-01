package x6;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: ByteMatrix.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f74367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74369c;

    public void a(byte b10) {
        for (byte[] bArr : this.f74367a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f74367a[i11][i10];
    }

    public byte[][] c() {
        return this.f74367a;
    }

    public int d() {
        return this.f74369c;
    }

    public int e() {
        return this.f74368b;
    }

    public void f(int i10, int i11, int i12) {
        this.f74367a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f74367a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f74368b * 2 * this.f74369c) + 2);
        for (int i10 = 0; i10 < this.f74369c; i10++) {
            byte[] bArr = this.f74367a[i10];
            for (int i11 = 0; i11 < this.f74368b; i11++) {
                byte b10 = bArr[i11];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }

    public b(int i10, int i11) {
        this.f74367a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f74368b = i10;
        this.f74369c = i11;
    }
}
