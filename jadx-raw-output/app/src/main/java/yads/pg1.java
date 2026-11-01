package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class pg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg f81408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv2 f81409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pr1 f81410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ez f81411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x30 f81412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jh1 f81413f;

    public final b80 a() {
        t80 t80Var;
        String strD;
        String strC;
        c80 c80Var;
        m50 m50VarA = this.f81408a.a();
        cv2 cv2Var = this.f81409b;
        au1 au1Var = cv2Var.f76449b;
        Context context = cv2Var.f76448a;
        au1Var.getClass();
        zt1 zt1VarA = au1.a(context);
        boolean z10 = false;
        if (ck.p.e(zt1VarA, xt1.f84685a)) {
            t80Var = new t80(true, nj.s.k());
        } else {
            if (!(zt1VarA instanceof yt1)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((yt1) zt1VarA).f85110a;
            ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ub1) it.next()).getMessage());
            }
            t80Var = new t80(false, arrayList);
        }
        pr1 pr1Var = this.f81410c;
        pr1Var.getClass();
        String str = pq1.f81538d;
        ArrayList arrayListA = pr1Var.f81553a.a(mq1.a());
        ez ezVar = this.f81411d;
        boolean zA = ezVar.f77228a.a();
        Boolean boolB = ezVar.f77228a.b();
        Boolean boolD = ezVar.f77228a.d();
        String strB = ((zw) ezVar.f77229b).b();
        if ((strB != null && !lk.a0.n0(strB)) || (((strD = ((zw) ezVar.f77229b).d()) != null && !lk.a0.n0(strD)) || ((strC = ((zw) ezVar.f77229b).c()) != null && !lk.a0.n0(strC)))) {
            z10 = true;
        }
        t50 t50Var = new t50(zA, boolB, boolD, z10);
        u70 u70Var = new u70(this.f81412e.f84440a.c());
        jh1 jh1Var = this.f81413f;
        jh1Var.getClass();
        synchronized (jh1.f79045c) {
            c80Var = !eu1.f77193b ? null : new c80(jh1Var.f79046a.b(), jh1Var.f79047b.b());
        }
        return new b80(m50VarA, t80Var, arrayListA, t50Var, u70Var, c80Var);
    }

    public pg1(kg kgVar, cv2 cv2Var, pr1 pr1Var, ez ezVar, x30 x30Var, jh1 jh1Var) {
        this.f81408a = kgVar;
        this.f81409b = cv2Var;
        this.f81410c = pr1Var;
        this.f81411d = ezVar;
        this.f81412e = x30Var;
        this.f81413f = jh1Var;
    }
}
