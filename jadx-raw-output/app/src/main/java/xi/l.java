package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableBufferTimed.java */
/* JADX INFO: loaded from: classes6.dex */
public final class l<T, U extends Collection<? super T>> extends xi.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f74651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f74652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ii.s f74653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Callable<U> f74654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f74655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f74656i;

    /* JADX INFO: compiled from: ObservableBufferTimed.java */
    public static final class a<T, U extends Collection<? super T>> extends si.j<T, U, U> implements Runnable, mi.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Callable<U> f74657h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f74658i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TimeUnit f74659j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f74660k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f74661l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ii.s.c f74662m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public U f74663n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public mi.b f74664o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public mi.b f74665p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f74666q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f74667r;

        @Override // ii.r
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f74663n = null;
            }
            this.f71926c.onError(th2);
            this.f74662m.dispose();
        }

        @Override // ii.r
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.f74663n;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
                if (u10.size() < this.f74660k) {
                    return;
                }
                this.f74663n = null;
                this.f74666q++;
                if (this.f74661l) {
                    this.f74664o.dispose();
                }
                j(u10, false, this);
                try {
                    U u11 = (U) qi.a.e(this.f74657h.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.f74663n = u11;
                        this.f74667r++;
                    }
                    if (this.f74661l) {
                        ii.s.c cVar = this.f74662m;
                        long j10 = this.f74658i;
                        this.f74664o = cVar.d(this, j10, j10, this.f74659j);
                    }
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    this.f71926c.onError(th2);
                    dispose();
                }
            }
        }

        public a(ii.r<? super U> rVar, Callable<U> callable, long j10, TimeUnit timeUnit, int i10, boolean z10, ii.s.c cVar) {
            super(rVar, new MpscLinkedQueue());
            this.f74657h = callable;
            this.f74658i = j10;
            this.f74659j = timeUnit;
            this.f74660k = i10;
            this.f74661l = z10;
            this.f74662m = cVar;
        }

        @Override // mi.b
        public void dispose() {
            if (this.f71928e) {
                return;
            }
            this.f71928e = true;
            this.f74665p.dispose();
            this.f74662m.dispose();
            synchronized (this) {
                this.f74663n = null;
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f71928e;
        }

        @Override // ii.r
        public void onComplete() {
            U u10;
            this.f74662m.dispose();
            synchronized (this) {
                u10 = this.f74663n;
                this.f74663n = null;
            }
            this.f71927d.offer(u10);
            this.f71929f = true;
            if (g()) {
                bj.k.c(this.f71927d, this.f71926c, false, this, this);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74665p, bVar)) {
                this.f74665p = bVar;
                try {
                    this.f74663n = (U) qi.a.e(this.f74657h.call(), "The buffer supplied is null");
                    this.f71926c.onSubscribe(this);
                    ii.s.c cVar = this.f74662m;
                    long j10 = this.f74658i;
                    this.f74664o = cVar.d(this, j10, j10, this.f74659j);
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    bVar.dispose();
                    EmptyDisposable.error(th2, this.f71926c);
                    this.f74662m.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u10 = (U) qi.a.e(this.f74657h.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u11 = this.f74663n;
                    if (u11 != null && this.f74666q == this.f74667r) {
                        this.f74663n = u10;
                        j(u11, false, this);
                    }
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                dispose();
                this.f71926c.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // si.j, bj.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void a(ii.r<? super U> rVar, U u10) {
            rVar.onNext(u10);
        }
    }

    /* JADX INFO: compiled from: ObservableBufferTimed.java */
    public static final class b<T, U extends Collection<? super T>> extends si.j<T, U, U> implements Runnable, mi.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Callable<U> f74668h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f74669i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TimeUnit f74670j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ii.s f74671k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public mi.b f74672l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public U f74673m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AtomicReference<mi.b> f74674n;

        @Override // ii.r
        public void onComplete() {
            U u10;
            synchronized (this) {
                u10 = this.f74673m;
                this.f74673m = null;
            }
            if (u10 != null) {
                this.f71927d.offer(u10);
                this.f71929f = true;
                if (g()) {
                    bj.k.c(this.f71927d, this.f71926c, false, null, this);
                }
            }
            DisposableHelper.dispose(this.f74674n);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f74673m = null;
            }
            this.f71926c.onError(th2);
            DisposableHelper.dispose(this.f74674n);
        }

        @Override // ii.r
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.f74673m;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
            }
        }

        public b(ii.r<? super U> rVar, Callable<U> callable, long j10, TimeUnit timeUnit, ii.s sVar) {
            super(rVar, new MpscLinkedQueue());
            this.f74674n = new AtomicReference<>();
            this.f74668h = callable;
            this.f74669i = j10;
            this.f74670j = timeUnit;
            this.f74671k = sVar;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this.f74674n);
            this.f74672l.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74674n.get() == DisposableHelper.DISPOSED;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // si.j, bj.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void a(ii.r<? super U> rVar, U u10) {
            this.f71926c.onNext((Object) u10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74672l, bVar)) {
                this.f74672l = bVar;
                try {
                    this.f74673m = (U) qi.a.e(this.f74668h.call(), "The buffer supplied is null");
                    this.f71926c.onSubscribe(this);
                    if (this.f71928e) {
                        return;
                    }
                    ii.s sVar = this.f74671k;
                    long j10 = this.f74669i;
                    mi.b bVarE = sVar.e(this, j10, j10, this.f74670j);
                    if (androidx.lifecycle.e.a(this.f74674n, null, bVarE)) {
                        return;
                    }
                    bVarE.dispose();
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    dispose();
                    EmptyDisposable.error(th2, this.f71926c);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u10;
            try {
                U u11 = (U) qi.a.e(this.f74668h.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u10 = this.f74673m;
                    if (u10 != null) {
                        this.f74673m = u11;
                    }
                }
                if (u10 == null) {
                    DisposableHelper.dispose(this.f74674n);
                } else {
                    i(u10, false, this);
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f71926c.onError(th2);
                dispose();
            }
        }
    }

    /* JADX INFO: compiled from: ObservableBufferTimed.java */
    public static final class c<T, U extends Collection<? super T>> extends si.j<T, U, U> implements Runnable, mi.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Callable<U> f74675h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f74676i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f74677j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final TimeUnit f74678k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ii.s.c f74679l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List<U> f74680m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public mi.b f74681n;

        /* JADX INFO: compiled from: ObservableBufferTimed.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final U f74682b;

            public a(U u10) {
                this.f74682b = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.f74680m.remove(this.f74682b);
                }
                c cVar = c.this;
                cVar.j(this.f74682b, false, cVar.f74679l);
            }
        }

        /* JADX INFO: compiled from: ObservableBufferTimed.java */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final U f74684b;

            public b(U u10) {
                this.f74684b = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.f74680m.remove(this.f74684b);
                }
                c cVar = c.this;
                cVar.j(this.f74684b, false, cVar.f74679l);
            }
        }

        public void n() {
            synchronized (this) {
                this.f74680m.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f74680m);
                this.f74680m.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f71927d.offer((U) ((Collection) it.next()));
            }
            this.f71929f = true;
            if (g()) {
                bj.k.c(this.f71927d, this.f71926c, false, this.f74679l, this);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f71929f = true;
            n();
            this.f71926c.onError(th2);
            this.f74679l.dispose();
        }

        @Override // ii.r
        public void onNext(T t10) {
            synchronized (this) {
                Iterator<U> it = this.f74680m.iterator();
                while (it.hasNext()) {
                    it.next().add(t10);
                }
            }
        }

        public c(ii.r<? super U> rVar, Callable<U> callable, long j10, long j11, TimeUnit timeUnit, ii.s.c cVar) {
            super(rVar, new MpscLinkedQueue());
            this.f74675h = callable;
            this.f74676i = j10;
            this.f74677j = j11;
            this.f74678k = timeUnit;
            this.f74679l = cVar;
            this.f74680m = new LinkedList();
        }

        @Override // mi.b
        public void dispose() {
            if (this.f71928e) {
                return;
            }
            this.f71928e = true;
            n();
            this.f74681n.dispose();
            this.f74679l.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f71928e;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74681n, bVar)) {
                this.f74681n = bVar;
                try {
                    Collection collection = (Collection) qi.a.e(this.f74675h.call(), "The buffer supplied is null");
                    this.f74680m.add((U) collection);
                    this.f71926c.onSubscribe(this);
                    ii.s.c cVar = this.f74679l;
                    long j10 = this.f74677j;
                    cVar.d(this, j10, j10, this.f74678k);
                    this.f74679l.c(new b(collection), this.f74676i, this.f74678k);
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    bVar.dispose();
                    EmptyDisposable.error(th2, this.f71926c);
                    this.f74679l.dispose();
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f71928e) {
                return;
            }
            try {
                Collection collection = (Collection) qi.a.e(this.f74675h.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (this.f71928e) {
                        return;
                    }
                    this.f74680m.add((U) collection);
                    this.f74679l.c(new a(collection), this.f74676i, this.f74678k);
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f71926c.onError(th2);
                dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // si.j, bj.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void a(ii.r<? super U> rVar, U u10) {
            rVar.onNext(u10);
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super U> rVar) {
        if (this.f74650c == this.f74651d && this.f74655h == Integer.MAX_VALUE) {
            this.f74487b.subscribe(new b(new dj.e(rVar), this.f74654g, this.f74650c, this.f74652e, this.f74653f));
            return;
        }
        ii.s.c cVarA = this.f74653f.a();
        if (this.f74650c == this.f74651d) {
            this.f74487b.subscribe(new a(new dj.e(rVar), this.f74654g, this.f74650c, this.f74652e, this.f74655h, this.f74656i, cVarA));
        } else {
            this.f74487b.subscribe(new c(new dj.e(rVar), this.f74654g, this.f74650c, this.f74651d, this.f74652e, cVarA));
        }
    }

    public l(ii.p<T> pVar, long j10, long j11, TimeUnit timeUnit, ii.s sVar, Callable<U> callable, int i10, boolean z10) {
        super(pVar);
        this.f74650c = j10;
        this.f74651d = j11;
        this.f74652e = timeUnit;
        this.f74653f = sVar;
        this.f74654g = callable;
        this.f74655h = i10;
        this.f74656i = z10;
    }
}
