package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class cv extends cz {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Field m1792(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM1851 = cz.m1851(list, 0, Object.class);
            return hu.m2349().m2352().m2300(objM1851.getClass(), (Class) cz.m1851(list, 1, Class.class));
        }
        Class cls = (Class) cz.m1851(list, 0, Class.class);
        if (list.get(1) instanceof Class) {
            return hu.m2349().m2352().m2300(cls, (Class) cz.m1851(list, 1, Class.class));
        }
        return hu.m2349().m2352().m2299(cls, (ho) cz.m1851(list, 1, ho.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<Field> m1793(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM1851 = cz.m1851(list, 0, Object.class);
            boolean zBooleanValue = list.size() > 1 ? ((Boolean) cz.m1851(list, 1, Boolean.class)).booleanValue() : false;
            hu.m2349().m2352();
            Field[] fieldArrM2295 = hq.m2295(objM1851.getClass(), zBooleanValue, -1, null);
            if (fieldArrM2295 != null) {
                return Arrays.asList(fieldArrM2295);
            }
        } else if (list.size() > 1) {
            return hu.m2349().m2352().m2301((Class) cz.m1851(list, 0, Class.class), (ho) cz.m1851(list, 1, ho.class));
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Field m1790(List<Object> list) {
        return hu.m2349().m2352().m2298((Class) cz.m1851(list, 0, Class.class), (String) cz.m1851(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Field m1794(List<Object> list) {
        return hu.m2349().m2352().m2299((Class) cz.m1851(list, 0, Class.class), (ho) cz.m1851(list, 1, ho.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static ho.a m1791() {
        hu.m2349().m2352();
        return hq.m2296();
    }
}
