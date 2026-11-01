package kk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class v<T> implements i<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T> f62868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f62870c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f62871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f62872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ v<T> f62873d;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(v<T> vVar) {
            this.f62873d = vVar;
            this.f62871b = vVar.f62868a.iterator();
        }

        public final void a() {
            while (this.f62872c < this.f62873d.f62869b && this.f62871b.hasNext()) {
                this.f62871b.next();
                this.f62872c++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            if (this.f62872c < this.f62873d.f62870c && this.f62871b.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.f62872c < this.f62873d.f62870c) {
                this.f62872c++;
                return this.f62871b.next();
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(i<? extends T> iVar, int i10, int i11) {
        ck.p.j(iVar, "sequence");
        this.f62868a = iVar;
        this.f62869b = i10;
        this.f62870c = i11;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    public final int f() {
        return this.f62870c - this.f62869b;
    }

    @Override // kk.i
    public Iterator<T> iterator() {
        return new a(this);
    }

    @Override // kk.c
    public i<T> a(int i10) {
        if (i10 >= f()) {
            return r.i();
        }
        return new v(this.f62868a, this.f62869b + i10, this.f62870c);
    }

    @Override // kk.c
    public i<T> b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        i<T> iVar = this.f62868a;
        int i11 = this.f62869b;
        return new v(iVar, i11, i10 + i11);
    }
}
