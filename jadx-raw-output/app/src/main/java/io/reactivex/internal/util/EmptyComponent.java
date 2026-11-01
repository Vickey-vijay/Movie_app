package io.reactivex.internal.util;

import ej.a;
import ii.b;
import ii.f;
import ii.h;
import ii.r;
import ii.u;
import qo.c;

/* JADX INFO: loaded from: classes8.dex */
public enum EmptyComponent implements f<Object>, r<Object>, h<Object>, u<Object>, b, c, mi.b {
    INSTANCE;

    @Override // qo.c
    public void cancel() {
    }

    @Override // mi.b
    public void dispose() {
    }

    @Override // mi.b
    public boolean isDisposed() {
        return true;
    }

    @Override // qo.b
    public void onComplete() {
    }

    @Override // qo.b
    public void onNext(Object obj) {
    }

    @Override // ii.r
    public void onSubscribe(mi.b bVar) {
        bVar.dispose();
    }

    @Override // ii.h
    public void onSuccess(Object obj) {
    }

    @Override // qo.c
    public void request(long j10) {
    }

    public static <T> r<T> asObserver() {
        return INSTANCE;
    }

    public static <T> qo.b<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // ii.f
    public void onSubscribe(c cVar) {
        cVar.cancel();
    }

    @Override // qo.b
    public void onError(Throwable th2) {
        a.s(th2);
    }
}
