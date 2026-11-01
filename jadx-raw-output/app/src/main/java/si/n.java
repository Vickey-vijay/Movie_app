package si;

import ii.u;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ResumeSingleObserver.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n<T> implements u<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<mi.b> f71932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u<? super T> f71933c;

    @Override // ii.u
    public void onError(Throwable th2) {
        this.f71933c.onError(th2);
    }

    @Override // ii.u
    public void onSubscribe(mi.b bVar) {
        DisposableHelper.replace(this.f71932b, bVar);
    }

    @Override // ii.u
    public void onSuccess(T t10) {
        this.f71933c.onSuccess(t10);
    }

    public n(AtomicReference<mi.b> atomicReference, u<? super T> uVar) {
        this.f71932b = atomicReference;
        this.f71933c = uVar;
    }
}
