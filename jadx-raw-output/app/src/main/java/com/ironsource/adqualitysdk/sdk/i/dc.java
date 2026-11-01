package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class dc extends cz {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static cp.e m1858(List<Object> list) {
        return new cp.e((List) cz.m1851(list, 0, List.class), ((Integer) cz.m1851(list, 1, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m1859(List<Object> list) {
        Object objM1851;
        Class<?> cls;
        ho hoVar;
        Object objM1852;
        Class<?> cls2;
        int size = list.size();
        Object objM1853 = null;
        Class<?> cls3 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls = (Class) cz.m1851(list, 0, Class.class);
                objM1851 = null;
            } else {
                Object objM1854 = cz.m1851(list, 0, Object.class);
                if (objM1854 != null) {
                    objM1851 = objM1854;
                    cls = objM1854.getClass();
                } else {
                    objM1851 = objM1854;
                    cls = null;
                }
            }
            hoVar = (ho) cz.m1851(list, 1, ho.class);
            objM1852 = null;
            cls3 = cls;
        } else if (size == 3) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) cz.m1851(list, 0, Class.class);
                if (list.get(1) instanceof ho) {
                    hoVar = (ho) cz.m1851(list, 1, ho.class);
                    objM1852 = cz.m1851(list, 2, Object.class);
                } else {
                    Object objM1855 = cz.m1851(list, 1, Object.class);
                    hoVar = (ho) cz.m1851(list, 2, ho.class);
                    objM1852 = null;
                    cls3 = cls2;
                    objM1851 = objM1855;
                }
            } else {
                objM1853 = cz.m1851(list, 0, Object.class);
                cls2 = objM1853.getClass();
                hoVar = (ho) cz.m1851(list, 1, ho.class);
                objM1852 = cz.m1851(list, 2, Object.class);
            }
            Object obj = objM1853;
            cls3 = cls2;
            objM1851 = obj;
        } else if (size != 4) {
            objM1852 = null;
            hoVar = null;
            objM1851 = null;
        } else {
            cls3 = (Class) cz.m1851(list, 0, Class.class);
            objM1851 = cz.m1851(list, 1, Object.class);
            hoVar = (ho) cz.m1851(list, 2, ho.class);
            objM1852 = cz.m1851(list, 3, Object.class);
        }
        hu.m2349().m2351();
        return hz.m2444(cls3, objM1851, hoVar, objM1852);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Object> m1860(List<Object> list) {
        Object objM1851;
        ho hoVar;
        int size = list.size();
        Class<?> cls = null;
        cls = null;
        Object objM1852 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls = (Class) cz.m1851(list, 0, Class.class);
                objM1851 = null;
            } else {
                objM1851 = cz.m1851(list, 0, Object.class);
                if (objM1851 != null) {
                    cls = objM1851.getClass();
                }
            }
            hoVar = (ho) cz.m1851(list, 1, ho.class);
        } else if (size != 3) {
            hoVar = null;
            objM1851 = null;
        } else if (list.get(0) instanceof Class) {
            Class<?> cls2 = (Class) cz.m1851(list, 0, Class.class);
            if (list.get(1) instanceof ho) {
                hoVar = (ho) cz.m1851(list, 1, ho.class);
            } else {
                objM1852 = cz.m1851(list, 1, Object.class);
                hoVar = (ho) cz.m1851(list, 2, ho.class);
            }
            objM1851 = objM1852;
            cls = cls2;
        } else {
            Object objM1853 = cz.m1851(list, 0, Object.class);
            Class<?> cls3 = objM1853.getClass();
            hoVar = (ho) cz.m1851(list, 1, ho.class);
            cls = cls3;
            objM1851 = objM1853;
        }
        hu.m2349().m2351();
        return hz.m2447(cls, objM1851, hoVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<hv> m1865(final du duVar, final cq cqVar, List<Object> list) {
        Object objM1851 = cz.m1851(list, 0, Object.class);
        final cp cpVar = (cp) cz.m1851(list, 1, cp.class);
        final List<Object> listM1853 = cz.m1853(list, 2);
        if (cpVar == null) {
            return null;
        }
        return hu.m2349().m2351().m2453(objM1851, cpVar.m1633(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.dc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo1866(hv hvVar) {
                return cpVar.m1632().m1615(hvVar, duVar, cqVar, listM1853);
            }
        }));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m1862(du duVar, cq cqVar, List<Object> list) {
        hv hvVarM1864 = m1864(duVar, cqVar, list);
        if (hvVarM1864 != null) {
            return hvVarM1864.mo2354();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m1861(List<Object> list) {
        if (list.get(0) instanceof Class) {
            return hu.m2349().m2351().m2451((Class) cz.m1851(list, 0, Class.class), (String) cz.m1851(list, 1, String.class));
        }
        Object objM1851 = cz.m1851(list, 0, Object.class);
        if (list.get(1) instanceof List) {
            return hu.m2349().m2351().m2456(objM1851, new JSONArray((Collection) cz.m1851(list, 1, List.class)));
        }
        if (list.get(1) instanceof JSONArray) {
            return hu.m2349().m2351().m2456(objM1851, (JSONArray) cz.m1851(list, 1, JSONArray.class));
        }
        return hu.m2349().m2351().m2455(objM1851, (String) cz.m1851(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final <T> hv<T> m1864(final du duVar, final cq cqVar, List<Object> list) {
        Object objM1851 = cz.m1851(list, 0, Object.class);
        final cp cpVar = (cp) cz.m1851(list, 1, cp.class);
        final List<Object> listM1853 = cz.m1853(list, 2);
        if (cpVar == null) {
            return null;
        }
        return hu.m2349().m2351().m2450(objM1851, cpVar.m1633(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.dc.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final boolean mo1866(hv hvVar) {
                return cpVar.m1632().m1615(hvVar, duVar, cqVar, listM1853);
            }
        }));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<Object> m1863(du duVar, cq cqVar, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (hv hvVar : m1865(duVar, cqVar, list)) {
            if (hvVar != null) {
                arrayList.add(hvVar.mo2354());
            }
        }
        return arrayList;
    }
}
