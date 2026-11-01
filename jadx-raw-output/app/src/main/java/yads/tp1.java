package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class tp1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f83136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f83137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hp f83138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, hp hpVar, rj.c cVar) {
        super(2, cVar);
        this.f83136c = aVar;
        this.f83137d = context;
        this.f83138e = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new tp1(this.f83136c, this.f83137d, this.f83138e, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((tp1) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objC;
        Collection<cs1> collectionK;
        List list;
        Object objF = sj.a.f();
        int i10 = this.f83135b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.f83136c;
            Context context = this.f83137d;
            hp hpVar = this.f83138e;
            this.f83135b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f42979g;
            aVar.getClass();
            if (com.monetization.ads.mediation.base.initialize.a.f42979g.getAndSet(false)) {
                aVar.f42982b.getClass();
                gs1 gs1Var = hpVar.f78295c;
                if (gs1Var != null && (list = gs1Var.f77921c) != null) {
                    collectionK = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        nj.x.C(collectionK, ((xr1) it.next()).f84679c);
                    }
                } else {
                    collectionK = nj.s.k();
                }
                ArrayList arrayList = new ArrayList(nj.t.v(collectionK, 10));
                for (cs1 cs1Var : collectionK) {
                    aVar.f42983c.getClass();
                    arrayList.add(new qq1(cs1Var.f76414b, cs1Var.f76415c, null, null, null, null, null));
                }
                objC = nk.j2.c(new xp1(aVar.f42985e.a(arrayList), aVar, context, null), this);
                if (objC != sj.a.f()) {
                    objC = mj.r.f64562a;
                }
                if (objC != sj.a.f()) {
                    objC = mj.r.f64562a;
                }
            } else {
                objC = mj.r.f64562a;
            }
            if (objC == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
