package com.yandex.div.core;

/* JADX INFO: compiled from: CompositeDisposable.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CompositeDisposableKt {
    public static final void plusAssign(CompositeDisposable compositeDisposable, Disposable disposable) {
        compositeDisposable.add(disposable);
    }
}
