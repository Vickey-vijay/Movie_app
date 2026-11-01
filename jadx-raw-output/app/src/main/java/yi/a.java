package yi;

import ii.t;
import ii.u;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: SingleError.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a<T> extends t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends Throwable> f85750a;

    @Override // ii.t
    public void m(u<? super T> uVar) {
        try {
            th = (Throwable) qi.a.e(this.f85750a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            ni.a.b(th);
        }
        EmptyDisposable.error(th, uVar);
    }

    public a(Callable<? extends Throwable> callable) {
        this.f85750a = callable;
    }
}
