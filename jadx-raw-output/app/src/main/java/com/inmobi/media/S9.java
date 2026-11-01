package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class S9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Ea f23495a;

    public static final Ea a() {
        Ea eaA;
        if (f23495a == null) {
            Context context = Ji.f22951a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                eaA = Da.a(context, "CrashSession-store");
            } else {
                eaA = null;
            }
            f23495a = eaA;
        }
        return f23495a;
    }
}
