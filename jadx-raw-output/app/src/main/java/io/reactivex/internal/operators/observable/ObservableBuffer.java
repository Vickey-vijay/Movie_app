package io.reactivex.internal.operators.observable;

import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import mi.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends xi.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable<U> f61126e;

    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements r<T>, b {
        private static final long serialVersionUID = -8223395059921494546L;
        public final Callable<U> bufferSupplier;
        public final ArrayDeque<U> buffers = new ArrayDeque<>();
        public final int count;
        public final r<? super U> downstream;
        public long index;
        public final int skip;
        public b upstream;

        @Override // mi.b
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onNext(this.buffers.poll());
            }
            this.downstream.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.buffers.clear();
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            long j10 = this.index;
            this.index = 1 + j10;
            if (j10 % ((long) this.skip) == 0) {
                try {
                    this.buffers.offer((U) ((Collection) qi.a.e(this.bufferSupplier.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
                } catch (Throwable th2) {
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onError(th2);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t10);
                if (this.count <= next.size()) {
                    it.remove();
                    this.downstream.onNext(next);
                }
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public BufferSkipObserver(r<? super U> rVar, int i10, int i11, Callable<U> callable) {
            this.downstream = rVar;
            this.count = i10;
            this.skip = i11;
            this.bufferSupplier = callable;
        }
    }

    public static final class a<T, U extends Collection<? super T>> implements r<T>, b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r<? super U> f61127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Callable<U> f61129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public U f61130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f61131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b f61132g;

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f61130e = null;
            this.f61127b.onError(th2);
        }

        public boolean a() {
            try {
                this.f61130e = (U) qi.a.e(this.f61129d.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f61130e = null;
                b bVar = this.f61132g;
                if (bVar == null) {
                    EmptyDisposable.error(th2, this.f61127b);
                    return false;
                }
                bVar.dispose();
                this.f61127b.onError(th2);
                return false;
            }
        }

        @Override // mi.b
        public void dispose() {
            this.f61132g.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f61132g.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            U u10 = this.f61130e;
            if (u10 != null) {
                this.f61130e = null;
                if (!u10.isEmpty()) {
                    this.f61127b.onNext(u10);
                }
                this.f61127b.onComplete();
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            U u10 = this.f61130e;
            if (u10 != null) {
                u10.add(t10);
                int i10 = this.f61131f + 1;
                this.f61131f = i10;
                if (i10 >= this.f61128c) {
                    this.f61127b.onNext(u10);
                    this.f61131f = 0;
                    a();
                }
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.f61132g, bVar)) {
                this.f61132g = bVar;
                this.f61127b.onSubscribe(this);
            }
        }

        public a(r<? super U> rVar, int i10, Callable<U> callable) {
            this.f61127b = rVar;
            this.f61128c = i10;
            this.f61129d = callable;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super U> rVar) {
        int i10 = this.f61125d;
        int i11 = this.f61124c;
        if (i10 != i11) {
            this.f74487b.subscribe(new BufferSkipObserver(rVar, this.f61124c, this.f61125d, this.f61126e));
            return;
        }
        a aVar = new a(rVar, i11, this.f61126e);
        if (aVar.a()) {
            this.f74487b.subscribe(aVar);
        }
    }

    public ObservableBuffer(p<T> pVar, int i10, int i11, Callable<U> callable) {
        super(pVar);
        this.f61124c = i10;
        this.f61125d = i11;
        this.f61126e = callable;
    }
}
