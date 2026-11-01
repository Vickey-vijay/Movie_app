package so;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Iterators.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b<E> implements Iterator<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<E> f72013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72014c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f72015d = false;

    public abstract void a(int i10);

    @Override // java.util.Iterator
    public E next() {
        this.f72015d = false;
        this.f72014c++;
        return this.f72013b.next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f72013b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.f72014c;
        if (i10 == 0) {
            throw new IllegalStateException("Call next() first");
        }
        if (this.f72015d) {
            throw new IllegalStateException("Already removed current, call next()");
        }
        a(i10 - 1);
        this.f72015d = true;
    }

    public b(Collection<E> collection) {
        this.f72013b = new CopyOnWriteArrayList(collection).iterator();
    }
}
