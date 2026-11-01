package qk;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class w extends rk.c<StateFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Object> f66602a = new AtomicReference<>(null);

    @Override // rk.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(StateFlowImpl<?> stateFlowImpl) {
        if (sk.c.a(this.f66602a) != null) {
            return false;
        }
        sk.c.b(this.f66602a, v.f66600a);
        return true;
    }

    public final Object e(rj.c<? super mj.r> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        if (!androidx.lifecycle.e.a(this.f66602a, v.f66600a, cVar2)) {
            Result.a aVar = Result.Companion;
            cVar2.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
        }
        Object objB = cVar2.B();
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB == sj.a.f() ? objB : mj.r.f64562a;
    }

    @Override // rk.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public rj.c<mj.r>[] b(StateFlowImpl<?> stateFlowImpl) {
        sk.c.b(this.f66602a, null);
        return rk.b.f66787a;
    }

    public final void g() {
        AtomicReference<Object> atomicReference = this.f66602a;
        while (true) {
            Object objA = sk.c.a(atomicReference);
            if (objA == null || objA == v.f66601b) {
                return;
            }
            if (objA == v.f66600a) {
                if (androidx.lifecycle.e.a(this.f66602a, objA, v.f66601b)) {
                    return;
                }
            } else if (androidx.lifecycle.e.a(this.f66602a, objA, v.f66600a)) {
                Result.a aVar = Result.Companion;
                ((kotlinx.coroutines.c) objA).resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f66602a.getAndSet(v.f66600a);
        ck.p.g(andSet);
        return andSet == v.f66601b;
    }
}
