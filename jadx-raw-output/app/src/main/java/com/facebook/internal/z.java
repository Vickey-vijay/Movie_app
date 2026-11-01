package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.Metadata;

/* JADX INFO: compiled from: LockOnGetVariable.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/z;", "T", "", "a", "Ljava/lang/Object;", "storedValue", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "initLatch", "Ljava/util/concurrent/Callable;", "callable", "<init>", "(Ljava/util/concurrent/Callable;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class z<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public T storedValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public CountDownLatch initLatch;

    public z(final Callable<T> callable) {
        ck.p.j(callable, "callable");
        this.initLatch = new CountDownLatch(1);
        q1.t.t().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return z.b(this.f14525b, callable);
            }
        }));
    }

    public static final Void b(z zVar, Callable callable) {
        ck.p.j(zVar, "this$0");
        ck.p.j(callable, "$callable");
        try {
            zVar.storedValue = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = zVar.initLatch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
