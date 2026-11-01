package r6;

/* JADX INFO: compiled from: ModulusGF.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f66706f = new b(929, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f66707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f66708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f66709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f66710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f66711e;

    public int a(int i10, int i11) {
        return (i10 + i11) % this.f66711e;
    }

    public c b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f66709c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new c(this, iArr);
    }

    public int c(int i10) {
        return this.f66707a[i10];
    }

    public c d() {
        return this.f66710d;
    }

    public int e() {
        return this.f66711e;
    }

    public c f() {
        return this.f66709c;
    }

    public int g(int i10) {
        if (i10 != 0) {
            return this.f66707a[(this.f66711e - this.f66708b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int h(int i10) {
        if (i10 != 0) {
            return this.f66708b[i10];
        }
        throw new IllegalArgumentException();
    }

    public int i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f66707a;
        int[] iArr2 = this.f66708b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f66711e - 1)];
    }

    public int j(int i10, int i11) {
        int i12 = this.f66711e;
        return ((i10 + i12) - i11) % i12;
    }

    public b(int i10, int i11) {
        this.f66711e = i10;
        this.f66707a = new int[i10];
        this.f66708b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f66707a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f66708b[this.f66707a[i14]] = i14;
        }
        this.f66709c = new c(this, new int[]{0});
        this.f66710d = new c(this, new int[]{1});
    }
}
