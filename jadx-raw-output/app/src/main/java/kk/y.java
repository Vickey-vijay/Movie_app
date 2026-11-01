package kk;

import java.util.Iterator;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y<T, R> implements i<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T> f62884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.l<T, R> f62885b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f62886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y<T, R> f62887c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(y<T, R> yVar) {
            this.f62887c = yVar;
            this.f62886b = yVar.f62884a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f62886b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f62887c.f62885b.invoke(this.f62886b.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(i<? extends T> iVar, bk.l<? super T, ? extends R> lVar) {
        ck.p.j(iVar, "sequence");
        ck.p.j(lVar, "transformer");
        this.f62884a = iVar;
        this.f62885b = lVar;
    }

    public final <E> i<E> e(bk.l<? super R, ? extends Iterator<? extends E>> lVar) {
        ck.p.j(lVar, "iterator");
        return new f(this.f62884a, this.f62885b, lVar);
    }

    @Override // kk.i
    public Iterator<R> iterator() {
        return new a(this);
    }
}
