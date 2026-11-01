package com.google.protobuf.kotlin;

import ck.p;
import dk.a;
import java.util.Iterator;

/* JADX INFO: compiled from: UnmodifiableCollections.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class UnmodifiableIterator<E> implements Iterator<E>, a {
    private final /* synthetic */ Iterator<E> $$delegate_0;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.$$delegate_0.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableIterator(Iterator<? extends E> it) {
        p.j(it, "delegate");
        this.$$delegate_0 = it;
    }
}
