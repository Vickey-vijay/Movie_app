package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import oi.o;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableReplay<T> extends cj.a<T> implements pi.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f61244f = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<T> f61245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<ReplayObserver<T>> f61246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a<T> f61247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<T> f61248e;

    public static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements e<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        public int size;
        public Node tail;

        public Object enterTransform(Object obj) {
            return obj;
        }

        public Object leaveTransform(Object obj) {
            return obj;
        }

        public abstract void truncate();

        public final void addLast(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        public boolean hasCompleted() {
            Object obj = this.tail.value;
            return obj != null && NotificationLite.isComplete(leaveTransform(obj));
        }

        public boolean hasError() {
            Object obj = this.tail.value;
            return obj != null && NotificationLite.isError(leaveTransform(obj));
        }

        public BoundedReplayBuffer() {
            Node node = new Node(null);
            this.tail = node;
            set(node);
        }

        public final void collect(Collection<? super T> collection) {
            Node head = getHead();
            while (true) {
                head = head.get();
                if (head != null) {
                    Object objLeaveTransform = leaveTransform(head.value);
                    if (!NotificationLite.isComplete(objLeaveTransform) && !NotificationLite.isError(objLeaveTransform)) {
                        collection.add((Object) NotificationLite.getValue(objLeaveTransform));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void complete() {
            addLast(new Node(enterTransform(NotificationLite.complete())));
            truncateFinal();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void error(Throwable th2) {
            addLast(new Node(enterTransform(NotificationLite.error(th2))));
            truncateFinal();
        }

        public Node getHead() {
            return get();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void next(T t10) {
            addLast(new Node(enterTransform(NotificationLite.next(t10))));
            truncate();
        }

        public final void removeFirst() {
            Node node = get().get();
            this.size--;
            setFirst(node);
        }

        public final void removeSome(int i10) {
            Node node = get();
            while (i10 > 0) {
                node = node.get();
                i10--;
                this.size--;
            }
            setFirst(node);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void replay(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                Node head = (Node) innerDisposable.index();
                if (head == null) {
                    head = getHead();
                    innerDisposable.index = head;
                }
                while (!innerDisposable.isDisposed()) {
                    Node node = head.get();
                    if (node != null) {
                        if (NotificationLite.accept(leaveTransform(node.value), innerDisposable.child)) {
                            innerDisposable.index = null;
                            return;
                        }
                        head = node;
                    } else {
                        innerDisposable.index = head;
                        iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                    }
                }
                return;
            } while (iAddAndGet != 0);
        }

        public final void setFirst(Node node) {
            set(node);
        }

        public final void trimHead() {
            Node node = get();
            if (node.value != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        public void truncateFinal() {
            trimHead();
        }
    }

    public static final class InnerDisposable<T> extends AtomicInteger implements mi.b {
        private static final long serialVersionUID = 2728361546769921047L;
        public volatile boolean cancelled;
        public final r<? super T> child;
        public Object index;
        public final ReplayObserver<T> parent;

        @Override // mi.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.parent.remove(this);
        }

        public <U> U index() {
            return (U) this.index;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        public InnerDisposable(ReplayObserver<T> replayObserver, r<? super T> rVar) {
            this.parent = replayObserver;
            this.child = rVar;
        }
    }

    public static final class ReplayObserver<T> extends AtomicReference<mi.b> implements r<T>, mi.b {
        public static final InnerDisposable[] EMPTY = new InnerDisposable[0];
        public static final InnerDisposable[] TERMINATED = new InnerDisposable[0];
        private static final long serialVersionUID = -533785617179540163L;
        public final e<T> buffer;
        public boolean done;
        public final AtomicReference<InnerDisposable[]> observers = new AtomicReference<>(EMPTY);
        public final AtomicBoolean shouldConnect = new AtomicBoolean();

        public boolean add(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                if (innerDisposableArr == TERMINATED) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!androidx.lifecycle.e.a(this.observers, innerDisposableArr, innerDisposableArr2));
            return true;
        }

        @Override // mi.b
        public void dispose() {
            this.observers.set(TERMINATED);
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.observers.get() == TERMINATED;
        }

        @Override // ii.r
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.buffer.complete();
            replayFinal();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.done) {
                ej.a.s(th2);
                return;
            }
            this.done = true;
            this.buffer.error(th2);
            replayFinal();
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            this.buffer.next(t10);
            replay();
        }

        public void remove(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (innerDisposableArr[i11].equals(innerDisposable)) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = EMPTY;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i10);
                    System.arraycopy(innerDisposableArr, i10 + 1, innerDisposableArr3, i10, (length - i10) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!androidx.lifecycle.e.a(this.observers, innerDisposableArr, innerDisposableArr2));
        }

        public void replay() {
            for (InnerDisposable<T> innerDisposable : this.observers.get()) {
                this.buffer.replay(innerDisposable);
            }
        }

        public void replayFinal() {
            for (InnerDisposable<T> innerDisposable : this.observers.getAndSet(TERMINATED)) {
                this.buffer.replay(innerDisposable);
            }
        }

        public ReplayObserver(e<T> eVar) {
            this.buffer = eVar;
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                replay();
            }
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        public final int limit;
        public final long maxAge;
        public final s scheduler;
        public final TimeUnit unit;

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Object enterTransform(Object obj) {
            return new gj.b(obj, this.scheduler.b(this.unit), this.unit);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Node getHead() {
            Node node;
            long jB = this.scheduler.b(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                gj.b bVar = (gj.b) node2.value;
                if (NotificationLite.isComplete(bVar.b()) || NotificationLite.isError(bVar.b()) || bVar.a() > jB) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Object leaveTransform(Object obj) {
            return ((gj.b) obj).b();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void truncate() {
            Node node;
            long jB = this.scheduler.b(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    int i11 = this.size;
                    if (i11 <= this.limit) {
                        if (((gj.b) node2.value).a() > jB) {
                            break;
                        }
                        i10++;
                        this.size--;
                        node3 = node2.get();
                    } else {
                        i10++;
                        this.size = i11 - 1;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i10 != 0) {
                setFirst(node);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void truncateFinal() {
            Node node;
            long jB = this.scheduler.b(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || this.size <= 1 || ((gj.b) node2.value).a() > jB) {
                    break;
                }
                i10++;
                this.size--;
                node3 = node2.get();
            }
            if (i10 != 0) {
                setFirst(node);
            }
        }

        public SizeAndTimeBoundReplayBuffer(int i10, long j10, TimeUnit timeUnit, s sVar) {
            this.scheduler = sVar;
            this.limit = i10;
            this.maxAge = j10;
            this.unit = timeUnit;
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        public final int limit;

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }

        public SizeBoundReplayBuffer(int i10) {
            this.limit = i10;
        }
    }

    public interface a<T> {
        e<T> call();
    }

    public static final class b<R> implements oi.g<mi.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ObserverResourceWrapper<R> f61249b;

        @Override // oi.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(mi.b bVar) {
            this.f61249b.setResource(bVar);
        }

        public b(ObserverResourceWrapper<R> observerResourceWrapper) {
            this.f61249b = observerResourceWrapper;
        }
    }

    public static final class c<R, U> extends k<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Callable<? extends cj.a<U>> f61250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o<? super k<U>, ? extends p<R>> f61251c;

        @Override // ii.k
        public void subscribeActual(r<? super R> rVar) {
            try {
                cj.a aVar = (cj.a) qi.a.e(this.f61250b.call(), "The connectableFactory returned a null ConnectableObservable");
                p pVar = (p) qi.a.e(this.f61251c.apply(aVar), "The selector returned a null ObservableSource");
                ObserverResourceWrapper observerResourceWrapper = new ObserverResourceWrapper(rVar);
                pVar.subscribe(observerResourceWrapper);
                aVar.b(new b(observerResourceWrapper));
            } catch (Throwable th2) {
                ni.a.b(th2);
                EmptyDisposable.error(th2, rVar);
            }
        }

        public c(Callable<? extends cj.a<U>> callable, o<? super k<U>, ? extends p<R>> oVar) {
            this.f61250b = callable;
            this.f61251c = oVar;
        }
    }

    public static final class d<T> extends cj.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final cj.a<T> f61252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k<T> f61253c;

        @Override // cj.a
        public void b(oi.g<? super mi.b> gVar) {
            this.f61252b.b(gVar);
        }

        @Override // ii.k
        public void subscribeActual(r<? super T> rVar) {
            this.f61253c.subscribe(rVar);
        }

        public d(cj.a<T> aVar, k<T> kVar) {
            this.f61252b = aVar;
            this.f61253c = kVar;
        }
    }

    public interface e<T> {
        void complete();

        void error(Throwable th2);

        void next(T t10);

        void replay(InnerDisposable<T> innerDisposable);
    }

    public static final class f<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61254a;

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public e<T> call() {
            return new SizeBoundReplayBuffer(this.f61254a);
        }

        public f(int i10) {
            this.f61254a = i10;
        }
    }

    public static final class g<T> implements p<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<ReplayObserver<T>> f61255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<T> f61256c;

        @Override // ii.p
        public void subscribe(r<? super T> rVar) {
            ReplayObserver<T> replayObserver;
            while (true) {
                replayObserver = this.f61255b.get();
                if (replayObserver != null) {
                    break;
                }
                ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.f61256c.call());
                if (androidx.lifecycle.e.a(this.f61255b, null, replayObserver2)) {
                    replayObserver = replayObserver2;
                    break;
                }
            }
            InnerDisposable<T> innerDisposable = new InnerDisposable<>(replayObserver, rVar);
            rVar.onSubscribe(innerDisposable);
            replayObserver.add(innerDisposable);
            if (innerDisposable.isDisposed()) {
                replayObserver.remove(innerDisposable);
            } else {
                replayObserver.buffer.replay(innerDisposable);
            }
        }

        public g(AtomicReference<ReplayObserver<T>> atomicReference, a<T> aVar) {
            this.f61255b = atomicReference;
            this.f61256c = aVar;
        }
    }

    public static final class h<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f61258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f61259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final s f61260d;

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public e<T> call() {
            return new SizeAndTimeBoundReplayBuffer(this.f61257a, this.f61258b, this.f61259c, this.f61260d);
        }

        public h(int i10, long j10, TimeUnit timeUnit, s sVar) {
            this.f61257a = i10;
            this.f61258b = j10;
            this.f61259c = timeUnit;
            this.f61260d = sVar;
        }
    }

    public static final class i implements a<Object> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public e<Object> call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        public final Object value;

        public Node(Object obj) {
            this.value = obj;
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements e<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        public volatile int size;

        public UnboundedReplayBuffer(int i10) {
            super(i10);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void complete() {
            add(NotificationLite.complete());
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void error(Throwable th2) {
            add(NotificationLite.error(th2));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void next(T t10) {
            add(NotificationLite.next(t10));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void replay(InnerDisposable<T> innerDisposable) {
            int iIntValue;
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            r<? super T> rVar = innerDisposable.child;
            int iAddAndGet = 1;
            while (!innerDisposable.isDisposed()) {
                int i10 = this.size;
                Integer num = (Integer) innerDisposable.index();
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                while (iIntValue < i10) {
                    if (NotificationLite.accept(get(iIntValue), rVar) || innerDisposable.isDisposed()) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                innerDisposable.index = Integer.valueOf(iIntValue);
                iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public static <T> cj.a<T> f(p<T> pVar, long j10, TimeUnit timeUnit, s sVar, int i10) {
        return g(pVar, new h(i10, j10, timeUnit, sVar));
    }

    public static <T> cj.a<T> g(p<T> pVar, a<T> aVar) {
        AtomicReference atomicReference = new AtomicReference();
        return ej.a.k(new ObservableReplay(new g(atomicReference, aVar), pVar, atomicReference, aVar));
    }

    public static <T> cj.a<T> h(p<? extends T> pVar) {
        return g(pVar, f61244f);
    }

    public static <U, R> k<R> i(Callable<? extends cj.a<U>> callable, o<? super k<U>, ? extends p<R>> oVar) {
        return ej.a.o(new c(callable, oVar));
    }

    @Override // pi.c
    public void a(mi.b bVar) {
        androidx.lifecycle.e.a(this.f61246c, (ReplayObserver) bVar, null);
    }

    @Override // cj.a
    public void b(oi.g<? super mi.b> gVar) {
        ReplayObserver<T> replayObserver;
        while (true) {
            replayObserver = this.f61246c.get();
            if (replayObserver != null && !replayObserver.isDisposed()) {
                break;
            }
            ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.f61247d.call());
            if (androidx.lifecycle.e.a(this.f61246c, replayObserver, replayObserver2)) {
                replayObserver = replayObserver2;
                break;
            }
        }
        boolean z10 = !replayObserver.shouldConnect.get() && replayObserver.shouldConnect.compareAndSet(false, true);
        try {
            gVar.accept(replayObserver);
            if (z10) {
                this.f61245b.subscribe(replayObserver);
            }
        } catch (Throwable th2) {
            if (z10) {
                replayObserver.shouldConnect.compareAndSet(true, false);
            }
            ni.a.b(th2);
            throw ExceptionHelper.d(th2);
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f61248e.subscribe(rVar);
    }

    public ObservableReplay(p<T> pVar, p<T> pVar2, AtomicReference<ReplayObserver<T>> atomicReference, a<T> aVar) {
        this.f61248e = pVar;
        this.f61245b = pVar2;
        this.f61246c = atomicReference;
        this.f61247d = aVar;
    }

    public static <T> cj.a<T> d(p<T> pVar, int i10) {
        if (i10 == Integer.MAX_VALUE) {
            return h(pVar);
        }
        return g(pVar, new f(i10));
    }

    public static <T> cj.a<T> e(p<T> pVar, long j10, TimeUnit timeUnit, s sVar) {
        return f(pVar, j10, timeUnit, sVar, Integer.MAX_VALUE);
    }

    public static <T> cj.a<T> j(cj.a<T> aVar, s sVar) {
        return ej.a.k(new d(aVar, aVar.observeOn(sVar)));
    }
}
