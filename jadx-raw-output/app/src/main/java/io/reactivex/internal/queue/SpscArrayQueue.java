package io.reactivex.internal.queue;

import bj.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import ri.g;

/* JADX INFO: loaded from: classes3.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements g<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Integer f61385b = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    public final AtomicLong consumerIndex;
    public final int lookAheadStep;
    public final int mask;
    public final AtomicLong producerIndex;
    public long producerLookAhead;

    public int calcElementOffset(long j10) {
        return ((int) j10) & this.mask;
    }

    public int calcElementOffset(long j10, int i10) {
        return ((int) j10) & i10;
    }

    @Override // ri.h
    public boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.mask;
        long j10 = this.producerIndex.get();
        int iCalcElementOffset = calcElementOffset(j10, i10);
        if (j10 >= this.producerLookAhead) {
            long j11 = ((long) this.lookAheadStep) + j10;
            if (lvElement(calcElementOffset(j11, i10)) == null) {
                this.producerLookAhead = j11;
            } else if (lvElement(iCalcElementOffset) != null) {
                return false;
            }
        }
        soElement(iCalcElementOffset, e10);
        soProducerIndex(j10 + 1);
        return true;
    }

    @Override // ri.h
    public boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    @Override // ri.g, ri.h
    public E poll() {
        long j10 = this.consumerIndex.get();
        int iCalcElementOffset = calcElementOffset(j10);
        E eLvElement = lvElement(iCalcElementOffset);
        if (eLvElement == null) {
            return null;
        }
        soConsumerIndex(j10 + 1);
        soElement(iCalcElementOffset, null);
        return eLvElement;
    }

    public void soConsumerIndex(long j10) {
        this.consumerIndex.lazySet(j10);
    }

    public void soProducerIndex(long j10) {
        this.producerIndex.lazySet(j10);
    }

    public SpscArrayQueue(int i10) {
        super(j.a(i10));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i10 / 4, f61385b.intValue());
    }

    @Override // ri.h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public E lvElement(int i10) {
        return get(i10);
    }

    public void soElement(int i10, E e10) {
        lazySet(i10, e10);
    }

    public boolean offer(E e10, E e11) {
        return offer(e10) && offer(e11);
    }
}
