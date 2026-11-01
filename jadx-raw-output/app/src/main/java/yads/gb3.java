package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f77724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m73[] f77725b;

    public final void a(pq0 pq0Var, l93 l93Var) {
        for (int i10 = 0; i10 < this.f77725b.length; i10++) {
            l93Var.a();
            l93Var.b();
            m73 m73VarA = pq0Var.a(l93Var.f79733d, 3);
            mx0 mx0Var = (mx0) this.f77724a.get(i10);
            String str = mx0Var.f80429m;
            ni.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            lx0 lx0Var = new lx0();
            l93Var.b();
            lx0Var.f79957a = l93Var.f79734e;
            lx0Var.f79967k = str;
            lx0Var.f79960d = mx0Var.f80421e;
            lx0Var.f79959c = mx0Var.f80420d;
            lx0Var.C = mx0Var.E;
            lx0Var.f79969m = mx0Var.f80431o;
            m73VarA.a(new mx0(lx0Var));
            this.f77725b[i10] = m73VarA;
        }
    }

    public gb3(List list) {
        this.f77724a = list;
        this.f77725b = new m73[list.size()];
    }
}
