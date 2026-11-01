package yads;

import android.os.SystemClock;
import android.view.View;
import com.ironsource.Q6;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class en2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e9 f77142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fn2 f77143c;

    public en2(fn2 fn2Var, e9 e9Var) {
        this.f77143c = fn2Var;
        this.f77142b = e9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listN;
        pi piVarA;
        String str;
        rn1 rn1VarD;
        if (this.f77143c.f77463d) {
            return;
        }
        e9 e9Var = this.f77142b;
        if (e9Var.f76987a.a()) {
            t12 t12Var = e9Var.f76988b;
            t12Var.f82864c.getClass();
            nt2 nt2VarA = t12Var.f82865d.a(t12Var.f82862a);
            if (nt2VarA == null || !nt2VarA.A || (((ny1) t12Var.f82863b).a(false) instanceof rb3)) {
                fn2 fn2Var = this.f77143c;
                fn2Var.f77463d = true;
                in2 in2Var = fn2Var.f77461b;
                kn2 kn2Var = in2Var.f78740c;
                if (kn2Var != null) {
                    kn2Var.f79486a = Long.valueOf(SystemClock.elapsedRealtime());
                }
                hn2 hn2Var = in2Var.f78741d;
                Iterator it = hn2Var.f78288a.iterator();
                while (it.hasNext()) {
                    za.a(hn2Var.f78289b, (String) it.next(), k83.f79337i);
                }
                gn2 gn2Var = hn2Var.f78290c;
                fo2 fo2VarA = gn2Var.f77870f.a(gn2Var.f77866b, gn2Var.f77865a);
                fo2VarA.b(bo2.f75924a, Q6.G1);
                m42 m42Var = gn2Var.f77871g;
                if (m42Var != null) {
                    Map map = m42Var.f80082a.a().f77471a;
                    nj njVar = m42Var.f80083b;
                    njVar.getClass();
                    HashMap map2 = new HashMap();
                    for (oi oiVar : njVar.f80675a) {
                        String str2 = oiVar.f81048a;
                        l12 l12Var = njVar.f80676b;
                        if (l12Var != null && (piVarA = l12Var.a(oiVar)) != null && piVarA.b()) {
                            HashMap map3 = new HashMap();
                            zk3 zk3VarC = piVarA.c();
                            if (zk3VarC != null) {
                                map3.put("width", Integer.valueOf(fa3.a(zk3VarC.f85467a)));
                                map3.put("height", Integer.valueOf(fa3.a(zk3VarC.f85468b)));
                            }
                            rj1 rj1Var = piVarA instanceof rj1 ? (rj1) piVarA : null;
                            if (rj1Var != null) {
                                sn1 sn1Var = rj1Var.f82289b;
                                rn1 rn1Var = (sn1Var == null || (rn1VarD = sn1Var.d()) == null) ? rj1Var.f82288a != null ? rn1.f82344f : null : rn1VarD;
                                if (rn1Var != null && (str = rn1Var.f82347b) != null) {
                                    map3.put("value_type", str);
                                }
                            }
                            map2.put(str2, map3);
                        }
                    }
                    l12 l12Var2 = njVar.f80676b;
                    View viewA = l12Var2 != null ? l12Var2.f79682c.a() : null;
                    Map mapD = nj.l0.d();
                    if (viewA != null) {
                        mapD.put("width", Integer.valueOf(fa3.a(viewA.getWidth())));
                        mapD.put("height", Integer.valueOf(fa3.a(viewA.getHeight())));
                    }
                    Map mapC = nj.l0.c(mapD);
                    if (!mapC.isEmpty()) {
                        map2.put("superview", mapC);
                    }
                    fo2VarA.f77471a.putAll(kotlin.collections.a.q(map, nj.l0.g(mj.h.a("assets", nj.l0.g(mj.h.a("rendered", map2))))));
                }
                a03 a03Var = gn2Var.f77865a.f76562d.f75685a;
                if (a03Var != null) {
                    fo2VarA.b(a03Var.b().f85668b, "size_type");
                    fo2VarA.b(Integer.valueOf(a03Var.getWidth()), "width");
                    fo2VarA.b(Integer.valueOf(a03Var.getHeight()), "height");
                }
                nt2 nt2Var = gn2Var.f77869e;
                if (nt2Var != null) {
                    fo2VarA.b(nt2Var.O, "banner_size_calculation_type");
                }
                int iOrdinal = gn2Var.f77867c.ordinal();
                if (iOrdinal == 0) {
                    listN = nj.s.n(co2.f76363n, co2.f76362m);
                } else if (iOrdinal == 1) {
                    listN = nj.r.e(co2.f76363n);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listN = nj.r.e(co2.f76362m);
                }
                Iterator it2 = listN.iterator();
                while (it2.hasNext()) {
                    gn2Var.f77868d.a(new eo2(((co2) it2.next()).f76376b, kotlin.collections.a.B(fo2VarA.f77471a), fo2VarA.f77472b));
                }
                f5 f5Var = in2Var.f78738a;
                String str3 = f5Var.f77302a.f76874a;
                if (str3 != null && str3.length() != 0) {
                    e5 e5Var = f5Var.f77303b;
                    e5Var.getClass();
                    synchronized (e5.f76915c) {
                        e5Var.f76917a.remove(str3);
                        e5Var.f76917a.add(str3);
                    }
                }
                in2Var.f78739b.f();
                return;
            }
        }
        fn2 fn2Var2 = this.f77143c;
        fn2Var2.f77462c.postDelayed(new en2(fn2Var2, this.f77142b), 300L);
    }
}
