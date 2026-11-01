package yads;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: loaded from: classes11.dex */
public final class z32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f85188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5 f85189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jj f85190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z41 f85191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c41 f85192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g51 f85193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bk.l f85194g;

    public /* synthetic */ z32(Context context, nk.l0 l0Var, w5 w5Var) {
        this(l0Var, w5Var, new jj(), new z41(), new c41(context), new g51(), v32.f83732b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(HashSet hashSet, mi2 mi2Var, ry1 ry1Var, rj.c cVar) throws Throwable {
        w32 w32Var;
        z32 z32Var;
        mi2 mi2Var2;
        w5 w5Var;
        v5 v5Var;
        if (cVar instanceof w32) {
            w32Var = (w32) cVar;
            int i10 = w32Var.f84100i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                w32Var.f84100i = i10 - Integer.MIN_VALUE;
            } else {
                w32Var = new w32(this, cVar);
            }
        } else {
            w32Var = new w32(this, cVar);
        }
        Object obj = w32Var.f84098g;
        Object objF = sj.a.f();
        int i11 = w32Var.f84100i;
        if (i11 == 0) {
            kotlin.c.b(obj);
            if (hashSet.isEmpty()) {
                return mj.r.f64562a;
            }
            w5 w5Var2 = this.f85189b;
            v5 v5Var2 = v5.f83755o;
            w5Var2.a(v5Var2, null);
            c41 c41Var = this.f85192e;
            w32Var.f84093b = this;
            w32Var.f84094c = mi2Var;
            w32Var.f84095d = ry1Var;
            w32Var.f84096e = w5Var2;
            w32Var.f84097f = v5Var2;
            w32Var.f84100i = 1;
            c41Var.getClass();
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(w32Var), 1);
            cVar2.J();
            c41Var.a(hashSet, new b41(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                tj.f.c(w32Var);
            }
            if (objB == objF) {
                return objF;
            }
            z32Var = this;
            mi2Var2 = mi2Var;
            w5Var = w5Var2;
            obj = objB;
            v5Var = v5Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v5Var = w32Var.f84097f;
            w5Var = w32Var.f84096e;
            ry1Var = w32Var.f84095d;
            mi2Var2 = w32Var.f84094c;
            z32Var = w32Var.f84093b;
            kotlin.c.b(obj);
        }
        f51 f51Var = (f51) obj;
        if (f51Var instanceof e51) {
            Map map = ((e51) f51Var).f76921a;
            v9 v9Var = ry1Var.f82467b;
            String str = v9Var.f83831w;
            r32 r32Var = r32.f82092c;
            if (!ck.p.e(str, "loading_on_show") && !ck.p.e(v9Var.f83831w, "loading_on_back")) {
                z41 z41Var = z32Var.f85191d;
                z41Var.getClass();
                Iterator it = ry1Var.f82466a.f76509a.iterator();
                while (it.hasNext()) {
                    List list = ((fy1) it.next()).f77546b;
                    if (!list.isEmpty()) {
                        z41Var.a(list, map);
                    }
                }
                jj jjVar = z32Var.f85190c;
                jjVar.getClass();
                for (fy1 fy1Var : ry1Var.f82466a.f76509a) {
                    List list2 = fy1Var.f77546b;
                    if (!list2.isEmpty()) {
                        fy1Var.f77546b = jjVar.a(list2, map);
                    }
                }
            }
            mi2Var2.f80183b.putAll(map);
        }
        mj.r rVar = mj.r.f64562a;
        w5Var.a(v5Var);
        return rVar;
    }

    public z32(nk.l0 l0Var, w5 w5Var, jj jjVar, z41 z41Var, c41 c41Var, g51 g51Var, bk.l lVar) {
        this.f85188a = l0Var;
        this.f85189b = w5Var;
        this.f85190c = jjVar;
        this.f85191d = z41Var;
        this.f85192e = c41Var;
        this.f85193f = g51Var;
        this.f85194g = lVar;
    }
}
