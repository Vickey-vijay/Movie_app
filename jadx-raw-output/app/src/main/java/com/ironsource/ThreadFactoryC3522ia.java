package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.ironsource.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
final class ThreadFactoryC3522ia implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f29152a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ck.p.j(runnable, "r");
        ck.w wVar = ck.w.f6066a;
        String str = String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.f29152a.incrementAndGet())}, 2));
        ck.p.i(str, "format(locale, format, *args)");
        return new Thread(runnable, str);
    }
}
