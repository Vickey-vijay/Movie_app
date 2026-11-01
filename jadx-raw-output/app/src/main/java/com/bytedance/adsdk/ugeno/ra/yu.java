package com.bytedance.adsdk.ugeno.ra;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes11.dex */
public final class yu {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f10962lh;
    private static String ouw;
    private static Resources vt;

    public static void ouw(String str) {
        ouw = str;
    }

    private static int ouw(Context context, String str, String str2) {
        if (vt == null) {
            vt = context.getResources();
        }
        Resources resources = vt;
        if (ouw == null) {
            ouw = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, ouw);
    }

    public static int vt(Context context, String str) {
        return ouw(context, str, "drawable");
    }

    public static int ouw(Context context, String str) {
        return ouw(context, str, "raw");
    }
}
