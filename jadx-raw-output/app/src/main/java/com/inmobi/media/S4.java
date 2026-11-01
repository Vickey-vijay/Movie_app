package com.inmobi.media;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* JADX INFO: loaded from: classes8.dex */
public final class S4 extends AbstractC3198t5 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f23487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C3223u5 c3223u5) {
        super(c3223u5);
        ck.p.j(c3223u5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f23487b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.AbstractC3198t5
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.f23487b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        ck.p.j(thread, "t");
        ck.p.j(th2, "e");
        this.f25369a.a(new T4(thread, th2));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f23487b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }

    @Override // com.inmobi.media.AbstractC3198t5
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }
}
