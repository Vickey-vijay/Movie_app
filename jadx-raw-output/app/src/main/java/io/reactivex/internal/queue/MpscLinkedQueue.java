package io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicReference;
import ri.g;

/* JADX INFO: loaded from: classes9.dex */
public final class MpscLinkedQueue<T> implements g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<T>> f61383b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<T>> f61384c = new AtomicReference<>();

    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        public LinkedQueueNode() {
        }

        public LinkedQueueNode(E e10) {
            spValue(e10);
        }

        public E lpValue() {
            return this.value;
        }

        public void spValue(E e10) {
            this.value = e10;
        }

        public E getAndNullValue() {
            E eLpValue = lpValue();
            spValue(null);
            return eLpValue;
        }

        public LinkedQueueNode<E> lvNext() {
            return get();
        }

        public void soNext(LinkedQueueNode<E> linkedQueueNode) {
            lazySet(linkedQueueNode);
        }
    }

    public LinkedQueueNode<T> a() {
        return this.f61384c.get();
    }

    public LinkedQueueNode<T> b() {
        return this.f61384c.get();
    }

    public LinkedQueueNode<T> c() {
        return this.f61383b.get();
    }

    public void d(LinkedQueueNode<T> linkedQueueNode) {
        this.f61384c.lazySet(linkedQueueNode);
    }

    public LinkedQueueNode<T> e(LinkedQueueNode<T> linkedQueueNode) {
        return this.f61383b.getAndSet(linkedQueueNode);
    }

    @Override // ri.h
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>(t10);
        e(linkedQueueNode).soNext(linkedQueueNode);
        return true;
    }

    public MpscLinkedQueue() {
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>();
        d(linkedQueueNode);
        e(linkedQueueNode);
    }

    @Override // ri.h
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // ri.h
    public boolean isEmpty() {
        if (b() == c()) {
            return true;
        }
        return false;
    }

    @Override // ri.g, ri.h
    public T poll() {
        LinkedQueueNode<T> linkedQueueNodeLvNext;
        LinkedQueueNode<T> linkedQueueNodeA = a();
        LinkedQueueNode<T> linkedQueueNodeLvNext2 = linkedQueueNodeA.lvNext();
        if (linkedQueueNodeLvNext2 != null) {
            T andNullValue = linkedQueueNodeLvNext2.getAndNullValue();
            d(linkedQueueNodeLvNext2);
            return andNullValue;
        }
        if (linkedQueueNodeA != c()) {
            do {
                linkedQueueNodeLvNext = linkedQueueNodeA.lvNext();
            } while (linkedQueueNodeLvNext == null);
            T andNullValue2 = linkedQueueNodeLvNext.getAndNullValue();
            d(linkedQueueNodeLvNext);
            return andNullValue2;
        }
        return null;
    }
}
