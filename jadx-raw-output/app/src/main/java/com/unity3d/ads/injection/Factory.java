package com.unity3d.ads.injection;

import bk.a;
import ck.p;
import mj.g;

/* JADX INFO: compiled from: Factory.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class Factory<T> implements g<T> {
    private final a<T> initializer;

    public boolean isInitialized() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Factory(a<? extends T> aVar) {
        p.j(aVar, "initializer");
        this.initializer = aVar;
    }

    @Override // mj.g
    public T getValue() {
        return this.initializer.invoke();
    }
}
