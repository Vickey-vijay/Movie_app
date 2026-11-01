package nk;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface i0 extends kotlin.coroutines.d.b {
    public static final b F8 = b.f64793b;

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    public static final class b implements kotlin.coroutines.d.c<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f64793b = new b();
    }

    void handleException(kotlin.coroutines.d dVar, Throwable th2);

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    public static final class a {
        public static <R> R a(i0 i0Var, R r10, bk.p<? super R, ? super kotlin.coroutines.d.b, ? extends R> pVar) {
            return (R) kotlin.coroutines.d.b.a.a(i0Var, r10, pVar);
        }

        public static <E extends kotlin.coroutines.d.b> E b(i0 i0Var, kotlin.coroutines.d.c<E> cVar) {
            return (E) kotlin.coroutines.d.b.a.b(i0Var, cVar);
        }

        public static kotlin.coroutines.d c(i0 i0Var, kotlin.coroutines.d.c<?> cVar) {
            return kotlin.coroutines.d.b.a.c(i0Var, cVar);
        }

        public static kotlin.coroutines.d d(i0 i0Var, kotlin.coroutines.d dVar) {
            return kotlin.coroutines.d.b.a.d(i0Var, dVar);
        }
    }
}
