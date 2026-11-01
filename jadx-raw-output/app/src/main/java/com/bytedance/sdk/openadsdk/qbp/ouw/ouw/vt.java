package com.bytedance.sdk.openadsdk.qbp.ouw.ouw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.model.jae;
import com.bytedance.sdk.openadsdk.core.model.le;
import com.bytedance.sdk.openadsdk.core.model.ryl;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.fkw;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class vt implements lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final WeakReference<Context> f13296lh;
    public String ouw;
    public int vt;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44975u);
        p10.startActivityForResult(p11, p12);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44975u);
        p10.startActivity(p11);
    }

    @Override // com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh
    public final boolean lh(vpp vppVar) {
        le leVar;
        if (vppVar == null || (leVar = vppVar.wp) == null || vppVar.zjq == 0) {
            return false;
        }
        String str = leVar.f12779lh;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ouw(vppVar, str, ouw(), this.ouw, new HashMap());
    }

    @Override // com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh
    public final boolean vt(vpp vppVar) {
        le leVar;
        if (vppVar == null || (leVar = vppVar.wp) == null) {
            return false;
        }
        return ouw(ouw(), vppVar, leVar.ouw, leVar.f12779lh);
    }

    private boolean fkw(vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.yu.ouw(vppVar, this.ouw, 1, null);
        ryl rylVar = vppVar.f12857kn;
        if (rylVar == null) {
            com.bytedance.sdk.openadsdk.core.yu.ouw(vppVar, this.ouw, -1, null);
            return false;
        }
        HashMap map = new HashMap();
        ouw(vppVar, map);
        String str = rylVar.ouw;
        Context contextOuw = ouw();
        uoy.vt(vppVar);
        if (ouw.ouw(contextOuw, str, vppVar, map)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, this.ouw, "open_fallback_url", map);
        return false;
    }

    public static boolean ouw(Context context, String str, String str2, String str3, vpp vppVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                ko.lh("GPDownLoader", "Goto Google Play");
                ko.lh("GPDownLoader", "download_url is : ->".concat(String.valueOf(str)));
                com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, str3, "store_open", (JSONObject) null);
                fkw.ouw(vppVar);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            ko.lh("GPDownLoader", "gotoGooglePlay :market://details?id=".concat(str2));
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(uri);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent3);
                        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, str3, "store_open", (JSONObject) null);
                        fkw.ouw(vppVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th2);
            }
        }
        return false;
    }

    public vt(Context context, String str) {
        this.f13296lh = new WeakReference<>(context);
        this.ouw = str;
        ko.vt("GPDownLoader", str, "====tag===".concat(String.valueOf(str)));
        if (zih.ouw() == null) {
            zih.vt(context);
        }
    }

    private boolean le(vpp vppVar) {
        return ouw(vppVar, ouw(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yu(vpp vppVar) {
        if (fkw(vppVar)) {
            vppVar.f12851gh = true;
            fkw.ouw(vppVar);
            return;
        }
        if (lh(vppVar)) {
            vppVar.f12851gh = true;
            fkw.ouw(vppVar);
            return;
        }
        if (le(vppVar)) {
            fkw.ouw(vppVar);
            return;
        }
        if (vt(vppVar)) {
            vppVar.f12851gh = true;
            fkw.ouw(vppVar);
        } else if (vppVar.wp == null && vppVar.osn != null) {
            com.bytedance.sdk.openadsdk.core.uoy.ouw(ouw(), vppVar.osn, vppVar, uoy.ouw(this.ouw), this.ouw, true);
            vppVar.f12851gh = true;
            fkw.ouw(vppVar);
        }
    }

    private static boolean vt(vpp vppVar, Context context, boolean z10) {
        jae jaeVar;
        if (vppVar != null && (jaeVar = vppVar.oiz) != null && jaeVar.lh() && !TextUtils.isEmpty(vppVar.oiz.yu()) && context != null) {
            try {
                jae jaeVar2 = vppVar.oiz;
                String strOuw = uoy.ouw(vppVar);
                final JSONObject jSONObjectFkw = jaeVar2.fkw();
                jSONObjectFkw.put("from_web", z10 ? 1 : 0);
                jSONObjectFkw.put("is_w2a", vppVar.fkw());
                com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, strOuw, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.3
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() {
                        try {
                            jSONObjectFkw.put("status", 0);
                        } catch (Throwable unused) {
                        }
                        return jSONObjectFkw;
                    }
                });
                Intent intentOuw = ouw(context, jaeVar2);
                if (intentOuw == null) {
                    ouw(jSONObjectFkw, vppVar, strOuw, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!com.bytedance.sdk.openadsdk.utils.vpp.ouw((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity activityOuw = com.bytedance.sdk.openadsdk.core.ko.ouw.ouw.ouw.ouw();
                    if (activityOuw != null && com.bytedance.sdk.openadsdk.utils.vpp.ouw(activityOuw)) {
                        context = activityOuw;
                    }
                }
                if (!(context instanceof Activity)) {
                    ouw(jSONObjectFkw, vppVar, strOuw, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && intentOuw.resolveActivity(packageManager) != null) {
                    try {
                        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221((Activity) context, intentOuw, 0);
                        ko.lh("GPDownLoader", "canOpenByGPMiniCard success");
                        ouw(jSONObjectFkw, vppVar, strOuw, 1);
                        return true;
                    } catch (Throwable unused) {
                        ouw(jSONObjectFkw, vppVar, strOuw, -3);
                        return false;
                    }
                }
                ouw(jSONObjectFkw, vppVar, strOuw, -4);
                return false;
            } catch (Throwable th2) {
                ko.fkw("GPDownLoader", th2.getMessage());
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh
    public final void ouw(int i10) {
        this.vt = i10;
    }

    private boolean ouw(Context context, vpp vppVar, String str, String str2) {
        return ouw(context, str, str2, this.ouw, vppVar);
    }

    private Context ouw() {
        WeakReference<Context> weakReference = this.f13296lh;
        return (weakReference == null || weakReference.get() == null) ? zih.ouw() : this.f13296lh.get();
    }

    @Override // com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh
    public final void ouw(final vpp vppVar) {
        if (ouw() == null || vppVar == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.vpp.ouw.ouw("gp_downloader_async", 0) == 1) {
            bs.bly().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.1
                @Override // java.lang.Runnable
                public final void run() {
                    vt.this.yu(vppVar);
                }
            });
        } else {
            yu(vppVar);
        }
    }

    private static void ouw(final JSONObject jSONObject, vpp vppVar, String str, final int i10) {
        try {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.2
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject ouw() {
                    try {
                        jSONObject.put("status", i10);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th2) {
            ko.fkw("GPDownLoader", th2.getMessage());
        }
    }

    private static Intent ouw(Context context, jae jaeVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String str = jaeVar.vt;
            if (!TextUtils.isEmpty(str)) {
                intent.setPackage(str);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(jaeVar.yu()));
            boolean z10 = true;
            if (jaeVar.fkw != 1) {
                z10 = false;
            }
            intent.putExtra("overlay", z10);
            if (TextUtils.isEmpty(jaeVar.f12758le)) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", jaeVar.f12758le);
            }
            jaeVar.ouw(intent);
            return intent;
        } catch (Throwable th2) {
            ko.fkw("GPDownLoader", th2.getMessage());
            return null;
        }
    }

    @NonNull
    private static Map<String, Object> ouw(vpp vppVar, boolean z10, jae jaeVar) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", jaeVar.ouw);
            jSONObject.put("from_web", z10 ? 1 : 0);
            jSONObject.put("is_w2a", vppVar.fkw());
            map.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return map;
    }

    public static boolean ouw(String str, vpp vppVar) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if ("market".equals(scheme) && "details".equals(host)) {
                    return true;
                }
                if ((!"http".equals(scheme) && !"https".equals(scheme)) || (!"play.google.com".equals(host) && !"market.android.com".equals(host))) {
                    if ("market".equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = uri.getQueryParameter(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI)) != null) {
                        return ouw(queryParameter, vppVar);
                    }
                }
                return true;
            } catch (Throwable th2) {
                ko.fkw("GPDownLoader", th2.getMessage());
            }
        }
        return false;
    }

    public static boolean ouw(vpp vppVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentOuw;
        if (vppVar != null && vppVar.zjq == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentOuw = uoy.ouw(context, str)) == null) {
                return false;
            }
            intentOuw.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentOuw.addFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentOuw);
            if (map == null) {
                map = new HashMap<>();
            }
            if (vppVar != null && vppVar.cy == 0) {
                map.put("auto_click", Boolean.valueOf(!vppVar.mq));
            }
            map.put("can_query_install", 0);
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    private void ouw(vpp vppVar, Map<String, Object> map) {
        if (vppVar != null && vppVar.cy == 0) {
            map.put("auto_click", Boolean.valueOf(!vppVar.mq));
        }
        if (vppVar != null && vppVar.cy == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.vt >= 11));
        }
        map.put("can_query_install", 0);
    }

    public static boolean ouw(vpp vppVar, Context context, boolean z10) {
        IPBroadcastReceiver iPBroadcastReceiverOuw;
        try {
            if (vppVar != null && context != null) {
                jae jaeVar = vppVar.oiz;
                if (jaeVar != null && !TextUtils.isEmpty(jaeVar.yu())) {
                    if (jaeVar.lh() && vt(vppVar, context, z10)) {
                        return true;
                    }
                    if (jaeVar.ouw() || jaeVar.vt()) {
                        String str = null;
                        if (vppVar.fkw() == 1) {
                            str = jaeVar.yu;
                        } else {
                            le leVar = vppVar.wp;
                            if (leVar != null && !TextUtils.isEmpty(leVar.f12779lh)) {
                                str = vppVar.wp.f12779lh;
                            }
                        }
                        if (!TextUtils.isEmpty(str) && (iPBroadcastReceiverOuw = IPBroadcastReceiver.ouw(context, vppVar)) != null && !TextUtils.isEmpty(str) && iPBroadcastReceiverOuw.ouw.get(str) == null) {
                            iPBroadcastReceiverOuw.ouw.put(str, vppVar);
                        }
                    }
                    Map<String, Object> mapOuw = ouw(vppVar, z10, jaeVar);
                    String strYu = jaeVar.yu();
                    uoy.vt(vppVar);
                    final boolean zOuw = ouw.ouw(context, strYu, vppVar, mapOuw);
                    bs.vt(new pno("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (zOuw) {
                                bly.ouw("oem_store", "1");
                            } else {
                                bly.ouw("oem_store", "-2");
                            }
                        }
                    });
                    return zOuw;
                }
            } else {
                ko.fkw("GPDownLoader", "mAdMeta is null or mContext is null");
            }
            return false;
        } catch (Throwable th2) {
            qbp.lh("GPDownLoader", th2.getMessage());
            return false;
        }
    }
}
