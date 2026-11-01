package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: ForwardingSet.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class s1<E> extends o1<E> implements Set<E> {
    @Override // com.google.common.collect.o1, com.google.common.collect.r1
    /* JADX INFO: renamed from: delegate */
    public abstract Set<E> g();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || g().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return g().hashCode();
    }

    public boolean standardEquals(Object obj) {
        return Sets.a(this, obj);
    }

    public int standardHashCode() {
        return Sets.d(this);
    }

    @Override // com.google.common.collect.o1
    public boolean standardRemoveAll(Collection<?> collection) {
        return Sets.i(this, (Collection) m5.l.m(collection));
    }
}
