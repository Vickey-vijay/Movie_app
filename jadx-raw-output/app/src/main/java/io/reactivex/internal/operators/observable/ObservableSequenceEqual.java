package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import mi.b;
import oi.d;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSequenceEqual<T> extends k<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<? extends T> f61274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<? extends T> f61275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d<? super T, ? super T> f61276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61277e;

    public static final class EqualCoordinator<T> extends AtomicInteger implements b {
        private static final long serialVersionUID = -6178010334400373240L;
        public volatile boolean cancelled;
        public final d<? super T, ? super T> comparer;
        public final r<? super Boolean> downstream;
        public final p<? extends T> first;
        public final a<T>[] observers;
        public final ArrayCompositeDisposable resources = new ArrayCompositeDisposable(2);
        public final p<? extends T> second;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        public T f61278v1;

        /* JADX INFO: renamed from: v2, reason: collision with root package name */
        public T f61279v2;

        public void cancel(zi.a<T> aVar, zi.a<T> aVar2) {
            this.cancelled = true;
            aVar.clear();
            aVar2.clear();
        }

        @Override // mi.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.resources.dispose();
            if (getAndIncrement() == 0) {
                a<T>[] aVarArr = this.observers;
                aVarArr[0].f61281c.clear();
                aVarArr[1].f61281c.clear();
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        public boolean setDisposable(b bVar, int i10) {
            return this.resources.setResource(i10, bVar);
        }

        public void subscribe() {
            a<T>[] aVarArr = this.observers;
            this.first.subscribe(aVarArr[0]);
            this.second.subscribe(aVarArr[1]);
        }

        public EqualCoordinator(r<? super Boolean> rVar, int i10, p<? extends T> pVar, p<? extends T> pVar2, d<? super T, ? super T> dVar) {
            this.downstream = rVar;
            this.first = pVar;
            this.second = pVar2;
            this.comparer = dVar;
            this.observers = new a[]{new a<>(this, 0, i10), new a<>(this, 1, i10)};
        }

        public void drain() {
            boolean z10;
            boolean z11;
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            a<T>[] aVarArr = this.observers;
            a<T> aVar = aVarArr[0];
            zi.a<T> aVar2 = aVar.f61281c;
            a<T> aVar3 = aVarArr[1];
            zi.a<T> aVar4 = aVar3.f61281c;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z12 = aVar.f61283e;
                if (z12 && (th3 = aVar.f61284f) != null) {
                    cancel(aVar2, aVar4);
                    this.downstream.onError(th3);
                    return;
                }
                boolean z13 = aVar3.f61283e;
                if (z13 && (th2 = aVar3.f61284f) != null) {
                    cancel(aVar2, aVar4);
                    this.downstream.onError(th2);
                    return;
                }
                if (this.f61278v1 == null) {
                    this.f61278v1 = aVar2.poll();
                }
                if (this.f61278v1 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f61279v2 == null) {
                    this.f61279v2 = aVar4.poll();
                }
                T t10 = this.f61279v2;
                if (t10 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 && z13 && z10 && z11) {
                    this.downstream.onNext(Boolean.TRUE);
                    this.downstream.onComplete();
                    return;
                }
                if (z12 && z13 && z10 != z11) {
                    cancel(aVar2, aVar4);
                    this.downstream.onNext(Boolean.FALSE);
                    this.downstream.onComplete();
                    return;
                }
                if (!z10 && !z11) {
                    try {
                        if (!this.comparer.test(this.f61278v1, t10)) {
                            cancel(aVar2, aVar4);
                            this.downstream.onNext(Boolean.FALSE);
                            this.downstream.onComplete();
                            return;
                        }
                        this.f61278v1 = null;
                        this.f61279v2 = null;
                    } catch (Throwable th4) {
                        ni.a.b(th4);
                        cancel(aVar2, aVar4);
                        this.downstream.onError(th4);
                        return;
                    }
                }
                if (z10 || z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            aVar2.clear();
            aVar4.clear();
        }
    }

    public static final class a<T> implements r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EqualCoordinator<T> f61280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final zi.a<T> f61281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f61283e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f61284f;

        @Override // ii.r
        public void onComplete() {
            this.f61283e = true;
            this.f61280b.drain();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f61284f = th2;
            this.f61283e = true;
            this.f61280b.drain();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f61281c.offer(t10);
            this.f61280b.drain();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            this.f61280b.setDisposable(bVar, this.f61282d);
        }

        public a(EqualCoordinator<T> equalCoordinator, int i10, int i11) {
            this.f61280b = equalCoordinator;
            this.f61282d = i10;
            this.f61281c = new zi.a<>(i11);
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super Boolean> rVar) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(rVar, this.f61277e, this.f61274b, this.f61275c, this.f61276d);
        rVar.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe();
    }

    public ObservableSequenceEqual(p<? extends T> pVar, p<? extends T> pVar2, d<? super T, ? super T> dVar, int i10) {
        this.f61274b = pVar;
        this.f61275c = pVar2;
        this.f61276d = dVar;
        this.f61277e = i10;
    }
}
