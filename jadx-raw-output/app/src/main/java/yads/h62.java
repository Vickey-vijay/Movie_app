package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes8.dex */
public final class h62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f78077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke0 f78078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hv0 f78079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yy1 f78080d;

    public h62(nk.l0 l0Var, ke0 ke0Var, hv0 hv0Var, yy1 yy1Var) {
        this.f78077a = l0Var;
        this.f78078b = ke0Var;
        this.f78079c = hv0Var;
        this.f78080d = yy1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(boolean z10, Context context, ry1 ry1Var, z30 z30Var, rj.c cVar) throws Throwable {
        e62 e62Var;
        h62 h62Var;
        Context context2;
        z30 z30Var2;
        boolean z11;
        if (cVar instanceof e62) {
            e62Var = (e62) cVar;
            int i10 = e62Var.f76946h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e62Var.f76946h = i10 - Integer.MIN_VALUE;
            } else {
                e62Var = new e62(this, cVar);
            }
        } else {
            e62Var = new e62(this, cVar);
        }
        e62 e62Var2 = e62Var;
        Object objA = e62Var2.f76944f;
        Object objF = sj.a.f();
        int i11 = e62Var2.f76946h;
        if (i11 == 0) {
            kotlin.c.b(objA);
            yy1 yy1Var = this.f78080d;
            e62Var2.f76940b = this;
            e62Var2.f76941c = context;
            e62Var2.f76942d = z30Var;
            e62Var2.f76943e = z10;
            e62Var2.f76946h = 1;
            objA = yy1Var.a(context, ry1Var, e62Var2);
            if (objA == objF) {
                return objF;
            }
            h62Var = this;
            context2 = context;
            z30Var2 = z30Var;
            z11 = z10;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ry1 ry1Var2 = (ry1) e62Var2.f76940b;
                kotlin.c.b(objA);
                return ry1Var2;
            }
            z11 = e62Var2.f76943e;
            z30 z30Var3 = e62Var2.f76942d;
            Context context3 = e62Var2.f76941c;
            h62 h62Var2 = (h62) e62Var2.f76940b;
            kotlin.c.b(objA);
            z30Var2 = z30Var3;
            context2 = context3;
            h62Var = h62Var2;
        }
        ry1 ry1Var3 = (ry1) objA;
        if (ry1Var3 == null) {
            return null;
        }
        if (z11) {
            v9 v9Var = ry1Var3.f82467b;
            if (v9Var.E) {
                nk.j.d(h62Var.f78077a, null, null, new f62(h62Var, context2, v9Var, ry1Var3, z30Var2, null), 3, null);
            } else if (v9Var.f83832x) {
                e62Var2.f76940b = ry1Var3;
                e62Var2.f76941c = null;
                e62Var2.f76942d = null;
                e62Var2.f76946h = 2;
                if (h62Var.a(context2, v9Var, ry1Var3, z30Var2, e62Var2) == objF) {
                    return objF;
                }
            }
        }
        return ry1Var3;
    }

    public /* synthetic */ h62(d4 d4Var, lu2 lu2Var, Context context, w5 w5Var, nk.l0 l0Var) {
        this(l0Var, new ke0(context, w5Var), new hv0(context, w5Var), new yy1(context, d4Var, lu2Var));
    }

    public final Object a(Context context, v9 v9Var, ry1 ry1Var, z30 z30Var, rj.c cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        g62 g62Var = new g62(cVar2);
        boolean zA = pr0.a(context, or0.f81130c);
        p62[] p62VarArr = p62.f81264b;
        if (ck.p.e("first_video_preloading_strategy", v9Var.f83830v) && zA) {
            hv0 hv0Var = this.f78079c;
            synchronized (hv0Var.f78394d) {
                d12 d12Var = ry1Var.f82466a;
                d72 d72Var = hv0Var.f78393c;
                d72Var.getClass();
                List listT = SequencesKt___SequencesKt.T(SequencesKt___SequencesKt.K(SequencesKt___SequencesKt.K(SequencesKt___SequencesKt.L(SequencesKt___SequencesKt.E(nj.b0.S(d12Var.f76509a), new a72(d72Var)), b72.f75752b), y62.f84832b), z62.f85230b));
                if (listT.isEmpty()) {
                    g62Var.a();
                } else {
                    fv0 fv0Var = new fv0(hv0Var.f78391a, g62Var, hv0Var.f78392b, nj.b0.X(listT, 1).iterator(), z30Var);
                    hv0Var.f78391a.a(v5.f83756p, null);
                    Pair pair = (Pair) nj.b0.f0(listT);
                    hv0Var.f78392b.a((String) pair.component1(), fv0Var, (String) pair.component2());
                }
                mj.r rVar = mj.r.f64562a;
            }
        } else {
            this.f78078b.a(ry1Var, g62Var, z30Var);
        }
        Object objB = cVar2.B();
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB == sj.a.f() ? objB : mj.r.f64562a;
    }
}
