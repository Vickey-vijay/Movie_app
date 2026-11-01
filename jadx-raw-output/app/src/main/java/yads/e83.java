package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e83 implements c92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c61 f76981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e61 f76982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f76983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f76985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f76986f;

    public final Map a(rb3 rb3Var) {
        Map mapD = nj.l0.d();
        mapD.put("failure_tracked", Boolean.valueOf(this.f76985e));
        if (!rb3Var.f82176a.isEmpty()) {
            List list = rb3Var.f82176a;
            ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((sb3) it.next()).f82590b);
            }
            mapD.put("warnings", arrayList);
        }
        return nj.l0.c(mapD);
    }

    @Override // yads.c92
    public final void invalidate() {
        this.f76983c = false;
        this.f76984d = 0;
        this.f76985e = false;
        this.f76986f = false;
    }

    public e83(c61 c61Var, e61 e61Var) {
        this.f76981a = c61Var;
        this.f76982b = e61Var;
    }

    @Override // yads.c92
    public final void a(qy2 qy2Var, qb3 qb3Var) {
        int i10 = this.f76984d + 1;
        this.f76984d = i10;
        if (i10 == 20) {
            this.f76985e = true;
            c61 c61Var = this.f76981a;
            c61Var.a(this.f76982b.f76938c, c61Var.a(qb3Var));
        }
    }

    @Override // yads.c92
    public final void a(List list) {
        h92 h92Var = (h92) nj.b0.h0(list);
        if (h92Var == null) {
            return;
        }
        c61 c61Var = this.f76981a;
        c61Var.a(this.f76982b.f76939d, c61Var.a(h92Var.f78126b));
    }

    @Override // yads.c92
    public final void a(qy2 qy2Var, List list, rb3 rb3Var) {
        if (this.f76986f) {
            return;
        }
        this.f76986f = true;
        Map mapA = a(rb3Var);
        c61 c61Var = this.f76981a;
        co2 co2Var = this.f76982b.f76936a;
        fo2 fo2VarA = c61Var.a();
        fo2VarA.f77471a.putAll(mapA);
        c61Var.a(co2Var, fo2VarA);
    }

    @Override // yads.c92
    public final void a(qy2 qy2Var, rb3 rb3Var) {
        if (this.f76983c) {
            return;
        }
        this.f76983c = true;
        Map mapA = a(rb3Var);
        c61 c61Var = this.f76981a;
        co2 co2Var = this.f76982b.f76937b;
        fo2 fo2VarA = c61Var.a();
        fo2VarA.f77471a.putAll(mapA);
        c61Var.a(co2Var, fo2VarA);
    }

    @Override // yads.c92
    public final void a(v9 v9Var) {
        this.f76981a.f76178a = v9Var;
    }
}
