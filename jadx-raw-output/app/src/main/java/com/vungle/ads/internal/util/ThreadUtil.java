package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import ck.p;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: ThreadUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/internal/util/ThreadUtil;", "", "Lkotlin/Function0;", "Lmj/r;", "block", "runOnUiThread", "Landroid/os/Handler;", "UI_HANDLER", "Landroid/os/Handler;", "Ljava/util/concurrent/Executor;", "uiExecutor", "Ljava/util/concurrent/Executor;", "getUiExecutor$vungle_ads_release", "()Ljava/util/concurrent/Executor;", "setUiExecutor$vungle_ads_release", "(Ljava/util/concurrent/Executor;)V", "getUiExecutor$vungle_ads_release$annotations", "()V", "", "isMainThread", "()Z", "<init>", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ThreadUtil {
    public static final ThreadUtil INSTANCE = new ThreadUtil();
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    private static Executor uiExecutor;

    private ThreadUtil() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-0, reason: not valid java name */
    public static final void m3293runOnUiThread$lambda0(bk.a aVar) {
        p.j(aVar, "$tmp0");
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-1, reason: not valid java name */
    public static final void m3294runOnUiThread$lambda1(bk.a aVar) {
        p.j(aVar, "$tmp0");
        aVar.invoke();
    }

    public final Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final void runOnUiThread(final bk.a<r> aVar) {
        p.j(aVar, "block");
        if (isMainThread()) {
            aVar.invoke();
            return;
        }
        Executor executor = uiExecutor;
        if (executor == null) {
            UI_HANDLER.post(new Runnable() { // from class: com.vungle.ads.internal.util.d
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadUtil.m3294runOnUiThread$lambda1(aVar);
                }
            });
        } else if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.c
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadUtil.m3293runOnUiThread$lambda0(aVar);
                }
            });
        }
    }

    public final void setUiExecutor$vungle_ads_release(Executor executor) {
        uiExecutor = executor;
    }

    public final boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }
}
