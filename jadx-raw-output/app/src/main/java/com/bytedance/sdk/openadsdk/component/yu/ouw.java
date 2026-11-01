package com.bytedance.sdk.openadsdk.component.yu;

import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.uq;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.fak;
import com.bytedance.sdk.openadsdk.yu.lh;
import com.ironsource.C3605n2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw {
    public static void ouw(vpp vppVar, int i10, int i11, float f10) {
        JSONObject jSONObject = new JSONObject();
        try {
            ouw(jSONObject, vppVar);
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f10);
            lh.ouw(jSONObject, i11, i10);
        } catch (JSONException e10) {
            qbp.ouw("TTAppOpenAdReport", "reportSkip json error", e10);
        }
        lh.ouw(vppVar, "skip", i10, jSONObject);
    }

    public static void vt(vpp vppVar, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", vppVar.f12874sd.f10458lh);
            jSONObject.put("video_duration", vppVar.f12874sd.yu);
            jSONObject.put(C3605n2.f30215u, z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        lh.ouw(vppVar, "download_video_duration", j10, jSONObject);
    }

    public static void ouw(vpp vppVar, long j10, float f10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            ouw(jSONObject, vppVar);
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
            if (z10) {
                double d10 = f10;
                jSONObject.put("video_duration", d10);
                jSONObject.put("video_percent", (int) (((j10 * 1.0d) / 10.0d) / d10));
            } else {
                jSONObject.put("image_duration", f10);
            }
        } catch (JSONException e10) {
            qbp.ouw("TTAppOpenAdReport", "reportDestroy json error", e10);
        }
        lh.lh(vppVar, "destroy", jSONObject);
    }

    public static void ouw(vpp vppVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e10) {
            qbp.ouw("TTAppOpenAdReport", "reportCacheLoss json error", e10);
        }
        lh.lh(vppVar, "cache_loss", jSONObject);
    }

    public static void ouw(vpp vppVar, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C3605n2.f30215u, z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        lh.ouw(vppVar, "download_image_duration", j10, jSONObject);
    }

    public static void ouw(vpp vppVar, int i10, uq uqVar) {
        JSONObject jSONObject = new JSONObject();
        long j10 = 0;
        try {
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i10);
            if (uqVar != null) {
                uqVar.ouw(fak.ouw());
                ouw(jSONObject, vppVar);
                jSONObject.put("client_start_time", uqVar.vt);
                jSONObject.put("sever_time", uqVar.yu);
                jSONObject.put("network_time", uqVar.f12835lh);
                jSONObject.put("client_end_time", uqVar.fkw);
                jSONObject.put("download_resource_duration", uqVar.f12836ra);
                jSONObject.put("resource_source", uqVar.pno);
                jSONObject.put("is_bidding", uqVar.bly ? 1 : 0);
                if (uqVar.bly) {
                    jSONObject.put("load_wait_time", uqVar.tlj);
                }
                j10 = uqVar.f12834le;
            }
        } catch (JSONException e10) {
            qbp.ouw("TTAppOpenAdReport", "reportLoadNetDuration json error", e10);
        }
        lh.ouw(vppVar, "load_net_duration", j10, jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static void ouw(JSONObject jSONObject, vpp vppVar) {
        int i10;
        if (vppVar != null) {
            try {
                if (vppVar.ra()) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            } catch (JSONException e10) {
                qbp.lh("TTAppOpenAdReport", e10.getMessage());
                return;
            }
        } else {
            i10 = 0;
        }
        jSONObject.put("is_icon_only", i10);
    }
}
