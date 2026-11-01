package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class up1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f83569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f83570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hp f83571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, hp hpVar, rj.c cVar) {
        super(2, cVar);
        this.f83569c = aVar;
        this.f83570d = context;
        this.f83571e = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new up1(this.f83569c, this.f83570d, this.f83571e, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((up1) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objC;
        Object objF = sj.a.f();
        int i10 = this.f83568b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.f83569c;
            Context context = this.f83570d;
            hp hpVar = this.f83571e;
            this.f83568b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f42979g;
            aVar.getClass();
            if (com.monetization.ads.mediation.base.initialize.a.f42980h.getAndSet(false)) {
                aVar.f42982b.getClass();
                List list = hpVar.f78294b;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    nj.x.C(arrayList, ((gb) it.next()).f77718c);
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
