package nj;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class i<E> extends f<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f64740e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f64741f = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f64743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64744d;

    /* JADX INFO: compiled from: ArrayDeque.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public i(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f64741f;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.f64743c = objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        ck.p.j(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        q();
        h(size() + collection.size());
        e(p(this.f64742b + size()), collection);
        return true;
    }

    public final void o(int i10, int i11) {
        if (i10 < i11) {
            l.o(this.f64743c, null, i10, i11);
            return;
        }
        Object[] objArr = this.f64743c;
        l.o(objArr, null, i10, objArr.length);
        l.o(this.f64743c, null, 0, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        ck.p.j(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) j.a(tArr, size());
        }
        int iP = p(this.f64742b + size());
        int i10 = this.f64742b;
        if (i10 < iP) {
            l.k(this.f64743c, tArr, 0, i10, iP, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f64743c;
            l.i(objArr, tArr, 0, this.f64742b, objArr.length);
            Object[] objArr2 = this.f64743c;
            l.i(objArr2, tArr, objArr2.length - this.f64742b, 0, iP);
        }
        return (T[]) r.f(size(), tArr);
    }

    @Override // nj.f, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        d.Companion.c(i10, size());
        if (i10 == size()) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            addFirst(e10);
            return;
        }
        q();
        h(size() + 1);
        int iP = p(this.f64742b + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iG = g(iP);
            int iG2 = g(this.f64742b);
            int i11 = this.f64742b;
            if (iG >= i11) {
                Object[] objArr = this.f64743c;
                objArr[iG2] = objArr[i11];
                l.i(objArr, objArr, i11, i11 + 1, iG + 1);
            } else {
                Object[] objArr2 = this.f64743c;
                l.i(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f64743c;
                objArr3[objArr3.length - 1] = objArr3[0];
                l.i(objArr3, objArr3, 0, 1, iG + 1);
            }
            this.f64743c[iG] = e10;
            this.f64742b = iG2;
        } else {
            int iP2 = p(this.f64742b + size());
            if (iP < iP2) {
                Object[] objArr4 = this.f64743c;
                l.i(objArr4, objArr4, iP + 1, iP, iP2);
            } else {
                Object[] objArr5 = this.f64743c;
                l.i(objArr5, objArr5, 1, 0, iP2);
                Object[] objArr6 = this.f64743c;
                objArr6[0] = objArr6[objArr6.length - 1];
                l.i(objArr6, objArr6, iP + 1, iP, objArr6.length - 1);
            }
            this.f64743c[iP] = e10;
        }
        this.f64744d = size() + 1;
    }

    public final void f(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f64743c;
        l.i(objArr2, objArr, 0, this.f64742b, objArr2.length);
        Object[] objArr3 = this.f64743c;
        int length = objArr3.length;
        int i11 = this.f64742b;
        l.i(objArr3, objArr, length - i11, 0, i11);
        this.f64742b = 0;
        this.f64743c = objArr;
    }

    public final int g(int i10) {
        return i10 == 0 ? n.Q(this.f64743c) : i10 - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        d.Companion.b(i10, size());
        return (E) this.f64743c[p(this.f64742b + i10)];
    }

    @Override // nj.f
    public int getSize() {
        return this.f64744d;
    }

    public final void h(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f64743c;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f64741f) {
            this.f64743c = new Object[ik.k.d(i10, 10)];
        } else {
            f(d.Companion.e(objArr.length, i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iP = p(this.f64742b + size());
        int length = this.f64742b;
        if (length < iP) {
            while (length < iP) {
                if (ck.p.e(obj, this.f64743c[length])) {
                    i10 = this.f64742b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iP) {
            return -1;
        }
        int length2 = this.f64743c.length;
        while (length < length2) {
            if (ck.p.e(obj, this.f64743c[length])) {
                i10 = this.f64742b;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iP; i11++) {
            if (ck.p.e(obj, this.f64743c[i11])) {
                length = i11 + this.f64743c.length;
                i10 = this.f64742b;
            }
        }
        return -1;
        return length - i10;
    }

    public final int l(int i10) {
        if (i10 == n.Q(this.f64743c)) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iQ;
        int i10;
        int iP = p(this.f64742b + size());
        int i11 = this.f64742b;
        if (i11 < iP) {
            iQ = iP - 1;
            if (i11 <= iQ) {
                while (!ck.p.e(obj, this.f64743c[iQ])) {
                    if (iQ != i11) {
                        iQ--;
                    }
                }
                i10 = this.f64742b;
                return iQ - i10;
            }
            return -1;
        }
        if (i11 > iP) {
            for (int i12 = iP - 1; -1 < i12; i12--) {
                if (ck.p.e(obj, this.f64743c[i12])) {
                    iQ = i12 + this.f64743c.length;
                    i10 = this.f64742b;
                    return iQ - i10;
                }
            }
            iQ = n.Q(this.f64743c);
            int i13 = this.f64742b;
            if (i13 <= iQ) {
                while (!ck.p.e(obj, this.f64743c[iQ])) {
                    if (iQ != i13) {
                        iQ--;
                    }
                }
                i10 = this.f64742b;
                return iQ - i10;
            }
        }
        return -1;
    }

    public final int n(int i10) {
        return i10 < 0 ? i10 + this.f64743c.length : i10;
    }

    public final int p(int i10) {
        Object[] objArr = this.f64743c;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void q() {
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        int iP;
        ck.p.j(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f64743c.length == 0) == false) {
                int iP2 = p(this.f64742b + size());
                int i10 = this.f64742b;
                if (i10 < iP2) {
                    iP = i10;
                    while (i10 < iP2) {
                        Object obj = this.f64743c[i10];
                        if (!collection.contains(obj)) {
                            this.f64743c[iP] = obj;
                            iP++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    l.o(this.f64743c, null, iP, iP2);
                } else {
                    int length = this.f64743c.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f64743c;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!collection.contains(obj2)) {
                            this.f64743c[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iP = p(i11);
                    for (int i12 = 0; i12 < iP2; i12++) {
                        Object[] objArr2 = this.f64743c;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!collection.contains(obj3)) {
                            this.f64743c[iP] = obj3;
                            iP = l(iP);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    q();
                    this.f64744d = n(iP - this.f64742b);
                }
            }
        }
        return z10;
    }

    @Override // nj.f
    public E removeAt(int i10) {
        d.Companion.b(i10, size());
        if (i10 == s.m(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        q();
        int iP = p(this.f64742b + i10);
        E e10 = (E) this.f64743c[iP];
        if (i10 < (size() >> 1)) {
            int i11 = this.f64742b;
            if (iP >= i11) {
                Object[] objArr = this.f64743c;
                l.i(objArr, objArr, i11 + 1, i11, iP);
            } else {
                Object[] objArr2 = this.f64743c;
                l.i(objArr2, objArr2, 1, 0, iP);
                Object[] objArr3 = this.f64743c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f64742b;
                l.i(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f64743c;
            int i13 = this.f64742b;
            objArr4[i13] = null;
            this.f64742b = l(i13);
        } else {
            int iP2 = p(this.f64742b + s.m(this));
            if (iP <= iP2) {
                Object[] objArr5 = this.f64743c;
                l.i(objArr5, objArr5, iP, iP + 1, iP2 + 1);
            } else {
                Object[] objArr6 = this.f64743c;
                l.i(objArr6, objArr6, iP, iP + 1, objArr6.length);
                Object[] objArr7 = this.f64743c;
                objArr7[objArr7.length - 1] = objArr7[0];
                l.i(objArr7, objArr7, 0, 1, iP2 + 1);
            }
            this.f64743c[iP2] = null;
        }
        this.f64744d = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        d.Companion.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        q();
        if (i10 < size() - i11) {
            t(i10, i11);
            int iP = p(this.f64742b + i12);
            o(this.f64742b, iP);
            this.f64742b = iP;
        } else {
            u(i10, i11);
            int iP2 = p(this.f64742b + size());
            o(n(iP2 - i12), iP2);
        }
        this.f64744d = size() - i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        int iP;
        ck.p.j(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f64743c.length == 0) == false) {
                int iP2 = p(this.f64742b + size());
                int i10 = this.f64742b;
                if (i10 < iP2) {
                    iP = i10;
                    while (i10 < iP2) {
                        Object obj = this.f64743c[i10];
                        if (collection.contains(obj)) {
                            this.f64743c[iP] = obj;
                            iP++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    l.o(this.f64743c, null, iP, iP2);
                } else {
                    int length = this.f64743c.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f64743c;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (collection.contains(obj2)) {
                            this.f64743c[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iP = p(i11);
                    for (int i12 = 0; i12 < iP2; i12++) {
                        Object[] objArr2 = this.f64743c;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (collection.contains(obj3)) {
                            this.f64743c[iP] = obj3;
                            iP = l(iP);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    q();
                    this.f64744d = n(iP - this.f64742b);
                }
            }
        }
        return z10;
    }

    @Override // nj.f, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        d.Companion.b(i10, size());
        int iP = p(this.f64742b + i10);
        Object[] objArr = this.f64743c;
        E e11 = (E) objArr[iP];
        objArr[iP] = e10;
        return e11;
    }

    public final void t(int i10, int i11) {
        int iP = p(this.f64742b + (i10 - 1));
        int iP2 = p(this.f64742b + (i11 - 1));
        while (i10 > 0) {
            int i12 = iP + 1;
            int iMin = Math.min(i10, Math.min(i12, iP2 + 1));
            Object[] objArr = this.f64743c;
            int i13 = iP2 - iMin;
            int i14 = iP - iMin;
            l.i(objArr, objArr, i13 + 1, i14 + 1, i12);
            iP = n(i14);
            iP2 = n(i13);
            i10 -= iMin;
        }
    }

    public final void u(int i10, int i11) {
        int iP = p(this.f64742b + i11);
        int iP2 = p(this.f64742b + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f64743c;
            i11 = Math.min(size, Math.min(objArr.length - iP, objArr.length - iP2));
            Object[] objArr2 = this.f64743c;
            int i12 = iP + i11;
            l.i(objArr2, objArr2, iP2, iP, i12);
            iP = p(i12);
            iP2 = p(iP2 + i11);
        }
    }

    public final void addFirst(E e10) {
        q();
        h(size() + 1);
        int iG = g(this.f64742b);
        this.f64742b = iG;
        this.f64743c[iG] = e10;
        this.f64744d = size() + 1;
    }

    public final void addLast(E e10) {
        q();
        h(size() + 1);
        this.f64743c[p(this.f64742b + size())] = e10;
        this.f64744d = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            q();
            o(this.f64742b, p(this.f64742b + size()));
        }
        this.f64742b = 0;
        this.f64744d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void e(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f64743c.length;
        while (i10 < length && it.hasNext()) {
            this.f64743c[i10] = it.next();
            i10++;
        }
        int i11 = this.f64742b;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f64743c[i12] = it.next();
        }
        this.f64744d = size() + collection.size();
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.f64743c[this.f64742b];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final E j() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f64743c[this.f64742b];
    }

    public final E last() {
        if (!isEmpty()) {
            return (E) this.f64743c[p(this.f64742b + s.m(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E m() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f64743c[p(this.f64742b + s.m(this))];
    }

    public final E r() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            q();
            Object[] objArr = this.f64743c;
            int i10 = this.f64742b;
            E e10 = (E) objArr[i10];
            objArr[i10] = null;
            this.f64742b = l(i10);
            this.f64744d = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            q();
            int iP = p(this.f64742b + s.m(this));
            Object[] objArr = this.f64743c;
            E e10 = (E) objArr[iP];
            objArr[iP] = null;
            this.f64744d = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E s() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        ck.p.j(collection, "elements");
        d.Companion.c(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        q();
        h(size() + collection.size());
        int iP = p(this.f64742b + size());
        int iP2 = p(this.f64742b + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f64742b;
            int length = i11 - size;
            if (iP2 < i11) {
                Object[] objArr = this.f64743c;
                l.i(objArr, objArr, length, i11, objArr.length);
                if (size >= iP2) {
                    Object[] objArr2 = this.f64743c;
                    l.i(objArr2, objArr2, objArr2.length - size, 0, iP2);
                } else {
                    Object[] objArr3 = this.f64743c;
                    l.i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f64743c;
                    l.i(objArr4, objArr4, 0, size, iP2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f64743c;
                l.i(objArr5, objArr5, length, i11, iP2);
            } else {
                Object[] objArr6 = this.f64743c;
                length += objArr6.length;
                int i12 = iP2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    l.i(objArr6, objArr6, length, i11, iP2);
                } else {
                    l.i(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f64743c;
                    l.i(objArr7, objArr7, 0, this.f64742b + length2, iP2);
                }
            }
            this.f64742b = length;
            e(n(iP2 - size), collection);
        } else {
            int i13 = iP2 + size;
            if (iP2 < iP) {
                int i14 = size + iP;
                Object[] objArr8 = this.f64743c;
                if (i14 <= objArr8.length) {
                    l.i(objArr8, objArr8, i13, iP2, iP);
                } else if (i13 >= objArr8.length) {
                    l.i(objArr8, objArr8, i13 - objArr8.length, iP2, iP);
                } else {
                    int length3 = iP - (i14 - objArr8.length);
                    l.i(objArr8, objArr8, 0, length3, iP);
                    Object[] objArr9 = this.f64743c;
                    l.i(objArr9, objArr9, i13, iP2, length3);
                }
            } else {
                Object[] objArr10 = this.f64743c;
                l.i(objArr10, objArr10, size, 0, iP);
                Object[] objArr11 = this.f64743c;
                if (i13 >= objArr11.length) {
                    l.i(objArr11, objArr11, i13 - objArr11.length, iP2, objArr11.length);
                } else {
                    l.i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f64743c;
                    l.i(objArr12, objArr12, i13, iP2, objArr12.length - size);
                }
            }
            e(iP2, collection);
        }
        return true;
    }

    public i() {
        this.f64743c = f64741f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
