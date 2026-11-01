package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class wu2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f84318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2 f84319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu2(boolean z10, zu2 zu2Var, rj.c cVar) {
        super(2, cVar);
        this.f84318c = z10;
        this.f84319d = zu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new wu2(this.f84318c, this.f84319d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new wu2(this.f84318c, this.f84319d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f84317b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            if (this.f84318c) {
                cj0 cj0Var = this.f84319d.f85610q;
                this.f84317b = 1;
                if (cj0Var.a(this) == objF) {
                    return objF;
                }
            }
        }
        return mj.r.f64562a;
    }
}
