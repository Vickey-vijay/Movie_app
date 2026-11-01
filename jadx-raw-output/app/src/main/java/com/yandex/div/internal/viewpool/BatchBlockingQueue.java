package com.yandex.div.internal.viewpool;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinNothingValueException;
import mj.r;

/* JADX INFO: compiled from: BatchBlockingQueue.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class BatchBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E> {
    private final ReentrantLock lock;
    private final Condition notEmpty;
    private final Queue<E> queue;

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j10, TimeUnit timeUnit) {
        return offer(e10);
    }

    @Override // java.util.Queue
    public E poll() {
        this.lock.lock();
        try {
            return this.queue.poll();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    private final Void notSupported() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i10) {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e10) {
        this.lock.lock();
        try {
            this.queue.offer(e10);
            this.notEmpty.signal();
            r rVar = r.f64562a;
            return true;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        this.lock.lockInterruptibly();
        while (this.queue.isEmpty()) {
            try {
                this.notEmpty.await();
            } catch (Throwable th2) {
                this.lock.unlock();
                throw th2;
            }
        }
        E ePoll = this.queue.poll();
        this.lock.unlock();
        return ePoll;
    }

    public BatchBlockingQueue(Queue<E> queue) {
        this.queue = queue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.notEmpty = reentrantLock.newCondition();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E e10) {
        return offer(e10);
    }

    public int getSize() {
        this.lock.lock();
        try {
            return this.queue.size();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Queue
    public E peek() {
        this.lock.lock();
        try {
            return this.queue.peek();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) {
        offer(e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        this.lock.lock();
        try {
            return this.queue.remove(obj);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        this.lock.lockInterruptibly();
        try {
            long nanos = timeUnit.toNanos(j10);
            while (this.queue.isEmpty() && nanos > 0) {
                nanos = this.notEmpty.awaitNanos(nanos);
            }
            return this.queue.poll();
        } finally {
            this.lock.unlock();
        }
    }
}
