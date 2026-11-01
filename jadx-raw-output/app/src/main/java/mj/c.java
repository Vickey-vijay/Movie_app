package mj;

import ck.x;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c<T, R> extends b<T, R> implements rj.c<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bk.q<? super b<?, ?>, Object, ? super rj.c<Object>, ? extends Object> f64536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f64537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rj.c<Object> f64538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f64539e;

    @Override // rj.c
    public void resumeWith(Object obj) {
        this.f64538d = null;
        this.f64539e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(bk.q<? super b<T, R>, ? super T, ? super rj.c<? super R>, ? extends Object> qVar, T t10) {
        super(null);
        ck.p.j(qVar, "block");
        this.f64536b = qVar;
        this.f64537c = t10;
        ck.p.h(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f64538d = this;
        this.f64539e = kotlin.a.f62966a;
    }

    @Override // mj.b
    public Object a(T t10, rj.c<? super R> cVar) {
        ck.p.h(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f64538d = cVar;
        this.f64537c = t10;
        Object objF = sj.a.f();
        if (objF == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objF;
    }

    public final R b() throws Throwable {
        while (true) {
            R r10 = (R) this.f64539e;
            rj.c<Object> cVar = this.f64538d;
            if (cVar == null) {
                kotlin.c.b(r10);
                return r10;
            }
            if (Result.m3460equalsimpl0(kotlin.a.f62966a, r10)) {
                try {
                    bk.q<? super b<?, ?>, Object, ? super rj.c<Object>, ? extends Object> qVar = this.f64536b;
                    Object obj = this.f64537c;
                    Object objE = !(qVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.e(qVar, this, obj, cVar) : ((bk.q) x.e(qVar, 3)).invoke(this, obj, cVar);
                    if (objE != sj.a.f()) {
                        cVar.resumeWith(Result.m3458constructorimpl(objE));
                    }
                } catch (Throwable th2) {
                    Result.a aVar = Result.Companion;
                    cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(th2)));
                }
            } else {
                this.f64539e = kotlin.a.f62966a;
                cVar.resumeWith(r10);
            }
        }
    }

    @Override // rj.c
    public kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}
