package q3;

/* JADX INFO: compiled from: VorbisBitArray.java */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f66489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66492d;

    public final void a() {
        int i10;
        int i11 = this.f66491c;
        g5.a.f(i11 >= 0 && (i11 < (i10 = this.f66490b) || (i11 == i10 && this.f66492d == 0)));
    }

    public int b() {
        return (this.f66491c * 8) + this.f66492d;
    }

    public boolean c() {
        boolean z10 = (((this.f66489a[this.f66491c] & 255) >> this.f66492d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f66491c;
        int iMin = Math.min(i10, 8 - this.f66492d);
        int i12 = i11 + 1;
        int i13 = ((this.f66489a[i11] & 255) >> this.f66492d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f66489a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f66491c + i11;
        this.f66491c = i12;
        int i13 = this.f66492d + (i10 - (i11 * 8));
        this.f66492d = i13;
        if (i13 > 7) {
            this.f66491c = i12 + 1;
            this.f66492d = i13 - 8;
        }
        a();
    }

    public v(byte[] bArr) {
        this.f66489a = bArr;
        this.f66490b = bArr.length;
    }
}
