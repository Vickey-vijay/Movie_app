package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class uj3 extends n53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f83506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f83507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f83509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f83510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83511g;

    public final boolean a(jb2 jb2Var) throws m53 {
        int iM = jb2Var.m();
        int i10 = (iM >> 4) & 15;
        int i11 = iM & 15;
        if (i11 != 7) {
            throw new m53(mg2.a("Video format not supported: ", i11));
        }
        this.f83511g = i10;
        return i10 != 5;
    }

    public uj3(m73 m73Var) {
        super(m73Var);
        this.f83506b = new jb2(dy1.f76843a);
        this.f83507c = new jb2(4);
    }

    public final boolean a(long j10, jb2 jb2Var) throws ob2 {
        int iM = jb2Var.m();
        byte[] bArr = jb2Var.f78966a;
        int i10 = jb2Var.f78967b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | (((bArr[i10] & 255) << 24) >> 8);
        int i13 = i10 + 3;
        jb2Var.f78967b = i13;
        long j11 = (((long) ((bArr[i11] & 255) | i12)) * 1000) + j10;
        if (iM == 0 && !this.f83509e) {
            byte[] bArr2 = new byte[jb2Var.f78968c - i13];
            jb2 jb2Var2 = new jb2(bArr2);
            jb2Var.a(bArr2, 0, jb2Var.f78968c - jb2Var.f78967b);
            ul ulVarA = ul.a(jb2Var2);
            this.f83508d = ulVarA.f83527b;
            lx0 lx0Var = new lx0();
            lx0Var.f79967k = "video/avc";
            lx0Var.f79964h = ulVarA.f83531f;
            lx0Var.f79972p = ulVarA.f83528c;
            lx0Var.f79973q = ulVarA.f83529d;
            lx0Var.f79976t = ulVarA.f83530e;
            lx0Var.f79969m = ulVarA.f83526a;
            this.f80565a.a(new mx0(lx0Var));
            this.f83509e = true;
            return false;
        }
        if (iM != 1 || !this.f83509e) {
            return false;
        }
        int i14 = this.f83511g == 1 ? 1 : 0;
        if (!this.f83510f && i14 == 0) {
            return false;
        }
        byte[] bArr3 = this.f83507c.f78966a;
        bArr3[0] = 0;
        bArr3[1] = 0;
        bArr3[2] = 0;
        int i15 = 4 - this.f83508d;
        int i16 = 0;
        while (jb2Var.f78968c - jb2Var.f78967b > 0) {
            jb2Var.a(this.f83507c.f78966a, i15, this.f83508d);
            this.f83507c.e(0);
            int iP = this.f83507c.p();
            this.f83506b.e(0);
            this.f80565a.a(4, this.f83506b);
            this.f80565a.a(iP, jb2Var);
            i16 = i16 + 4 + iP;
        }
        this.f80565a.a(j11, i14, i16, 0, null);
        this.f83510f = true;
        return true;
    }
}
