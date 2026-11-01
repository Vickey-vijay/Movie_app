package io.reactivex.disposables;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import mi.b;

/* JADX INFO: compiled from: Disposables.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static b a() {
        return EmptyDisposable.INSTANCE;
    }

    public static b b() {
        return c(Functions.f61030b);
    }

    public static b c(Runnable runnable) {
        qi.a.e(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }
}
