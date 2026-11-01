package mj;

import com.ironsource.C3426d4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: UShortArray.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class q implements Collection<p>, dk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short[] f64559b;

    /* JADX INFO: compiled from: UShortArray.kt */
    public static final class a implements Iterator<p>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final short[] f64560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f64561c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(short[] sArr) {
            ck.p.j(sArr, "array");
            this.f64560b = sArr;
        }

        public short a() {
            int i10 = this.f64561c;
            short[] sArr = this.f64560b;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f64561c));
            }
            this.f64561c = i10 + 1;
            return p.b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64561c < this.f64560b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ p next() {
            return p.a(a());
        }
    }

    public static final /* synthetic */ q e(short[] sArr) {
        return new q(sArr);
    }

    public static short[] g(short[] sArr) {
        ck.p.j(sArr, C3426d4.a.f28418k);
        return sArr;
    }

    public static boolean m(short[] sArr, Object obj) {
        return (obj instanceof q) && ck.p.e(sArr, ((q) obj).v());
    }

    public static int p(short[] sArr) {
        return sArr.length;
    }

    public static int q(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean r(short[] sArr) {
        return sArr.length == 0;
    }

    public static String u(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(p pVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends p> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f64559b, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f64559b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return ck.h.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ck.p.j(tArr, "array");
        return (T[]) ck.h.b(this, tArr);
    }

    public String toString() {
        return u(this.f64559b);
    }

    public final /* synthetic */ short[] v() {
        return this.f64559b;
    }

    public static short[] f(int i10) {
        return g(new short[i10]);
    }

    public static boolean l(short[] sArr, Collection<p> collection) {
        ck.p.j(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof p) && nj.n.E(sArr, ((p) obj).f()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final short n(short[] sArr, int i10) {
        return p.b(sArr[i10]);
    }

    public static Iterator<p> s(short[] sArr) {
        return new a(sArr);
    }

    public static final void t(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof p) {
            return h(((p) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        ck.p.j(collection, "elements");
        return l(this.f64559b, collection);
    }

    public boolean h(short s10) {
        return j(this.f64559b, s10);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f64559b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<p> iterator() {
        return s(this.f64559b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f64559b);
    }

    public /* synthetic */ q(short[] sArr) {
        this.f64559b = sArr;
    }

    public static boolean j(short[] sArr, short s10) {
        return nj.n.E(sArr, s10);
    }
}
