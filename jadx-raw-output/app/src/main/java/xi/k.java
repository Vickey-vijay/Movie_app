package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableBufferExactBoundary.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k<T, U extends Collection<? super T>, B> extends xi.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii.p<B> f74635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<U> f74636d;

    /* JADX INFO: compiled from: ObservableBufferExactBoundary.java */
    public static final class a<T, U extends Collection<? super T>, B> extends dj.c<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b<T, U, B> f74637c;

        @Override // ii.r
        public void onComplete() {
            this.f74637c.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74637c.onError(th2);
        }

        @Override // ii.r
        public void onNext(B b10) {
            this.f74637c.l();
        }

        public a(b<T, U, B> bVar) {
            this.f74637c = bVar;
        }
    }

    /* JADX INFO: compiled from: ObservableBufferExactBoundary.java */
    public static final class b<T, U extends Collection<? super T>, B> extends si.j<T, U, U> implements mi.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Callable<U> f74638h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ii.p<B> f74639i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public mi.b f74640j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public mi.b f74641k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public U f74642l;

        @Override // ii.r
        public void onComplete() {
            synchronized (this) {
                U u10 = this.f74642l;
                if (u10 == null) {
                    return;
                }
                this.f74642l = null;
                this.f71927d.offer(u10);
                this.f71929f = true;
                if (g()) {
                    bj.k.c(this.f71927d, this.f71926c, false, this, this);
                }
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.f74642l;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
            }
        }

        public b(ii.r<? super U> rVar, Callable<U> callable, ii.p<B> pVar) {
            super(rVar, new MpscLinkedQueue());
            this.f74638h = callable;
            this.f74639i = pVar;
        }

        @Override // mi.b
        public void dispose() {
            if (this.f71928e) {
                return;
            }
            this.f71928e = true;
            this.f74641k.dispose();
            this.f74640j.dispose();
            if (g()) {
                this.f71927d.clear();
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f71928e;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // si.j, bj.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void a(ii.r<? super U> rVar, U u10) {
            this.f71926c.onNext((Object) u10);
        }

        public void l() {
            try {
                U u10 = (U) qi.a.e(this.f74638h.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u11 = this.f74642l;
                    if (u11 == null) {
                        return;
                    }
                    this.f74642l = u10;
                    i(u11, false, this);
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                dispose();
                this.f71926c.onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74640j, bVar)) {
                this.f74640j = bVar;
                try {
                    this.f74642l = (U) qi.a.e(this.f74638h.call(), "The buffer supplied is null");
                    a aVar = new a(this);
                    this.f74641k = aVar;
                    this.f71926c.onSubscribe(this);
                    if (this.f71928e) {
                        return;
                    }
                    this.f74639i.subscribe(aVar);
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    this.f71928e = true;
                    bVar.dispose();
                    EmptyDisposable.error(th2, this.f71926c);
                }
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            dispose();
            this.f71926c.onError(th2);
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super U> rVar) {
        this.f74487b.subscribe(new b(new dj.e(rVar), this.f74636d, this.f74635c));
    }

    public k(ii.p<T> pVar, ii.p<B> pVar2, Callable<U> callable) {
        super(pVar);
        this.f74635c = pVar2;
        this.f74636d = callable;
    }
}
