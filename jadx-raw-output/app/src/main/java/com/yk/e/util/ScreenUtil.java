package com.yk.e.util;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenUtil {
    public static boolean checkDeviceHasNavigationBar(Context context) {
        boolean z10;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z11 = false;
        if (identifier > 0) {
            z10 = resources.getBoolean(identifier);
        } else {
            z10 = false;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if (!"1".equals(str)) {
                if ("0".equals(str)) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
            }
            return z11;
        } catch (Exception unused) {
            return z10;
        }
    }

    public static int getDeviceType(Context context) {
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            return 2;
        }
        return 1;
    }

    public static int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0 && checkDeviceHasNavigationBar(context)) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int getOrientation(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return 0;
        }
        return 1;
    }

    public static int getScreenDensity(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static float getScreenPhysicalDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int getScreenPhysicalHeight(Context context) {
        return (int) (getScreenHeight(context) / context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static int getScreenPhysicalWidth(Context context) {
        return (int) (getScreenWidth(context) / context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
