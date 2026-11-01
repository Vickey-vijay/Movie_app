package nj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c<T> implements Iterator<T>, dk.a {
    private T nextValue;
    private int state;

    private final boolean tryToComputeNext() {
        this.state = 3;
        computeNext();
        return this.state == 1;
    }

    public abstract void computeNext();

    public final void done() {
        this.state = 2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.state;
        if (i10 == 0) {
            return tryToComputeNext();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.state;
        if (i10 == 1) {
            this.state = 0;
            return this.nextValue;
        }
        if (i10 == 2 || !tryToComputeNext()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        return this.nextValue;
    }

    public final void setNext(T t10) {
        this.nextValue = t10;
        this.state = 1;
    }
}
