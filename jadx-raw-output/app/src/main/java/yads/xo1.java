package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class xo1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f84654g = nj.s.n(co2.f76362m, co2.f76363n);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f84655h = nj.s.n(co2.f76364o, co2.f76365p, co2.D, co2.E);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f84656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f84657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f84658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wo1 f84659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jr1 f84660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tq2 f84661f;

    public /* synthetic */ xo1(d4 d4Var, lu2 lu2Var, v9 v9Var) {
        this(d4Var, lu2Var, v9Var, new wo1(), new jr1(), new tq2());
    }

    public final void a(Context context, qq1 qq1Var, Map map) {
        a(context, co2.f76355f, qq1Var, null, map);
    }

    public final void a(Context context, co2 co2Var, qq1 qq1Var, String str, Map map) {
        fo2 fo2VarA;
        wo1 wo1Var = this.f84659d;
        v9 v9Var = this.f84658c;
        d4 d4Var = this.f84656a;
        wo1Var.getClass();
        if ((v9Var != null ? v9Var.f83821m : null) == sz.NATIVE) {
            Object obj = v9Var.f83828t;
            fo2VarA = wo1Var.f84281b.a(v9Var, d4Var, obj instanceof d12 ? (d12) obj : null);
        } else {
            fo2VarA = wo1Var.f84280a.a(v9Var, d4Var);
        }
        this.f84660e.getClass();
        fo2 fo2VarA2 = go2.a(fo2VarA, jr1.a(qq1Var));
        fo2VarA2.f77471a.putAll(map);
        Map map2 = fo2VarA2.f77471a;
        c cVar = fo2VarA2.f77472b;
        String str2 = co2Var.f76376b;
        Map mapB = kotlin.collections.a.B(map2);
        eo2 eo2Var = new eo2(str2, mapB, cVar);
        ((iu3) this.f84657b).getClass();
        pu3 pu3Var = pu3.f81606a;
        cf.a(context, new cq3(((iu3) this.f84657b).f78817a)).a(eo2Var);
        new we(context).a(co2Var, mapB, str, qq1Var.f81935g);
    }

    public xo1(d4 d4Var, lu2 lu2Var, v9 v9Var, wo1 wo1Var, jr1 jr1Var, tq2 tq2Var) {
        this.f84656a = d4Var;
        this.f84657b = lu2Var;
        this.f84658c = v9Var;
        this.f84659d = wo1Var;
        this.f84660e = jr1Var;
        this.f84661f = tq2Var;
    }
}
