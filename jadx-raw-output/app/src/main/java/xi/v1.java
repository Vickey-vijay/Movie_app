package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
/* JADX INFO: loaded from: classes10.dex */
public final class v1<T, B, V> extends xi.a<T, ii.k<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii.p<B> f74868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oi.o<? super B, ? extends ii.p<V>> f74869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f74870e;

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class a<T, V> extends dj.c<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c<T, ?, V> f74871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UnicastSubject<T> f74872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74873e;

        @Override // ii.r
        public void onComplete() {
            if (this.f74873e) {
                return;
            }
            this.f74873e = true;
            this.f74871c.k(this);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74873e) {
                ej.a.s(th2);
            } else {
                this.f74873e = true;
                this.f74871c.n(th2);
            }
        }

        public a(c<T, ?, V> cVar, UnicastSubject<T> unicastSubject) {
            this.f74871c = cVar;
            this.f74872d = unicastSubject;
        }

        @Override // ii.r
        public void onNext(V v10) {
            dispose();
            onComplete();
        }
    }

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class b<T, B> extends dj.c<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c<T, B, ?> f74874c;

        @Override // ii.r
        public void onComplete() {
            this.f74874c.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74874c.n(th2);
        }

        @Override // ii.r
        public void onNext(B b10) {
            this.f74874c.o(b10);
        }

        public b(c<T, B, ?> cVar) {
            this.f74874c = cVar;
        }
    }

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class c<T, B, V> extends si.j<T, Object, ii.k<T>> implements mi.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ii.p<B> f74875h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final oi.o<? super B, ? extends ii.p<V>> f74876i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f74877j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final mi.a f74878k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public mi.b f74879l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AtomicReference<mi.b> f74880m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List<UnicastSubject<T>> f74881n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final AtomicLong f74882o;

        @Override // si.j, bj.h
        public void a(ii.r<? super ii.k<T>> rVar, Object obj) {
        }

        @Override // mi.b
        public void dispose() {
            this.f71928e = true;
        }

        public c(ii.r<? super ii.k<T>> rVar, ii.p<B> pVar, oi.o<? super B, ? extends ii.p<V>> oVar, int i10) {
            super(rVar, new MpscLinkedQueue());
            this.f74880m = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f74882o = atomicLong;
            this.f74875h = pVar;
            this.f74876i = oVar;
            this.f74877j = i10;
            this.f74878k = new mi.a();
            this.f74881n = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f71928e;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void k(a<T, V> aVar) {
            this.f74878k.delete(aVar);
            this.f71927d.offer((U) new d(aVar.f74872d, null));
            if (g()) {
                m();
            }
        }

        public void l() {
            this.f74878k.dispose();
            DisposableHelper.dispose(this.f74880m);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void m() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.f71927d;
            ii.r<? super V> rVar = this.f71926c;
            List<UnicastSubject<T>> list = this.f74881n;
            int iD = 1;
            while (true) {
                boolean z10 = this.f71929f;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    l();
                    Throwable th2 = this.f71930g;
                    if (th2 != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z11) {
                    iD = d(-iD);
                    if (iD == 0) {
                        return;
                    }
                } else if (objPoll instanceof d) {
                    d dVar = (d) objPoll;
                    UnicastSubject<T> unicastSubject = dVar.f74883a;
                    if (unicastSubject != null) {
                        if (list.remove(unicastSubject)) {
                            dVar.f74883a.onComplete();
                            if (this.f74882o.decrementAndGet() == 0) {
                                l();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f71928e) {
                        UnicastSubject<T> unicastSubjectD = UnicastSubject.d(this.f74877j);
                        list.add(unicastSubjectD);
                        rVar.onNext(unicastSubjectD);
                        try {
                            ii.p pVar = (ii.p) qi.a.e(this.f74876i.apply(dVar.f74884b), "The ObservableSource supplied is null");
                            a aVar = new a(this, unicastSubjectD);
                            if (this.f74878k.b(aVar)) {
                                this.f74882o.getAndIncrement();
                                pVar.subscribe(aVar);
                            }
                        } catch (Throwable th3) {
                            ni.a.b(th3);
                            this.f71928e = true;
                            rVar.onError(th3);
                        }
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(NotificationLite.getValue(objPoll));
                    }
                }
            }
        }

        public void n(Throwable th2) {
            this.f74879l.dispose();
            this.f74878k.dispose();
            onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void o(B b10) {
            this.f71927d.offer((U) new d(null, b10));
            if (g()) {
                m();
            }
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f71929f) {
                return;
            }
            this.f71929f = true;
            if (g()) {
                m();
            }
            if (this.f74882o.decrementAndGet() == 0) {
                this.f74878k.dispose();
            }
            this.f71926c.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f71929f) {
                ej.a.s(th2);
                return;
            }
            this.f71930g = th2;
            this.f71929f = true;
            if (g()) {
                m();
            }
            if (this.f74882o.decrementAndGet() == 0) {
                this.f74878k.dispose();
            }
            this.f71926c.onError(th2);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74879l, bVar)) {
                this.f74879l = bVar;
                this.f71926c.onSubscribe(this);
                if (this.f71928e) {
                    return;
                }
                b bVar2 = new b(this);
                if (androidx.lifecycle.e.a(this.f74880m, null, bVar2)) {
                    this.f74882o.getAndIncrement();
                    this.f74875h.subscribe(bVar2);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onNext(T t10) {
            if (h()) {
                Iterator<UnicastSubject<T>> it = this.f74881n.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (d(-1) == 0) {
                    return;
                }
            } else {
                this.f71927d.offer((U) NotificationLite.next(t10));
                if (!g()) {
                    return;
                }
            }
            m();
        }
    }

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class d<T, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnicastSubject<T> f74883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f74884b;

        public d(UnicastSubject<T> unicastSubject, B b10) {
            this.f74883a = unicastSubject;
            this.f74884b = b10;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super ii.k<T>> rVar) {
        this.f74487b.subscribe(new c(new dj.e(rVar), this.f74868c, this.f74869d, this.f74870e));
    }

    public v1(ii.p<T> pVar, ii.p<B> pVar2, oi.o<? super B, ? extends ii.p<V>> oVar, int i10) {
        super(pVar);
        this.f74868c = pVar2;
        this.f74869d = oVar;
        this.f74870e = i10;
    }
}
