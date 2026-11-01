package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class uoy {
    private static boolean ouw;

    public static void ouw(boolean z10) {
        ouw = z10;
    }

    private static com.bytedance.sdk.openadsdk.rn.ouw.vt ouw(int i10, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        com.bytedance.sdk.openadsdk.rn.ouw.vt vtVar = new com.bytedance.sdk.openadsdk.rn.ouw.vt();
        vtVar.ouw = com.bytedance.sdk.openadsdk.yu.vt.ouw.ouw;
        vtVar.vt = vppVar;
        vtVar.f13318lh = com.bytedance.sdk.openadsdk.utils.uoy.ouw(vppVar);
        vtVar.yu = i10;
        vtVar.fkw = false;
        vtVar.f13319ra = vppVar.f12868pd;
        return vtVar;
    }

    public static boolean ouw(Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10, @Nullable PAGNativeAd pAGNativeAd, @Nullable com.bytedance.sdk.openadsdk.core.yu.ouw ouwVar, String str, @Nullable com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar, boolean z10, int i11) {
        String strOuw;
        int i12;
        com.bytedance.sdk.openadsdk.yu.lh.ouw(ouw(-1, vppVar));
        if (context != null && vppVar != null && i10 != -1) {
            com.bytedance.sdk.openadsdk.core.model.ryl rylVar = vppVar.f12857kn;
            HashMap map = new HashMap();
            if (vppVar.cy == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(i11 >= 11));
            }
            if (i11 != 0 && vppVar.cd()) {
                map.put("dsp_click_type", Integer.valueOf(i11));
            }
            if (rylVar != null && !TextUtils.isEmpty(rylVar.ouw)) {
                if (ouw(context, vppVar, str, map)) {
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(ouw(2, vppVar));
                    com.bytedance.sdk.openadsdk.utils.fkw.ouw(vppVar);
                    return true;
                }
                int i13 = rylVar.f12804lh;
                if (i13 != 2 || (i12 = vppVar.ucs) == 5 || i12 == 15) {
                    if (i13 == 1 && !TextUtils.isEmpty(rylVar.vt)) {
                        strOuw = rylVar.vt;
                    } else {
                        strOuw = ouw(vppVar);
                    }
                } else if (lhVar != null) {
                    if (!lhVar.lh(vppVar)) {
                        if (lhVar.vt(vppVar)) {
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str, "open_fallback_url", map);
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(ouw(3, vppVar));
                            com.bytedance.sdk.openadsdk.utils.fkw.ouw(vppVar);
                            return true;
                        }
                        strOuw = ouw(rylVar, vppVar);
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(ouw(3, vppVar));
                    } else {
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str, "open_fallback_url", map);
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(ouw(3, vppVar));
                        com.bytedance.sdk.openadsdk.utils.fkw.ouw(vppVar);
                        return true;
                    }
                } else {
                    strOuw = ouw(rylVar, vppVar);
                }
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str, "open_fallback_url", map);
            } else {
                strOuw = ouw(vppVar);
            }
            String str2 = strOuw;
            com.bytedance.sdk.component.utils.ko.ouw("WebHelper", "url is：", str2);
            if (vppVar.cy == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String strSubstring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.yu.lh.ouw(ouw(4, vppVar));
                boolean zOuw = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.ouw(context, str2, strSubstring, str, vppVar);
                if (zOuw) {
                    com.bytedance.sdk.openadsdk.utils.fkw.ouw(vppVar);
                }
                return zOuw;
            }
            boolean zOuw2 = ouw(context, vppVar, i10, pAGNativeAd, ouwVar, str, z10, str2);
            if (zOuw2) {
                com.bytedance.sdk.openadsdk.utils.fkw.ouw(vppVar);
            }
            return zOuw2;
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(ouw(1, vppVar));
        return false;
    }

    private static String ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar;
        if (vppVar.cd() && (ouwVar = vppVar.cu) != null) {
            return ouwVar.ouw();
        }
        return vppVar.osn;
    }

    public static boolean ouw(Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.yu.ouw ouwVar, String str, boolean z10, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.od.vt(vppVar)) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(ouw(5, vppVar));
            return false;
        }
        int i11 = vppVar.f12868pd;
        if (i11 != 2 && i11 != 8) {
            com.bytedance.sdk.component.utils.vt.ouw(context, ouw(context, str2, vppVar, i10, pAGNativeAd, ouwVar, str, z10), null);
            ouw = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.vpp.ouw(context, str2, vppVar, com.bytedance.sdk.openadsdk.yu.vt.ouw.ouw);
    }

    public static void ouw(Context context, String str, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10, String str2, boolean z10) {
        com.bytedance.sdk.component.utils.vt.ouw(context, ouw(context, str, vppVar, i10, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.yu.ouw) null, str2, z10), null);
    }

    public static void ouw(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10, final String str2, th thVar) {
        com.bytedance.sdk.component.utils.vt.ouw(context, ouw(context, str, vppVar, i10, null, null, str2, false, true, thVar), new com.bytedance.sdk.component.utils.vt.InterfaceC0099vt() { // from class: com.bytedance.sdk.openadsdk.core.uoy.1
            @Override // com.bytedance.sdk.component.utils.vt.InterfaceC0099vt
            public final void ouw() {
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str2, 3, (JSONObject) null);
            }

            @Override // com.bytedance.sdk.component.utils.vt.InterfaceC0099vt
            public final void ouw(Throwable th2) {
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str2, -2, (JSONObject) null);
                com.bytedance.sdk.component.utils.ko.ouw("WebHelper", "open full landing page Url fail", th2);
            }
        });
    }

    private static Intent ouw(Context context, String str, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10, @Nullable PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.yu.ouw ouwVar, String str2, boolean z10) {
        return ouw(context, str, vppVar, i10, pAGNativeAd, ouwVar, str2, z10, false, null);
    }

    public static boolean ouw(Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, int i10, int i11) {
        Intent intent;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", i11);
            com.bytedance.sdk.openadsdk.yu.lh.le(vppVar, str, jSONObject);
            if (context == null || vppVar == null || !com.bytedance.sdk.openadsdk.core.model.od.vt(vppVar)) {
                intent = null;
            } else {
                intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
                intent.putExtra("ad_pending_download", false);
                String strTlj = com.bytedance.sdk.openadsdk.core.model.od.tlj(vppVar);
                if (!TextUtils.isEmpty(strTlj)) {
                    if (strTlj.contains("?")) {
                        strTlj = strTlj + "&orientation=portrait";
                    } else {
                        strTlj = strTlj + "?orientation=portrait";
                    }
                }
                if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                    intent.putExtra("url", strTlj);
                    intent.putExtra("event_tag", str);
                    intent.putExtra("source", i10);
                    intent.putExtra("gecko_id", vppVar.f12856ki);
                    intent.putExtra("web_title", vppVar.fqk);
                    intent.putExtra("adid", vppVar.pv);
                    intent.putExtra("log_extra", vppVar.yhj);
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, vppVar.ouw(true).toString());
                } else {
                    vppVar.f12878th = strTlj;
                    vppVar.qbp = str;
                    vppVar.zin = i10;
                    intent.putExtra("meta_index", od.ouw().ouw(vppVar));
                }
            }
            if (intent == null) {
                return false;
            }
            return com.bytedance.sdk.component.utils.vt.ouw(context, intent, null, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent ouw(Context context, String str, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10, @Nullable PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.yu.ouw ouwVar, String str2, boolean z10, boolean z11, th thVar) {
        Intent intent;
        int i11;
        if (!z11 && com.bytedance.sdk.openadsdk.core.model.od.vt(vppVar) && (pAGNativeAd != 0 || ouwVar != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            boolean zOuw = ouw(vppVar, z10);
            intent.putExtra("ad_pending_download", zOuw);
            String strTlj = com.bytedance.sdk.openadsdk.core.model.od.tlj(vppVar);
            if (!TextUtils.isEmpty(strTlj)) {
                if (strTlj.contains("?")) {
                    str = strTlj + "&orientation=portrait";
                } else {
                    str = strTlj + "?orientation=portrait";
                }
            }
            vppVar.vpp = zOuw;
        } else if (!z11 && vppVar.f12868pd == 3 && (((i11 = vppVar.fvf) == 2 || (i11 == 1 && ouw)) && !vppVar.f12844cd)) {
            intent = new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTLandingPageActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            intent.putExtra("url", str);
            intent.putExtra("event_tag", str2);
            intent.putExtra("source", i10);
            intent.putExtra("gecko_id", vppVar.f12856ki);
            if (z11 && thVar != null) {
                intent.putExtra("web_title", thVar.ouw);
                intent.putExtra("only_loading", thVar.vt);
            } else {
                intent.putExtra("web_title", vppVar.fqk);
            }
            intent.putExtra("adid", vppVar.pv);
            intent.putExtra("log_extra", vppVar.yhj);
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, vppVar.ouw(true).toString());
        } else {
            if (z11 && thVar != null) {
                vppVar.fqk = thVar.ouw;
                vppVar.f12845cf = thVar.vt;
            }
            vppVar.f12878th = str;
            vppVar.qbp = str2;
            vppVar.zin = i10;
            intent.putExtra("meta_index", od.ouw().ouw(vppVar));
        }
        int i12 = vppVar.ucs;
        if (i12 == 5 || i12 == 15 || i12 == 50) {
            com.bytedance.sdk.openadsdk.multipro.vt.ouw ouwVarLh = null;
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.multipro.vt.ouw.InterfaceC0144ouw) {
                    ouwVarLh = ((com.bytedance.sdk.openadsdk.multipro.vt.ouw.InterfaceC0144ouw) pAGNativeAd).ra();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.ouw.vt.ouw.vt) {
                    ouwVarLh = ((com.bytedance.sdk.openadsdk.ouw.vt.ouw.vt) pAGNativeAd).vt();
                }
                if (ouwVarLh != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, ouwVarLh.ouw().toString());
                }
            }
            if (ouwVar != null && ouwVar.vt() && (ouwVarLh = ouwVar.lh()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, ouwVarLh.ouw().toString());
            }
            if (ouwVarLh != null) {
                intent.putExtra("video_is_auto_play", ouwVarLh.yu);
                if (com.bytedance.sdk.component.utils.ko.yu()) {
                    com.bytedance.sdk.component.utils.ko.lh("videoDataModel", "videoDataModel=" + ouwVarLh.ouw().toString());
                }
            }
        }
        return intent;
    }

    private static String ouw(com.bytedance.sdk.openadsdk.core.model.ryl rylVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (!TextUtils.isEmpty(rylVar.vt)) {
            return rylVar.vt;
        }
        return ouw(vppVar);
    }

    public static boolean ouw(Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, Map<String, Object> map) {
        if (vppVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.ryl rylVar = vppVar.f12857kn;
        if (rylVar != null && !TextUtils.isEmpty(rylVar.ouw)) {
            if (map == null) {
                map = new HashMap<>();
            }
            return com.bytedance.sdk.openadsdk.qbp.ouw.ouw.ouw.ouw(context, rylVar.ouw, vppVar, map);
        }
        yu.ouw(vppVar, str, rylVar == null ? -1 : -2, rylVar != null ? rylVar.ouw() : null);
        return false;
    }

    private static boolean ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, boolean z10) {
        if (z10 && vppVar != null && vppVar.f12868pd == 4) {
            return com.bytedance.sdk.openadsdk.core.model.od.vt(vppVar);
        }
        return false;
    }
}
