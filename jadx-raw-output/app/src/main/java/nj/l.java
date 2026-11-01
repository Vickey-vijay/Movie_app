package nj;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: compiled from: _ArraysJvm.kt */
/* JADX INFO: loaded from: classes6.dex */
public class l extends k {

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class a extends d<Byte> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f64747b;

        public a(byte[] bArr) {
            this.f64747b = bArr;
        }

        @Override // nj.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return f(((Number) obj).byteValue());
            }
            return false;
        }

        public boolean f(byte b10) {
            return n.z(this.f64747b, b10);
        }

        @Override // nj.d, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Byte get(int i10) {
            return Byte.valueOf(this.f64747b[i10]);
        }

        @Override // nj.d, nj.b
        public int getSize() {
            return this.f64747b.length;
        }

        public int h(byte b10) {
            return n.S(this.f64747b, b10);
        }

        @Override // nj.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return h(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // nj.b, java.util.Collection
        public boolean isEmpty() {
            return this.f64747b.length == 0;
        }

        public int j(byte b10) {
            return n.c0(this.f64747b, b10);
        }

        @Override // nj.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return j(((Number) obj).byteValue());
            }
            return -1;
        }
    }

    public static final List<Byte> e(byte[] bArr) {
        ck.p.j(bArr, "<this>");
        return new a(bArr);
    }

    public static final <T> List<T> f(T[] tArr) {
        ck.p.j(tArr, "<this>");
        List<T> listA = o.a(tArr);
        ck.p.i(listA, "asList(...)");
        return listA;
    }

    public static final byte[] g(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        ck.p.j(bArr, "<this>");
        ck.p.j(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static final char[] h(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        ck.p.j(cArr, "<this>");
        ck.p.j(cArr2, "destination");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
        return cArr2;
    }

    public static final <T> T[] i(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        ck.p.j(tArr, "<this>");
        ck.p.j(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ byte[] j(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return g(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] k(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return i(objArr, objArr2, i10, i11, i12);
    }

    public static final byte[] l(byte[] bArr, int i10, int i11) {
        ck.p.j(bArr, "<this>");
        j.b(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        ck.p.i(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static final <T> T[] m(T[] tArr, int i10, int i11) {
        ck.p.j(tArr, "<this>");
        j.b(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        ck.p.i(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static final void n(int[] iArr, int i10, int i11, int i12) {
        ck.p.j(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final <T> void o(T[] tArr, T t10, int i10, int i11) {
        ck.p.j(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void p(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        n(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void q(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        o(objArr, obj, i10, i11);
    }

    public static final byte[] r(byte[] bArr, byte[] bArr2) {
        ck.p.j(bArr, "<this>");
        ck.p.j(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        ck.p.g(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final <T> T[] s(T[] tArr, Collection<? extends T> collection) {
        ck.p.j(tArr, "<this>");
        ck.p.j(collection, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, collection.size() + length);
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        ck.p.g(tArr2);
        return tArr2;
    }

    public static final <T> T[] t(T[] tArr, T[] tArr2) {
        ck.p.j(tArr, "<this>");
        ck.p.j(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        ck.p.g(tArr3);
        return tArr3;
    }

    public static final <T> void u(T[] tArr) {
        ck.p.j(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void v(T[] tArr, Comparator<? super T> comparator) {
        ck.p.j(tArr, "<this>");
        ck.p.j(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> w(T[] tArr) {
        ck.p.j(tArr, "<this>");
        return (SortedSet) n.m0(tArr, new TreeSet());
    }
}
