package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e92 implements jx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f92 f76990a;

    @Override // yads.jx0
    public final void a() {
        tw1 tw1Var = (tw1) this.f76990a;
        synchronized (tw1Var) {
            tw1Var.f83228m.size();
            boolean z10 = ad1.f75480a;
            tw1Var.b();
            ArrayList arrayList = new ArrayList();
            Iterator it = tw1Var.f83228m.iterator();
            while (it.hasNext()) {
                c83 c83Var = (c83) it.next();
                tb3 tb3VarA = tw1Var.a(c83Var);
                if (tb3VarA instanceof rb3) {
                    it.remove();
                    tw1Var.a(c83Var, (rb3) tb3VarA);
                } else if (tb3VarA instanceof qb3) {
                    qb3 qb3Var = (qb3) tb3VarA;
                    tw1Var.f83217b.a(c83Var.f76212d, qb3Var);
                    arrayList.add(new h92(c83Var, qb3Var));
                }
            }
            tw1Var.f83217b.a(arrayList);
            tw1Var.a();
        }
    }

    public e92(tw1 tw1Var) {
        this.f76990a = tw1Var;
    }
}
