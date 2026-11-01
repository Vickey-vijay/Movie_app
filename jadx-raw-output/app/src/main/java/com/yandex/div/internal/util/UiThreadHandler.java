package com.yandex.div.internal.util;

import android.os.Handler;
import android.os.Looper;
import bk.a;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: UiThreadHandler.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class UiThreadHandler {
    public static final UiThreadHandler INSTANCE = new UiThreadHandler();
    private static final Handler INSTANCE$1 = new Handler(Looper.getMainLooper());

    private UiThreadHandler() {
    }

    public static final Handler get() {
        return INSTANCE$1;
    }

    public final boolean postOnMainThread(final a<r> aVar) {
        return INSTANCE$1.post(new Runnable() { // from class: he.a
            @Override // java.lang.Runnable
            public final void run() {
                aVar.invoke();
            }
        });
    }

    public static final boolean isMainThread() {
        return p.e(Thread.currentThread(), mainThread());
    }

    public static final Thread mainThread() {
        return Looper.getMainLooper().getThread();
    }
}
