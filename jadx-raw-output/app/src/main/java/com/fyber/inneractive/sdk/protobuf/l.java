package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18229a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f18231c;

    public l(s sVar) {
        this.f18231c = sVar;
        this.f18230b = sVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18229a < this.f18230b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f18229a;
        if (i10 >= this.f18230b) {
            throw new NoSuchElementException();
        }
        this.f18229a = i10 + 1;
        return Byte.valueOf(this.f18231c.d(i10));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
