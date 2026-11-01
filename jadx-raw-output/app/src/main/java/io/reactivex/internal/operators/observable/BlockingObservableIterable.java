package io.reactivex.internal.operators.observable;

import bj.c;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import mi.b;

/* JADX INFO: loaded from: classes9.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<? extends T> f61117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61118c;

    public static final class BlockingObservableIterator<T> extends AtomicReference<b> implements r<T>, Iterator<T>, b {
        private static final long serialVersionUID = 6695226475494099826L;
        public final Condition condition;
        public volatile boolean done;
        public Throwable error;
        public final Lock lock;
        public final zi.a<T> queue;

        @Override // ii.r
        public void onComplete() {
            this.done = true;
            signalConsumer();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                boolean z10 = this.done;
                boolean zIsEmpty = this.queue.isEmpty();
                if (z10) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        throw ExceptionHelper.d(th2);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                try {
                    c.b();
                    this.lock.lock();
                    while (!this.done && this.queue.isEmpty()) {
                        try {
                            this.condition.await();
                        } catch (Throwable th3) {
                            this.lock.unlock();
                            throw th3;
                        }
                    }
                    this.lock.unlock();
                } catch (InterruptedException e10) {
                    DisposableHelper.dispose(this);
                    signalConsumer();
                    throw ExceptionHelper.d(e10);
                }
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            signalConsumer();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.queue.offer(t10);
            signalConsumer();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        public void signalConsumer() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }

        public BlockingObservableIterator(int i10) {
            this.queue = new zi.a<>(i10);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.queue.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingObservableIterator blockingObservableIterator = new BlockingObservableIterator(this.f61118c);
        this.f61117b.subscribe(blockingObservableIterator);
        return blockingObservableIterator;
    }

    public BlockingObservableIterable(p<? extends T> pVar, int i10) {
        this.f61117b = pVar;
        this.f61118c = i10;
    }
}
