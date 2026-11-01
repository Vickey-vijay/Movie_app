package ui;

import io.reactivex.internal.subscriptions.EmptySubscription;

/* JADX INFO: compiled from: FlowableEmpty.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends ii.e<Object> implements ri.f<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ii.e<Object> f72878c = new b();

    @Override // ri.f, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // ii.e
    public void n(qo.b<? super Object> bVar) {
        EmptySubscription.complete(bVar);
    }
}
