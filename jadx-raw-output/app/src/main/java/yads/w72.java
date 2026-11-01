package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class w72 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f84120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f84121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x72 f84122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w72(x72 x72Var, List list, rj.c cVar) {
        super(2, cVar);
        this.f84121d = list;
        this.f84122e = x72Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        w72 w72Var = new w72(this.f84122e, this.f84121d, cVar);
        w72Var.f84120c = obj;
        return w72Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((w72) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        kotlinx.coroutines.g gVarA;
        Object objF = sj.a.f();
        int i10 = this.f84119b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f84120c;
            List<je3> list = this.f84121d;
            x72 x72Var = this.f84122e;
            ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
            for (je3 je3Var : list) {
                if (je3Var.f79014b.f83421a) {
                    gVarA = nk.j.b(l0Var, null, null, new v72(x72Var, je3Var, null), 3, null);
                } else {
                    gVarA = nk.w.a(nj.r.e(je3Var));
                }
                arrayList.add(gVarA);
            }
            this.f84119b = 1;
            obj = nk.e.a(arrayList, this);
            if (obj == objF) {
                return objF;
            }
        }
        return nj.t.x((Iterable) obj);
    }
}
