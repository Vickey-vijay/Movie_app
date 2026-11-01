package yads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p32 {
    public final nj A;
    public final g83 B;
    public final z72 C;
    public final t20 D;
    public final uz1 E;
    public final String F;
    public final tw1 G;
    public final a83 H;
    public final x3 I;
    public final gv J;
    public final vi K;
    public l12 L;
    public final m32 M;
    public final List N;
    public final d42 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f81215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz1 f81216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j72 f81217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j52 f81218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l72 f81219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lu2 f81220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xz1 f81221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d4 f81222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v9 f81223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d12 f81224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final my2 f81225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h32 f81226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i10 f81227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p53 f81228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x51 f81229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oq f81230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n12 f81231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ao1 f81232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cj f81233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c61 f81234t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final jn2 f81235u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final bq f81236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wp0 f81237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final hy1 f81238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final km2 f81239y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final xp0 f81240z;

    public /* synthetic */ p32(Context context, up upVar, fz1 fz1Var) {
        j72 j72VarH = upVar.h();
        j52 j52VarG = upVar.g();
        l72 l72VarI = upVar.i();
        ry1 ry1VarD = upVar.d();
        lu2 lu2VarJ = upVar.j();
        xz1 xz1VarE = upVar.e();
        f32 f32VarC = upVar.c();
        t12 t12VarB = upVar.b();
        fy1 fy1VarF = upVar.f();
        va vaVarA = upVar.a();
        d4 d4VarA = ry1VarD.a();
        e00 e00VarA = d4VarA.a();
        v9 v9VarB = ry1VarD.b();
        d12 d12VarC = ry1VarD.c();
        List listB = l72VarI.b();
        String strA = l72VarI.a();
        my2 my2VarB = d12VarC.b();
        h32 h32Var = new h32();
        i10 i10Var = new i10(h32Var);
        p53 p53Var = new p53();
        x51 x51Var = new x51();
        g92 g92Var = new g92();
        wc2 wc2VarA = wc2.f84159h.a(context);
        kn2 kn2Var = new kn2();
        oq oqVar = new oq();
        a61 a61Var = new a61();
        o5 o5VarA = xz1VarE.a();
        Object obj = n12.f80510b;
        n12 n12VarA = m12.a();
        ao1 ao1Var = new ao1(context, d4VarA, lu2VarJ);
        e9 e9Var = new e9(new w12(j52VarG), t12VarB);
        cj cjVar = new cj(listB);
        this(context, fz1Var, j72VarH, j52VarG, l72VarI, lu2VarJ, xz1VarE, f32VarC, fy1VarF, vaVarA, d4VarA, v9VarB, d12VarC, listB, my2VarB, h32Var, i10Var, p53Var, x51Var, g92Var, wc2VarA, kn2Var, oqVar, a61Var, n12VarA, ao1Var, e9Var, cjVar, new e42(cjVar), new c61(context, v9VarB, d4VarA, lu2VarJ, l72VarI.c()), new jn2(listB), new bq(o5VarA, e00VarA, v9VarB, strA, ((iu3) lu2VarJ).a()), new wp0(context, lu2VarJ, o5VarA, e00VarA, v9VarB, strA), new hy1(context, lu2VarJ, o5VarA, e00VarA, strA), new km2(context, lu2VarJ, o5VarA, e00VarA, v9VarB, strA), new xp0(listB), new nj(listB), new f5(new e02(strA)), new g83(), new z72(d4VarA, v9VarB, listB), new t20(context, d4VarA, lu2VarJ, fy1VarF != null ? fy1VarF.a() : null));
    }

    public final d12 b() {
        return this.f81224j;
    }

    public abstract void loadImages();

    public final void a(View view, mi2 mi2Var, z12 z12Var) throws j02 {
        p32 p32Var;
        n12 n12Var = this.f81231q;
        n12Var.getClass();
        synchronized (n12.f80510b) {
            p32Var = (p32) n12Var.f80512a.get(view);
        }
        if (ck.p.e(this, p32Var)) {
            return;
        }
        if (p32Var != null) {
            p32Var.f();
        }
        a(this, this.f81231q);
        this.f81231q.a(view, this);
        a(new l12(z12Var, this.f81222h, this.f81220f, mi2Var, this.f81229o, this.f81221g, this.f81233s, this.O, this.f81226l, this.f81223i, this.f81219e, this.f81216b, this.f81232r, this.f81225k, this.D, yf0.f84931b));
        a(view);
    }

    public final void b(l12 l12Var) {
        this.f81217c.a(l12Var, this.J);
        boolean z10 = ck.p.e(this.f81223i.b(), r32.f82092c.a()) || ck.p.e(this.f81223i.b(), r32.f82093d.a());
        if (this.C.a() && !z10) {
            loadImages();
        }
        List list = this.f81235u.f79129a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            pi piVarA = l12Var.a((oi) obj);
            if (piVarA != null && piVarA.b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((oi) it.next()).f81048a);
        }
        this.f81238x.a(arrayList2, co2.f76374y);
        boolean z11 = ad1.f75480a;
        g();
    }

    public final d42 c() {
        return this.O;
    }

    public final List d() {
        return this.N;
    }

    public final void destroy() {
        l12 l12Var = this.L;
        if (l12Var != null) {
            for (pi piVar : l12Var.f79683d.values()) {
                if (piVar != null) {
                    piVar.destroy();
                }
            }
        }
    }

    public final j52 e() {
        return this.f81218d;
    }

    public final void g() {
        View viewB;
        l12 l12Var = this.L;
        boolean z10 = (l12Var == null || (viewB = l12Var.b()) == null || !viewB.isAttachedToWindow()) ? false : true;
        boolean z11 = ad1.f75480a;
        if (z10) {
            this.H.a(this.f81215a, this.M, this.L);
        }
    }

    public final void h() {
        boolean z10 = ad1.f75480a;
        this.H.a(this.M);
    }

    public final void f() {
        h();
        g83 g83Var = this.B;
        Context context = this.f81215a;
        h83 h83Var = g83Var.f77694d;
        if (h83Var != null) {
            ((z0) h83Var.f78099b).b(context, h83Var);
        }
        g83Var.f77694d = null;
        u12 u12Var = g83Var.f77695e;
        if (u12Var != null) {
            u12Var.b();
        }
        g83Var.f77695e = null;
        l12 l12Var = this.L;
        if (l12Var != null) {
            this.f81217c.a(l12Var);
            this.H.a(l12Var);
            this.A.f80676b = null;
        }
    }

    public final void a(l12 l12Var) throws j02 {
        l12Var.a();
        this.f81239y.a();
        this.f81230p.getClass();
        Map map = l12Var.f79683d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            pi piVar = (pi) entry.getValue();
            if (piVar != null && piVar.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        this.f81238x.a(arrayList, co2.f76373x);
        List list = this.f81240z.f84666a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((oi) obj).f81053f) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            pi piVarA = l12Var.a((oi) obj2);
            if (piVarA == null || !piVarA.b()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(nj.t.v(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((oi) it2.next()).f81048a);
        }
        if (!arrayList4.isEmpty()) {
            wp0 wp0Var = this.f81237w;
            fo2 fo2VarA = wp0Var.f84283b.a();
            fo2VarA.b("no_view_for_asset", "reason");
            fo2VarA.b(arrayList4, "assets");
            Map map2 = wp0Var.f84282a.f83829u;
            if (map2 != null) {
                fo2VarA.f77471a.putAll(map2);
            }
            c cVar = wp0Var.f84282a.f83817i;
            fo2VarA.f77472b = cVar;
            wp0Var.f84284c.a(new eo2(co2.B.a(), kotlin.collections.a.B(fo2VarA.f77471a), cVar));
        }
        this.L = l12Var;
        this.A.a(l12Var);
        ((k12) this.f81218d).a(l12Var);
        kp2 kp2VarB = ((k12) this.f81218d).b();
        if (kp2VarB.a()) {
            this.f81217c.a(l12Var);
            b(l12Var);
            return;
        }
        String strB = kp2VarB.b();
        this.f81236v.a(strB);
        ck.w wVar = ck.w.f6066a;
        String str = String.format("Resource for required view " + strB + " is not present", Arrays.copyOf(new Object[0], 0));
        ck.p.i(str, "format(...)");
        throw new j02(str);
    }

    public p32(Context context, fz1 fz1Var, j72 j72Var, j52 j52Var, l72 l72Var, lu2 lu2Var, xz1 xz1Var, f32 f32Var, fy1 fy1Var, va vaVar, d4 d4Var, v9 v9Var, d12 d12Var, List list, my2 my2Var, h32 h32Var, i10 i10Var, p53 p53Var, x51 x51Var, g92 g92Var, wc2 wc2Var, kn2 kn2Var, oq oqVar, a61 a61Var, n12 n12Var, ao1 ao1Var, e9 e9Var, cj cjVar, e42 e42Var, c61 c61Var, jn2 jn2Var, bq bqVar, wp0 wp0Var, hy1 hy1Var, km2 km2Var, xp0 xp0Var, nj njVar, f5 f5Var, g83 g83Var, z72 z72Var, t20 t20Var) {
        this.f81215a = context;
        this.f81216b = fz1Var;
        this.f81217c = j72Var;
        this.f81218d = j52Var;
        this.f81219e = l72Var;
        this.f81220f = lu2Var;
        this.f81221g = xz1Var;
        this.f81222h = d4Var;
        this.f81223i = v9Var;
        this.f81224j = d12Var;
        this.f81225k = my2Var;
        this.f81226l = h32Var;
        this.f81227m = i10Var;
        this.f81228n = p53Var;
        this.f81229o = x51Var;
        this.f81230p = oqVar;
        this.f81231q = n12Var;
        this.f81232r = ao1Var;
        this.f81233s = cjVar;
        this.f81234t = c61Var;
        this.f81235u = jn2Var;
        this.f81236v = bqVar;
        this.f81237w = wp0Var;
        this.f81238x = hy1Var;
        this.f81239y = km2Var;
        this.f81240z = xp0Var;
        this.A = njVar;
        this.B = g83Var;
        this.C = z72Var;
        this.D = t20Var;
        uz1 uz1VarA = xz1Var.b().a(context, d4Var, v9Var);
        this.E = uz1VarA;
        String strA = tb.a(this);
        this.F = strA;
        this.M = new m32(this);
        n32 n32Var = new n32(this);
        this.N = d12Var.a();
        this.O = e42Var.a();
        a61Var.getClass();
        z51 z51VarA = a61.a(context, uz1VarA, c61Var, f5Var, x51Var);
        List listE = l72Var.e();
        z51VarA.a(listE, l72Var.c());
        x3 x3Var = new x3(context, lu2Var, v9Var, d4Var, uz1VarA, p53Var);
        this.I = x3Var;
        this.J = new gv(x3Var, kn2Var, x51Var);
        tw1 tw1VarA = g92Var.a(context, d4Var, lu2Var, c61Var, n32Var, strA, vaVar);
        this.G = tw1VarA;
        f32Var.a(x51Var);
        x51Var.a(new e92(tw1VarA));
        a83 a83VarA = xz1Var.d().a(tw1VarA, new in2(context, e9Var, v9Var, d4Var, lu2Var, vaVar, f5Var, x51Var, kn2Var, l72Var.d()), new l61(j52Var, listE), wc2Var);
        this.H = a83VarA;
        a83VarA.a(x51Var);
        a83VarA.a(v9Var, listE);
        this.K = new vi(list, x3Var, kn2Var, x51Var, fy1Var != null ? fy1Var.a() : null);
    }

    public void a(z00 z00Var) {
        this.E.f83701a.f84386b = z00Var;
    }

    public final void a(i22 i22Var) {
        this.I.f84436g.f85659e = i22Var;
        this.f81234t.f76185h = i22Var;
        f1 f1Var = this.E.f83702b;
        f1Var.f77264g = i22Var;
        f1Var.f77263f.f76876b.f78445k = i22Var;
        this.H.a(new m42(i22Var, this.A));
        this.f81236v.f75929c.f78674e = i22Var;
        this.f81237w.f84283b.f78674e = i22Var;
        this.f81238x.f78414b.f78674e = i22Var;
        this.f81239y.f79475c.f78674e = i22Var;
    }

    public final void a(View view) {
        z0 z0Var;
        g83 g83Var = this.B;
        o32 o32Var = new o32(this);
        g83Var.getClass();
        Context context = view.getContext();
        h83 h83Var = g83Var.f77694d;
        if (h83Var != null) {
            ((z0) h83Var.f78099b).b(context, h83Var);
        }
        Activity activity = null;
        g83Var.f77694d = null;
        u12 u12Var = g83Var.f77695e;
        if (u12Var != null) {
            u12Var.b();
        }
        g83Var.f77695e = null;
        a1 a1Var = g83Var.f77691a;
        Context context2 = view.getContext();
        a1Var.getClass();
        int i10 = 0;
        while (context2 instanceof ContextWrapper) {
            int i11 = i10 + 1;
            if (i10 >= 10) {
                break;
            }
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
                i10 = i11;
            }
        }
        if (activity != null) {
            g83Var.f77693c.getClass();
            Object obj = z0.f85159f;
            z0 z0Var2 = z0.f85160g;
            if (z0Var2 == null) {
                synchronized (z0.f85159f) {
                    z0Var = z0.f85160g;
                    if (z0Var == null) {
                        z0Var = new z0();
                        z0.f85160g = z0Var;
                    }
                }
                z0Var2 = z0Var;
            }
            h83 h83Var2 = new h83(activity, o32Var, z0Var2);
            g83Var.f77694d = h83Var2;
            z0Var2.a(activity, h83Var2);
        }
        g83Var.f77692b.getClass();
        u12 u12Var2 = new u12(view, o32Var, new p12());
        g83Var.f77695e = u12Var2;
        u12Var2.a();
    }

    public static void a(p32 p32Var, n12 n12Var) {
        boolean z10;
        n12Var.getClass();
        synchronized (n12.f80510b) {
            Iterator it = n12Var.f80512a.entrySet().iterator();
            z10 = false;
            while (it.hasNext()) {
                if (((p32) ((Map.Entry) it.next()).getValue()) == p32Var) {
                    it.remove();
                    z10 = true;
                }
            }
        }
        if (z10) {
            p32Var.f();
        }
    }

    public final void a(View view, mi2 mi2Var, z12 z12Var, pu puVar) {
        p32 p32Var;
        Object obj = n12.f80510b;
        n12 n12VarA = m12.a();
        synchronized (n12.f80510b) {
            p32Var = (p32) n12VarA.f80512a.get(view);
        }
        if (ck.p.e(this, p32Var)) {
            return;
        }
        if (p32Var != null) {
            p32Var.f();
        }
        a(this, n12VarA);
        n12VarA.a(view, this);
        l12 l12Var = new l12(z12Var, this.f81222h, this.f81220f, mi2Var, this.f81229o, this.f81221g, this.f81233s, this.O, this.f81226l, this.f81223i, this.f81219e, this.f81216b, this.f81232r, this.f81225k, this.D, puVar.f81592a);
        l12Var.a();
        this.L = l12Var;
        this.A.f80676b = l12Var;
        ((k12) this.f81218d).a(l12Var);
        this.f81217c.a(l12Var);
        vi viVar = this.K;
        puVar.f81593b = new ui(viVar.f83919a, viVar.f83920b, l12Var, viVar.f83921c, viVar.f83922d, viVar.f83923e);
        b(l12Var);
        a(view);
    }
}
