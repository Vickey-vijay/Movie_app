package com.bytedance.sdk.openadsdk.core.tlj;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.fkw;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.ironsource.Gc;
import com.ironsource.Y1;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lh {
    private static boolean ouw;

    public static void ouw() {
        if (!ouw && zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            vt unused2 = vt.ouw.ouw;
            ouw ouwVar = vt.ouw;
            ouw = ouwVar == null ? false : ouwVar.vt;
        }
    }

    public static void vt(String str) {
        ouw ouwVar;
        if (TextUtils.isEmpty(str) || !zih.yu().jqy()) {
            return;
        }
        vt unused = vt.ouw.ouw;
        if (TextUtils.isEmpty(str) || (ouwVar = vt.ouw) == null || !ouwVar.ouw()) {
            return;
        }
        ouwVar.vt();
        PglSSManager pglSSManager = ouwVar.ouw;
        if (pglSSManager != null) {
            pglSSManager.setDeviceId(str);
        }
    }

    public static int fkw() {
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            ouw ouwVar = vt.ouw;
            if (ouwVar != null) {
                if (ouwVar.f13088lh) {
                    return PglSSManager.getInitStatus();
                }
                return 5;
            }
            return 1;
        }
        return 6;
    }

    public static String le() {
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            return vt.ouw();
        }
        return null;
    }

    public static String lh() {
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            ouw ouwVar = vt.ouw;
            if (ouwVar != null && ouwVar.ouw()) {
                ouwVar.vt();
                PglSSManager pglSSManager = ouwVar.ouw;
                if (pglSSManager != null) {
                    return pglSSManager.getSofChara();
                }
            }
        }
        return "";
    }

    public static long yu() {
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            return vt.vt();
        }
        return 0L;
    }

    public static void ouw(String str) {
        ouw ouwVar;
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            if (TextUtils.isEmpty(str) || (ouwVar = vt.ouw) == null || !ouwVar.ouw()) {
                return;
            }
            ouwVar.vt();
            PglSSManager pglSSManager = ouwVar.ouw;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public static void vt() {
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            final ouw ouwVar = vt.ouw;
            if (ouwVar == null || !ouwVar.ouw()) {
                return;
            }
            ouwVar.vt();
            if (ouwVar.ouw != null) {
                jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tlj.ouw.3
                    public AnonymousClass3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, zih.yu().pno.ouw("bus_con_check_clz", ""));
                            ouw.this.ouw.setCustomInfo(map);
                            ko.ouw("MSSdkImpl", "custom info is: ", map);
                        } catch (Throwable th2) {
                            qbp.yu("MSSdkImpl", "setCustomInfo", th2.getMessage());
                        }
                    }
                });
            }
        }
    }

    public static void ouw(vpp vppVar, String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        Object obj;
        if (zih.yu().jqy()) {
            HashMap map = new HashMap();
            map.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (vppVar != null) {
                String strUx = vppVar.ux();
                boolean zIsEmpty = TextUtils.isEmpty(strUx);
                String strOptString = Y1.f27894f;
                if (!zIsEmpty) {
                    map.put(CommonUrlParts.REQUEST_ID, strUx);
                } else {
                    map.put(CommonUrlParts.REQUEST_ID, Y1.f27894f);
                }
                try {
                    long j10 = -1;
                    if (vppVar.fak() != null) {
                        jOptLong = vppVar.fak().optLong(CreativeInfo.f44321c, -1L);
                        jOptLong2 = vppVar.fak().optLong("rit", -1L);
                        jOptLong3 = vppVar.fak().optLong("ad_slot_type", -1L);
                        strOptString = vppVar.fak().optString("ad_type", Y1.f27894f);
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put(CreativeInfo.f44321c, Long.valueOf(jOptLong));
                    map.put("rit", Long.valueOf(jOptLong2));
                    map.put("ad_slot_type", Long.valueOf(jOptLong3));
                    map.put("ad_type", strOptString);
                    Map<String, Object> map2 = vppVar.npr;
                    if (map2 != null && (obj = map2.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j10 = Long.parseLong(obj.toString());
                    }
                    map.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j10));
                    vt unused = vt.ouw.ouw;
                    ouw ouwVar = vt.ouw;
                    if (ouwVar == null || !ouwVar.ouw()) {
                        return;
                    }
                    ouwVar.vt();
                    PglSSManager pglSSManager = ouwVar.ouw;
                    if (pglSSManager != null) {
                        pglSSManager.reportNow("AdShow", map);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static Map<String, String> ouw(String str, String str2) {
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            return vt.ouw(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void ouw(MotionEvent motionEvent) {
        if (zih.yu().jqy()) {
            vt unused = vt.ouw.ouw;
            ouw ouwVar = vt.ouw;
            if (ouwVar == null || !ouwVar.vt) {
                return;
            }
            ouwVar.vt();
            PglSSManager pglSSManager = ouwVar.ouw;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public static void ouw(JSONObject jSONObject) {
        try {
            if (zih.yu().jqy()) {
                ouw();
                if (fkw() == 0) {
                    vt unused = vt.ouw.ouw;
                    jSONObject.put("sec_did", vt.ouw());
                    String strOuw = fkw.ouw(jSONObject.toString());
                    vt unused2 = vt.ouw.ouw;
                    Map<String, String> mapOuw = vt.ouw("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strOuw != null ? strOuw.getBytes() : new byte[0]);
                    if (mapOuw != null && mapOuw.size() > 0) {
                        for (String str : mapOuw.keySet()) {
                            jSONObject.put(str, mapOuw.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strOuw);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    vt unused3 = vt.ouw.ouw;
                    jSONObject.put("ec", vt.vt());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(fkw()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th2) {
            qbp.lh("SecSdkHelperUtil", th2.getMessage());
            try {
                jSONObject.put("pglx", Gc.f26641e);
            } catch (JSONException unused4) {
            }
        }
    }
}
