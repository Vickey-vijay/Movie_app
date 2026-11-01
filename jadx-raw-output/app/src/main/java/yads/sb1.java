package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class sb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82578a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82579b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82580c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f82581d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f82582e = 15;

    public final void a(int i10) {
        int i11 = this.f82580c;
        int[] iArr = this.f82581d;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.f82578a;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.f82581d, 0, iArr2, i13, i12);
            this.f82578a = 0;
            this.f82579b = this.f82580c - 1;
            this.f82581d = iArr2;
            this.f82582e = length - 1;
        }
        int i14 = (this.f82579b + 1) & this.f82582e;
        this.f82579b = i14;
        this.f82581d[i14] = i10;
        this.f82580c++;
    }
}
