package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class P1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f55715e = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ga f55716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4513s6 f55717b = C4105c4.l().n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4439p6 f55718c = new C4439p6();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final En f55719d = new En();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            f55715e.set(true);
            Ga ga2 = this.f55716a;
            C4655xn c4655xnApply = this.f55718c.apply(thread);
            En en2 = this.f55719d;
            Thread threadA = en2.f55207a.a();
            ArrayList arrayListA = en2.a(threadA, thread);
            if (thread != threadA) {
                StackTraceElement[] stackTraceElementArrB = null;
                try {
                    stackTraceElementArrB = en2.f55207a.b();
                    if (stackTraceElementArrB == null) {
                        stackTraceElementArrB = threadA.getStackTrace();
                    }
                } catch (SecurityException unused) {
                }
                arrayListA.add(0, (C4655xn) en2.f55208b.apply(threadA, stackTraceElementArrB));
            }
            ga2.a(th2, new V(c4655xnApply, arrayListA, this.f55717b.f57650a.a()));
        } catch (Throwable th3) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th3, th3.getMessage(), new Object[0]);
        }
    }

    public P1(C4339l6 c4339l6) {
        this.f55716a = c4339l6;
    }
}
