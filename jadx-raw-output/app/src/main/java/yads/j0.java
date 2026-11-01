package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib2 f78858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f78859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f78861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m73 f78862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f78865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f78866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mx0 f78867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f78868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f78869l;

    public j0() {
        this(null);
    }

    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        if (this.f78862e == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i10 = jb2Var.f78968c - jb2Var.f78967b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f78863f;
            if (i11 == 0) {
                while (jb2Var.f78968c - jb2Var.f78967b > 0) {
                    if (this.f78865h) {
                        int iM = jb2Var.m();
                        this.f78865h = iM == 172;
                        if (iM == 64 || iM == 65) {
                            boolean z10 = iM == 65;
                            this.f78863f = 1;
                            byte[] bArr = this.f78859b.f78966a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z10 ? 65 : 64);
                            this.f78864g = 2;
                            break;
                        }
                    } else {
                        this.f78865h = jb2Var.m() == 172;
                    }
                }
            } else if (i11 == 1) {
                byte[] bArr2 = this.f78859b.f78966a;
                int iMin = Math.min(i10, 16 - this.f78864g);
                jb2Var.a(bArr2, this.f78864g, iMin);
                int i12 = this.f78864g + iMin;
                this.f78864g = i12;
                if (i12 == 16) {
                    this.f78858a.b(0);
                    k0 k0VarA = l0.a(this.f78858a);
                    mx0 mx0Var = this.f78867j;
                    if (mx0Var == null || 2 != mx0Var.f80442z || k0VarA.f79253a != mx0Var.A || !"audio/ac4".equals(mx0Var.f80429m)) {
                        lx0 lx0Var = new lx0();
                        lx0Var.f79957a = this.f78861d;
                        lx0Var.f79967k = "audio/ac4";
                        lx0Var.f79980x = 2;
                        lx0Var.f79981y = k0VarA.f79253a;
                        lx0Var.f79959c = this.f78860c;
                        mx0 mx0Var2 = new mx0(lx0Var);
                        this.f78867j = mx0Var2;
                        this.f78862e.a(mx0Var2);
                    }
                    this.f78868k = k0VarA.f79254b;
                    this.f78866i = (((long) k0VarA.f79255c) * 1000000) / ((long) this.f78867j.A);
                    this.f78859b.e(0);
                    this.f78862e.a(16, this.f78859b);
                    this.f78863f = 2;
                }
            } else if (i11 == 2) {
                int iMin2 = Math.min(i10, this.f78868k - this.f78864g);
                this.f78862e.a(iMin2, jb2Var);
                int i13 = this.f78864g + iMin2;
                this.f78864g = i13;
                int i14 = this.f78868k;
                if (i13 == i14) {
                    long j10 = this.f78869l;
                    if (j10 != -9223372036854775807L) {
                        this.f78862e.a(j10, 1, i14, 0, null);
                        this.f78869l += this.f78866i;
                    }
                    this.f78863f = 0;
                }
            }
        }
    }

    @Override // yads.ul0
    public final void b() {
    }

    public j0(String str) {
        byte[] bArr = new byte[16];
        this.f78858a = new ib2(bArr);
        this.f78859b = new jb2(bArr);
        this.f78863f = 0;
        this.f78864g = 0;
        this.f78865h = false;
        this.f78869l = -9223372036854775807L;
        this.f78860c = str;
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f78861d = l93Var.f79734e;
        l93Var.b();
        this.f78862e = pq0Var.a(l93Var.f79733d, 1);
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f78869l = j10;
        }
    }

    @Override // yads.ul0
    public final void a() {
        this.f78863f = 0;
        this.f78864g = 0;
        this.f78865h = false;
        this.f78869l = -9223372036854775807L;
    }
}
