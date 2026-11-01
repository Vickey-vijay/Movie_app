package dj;

import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: DisposableObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c<T> implements r<T>, mi.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<mi.b> f52123b = new AtomicReference<>();

    public void a() {
    }

    @Override // mi.b
    public final void dispose() {
        DisposableHelper.dispose(this.f52123b);
    }

    @Override // mi.b
    public final boolean isDisposed() {
        return this.f52123b.get() == DisposableHelper.DISPOSED;
    }

    @Override // ii.r
    public final void onSubscribe(mi.b bVar) {
        if (bj.e.c(this.f52123b, bVar, getClass())) {
            a();
        }
    }
}
