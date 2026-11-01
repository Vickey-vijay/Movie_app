package com.mbridge.msdk.util;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;

/* JADX INFO: compiled from: CommonUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f38365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f38366b;

    public static boolean a() {
        if (f38365a == null) {
            try {
                Boolean boolValueOf = Boolean.valueOf(Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2);
                f38365a = boolValueOf;
                return boolValueOf.booleanValue();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isChina", e10);
                }
            }
        }
        return f38365a != null && f38365a.booleanValue();
    }

    public static boolean b() {
        if (f38366b == null) {
            try {
                Boolean boolValueOf = Boolean.valueOf(Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1);
                f38366b = boolValueOf;
                return boolValueOf.booleanValue();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isOversea", e10);
                }
            }
        }
        return f38366b != null && f38366b.booleanValue();
    }
}
