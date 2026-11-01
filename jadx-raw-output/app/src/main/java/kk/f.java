package kk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class f<T, R, E> implements i<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T> f62842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.l<T, R> f62843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk.l<R, Iterator<E>> f62844c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<E>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f62845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<? extends E> f62846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f62847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f<T, R, E> f62848e;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(f<T, R, E> fVar) {
            this.f62848e = fVar;
            this.f62845b = fVar.f62842a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.f62846c;
            if (it != null && it.hasNext()) {
                this.f62847d = 1;
                return true;
            }
            while (this.f62845b.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) this.f62848e.f62844c.invoke(this.f62848e.f62843b.invoke(this.f62845b.next()));
                if (it2.hasNext()) {
                    this.f62846c = it2;
                    this.f62847d = 1;
                    return true;
                }
            }
            this.f62847d = 2;
            this.f62846c = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f62847d;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            int i10 = this.f62847d;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f62847d = 0;
            Iterator<? extends E> it = this.f62846c;
            ck.p.g(it);
            return it.next();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(i<? extends T> iVar, bk.l<? super T, ? extends R> lVar, bk.l<? super R, ? extends Iterator<? extends E>> lVar2) {
        ck.p.j(iVar, "sequence");
        ck.p.j(lVar, "transformer");
        ck.p.j(lVar2, "iterator");
        this.f62842a = iVar;
        this.f62843b = lVar;
        this.f62844c = lVar2;
    }

    @Override // kk.i
    public Iterator<E> iterator() {
        return new a(this);
    }
}
