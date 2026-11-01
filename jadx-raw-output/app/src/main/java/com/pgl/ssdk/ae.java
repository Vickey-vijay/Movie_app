package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes10.dex */
public class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f43200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f43201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f43202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f43203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f43204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f43205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f43206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f43207h;

    public static String e(Context context) {
        int i10 = -1;
        if (context != null) {
            try {
                i10 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i10);
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f43205f = (int) displayMetrics.density;
            f43204e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f43206g = (int) displayMetrics.xdpi;
            f43207h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    public static int a(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.touchscreen;
            }
        } catch (Throwable unused) {
        }
        return 666666;
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f43200a = displayMetrics.widthPixels;
            f43201b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f43202c = mode.getPhysicalWidth();
            f43203d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        return f43204e + "[<!>]" + f43200a + StringUtils.COMMA + f43201b + "[<!>]" + f43202c + VastAttributes.HORIZONTAL_POSITION + f43203d + "[<!>]";
    }
}
