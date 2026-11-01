package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.safedk.android.internal.partials.PangleVideoBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ryl {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static String f12990lh;
    private static String ouw;
    private static String vt;
    private static boolean yu;

    public static String ouw(Context context) {
        if (!TextUtils.isEmpty(ouw)) {
            return ouw;
        }
        if (yu(context) != null) {
            lh.ouw();
            String strVt = lh.vt("abcd", (String) null);
            if (!TextUtils.isEmpty(strVt)) {
                try {
                    JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(strVt);
                    int iOptInt = jSONObjectJsonObjectInit.optInt("cypher", -1);
                    String strOptString = jSONObjectJsonObjectInit.optString("message");
                    if (iOptInt == 3) {
                        String strVt2 = com.bytedance.sdk.component.utils.ouw.vt(strOptString);
                        if (!TextUtils.isEmpty(strVt2)) {
                            ouw = PangleVideoBridge.jsonObjectInit(strVt2).optString("abcd");
                            ouw();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return ouw;
    }

    public static String vt(Context context) {
        if (vt == null && !yu) {
            synchronized (ryl.class) {
                if (!yu) {
                    fkw(context);
                }
            }
        }
        return vt;
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_WIFI_STATE"})
    @SuppressLint({"HardwareIds"})
    private static void fkw(Context context) {
        if (yu || yu(context) == null) {
            return;
        }
        vt = String.valueOf(Build.TIME);
        lh.ouw();
        f12990lh = lh.vt(CommonUrlParts.UUID, (String) null);
        yu = true;
    }

    public static String lh(Context context) {
        if (TextUtils.isEmpty(f12990lh) && !yu) {
            synchronized (ryl.class) {
                if (!yu) {
                    fkw(context);
                }
            }
        }
        return f12990lh;
    }

    private static Context yu(Context context) {
        return context == null ? zih.ouw() : context;
    }

    public static String vt() {
        try {
            Locale locale = LocaleList.getDefault().get(0);
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            return Locale.SIMPLIFIED_CHINESE.toString().equals(string) ? "zh" : "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void ouw(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(ouw)) {
                ouw = str;
            }
            ouw();
        }
        if (TextUtils.isEmpty(ouw)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.tlj.lh.vt(ouw);
        cf.ouw(ouw);
    }

    public static void ouw() {
        if (TextUtils.isEmpty(ouw)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.bs.vt(new com.bytedance.sdk.component.pno.pno("update_did") { // from class: com.bytedance.sdk.openadsdk.core.ryl.1
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", ryl.ouw);
                    lh.ouw();
                    lh.ouw("abcd", com.bytedance.sdk.component.utils.ouw.ouw(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }
}
