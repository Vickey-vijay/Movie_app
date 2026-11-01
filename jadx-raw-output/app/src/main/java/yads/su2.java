package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class su2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zu2 f82752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu2 f82753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su2(zu2 zu2Var, tu2 tu2Var, rj.c cVar) {
        super(2, cVar);
        this.f82752c = zu2Var;
        this.f82753d = tu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new su2(this.f82752c, this.f82753d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new su2(this.f82752c, this.f82753d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f82751b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                zu2 zu2Var = this.f82752c;
                q61 q61Var = q61.f81721c;
                this.f82751b = 1;
                obj = zu2Var.a(q61Var, this);
                if (obj == objF) {
                    return objF;
                }
            }
            this.f82753d.f83178d.a((ru2) obj);
            tu2.f83175f.remove(this.f82752c);
            return mj.r.f64562a;
        } catch (Throwable th2) {
            tu2.f83175f.remove(this.f82752c);
            throw th2;
        }
    }
}
