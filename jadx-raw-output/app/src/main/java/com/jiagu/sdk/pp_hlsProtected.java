package com.jiagu.sdk;

import android.app.Application;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class pp_hlsProtected {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<Integer, String> f31777a;

    static {
        System.loadLibrary("jiagu_sdk_pp_hlsProtected");
        f31777a = new ConcurrentHashMap();
    }

    public static String a(int i10) {
        String str = f31777a.get(Integer.valueOf(i10));
        if (str != null) {
            return str;
        }
        String strInterface14 = interface14(i10);
        f31777a.put(Integer.valueOf(i10), strInterface14);
        return strInterface14;
    }

    public static void b(Application application) {
    }

    public static native String interface14(int i10);
}
