package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class nv1 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f80820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ov1 f80821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m73 f80823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f80824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80825f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f80827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f80829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f80830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f80831l;

    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        if (this.f80823d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i10 = jb2Var.f78968c;
            int i11 = jb2Var.f78967b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f80825f;
            if (i13 == 0) {
                byte[] bArr = jb2Var.f78966a;
                while (true) {
                    if (i11 >= i10) {
                        jb2Var.e(i10);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f80828i && (b10 & 224) == 224;
                    this.f80828i = z10;
                    if (z11) {
                        jb2Var.e(i11 + 1);
                        this.f80828i = false;
                        this.f80820a.f78966a[1] = bArr[i11];
                        this.f80826g = 2;
                        this.f80825f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i13 == 1) {
                int iMin = Math.min(i12, 4 - this.f80826g);
                jb2Var.a(this.f80820a.f78966a, this.f80826g, iMin);
                int i14 = this.f80826g + iMin;
                this.f80826g = i14;
                if (i14 >= 4) {
                    this.f80820a.e(0);
                    if (this.f80821b.a(this.f80820a.b())) {
                        ov1 ov1Var = this.f80821b;
                        this.f80830k = ov1Var.f81158c;
                        if (!this.f80827h) {
                            long j10 = ((long) ov1Var.f81162g) * 1000000;
                            int i15 = ov1Var.f81159d;
                            this.f80829j = j10 / ((long) i15);
                            lx0 lx0Var = new lx0();
                            lx0Var.f79957a = this.f80824e;
                            lx0Var.f79967k = ov1Var.f81157b;
                            lx0Var.f79968l = 4096;
                            lx0Var.f79980x = ov1Var.f81160e;
                            lx0Var.f79981y = i15;
                            lx0Var.f79959c = this.f80822c;
                            this.f80823d.a(new mx0(lx0Var));
                            this.f80827h = true;
                        }
                        this.f80820a.e(0);
                        this.f80823d.a(4, this.f80820a);
                        this.f80825f = 2;
                    } else {
                        this.f80826g = 0;
                        this.f80825f = 1;
                    }
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(i12, this.f80830k - this.f80826g);
                this.f80823d.a(iMin2, jb2Var);
                int i16 = this.f80826g + iMin2;
                this.f80826g = i16;
                int i17 = this.f80830k;
                if (i16 >= i17) {
                    long j11 = this.f80831l;
                    if (j11 != -9223372036854775807L) {
                        this.f80823d.a(j11, 1, i17, 0, null);
                        this.f80831l += this.f80829j;
                    }
                    this.f80826g = 0;
                    this.f80825f = 0;
                }
            }
        }
    }

    @Override // yads.ul0
    public final void b() {
    }

    public nv1(String str) {
        jb2 jb2Var = new jb2(4);
        this.f80820a = jb2Var;
        jb2Var.a()[0] = -1;
        this.f80821b = new ov1();
        this.f80831l = -9223372036854775807L;
        this.f80822c = str;
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f80824e = l93Var.f79734e;
        l93Var.b();
        this.f80823d = pq0Var.a(l93Var.f79733d, 1);
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f80831l = j10;
        }
    }

    @Override // yads.ul0
    public final void a() {
        this.f80825f = 0;
        this.f80826g = 0;
        this.f80828i = false;
        this.f80831l = -9223372036854775807L;
    }
}
