package com.bytedance.sdk.openadsdk.yu;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.ra.vt.lh;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.jae;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.fak;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.ironsource.C3426d4;
import com.ironsource.C3605n2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.safedk.android.internal.partials.PangleVideoBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class lh {
    public static void fkw(vpp vppVar, final com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar, final String str) {
        ouw(System.currentTimeMillis(), vppVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.30
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", ouwVar.ouw);
                    jSONObject.put("current_url_index", ouwVar.vt);
                    jSONObject.put("arbi_start_x", ouwVar.f13312lh);
                    jSONObject.put("arbi_start_y", ouwVar.yu);
                    jSONObject.put("click_duration", ouwVar.fkw);
                    jSONObject.put("is_trigger_jump", ouwVar.f13311le);
                    jSONObject.put("click_type", String.valueOf(ouwVar.zih));
                } catch (Throwable th2) {
                    qbp.yu("TTAD.AdEvent", "onWebBehaviorClick", th2.getMessage());
                }
                com.bytedance.sdk.component.utils.ko.ouw("_arbitrage_event", "onWebBehaviorClick-->", jSONObject, str);
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                try {
                    com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar2 = ouwVar;
                    if (ouwVar2 == null || ouwVar2.f13316vm == -1) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hit_type", ouwVar.f13316vm);
                    jSONObject.put("hit_extra", ouwVar.f13315th);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void lh(vpp vppVar, String str, final long j10) {
        ouw(System.currentTimeMillis(), vppVar, str, "load_feeling_duration", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.6
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable th2) {
                    qbp.lh("TTAD.AdEvent", th2.getMessage());
                }
                com.bytedance.sdk.component.utils.ko.ouw("TTAD.AdEvent", "onLpFeelingDuration -->", jSONObject.toString());
                return jSONObject;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject vt(vpp vppVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (od.vt(vppVar)) {
            try {
                jSONObject.put("is_new_playable", 1);
            } catch (Throwable th2) {
                qbp.yu(th2.getMessage(), new Object[0]);
            }
        }
        ouw(jSONObject);
        return jSONObject;
    }

    public static void yu(final vpp vppVar, final String str, final int i10) {
        ouw(System.currentTimeMillis(), vppVar, str, "material_status", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.13
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trigger_type", i10);
                    jSONObject.put("image_mode", vppVar.ucs);
                    com.bytedance.sdk.component.utils.ko.ouw("onMaterialStatus", "report onMaterialStatus, ad_extra_data is:", jSONObject, str);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.vt("TTAD.AdEvent", th2.toString());
                }
                return jSONObject;
            }
        });
    }

    public static void fkw(vpp vppVar, String str, final JSONObject jSONObject) {
        ouw(System.currentTimeMillis(), vppVar, str, "click_next_ad_button", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.46
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                return jSONObject;
            }
        });
    }

    public static void lh(vpp vppVar, String str, final int i10) {
        ouw(System.currentTimeMillis(), vppVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.8
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.cf.vt().cf());
                } catch (Throwable th2) {
                    qbp.yu(th2.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    @WorkerThread
    public static void ouw() {
        try {
            Class.forName(lh.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void yu(vpp vppVar, final com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar, final String str) {
        ouw(System.currentTimeMillis(), vppVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.29
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", ouwVar.ouw);
                    jSONObject.put("current_url_index", ouwVar.vt);
                    jSONObject.put("trigger_scroll_x", ouwVar.f13313ra);
                    jSONObject.put("trigger_scroll_y", ouwVar.pno);
                    jSONObject.put("arbi_offset_y", ouwVar.bly);
                    jSONObject.put("scroll_type", ouwVar.tlj);
                    jSONObject.put("scroll_duration", ouwVar.f13308cf);
                } catch (Throwable th2) {
                    qbp.yu("TTAD.AdEvent", "onWebBehaviorScroll", th2.getMessage());
                }
                com.bytedance.sdk.component.utils.ko.ouw("_arbitrage_event", "onWebBehaviorScroll-->", jSONObject, str);
                return jSONObject;
            }
        });
    }

    public static class ouw {
        public static void ouw(final int i10, final int i11, vpp vppVar) {
            String strOuw = uoy.ouw(vppVar);
            if (strOuw == null) {
                return;
            }
            lh.ouw(System.currentTimeMillis(), vppVar, strOuw + "_landingpage", "local_res_hit_rate", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.ouw.2
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject lh() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("all_times", i11);
                        jSONObject.put("hit_times", i10);
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                    }
                    return jSONObject;
                }
            });
        }

        public static void ouw(final long j10, final vpp vppVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            lh.ouw(System.currentTimeMillis(), vppVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.ouw.3
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject lh() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        com.bytedance.sdk.openadsdk.ra.vt.ouw();
                        int iOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(iLoader, str2);
                        jSONObject.put("url", vppVar.osn);
                        jSONObject.put("channel_name", vppVar.f12856ki);
                        jSONObject.put("interceptor_status", (TextUtils.isEmpty(vppVar.f12856ki) || iOuw <= 0) ? 0 : 1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("resource_count", iOuw);
                        jSONObject.put("resource_info", jSONObject2);
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject ouw() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(vpp.f12840lh, vppVar.zin() ? 1 : 0);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject vt() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", j10);
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                    }
                    return jSONObject;
                }
            });
        }

        public static void ouw(final int i10, final int i11, final int i12, final int i13, final vpp vppVar, String str, final int i14) {
            if (str == null || TextUtils.isEmpty(vppVar.f12856ki)) {
                return;
            }
            lh.ouw(System.currentTimeMillis(), vppVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.ouw.4
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject lh() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("next_url", vppVar.osn);
                        jSONObject.put("channel_name", vppVar.f12856ki);
                        jSONObject.put("preload_status", i10 <= 0 ? 0 : 2);
                        jSONObject.put("first_page", i14);
                        jSONObject.put("preload_h5_type", vppVar.gls);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("channel_response", i10);
                        jSONObject2.put("failResourceCount", i11);
                        jSONObject2.put("successCount", i12);
                        jSONObject2.put("failCount", i13);
                        jSONObject.put("resource_info", jSONObject2);
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void le(vpp vppVar, String str, final JSONObject jSONObject) {
        ouw(System.currentTimeMillis(), vppVar, str, "click_playable_button", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.47
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                return jSONObject;
            }
        });
    }

    public static void lh(final vpp vppVar, String str) {
        if (vppVar == null || !vpp.lh(vppVar) || vppVar.upp == null) {
            return;
        }
        ouw(System.currentTimeMillis(), vppVar, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.25
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", vppVar.upp.f12650lh);
                    jSONObject.putOpt("id", vppVar.upp.ouw);
                    jSONObject.putOpt("md5", vppVar.upp.vt);
                    com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f12874sd;
                    if (vtVar != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(vtVar.ryl));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ouw(vpp vppVar, String str, final int i10) {
        ouw(System.currentTimeMillis(), vppVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.1
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("preload_status", Integer.valueOf(i10));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void yu(vpp vppVar, String str, final JSONObject jSONObject) {
        ouw(System.currentTimeMillis(), vppVar, str, "show_next_ad_hint", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.45
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                return jSONObject;
            }
        });
    }

    public static void ouw(final vpp vppVar, String str) {
        ouw(System.currentTimeMillis(), vppVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.12
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (vpp.lh(vppVar)) {
                        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = vppVar.upp;
                        if (ouwVar != null) {
                            jSONObject.putOpt("url", ouwVar.f12650lh);
                            jSONObject.putOpt("id", vppVar.upp.ouw);
                            jSONObject.putOpt("md5", vppVar.upp.vt);
                        }
                        if (vppVar.f12874sd != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", vppVar.f12874sd.pno);
                        jSONObject.putOpt("style_id", vppVar.f12853jf);
                        if (vppVar.f12874sd != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                } catch (Exception e10) {
                    qbp.yu(e10.getMessage(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void ouw(final vpp vppVar, String str, final long j10) {
        ouw(System.currentTimeMillis(), vppVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.22
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (vpp.lh(vppVar)) {
                        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = vppVar.upp;
                        if (ouwVar != null) {
                            jSONObject.putOpt("url", ouwVar.f12650lh);
                            jSONObject.putOpt("id", vppVar.upp.ouw);
                            jSONObject.putOpt("md5", vppVar.upp.vt);
                        }
                        if (vppVar.f12874sd != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", vppVar.f12874sd.pno);
                        jSONObject.putOpt("style_id", vppVar.f12853jf);
                        if (vppVar.f12874sd != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                } catch (Exception e10) {
                    qbp.yu(e10.getMessage(), new Object[0]);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void lh(vpp vppVar, final com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar, final String str) {
        ouw(System.currentTimeMillis(), vppVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.28
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", ouwVar.ouw);
                    jSONObject.put("current_url_index", ouwVar.vt);
                    jSONObject.put("arbi_stay_duration", ouwVar.ryl);
                    jSONObject.put("browsing_percentage", new BigDecimal(ouwVar.mwh).setScale(3, RoundingMode.HALF_UP));
                    jSONObject.put("out_focus_scene", ouwVar.f13309jg);
                } catch (Throwable th2) {
                    qbp.yu("TTAD.AdEvent", "onWebBehaviorStay", th2.getMessage());
                }
                com.bytedance.sdk.component.utils.ko.ouw("_arbitrage_event", "onWebBehaviorStay-->", jSONObject, str);
                return jSONObject;
            }
        });
    }

    public static void ouw(final vpp vppVar, String str, final long j10, final int i10, final String str2, final String str3) {
        ouw(System.currentTimeMillis(), vppVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.32
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (vpp.lh(vppVar)) {
                        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = vppVar.upp;
                        if (ouwVar != null) {
                            jSONObject.putOpt("url", ouwVar.f12650lh);
                            jSONObject.putOpt("id", vppVar.upp.ouw);
                            jSONObject.putOpt("md5", vppVar.upp.vt);
                        }
                        if (vppVar.f12874sd != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", vppVar.f12874sd.pno);
                        jSONObject.putOpt("style_id", vppVar.f12853jf);
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.putOpt("error_url", str3);
                        }
                        if (vppVar.f12874sd != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_msg", str2);
                } catch (Exception e10) {
                    qbp.yu(e10.getMessage(), new Object[0]);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void vt(vpp vppVar, String str, final long j10) {
        if (vppVar != null && j10 > 0 && j10 < 200000) {
            ouw(System.currentTimeMillis(), vppVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.3
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject lh() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j10);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void lh(vpp vppVar, String str, String str2, final JSONObject jSONObject) {
        if (vppVar == null || jSONObject == null) {
            return;
        }
        ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.35
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                return jSONObject;
            }
        });
    }

    public static void ouw(final vpp vppVar, String str, final long j10, final int i10, final int i11) {
        ouw(System.currentTimeMillis(), vppVar, str, "load", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.43
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("interaction_method", Integer.valueOf(vppVar.bs));
                    jSONObject.put("first_page", i11);
                    jSONObject.put("preload_h5_type", vppVar.gls);
                    int i12 = i10;
                    if (i12 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i12));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", Math.min(j10, 600000L));
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void vt(vpp vppVar, String str, final int i10) {
        ouw(System.currentTimeMillis(), vppVar, str, "check_meta", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.7
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.cf.vt().cf());
                } catch (Throwable th2) {
                    qbp.yu(th2.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void lh(vpp vppVar, String str, JSONObject jSONObject) {
        if (vppVar == null) {
            return;
        }
        ouw(vppVar, str, -1L, jSONObject);
    }

    public static void ouw(String str, vpp vppVar, String str2, final Map<String, Object> map) {
        ouw(System.currentTimeMillis(), vppVar, str2, str, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.48
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                try {
                    if (map == null) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    public static void vt(final vpp vppVar, String str) {
        ouw(System.currentTimeMillis(), vppVar, str, "picture_click", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.14
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", vppVar.uoy());
                    jSONObject.put("interaction_method", vppVar.bs);
                } catch (Throwable th2) {
                    qbp.yu(th2.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void ouw(long j10, vpp vppVar, String str, String str2, final JSONObject jSONObject) {
        ouw(j10, vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.49
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                return jSONObject;
            }
        });
    }

    public static void vt(vpp vppVar, String str, String str2, final JSONObject jSONObject) {
        ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.18
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void ouw(vpp vppVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        ouw(vppVar, C3605n2.f30216v, str, jSONObject, jSONObject2);
    }

    public static void vt(final long j10, final vpp vppVar, String str, final String str2) {
        ouw(System.currentTimeMillis(), vppVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.24
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (vpp.lh(vppVar)) {
                        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = vppVar.upp;
                        if (ouwVar != null) {
                            jSONObject.putOpt("url", ouwVar.f12650lh);
                            jSONObject.putOpt("id", vppVar.upp.ouw);
                            jSONObject.putOpt("md5", vppVar.upp.vt);
                        }
                        jSONObject.putOpt(TypedValues.TransitionType.S_FROM, str2);
                        if (vppVar.f12874sd != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.put("url", vppVar.f12874sd.pno);
                        jSONObject.put("style_id", vppVar.f12853jf);
                        if (vppVar.f12874sd != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                } catch (Exception e10) {
                    qbp.yu(e10.getMessage(), new Object[0]);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Exception e10) {
                    qbp.yu(e10.getMessage(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    private static void ouw(final vpp vppVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (vppVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (vppVar.bu && C3605n2.f30216v.equals(str)) {
            return;
        }
        if (C3605n2.f30216v.equals(str)) {
            vppVar.bu = true;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ouw(new com.bytedance.sdk.component.pno.pno("onShow") { // from class: com.bytedance.sdk.openadsdk.yu.lh.50
            @Override // java.lang.Runnable
            public final void run() {
                final String strOuw;
                if (com.bytedance.sdk.openadsdk.core.zih.yu().pno.ouw("bus_con_adshow_check_enable", true)) {
                    int iFqk = vppVar.fqk();
                    com.bytedance.sdk.openadsdk.core.tlj.ouw.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.core.tlj.ouw.ouw.ouw((Application) com.bytedance.sdk.openadsdk.core.zih.ouw());
                    String str3 = str2;
                    long jOuw = DeviceUtils.ouw();
                    com.bytedance.sdk.openadsdk.core.tlj.ouw.vt vtVar = ouwVarOuw.ouw;
                    if (vtVar != null) {
                        strOuw = vtVar.ouw(str3, jOuw, iFqk);
                    } else {
                        strOuw = "null";
                    }
                } else {
                    strOuw = "none";
                }
                lh.ouw(jCurrentTimeMillis, vppVar, str2, str, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.50.1
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject lh() {
                        try {
                            AnonymousClass50 anonymousClass50 = AnonymousClass50.this;
                            JSONObject jSONObject3 = jSONObject;
                            if (jSONObject3 == null) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("interaction_method", vppVar.bs);
                                jSONObject4.put("real_interaction_method", vppVar.fvf);
                                com.bytedance.sdk.openadsdk.core.zih.yu();
                                jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.settings.cf.bly(String.valueOf(vppVar.fqk())));
                                jSONObject4.put("au_show", strOuw);
                                return jSONObject4;
                            }
                            jSONObject3.put("interaction_method", vppVar.bs);
                            AnonymousClass50 anonymousClass51 = AnonymousClass50.this;
                            jSONObject.put("real_interaction_method", vppVar.fvf);
                            JSONObject jSONObject5 = jSONObject;
                            com.bytedance.sdk.openadsdk.core.zih.yu();
                            jSONObject5.put("video_skip_result", com.bytedance.sdk.openadsdk.core.settings.cf.bly(String.valueOf(vppVar.fqk())));
                            jSONObject.put("au_show", strOuw);
                            return jSONObject;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() {
                        AnonymousClass50 anonymousClass50 = AnonymousClass50.this;
                        JSONObject jSONObject3 = jSONObject2;
                        return jSONObject3 == null ? lh.vt(vppVar, new JSONObject()) : lh.vt(vppVar, jSONObject3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject vt() {
                        Object obj;
                        try {
                            jae.ouw(vppVar);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.putOpt("log_extra", vppVar.yhj);
                                float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - vpp.ouw(vppVar.fak())).floatValue();
                                if (fFloatValue <= 0.0f) {
                                    fFloatValue = 0.0f;
                                }
                                jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                                jSONObject3.putOpt("ua_policy", Integer.valueOf(vppVar.f12884vi));
                                String str4 = vppVar.ehk;
                                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str4)) {
                                    try {
                                        jSONObject3.put("ttdsp_price", Math.round(Float.parseFloat(str4) * 100000.0f));
                                    } catch (Throwable th2) {
                                        jSONObject3.put("ttdsp_price", 0);
                                        qbp.lh("TTAD.AdEvent", th2.getMessage());
                                    }
                                }
                                Map<String, Object> map = vppVar.npr;
                                if (map == null) {
                                    return jSONObject3;
                                }
                                try {
                                    Object obj2 = map.get(TTAdConstant.SDK_BIDDING_TYPE);
                                    if (obj2 == null || Integer.parseInt(obj2.toString()) != 2 || (obj = vppVar.npr.get("price")) == null) {
                                        return jSONObject3;
                                    }
                                    jSONObject3.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                    return jSONObject3;
                                } catch (Throwable th3) {
                                    qbp.ouw("TTAD.AdEvent", "client bidding price error: ", th3);
                                    return jSONObject3;
                                }
                                return jSONObject3;
                            } catch (Exception unused) {
                                return jSONObject3;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                });
                if (C3605n2.f30216v.equals(str)) {
                    if (!vppVar.fvf()) {
                        if (vppVar.lso()) {
                            vpp vppVar2 = vppVar;
                            com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(vppVar2.rrs, new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.vt("show_urls", vppVar2));
                        } else {
                            lh.ouw(vppVar);
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        int iOptInt = jSONObject3.optInt("dynamic_show_type");
                        if (vppVar.bly() == 1 && (iOptInt == 7 || iOptInt == 10)) {
                            int i10 = 3000;
                            int iOuw = com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw("bus_con_auto_click_delay", 3000);
                            if (iOuw > 0) {
                                i10 = iOuw;
                            }
                            com.bytedance.sdk.component.utils.bly.ouw().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.lh.50.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        jSONObject4.put("auto_click", true);
                                        AnonymousClass50 anonymousClass50 = AnonymousClass50.this;
                                        lh.vt(vppVar, str2, "click", jSONObject4);
                                    } catch (Exception unused) {
                                        qbp.lh("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, i10);
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.tlj.lh.ouw(vppVar, strOuw);
                }
            }
        });
    }

    public static void vt(vpp vppVar, final com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar, final String str) {
        ouw(System.currentTimeMillis(), vppVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.27
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", ouwVar.ouw);
                    jSONObject.put("current_url_index", ouwVar.vt);
                    jSONObject.put("arbi_load_duration", ouwVar.f13314rn);
                } catch (Throwable th2) {
                    qbp.yu("TTAD.AdEvent", "onWebBehaviorLoad", th2.getMessage());
                }
                com.bytedance.sdk.component.utils.ko.ouw("_arbitrage_event", "onWebBehaviorLoad-->", jSONObject, str);
                return jSONObject;
            }
        });
    }

    public static void vt(vpp vppVar, String str, String str2, final JSONObject jSONObject, final long j10) {
        if (jSONObject == null) {
            return;
        }
        ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.34
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void vt(vpp vppVar, String str, final JSONObject jSONObject) {
        ouw(System.currentTimeMillis(), vppVar, str, vt.f13585le, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.37
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                return jSONObject;
            }
        });
    }

    public static void vt(vpp vppVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        ouw(vppVar, "activity_recreate", str, jSONObject, jSONObject2);
    }

    public static void vt(vpp vppVar, String str, int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        vt(vppVar, str, "download_app_ad_track", jSONObject);
    }

    private static void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectOuw = pno.ouw();
            if (jSONObjectOuw != null) {
                Iterator<String> itKeys = jSONObjectOuw.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectOuw.get(next));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void ouw(vpp vppVar) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.ryl.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(com.bytedance.sdk.openadsdk.tc.ouw.ouw(vppVar.rrs), 1, vppVar.pv);
    }

    public static void ouw(final vpp vppVar, final String str, final fak fakVar) {
        if (vppVar == null) {
            return;
        }
        final long jLh = fakVar.lh();
        ouw(System.currentTimeMillis(), vppVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.2
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", jLh);
                    jSONObject.put("click_time", fakVar.ouw);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", vppVar.ra() ? 1 : 0);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ouw(vpp vppVar, final String str, final int i10, final String str2, final long j10, final boolean z10, final int i11, final long j11) {
        ouw(System.currentTimeMillis(), vppVar, str, vt.yu, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.4
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j10);
                    jSONObject.put("arbi_trigger_start", z10);
                    jSONObject.put("arbi_convert_count", i11);
                    jSONObject.put("loading_start_timestamp", j11);
                } catch (Throwable th2) {
                    qbp.yu(th2.toString(), new Object[0]);
                }
                com.bytedance.sdk.component.utils.ko.ouw("arbitrage_style", "-->onArbitrageLoading", jSONObject, str);
                return jSONObject;
            }
        });
    }

    public static void ouw(vpp vppVar, String str, final long j10, final boolean z10) {
        ouw(System.currentTimeMillis(), vppVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.5
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z10 ? 1 : 2);
                } catch (Throwable th2) {
                    qbp.yu(th2.toString(), new Object[0]);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable th2) {
                    qbp.yu(th2.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void ouw(vpp vppVar, String str, final int i10, final String str2, final int i11) {
        ouw(System.currentTimeMillis(), vppVar, str, vt.ouw, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.9
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("new_index", i11);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ouw(vpp vppVar, final String str, final int i10, final String str2, final float f10) {
        ouw(System.currentTimeMillis(), vppVar, str, vt.vt, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.10
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f10);
                } catch (Throwable th2) {
                    qbp.yu(th2.toString(), new Object[0]);
                }
                com.bytedance.sdk.component.utils.ko.ouw("arbitrage_event", "-->onArbitrageLoadFinish", jSONObject, str);
                return jSONObject;
            }
        });
    }

    public static void ouw(vpp vppVar, final String str, final int i10, final String str2, final String str3, final int i11) {
        ouw(System.currentTimeMillis(), vppVar, str, vt.f13586lh, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.11
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, str3);
                    jSONObject.put("url_flag", i11);
                } catch (Throwable th2) {
                    qbp.yu(th2.toString(), new Object[0]);
                }
                com.bytedance.sdk.component.utils.ko.ouw("arbitrage_event", "-->onArbitrageLoadUrl", jSONObject, str);
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void ouw(final String str, final vpp vppVar, final com.bytedance.sdk.openadsdk.core.model.cf cfVar, final String str2, final boolean z10, final Map<String, Object> map, final int i10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ouw(new com.bytedance.sdk.component.pno.pno("onClick") { // from class: com.bytedance.sdk.openadsdk.yu.lh.15
            @Override // java.lang.Runnable
            public final void run() {
                vpp vppVar2 = vppVar;
                if (vppVar2 == null) {
                    return;
                }
                lh.ouw(jCurrentTimeMillis, vppVar2, str2, str, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.15.1
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject vt() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.cf cfVar2 = cfVar;
                            if (cfVar2 != null) {
                                JSONObject jSONObjectOuw = cfVar2.ouw();
                                jSONObjectOuw.put("is_valid", z10);
                                int i11 = i10;
                                if (i11 > 0 && i11 <= 2) {
                                    jSONObjectOuw.put("user_behavior_type", i11);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey("duration")) {
                                        jSONObject.put("duration", map.get("duration"));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!"duration".equals(entry.getKey())) {
                                            jSONObjectOuw.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                jSONObjectOuw.put("interaction_method", vppVar.bs);
                                if (str2.equals("open_ad")) {
                                    jSONObjectOuw.put("is_icon_only", vppVar.ra() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", jSONObjectOuw.toString());
                            }
                            jSONObject.putOpt("log_extra", vppVar.yhj);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - vpp.ouw(vppVar.fak())).floatValue();
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(fFloatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(vppVar.f12884vi));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.ryl.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw())) && "click".equals(str)) {
                    com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(com.bytedance.sdk.openadsdk.tc.ouw.ouw(vppVar.jvy), 2, vppVar.pv);
                }
                if ("click".equals(str)) {
                    jae.vt(vppVar);
                }
            }
        });
    }

    public static void ouw(vpp vppVar, String str, String str2, final JSONObject jSONObject) {
        ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.16
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (jSONObject.has("duration")) {
                        jSONObject2.put("duration", jSONObject.get("duration"));
                    }
                } catch (Exception e10) {
                    qbp.lh("TTAD.AdEvent", e10.getMessage());
                }
                return jSONObject2;
            }
        });
        if ("click".equals(str2)) {
            jae.vt(vppVar);
        }
    }

    public static void ouw(vpp vppVar, String str, final String str2, final long j10, final int i10, JSONObject jSONObject, final ra raVar) {
        final JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.17
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                ra raVar2;
                try {
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (raVar2 = raVar) != null) {
                        raVar2.ouw(jSONObject2);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("duration", j10);
                    jSONObject3.put("percent", i10);
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }
        });
    }

    public static void ouw(vpp vppVar, String str, String str2, final JSONObject jSONObject, final long j10) {
        ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.19
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j10);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void ouw(final vpp vppVar, String str, String str2, final Map<String, Object> map) {
        ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.20
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("dp_creative_type", vppVar.cy);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        Object obj = map2.get("duration");
                        if (obj instanceof Long) {
                            jSONObject.put("duration", obj);
                        }
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void ouw(long j10, vpp vppVar, String str, String str2) {
        ouw(j10, vppVar, str, str2, (com.bytedance.sdk.openadsdk.rn.lh.vt) null);
    }

    @DungeonFlag
    public static void ouw(final long j10, final vpp vppVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.rn.lh.vt vtVar) {
        if (vppVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || ouw(vppVar.cf(), str2)) {
            return;
        }
        ouw(new com.bytedance.sdk.component.pno.pno(str2) { // from class: com.bytedance.sdk.openadsdk.yu.lh.21
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.rn.lh.vt vtVar2 = vtVar;
                    if (vtVar2 != null) {
                        jSONObject = vtVar2.vt();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    com.bytedance.sdk.openadsdk.rn.lh.vt vtVar3 = vtVar;
                    if (vtVar3 != null) {
                        JSONObject jSONObjectOuw = vtVar3.ouw();
                        JSONObject jSONObjectLh = vtVar.lh();
                        if (jSONObjectOuw != null) {
                            if (jSONObjectLh == null) {
                                jSONObjectLh = new JSONObject();
                            }
                            jSONObjectLh.put("pag_json_data", jSONObjectOuw.toString());
                            jSONObject.put("ad_extra_data", jSONObjectLh.toString());
                        } else if (jSONObjectLh != null) {
                            jSONObject.put("ad_extra_data", jSONObjectLh.toString());
                        }
                    }
                    jSONObject.putOpt("log_extra", vppVar.yhj);
                    jSONObject.putOpt("ua_policy", Integer.valueOf(vppVar.f12884vi));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                com.bytedance.sdk.openadsdk.yu.ouw.C0158ouw c0158ouw = new com.bytedance.sdk.openadsdk.yu.ouw.C0158ouw(j10, vppVar);
                c0158ouw.vt = str;
                c0158ouw.f13563lh = str2;
                vpp vppVar2 = vppVar;
                c0158ouw.f13564ra = vppVar2.pv;
                c0158ouw.f13567vm = vppVar2.tlj();
                c0158ouw.ryl = vppVar.yib;
                com.bytedance.sdk.openadsdk.yu.ouw.C0158ouw c0158ouwOuw = c0158ouw.ouw(jSONObject);
                c0158ouwOuw.f13562le = vppVar.ux();
                c0158ouwOuw.ouw((com.bytedance.sdk.openadsdk.yu.vt.ouw) null);
            }
        });
    }

    public static void ouw(vpp vppVar, String str, final String str2) {
        ouw(System.currentTimeMillis(), vppVar, str, "playable_track", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.23
            public final /* synthetic */ int vt = 1;

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_event", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new_playable", 1);
                    jSONObject.put("is_pre_render", this.vt);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ouw(vpp vppVar, final com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar, final String str) {
        ouw(System.currentTimeMillis(), vppVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.26
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", ouwVar.ouw);
                    jSONObject.put("keyword", ouwVar.f13310ko);
                } catch (Throwable th2) {
                    qbp.yu("TTAD.AdEvent", "onWebBehaviorKeyword", th2.getMessage());
                }
                com.bytedance.sdk.component.utils.ko.ouw("_arbitrage_event", "onWebBehaviorKeyword-->", jSONObject, str);
                return jSONObject;
            }
        });
    }

    public static void ouw(final long j10, final vpp vppVar, String str) {
        if (vppVar == null || !vpp.lh(vppVar) || vppVar.upp == null) {
            return;
        }
        ouw(System.currentTimeMillis(), vppVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.31
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", vppVar.upp.f12650lh);
                    jSONObject.putOpt("id", vppVar.upp.ouw);
                    jSONObject.putOpt("md5", vppVar.upp.vt);
                    com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f12874sd;
                    if (vtVar != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(vtVar.ryl));
                    }
                } catch (Exception e10) {
                    qbp.yu(e10.getMessage(), new Object[0]);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Exception e10) {
                    qbp.yu(e10.getMessage(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void ouw(vpp vppVar, String str, String str2, final long j10, final JSONObject jSONObject) {
        if (vppVar == null) {
            return;
        }
        ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.33
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j10);
                } catch (Exception e10) {
                    qbp.lh("TTAD.AdEvent", e10.getMessage());
                }
                return jSONObject2;
            }
        });
    }

    public static void ouw(vpp vppVar, String str, final JSONObject jSONObject) {
        ouw(System.currentTimeMillis(), vppVar, str, vt.fkw, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.36
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void ouw(final vpp vppVar, final String str, final String str2, final String str3, final long j10, final long j11, final JSONObject jSONObject, final boolean z10) {
        if (vppVar == null || ouw(vppVar.cf(), str3)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ouw(new com.bytedance.sdk.component.pno.pno("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.yu.lh.38
            @Override // java.lang.Runnable
            public final void run() {
                JSONArray jSONArrayOptJSONArray;
                String strOptString = vppVar.yib;
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString2 = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(strOptString2)) {
                            jSONObject2 = PangleVideoBridge.jsonObjectInit(strOptString2);
                        }
                        if (!"click".equals(str3)) {
                            jSONObject2.put(C3426d4.i.G, DeviceUtils.le(com.bytedance.sdk.openadsdk.core.zih.ouw()).toString());
                        }
                        if ("click".equals(str3)) {
                            if (z10) {
                                jSONObject2.put("click_scence", 1);
                            } else if (od.vt(vppVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        try {
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pag_json_data");
                            if (jSONObjectOptJSONObject == null) {
                                jSONObjectOptJSONObject = new JSONObject();
                            }
                            jSONObjectOptJSONObject.put("is_new_playable", 1);
                            if (vppVar.wp()) {
                                jSONObjectOptJSONObject.put("is_pre_render", 1);
                            }
                            jSONObject2.put("pag_json_data", jSONObjectOptJSONObject.toString());
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        int i10 = 0;
                        if (com.bytedance.sdk.openadsdk.jg.ouw.lh(vppVar)) {
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("pag_json_data");
                            if (jSONObjectOptJSONObject2 == null) {
                                jSONObjectOptJSONObject2 = new JSONObject();
                            }
                            jSONObjectOptJSONObject2.put("is_lp_pre_render", vppVar.ucs() ? 1 : 0);
                            jSONObject2.put("pag_json_data", jSONObjectOptJSONObject2.toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int iOptInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z10 && iOptInt == 2) {
                            strOptString = jSONObject2.optString("app_log_url");
                        }
                        if ("click".equals(str3)) {
                            jae.vt(vppVar);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - vpp.vt(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.ryl.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw()))) {
                                if (z10 && iOptInt == 2) {
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i10 < jSONArrayOptJSONArray2.length()) {
                                            arrayList.add(jSONArrayOptJSONArray2.optString(i10));
                                            i10++;
                                        }
                                        com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(com.bytedance.sdk.openadsdk.tc.ouw.ouw(arrayList), 2, String.valueOf(j10));
                                    }
                                } else {
                                    vpp vppVar2 = vppVar;
                                    if (vppVar2 != null) {
                                        com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(com.bytedance.sdk.openadsdk.tc.ouw.ouw(vppVar2.jvy), 2, vppVar.pv);
                                    }
                                }
                            }
                        } else if (C3605n2.f30216v.equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.ryl.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw())) && z10 && iOptInt == 2 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i10 < jSONArrayOptJSONArray.length()) {
                                arrayList2.add(jSONArrayOptJSONArray.optString(i10));
                                i10++;
                            }
                            com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(com.bytedance.sdk.openadsdk.tc.ouw.ouw(arrayList2), 1, String.valueOf(j10));
                        }
                    } catch (Exception unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.yu.ouw.C0158ouw c0158ouw = new com.bytedance.sdk.openadsdk.yu.ouw.C0158ouw(jCurrentTimeMillis, vppVar);
                c0158ouw.yu = str;
                c0158ouw.vt = str2;
                c0158ouw.f13563lh = str3;
                c0158ouw.f13564ra = String.valueOf(j10);
                c0158ouw.pno = String.valueOf(j11);
                c0158ouw.ryl = strOptString;
                com.bytedance.sdk.openadsdk.yu.ouw.C0158ouw c0158ouwOuw = c0158ouw.ouw(jSONObject);
                c0158ouwOuw.f13567vm = vppVar.tlj();
                c0158ouwOuw.f13562le = vppVar.ux();
                c0158ouwOuw.ouw((com.bytedance.sdk.openadsdk.yu.vt.ouw) null);
            }
        });
    }

    public static void ouw(vpp vppVar, String str, final long j10, final JSONObject jSONObject) {
        ouw(System.currentTimeMillis(), vppVar, "open_ad", str, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.39
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                try {
                    JSONObject jSONObject2 = jSONObject;
                    return jSONObject2 != null ? jSONObject2 : new JSONObject();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j11 = j10;
                    if (j11 != -1) {
                        jSONObject2.put("duration", j11);
                    }
                } catch (Exception e10) {
                    qbp.lh("TTAD.AdEvent", e10.getMessage());
                }
                return jSONObject2;
            }
        });
    }

    public static void ouw(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (bs.le()) {
            com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.lh.40
                @Override // java.lang.Runnable
                public final void run() {
                    bs.vt(pnoVar, 10);
                }
            });
        } else if (!bs.ra()) {
            bs.vt(pnoVar, 10);
        } else {
            pnoVar.run();
        }
    }

    public static void ouw(JSONObject jSONObject, int i10, int i11) {
        try {
            jSONObject.put("skip_show_time", i10);
            jSONObject.put("skip_time", i11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("skip_after_time", i11 - (i10 * 1000));
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    public static void ouw(vpp vppVar, String str, int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        vt(vppVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void ouw(vpp vppVar, String str, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final int i10, final Map<String, Object> map) {
        ouw(System.currentTimeMillis(), vppVar, str, "start_show_plb", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.42
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSkip", z10);
                    jSONObject.put("force", z11);
                    jSONObject.put("isFromLandingPage", z12);
                    jSONObject.put("finishing", z13);
                    jSONObject.put(TypedValues.TransitionType.S_FROM, i10);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ouw(final vpp vppVar, final boolean z10, String str, final String str2, final long j10, final String str3, final String str4, final int i10, final String str5) {
        ouw(System.currentTimeMillis(), vppVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.44
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                pd pdVar;
                JSONObject jSONObject = new JSONObject();
                try {
                    String str6 = str4;
                    byte b10 = -1;
                    int iHashCode = str6.hashCode();
                    if (iHashCode != -1606803861) {
                        if (iHashCode != 3107) {
                            if (iHashCode == 2989536 && str6.equals("adv3")) {
                                b10 = 2;
                            }
                        } else if (str6.equals("ad")) {
                            b10 = 1;
                        }
                    } else if (str6.equals(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
                        b10 = 0;
                    }
                    if (b10 != 0) {
                        if (b10 == 1) {
                            vpp.ouw ouwVar = vppVar.f12886xn;
                            if (ouwVar != null) {
                                jSONObject.putOpt("url", ouwVar.ryl);
                                jSONObject.putOpt("id", ouwVar.ouw);
                                jSONObject.putOpt("md5", ouwVar.mwh);
                            }
                        } else if (b10 == 2 && (pdVar = vppVar.lht) != null) {
                            jSONObject.putOpt("url", pdVar.f12797lh);
                            jSONObject.putOpt("id", pdVar.ouw);
                            jSONObject.putOpt("md5", pdVar.vt);
                        }
                    } else if (z10) {
                        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar2 = vppVar.nit;
                        if (ouwVar2 != null) {
                            jSONObject.putOpt("url", ouwVar2.f12650lh);
                            jSONObject.putOpt("id", ouwVar2.ouw);
                            jSONObject.putOpt("md5", ouwVar2.vt);
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar3 = vppVar.upp;
                        if (ouwVar3 != null) {
                            jSONObject.putOpt("url", ouwVar3.f12650lh);
                            jSONObject.putOpt("id", ouwVar3.ouw);
                            jSONObject.putOpt("md5", ouwVar3.vt);
                        }
                    }
                    jSONObject.put("ugen_status", str2);
                    jSONObject.put(TypedValues.TransitionType.S_FROM, str3);
                    jSONObject.put("ugen_scene", str4);
                    if (C3426d4.g.f28496e.equals(str2)) {
                        jSONObject.put("error_code", i10);
                        jSONObject.put("error_msg", str5);
                    }
                } catch (Throwable th2) {
                    try {
                        jSONObject.put("error_code", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
                        jSONObject.put("error_msg", "send template error " + th2.getMessage());
                    } catch (Throwable unused) {
                    }
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    private static boolean ouw(int i10, String str) {
        Integer num;
        try {
            Set set = (Set) com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw("perf_con_drop2rt_skip_label_list", Collections.emptySet(), com.bytedance.sdk.openadsdk.core.settings.fkw.vt);
            if (i10 == 1 && set != null && set.contains(str)) {
                return true;
            }
            com.bytedance.sdk.openadsdk.core.settings.cf cfVarVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt();
            Map map = (Map) cfVarVt.pno.ouw("perf_con_applog_rate", null, cfVarVt.f13056ko);
            int iIntValue = (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) ? 100 : num.intValue();
            if (iIntValue == 0) {
                return true;
            }
            return iIntValue != 100 && ((int) ((Math.random() * 100.0d) + 1.0d)) > iIntValue;
        } catch (Throwable th2) {
            qbp.lh("TTAD.AdEvent", th2.getMessage());
            return false;
        }
    }

    public static JSONObject ouw(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_show_order", i10);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @DungeonFlag
    public static void ouw(final String str, final vpp vppVar, final String str2, final ra raVar) {
        if (vppVar == null || raVar == null) {
            return;
        }
        if (raVar.ouw > 0) {
            ouw(System.currentTimeMillis(), vppVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.51
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject lh() {
                    try {
                        ra raVar2 = raVar;
                        if (raVar2 != null && raVar2.ouw((JSONObject) null) != null) {
                            JSONObject jSONObjectOuw = raVar.ouw((JSONObject) null);
                            if (str2.equals("open_ad")) {
                                jSONObjectOuw.put("is_icon_only", vppVar.ra() ? 1 : 0);
                            }
                            return jSONObjectOuw;
                        }
                    } catch (Throwable unused) {
                    }
                    return null;
                }

                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject vt() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", str);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void ouw(String str, long j10) {
        JSONObject jSONObjectOuw = com.bytedance.sdk.openadsdk.core.pno.vt.ouw(str, j10);
        com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
        yuVarOuw.ouw(uoy.vt("/api/ad/union/sdk/stats/"));
        yuVarOuw.lh(jSONObjectOuw.toString());
        yuVarOuw.f11911ra = 6;
        yuVarOuw.f11910le = "uploadFrequentEvent";
        yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.pno.vt.1
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(lh lhVar, IOException iOException) {
                ko.lh("uploadFrequentEvent", iOException.getMessage());
                if (lhVar != null) {
                    zin.ouw(lhVar.fkw());
                }
            }
        });
    }

    public static void ouw(final com.bytedance.sdk.openadsdk.rn.ouw.vt vtVar) {
        final vpp vppVar;
        vpp vppVar2;
        if (vtVar == null || (vppVar = vtVar.vt) == null) {
            return;
        }
        final int i10 = vppVar.f12868pd;
        if (i10 == 2 || i10 == 8 || (uoy.yu(vppVar) && vt.ouw.yu.equals(vtVar.ouw))) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (TextUtils.isEmpty(vtVar.f13318lh) && (vppVar2 = vtVar.vt) != null) {
                vtVar.f13318lh = uoy.ouw(vppVar2);
            }
            ouw(jCurrentTimeMillis, vppVar, vtVar.f13318lh, "open_browser", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.41
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject lh() {
                    JSONArray jSONArrayOptJSONArray;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int i11 = vtVar.yu;
                        jSONObject.put("count", uoy.le(com.bytedance.sdk.openadsdk.core.zih.ouw()));
                        jSONObject.put("interceptor", i11);
                        jSONObject.put("success", vtVar.fkw);
                        jSONObject.put("link", vtVar.ouw);
                        jSONObject.put("interaction_type", i10);
                        jSONObject.put("real_interaction_type", vtVar.f13319ra);
                        com.bytedance.sdk.openadsdk.rn.ouw.vt vtVar2 = vtVar;
                        if (vtVar2.yu == 9) {
                            jSONObject.put("is_act_signals_api_available", vtVar2.pno);
                            jSONObject.put("is_act_signals_callback", vtVar.bly);
                        }
                        if (!TextUtils.isEmpty(vtVar.f13317le)) {
                            jSONObject.put("exception_msg", vtVar.f13317le);
                        }
                        if (i11 == 2 || i11 == 5) {
                            String str = vppVar.f12843bo;
                            if (!TextUtils.isEmpty(str) && (jSONArrayOptJSONArray = PangleVideoBridge.jsonObjectInit(str).optJSONArray("creatives")) != null && jSONArrayOptJSONArray.length() > 0) {
                                jSONObject.put("meta", jSONArrayOptJSONArray.optJSONObject(vppVar.jqy));
                            }
                        }
                        com.bytedance.sdk.component.utils.ko.vt("sa_open_browser", jSONObject.toString());
                    } catch (Throwable th2) {
                        qbp.lh("TTAD.AdEvent", th2.getMessage());
                    }
                    return jSONObject;
                }
            });
        }
    }
}
