package q5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: Futures.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends g {

    /* JADX INFO: compiled from: Futures.java */
    public static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Future<V> f66520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d<? super V> f66521c;

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f66520b;
            if ((future instanceof r5.a) && (thA = r5.b.a((r5.a) future)) != null) {
                this.f66521c.onFailure(thA);
                return;
            }
            try {
                this.f66521c.onSuccess(e.b(this.f66520b));
            } catch (ExecutionException e10) {
                this.f66521c.onFailure(e10.getCause());
            } catch (Throwable th2) {
                this.f66521c.onFailure(th2);
            }
        }

        public a(Future<V> future, d<? super V> dVar) {
            this.f66520b = future;
            this.f66521c = dVar;
        }

        public String toString() {
            return m5.g.b(this).h(this.f66521c).toString();
        }
    }

    public static <V> void a(i<V> iVar, d<? super V> dVar, Executor executor) {
        m5.l.m(dVar);
        iVar.addListener(new a(iVar, dVar), executor);
    }

    public static <V> V b(Future<V> future) throws ExecutionException {
        m5.l.u(future.isDone(), "Future was expected to be done: %s", future);
        return (V) o.a(future);
    }
}
