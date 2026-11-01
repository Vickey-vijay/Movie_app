package nj;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class o0<T> extends d<T> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f64750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64753e;

    /* JADX INFO: compiled from: SlidingWindow.kt */
    public static final class a extends c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f64754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f64755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o0<T> f64756d;

        public a(o0<T> o0Var) {
            this.f64756d = o0Var;
            this.f64754b = o0Var.size();
            this.f64755c = o0Var.f64752d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nj.c
        public void computeNext() {
            if (this.f64754b == 0) {
                done();
                return;
            }
            setNext(this.f64756d.f64750b[this.f64755c]);
            this.f64755c = (this.f64755c + 1) % this.f64756d.f64751c;
            this.f64754b--;
        }
    }

    public o0(Object[] objArr, int i10) {
        ck.p.j(objArr, "buffer");
        this.f64750b = objArr;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= objArr.length) {
            this.f64751c = objArr.length;
            this.f64753e = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    public final void n(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (!(i10 <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.f64752d;
            int i12 = (i11 + i10) % this.f64751c;
            if (i11 > i12) {
                l.o(this.f64750b, null, i11, this.f64751c);
                l.o(this.f64750b, null, 0, i12);
            } else {
                l.o(this.f64750b, null, i11, i12);
            }
            this.f64752d = i12;
            this.f64753e = size() - i10;
        }
    }

    @Override // nj.b, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ck.p.j(tArr, "array");
        int length = tArr.length;
        Object[] objArr = tArr;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(tArr, size());
            ck.p.i(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f64752d; i11 < size && i12 < this.f64751c; i12++) {
            objArr[i11] = this.f64750b[i12];
            i11++;
        }
        while (i11 < size) {
            objArr[i11] = this.f64750b[i10];
            i11++;
            i10++;
        }
        return (T[]) r.f(size, objArr);
    }

    @Override // nj.d, java.util.List
    public T get(int i10) {
        d.Companion.b(i10, size());
        return (T) this.f64750b[(this.f64752d + i10) % this.f64751c];
    }

    @Override // nj.d, nj.b
    public int getSize() {
        return this.f64753e;
    }

    @Override // nj.d, nj.b, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o0<T> l(int i10) {
        Object[] array;
        int i11 = this.f64751c;
        int iG = ik.k.g(i11 + (i11 >> 1) + 1, i10);
        if (this.f64752d == 0) {
            array = Arrays.copyOf(this.f64750b, iG);
            ck.p.i(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iG]);
        }
        return new o0<>(array, size());
    }

    public final void j(T t10) {
        if (!m()) {
            this.f64750b[(this.f64752d + size()) % this.f64751c] = t10;
            this.f64753e = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public final boolean m() {
        if (size() == this.f64751c) {
            return true;
        }
        return false;
    }

    public o0(int i10) {
        this(new Object[i10], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nj.b, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
