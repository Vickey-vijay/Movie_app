package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.G5;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class hz {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2440 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2441 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2442 = 200;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2444 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2445 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<hy.a, ht> f2446;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2443 = {279, 298, 306, 301, 299, 316, 270, 305, 310, 300, 314, 232, 321, 312, 302, 311, 309, 315, 244, 269, 303, 308, 297, 304, 320, 267, 277, 318};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f2439 = {1026070196, -1497733472, 1007237320, 748579486, 709667319, 1802634736, 1645467311, 2040079237, 902973595, 162566763, 917144358, 78795934, 1736430505, -1215225542, 1366241589, -1802646025, -217124763, 1964028701};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2432(Object obj, List<String> list) {
        if ((obj != null ? '`' : 'F') != '`') {
            return false;
        }
        int i10 = f2440 + 47;
        f2441 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM2845 = kb.m2845(obj.getClass(), list);
        int i12 = f2440 + 83;
        f2441 = i12 % 128;
        int i13 = i12 % 2;
        return zM2845;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> T m2444(Class cls, Object obj, ho hoVar, T t10) {
        int i10 = f2440 + 113;
        f2441 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Field fieldM2299 = hu.m2349().m2352().m2299(cls, hoVar);
            if (fieldM2299 == null) {
                return t10;
            }
            T t11 = (T) fieldM2299.get(obj);
            int i12 = f2441 + 41;
            f2440 = i12 % 128;
            if ((i12 % 2 != 0 ? '\f' : 'X') != '\f') {
                return t11;
            }
            throw null;
        } catch (Throwable unused) {
            String strIntern = m2446((String) null, View.getDefaultSize(0, 0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2437(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1597475101, -188208045}, 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
            sb2.append(hoVar.m2275());
            sb2.append(m2446((String) null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, (int[]) null, "\u008c\u0091\u0090\u008b\u008f\u008c\u0084\u008e\u008d\u0086\u008c").intern());
            sb2.append(cls);
            sb2.append(m2437(new int[]{-1227658563, -1190981675, 49833950, 35684323}, 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
            k.m2810(strIntern, sb2.toString());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (m2448(r19.m2379(), r6) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (m2448(r19.m2379(), r6) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r2 = new java.lang.StringBuilder();
        r2.append(m2437(new int[]{1857419887, -1178320534, -2102558973, 301600277, 1729643396, -1474478369, -853871098, -1916766595, 1862184034, 486974620}, android.graphics.Color.rgb(0, 0, 0) + 16777235).intern());
        r2.append(java.lang.System.currentTimeMillis() - r3);
        r2.append(m2437(new int[]{191332316, 1435805943}, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2).intern());
        m2449(r6, r18, r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        return r6;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.ironsource.adqualitysdk.sdk.i.hv<T> m2450(java.lang.Object r18, com.ironsource.adqualitysdk.sdk.i.hy r19) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hz.m2450(java.lang.Object, com.ironsource.adqualitysdk.sdk.i.hy):com.ironsource.adqualitysdk.sdk.i.hv");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2455(Object obj, String str) {
        int i10 = f2441 + 63;
        f2440 = i10 % 128;
        if (i10 % 2 != 0) {
            m2445(obj, obj.getClass(), str);
            throw null;
        }
        String strM2445 = m2445(obj, obj.getClass(), str);
        int i11 = f2440 + 69;
        f2441 = i11 % 128;
        int i12 = i11 % 2;
        return strM2445;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2449(hv hvVar, Object obj, String str) {
        int i10 = f2441 + 91;
        f2440 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 4 : (char) 18) != 18) {
            throw null;
        }
        if (hvVar == null) {
            String strIntern = m2446((String) null, Color.alpha(0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(m2437(new int[]{1984592391, 1232721020}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 2).intern());
            sb2.append(str);
            k.m2809(strIntern, sb2.toString());
            return;
        }
        String strIntern2 = m2446((String) null, TextUtils.indexOf((CharSequence) "", '0') + 128, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(m2437(new int[]{1984592391, 1232721020}, 2 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
        sb3.append(str);
        sb3.append(m2437(new int[]{545079718, -884987865, -272923517, 535263954}, (ViewConfiguration.getLongPressTimeout() >> 16) + 8).intern());
        sb3.append(hvVar.mo2354());
        k.m2809(strIntern2, sb3.toString());
        int i11 = f2440 + 101;
        f2441 = i11 % 128;
        if ((i11 % 2 == 0 ? 'V' : '-') == '-') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2456(Object obj, JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int i10 = f2441 + 89;
        int i11 = i10 % 128;
        f2440 = i11;
        int i12 = i10 % 2;
        int i13 = 0;
        int i14 = i11 + 83;
        f2441 = i14 % 128;
        int i15 = i14 % 2;
        while (true) {
            if ((i13 < jSONArray.length() ? '\\' : 'Q') != '\\') {
                return null;
            }
            String strM2455 = m2455(obj, jSONArray.optString(i13));
            if ((strM2455 != null ? '7' : 'Z') == '7') {
                return strM2455;
            }
            i13++;
        }
    }

    public hz() {
        m2446((String) null, Gravity.getAbsoluteGravity(0, 0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        this.f2446 = new HashMap();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m2434(Class cls, int i10) {
        Field[] declaredFields = cls.getDeclaredFields();
        int i11 = 0;
        while (true) {
            if ((cls != null ? '^' : 'Y') == 'Y') {
                break;
            }
            if (i11 == i10) {
                break;
            }
            int i12 = f2440 + 35;
            f2441 = i12 % 128;
            if ((i12 % 2 == 0 ? '\f' : '5') == '5') {
                cls = cls.getSuperclass();
                if (cls != null) {
                    declaredFields = kb.m2847(declaredFields, cls.getDeclaredFields());
                    int i13 = f2440 + 77;
                    f2441 = i13 % 128;
                    int i14 = i13 % 2;
                }
                i11++;
            } else {
                cls.getSuperclass();
                throw null;
            }
        }
        return declaredFields;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<Object> m2447(Class cls, Object obj, ho hoVar) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = hu.m2349().m2352().m2301(cls, hoVar).iterator();
            int i10 = f2441 + 87;
            f2440 = i10 % 128;
            int i11 = i10 % 2;
            while (true) {
                if (!(it.hasNext())) {
                    break;
                }
                int i12 = f2441 + 5;
                f2440 = i12 % 128;
                int i13 = i12 % 2;
                arrayList.add(it.next().get(obj));
            }
        } catch (Throwable unused) {
            String strIntern = m2446((String) null, 127 - TextUtils.indexOf("", "", 0), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2437(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1597475101, -188208045}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14).intern());
            sb2.append(hoVar.m2275());
            sb2.append(m2446((String) null, View.getDefaultSize(0, 0) + 127, (int[]) null, "\u008c\u0091\u0090\u008b\u008f\u008c\u0084\u008e\u008d\u0086\u008c").intern());
            sb2.append(cls);
            sb2.append(m2437(new int[]{-1227658563, -1190981675, 49833950, 35684323}, MotionEvent.axisFromString("") + 7).intern());
            k.m2810(strIntern, sb2.toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List m2431(Object obj, hy hyVar, int i10) {
        int i11 = f2440 + 67;
        f2441 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            m2439(obj, hyVar.m2378(i10), hyVar.m2380(i10), hyVar.m2384(i10));
            throw null;
        }
        List listM2439 = m2439(obj, hyVar.m2378(i10), hyVar.m2380(i10), hyVar.m2384(i10));
        int i12 = f2441 + 101;
        f2440 = i12 % 128;
        int i13 = i12 % 2;
        return listM2439;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> hv<T> m2430(Object obj, Object obj2, hv hvVar) {
        if ((obj != null ? (char) 5 : '-') != '-') {
            int i10 = f2441 + 117;
            f2440 = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 6 : G5.T) != 6) {
                if (obj instanceof Collection) {
                    return new hx((Collection) obj, obj2, hvVar);
                }
                if (obj instanceof Map) {
                    return new hx((Map) obj, obj2, hvVar);
                }
                if (obj.getClass().isArray()) {
                    hx hxVar = new hx(new ArrayList(Arrays.asList(obj)), obj2, hvVar);
                    int i11 = f2440 + 101;
                    f2441 = i11 % 128;
                    int i12 = i11 % 2;
                    return hxVar;
                }
            } else {
                boolean z10 = obj instanceof Collection;
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final <T> hv<T> m2452(Object obj, ia iaVar, hm hmVar, List<String> list, int i10) {
        hv<T> hvVarM2450 = m2450(obj, new hy.c().m2427(true).m2420(iaVar, hmVar, list, i10));
        int i11 = f2441 + 45;
        f2440 = i11 % 128;
        int i12 = i11 % 2;
        return hvVarM2450;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private <T> hv<T> m2435(Object obj, ht htVar) {
        int i10 = f2441 + 107;
        f2440 = i10 % 128;
        int i11 = i10 % 2;
        try {
            hv<T> hvVarM2440 = m2440(m2443(obj, htVar.m2344().get(0), (hv) null), htVar, 1);
            int i12 = f2441 + 115;
            f2440 = i12 % 128;
            int i13 = i12 % 2;
            return hvVarM2440;
        } catch (Exception e10) {
            k.m2830(m2446((String) null, (ViewConfiguration.getTapTimeout() >> 16) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2446((String) null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), (int[]) null, "\u0098\u0086\u0097\u008e\u008c\u0091\u0090\u008b\u008f\u008c\u008a\u0096\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008c\u0095\u0089\u0088\u0086\u0086\u0084\u0095\u008c\u008b\u0090\u008b\u008b\u0094").intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<hv> m2453(Object obj, hy hyVar) {
        hw hwVar = new hw(hyVar);
        hwVar.m2357();
        m2442(obj, hwVar, 0, (hv) null);
        ArrayList arrayList = new ArrayList(hwVar.m2355());
        int i10 = f2440 + 55;
        f2441 = i10 % 128;
        int i11 = i10 % 2;
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> hv<T> m2440(hv hvVar, ht htVar, int i10) {
        if (i10 >= htVar.m2344().size()) {
            return hvVar;
        }
        List<Field> list = htVar.m2344().get(i10);
        Object objMo2354 = hvVar.mo2354();
        List listM2438 = m2438(objMo2354);
        if (listM2438 == null) {
            String strIntern = m2446((String) null, 127 - Color.alpha(0), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2446((String) null, TextUtils.lastIndexOf("", '0') + 128, (int[]) null, "\u008c\u008a\u0084\u009c\u0088\u0084\u0085\u0084\u008b\u008c\u0093\u008e\u0097\u009b\u008c\u008b\u0090\u008c\u0089\u0090\u0088\u0086\u0085\u0084\u0096\u0096\u0090\u009a\u008c\u008a\u0084\u0086\u0085\u0084\u008e\u0099\u0094").intern());
            sb2.append(objMo2354.getClass());
            k.m2810(strIntern, sb2.toString());
            return null;
        }
        Iterator it = listM2438.iterator();
        while (true) {
            if (!it.hasNext()) {
                int i11 = f2440 + 99;
                f2441 = i11 % 128;
                if ((i11 % 2 == 0 ? (char) 5 : (char) 19) != 5) {
                    return null;
                }
                throw null;
            }
            int i12 = f2440 + 107;
            f2441 = i12 % 128;
            int i13 = i12 % 2;
            Object next = it.next();
            try {
                hv hvVarM2443 = m2443(next, list, m2430(objMo2354, next, hvVar));
                if (hvVarM2443 != null) {
                    return m2440(hvVarM2443, htVar, i10 + 1);
                }
                int i14 = f2440 + 19;
                f2441 = i14 % 128;
                int i15 = i14 % 2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List m2438(Object obj) {
        int i10 = f2440 + 125;
        f2441 = i10 % 128;
        List listM2439 = (i10 % 2 == 0 ? (char) 24 : '0') != 24 ? m2439(obj, true, true, true) : m2439(obj, false, true, true);
        int i11 = f2441 + 87;
        f2440 = i11 % 128;
        if ((i11 % 2 != 0 ? 'K' : '*') != 'K') {
            return listM2439;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m2433(Class cls) {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i10 = 0;
        while (true) {
            if (!(i10 >= length)) {
                int i11 = f2441 + 47;
                f2440 = i11 % 128;
                if (!(i11 % 2 == 0)) {
                    declaredFields[i10].getType().equals(String.class);
                    throw null;
                }
                Field field = declaredFields[i10];
                if ((field.getType().equals(String.class) ? 'H' : '5') == 'H') {
                    int i12 = f2440 + 85;
                    f2441 = i12 % 128;
                    if (i12 % 2 == 0) {
                        arrayList.add(field);
                        throw null;
                    }
                    arrayList.add(field);
                }
                i10++;
            } else {
                return (Field[]) arrayList.toArray(new Field[0]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List m2439(Object obj, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList;
        int i10;
        int i11 = f2440 + 7;
        int i12 = i11 % 128;
        f2441 = i12;
        int i13 = i11 % 2;
        if (obj == null) {
            arrayList = null;
        } else {
            int i14 = i12 + 103;
            f2440 = i14 % 128;
            int i15 = i14 % 2;
            if ((obj instanceof Collection ? '[' : '4') == '[' && z10) {
                arrayList = new ArrayList((Collection) obj);
                i10 = f2440 + 121;
            } else {
                if ((obj.getClass().isArray() ? '?' : '\r') != '\r' && z12) {
                    arrayList = new ArrayList(Arrays.asList(obj));
                } else if ((obj instanceof Map) && z11) {
                    Map map = (Map) obj;
                    arrayList = new ArrayList(map.values());
                    arrayList.addAll(map.keySet());
                    i10 = f2440 + 67;
                } else {
                    arrayList = null;
                }
            }
            f2441 = i10 % 128;
            int i16 = i10 % 2;
        }
        int i17 = f2441 + 25;
        f2440 = i17 % 128;
        if (i17 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> hv<T> m2443(Object obj, List<Field> list, hv hvVar) throws IllegalAccessException {
        Object obj2;
        int i10 = f2441 + 69;
        f2440 = i10 % 128;
        if (i10 % 2 != 0) {
            list.iterator();
            throw null;
        }
        int i11 = f2441 + 51;
        f2440 = i11 % 128;
        int i12 = i11 % 2;
        for (Field field : list) {
            if ((WeakReference.class.isAssignableFrom(field.getType()) ? '4' : 'D') != 'D') {
                int i13 = f2441 + 47;
                f2440 = i13 % 128;
                int i14 = i13 % 2;
                obj2 = ((WeakReference) field.get(obj)).get();
            } else {
                obj2 = field.get(obj);
            }
            hvVar = m2436(field, obj, hvVar);
            obj = obj2;
        }
        int i15 = f2441 + 113;
        f2440 = i15 % 128;
        if ((i15 % 2 != 0 ? (char) 14 : '\n') == '\n') {
            return hvVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <T> hv<T> m2436(Field field, Object obj, hv hvVar) {
        hx hxVar = new hx(field, obj, hvVar);
        int i10 = f2440 + 77;
        f2441 = i10 % 128;
        int i11 = i10 % 2;
        return hxVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2451(Class cls, String str) {
        int i10 = f2440 + 93;
        f2441 = i10 % 128;
        if ((i10 % 2 == 0 ? '\f' : ')') == ')') {
            return m2445((Object) null, cls, str);
        }
        m2445((Object) null, cls, str);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2437(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2439.clone();
            e.f1913 = 0;
            while (true) {
                int i11 = e.f1913;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1915 = (c10 << 16) + c11;
                    e.f1914 = (c12 << 16) + c13;
                    e.m2135(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1915 ^ iArr2[i13];
                        e.f1915 = i14;
                        e.f1914 = e.m2134(i14) ^ e.f1914;
                        int i15 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i15;
                    }
                    int i16 = e.f1915;
                    e.f1915 = e.f1914;
                    e.f1914 = i16;
                    e.f1914 = i16 ^ iArr2[16];
                    e.f1915 ^= iArr2[17];
                    int i17 = e.f1913;
                    int i18 = e.f1915;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1914;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m2135(iArr2);
                    int i20 = e.f1913;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1913 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> hv<T> m2442(Object obj, hw<T> hwVar, int i10, hv hvVar) {
        Field[] fieldArrM2434;
        int i11 = f2441 + 91;
        f2440 = i11 % 128;
        if (i11 % 2 == 0) {
            if (i10 != hwVar.m2363().m2385()) {
                int i12 = f2440;
                int i13 = i12 + 17;
                f2441 = i13 % 128;
                int i14 = i13 % 2;
                if (obj != null) {
                    int i15 = i12 + 39;
                    f2441 = i15 % 128;
                    int i16 = i15 % 2;
                    if (!(hwVar.m2362().contains(obj))) {
                        int i17 = f2441 + 15;
                        f2440 = i17 % 128;
                        int i18 = i17 % 2;
                        if (i10 <= 0 || !(obj instanceof Activity)) {
                            hwVar.m2362().add(obj);
                            try {
                                if (hwVar.m2363().m2388() != null) {
                                    fieldArrM2434 = hwVar.m2363().m2388().mo2264(obj);
                                } else {
                                    fieldArrM2434 = m2434(obj.getClass(), hwVar.m2363().m2381(i10));
                                }
                                ht htVarM2360 = hwVar.m2360();
                                for (Field field : fieldArrM2434) {
                                    field.setAccessible(true);
                                    htVarM2360.m2347(field);
                                    hv<T> hvVarM2441 = m2441(m2436(field, obj, hvVar), hwVar, i10);
                                    if (hvVarM2441 != null) {
                                        if ((!hwVar.m2361() ? 'R' : '(') != '(') {
                                            return hvVarM2441;
                                        }
                                    }
                                    htVarM2360.m2345(field);
                                }
                                int i19 = f2440 + 1;
                                f2441 = i19 % 128;
                                int i20 = i19 % 2;
                            } catch (Throwable th2) {
                                k.m2830(m2446((String) null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2437(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1082011640, 1374541143, 437445677, -1579277629, -1379548377, -2010087012, -1753696167, 1477608565}, ExpandableListView.getPackedPositionChild(0L) + 26).intern(), th2);
                            }
                        }
                    }
                }
            }
            return null;
        }
        hwVar.m2363().m2385();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hv m2441(hv hvVar, hw hwVar, int i10) {
        Object objMo2354 = hvVar.mo2354();
        if (hwVar.m2362().contains(objMo2354) || hwVar.m2356().contains(objMo2354)) {
            return null;
        }
        if (hwVar.m2363().m2387(i10) && m2448(hwVar.m2363().m2379(), hvVar)) {
            int i11 = f2441 + 65;
            f2440 = i11 % 128;
            int i12 = i11 % 2;
            if (hwVar.m2361()) {
                int i13 = f2441 + 13;
                f2440 = i13 % 128;
                int i14 = i13 % 2;
                hwVar.m2358(hvVar);
                hwVar.m2359(objMo2354);
            }
            return hvVar;
        }
        if (objMo2354 instanceof WeakReference) {
            WeakReference weakReference = (WeakReference) objMo2354;
            if (weakReference.get() != null && hwVar.m2363().m2389(i10)) {
                int i15 = f2440 + 33;
                f2441 = i15 % 128;
                int i16 = i15 % 2;
                if ((m2432(weakReference.get(), hwVar.m2363().m2383()) ? 'G' : 'U') == 'G') {
                    int i17 = f2441 + 77;
                    f2440 = i17 % 128;
                    int i18 = i17 % 2;
                    return m2442(weakReference.get(), hwVar, i10 + 1, hvVar);
                }
            }
        }
        if (!m2432(objMo2354, hwVar.m2363().m2383())) {
            if (hwVar.m2363().m2382()) {
                int i19 = f2441;
                int i20 = i19 + 13;
                f2440 = i20 % 128;
                int i21 = i20 % 2;
                if (objMo2354 != null) {
                    int i22 = i19 + 25;
                    f2440 = i22 % 128;
                    if ((i22 % 2 != 0 ? (char) 7 : '2') == '2') {
                        hwVar.m2362().add(objMo2354);
                    } else {
                        hwVar.m2362().add(objMo2354);
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            List listM2431 = m2431(objMo2354, hwVar.m2363(), i10);
            ht htVarM2360 = hwVar.m2360();
            if (listM2431 == null) {
                return null;
            }
            Iterator it = listM2431.iterator();
            hv hvVarM2441 = null;
            while (it.hasNext()) {
                hv hvVarM2430 = m2430(objMo2354, it.next(), hvVar);
                htVarM2360.m2346();
                hvVarM2441 = m2441(hvVarM2430, hwVar, i10);
                if (hvVarM2441 != null) {
                    int i23 = f2440 + 59;
                    f2441 = i23 % 128;
                    if (i23 % 2 != 0) {
                        if (!hwVar.m2361()) {
                            int i24 = f2440 + 11;
                            f2441 = i24 % 128;
                            int i25 = i24 % 2;
                            return hvVarM2441;
                        }
                    } else {
                        hwVar.m2361();
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                htVarM2360.m2348();
            }
            return hvVarM2441;
        }
        return m2442(objMo2354, hwVar, i10 + 1, hvVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m2454(Object obj, List<String> list, int i10) {
        hw hwVar = new hw(new hy.c().m2424(true).m2429(true).m2422(true).m2417(-1).m2425(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.hz.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo1866(hv hvVar) {
                return hvVar.mo2354() instanceof String;
            }
        }, list, i10));
        hwVar.m2357();
        m2442(obj, hwVar, 0, (hv) null);
        ArrayList arrayList = new ArrayList(hwVar.m2356());
        int i11 = f2440 + 117;
        f2441 = i11 % 128;
        if (i11 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2448(ia iaVar, hv hvVar) {
        int i10 = f2441 + 95;
        f2440 = i10 % 128;
        try {
            if (!(i10 % 2 != 0)) {
                boolean zMo1866 = iaVar.mo1866(hvVar);
                int i11 = f2440 + 65;
                f2441 = i11 % 128;
                if (i11 % 2 != 0) {
                    return zMo1866;
                }
                throw null;
            }
            iaVar.mo1866(hvVar);
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m2445(Object obj, Class cls, String str) {
        while (true) {
            if (cls == null) {
                break;
            }
            if ((!cls.equals(Object.class) ? '6' : 'B') != '6') {
                break;
            }
            Field[] fieldArrM2433 = m2433(cls);
            int length = fieldArrM2433.length;
            int i10 = 0;
            while (i10 < length) {
                Field field = fieldArrM2433[i10];
                field.setAccessible(true);
                try {
                    String str2 = (String) field.get(obj);
                    if ((str2 != null) && Pattern.compile(str).matcher(str2).matches()) {
                        int i11 = f2440 + 29;
                        int i12 = i11 % 128;
                        f2441 = i12;
                        int i13 = i11 % 2;
                        int i14 = i12 + 25;
                        f2440 = i14 % 128;
                        if ((i14 % 2 != 0 ? '&' : '\b') != '&') {
                            return str2;
                        }
                        throw null;
                    }
                    i10++;
                    int i15 = f2440 + 63;
                    f2441 = i15 % 128;
                    int i16 = i15 % 2;
                } catch (Exception unused) {
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2446(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2988) {
            char[] cArr2 = f2443;
            int i11 = f2442;
            if (f2444) {
                int length = bArr.length;
                m.f2990 = length;
                char[] cArr3 = new char[length];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i12 = m.f2989;
                    int i13 = m.f2990 - 1;
                    int i14 = m.f2989;
                    cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                    m.f2989 = i14 + 1;
                }
                return new String(cArr3);
            }
            if (f2445) {
                int length2 = cArr.length;
                m.f2990 = length2;
                char[] cArr4 = new char[length2];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i15 = m.f2989;
                    int i16 = m.f2990 - 1;
                    int i17 = m.f2989;
                    cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                    m.f2989 = i17 + 1;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f2990 = length3;
            char[] cArr5 = new char[length3];
            m.f2989 = 0;
            while (m.f2989 < m.f2990) {
                int i18 = m.f2989;
                int i19 = m.f2990 - 1;
                int i20 = m.f2989;
                cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                m.f2989 = i20 + 1;
            }
            return new String(cArr5);
        }
    }
}
