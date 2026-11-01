package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class IronSourceQaProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IronSourceQaProperties f31211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, String> f31212b = new HashMap();

    public static IronSourceQaProperties getInstance() {
        if (f31211a == null) {
            f31211a = new IronSourceQaProperties();
        }
        return f31211a;
    }

    public static boolean isInitialized() {
        return f31211a != null;
    }

    public Map<String, String> getParameters() {
        return f31212b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f31212b.put(str, str2);
    }

    private IronSourceQaProperties() {
    }
}
