package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: HandlerScheduler.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/util/HandlerScheduler;", "", "", "delay", "calculateTime", "Ljava/lang/Runnable;", "runnable", "", "tag", "Lmj/r;", "schedule", "cancel", "cancelAll", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class HandlerScheduler {
    private final Handler handler = new Handler(Looper.getMainLooper());

    public final void schedule(Runnable runnable, String str, long j10) {
        p.j(runnable, "runnable");
        p.j(str, "tag");
        this.handler.postAtTime(runnable, str, calculateTime(j10));
    }

    public final void cancelAll() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void schedule(Runnable runnable, long j10) {
        p.j(runnable, "runnable");
        this.handler.postAtTime(runnable, calculateTime(j10));
    }

    private final long calculateTime(long delay) {
        return SystemClock.uptimeMillis() + delay;
    }

    public final void cancel(String str) {
        p.j(str, "tag");
        this.handler.removeCallbacksAndMessages(str);
    }
}
