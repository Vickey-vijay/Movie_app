package yads;

/* JADX INFO: loaded from: classes5.dex */
public final class t13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f82866a = new jb2(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82867b;

    public final long a(ld0 ld0Var) {
        int i10 = 0;
        ld0Var.b(this.f82866a.f78966a, 0, 1, false);
        int i11 = this.f82866a.f78966a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        ld0Var.b(this.f82866a.f78966a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.f82866a.f78966a[i10] & 255) + (i14 << 8);
        }
        this.f82867b = i13 + 1 + this.f82867b;
        return i14;
    }
}
