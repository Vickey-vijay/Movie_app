package com.bytedance.adsdk.ugeno.ra;

/* JADX INFO: loaded from: classes10.dex */
public final class lh {
    public static float ouw(String str, float f10) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return f10;
        }
    }

    public static int ouw(String str, int i10) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    public static double vt(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return 0.0d;
        }
    }

    public static long ouw(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    public static boolean ouw(String str, boolean z10) {
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return z10;
        }
    }
}
