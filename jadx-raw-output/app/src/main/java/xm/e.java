package xm;

import java.util.AbstractList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: BlockingArrayQueue.java */
/* JADX INFO: loaded from: classes10.dex */
public class e<E> extends AbstractList<E> implements BlockingQueue<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f74983d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f74985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile int f74986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f74987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ReentrantLock f74988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Condition f74989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f74990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ReentrantLock f74991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f74992m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74981b = 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74982c = 64;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f74984e = new AtomicInteger();

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.concurrent.BlockingQueue, java.util.Queue
    public boolean add(E e10) {
        return offer(e10);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Queue
    public boolean offer(E e10) {
        e10.getClass();
        this.f74991l.lock();
        try {
            if (this.f74984e.get() < this.f74983d) {
                if (this.f74984e.get() == this.f74986g) {
                    this.f74988i.lock();
                    try {
                        if (e()) {
                            this.f74988i.unlock();
                        } else {
                            this.f74988i.unlock();
                        }
                    } catch (Throwable th2) {
                        this.f74988i.unlock();
                        throw th2;
                    }
                }
                Object[] objArr = this.f74987h;
                int i10 = this.f74992m;
                objArr[i10] = e10;
                this.f74992m = (i10 + 1) % this.f74986g;
                boolean z10 = this.f74984e.getAndIncrement() == 0;
                this.f74991l.unlock();
                if (z10) {
                    this.f74988i.lock();
                    try {
                        this.f74989j.signal();
                    } finally {
                        this.f74988i.unlock();
                    }
                }
                return true;
            }
            this.f74991l.unlock();
            return false;
        } catch (Throwable th3) {
            this.f74991l.unlock();
            throw th3;
        }
    }

    @Override // java.util.Queue
    public E poll() {
        E e10 = null;
        if (this.f74984e.get() == 0) {
            return null;
        }
        this.f74988i.lock();
        try {
            if (this.f74984e.get() > 0) {
                int i10 = this.f74990k;
                Object[] objArr = this.f74987h;
                Object obj = objArr[i10];
                objArr[i10] = null;
                this.f74990k = (i10 + 1) % this.f74986g;
                if (this.f74984e.decrementAndGet() > 0) {
                    this.f74989j.signal();
                }
                e10 = (E) obj;
            }
            return e10;
        } finally {
            this.f74988i.unlock();
        }
    }

    @Override // java.util.Queue
    public E remove() {
        E ePoll = poll();
        if (ePoll != null) {
            return ePoll;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        e10.getClass();
        this.f74991l.lock();
        try {
            this.f74988i.lock();
            if (i10 >= 0) {
                try {
                    if (i10 <= this.f74984e.get()) {
                        if (i10 == this.f74984e.get()) {
                            add(e10);
                        } else {
                            if (this.f74992m == this.f74990k && !e()) {
                                throw new IllegalStateException("full");
                            }
                            int i11 = this.f74990k + i10;
                            if (i11 >= this.f74986g) {
                                i11 -= this.f74986g;
                            }
                            this.f74984e.incrementAndGet();
                            int i12 = (this.f74992m + 1) % this.f74986g;
                            this.f74992m = i12;
                            if (i11 < i12) {
                                Object[] objArr = this.f74987h;
                                System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
                                this.f74987h[i11] = e10;
                            } else {
                                if (i12 > 0) {
                                    Object[] objArr2 = this.f74987h;
                                    System.arraycopy(objArr2, 0, objArr2, 1, i12);
                                    Object[] objArr3 = this.f74987h;
                                    objArr3[0] = objArr3[this.f74986g - 1];
                                }
                                Object[] objArr4 = this.f74987h;
                                System.arraycopy(objArr4, i11, objArr4, i11 + 1, (this.f74986g - i11) - 1);
                                this.f74987h[i11] = e10;
                            }
                        }
                        this.f74988i.unlock();
                        this.f74991l.unlock();
                        return;
                    }
                } catch (Throwable th2) {
                    this.f74988i.unlock();
                    throw th2;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i10 + "<=" + this.f74984e + ")");
        } catch (Throwable th3) {
            this.f74991l.unlock();
            throw th3;
        }
    }

    public int c() {
        return this.f74986g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f74991l.lock();
        try {
            this.f74988i.lock();
            try {
                this.f74990k = 0;
                this.f74992m = 0;
                this.f74984e.set(0);
                this.f74988i.unlock();
                this.f74991l.unlock();
            } catch (Throwable th2) {
                this.f74988i.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f74991l.unlock();
            throw th3;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i10) {
        throw new UnsupportedOperationException();
    }

    public final boolean e() {
        int i10;
        if (this.f74985f <= 0) {
            return false;
        }
        this.f74991l.lock();
        try {
            this.f74988i.lock();
            try {
                int i11 = this.f74990k;
                int i12 = this.f74992m;
                Object[] objArr = new Object[this.f74986g + this.f74985f];
                if (i11 < i12) {
                    i10 = i12 - i11;
                    System.arraycopy(this.f74987h, i11, objArr, 0, i10);
                } else if (i11 > i12 || this.f74984e.get() > 0) {
                    int i13 = (this.f74986g + i12) - i11;
                    int i14 = this.f74986g - i11;
                    System.arraycopy(this.f74987h, i11, objArr, 0, i14);
                    System.arraycopy(this.f74987h, 0, objArr, i14, i12);
                    i10 = i13;
                } else {
                    i10 = 0;
                }
                this.f74987h = objArr;
                this.f74986g = objArr.length;
                this.f74990k = 0;
                this.f74992m = i10;
                this.f74988i.unlock();
                this.f74991l.unlock();
                return true;
            } catch (Throwable th2) {
                this.f74988i.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f74991l.unlock();
            throw th3;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        this.f74991l.lock();
        try {
            this.f74988i.lock();
            if (i10 >= 0) {
                try {
                    if (i10 < this.f74984e.get()) {
                        int i11 = this.f74990k + i10;
                        if (i11 >= this.f74986g) {
                            i11 -= this.f74986g;
                        }
                        E e10 = (E) this.f74987h[i11];
                        this.f74988i.unlock();
                        this.f74991l.unlock();
                        return e10;
                    }
                } catch (Throwable th2) {
                    this.f74988i.unlock();
                    throw th2;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i10 + "<=" + this.f74984e + ")");
        } catch (Throwable th3) {
            this.f74991l.unlock();
            throw th3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f74984e.get() == 0;
    }

    @Override // java.util.Queue
    public E peek() {
        E e10 = null;
        if (this.f74984e.get() == 0) {
            return null;
        }
        this.f74988i.lock();
        try {
            if (this.f74984e.get() > 0) {
                e10 = (E) this.f74987h[this.f74990k];
            }
            return e10;
        } finally {
            this.f74988i.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        this.f74991l.lock();
        try {
            this.f74988i.lock();
            try {
                int iC = c() - size();
                this.f74988i.unlock();
                this.f74991l.unlock();
                return iC;
            } catch (Throwable th2) {
                this.f74988i.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f74991l.unlock();
            throw th3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74984e.get();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        this.f74988i.lockInterruptibly();
        while (this.f74984e.get() == 0) {
            try {
                try {
                    this.f74989j.await();
                } catch (InterruptedException e10) {
                    this.f74989j.signal();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f74988i.unlock();
                throw th2;
            }
        }
        int i10 = this.f74990k;
        Object[] objArr = this.f74987h;
        E e11 = (E) objArr[i10];
        objArr[i10] = null;
        this.f74990k = (i10 + 1) % this.f74986g;
        if (this.f74984e.decrementAndGet() > 0) {
            this.f74989j.signal();
        }
        this.f74988i.unlock();
        return e11;
    }

    public e(int i10, int i11) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f74988i = reentrantLock;
        this.f74989j = reentrantLock.newCondition();
        this.f74991l = new ReentrantLock();
        Object[] objArr = new Object[i10];
        this.f74987h = objArr;
        this.f74986g = objArr.length;
        this.f74985f = i11;
        this.f74983d = Integer.MAX_VALUE;
    }

    @Override // java.util.Queue
    public E element() {
        E ePeek = peek();
        if (ePeek != null) {
            return ePeek;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        if (add(e10)) {
        } else {
            throw new IllegalStateException("full");
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        this.f74991l.lock();
        try {
            this.f74988i.lock();
            if (i10 >= 0) {
                try {
                    if (i10 < this.f74984e.get()) {
                        int i11 = this.f74990k + i10;
                        if (i11 >= this.f74986g) {
                            i11 -= this.f74986g;
                        }
                        Object[] objArr = this.f74987h;
                        E e10 = (E) objArr[i11];
                        int i12 = this.f74992m;
                        if (i11 < i12) {
                            System.arraycopy(objArr, i11 + 1, objArr, i11, i12 - i11);
                            this.f74992m--;
                            this.f74984e.decrementAndGet();
                        } else {
                            System.arraycopy(objArr, i11 + 1, objArr, i11, (this.f74986g - i11) - 1);
                            if (this.f74992m > 0) {
                                Object[] objArr2 = this.f74987h;
                                int i13 = this.f74986g;
                                Object[] objArr3 = this.f74987h;
                                objArr2[i13] = objArr3[0];
                                System.arraycopy(objArr3, 1, objArr3, 0, this.f74992m - 1);
                                this.f74992m--;
                            } else {
                                this.f74992m = this.f74986g - 1;
                            }
                            this.f74984e.decrementAndGet();
                        }
                        this.f74988i.unlock();
                        this.f74991l.unlock();
                        return e10;
                    }
                } catch (Throwable th2) {
                    this.f74988i.unlock();
                    throw th2;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i10 + "<=" + this.f74984e + ")");
        } catch (Throwable th3) {
            this.f74991l.unlock();
            throw th3;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        e10.getClass();
        this.f74991l.lock();
        try {
            this.f74988i.lock();
            if (i10 >= 0) {
                try {
                    if (i10 < this.f74984e.get()) {
                        int i11 = this.f74990k + i10;
                        if (i11 >= this.f74986g) {
                            i11 -= this.f74986g;
                        }
                        Object[] objArr = this.f74987h;
                        E e11 = (E) objArr[i11];
                        objArr[i11] = e10;
                        this.f74988i.unlock();
                        this.f74991l.unlock();
                        return e11;
                    }
                } catch (Throwable th2) {
                    this.f74988i.unlock();
                    throw th2;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i10 + "<=" + this.f74984e + ")");
        } catch (Throwable th3) {
            this.f74991l.unlock();
            throw th3;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j10);
        this.f74988i.lockInterruptibly();
        while (this.f74984e.get() == 0) {
            try {
                try {
                    if (nanos <= 0) {
                        this.f74988i.unlock();
                        return null;
                    }
                    nanos = this.f74989j.awaitNanos(nanos);
                } catch (InterruptedException e10) {
                    this.f74989j.signal();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f74988i.unlock();
                throw th2;
            }
        }
        Object[] objArr = this.f74987h;
        int i10 = this.f74990k;
        E e11 = (E) objArr[i10];
        objArr[i10] = null;
        this.f74990k = (i10 + 1) % this.f74986g;
        if (this.f74984e.decrementAndGet() > 0) {
            this.f74989j.signal();
        }
        this.f74988i.unlock();
        return e11;
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }
}
