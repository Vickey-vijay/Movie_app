package io.reactivex.internal.disposables;

import ii.b;
import ii.h;
import ii.r;
import ii.u;
import ri.c;

/* JADX INFO: loaded from: classes11.dex */
public enum EmptyDisposable implements c<Object> {
    INSTANCE,
    NEVER;

    public static void complete(r<?> rVar) {
        rVar.onSubscribe(INSTANCE);
        rVar.onComplete();
    }

    public static void error(Throwable th2, r<?> rVar) {
        rVar.onSubscribe(INSTANCE);
        rVar.onError(th2);
    }

    @Override // ri.h
    public void clear() {
    }

    @Override // mi.b
    public void dispose() {
    }

    @Override // ri.h
    public boolean isEmpty() {
        return true;
    }

    @Override // ri.h
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ri.h
    public Object poll() throws Exception {
        return null;
    }

    @Override // ri.d
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // mi.b
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(h<?> hVar) {
        hVar.onSubscribe(INSTANCE);
        hVar.onComplete();
    }

    public static void error(Throwable th2, b bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onError(th2);
    }

    public static void complete(b bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onComplete();
    }

    public static void error(Throwable th2, u<?> uVar) {
        uVar.onSubscribe(INSTANCE);
        uVar.onError(th2);
    }

    public static void error(Throwable th2, h<?> hVar) {
        hVar.onSubscribe(INSTANCE);
        hVar.onError(th2);
    }
}
