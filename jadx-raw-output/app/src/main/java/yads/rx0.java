package yads;

/* JADX INFO: loaded from: classes.dex */
public final class rx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m73 f82450a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n73 f82453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public re0 f82454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f82455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f82457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f82458i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f82461l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g73 f82451b = new g73();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f82452c = new jb2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jb2 f82459j = new jb2(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jb2 f82460k = new jb2();

    public final f73 a() {
        if (!this.f82461l) {
            return null;
        }
        g73 g73Var = this.f82451b;
        re0 re0Var = g73Var.f77667a;
        int i10 = ib3.f78556a;
        int i11 = re0Var.f82221a;
        f73 f73Var = g73Var.f77679m;
        if (f73Var == null) {
            f73[] f73VarArr = this.f82453d.f80583a.f76969k;
            f73Var = f73VarArr == null ? null : f73VarArr[i11];
        }
        if (f73Var == null || !f73Var.f77320a) {
            return null;
        }
        return f73Var;
    }

    public final void b() {
        g73 g73Var = this.f82451b;
        g73Var.f77670d = 0;
        g73Var.f77682p = 0L;
        g73Var.f77683q = false;
        g73Var.f77677k = false;
        g73Var.f77681o = false;
        g73Var.f77679m = null;
        this.f82455f = 0;
        this.f82457h = 0;
        this.f82456g = 0;
        this.f82458i = 0;
        this.f82461l = false;
    }

    public rx0(m73 m73Var, n73 n73Var, re0 re0Var) {
        this.f82450a = m73Var;
        this.f82453d = n73Var;
        this.f82454e = re0Var;
        a(n73Var, re0Var);
    }

    public final int a(int i10, int i11) {
        jb2 jb2Var;
        f73 f73VarA = a();
        if (f73VarA == null) {
            return 0;
        }
        int length = f73VarA.f77323d;
        if (length != 0) {
            jb2Var = this.f82451b.f77680n;
        } else {
            byte[] bArr = f73VarA.f77324e;
            int i12 = ib3.f78556a;
            jb2 jb2Var2 = this.f82460k;
            int length2 = bArr.length;
            jb2Var2.f78966a = bArr;
            jb2Var2.f78968c = length2;
            jb2Var2.f78967b = 0;
            length = bArr.length;
            jb2Var = jb2Var2;
        }
        g73 g73Var = this.f82451b;
        boolean z10 = g73Var.f77677k && g73Var.f77678l[this.f82455f];
        boolean z11 = z10 || i11 != 0;
        jb2 jb2Var3 = this.f82459j;
        jb2Var3.f78966a[0] = (byte) ((z11 ? 128 : 0) | length);
        jb2Var3.e(0);
        this.f82450a.a(1, this.f82459j);
        this.f82450a.a(length, jb2Var);
        if (!z11) {
            return length + 1;
        }
        if (!z10) {
            this.f82452c.c(8);
            jb2 jb2Var4 = this.f82452c;
            byte[] bArr2 = jb2Var4.f78966a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            this.f82450a.a(8, jb2Var4);
            return length + 9;
        }
        jb2 jb2Var5 = this.f82451b.f77680n;
        int iR = jb2Var5.r();
        jb2Var5.e(jb2Var5.f78967b - 2);
        int i13 = (iR * 6) + 2;
        if (i11 != 0) {
            this.f82452c.c(i13);
            byte[] bArr3 = this.f82452c.f78966a;
            jb2Var5.a(bArr3, 0, i13);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
            jb2Var5 = this.f82452c;
        }
        this.f82450a.a(i13, jb2Var5);
        return length + 1 + i13;
    }

    public final void a(n73 n73Var, re0 re0Var) {
        this.f82453d = n73Var;
        this.f82454e = re0Var;
        this.f82450a.a(n73Var.f80583a.f76964f);
        b();
    }
}
