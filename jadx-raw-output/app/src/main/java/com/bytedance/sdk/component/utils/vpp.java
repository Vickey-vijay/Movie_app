package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes2.dex */
public final class vpp {
    private static boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static boolean f11923le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static Resources f11924lh;

    @SuppressLint({"StaticFieldLeak"})
    private static Context ouw;
    private static String vt;
    private static String yu;

    private static String lh(Context context) {
        if (yu == null) {
            yu = context.getPackageName();
        }
        return yu;
    }

    public static void ouw(Context context) {
        ouw = context;
    }

    public static int vt(Context context, String str) {
        return ouw(context, str, TypedValues.Custom.S_STRING);
    }

    public static int fkw(Context context, String str) {
        return ouw(context, str, "id");
    }

    public static int le(Context context, String str) {
        return ouw(context, str, "style");
    }

    public static void ouw(String str) {
        yu = str;
    }

    public static int pno(Context context, String str) {
        return ouw(context, str, "anim");
    }

    public static int ra(Context context, String str) {
        return vt(context).getColor(ouw(context, str, "color"));
    }

    public static Resources vt(Context context) {
        Resources resources = f11924lh;
        if (resources == null) {
            resources = null;
        }
        Context context2 = ouw;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static int yu(Context context, String str) {
        try {
            return ouw(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    private static int ouw(Context context, String str, String str2) {
        int identifier = vt(context).getIdentifier(str, str2, lh(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!fkw) {
            ouw();
            return vt(context).getIdentifier(str, str2, lh(context));
        }
        return context.getResources().getIdentifier(str, str2, lh(context));
    }

    public static Drawable lh(Context context, String str) {
        try {
            return vt(context).getDrawable(yu(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    private static synchronized void ouw() {
        try {
            if (TextUtils.isEmpty(vt)) {
                return;
            }
            fkw = true;
        } catch (Throwable th2) {
            Log.e("ResourceHelp", "makePluginResources failed", th2);
        }
    }

    public static String ouw(Context context, String str) {
        return vt(context).getString(ouw(context, str, TypedValues.Custom.S_STRING));
    }
}
