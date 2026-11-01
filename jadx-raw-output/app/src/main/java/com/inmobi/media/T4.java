package com.inmobi.media;

import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public class T4 extends Q9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StackTraceElement[] f23551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(Thread thread, Throwable th2) {
        super("crashReporting", "CrashEvent", AbstractC2940il.a(thread, th2));
        ck.p.j(thread, "thread");
        ck.p.j(th2, "error");
        this.f23551g = th2.getStackTrace();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public T4(String str) {
        String string = UUID.randomUUID().toString();
        ck.p.i(string, "toString(...)");
        ck.p.j("crashReporting", "component");
        ck.p.j("CatchEvent", "eventType");
        ck.p.j(string, "eventId");
        super(string, "crashReporting", "CatchEvent", str);
    }
}
