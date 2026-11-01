package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MBNativeAdvancedWebViewCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f32556a = new HashMap();

    public static void a(String str, boolean z10) {
        f32556a.put(str, Boolean.valueOf(z10));
    }

    public static boolean a(String str) {
        if (f32556a.containsKey(str)) {
            return f32556a.get(str).booleanValue();
        }
        return false;
    }

    public static void b(String str) {
        f32556a.remove(str);
    }
}
