package hj;

import androidx.lifecycle.e;
import ii.r;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: BehaviorSubject.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a<T> extends c<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f53915i = new Object[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0482a[] f53916j = new C0482a[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0482a[] f53917k = new C0482a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Object> f53918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<C0482a<T>[]> f53919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReadWriteLock f53920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lock f53921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lock f53922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<Throwable> f53923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f53924h;

    /* JADX INFO: renamed from: hj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BehaviorSubject.java */
    public static final class C0482a<T> implements mi.b, bj.a.InterfaceC0019a<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r<? super T> f53925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<T> f53926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f53927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f53928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public bj.a<Object> f53929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f53930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f53931h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f53932i;

        public void a() {
            if (this.f53931h) {
                return;
            }
            synchronized (this) {
                if (this.f53931h) {
                    return;
                }
                if (this.f53927d) {
                    return;
                }
                a<T> aVar = this.f53926c;
                Lock lock = aVar.f53921e;
                lock.lock();
                this.f53932i = aVar.f53924h;
                Object obj = aVar.f53918b.get();
                lock.unlock();
                this.f53928e = obj != null;
                this.f53927d = true;
                if (obj == null || test(obj)) {
                    return;
                }
                b();
            }
        }

        public void b() {
            bj.a<Object> aVar;
            while (!this.f53931h) {
                synchronized (this) {
                    aVar = this.f53929f;
                    if (aVar == null) {
                        this.f53928e = false;
                        return;
                    }
                    this.f53929f = null;
                }
                aVar.d(this);
            }
        }

        public void c(Object obj, long j10) {
            if (this.f53931h) {
                return;
            }
            if (!this.f53930g) {
                synchronized (this) {
                    if (this.f53931h) {
                        return;
                    }
                    if (this.f53932i == j10) {
                        return;
                    }
                    if (this.f53928e) {
                        bj.a<Object> aVar = this.f53929f;
                        if (aVar == null) {
                            aVar = new bj.a<>(4);
                            this.f53929f = aVar;
                        }
                        aVar.c(obj);
                        return;
                    }
                    this.f53927d = true;
                    this.f53930g = true;
                }
            }
            test(obj);
        }

        @Override // mi.b
        public void dispose() {
            if (this.f53931h) {
                return;
            }
            this.f53931h = true;
            this.f53926c.e(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f53931h;
        }

        @Override // bj.a.InterfaceC0019a, oi.q
        public boolean test(Object obj) {
            return this.f53931h || NotificationLite.accept(obj, this.f53925b);
        }

        public C0482a(r<? super T> rVar, a<T> aVar) {
            this.f53925b = rVar;
            this.f53926c = aVar;
        }
    }

    public static <T> a<T> d() {
        return new a<>();
    }

    public boolean c(C0482a<T> c0482a) {
        C0482a<T>[] c0482aArr;
        C0482a[] c0482aArr2;
        do {
            c0482aArr = this.f53919c.get();
            if (c0482aArr == f53917k) {
                return false;
            }
            int length = c0482aArr.length;
            c0482aArr2 = new C0482a[length + 1];
            System.arraycopy(c0482aArr, 0, c0482aArr2, 0, length);
            c0482aArr2[length] = c0482a;
        } while (!e.a(this.f53919c, c0482aArr, c0482aArr2));
        return true;
    }

    public void e(C0482a<T> c0482a) {
        C0482a<T>[] c0482aArr;
        C0482a[] c0482aArr2;
        do {
            c0482aArr = this.f53919c.get();
            int length = c0482aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (c0482aArr[i11] == c0482a) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c0482aArr2 = f53916j;
            } else {
                C0482a[] c0482aArr3 = new C0482a[length - 1];
                System.arraycopy(c0482aArr, 0, c0482aArr3, 0, i10);
                System.arraycopy(c0482aArr, i10 + 1, c0482aArr3, i10, (length - i10) - 1);
                c0482aArr2 = c0482aArr3;
            }
        } while (!e.a(this.f53919c, c0482aArr, c0482aArr2));
    }

    public void f(Object obj) {
        this.f53922f.lock();
        this.f53924h++;
        this.f53918b.lazySet(obj);
        this.f53922f.unlock();
    }

    public C0482a<T>[] g(Object obj) {
        AtomicReference<C0482a<T>[]> atomicReference = this.f53919c;
        C0482a<T>[] c0482aArr = f53917k;
        C0482a<T>[] andSet = atomicReference.getAndSet(c0482aArr);
        if (andSet != c0482aArr) {
            f(obj);
        }
        return andSet;
    }

    @Override // ii.r
    public void onComplete() {
        if (e.a(this.f53923g, null, ExceptionHelper.f61400a)) {
            Object objComplete = NotificationLite.complete();
            for (C0482a<T> c0482a : g(objComplete)) {
                c0482a.c(objComplete, this.f53924h);
            }
        }
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        qi.a.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!e.a(this.f53923g, null, th2)) {
            ej.a.s(th2);
            return;
        }
        Object objError = NotificationLite.error(th2);
        for (C0482a<T> c0482a : g(objError)) {
            c0482a.c(objError, this.f53924h);
        }
    }

    @Override // ii.r
    public void onNext(T t10) {
        qi.a.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f53923g.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        f(next);
        for (C0482a<T> c0482a : this.f53919c.get()) {
            c0482a.c(next, this.f53924h);
        }
    }

    @Override // ii.r
    public void onSubscribe(mi.b bVar) {
        if (this.f53923g.get() != null) {
            bVar.dispose();
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        C0482a<T> c0482a = new C0482a<>(rVar, this);
        rVar.onSubscribe(c0482a);
        if (c(c0482a)) {
            if (c0482a.f53931h) {
                e(c0482a);
                return;
            } else {
                c0482a.a();
                return;
            }
        }
        Throwable th2 = this.f53923g.get();
        if (th2 == ExceptionHelper.f61400a) {
            rVar.onComplete();
        } else {
            rVar.onError(th2);
        }
    }

    public a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f53920d = reentrantReadWriteLock;
        this.f53921e = reentrantReadWriteLock.readLock();
        this.f53922f = reentrantReadWriteLock.writeLock();
        this.f53919c = new AtomicReference<>(f53916j);
        this.f53918b = new AtomicReference<>();
        this.f53923g = new AtomicReference<>();
    }
}
