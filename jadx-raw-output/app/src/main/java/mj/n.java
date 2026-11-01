package mj;

import com.ironsource.C3426d4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ULongArray.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class n implements Collection<m>, dk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f64553b;

    /* JADX INFO: compiled from: ULongArray.kt */
    public static final class a implements Iterator<m>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f64554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f64555c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(long[] jArr) {
            ck.p.j(jArr, "array");
            this.f64554b = jArr;
        }

        public long a() {
            int i10 = this.f64555c;
            long[] jArr = this.f64554b;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f64555c));
            }
            this.f64555c = i10 + 1;
            return m.b(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64555c < this.f64554b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ m next() {
            return m.a(a());
        }
    }

    public static final /* synthetic */ n e(long[] jArr) {
        return new n(jArr);
    }

    public static long[] g(long[] jArr) {
        ck.p.j(jArr, C3426d4.a.f28418k);
        return jArr;
    }

    public static boolean m(long[] jArr, Object obj) {
        return (obj instanceof n) && ck.p.e(jArr, ((n) obj).v());
    }

    public static int p(long[] jArr) {
        return jArr.length;
    }

    public static int q(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean r(long[] jArr) {
        return jArr.length == 0;
    }

    public static String u(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends m> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f64553b, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f64553b);
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
        return u(this.f64553b);
    }

    public final /* synthetic */ long[] v() {
        return this.f64553b;
    }

    public static long[] f(int i10) {
        return g(new long[i10]);
    }

    public static boolean l(long[] jArr, Collection<m> collection) {
        ck.p.j(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof m) && nj.n.C(jArr, ((m) obj).f()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final long n(long[] jArr, int i10) {
        return m.b(jArr[i10]);
    }

    public static Iterator<m> s(long[] jArr) {
        return new a(jArr);
    }

    public static final void t(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof m) {
            return h(((m) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        ck.p.j(collection, "elements");
        return l(this.f64553b, collection);
    }

    public boolean h(long j10) {
        return j(this.f64553b, j10);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f64553b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<m> iterator() {
        return s(this.f64553b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f64553b);
    }

    public /* synthetic */ n(long[] jArr) {
        this.f64553b = jArr;
    }

    public static boolean j(long[] jArr, long j10) {
        return nj.n.C(jArr, j10);
    }
}
