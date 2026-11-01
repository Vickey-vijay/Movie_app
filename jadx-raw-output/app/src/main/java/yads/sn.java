package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class sn extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zn f82702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hp f82703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(zn znVar, hp hpVar, rj.c cVar) {
        super(2, cVar);
        this.f82702c = znVar;
        this.f82703d = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new sn(this.f82702c, this.f82703d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new sn(this.f82702c, this.f82703d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f82701b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            zn znVar = this.f82702c;
            s01 s01Var = znVar.f85506l;
            Context context = znVar.f85495a;
            hp hpVar = this.f82703d;
            this.f82701b = 1;
            obj = s01Var.a(context, hpVar, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
