package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: loaded from: classes7.dex */
public final class x72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne3 f84468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wg3 f84469b;

    public /* synthetic */ x72(Context context, d4 d4Var, lu2 lu2Var) {
        this(new ne3(context, new o62()), new wg3(context, d4Var, lu2Var, new y52(d4Var), new za2()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(x72 x72Var, List list, rj.c cVar) throws Throwable {
        u72 u72Var;
        x72Var.getClass();
        if (cVar instanceof u72) {
            u72Var = (u72) cVar;
            int i10 = u72Var.f83393e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u72Var.f83393e = i10 - Integer.MIN_VALUE;
            } else {
                u72Var = new u72(x72Var, cVar);
            }
        } else {
            u72Var = new u72(x72Var, cVar);
        }
        Object objB = u72Var.f83391c;
        Object objF = sj.a.f();
        int i11 = u72Var.f83393e;
        if (i11 != 0) {
            if (i11 == 1) {
                x72Var = u72Var.f83390b;
                kotlin.c.b(objB);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(objB);
            wg3 wg3Var = x72Var.f84469b;
            ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((je3) it.next()).f79014b);
            }
            u72Var.f83390b = x72Var;
            u72Var.f83393e = 1;
            wg3Var.getClass();
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(u72Var), 1);
            cVar2.J();
            vg3 vg3Var = new vg3(cVar2);
            rg3 rg3Var = wg3Var.f84204a;
            Object obj = new Object();
            rg3Var.f82266c.getClass();
            og3 og3VarA = pg3.a(arrayList);
            rg3Var.f82267d.addAll(og3VarA.f81036a);
            rg3Var.f82265b.a(rg3Var.f82264a, og3VarA.f81037b, new qg3(rg3Var, vg3Var, obj), obj);
            objB = cVar2.B();
            if (objB == sj.a.f()) {
                tj.f.c(u72Var);
            }
            if (objB == objF) {
                return objF;
            }
        }
        ug3 ug3Var = (ug3) objB;
        if (ug3Var instanceof sg3) {
            return nj.s.k();
        }
        if (ug3Var instanceof tg3) {
            return x72Var.f84468a.a(((tg3) ug3Var).f83031a, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public x72(ne3 ne3Var, wg3 wg3Var) {
        this.f84468a = ne3Var;
        this.f84469b = wg3Var;
    }
}
