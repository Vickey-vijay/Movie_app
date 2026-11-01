package nj;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: _Arrays.kt */
/* JADX INFO: loaded from: classes10.dex */
public class n extends l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements kk.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f64749a;

        public a(Object[] objArr) {
            this.f64749a = objArr;
        }

        @Override // kk.i
        public Iterator<T> iterator() {
            return ck.b.a(this.f64749a);
        }
    }

    public static final boolean A(char[] cArr, char c10) {
        ck.p.j(cArr, "<this>");
        return T(cArr, c10) >= 0;
    }

    public static final boolean B(int[] iArr, int i10) {
        ck.p.j(iArr, "<this>");
        return U(iArr, i10) >= 0;
    }

    public static final boolean C(long[] jArr, long j10) {
        ck.p.j(jArr, "<this>");
        return V(jArr, j10) >= 0;
    }

    public static final <T> boolean D(T[] tArr, T t10) {
        ck.p.j(tArr, "<this>");
        return W(tArr, t10) >= 0;
    }

    public static final boolean E(short[] sArr, short s10) {
        ck.p.j(sArr, "<this>");
        return X(sArr, s10) >= 0;
    }

    public static final <T> List<T> F(T[] tArr, int i10) {
        ck.p.j(tArr, "<this>");
        if (i10 >= 0) {
            return k0(tArr, ik.k.d(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> List<T> G(T[] tArr) {
        ck.p.j(tArr, "<this>");
        return (List) H(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C H(T[] tArr, C c10) {
        ck.p.j(tArr, "<this>");
        ck.p.j(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static final float I(float[] fArr) {
        ck.p.j(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    public static final int J(int[] iArr) {
        ck.p.j(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    public static final <T> T K(T[] tArr) {
        ck.p.j(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static final <T> T L(T[] tArr) {
        ck.p.j(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final ik.i M(int[] iArr) {
        ck.p.j(iArr, "<this>");
        return new ik.i(0, O(iArr));
    }

    public static final int N(float[] fArr) {
        ck.p.j(fArr, "<this>");
        return fArr.length - 1;
    }

    public static final int O(int[] iArr) {
        ck.p.j(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final int P(long[] jArr) {
        ck.p.j(jArr, "<this>");
        return jArr.length - 1;
    }

    public static final <T> int Q(T[] tArr) {
        ck.p.j(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final <T> T R(T[] tArr, int i10) {
        ck.p.j(tArr, "<this>");
        boolean z10 = false;
        if (i10 >= 0 && i10 < tArr.length) {
            z10 = true;
        }
        if (z10) {
            return tArr[i10];
        }
        return null;
    }

    public static final int S(byte[] bArr, byte b10) {
        ck.p.j(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int T(char[] cArr, char c10) {
        ck.p.j(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int U(int[] iArr, int i10) {
        ck.p.j(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int V(long[] jArr, long j10) {
        ck.p.j(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <T> int W(T[] tArr, T t10) {
        ck.p.j(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (ck.p.e(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int X(short[] sArr, short s10) {
        ck.p.j(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <T, A extends Appendable> A Y(T[] tArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, bk.l<? super T, ? extends CharSequence> lVar) throws IOException {
        ck.p.j(tArr, "<this>");
        ck.p.j(a10, "buffer");
        ck.p.j(charSequence, "separator");
        ck.p.j(charSequence2, "prefix");
        ck.p.j(charSequence3, "postfix");
        ck.p.j(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            lk.n.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String Z(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, bk.l<? super T, ? extends CharSequence> lVar) {
        ck.p.j(tArr, "<this>");
        ck.p.j(charSequence, "separator");
        ck.p.j(charSequence2, "prefix");
        ck.p.j(charSequence3, "postfix");
        ck.p.j(charSequence4, "truncated");
        return ((StringBuilder) Y(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String a0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, bk.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return Z(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final int b0(int[] iArr) {
        ck.p.j(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[O(iArr)];
    }

    public static final int c0(byte[] bArr, byte b10) {
        ck.p.j(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (b10 == bArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    public static final Float d0(Float[] fArr) {
        ck.p.j(fArr, "<this>");
        int i10 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int iQ = Q(fArr);
        if (1 <= iQ) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, fArr[i10].floatValue());
                if (i10 == iQ) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Float e0(Float[] fArr) {
        ck.p.j(fArr, "<this>");
        int i10 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int iQ = Q(fArr);
        if (1 <= iQ) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, fArr[i10].floatValue());
                if (i10 == iQ) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Integer f0(int[] iArr) {
        ck.p.j(iArr, "<this>");
        int i10 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int iO = O(iArr);
        if (1 <= iO) {
            while (true) {
                int i12 = iArr[i10];
                if (i11 > i12) {
                    i11 = i12;
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        return Integer.valueOf(i11);
    }

    public static final char g0(char[] cArr) {
        ck.p.j(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final <T> T h0(T[] tArr) {
        ck.p.j(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final List<Byte> i0(byte[] bArr, ik.i iVar) {
        ck.p.j(bArr, "<this>");
        ck.p.j(iVar, "indices");
        return iVar.isEmpty() ? s.k() : l.e(l.l(bArr, iVar.getStart().intValue(), iVar.getEndInclusive().intValue() + 1));
    }

    public static final float j0(float[] fArr) {
        ck.p.j(fArr, "<this>");
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        return f10;
    }

    public static final <T> List<T> k0(T[] tArr, int i10) {
        ck.p.j(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return s.k();
        }
        int length = tArr.length;
        if (i10 >= length) {
            return q0(tArr);
        }
        if (i10 == 1) {
            return r.e(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Integer>> C l0(int[] iArr, C c10) {
        ck.p.j(iArr, "<this>");
        ck.p.j(c10, "destination");
        for (int i10 : iArr) {
            c10.add(Integer.valueOf(i10));
        }
        return c10;
    }

    public static final <T, C extends Collection<? super T>> C m0(T[] tArr, C c10) {
        ck.p.j(tArr, "<this>");
        ck.p.j(c10, "destination");
        for (T t10 : tArr) {
            c10.add(t10);
        }
        return c10;
    }

    public static final HashSet<Integer> n0(int[] iArr) {
        ck.p.j(iArr, "<this>");
        return (HashSet) l0(iArr, new HashSet(l0.f(iArr.length)));
    }

    public static final <T> HashSet<T> o0(T[] tArr) {
        ck.p.j(tArr, "<this>");
        return (HashSet) m0(tArr, new HashSet(l0.f(tArr.length)));
    }

    public static final List<Integer> p0(int[] iArr) {
        ck.p.j(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? r0(iArr) : r.e(Integer.valueOf(iArr[0]));
        }
        return s.k();
    }

    public static final <T> List<T> q0(T[] tArr) {
        ck.p.j(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? s0(tArr) : r.e(tArr[0]);
        }
        return s.k();
    }

    public static final List<Integer> r0(int[] iArr) {
        ck.p.j(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static final <T> List<T> s0(T[] tArr) {
        ck.p.j(tArr, "<this>");
        return new ArrayList(s.h(tArr));
    }

    public static final <T> Set<T> t0(T[] tArr) {
        ck.p.j(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? (Set) m0(tArr, new LinkedHashSet(l0.f(tArr.length))) : p0.d(tArr[0]);
        }
        return q0.f();
    }

    public static final <T> Iterable<d0<T>> u0(final T[] tArr) {
        ck.p.j(tArr, "<this>");
        return new e0(new bk.a() { // from class: nj.m
            @Override // bk.a
            public final Object invoke() {
                return n.v0(tArr);
            }
        });
    }

    public static final <T> kk.i<T> y(T[] tArr) {
        ck.p.j(tArr, "<this>");
        return tArr.length == 0 ? kk.r.i() : new a(tArr);
    }

    public static final boolean z(byte[] bArr, byte b10) {
        ck.p.j(bArr, "<this>");
        return S(bArr, b10) >= 0;
    }

    public static final Iterator v0(Object[] objArr) {
        return ck.b.a(objArr);
    }
}
