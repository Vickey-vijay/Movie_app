package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class A8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static A8 f25934b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private O5 f25935a;

    private static A8 a() {
        if (f25934b == null) {
            f25934b = new A8();
        }
        return f25934b;
    }

    private A8() {
    }

    public static void a(I5 i10, C3799y8 c3799y8) {
        if (i10 != null) {
            try {
                a().f25935a = new O5(i10, c3799y8);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    public static void a(C3472fe.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(C3472fe.a aVar, Map<String, Object> map) {
        O5 o10 = a().f25935a;
        if (o10 == null) {
            Log.d(G5.f26590a, G5.U);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f28936b));
        }
        o10.a(aVar.f28935a, map);
    }
}
