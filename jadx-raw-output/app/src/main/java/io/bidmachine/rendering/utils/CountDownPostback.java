package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class CountDownPostback implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f60906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f60907b;

    public CountDownPostback(int i10, @NonNull Runnable runnable) {
        this.f60906a = runnable;
        this.f60907b = new AtomicInteger(i10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f60907b.decrementAndGet() > 0) {
            return;
        }
        this.f60906a.run();
    }
}
