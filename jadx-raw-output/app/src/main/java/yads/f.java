package yads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f extends ja3 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77235c;

    public abstract Object a(int i10);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f77235c < this.f77234b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f77235c > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f77235c;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f77235c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public f(int i10, int i11) {
        ng2.b(i11, i10);
        this.f77234b = i10;
        this.f77235c = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f77235c;
            this.f77235c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f77235c - 1;
            this.f77235c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
