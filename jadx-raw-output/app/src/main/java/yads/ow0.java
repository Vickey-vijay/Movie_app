package yads;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class ow0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f81165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw0 f81166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn2 f81167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(rw0 rw0Var, dn2 dn2Var, rj.c cVar) {
        super(2, cVar);
        this.f81166d = rw0Var;
        this.f81167e = dn2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        ow0 ow0Var = new ow0(this.f81166d, this.f81167e, cVar);
        ow0Var.f81165c = obj;
        return ow0Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((ow0) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        Object objF = sj.a.f();
        int i10 = this.f81164b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                rw0 rw0Var = this.f81166d;
                dn2 dn2Var = this.f81167e;
                Result.a aVar = Result.Companion;
                this.f81164b = 1;
                obj = rw0Var.a(dn2Var, this);
                if (obj == objF) {
                    return objF;
                }
            }
            objM3458constructorimpl = Result.m3458constructorimpl(tj.a.a(((Boolean) obj).booleanValue()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        return Result.m3457boximpl(objM3458constructorimpl);
    }
}
