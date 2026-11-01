package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: loaded from: classes10.dex */
public class AdapterUtils {
    public static final int MIN_TABLET_DP_SIZE = 600;

    public static boolean isLargeScreen(Context context) {
        if (context != null) {
            return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - context is null", 3);
        return false;
    }

    public static int dpToPixels(Context context, int i10) {
        if (context != null) {
            return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - context is null, returning dpSize", 3);
        return i10;
    }

    public static String getScreenSizeParams(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f10 = displayMetrics.heightPixels;
        float f11 = displayMetrics.density;
        float fMin = Math.min(displayMetrics.widthPixels / f11, f10 / f11);
        float f12 = displayMetrics.xdpi;
        float f13 = displayMetrics.ydpi;
        float f14 = displayMetrics.widthPixels / f12;
        float f15 = displayMetrics.heightPixels / f13;
        return "smallestWidth = " + fMin + " diagonalInches = " + Math.sqrt((f14 * f14) + (f15 * f15)) + " smallScreenDpApi =  " + context.getResources().getConfiguration().smallestScreenWidthDp;
    }
}
