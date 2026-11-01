package mj;

import com.ironsource.C3426d4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: UByteArray.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class j implements Collection<i>, dk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f64543b;

    /* JADX INFO: compiled from: UByteArray.kt */
    public static final class a implements Iterator<i>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f64544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f64545c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(byte[] bArr) {
            ck.p.j(bArr, "array");
            this.f64544b = bArr;
        }

        public byte a() {
            int i10 = this.f64545c;
            byte[] bArr = this.f64544b;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f64545c));
            }
            this.f64545c = i10 + 1;
            return i.b(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64545c < this.f64544b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ i next() {
            return i.a(a());
        }
    }

    public static final /* synthetic */ j e(byte[] bArr) {
        return new j(bArr);
    }

    public static byte[] g(byte[] bArr) {
        ck.p.j(bArr, C3426d4.a.f28418k);
        return bArr;
    }

    public static boolean m(byte[] bArr, Object obj) {
        return (obj instanceof j) && ck.p.e(bArr, ((j) obj).v());
    }

    public static int p(byte[] bArr) {
        return bArr.length;
    }

    public static int q(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean r(byte[] bArr) {
        return bArr.length == 0;
    }

    public static String u(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends i> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f64543b, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return q(this.f64543b);
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
        return u(this.f64543b);
    }

    public final /* synthetic */ byte[] v() {
        return this.f64543b;
    }

    public static byte[] f(int i10) {
        return g(new byte[i10]);
    }

    public static boolean l(byte[] bArr, Collection<i> collection) {
        ck.p.j(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof i) && nj.n.z(bArr, ((i) obj).f()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final byte n(byte[] bArr, int i10) {
        return i.b(bArr[i10]);
    }

    public static Iterator<i> s(byte[] bArr) {
        return new a(bArr);
    }

    public static final void t(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return h(((i) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        ck.p.j(collection, "elements");
        return l(this.f64543b, collection);
    }

    public boolean h(byte b10) {
        return j(this.f64543b, b10);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return r(this.f64543b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<i> iterator() {
        return s(this.f64543b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f64543b);
    }

    public /* synthetic */ j(byte[] bArr) {
        this.f64543b = bArr;
    }

    public static boolean j(byte[] bArr, byte b10) {
        return nj.n.z(bArr, b10);
    }
}
