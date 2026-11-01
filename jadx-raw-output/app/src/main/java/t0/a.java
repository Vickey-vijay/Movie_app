package t0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f72104b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ConcurrencyUtil#" + this.f72104b.getAndIncrement());
    }
}
