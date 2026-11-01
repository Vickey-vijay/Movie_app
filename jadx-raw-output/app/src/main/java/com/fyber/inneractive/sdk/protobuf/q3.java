package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class q3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f18266a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18266a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f18266a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public q3(r3 r3Var) {
        this.f18266a = r3Var.f18273a.iterator();
    }
}
