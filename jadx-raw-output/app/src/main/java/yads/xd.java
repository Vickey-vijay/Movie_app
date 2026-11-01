package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class xd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd f84533c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(yd ydVar, rj.c cVar) {
        super(2, cVar);
        this.f84533c = ydVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new xd(this.f84533c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new xd(this.f84533c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ke keVar;
        Object objF = sj.a.f();
        int i10 = this.f84532b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.p0 p0Var = this.f84533c.f84891c;
            this.f84532b = 1;
            obj = p0Var.y(this);
            if (obj == objF) {
                return objF;
            }
        }
        if (obj instanceof ke) {
            keVar = (ke) obj;
        } else {
            keVar = null;
        }
        if (keVar == null) {
            return null;
        }
        return keVar.f79398a;
    }
}
