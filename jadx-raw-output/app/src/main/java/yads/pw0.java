package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class pw0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f81629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f81630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rw0 f81631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(List list, rw0 rw0Var, rj.c cVar) {
        super(2, cVar);
        this.f81630d = list;
        this.f81631e = rw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        pw0 pw0Var = new pw0(this.f81630d, this.f81631e, cVar);
        pw0Var.f81629c = obj;
        return pw0Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((pw0) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f81628b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f81629c;
            List list = this.f81630d;
            rw0 rw0Var = this.f81631e;
            ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(nk.j.b(l0Var, null, null, new ow0(rw0Var, (dn2) it.next(), null), 3, null));
            }
            this.f81628b = 1;
            obj = nk.e.a(arrayList, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
