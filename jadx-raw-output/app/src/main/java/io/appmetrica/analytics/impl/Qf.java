package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f55798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray f55799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f55800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f55801d;

    public static C4290j9 a(Long l10, Long l11, Boolean bool) {
        C4290j9 c4290j9 = new C4290j9();
        if (l10 != null) {
            c4290j9.f57009a = l10.longValue();
            c4290j9.f57010b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l10.longValue() * 1000) / 1000;
        }
        if (l11 != null) {
            c4290j9.f57011c = l11.longValue();
        }
        if (bool != null) {
            c4290j9.f57012d = bool.booleanValue();
        }
        return c4290j9;
    }

    static {
        HashMap map = new HashMap();
        Wk wk2 = Wk.FOREGROUND;
        map.put(wk2, 0);
        Wk wk3 = Wk.BACKGROUND;
        map.put(wk3, 1);
        f55798a = Collections.unmodifiableMap(map);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, wk2);
        sparseArray.put(1, wk3);
        f55799b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_INIT;
        map2.put(enumC4112cb, 1);
        EnumC4112cb enumC4112cb2 = EnumC4112cb.EVENT_TYPE_REGULAR;
        map2.put(enumC4112cb2, 4);
        EnumC4112cb enumC4112cb3 = EnumC4112cb.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC4112cb3, 5);
        EnumC4112cb enumC4112cb4 = EnumC4112cb.EVENT_TYPE_ALIVE;
        map2.put(enumC4112cb4, 7);
        EnumC4112cb enumC4112cb5 = EnumC4112cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC4112cb5, 26);
        EnumC4112cb enumC4112cb6 = EnumC4112cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC4112cb6, 26);
        EnumC4112cb enumC4112cb7 = EnumC4112cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC4112cb7, 26);
        EnumC4112cb enumC4112cb8 = EnumC4112cb.EVENT_TYPE_ANR;
        map2.put(enumC4112cb8, 25);
        EnumC4112cb enumC4112cb9 = EnumC4112cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC4112cb9, 26);
        EnumC4112cb enumC4112cb10 = EnumC4112cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC4112cb10, 26);
        EnumC4112cb enumC4112cb11 = EnumC4112cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC4112cb11, 27);
        EnumC4112cb enumC4112cb12 = EnumC4112cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC4112cb12, 27);
        EnumC4112cb enumC4112cb13 = EnumC4112cb.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC4112cb13, 13);
        EnumC4112cb enumC4112cb14 = EnumC4112cb.EVENT_TYPE_START;
        map2.put(enumC4112cb14, 2);
        EnumC4112cb enumC4112cb15 = EnumC4112cb.EVENT_TYPE_APP_OPEN;
        map2.put(enumC4112cb15, 16);
        EnumC4112cb enumC4112cb16 = EnumC4112cb.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC4112cb16, 17);
        EnumC4112cb enumC4112cb17 = EnumC4112cb.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC4112cb17, 18);
        EnumC4112cb enumC4112cb18 = EnumC4112cb.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC4112cb18, 19);
        EnumC4112cb enumC4112cb19 = EnumC4112cb.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC4112cb19, 20);
        EnumC4112cb enumC4112cb20 = EnumC4112cb.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC4112cb20, 21);
        EnumC4112cb enumC4112cb21 = EnumC4112cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC4112cb21, 40);
        EnumC4112cb enumC4112cb22 = EnumC4112cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC4112cb22, 35);
        map2.put(EnumC4112cb.EVENT_TYPE_CLEANUP, 29);
        EnumC4112cb enumC4112cb23 = EnumC4112cb.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC4112cb23, 38);
        EnumC4112cb enumC4112cb24 = EnumC4112cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        map2.put(enumC4112cb24, 42);
        f55800c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        C4640x8 c4640x8 = new C4640x8();
        D8 d10 = new D8(new I8());
        C4665y8 c4665y8 = new C4665y8();
        C4130d3 c4130d3 = new C4130d3(new I8());
        Qn qn2 = new Qn(new I8());
        Mf mf2 = new Mf();
        U8 u8A = V8.a();
        u8A.f55968b = mf2;
        u8A.f55969c = mf2;
        V8 v10 = new V8(u8A);
        U8 u8A2 = V8.a();
        u8A2.f55968b = d10;
        V8 v11 = new V8(u8A2);
        U8 u8A3 = V8.a();
        u8A3.f55968b = c4130d3;
        V8 v12 = new V8(u8A3);
        U8 u8A4 = V8.a();
        u8A4.f55968b = qn2;
        V8 v13 = new V8(u8A4);
        U8 u8A5 = V8.a();
        u8A5.f55967a = c4640x8;
        V8 v14 = new V8(u8A5);
        U8 u8A6 = V8.a();
        u8A6.f55968b = new vo(new D8());
        V8 v15 = new V8(u8A6);
        map3.put(enumC4112cb2, v11);
        U8 u8A7 = V8.a();
        u8A7.f55968b = new Of();
        map3.put(enumC4112cb3, new V8(u8A7));
        U8 u8A8 = V8.a();
        u8A8.f55967a = c4640x8;
        u8A8.f55968b = c4665y8;
        u8A8.f55971e = new X7();
        u8A8.f55972f = new Y7();
        map3.put(enumC4112cb4, new V8(u8A8));
        map3.put(enumC4112cb9, v10);
        map3.put(enumC4112cb10, v10);
        map3.put(enumC4112cb11, v12);
        map3.put(enumC4112cb12, v12);
        map3.put(enumC4112cb5, v12);
        map3.put(enumC4112cb6, v12);
        map3.put(enumC4112cb7, v12);
        map3.put(enumC4112cb8, v12);
        U8 u8A9 = V8.a();
        u8A9.f55967a = new C4640x8();
        u8A9.f55968b = c4130d3;
        map3.put(enumC4112cb14, new V8(u8A9));
        EnumC4112cb enumC4112cb25 = EnumC4112cb.EVENT_TYPE_CUSTOM_EVENT;
        U8 u8A10 = V8.a();
        u8A10.f55970d = new Pf();
        map3.put(enumC4112cb25, new V8(u8A10));
        map3.put(enumC4112cb15, v11);
        map3.put(enumC4112cb17, v14);
        map3.put(enumC4112cb18, v14);
        map3.put(enumC4112cb19, v12);
        map3.put(enumC4112cb20, v12);
        map3.put(enumC4112cb21, v12);
        map3.put(enumC4112cb22, v13);
        map3.put(enumC4112cb, v15);
        map3.put(enumC4112cb16, v15);
        map3.put(enumC4112cb13, v11);
        map3.put(enumC4112cb23, v11);
        map3.put(enumC4112cb24, v12);
        f55801d = Collections.unmodifiableMap(map3);
    }

    public static void a(C4239h9 c4239h9) {
        C4187f9[] c4187f9Arr = c4239h9.f56899c;
        if (c4187f9Arr != null) {
            for (C4187f9 c4187f9 : c4187f9Arr) {
            }
        }
    }
}
