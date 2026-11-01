package xi;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: ObservableNever.java */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends ii.k<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ii.k<Object> f74971b = new z0();

    @Override // ii.k
    public void subscribeActual(ii.r<? super Object> rVar) {
        rVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
