package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes3.dex */
public final class lh {
    public static int ouw = -1;

    public static int ouw(Context context, int i10) {
        int iRound;
        int iOuw = ouw(context);
        if (iOuw == -1) {
            return ouw;
        }
        int iMin = Math.min(90, Math.round(iOuw * 0.15f));
        if (i10 > 655) {
            iRound = Math.round((i10 / 728.0f) * 90.0f);
        } else if (i10 > 632) {
            iRound = 81;
        } else if (i10 > 526) {
            iRound = Math.round((i10 / 468.0f) * 60.0f);
        } else {
            iRound = i10 > 432 ? 68 : Math.round((i10 / 320.0f) * 50.0f);
        }
        return Math.max(Math.min(iRound, iMin), 50);
    }

    public static int ouw(Context context) {
        DisplayMetrics displayMetrics;
        if (context != null) {
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && resources.getConfiguration() != null) {
                    return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                }
            } catch (Throwable unused) {
                return ouw;
            }
        }
        return ouw;
    }
}
