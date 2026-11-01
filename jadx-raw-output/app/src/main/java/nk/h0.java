package nk;

/* JADX INFO: compiled from: CoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class h0 extends kotlin.coroutines.a implements kotlin.coroutines.c {
    public static final a Key = new a(null);

    /* JADX INFO: compiled from: CoroutineDispatcher.kt */
    public static final class a extends kotlin.coroutines.b<kotlin.coroutines.c, h0> {
        public a() {
            super(kotlin.coroutines.c.D8, new bk.l() { // from class: nk.g0
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return h0.a.d((kotlin.coroutines.d.b) obj);
                }
            });
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static final h0 d(kotlin.coroutines.d.b bVar) {
            if (bVar instanceof h0) {
                return (h0) bVar;
            }
            return null;
        }
    }

    public abstract void dispatch(kotlin.coroutines.d dVar, Runnable runnable);

    public boolean isDispatchNeeded(kotlin.coroutines.d dVar) {
        return true;
    }

    public h0 limitedParallelism(int i10, String str) {
        sk.m.a(i10);
        return new sk.l(this, i10, str);
    }

    public final h0 plus(h0 h0Var) {
        return h0Var;
    }

    public h0() {
        super(kotlin.coroutines.c.D8);
    }

    public static /* synthetic */ h0 limitedParallelism$default(h0 h0Var, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return h0Var.limitedParallelism(i10, str);
    }

    @Override // kotlin.coroutines.c
    public final <T> rj.c<T> interceptContinuation(rj.c<? super T> cVar) {
        return new sk.g(this, cVar);
    }

    @Override // kotlin.coroutines.c
    public final void releaseInterceptedContinuation(rj.c<?> cVar) {
        ck.p.h(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((sk.g) cVar).u();
    }

    public String toString() {
        return m0.a(this) + '@' + m0.b(this);
    }

    public void dispatchYield(kotlin.coroutines.d dVar, Runnable runnable) {
        sk.h.c(this, dVar, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d.b, kotlin.coroutines.d
    public <E extends kotlin.coroutines.d.b> E get(kotlin.coroutines.d.c<E> cVar) {
        return (E) kotlin.coroutines.c.a.a(this, cVar);
    }

    public /* synthetic */ h0 limitedParallelism(int i10) {
        return limitedParallelism(i10, null);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d
    public kotlin.coroutines.d minusKey(kotlin.coroutines.d.c<?> cVar) {
        return kotlin.coroutines.c.a.b(this, cVar);
    }
}
