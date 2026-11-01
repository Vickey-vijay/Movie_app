package ti;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: CompletableError.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends ii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f72418a;

    @Override // ii.a
    public void f(ii.b bVar) {
        EmptyDisposable.error(this.f72418a, bVar);
    }

    public c(Throwable th2) {
        this.f72418a = th2;
    }
}
