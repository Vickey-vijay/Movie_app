package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.c;
import oi.o;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends xi.a<TLeft, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<? extends TRight> f61193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super TLeft, ? extends p<TLeftEnd>> f61194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o<? super TRight, ? extends p<TRightEnd>> f61195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c<? super TLeft, ? super k<TRight>, ? extends R> f61196f;

    public static final class GroupJoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements b, a {
        private static final long serialVersionUID = -6071216598687999801L;
        public volatile boolean cancelled;
        public final r<? super R> downstream;
        public final o<? super TLeft, ? extends p<TLeftEnd>> leftEnd;
        public int leftIndex;
        public final c<? super TLeft, ? super k<TRight>, ? extends R> resultSelector;
        public final o<? super TRight, ? extends p<TRightEnd>> rightEnd;
        public int rightIndex;
        public static final Integer LEFT_VALUE = 1;
        public static final Integer RIGHT_VALUE = 2;
        public static final Integer LEFT_CLOSE = 3;
        public static final Integer RIGHT_CLOSE = 4;
        public final mi.a disposables = new mi.a();
        public final zi.a<Object> queue = new zi.a<>(k.bufferSize());
        public final Map<Integer, UnicastSubject<TRight>> lefts = new LinkedHashMap();
        public final Map<Integer, TRight> rights = new LinkedHashMap();
        public final AtomicReference<Throwable> error = new AtomicReference<>();
        public final AtomicInteger active = new AtomicInteger(2);

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void innerClose(boolean z10, LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.queue.l(z10 ? LEFT_CLOSE : RIGHT_CLOSE, leftRightEndObserver);
            }
            drain();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void innerValue(boolean z10, Object obj) {
            synchronized (this) {
                this.queue.l(z10 ? LEFT_VALUE : RIGHT_VALUE, obj);
            }
            drain();
        }

        public void cancelAll() {
            this.disposables.dispose();
        }

        @Override // mi.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void errorAll(r<?> rVar) {
            Throwable thB = ExceptionHelper.b(this.error);
            Iterator<UnicastSubject<TRight>> it = this.lefts.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thB);
            }
            this.lefts.clear();
            this.rights.clear();
            rVar.onError(thB);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void innerCloseError(Throwable th2) {
            if (ExceptionHelper.a(this.error, th2)) {
                drain();
            } else {
                ej.a.s(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void innerComplete(LeftRightObserver leftRightObserver) {
            this.disposables.delete(leftRightObserver);
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void innerError(Throwable th2) {
            if (!ExceptionHelper.a(this.error, th2)) {
                ej.a.s(th2);
            } else {
                this.active.decrementAndGet();
                drain();
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        public GroupJoinDisposable(r<? super R> rVar, o<? super TLeft, ? extends p<TLeftEnd>> oVar, o<? super TRight, ? extends p<TRightEnd>> oVar2, c<? super TLeft, ? super k<TRight>, ? extends R> cVar) {
            this.downstream = rVar;
            this.leftEnd = oVar;
            this.rightEnd = oVar2;
            this.resultSelector = cVar;
        }

        public void drain() {
            boolean z10;
            boolean z11;
            if (getAndIncrement() != 0) {
                return;
            }
            zi.a<?> aVar = this.queue;
            r<? super R> rVar = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    aVar.clear();
                    cancelAll();
                    errorAll(rVar);
                    return;
                }
                if (this.active.get() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Integer num = (Integer) aVar.poll();
                if (num == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 && z11) {
                    Iterator<UnicastSubject<TRight>> it = this.lefts.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    rVar.onComplete();
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = aVar.poll();
                    if (num == LEFT_VALUE) {
                        UnicastSubject unicastSubjectC = UnicastSubject.c();
                        int i10 = this.leftIndex;
                        this.leftIndex = i10 + 1;
                        this.lefts.put(Integer.valueOf(i10), (UnicastSubject<TRight>) unicastSubjectC);
                        try {
                            p pVar = (p) qi.a.e(this.leftEnd.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            LeftRightEndObserver leftRightEndObserver = new LeftRightEndObserver(this, true, i10);
                            this.disposables.b(leftRightEndObserver);
                            pVar.subscribe(leftRightEndObserver);
                            if (this.error.get() != null) {
                                aVar.clear();
                                cancelAll();
                                errorAll(rVar);
                                return;
                            } else {
                                try {
                                    rVar.onNext((Object) qi.a.e(this.resultSelector.apply(objPoll, unicastSubjectC), "The resultSelector returned a null value"));
                                    Iterator<TRight> it2 = this.rights.values().iterator();
                                    while (it2.hasNext()) {
                                        unicastSubjectC.onNext(it2.next());
                                    }
                                } catch (Throwable th2) {
                                    fail(th2, rVar, aVar);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            fail(th3, rVar, aVar);
                            return;
                        }
                    } else if (num == RIGHT_VALUE) {
                        int i11 = this.rightIndex;
                        this.rightIndex = i11 + 1;
                        this.rights.put(Integer.valueOf(i11), (TRight) objPoll);
                        try {
                            p pVar2 = (p) qi.a.e(this.rightEnd.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            LeftRightEndObserver leftRightEndObserver2 = new LeftRightEndObserver(this, false, i11);
                            this.disposables.b(leftRightEndObserver2);
                            pVar2.subscribe(leftRightEndObserver2);
                            if (this.error.get() != null) {
                                aVar.clear();
                                cancelAll();
                                errorAll(rVar);
                                return;
                            } else {
                                Iterator<UnicastSubject<TRight>> it3 = this.lefts.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(objPoll);
                                }
                            }
                        } catch (Throwable th4) {
                            fail(th4, rVar, aVar);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        LeftRightEndObserver leftRightEndObserver3 = (LeftRightEndObserver) objPoll;
                        UnicastSubject<TRight> unicastSubjectRemove = this.lefts.remove(Integer.valueOf(leftRightEndObserver3.index));
                        this.disposables.a(leftRightEndObserver3);
                        if (unicastSubjectRemove != null) {
                            unicastSubjectRemove.onComplete();
                        }
                    } else if (num == RIGHT_CLOSE) {
                        LeftRightEndObserver leftRightEndObserver4 = (LeftRightEndObserver) objPoll;
                        this.rights.remove(Integer.valueOf(leftRightEndObserver4.index));
                        this.disposables.a(leftRightEndObserver4);
                    }
                }
            }
            aVar.clear();
        }

        public void fail(Throwable th2, r<?> rVar, zi.a<?> aVar) {
            ni.a.b(th2);
            ExceptionHelper.a(this.error, th2);
            aVar.clear();
            cancelAll();
            errorAll(rVar);
        }
    }

    public static final class LeftRightEndObserver extends AtomicReference<b> implements r<Object>, b {
        private static final long serialVersionUID = 1883890389173668373L;
        public final int index;
        public final boolean isLeft;
        public final a parent;

        @Override // ii.r
        public void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.parent.innerCloseError(th2);
        }

        public LeftRightEndObserver(a aVar, boolean z10, int i10) {
            this.parent = aVar;
            this.isLeft = z10;
            this.index = i10;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // ii.r
        public void onNext(Object obj) {
            if (DisposableHelper.dispose(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public static final class LeftRightObserver extends AtomicReference<b> implements r<Object>, b {
        private static final long serialVersionUID = 1883890389173668373L;
        public final boolean isLeft;
        public final a parent;

        @Override // ii.r
        public void onComplete() {
            this.parent.innerComplete(this);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.parent.innerError(th2);
        }

        @Override // ii.r
        public void onNext(Object obj) {
            this.parent.innerValue(this.isLeft, obj);
        }

        public LeftRightObserver(a aVar, boolean z10) {
            this.parent = aVar;
            this.isLeft = z10;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public interface a {
        void innerClose(boolean z10, LeftRightEndObserver leftRightEndObserver);

        void innerCloseError(Throwable th2);

        void innerComplete(LeftRightObserver leftRightObserver);

        void innerError(Throwable th2);

        void innerValue(boolean z10, Object obj);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // ii.k
    public void subscribeActual(r<? super R> rVar) {
        GroupJoinDisposable groupJoinDisposable = new GroupJoinDisposable(rVar, this.f61194d, this.f61195e, this.f61196f);
        rVar.onSubscribe(groupJoinDisposable);
        LeftRightObserver leftRightObserver = new LeftRightObserver(groupJoinDisposable, true);
        groupJoinDisposable.disposables.b(leftRightObserver);
        LeftRightObserver leftRightObserver2 = new LeftRightObserver(groupJoinDisposable, false);
        groupJoinDisposable.disposables.b(leftRightObserver2);
        this.f74487b.subscribe(leftRightObserver);
        this.f61193c.subscribe(leftRightObserver2);
    }

    public ObservableGroupJoin(p<TLeft> pVar, p<? extends TRight> pVar2, o<? super TLeft, ? extends p<TLeftEnd>> oVar, o<? super TRight, ? extends p<TRightEnd>> oVar2, c<? super TLeft, ? super k<TRight>, ? extends R> cVar) {
        super(pVar);
        this.f61193c = pVar2;
        this.f61194d = oVar;
        this.f61195e = oVar2;
        this.f61196f = cVar;
    }
}
