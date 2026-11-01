package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
abstract class AbstractMapBasedMultiset<E> extends d<E> implements Serializable {
    private static final long serialVersionUID = 0;
    public transient e2<E> backingMap;
    public transient long size;

    public class a extends AbstractMapBasedMultiset<E>.c<E> {
        public a() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.c
        public E b(int i10) {
            return AbstractMapBasedMultiset.this.backingMap.i(i10);
        }
    }

    public class b extends AbstractMapBasedMultiset<E>.c<b2.a<E>> {
        public b() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b2.a<E> b(int i10) {
            return AbstractMapBasedMultiset.this.backingMap.g(i10);
        }
    }

    public abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20305c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20306d;

        public abstract T b(int i10);

        public c() {
            this.f20304b = AbstractMapBasedMultiset.this.backingMap.e();
            this.f20306d = AbstractMapBasedMultiset.this.backingMap.f20599d;
        }

        public final void a() {
            if (AbstractMapBasedMultiset.this.backingMap.f20599d != this.f20306d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            if (this.f20304b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T tB = b(this.f20304b);
                int i10 = this.f20304b;
                this.f20305c = i10;
                this.f20304b = AbstractMapBasedMultiset.this.backingMap.s(i10);
                return tB;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z10;
            a();
            if (this.f20305c != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j1.e(z10);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.size -= (long) abstractMapBasedMultiset.backingMap.x(this.f20305c);
            this.f20304b = AbstractMapBasedMultiset.this.backingMap.t(this.f20304b, this.f20305c);
            this.f20305c = -1;
            this.f20306d = AbstractMapBasedMultiset.this.backingMap.f20599d;
        }
    }

    public abstract e2<E> newBackingMap(int i10);

    @Override // com.google.common.collect.d, com.google.common.collect.b2
    public final int setCount(E e10, int i10) {
        j1.b(i10, "count");
        e2<E> e2Var = this.backingMap;
        int iV = i10 == 0 ? e2Var.v(e10) : e2Var.u(e10, i10);
        this.size += (long) (i10 - iV);
        return iV;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.b2
    public final int add(E e10, int i10) {
        if (i10 == 0) {
            return count(e10);
        }
        m5.l.f(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iM = this.backingMap.m(e10);
        if (iM == -1) {
            this.backingMap.u(e10, i10);
            this.size += (long) i10;
            return 0;
        }
        int iK = this.backingMap.k(iM);
        long j10 = i10;
        long j11 = ((long) iK) + j10;
        m5.l.h(j11 <= 2147483647L, "too many occurrences: %s", j11);
        this.backingMap.B(iM, (int) j11);
        this.size += j10;
        return iK;
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.a();
        this.size = 0L;
    }

    @Override // com.google.common.collect.b2
    public final int count(Object obj) {
        return this.backingMap.f(obj);
    }

    @Override // com.google.common.collect.d
    public final int distinctElements() {
        return this.backingMap.C();
    }

    @Override // com.google.common.collect.d
    public final Iterator<E> elementIterator() {
        return new a();
    }

    @Override // com.google.common.collect.d
    public final Iterator<b2.a<E>> entryIterator() {
        return new b();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.b2
    public final int remove(Object obj, int i10) {
        if (i10 == 0) {
            return count(obj);
        }
        m5.l.f(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iM = this.backingMap.m(obj);
        if (iM == -1) {
            return 0;
        }
        int iK = this.backingMap.k(iM);
        if (iK > i10) {
            this.backingMap.B(iM, iK - i10);
        } else {
            this.backingMap.x(iM);
            i10 = iK;
        }
        this.size -= (long) i10;
        return iK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.b2
    public final int size() {
        return Ints.m(this.size);
    }

    public AbstractMapBasedMultiset(int i10) {
        this.backingMap = newBackingMap(i10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iD = j2.d(objectInputStream);
        this.backingMap = newBackingMap(3);
        j2.c(this, objectInputStream, iD);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        j2.f(this, objectOutputStream);
    }

    public void addTo(b2<? super E> b2Var) {
        m5.l.m(b2Var);
        int iE = this.backingMap.e();
        while (iE >= 0) {
            b2Var.add(this.backingMap.i(iE), this.backingMap.k(iE));
            iE = this.backingMap.s(iE);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.b2
    public final boolean setCount(E e10, int i10, int i11) {
        j1.b(i10, "oldCount");
        j1.b(i11, "newCount");
        int iM = this.backingMap.m(e10);
        if (iM == -1) {
            if (i10 != 0) {
                return false;
            }
            if (i11 > 0) {
                this.backingMap.u(e10, i11);
                this.size += (long) i11;
            }
            return true;
        }
        if (this.backingMap.k(iM) != i10) {
            return false;
        }
        if (i11 == 0) {
            this.backingMap.x(iM);
            this.size -= (long) i10;
        } else {
            this.backingMap.B(iM, i11);
            this.size += (long) (i11 - i10);
        }
        return true;
    }
}
