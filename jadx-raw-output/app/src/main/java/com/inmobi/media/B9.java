package com.inmobi.media;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class B9 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22410b;

    public B9(String str, boolean z10) {
        ck.p.j(str, "name");
        this.f22409a = z10;
        this.f22410b = "TIM-" + str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ck.p.j(runnable, "r");
        try {
            Thread thread = new Thread(runnable, this.f22410b);
            thread.setDaemon(this.f22409a);
            return thread;
        } catch (InternalError e10) {
            e10.toString();
            return null;
        }
    }
}
