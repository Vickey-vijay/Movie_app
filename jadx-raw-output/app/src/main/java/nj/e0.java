package nj;

import java.util.Iterator;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e0<T> implements Iterable<d0<? extends T>>, dk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.a<Iterator<T>> f64735b;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(bk.a<? extends Iterator<? extends T>> aVar) {
        ck.p.j(aVar, "iteratorFactory");
        this.f64735b = aVar;
    }

    @Override // java.lang.Iterable
    public Iterator<d0<T>> iterator() {
        return new f0(this.f64735b.invoke());
    }
}
