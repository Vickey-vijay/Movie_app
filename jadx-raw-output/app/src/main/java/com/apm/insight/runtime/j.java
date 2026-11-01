package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* JADX INFO: compiled from: MonitorCrashInner.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MonitorCrash f6725a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6726b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6727c;

    public static MonitorCrash a() {
        if (f6725a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f6725a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f6725a;
    }

    public static void a(Throwable th2, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f6726b == -1) {
            f6726b = 5;
        }
        int i10 = f6727c;
        boolean z10 = true;
        if (i10 < f6726b) {
            f6727c = i10 + 1;
        } else {
            z10 = false;
        }
        if (z10) {
            a().reportCustomErr(str, "INNER", th2);
        }
    }
}
