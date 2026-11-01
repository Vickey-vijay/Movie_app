package com.yandex.div.internal;

import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: KLog.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KLog {
    public static final KLog INSTANCE = new KLog();
    private static final List<LogListener> listeners = new ArrayList();

    private KLog() {
    }

    public final boolean isAtLeast(Severity severity) {
        return Log.isAtLeast(severity);
    }

    public final void print(int i10, String str, String str2) {
        android.util.Log.println(i10, str, str2);
        List<LogListener> list = listeners;
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((LogListener) it.next()).onNewMessage(i10, str, str2);
            }
            r rVar = r.f64562a;
        }
    }
}
