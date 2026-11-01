package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import m5.l;
import q5.i;

/* JADX INFO: compiled from: ForwardingListenableFuture.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class b<V> extends q5.c<V> implements i<V> {

    /* JADX INFO: compiled from: ForwardingListenableFuture.java */
    public static abstract class a<V> extends b<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i<V> f20690c;

        @Override // q5.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final i<V> g() {
            return this.f20690c;
        }

        public a(i<V> iVar) {
            this.f20690c = (i) l.m(iVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract i<? extends V> delegate();

    @Override // q5.i
    public void addListener(Runnable runnable, Executor executor) {
        delegate().addListener(runnable, executor);
    }
}
