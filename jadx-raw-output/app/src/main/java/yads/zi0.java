package yads;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zi0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cj0 f85403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(cj0 cj0Var, rj.c cVar) {
        super(2, cVar);
        this.f85403c = cj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new zi0(this.f85403c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new zi0(this.f85403c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f85402b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            cj0 cj0Var = this.f85403c;
            AtomicBoolean atomicBoolean = cj0.f76287e;
            cj0Var.getClass();
            List listC = nj.r.c();
            String strA = ya3.a(cj0Var.f76290c.a(cj0Var.f76289b));
            if (strA != null) {
                listC.add(strA);
            }
            List listA = nj.r.a(listC);
            if (listA.isEmpty()) {
                boolean z10 = ad1.f75480a;
                return mj.r.f64562a;
            }
            cj0 cj0Var2 = this.f85403c;
            this.f85402b = 1;
            cj0Var2.getClass();
            Object objC = TimeoutKt.c(2500L, new bj0(cj0Var2, listA, null), this);
            if (objC != sj.a.f()) {
                objC = mj.r.f64562a;
            }
            if (objC == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
