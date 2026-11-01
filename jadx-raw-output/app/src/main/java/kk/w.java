package kk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class w<T> implements i<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T> f62874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62875b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f62876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<T> f62877c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f62876b > 0 && this.f62877c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f62876b;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f62876b = i10 - 1;
            return this.f62877c.next();
        }

        public a(w<T> wVar) {
            this.f62876b = wVar.f62875b;
            this.f62877c = wVar.f62874a.iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(i<? extends T> iVar, int i10) {
        ck.p.j(iVar, "sequence");
        this.f62874a = iVar;
        this.f62875b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // kk.c
    public i<T> a(int i10) {
        int i11 = this.f62875b;
        return i10 >= i11 ? r.i() : new v(this.f62874a, i10, i11);
    }

    @Override // kk.c
    public i<T> b(int i10) {
        return i10 >= this.f62875b ? this : new w(this.f62874a, i10);
    }

    @Override // kk.i
    public Iterator<T> iterator() {
        return new a(this);
    }
}
