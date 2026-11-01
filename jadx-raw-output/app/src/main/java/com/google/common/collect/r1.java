package com.google.common.collect;

/* JADX INFO: compiled from: ForwardingObject.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class r1 {
    public abstract Object delegate();

    public String toString() {
        return delegate().toString();
    }
}
