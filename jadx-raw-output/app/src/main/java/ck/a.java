package ck;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a<T> implements Iterator<T>, dk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T[] f6043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6044c;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public a(T[] tArr) {
        p.j(tArr, "array");
        this.f6043b = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6044c < this.f6043b.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f6043b;
            int i10 = this.f6044c;
            this.f6044c = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f6044c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
