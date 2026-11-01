package yads;

/* JADX INFO: loaded from: classes6.dex */
public final class x21 implements ul0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m73 f84425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84426c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84429f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f84424a = new jb2(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f84427d = -9223372036854775807L;

    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        if (this.f84425b == null) {
            throw new IllegalStateException();
        }
        if (this.f84426c) {
            int i10 = jb2Var.f78968c - jb2Var.f78967b;
            int i11 = this.f84429f;
            if (i11 < 10) {
                int iMin = Math.min(i10, 10 - i11);
                System.arraycopy(jb2Var.f78966a, jb2Var.f78967b, this.f84424a.f78966a, this.f84429f, iMin);
                if (this.f84429f + iMin == 10) {
                    this.f84424a.e(0);
                    if (73 != this.f84424a.m() || 68 != this.f84424a.m() || 51 != this.f84424a.m()) {
                        ih1.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f84426c = false;
                        return;
                    } else {
                        jb2 jb2Var2 = this.f84424a;
                        jb2Var2.e(jb2Var2.f78967b + 3);
                        this.f84428e = this.f84424a.l() + 10;
                    }
                }
            }
            int iMin2 = Math.min(i10, this.f84428e - this.f84429f);
            this.f84425b.a(iMin2, jb2Var);
            this.f84429f += iMin2;
        }
    }

    @Override // yads.ul0
    public final void b() {
        int i10;
        m73 m73Var = this.f84425b;
        if (m73Var == null) {
            throw new IllegalStateException();
        }
        if (this.f84426c && (i10 = this.f84428e) != 0 && this.f84429f == i10) {
            long j10 = this.f84427d;
            if (j10 != -9223372036854775807L) {
                m73Var.a(j10, 1, i10, 0, null);
            }
            this.f84426c = false;
        }
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f79733d, 5);
        this.f84425b = m73VarA;
        lx0 lx0Var = new lx0();
        l93Var.b();
        lx0Var.f79957a = l93Var.f79734e;
        lx0Var.f79967k = "application/id3";
        m73VarA.a(new mx0(lx0Var));
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f84426c = true;
        if (j10 != -9223372036854775807L) {
            this.f84427d = j10;
        }
        this.f84428e = 0;
        this.f84429f = 0;
    }

    @Override // yads.ul0
    public final void a() {
        this.f84426c = false;
        this.f84427d = -9223372036854775807L;
    }
}
