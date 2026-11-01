package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import yads.mo;
import yads.s63;

/* JADX INFO: loaded from: classes7.dex */
public final class in1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ye2 f78726a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hn1 f78730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bn1 f78731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ok0 f78732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f78733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f78734i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f78736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r83 f78737l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sy2 f78735j = new sy2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f78728c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f78729d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f78727b = new ArrayList();

    public final s63 a(int i10, List list, sy2 sy2Var) {
        if (!list.isEmpty()) {
            this.f78735j = sy2Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                gn1 gn1Var = (gn1) list.get(i11 - i10);
                if (i11 > 0) {
                    gn1 gn1Var2 = (gn1) this.f78727b.get(i11 - 1);
                    gn1Var.f77863d = gn1Var2.f77860a.f83930o.f81642c.b() + gn1Var2.f77863d;
                    gn1Var.f77864e = false;
                    gn1Var.f77862c.clear();
                } else {
                    gn1Var.f77863d = 0;
                    gn1Var.f77864e = false;
                    gn1Var.f77862c.clear();
                }
                int iB = gn1Var.f77860a.f83930o.f81642c.b();
                for (int i12 = i11; i12 < this.f78727b.size(); i12++) {
                    ((gn1) this.f78727b.get(i12)).f77863d += iB;
                }
                this.f78727b.add(i11, gn1Var);
                this.f78729d.put(gn1Var.f77861b, gn1Var);
                if (this.f78736k) {
                    a(gn1Var);
                    if (this.f78728c.isEmpty()) {
                        this.f78734i.add(gn1Var);
                    } else {
                        fn1 fn1Var = (fn1) this.f78733h.get(gn1Var);
                        if (fn1Var != null) {
                            fn1Var.f77457a.a(fn1Var.f77458b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public in1(hn1 hn1Var, se seVar, Handler handler, ye2 ye2Var) {
        this.f78726a = ye2Var;
        this.f78730e = hn1Var;
        bn1 bn1Var = new bn1();
        this.f78731f = bn1Var;
        ok0 ok0Var = new ok0();
        this.f78732g = ok0Var;
        this.f78733h = new HashMap();
        this.f78734i = new HashSet();
        bn1Var.a(handler, seVar);
        ok0Var.a(handler, seVar);
    }

    public final s63 a() {
        if (this.f78727b.isEmpty()) {
            return s63.f82545b;
        }
        int iB = 0;
        for (int i10 = 0; i10 < this.f78727b.size(); i10++) {
            gn1 gn1Var = (gn1) this.f78727b.get(i10);
            gn1Var.f77863d = iB;
            iB += gn1Var.f77860a.f83930o.f81642c.b();
        }
        return new xf2(this.f78727b, this.f78735j);
    }

    public final void a(mo moVar, s63 s63Var) {
        ((go0) this.f78730e).f77880i.f78499a.sendEmptyMessage(22);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(gn1 gn1Var) {
        vi1 vi1Var = gn1Var.f77860a;
        zm1 zm1Var = new zm1() { // from class: cp.e3
            @Override // yads.zm1
            public final void a(mo moVar, s63 s63Var) {
                this.f51300a.a(moVar, s63Var);
            }
        };
        en1 en1Var = new en1(this, gn1Var);
        this.f78733h.put(gn1Var, new fn1(vi1Var, zm1Var, en1Var));
        Handler handlerB = ib3.b((Handler.Callback) null);
        vi1Var.getClass();
        bn1 bn1Var = vi1Var.f80295c;
        bn1Var.getClass();
        bn1Var.f75912c.add(new an1(handlerB, en1Var));
        Handler handlerB2 = ib3.b((Handler.Callback) null);
        ok0 ok0Var = vi1Var.f80296d;
        ok0Var.getClass();
        ok0Var.f81064c.add(new nk0(handlerB2, en1Var));
        r83 r83Var = this.f78737l;
        ye2 ye2Var = this.f78726a;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = vi1Var.f80297e;
        if (looper != null && looper != looperMyLooper) {
            throw new IllegalArgumentException();
        }
        vi1Var.f80299g = ye2Var;
        s63 s63Var = vi1Var.f80298f;
        vi1Var.f80293a.add(zm1Var);
        if (vi1Var.f80297e == null) {
            vi1Var.f80297e = looperMyLooper;
            vi1Var.f80294b.add(zm1Var);
            vi1Var.a(r83Var);
        } else if (s63Var != null) {
            vi1Var.b(zm1Var);
            zm1Var.a(vi1Var, s63Var);
        }
    }

    public final void a(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            gn1 gn1Var = (gn1) this.f78727b.remove(i12);
            this.f78729d.remove(gn1Var.f77861b);
            int i13 = -gn1Var.f77860a.f83930o.f81642c.b();
            for (int i14 = i12; i14 < this.f78727b.size(); i14++) {
                ((gn1) this.f78727b.get(i14)).f77863d += i13;
            }
            gn1Var.f77864e = true;
            if (this.f78736k && gn1Var.f77862c.isEmpty()) {
                fn1 fn1Var = (fn1) this.f78733h.remove(gn1Var);
                fn1Var.getClass();
                fn1Var.f77457a.c(fn1Var.f77458b);
                fn1Var.f77457a.a((cn1) fn1Var.f77459c);
                fn1Var.f77457a.a((pk0) fn1Var.f77459c);
                this.f78734i.remove(gn1Var);
            }
        }
    }
}
