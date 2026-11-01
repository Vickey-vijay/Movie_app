package nj;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.SlidingWindowKt;
import kotlin.random.Random;

/* JADX INFO: compiled from: _Collections.kt */
/* JADX INFO: loaded from: classes10.dex */
public class b0 extends z {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements kk.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f64725a;

        public a(Iterable iterable) {
            this.f64725a = iterable;
        }

        @Override // kk.i
        public Iterator<T> iterator() {
            return this.f64725a.iterator();
        }
    }

    public static final <T> T A0(Collection<? extends T> collection, Random random) {
        ck.p.j(collection, "<this>");
        ck.p.j(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) Z(collection, random.nextInt(collection.size()));
    }

    public static final <T> List<T> B0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return O0(iterable);
        }
        List<T> listQ0 = Q0(iterable);
        z.Q(listQ0);
        return listQ0;
    }

    public static final <T> T C0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) D0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T D0(List<? extends T> list) {
        ck.p.j(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T> T E0(List<? extends T> list) {
        ck.p.j(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final <T> List<T> F0(List<? extends T> list, ik.i iVar) {
        ck.p.j(list, "<this>");
        ck.p.j(iVar, "indices");
        return iVar.isEmpty() ? s.k() : O0(list.subList(iVar.getStart().intValue(), iVar.getEndInclusive().intValue() + 1));
    }

    public static final <T extends Comparable<? super T>> List<T> G0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listQ0 = Q0(iterable);
            w.A(listQ0);
            return listQ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return O0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        l.u((Comparable[]) array);
        return l.f(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> H0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        ck.p.j(iterable, "<this>");
        ck.p.j(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listQ0 = Q0(iterable);
            w.B(listQ0, comparator);
            return listQ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return O0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        l.v(array, comparator);
        return l.f(array);
    }

    public static final <T> List<T> I0(Iterable<? extends T> iterable, int i10) {
        ck.p.j(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return s.k();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return O0(iterable);
            }
            if (i10 == 1) {
                return r.e(e0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return s.r(arrayList);
    }

    public static final <T> List<T> J0(List<? extends T> list, int i10) {
        ck.p.j(list, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return s.k();
        }
        int size = list.size();
        if (i10 >= size) {
            return O0(list);
        }
        if (i10 == 1) {
            return r.e(r0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final boolean[] K0(Collection<Boolean> collection) {
        ck.p.j(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = it.next().booleanValue();
            i10++;
        }
        return zArr;
    }

    public static final <T, C extends Collection<? super T>> C L0(Iterable<? extends T> iterable, C c10) {
        ck.p.j(iterable, "<this>");
        ck.p.j(c10, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    public static final <T> HashSet<T> M0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        return (HashSet) L0(iterable, new HashSet(l0.f(t.v(iterable, 12))));
    }

    public static final int[] N0(Collection<Integer> collection) {
        ck.p.j(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static final <T> List<T> O0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return s.r(Q0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return s.k();
        }
        if (size != 1) {
            return R0(collection);
        }
        return r.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final long[] P0(Collection<Long> collection) {
        ck.p.j(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public static final <T> List<T> Q0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        return iterable instanceof Collection ? R0((Collection) iterable) : (List) L0(iterable, new ArrayList());
    }

    public static final <T> List<T> R0(Collection<? extends T> collection) {
        ck.p.j(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> kk.i<T> S(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        return new a(iterable);
    }

    public static final <T> Set<T> S0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) L0(iterable, new LinkedHashSet());
    }

    public static final <T> List<List<T>> T(Iterable<? extends T> iterable, int i10) {
        ck.p.j(iterable, "<this>");
        return U0(iterable, i10, i10, true);
    }

    public static final <T> Set<T> T0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return q0.i((Set) L0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return q0.f();
        }
        if (size != 1) {
            return (Set) L0(iterable, new LinkedHashSet(l0.f(collection.size())));
        }
        return p0.d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final <T> boolean U(Iterable<? extends T> iterable, T t10) {
        ck.p.j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t10);
        }
        return j0(iterable, t10) >= 0;
    }

    public static final <T> List<List<T>> U0(Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        int iG;
        ck.p.j(iterable, "<this>");
        SlidingWindowKt.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = SlidingWindowKt.b(iterable.iterator(), i10, i11, z10, false);
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size) || ((iG = ik.k.g(i10, size - i12)) < i10 && !z10)) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iG);
            for (int i13 = 0; i13 < iG; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    public static final <T> int V(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        int i10 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                s.t();
            }
        }
        return i10;
    }

    public static final <T, R> List<Pair<T, R>> V0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        ck.p.j(iterable, "<this>");
        ck.p.j(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(t.v(iterable, 10), t.v(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(mj.h.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T> List<T> W(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        return O0(S0(iterable));
    }

    public static final <T> List<T> X(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        ck.p.j(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return O0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return s.k();
            }
            if (size == 1) {
                return r.e(q0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        for (T t10 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t10);
            } else {
                i11++;
            }
        }
        return s.r(arrayList);
    }

    public static final <T> List<T> Y(List<? extends T> list, int i10) {
        ck.p.j(list, "<this>");
        if (i10 >= 0) {
            return I0(list, ik.k.d(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> T Z(Iterable<? extends T> iterable, final int i10) {
        ck.p.j(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) b0(iterable, i10, new bk.l() { // from class: nj.a0
            @Override // bk.l
            public final Object invoke(Object obj) {
                return b0.a0(i10, ((Integer) obj).intValue());
            }
        });
    }

    public static final Object a0(int i10, int i11) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i10 + '.');
    }

    public static final <T> T b0(Iterable<? extends T> iterable, int i10, bk.l<? super Integer, ? extends T> lVar) {
        ck.p.j(iterable, "<this>");
        ck.p.j(lVar, "defaultValue");
        int i11 = 0;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i10 >= 0 && i10 < list.size()) {
                i11 = 1;
            }
            return i11 != 0 ? (T) list.get(i10) : lVar.invoke(Integer.valueOf(i10));
        }
        if (i10 < 0) {
            return lVar.invoke(Integer.valueOf(i10));
        }
        for (T t10 : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return lVar.invoke(Integer.valueOf(i10));
    }

    public static final <T> List<T> c0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        return (List) d0(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C d0(Iterable<? extends T> iterable, C c10) {
        ck.p.j(iterable, "<this>");
        ck.p.j(c10, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static final <T> T e0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) f0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T f0(List<? extends T> list) {
        ck.p.j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final <T> T g0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T> T h0(List<? extends T> list) {
        ck.p.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> T i0(List<? extends T> list, int i10) {
        ck.p.j(list, "<this>");
        boolean z10 = false;
        if (i10 >= 0 && i10 < list.size()) {
            z10 = true;
        }
        if (z10) {
            return list.get(i10);
        }
        return null;
    }

    public static final <T> int j0(Iterable<? extends T> iterable, T t10) {
        ck.p.j(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                s.u();
            }
            if (ck.p.e(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int k0(List<? extends T> list, T t10) {
        ck.p.j(list, "<this>");
        return list.indexOf(t10);
    }

    public static final <T> Set<T> l0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        ck.p.j(iterable, "<this>");
        ck.p.j(iterable2, "other");
        Set<T> setS0 = S0(iterable);
        x.N(setS0, iterable2);
        return setS0;
    }

    public static final <T, A extends Appendable> A m0(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, bk.l<? super T, ? extends CharSequence> lVar) throws IOException {
        ck.p.j(iterable, "<this>");
        ck.p.j(a10, "buffer");
        ck.p.j(charSequence, "separator");
        ck.p.j(charSequence2, "prefix");
        ck.p.j(charSequence3, "postfix");
        ck.p.j(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iterable) {
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

    public static final <T> String o0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, bk.l<? super T, ? extends CharSequence> lVar) {
        ck.p.j(iterable, "<this>");
        ck.p.j(charSequence, "separator");
        ck.p.j(charSequence2, "prefix");
        ck.p.j(charSequence3, "postfix");
        ck.p.j(charSequence4, "truncated");
        return ((StringBuilder) m0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String p0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, bk.l lVar, int i11, Object obj) {
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
        return o0(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final <T> T q0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) r0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> T r0(List<? extends T> list) {
        ck.p.j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(s.m(list));
    }

    public static final <T> T s0(List<? extends T> list) {
        ck.p.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T extends Comparable<? super T>> T t0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T extends Comparable<? super T>> T u0(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> List<T> v0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        ck.p.j(iterable, "<this>");
        ck.p.j(iterable2, "elements");
        Collection collectionE = x.E(iterable2);
        if (collectionE.isEmpty()) {
            return O0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!collectionE.contains(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> w0(Iterable<? extends T> iterable, T t10) {
        ck.p.j(iterable, "<this>");
        ArrayList arrayList = new ArrayList(t.v(iterable, 10));
        boolean z10 = false;
        for (T t11 : iterable) {
            boolean z11 = true;
            if (!z10 && ck.p.e(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> x0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        ck.p.j(iterable, "<this>");
        ck.p.j(iterable2, "elements");
        if (iterable instanceof Collection) {
            return y0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        x.C(arrayList, iterable);
        x.C(arrayList, iterable2);
        return arrayList;
    }

    public static final <T> List<T> y0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        ck.p.j(collection, "<this>");
        ck.p.j(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            x.C(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static final <T> List<T> z0(Collection<? extends T> collection, T t10) {
        ck.p.j(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }
}
