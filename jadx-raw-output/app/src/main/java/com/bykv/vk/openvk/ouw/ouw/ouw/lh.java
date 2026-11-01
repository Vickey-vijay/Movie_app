package com.bykv.vk.openvk.ouw.ouw.ouw;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.vt.ouw.cf;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class lh {
    private static cf fkw = null;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static int f10440le = 1;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static String f10441lh;
    public static boolean ouw;
    private static Context vt;
    private static boolean yu;

    public static void le() {
        f10440le = 2;
    }

    public static Context ouw() {
        return vt;
    }

    public static boolean fkw() {
        return ouw;
    }

    public static boolean lh() {
        return yu;
    }

    public static void ouw(Context context, String str) {
        vt = context;
        f10441lh = str;
    }

    public static int ra() {
        return f10440le;
    }

    public static String vt() {
        if (TextUtils.isEmpty(f10441lh)) {
            try {
                File file = new File(vt.getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f10441lh = file.getAbsolutePath();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return f10441lh;
    }

    public static cf yu() {
        if (fkw == null) {
            cf.ouw ouwVar = new cf.ouw((byte) 0);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            fkw = com.bytedance.sdk.component.vt.ouw.ouw.ouw.ouw(ouwVar.ouw(10000L, timeUnit).vt(10000L, timeUnit).lh(10000L, timeUnit));
        }
        return fkw;
    }

    public static void ouw(boolean z10) {
        yu = z10;
    }

    public static void ouw(cf cfVar) {
        fkw = cfVar;
    }
}
