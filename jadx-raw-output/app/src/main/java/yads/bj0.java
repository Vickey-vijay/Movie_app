package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class bj0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f75843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f75844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj0 f75845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(cj0 cj0Var, List list, rj.c cVar) {
        super(2, cVar);
        this.f75844c = list;
        this.f75845d = cj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        bj0 bj0Var = new bj0(this.f75845d, this.f75844c, cVar);
        bj0Var.f75843b = obj;
        return bj0Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((bj0) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        nk.l0 l0Var = (nk.l0) this.f75843b;
        List list = this.f75844c;
        cj0 cj0Var = this.f75845d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nk.j.d(l0Var, null, null, new aj0(cj0Var, (String) it.next(), null), 3, null);
        }
        return mj.r.f64562a;
    }
}
