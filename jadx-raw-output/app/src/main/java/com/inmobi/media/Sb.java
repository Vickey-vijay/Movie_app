package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nk.l0 f23496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Semaphore f23497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f23498c;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("LogSingle", true));
        ck.p.i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f23496a = kotlinx.coroutines.d.a(nk.l1.c(executorServiceNewSingleThreadExecutor));
        f23497b = new Semaphore(1);
        f23498c = new AtomicBoolean(false);
    }
}
