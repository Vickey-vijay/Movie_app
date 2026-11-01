package kk;

import java.util.Iterator;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b<T> implements i<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T> f62830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62831b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f62832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f62833c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void a() {
            while (this.f62833c > 0 && this.f62832b.hasNext()) {
                this.f62832b.next();
                this.f62833c--;
            }
        }

        public a(b<T> bVar) {
            this.f62832b = bVar.f62830a.iterator();
            this.f62833c = bVar.f62831b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f62832b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f62832b.next();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(i<? extends T> iVar, int i10) {
        ck.p.j(iVar, "sequence");
        this.f62830a = iVar;
        this.f62831b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // kk.c
    public i<T> a(int i10) {
        int i11 = this.f62831b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f62830a, i11);
    }

    @Override // kk.c
    public i<T> b(int i10) {
        int i11 = this.f62831b;
        int i12 = i11 + i10;
        return i12 < 0 ? new w(this, i10) : new v(this.f62830a, i11, i12);
    }

    @Override // kk.i
    public Iterator<T> iterator() {
        return new a(this);
    }
}
