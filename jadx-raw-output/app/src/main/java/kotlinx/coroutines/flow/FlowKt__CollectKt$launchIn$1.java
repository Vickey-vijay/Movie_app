package kotlinx.coroutines.flow;

import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {46}, m = "invokeSuspend")
public final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ qk.c<T> $this_launchIn;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$launchIn$1(qk.c<? extends T> cVar, c<? super FlowKt__CollectKt$launchIn$1> cVar2) {
        super(2, cVar2);
        this.$this_launchIn = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new FlowKt__CollectKt$launchIn$1(this.$this_launchIn, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
        return ((FlowKt__CollectKt$launchIn$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            qk.c<T> cVar = this.$this_launchIn;
            this.label = 1;
            if (e.i(cVar, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
