package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class em0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f77133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb f77134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xh2 f77135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cl.a f77136d;

    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Context context, rj.c cVar) throws Throwable {
        dm0 dm0Var;
        yr1 yr1Var;
        em0 em0Var;
        List list;
        Object next;
        if (cVar instanceof dm0) {
            dm0Var = (dm0) cVar;
            int i10 = dm0Var.f76734e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dm0Var.f76734e = i10 - Integer.MIN_VALUE;
            } else {
                dm0Var = new dm0(this, cVar);
            }
        } else {
            dm0Var = new dm0(this, cVar);
        }
        Object objG = dm0Var.f76732c;
        Object objF = sj.a.f();
        int i11 = dm0Var.f76734e;
        if (i11 == 0) {
            kotlin.c.b(objG);
            String str = this.f77133a.f76561c.f78158a;
            gs1 gs1Var = this.f77134b.f78959a.f78295c;
            if (gs1Var == null || (list = gs1Var.f77921c) == null) {
                yr1Var = null;
            } else {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!ck.p.e(((xr1) next).f84678b, str));
                xr1 xr1Var = (xr1) next;
                if (xr1Var == null) {
                    yr1Var = null;
                } else {
                    yr1Var = new yr1(gs1Var.f77920b, xr1Var.f84678b, xr1Var.f84679c);
                }
            }
            if (yr1Var == null || str == null) {
                return null;
            }
            d4 d4Var = this.f77133a;
            e00 e00Var = d4Var.f76559a;
            a03 a03Var = d4Var.f76562d.f75685a;
            List list2 = yr1Var.f85095b;
            long j10 = yr1Var.f85096c;
            xh2 xh2Var = this.f77135c;
            dm0Var.f76731b = this;
            dm0Var.f76734e = 1;
            xh2Var.getClass();
            objG = nk.h.g(nk.w0.c().n(), new th2(j10, context, e00Var, a03Var, xh2Var, list2, null), dm0Var);
            if (objG == objF) {
                return objF;
            }
            em0Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            em0Var = dm0Var.f76731b;
            kotlin.c.b(objG);
        }
        cl.a aVar = em0Var.f77136d;
        aVar.a();
        return aVar.c(dh2.Companion.serializer(), (dh2) objG);
    }

    public em0(d4 d4Var, jb jbVar, xh2 xh2Var, cl.a aVar) {
        this.f77133a = d4Var;
        this.f77134b = jbVar;
        this.f77135c = xh2Var;
        this.f77136d = aVar;
    }
}
