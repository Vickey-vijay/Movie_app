package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes11.dex */
public final class r72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f82137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bo3 f82138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wm1 f82139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qw1 f82140d;

    public /* synthetic */ r72(w5 w5Var) {
        this(w5Var, new bo3());
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x0156  */
    /* JADX WARN: Code duplicated, block: B:56:0x015b A[LOOP:0: B:48:0x010d->B:56:0x015b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(Context context, ry1 ry1Var, rj.c cVar) throws Throwable {
        q72 q72Var;
        Set setV;
        r72 r72Var;
        Object objG;
        w5 w5Var;
        ry1 ry1Var2;
        v5 v5Var;
        r72 r72Var2;
        Context context2;
        Iterator it;
        r72 r72Var3;
        Object objG2;
        Context context3 = context;
        ry1 ry1Var3 = ry1Var;
        if (cVar instanceof q72) {
            q72Var = (q72) cVar;
            int i10 = q72Var.f81741j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                q72Var.f81741j = i10 - Integer.MIN_VALUE;
            } else {
                q72Var = new q72(this, cVar);
            }
        } else {
            q72Var = new q72(this, cVar);
        }
        Object obj = q72Var.f81739h;
        Object objF = sj.a.f();
        int i11 = q72Var.f81741j;
        int i12 = 2;
        if (i11 != 0) {
            if (i11 == 1) {
                Set set = (Set) q72Var.f81736e;
                ry1Var3 = q72Var.f81735d;
                Context context4 = q72Var.f81734c;
                r72 r72Var4 = q72Var.f81733b;
                kotlin.c.b(obj);
                setV = set;
                context3 = context4;
                r72Var = r72Var4;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = q72Var.f81738g;
                v5Var = q72Var.f81737f;
                w5Var = (w5) q72Var.f81736e;
                ry1Var2 = q72Var.f81735d;
                Context context5 = q72Var.f81734c;
                r72 r72Var5 = q72Var.f81733b;
                kotlin.c.b(obj);
                context2 = context5;
                r72Var2 = r72Var5;
            }
            while (it.hasNext()) {
                oj1 oj1Var = (oj1) it.next();
                qw1 qw1Var = r72Var2.f82140d;
                v9 v9Var = ry1Var2.f82467b;
                q72Var.f81733b = r72Var2;
                q72Var.f81734c = context2;
                q72Var.f81735d = ry1Var2;
                q72Var.f81736e = w5Var;
                q72Var.f81737f = v5Var;
                q72Var.f81738g = it;
                q72Var.f81741j = i12;
                qw1Var.getClass();
                r72Var3 = r72Var2;
                objG2 = nk.h.g(nk.w0.c().n(), new pw1(context2, oj1Var, oj1Var.f81054a, qw1Var, v9Var, v9Var.D, null), q72Var);
                if (objG2 != sj.a.f()) {
                    objG2 = mj.r.f64562a;
                }
                if (objG2 == objF) {
                    return objF;
                }
                r72Var2 = r72Var3;
                i12 = 2;
            }
            mj.r rVar = mj.r.f64562a;
            w5Var.a(v5Var);
            return rVar;
        }
        kotlin.c.b(obj);
        wm1 wm1Var = this.f82139c;
        wm1Var.getClass();
        setV = SequencesKt___SequencesKt.V(SequencesKt___SequencesKt.B(SequencesKt___SequencesKt.K(SequencesKt___SequencesKt.E(nj.b0.S(ry1Var3.f82466a.f76509a), new um1(wm1Var)), vm1.f83955b)));
        Object obj2 = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context3);
        int i13 = nt2VarA != null ? nt2VarA.f80757b : 0;
        if (!tb.a(context) || i13 == 0 || setV.isEmpty()) {
            return mj.r.f64562a;
        }
        nt2 nt2VarA2 = cw2.a().a(context3);
        if (nt2VarA2 != null && nt2VarA2.F0) {
            bo3 bo3Var = this.f82138b;
            q72Var.f81733b = this;
            q72Var.f81734c = context3;
            q72Var.f81735d = ry1Var3;
            q72Var.f81736e = setV;
            q72Var.f81741j = 1;
            bo3Var.getClass();
            if (nt2VarA2.F0) {
                if (!bo3.f75925a.compareAndSet(false, true) || (objG = nk.h.g(nk.w0.a(), new ao3(context3, null), q72Var)) != sj.a.f()) {
                    objG = mj.r.f64562a;
                }
                if (objG != sj.a.f()) {
                    objG = mj.r.f64562a;
                }
            } else {
                objG = mj.r.f64562a;
            }
            if (objG == objF) {
                return objF;
            }
        }
        r72Var = this;
        w5Var = r72Var.f82137a;
        v5 v5Var2 = v5.f83757q;
        w5Var.a(v5Var2, null);
        Iterator it2 = setV.iterator();
        ry1Var2 = ry1Var3;
        v5Var = v5Var2;
        r72Var2 = r72Var;
        context2 = context3;
        it = it2;
        while (it.hasNext()) {
            oj1 oj1Var2 = (oj1) it.next();
            qw1 qw1Var2 = r72Var2.f82140d;
            v9 v9Var2 = ry1Var2.f82467b;
            q72Var.f81733b = r72Var2;
            q72Var.f81734c = context2;
            q72Var.f81735d = ry1Var2;
            q72Var.f81736e = w5Var;
            q72Var.f81737f = v5Var;
            q72Var.f81738g = it;
            q72Var.f81741j = i12;
            qw1Var2.getClass();
            r72Var3 = r72Var2;
            objG2 = nk.h.g(nk.w0.c().n(), new pw1(context2, oj1Var2, oj1Var2.f81054a, qw1Var2, v9Var2, v9Var2.D, null), q72Var);
            if (objG2 != sj.a.f()) {
                objG2 = mj.r.f64562a;
            }
            if (objG2 == objF) {
                return objF;
            }
            r72Var2 = r72Var3;
            i12 = 2;
        }
        mj.r rVar2 = mj.r.f64562a;
        w5Var.a(v5Var);
        return rVar2;
    }

    public r72(w5 w5Var, bo3 bo3Var) {
        this.f82137a = w5Var;
        this.f82138b = bo3Var;
        this.f82139c = new wm1();
        this.f82140d = new qw1();
    }
}
