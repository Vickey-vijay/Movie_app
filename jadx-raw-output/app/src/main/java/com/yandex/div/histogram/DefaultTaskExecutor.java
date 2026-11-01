package com.yandex.div.histogram;

import android.os.Handler;
import android.os.Looper;
import bk.a;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: TaskExecutor.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DefaultTaskExecutor implements TaskExecutor {
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override // com.yandex.div.histogram.TaskExecutor
    public void post(final a<r> aVar) {
        if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: ee.b
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.invoke();
                }
            });
        }
    }
}
