package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class vpp {
    private static com.bytedance.sdk.openadsdk.rn.ouw.vt ouw(String str, int i10, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        com.bytedance.sdk.openadsdk.rn.ouw.vt vtVar = new com.bytedance.sdk.openadsdk.rn.ouw.vt();
        vtVar.ouw = str;
        vtVar.vt = vppVar;
        vtVar.f13318lh = uoy.ouw(vppVar);
        vtVar.yu = i10;
        vtVar.fkw = false;
        vtVar.f13319ra = vppVar.f12868pd;
        return vtVar;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44975u);
        p10.startActivity(p11);
    }

    private static boolean vt(Context context, String str, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw = ouw(str2, 100, vppVar);
                vtVarOuw.fkw = true;
                vtVarOuw.f13319ra = 2;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw);
                return true;
            } catch (Throwable th2) {
                String message = th2.getMessage();
                com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw2 = ouw(str2, 7, vppVar);
                vtVarOuw2.f13317le = message;
                vtVarOuw2.f13319ra = 2;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw2);
                return false;
            }
        } catch (Throwable th3) {
            String message2 = th3.getMessage();
            com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw3 = ouw(str2, 6, vppVar);
            vtVarOuw3.f13317le = message2;
            vtVarOuw3.f13319ra = 2;
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw3);
            return false;
        }
    }

    public static boolean ouw(Context context, String str, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str2) {
        if (context instanceof Activity) {
            if (!ouw((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityOuw = com.bytedance.sdk.openadsdk.core.ko.ouw.ouw.ouw.ouw();
            if (activityOuw != null && ouw(activityOuw)) {
                context = activityOuw;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.zih.ouw();
        }
        if (context == null) {
            return false;
        }
        uoy.ouw(vppVar);
        if (!com.bytedance.sdk.component.utils.vm.ouw(str)) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(ouw(str2, 5, vppVar));
            return false;
        }
        String strVt = com.bytedance.sdk.openadsdk.core.model.vpp.vt(context, vppVar);
        if (!TextUtils.isEmpty(strVt)) {
            try {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setUrlBarHidingEnabled(false);
                builder.setShareState(2);
                try {
                    CustomTabsIntent customTabsIntentBuild = builder.build();
                    if (!(context instanceof Activity)) {
                        customTabsIntentBuild.intent.addFlags(268435456);
                    }
                    com.bytedance.sdk.openadsdk.core.ouw.ouw.ouw(context, strVt, customTabsIntentBuild, Uri.parse(str));
                    if (context instanceof TTBaseActivity) {
                        ((TTBaseActivity) context).fkw();
                    }
                    com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw = ouw(str2, 100, vppVar);
                    vtVarOuw.fkw = true;
                    vtVarOuw.f13319ra = 8;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw);
                } catch (Throwable th2) {
                    String message = th2.getMessage();
                    com.bytedance.sdk.component.utils.qbp.lh("OpenUtils", message);
                    com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw2 = ouw(str2, 13, vppVar);
                    vtVarOuw2.f13317le = message;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw2);
                    vt(context, str, vppVar, str2);
                }
                return true;
            } catch (Throwable th3) {
                String message2 = th3.getMessage();
                com.bytedance.sdk.component.utils.qbp.lh("OpenUtils", message2);
                com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw3 = ouw(str2, 12, vppVar);
                vtVarOuw3.f13317le = message2;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw3);
                return vt(context, str, vppVar, str2);
            }
        }
        return vt(context, str, vppVar, str2);
    }

    public static boolean ouw(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
