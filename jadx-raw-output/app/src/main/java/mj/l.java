package mj;

import com.ironsource.C3426d4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: UIntArray.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l implements Collection<k>, dk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f64548b;

    /* JADX INFO: compiled from: UIntArray.kt */
    public static final class a implements Iterator<k>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f64549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f64550c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int[] iArr) {
            ck.p.j(iArr, "array");
            this.f64549b = iArr;
        }

        public int a() {
            int i10 = this.f64550c;
            int[] iArr = this.f64549b;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f64550c));
            }
            this.f64550c = i10 + 1;
            return k.b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64550c < this.f64549b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ k next() {
            return k.a(a());
        }
    }

    public static final /* synthetic */ l e(int[] iArr) {
        return new l(iArr);
    }

    public static int[] g(int[] iArr) {
        ck.p.j(iArr, C3426d4.a.f28418k);
        return iArr;
    }

    public static boolean m(int[] iArr, Object obj) {
        return (obj instanceof l) && ck.p.e(iArr, ((l) obj).v());
    }

    public static int p(int[] iArr) {
        return iArr.length;
    }

    public static int q(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean r(int[] iArr) {
        return iArr.length == 0;
    }

    public static String u(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f64548b, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f64548b);
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
        return u(this.f64548b);
    }

    public final /* synthetic */ int[] v() {
        return this.f64548b;
    }

    public static int[] f(int i10) {
        return g(new int[i10]);
    }

    public static boolean l(int[] iArr, Collection<k> collection) {
        ck.p.j(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof k) && nj.n.B(iArr, ((k) obj).f()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final int n(int[] iArr, int i10) {
        return k.b(iArr[i10]);
    }

    public static Iterator<k> s(int[] iArr) {
        return new a(iArr);
    }

    public static final void t(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k) {
            return h(((k) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        ck.p.j(collection, "elements");
        return l(this.f64548b, collection);
    }

    public boolean h(int i10) {
        return j(this.f64548b, i10);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f64548b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<k> iterator() {
        return s(this.f64548b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f64548b);
    }

    public /* synthetic */ l(int[] iArr) {
        this.f64548b = iArr;
    }

    public static boolean j(int[] iArr, int i10) {
        return nj.n.B(iArr, i10);
    }
}
