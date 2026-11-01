package com.trello.rxlifecycle2;

import com.trello.rxlifecycle2.internal.Preconditions;
import ii.c;
import ii.e;
import ii.g;
import ii.i;
import ii.k;
import ii.p;
import ii.q;
import ii.t;
import ii.v;
import ii.w;
import io.reactivex.BackpressureStrategy;
import qo.a;

/* JADX INFO: loaded from: classes2.dex */
public final class LifecycleTransformer<T> implements q<T, T>, w<T, T> {
    public final k<?> observable;

    @Override // ii.q
    public p<T> apply(k<T> kVar) {
        return kVar.takeUntil(this.observable);
    }

    public a<T> apply(e<T> eVar) {
        return eVar.o(this.observable.toFlowable(BackpressureStrategy.LATEST));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LifecycleTransformer.class != obj.getClass()) {
            return false;
        }
        return this.observable.equals(((LifecycleTransformer) obj).observable);
    }

    public int hashCode() {
        return this.observable.hashCode();
    }

    public String toString() {
        return "LifecycleTransformer{observable=" + this.observable + '}';
    }

    public LifecycleTransformer(k<?> kVar) {
        Preconditions.checkNotNull(kVar, "observable == null");
        this.observable = kVar;
    }

    @Override // ii.w
    public v<T> apply(t<T> tVar) {
        return tVar.o(this.observable.firstOrError());
    }

    public i<T> apply(g<T> gVar) {
        return gVar.e(this.observable.firstElement());
    }

    public c apply(ii.a aVar) {
        return ii.a.c(aVar, this.observable.flatMapCompletable(Functions.CANCEL_COMPLETABLE));
    }
}
