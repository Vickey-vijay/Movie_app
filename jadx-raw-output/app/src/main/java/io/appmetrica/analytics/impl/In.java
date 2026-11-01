package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class In {
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public static Hn a(Throwable th2, int i10, int i11) {
        StackTraceElement[] stackTrace;
        Hn hnA;
        ArrayList arrayList;
        String name = th2.getClass().getName();
        String message = th2.getMessage();
        try {
            stackTrace = th2.getStackTrace();
        } catch (Throwable unused) {
            stackTrace = new StackTraceElement[0];
        }
        ArrayList arrayList2 = new ArrayList(stackTrace.length);
        for (StackTraceElement stackTraceElement : stackTrace) {
            arrayList2.add(new El(stackTraceElement));
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            if (i11 >= i10) {
                cause = null;
            }
            if (cause != null) {
                hnA = a(cause, 30, i11 + 1);
            } else {
                hnA = null;
            }
        } else {
            hnA = null;
        }
        if (i11 < i10) {
            Throwable[] suppressed = th2.getSuppressed();
            arrayList = new ArrayList(suppressed.length);
            for (Throwable th3 : suppressed) {
                arrayList.add(a(th3, 1, i11));
            }
        } else {
            arrayList = null;
        }
        return new Hn(name, message, arrayList2, hnA, arrayList);
    }
}
