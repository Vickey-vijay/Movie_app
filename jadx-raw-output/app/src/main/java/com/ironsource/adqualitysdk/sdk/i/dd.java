package com.ironsource.adqualitysdk.sdk.i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class dd extends cz {
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String m1867(List<Object> list) {
        return kc.m2860((String) cz.m1851(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m1868(List<Object> list) {
        String str = (String) cz.m1851(list, 0, String.class);
        return list.get(1) instanceof String ? kc.m2867(str, (String) cz.m1851(list, 1, String.class)) : kc.m2868(str, new JSONArray((Collection) cz.m1851(list, 1, List.class)));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m1869(List<Object> list) {
        return kc.m2866((String) cz.m1851(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m1870(List<Object> list) {
        return hu.m2349().m2351().m2454(cz.m1851(list, 0, Object.class), (List<String>) cz.m1851(list, 1, List.class), ((Integer) cz.m1851(list, 2, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m1871(List<Object> list) {
        String str = (String) cz.m1851(list, 0, String.class);
        boolean zBooleanValue = list.size() > 2 ? ((Boolean) cz.m1851(list, 2, Boolean.class)).booleanValue() : true;
        return list.get(1) instanceof String ? kc.m2861(str, (String) cz.m1851(list, 1, String.class), zBooleanValue) : kc.m2870(str, new JSONArray((Collection) cz.m1851(list, 1, List.class)), zBooleanValue);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static int m1872(List<Object> list) {
        return kc.m2859((String) cz.m1851(list, 0, String.class), (String) cz.m1851(list, 1, String.class));
    }
}
