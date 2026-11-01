package io.reactivex.internal.subscriptions;

import qo.b;
import ri.e;

/* JADX INFO: loaded from: classes10.dex */
public enum EmptySubscription implements e<Object> {
    INSTANCE;

    @Override // qo.c
    public void cancel() {
    }

    @Override // ri.h
    public void clear() {
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
    public Object poll() {
        return null;
    }

    @Override // ri.d
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    public static void complete(b<?> bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onComplete();
    }

    public static void error(Throwable th2, b<?> bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onError(th2);
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // qo.c
    public void request(long j10) {
        SubscriptionHelper.validate(j10);
    }
}
