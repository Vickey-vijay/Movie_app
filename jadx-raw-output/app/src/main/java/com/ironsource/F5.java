package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes7.dex */
final class F5 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f26502a;

    public final void a(Runnable runnable) {
        ck.p.j(runnable, "task");
        Handler handler = this.f26502a;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F5(String str) {
        super(str);
        ck.p.j(str, "name");
    }

    public final void a() {
        this.f26502a = new Handler(getLooper());
    }
}
