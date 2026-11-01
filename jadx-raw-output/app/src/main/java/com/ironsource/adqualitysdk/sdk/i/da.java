package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class da extends cz {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Method m1854(List<Object> list) {
        hr hrVar = (hr) cz.m1851(list, 1, hr.class);
        return list.get(0) instanceof Class ? hs.m2330((Class) cz.m1851(list, 0, Class.class), hrVar) : hs.m2330(cz.m1851(list, 0, Object.class).getClass(), hrVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Method> m1855(List<Object> list) {
        hr hrVar = (hr) cz.m1851(list, 1, hr.class);
        return list.get(0) instanceof Class ? hs.m2332((Class) cz.m1851(list, 0, Class.class), hrVar) : hs.m2332(cz.m1851(list, 0, Object.class).getClass(), hrVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static hr.c m1856() {
        return new hr.c();
    }
}
