package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class xp1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f84667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f84668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f84669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f84670e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp1(List list, com.monetization.ads.mediation.base.initialize.a aVar, Context context, rj.c cVar) {
        super(2, cVar);
        this.f84668c = list;
        this.f84669d = aVar;
        this.f84670e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        xp1 xp1Var = new xp1(this.f84668c, this.f84669d, this.f84670e, cVar);
        xp1Var.f84667b = obj;
        return xp1Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((xp1) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        nk.l0 l0Var = (nk.l0) this.f84667b;
        List list = this.f84668c;
        com.monetization.ads.mediation.base.initialize.a aVar = this.f84669d;
        Context context = this.f84670e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nk.j.d(l0Var, null, null, new wp1(aVar, context, (qq1) it.next(), null), 3, null);
        }
        return mj.r.f64562a;
    }
}
