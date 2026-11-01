package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class f93 implements rw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib2 f77338a = new ib2(new byte[4]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h93 f77339b;

    @Override // yads.rw2
    public final void a(y63 y63Var, pq0 pq0Var, l93 l93Var) {
    }

    public f93(h93 h93Var) {
        this.f77339b = h93Var;
    }

    @Override // yads.rw2
    public final void a(jb2 jb2Var) {
        if (jb2Var.m() != 0 || (jb2Var.m() & 128) == 0) {
            return;
        }
        jb2Var.e(jb2Var.f78967b + 6);
        int i10 = (jb2Var.f78968c - jb2Var.f78967b) / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            ib2 ib2Var = this.f77338a;
            jb2Var.a(ib2Var.f78552a, 0, 4);
            ib2Var.b(0);
            int iA = this.f77338a.a(16);
            this.f77338a.c(3);
            if (iA == 0) {
                this.f77338a.c(13);
            } else {
                int iA2 = this.f77338a.a(13);
                if (this.f77339b.f78133g.get(iA2) == null) {
                    h93 h93Var = this.f77339b;
                    h93Var.f78133g.put(iA2, new sw2(new g93(h93Var, iA2)));
                    this.f77339b.f78139m++;
                }
            }
        }
        h93 h93Var2 = this.f77339b;
        if (h93Var2.f78127a != 2) {
            h93Var2.f78133g.remove(0);
        }
    }
}
