package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes5.dex */
public final class V9 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f27805a;

    public final void a(Runnable runnable) {
        ck.p.j(runnable, "task");
        a(this, runnable, 0L, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V9(String str) {
        super(str);
        ck.p.j(str, "name");
    }

    public static /* synthetic */ void a(V9 v10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v10.a(runnable, j10);
    }

    public final void b(Runnable runnable) {
        ck.p.j(runnable, "task");
        Handler handler = this.f27805a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public final void a(Runnable runnable, long j10) {
        ck.p.j(runnable, "task");
        Handler handler = this.f27805a;
        if (handler != null) {
            handler.postDelayed(runnable, j10);
        }
    }

    public final void a() {
        this.f27805a = new Handler(getLooper());
    }
}
