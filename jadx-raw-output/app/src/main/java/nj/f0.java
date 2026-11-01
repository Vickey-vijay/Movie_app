package nj;

import java.util.Iterator;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f0<T> implements Iterator<d0<? extends T>>, dk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<T> f64736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64737c;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(Iterator<? extends T> it) {
        ck.p.j(it, "iterator");
        this.f64736b = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d0<T> next() {
        int i10 = this.f64737c;
        this.f64737c = i10 + 1;
        if (i10 < 0) {
            s.u();
        }
        return new d0<>(i10, this.f64736b.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f64736b.hasNext();
    }
}
