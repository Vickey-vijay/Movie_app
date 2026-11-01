package o6;

import com.google.zxing.FormatException;

/* JADX INFO: compiled from: DecodedNumeric.java */
/* JADX INFO: loaded from: classes11.dex */
public final class o extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f65103c;

    public int b() {
        return this.f65102b;
    }

    public int c() {
        return this.f65103c;
    }

    public boolean d() {
        return this.f65102b == 10;
    }

    public boolean e() {
        return this.f65103c == 10;
    }

    public o(int i10, int i11, int i12) throws FormatException {
        super(i10);
        if (i11 >= 0 && i11 <= 10 && i12 >= 0 && i12 <= 10) {
            this.f65102b = i11;
            this.f65103c = i12;
            return;
        }
        throw FormatException.getFormatInstance();
    }
}
