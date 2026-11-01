package y5;

/* JADX INFO: compiled from: LuminanceSource.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75278b;

    public abstract byte[] b();

    public abstract byte[] c(int i10, byte[] bArr);

    public boolean e() {
        return false;
    }

    public final int a() {
        return this.f75278b;
    }

    public final int d() {
        return this.f75277a;
    }

    public d f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c10;
        int i10 = this.f75277a;
        byte[] bArrC = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f75278b * (i10 + 1));
        for (int i11 = 0; i11 < this.f75278b; i11++) {
            bArrC = c(i11, bArrC);
            for (int i12 = 0; i12 < this.f75277a; i12++) {
                int i13 = bArrC[i12] & 255;
                if (i13 < 64) {
                    c10 = '#';
                } else if (i13 < 128) {
                    c10 = '+';
                } else {
                    c10 = i13 < 192 ? '.' : ' ';
                }
                sb2.append(c10);
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }

    public d(int i10, int i11) {
        this.f75277a = i10;
        this.f75278b = i11;
    }
}
