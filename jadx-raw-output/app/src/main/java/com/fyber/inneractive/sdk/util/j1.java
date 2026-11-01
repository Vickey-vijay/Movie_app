package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j1 {
    public static boolean a(String str) {
        int i10 = com.fyber.inneractive.sdk.config.k.f15121a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        return property != null && property.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains("crash");
    }
}
