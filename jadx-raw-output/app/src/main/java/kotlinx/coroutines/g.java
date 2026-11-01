package kotlinx.coroutines;

import bk.l;
import bk.p;
import java.util.concurrent.CancellationException;
import kk.i;
import mj.r;
import nk.t;
import nk.y0;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface g extends kotlin.coroutines.d.b {
    public static final b E8 = b.f63170b;

    /* JADX INFO: compiled from: Job.kt */
    public static final class a {
        public static /* synthetic */ void a(g gVar, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            gVar.a(cancellationException);
        }

        public static <R> R b(g gVar, R r10, p<? super R, ? super kotlin.coroutines.d.b, ? extends R> pVar) {
            return (R) kotlin.coroutines.d.b.a.a(gVar, r10, pVar);
        }

        public static <E extends kotlin.coroutines.d.b> E c(g gVar, kotlin.coroutines.d.c<E> cVar) {
            return (E) kotlin.coroutines.d.b.a.b(gVar, cVar);
        }

        public static kotlin.coroutines.d d(g gVar, kotlin.coroutines.d.c<?> cVar) {
            return kotlin.coroutines.d.b.a.c(gVar, cVar);
        }

        public static kotlin.coroutines.d e(g gVar, kotlin.coroutines.d dVar) {
            return kotlin.coroutines.d.b.a.d(gVar, dVar);
        }
    }

    /* JADX INFO: compiled from: Job.kt */
    public static final class b implements kotlin.coroutines.d.c<g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f63170b = new b();
    }

    CancellationException B();

    y0 F(l<? super Throwable, r> lVar);

    nk.r I(t tVar);

    y0 N(boolean z10, boolean z11, l<? super Throwable, r> lVar);

    void a(CancellationException cancellationException);

    boolean d();

    boolean isActive();

    boolean isCancelled();

    i<g> k();

    Object o(rj.c<? super r> cVar);

    boolean start();

    vk.a v();
}
