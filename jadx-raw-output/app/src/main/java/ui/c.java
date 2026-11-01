package ui;

import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableError.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c<T> extends ii.e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<? extends Throwable> f72879c;

    @Override // ii.e
    public void n(qo.b<? super T> bVar) {
        try {
            th = (Throwable) qi.a.e(this.f72879c.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            ni.a.b(th);
        }
        EmptySubscription.error(th, bVar);
    }

    public c(Callable<? extends Throwable> callable) {
        this.f72879c = callable;
    }
}
