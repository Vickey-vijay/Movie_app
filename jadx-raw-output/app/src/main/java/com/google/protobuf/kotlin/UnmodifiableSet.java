package com.google.protobuf.kotlin;

import ck.p;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: UnmodifiableCollections.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class UnmodifiableSet<E> extends UnmodifiableCollection<E> implements Set<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableSet(Collection<? extends E> collection) {
        super(collection);
        p.j(collection, "delegate");
    }
}
