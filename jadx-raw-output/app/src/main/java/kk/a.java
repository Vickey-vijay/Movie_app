package kk;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: SequencesJVM.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<i<T>> f62829a;

    public a(i<? extends T> iVar) {
        ck.p.j(iVar, "sequence");
        this.f62829a = new AtomicReference<>(iVar);
    }

    @Override // kk.i
    public Iterator<T> iterator() {
        i<T> andSet = this.f62829a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
