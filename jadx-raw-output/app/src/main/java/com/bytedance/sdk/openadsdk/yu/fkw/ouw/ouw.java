package com.bytedance.sdk.openadsdk.yu.fkw.ouw;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.fkw;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.jg;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.le;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.mwh;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.pno;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw {
    private static final Map<com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw, ko> ouw = Collections.synchronizedMap(new WeakHashMap());

    public static com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouw(vpp vppVar, String str, lh lhVar) {
        return ouw(vppVar, str, -1, lhVar);
    }

    public static void vt(com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw("load_video_cancel", ouwVar);
    }

    public static void fkw(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2) {
        if (ouwVar == null || ouwVar2 == null) {
            return;
        }
        if (ouwVar2.ryl <= 0) {
            com.bytedance.sdk.component.utils.ko.lh("TTAD.VideoEventManager", "Cancel log report when buffer count is 0");
            return;
        }
        ko koVar = ouw.get(ouwVar);
        if (koVar == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.f13479lh;
        mwh mwhVar = new mwh();
        mwhVar.ouw = ouwVar2.vt;
        mwhVar.f13482lh = j10;
        mwhVar.vt = ouwVar2.ryl;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f13475lh, lhVar);
        ouwVarOuw.f13484lh = mwhVar;
        ouwVarOuw.yu = ouwVar2.mwh;
        ouw(ouwVarOuw, "play_buffer", (JSONObject) null, (ra) null);
    }

    public static void lh(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2) {
        ko koVar;
        if (ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f13479lh;
        jg jgVar = new jg(ouwVar2.f13477jg);
        jgVar.ouw = ouwVar2.vt;
        jgVar.vt = j11;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f13475lh, lhVar);
        ouwVarOuw.f13484lh = jgVar;
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "play_error", jSONObject, (ra) null);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001a, B:14:0x0045, B:15:0x0048, B:17:0x0055, B:19:0x0062, B:20:0x0068, B:22:0x006e, B:23:0x0073), top: B:28:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001a, B:14:0x0045, B:15:0x0048, B:17:0x0055, B:19:0x0062, B:20:0x0068, B:22:0x006e, B:23:0x0073), top: B:28:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001a, B:14:0x0045, B:15:0x0048, B:17:0x0055, B:19:0x0062, B:20:0x0068, B:22:0x006e, B:23:0x0073), top: B:28:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001a, B:14:0x0045, B:15:0x0048, B:17:0x0055, B:19:0x0062, B:20:0x0068, B:22:0x006e, B:23:0x0073), top: B:28:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016 A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001a, B:14:0x0045, B:15:0x0048, B:17:0x0055, B:19:0x0062, B:20:0x0068, B:22:0x006e, B:23:0x0073), top: B:28:0x0008 }] */
    private static com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouw(vpp vppVar, String str, int i10, lh lhVar) {
        vt vtVar;
        int i11;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectJsonObjectInit = null;
        if (i10 > 0) {
            try {
                jSONObject.put("play_type", String.valueOf(i10));
                if (vppVar != null) {
                    vtVar = vppVar.f12874sd;
                    if (vtVar != null) {
                        jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, vtVar.fkw);
                        jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(vtVar.f10458lh));
                        jSONObject.put("video_url", vtVar.f10459ra);
                        jSONObject.put("player_type", lhVar.f10449rn);
                        if (lhVar.le()) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        jSONObject.put("video_encode_type", i11);
                    }
                    jSONObject.put("play_time", lhVar.jqy);
                    jSONObjectJsonObjectInit = lhVar.ouw() ? PangleVideoBridge.jsonObjectInit(lhVar.ex.toString()) : null;
                    if (jSONObjectJsonObjectInit == null) {
                        jSONObjectJsonObjectInit = new JSONObject();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        jSONObjectJsonObjectInit.put("session_id", str);
                    }
                    jSONObject.put("dp_creative_type", vppVar.cy);
                }
            } catch (JSONException e10) {
                qbp.ouw("TTAD.VideoEventManager", "", e10);
            }
        } else if (vppVar != null) {
            vtVar = vppVar.f12874sd;
            if (vtVar != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, vtVar.fkw);
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(vtVar.f10458lh));
                jSONObject.put("video_url", vtVar.f10459ra);
                jSONObject.put("player_type", lhVar.f10449rn);
                if (lhVar.le()) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                jSONObject.put("video_encode_type", i11);
            }
            jSONObject.put("play_time", lhVar.jqy);
            if (lhVar.ouw()) {
            }
            if (jSONObjectJsonObjectInit == null) {
                jSONObjectJsonObjectInit = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObjectJsonObjectInit.put("session_id", str);
            }
            jSONObject.put("dp_creative_type", vppVar.cy);
        }
        return new com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw(vppVar, uoy.ouw(vppVar), jSONObject, jSONObjectJsonObjectInit);
    }

    public static void vt(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2) {
        ko koVar;
        if (ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f13479lh;
        if (j11 <= 0 || j10 <= 0) {
            return;
        }
        fkw fkwVar = new fkw();
        fkwVar.ouw = ouwVar2.vt;
        fkwVar.vt = j11;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f13475lh, lhVar);
        ouwVarOuw.f13484lh = fkwVar;
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "feed_continue", jSONObject, (ra) null);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
    }

    public static void yu(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2) {
        ko koVar;
        if (ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f13479lh;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.vt vtVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.vt();
        vtVar.ouw = ouwVar2.vt;
        vtVar.vt = j11;
        vtVar.f13489lh = ouwVar2.pno;
        vtVar.yu = ouwVar2.bly;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f13475lh, lhVar);
        ouwVarOuw.f13484lh = vtVar;
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "endcard_skip", jSONObject, (ra) null);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
        ouw.remove(ouwVar);
    }

    public static void vt(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2, ra raVar) {
        if (ouwVar == null) {
            return;
        }
        fkw(ouwVar, ouwVar2);
        ko koVar = ouw.get(ouwVar);
        if (koVar == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f13479lh;
        le leVar = new le();
        leVar.vt = ouwVar2.vt;
        leVar.ouw = j11;
        leVar.f13481lh = ouwVar2.f13476cf;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f13475lh, lhVar);
        ouwVarOuw.f13484lh = leVar;
        JSONObject jSONObjectVt = ouwVarOuw.vt();
        ouw(ouwVar2, vppVar, jSONObjectVt);
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            jSONObjectVt.put("surface_texture_updated", ouwVar2.fkw ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "feed_over", jSONObject, raVar);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
        ouw.remove(ouwVar);
    }

    public static void ouw(com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw("load_video_error", ouwVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    public static void ouw(vpp vppVar, com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, lh lhVar) {
        int i10;
        int i11;
        int i12;
        if (vppVar == null || ouwVar == null || lhVar == null) {
            return;
        }
        String strOuw = ex.ouw();
        try {
            if (!lhVar.yu) {
                if (CacheDirFactory.getICacheDir(vppVar.f12875sm).ouw(lhVar)) {
                    i11 = 1;
                } else {
                    i10 = 2;
                }
                ouw.put(ouwVar, new ko(SystemClock.elapsedRealtime(), strOuw, i11, lhVar, vppVar));
                com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, strOuw, i11, lhVar);
                JSONObject jSONObjectOuw = ouwVarOuw.ouw();
                if (lhVar.f10442cf) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                jSONObjectOuw.put("is_mute", i12);
                ouwVarOuw.yu = lhVar.f10449rn == -1;
                ouw(ouwVarOuw, "play_start", (JSONObject) null, (ra) null);
            }
            i10 = 3;
            if (lhVar.f10442cf) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            jSONObjectOuw.put("is_mute", i12);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
        i11 = i10;
        ouw.put(ouwVar, new ko(SystemClock.elapsedRealtime(), strOuw, i11, lhVar, vppVar));
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw2 = ouw(vppVar, strOuw, i11, lhVar);
        JSONObject jSONObjectOuw2 = ouwVarOuw2.ouw();
        ouwVarOuw2.yu = lhVar.f10449rn == -1;
        ouw(ouwVarOuw2, "play_start", (JSONObject) null, (ra) null);
    }

    public static void ouw(Context context, com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, final ko.ouw ouwVar2, ra raVar) {
        ko koVar;
        if (context == null || ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        final lh lhVar = koVar.yu;
        final vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        if (!ouwVar2.mwh) {
            com.bytedance.sdk.openadsdk.rn.lh.ouw();
            com.bytedance.sdk.openadsdk.rn.lh.ouw("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.2
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("service_duration", ouw.ouw(lhVar));
                    jSONObject.put("player_duration", ouwVar2.f13479lh);
                    jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                    jSONObject.put("url", lhVar.pno());
                    jSONObject.put("path", ouw.vt(lhVar));
                    jSONObject.put("player_type", lhVar.f10449rn);
                    yu yuVar = new yu();
                    yuVar.ouw = "pangle_video_play_state";
                    vpp vppVar2 = vppVar;
                    yuVar.yu = vppVar2 != null ? vppVar2.uoy() : 0;
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }
        pno pnoVar = new pno(lhVar);
        pnoVar.f13485lh = ouwVar2.f13480ra ? 1 : 0;
        pnoVar.vt = CacheDirFactory.getICacheDir(vppVar.f12875sm).vt(lhVar);
        pnoVar.ouw = SystemClock.elapsedRealtime() - koVar.ouw;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f13475lh, lhVar);
        ouwVarOuw.f13484lh = pnoVar;
        JSONObject jSONObjectVt = ouwVarOuw.vt();
        try {
            jSONObjectVt.put("is_received_video_not_playing_info", ouwVar2.yu ? 1 : 0);
            jSONObjectVt.put("new_media_source", com.bykv.vk.openvk.ouw.ouw.vt.ouw.le());
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
        ouwVarOuw.yu = ouwVar2.mwh;
        ouw(ouwVarOuw, "feed_play", (JSONObject) null, raVar);
    }

    public static /* synthetic */ String vt(lh lhVar) {
        return new File(lhVar.f10446lh, lhVar.bly()).getAbsolutePath();
    }

    public static void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2) {
        ko koVar;
        if (ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f13479lh;
        if (j11 <= 0 || j10 <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ra raVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ra();
        raVar.ouw = ouwVar2.vt;
        raVar.vt = j11;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f13475lh, lhVar);
        ouwVarOuw.f13484lh = raVar;
        ouw(ouwVar2, vppVar, ouwVarOuw.vt());
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "feed_pause", jSONObject, (ra) null);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
    }

    public static void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2, ra raVar) {
        if (ouwVar == null || ouwVar2 == null) {
            return;
        }
        fkw(ouwVar, ouwVar2);
        ko koVar = ouw.get(ouwVar);
        if (koVar == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f13479lh;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.yu yuVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.yu();
        yuVar.vt = ouwVar2.vt;
        yuVar.ouw = j11;
        yuVar.f13490lh = ouwVar2.tlj;
        yuVar.yu = ouwVar2.f13476cf;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f13475lh, lhVar);
        ouwVarOuw.f13484lh = yuVar;
        ouw(ouwVar2, vppVar, ouwVarOuw.vt());
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "feed_break", jSONObject, raVar);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
    }

    public static void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, boolean z10, String str) {
        ko koVar;
        if (ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f13475lh, lhVar);
        try {
            ouwVarOuw.ouw().put("is_mute", z10 ? 1 : 0);
            ouwVarOuw.vt().put(TypedValues.TransitionType.S_FROM, str);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
        ouw(ouwVarOuw, "mute_state_change", (JSONObject) null, (ra) null);
    }

    private static void ouw(final com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar, String str, final JSONObject jSONObject, final ra raVar) {
        if (ouwVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (ouwVar.yu && !TextUtils.isEmpty(ouwVar.vt)) {
            String str2 = ouwVar.vt;
            str2.hashCode();
            if (str2.equals("stream") || str2.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str3 = str;
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), ouwVar.ouw, ouwVar.vt, str3, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.1
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                ra raVar2;
                try {
                    JSONObject jSONObjectOuw = ouwVar.ouw();
                    com.bytedance.sdk.openadsdk.yu.fkw.vt.lh lhVar = ouwVar.f13484lh;
                    if (lhVar != null) {
                        lhVar.ouw(jSONObjectOuw);
                    }
                    if (("feed_play".equals(str3) || "feed_over".equals(str3) || "feed_break".equals(str3)) && (raVar2 = raVar) != null) {
                        raVar2.ouw(jSONObjectOuw);
                    }
                    return jSONObjectOuw;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar2 = ouwVar;
                com.bytedance.sdk.openadsdk.yu.fkw.vt.lh lhVar = ouwVar2.f13484lh;
                if (lhVar != null) {
                    lhVar.ouw(ouwVar2);
                }
                return ouwVar.vt();
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                return jSONObject;
            }
        });
    }

    private static void ouw(ko.ouw ouwVar, vpp vppVar, JSONObject jSONObject) {
        if (vppVar != null) {
            try {
                cd cdVar = vppVar.f12879tj;
                if (cdVar != null) {
                    jSONObject.put("speed_type", cdVar.vt);
                    jSONObject.put("speed", cdVar.ouw);
                    jSONObject.put("speed_duration", ouwVar.f13478le);
                }
            } catch (Throwable th2) {
                qbp.ouw("TTAD.VideoEventManager", "", th2);
            }
        }
    }

    public static /* synthetic */ long ouw(lh lhVar) {
        vt vtVar;
        if (lhVar == null) {
            return 0L;
        }
        if (lhVar.le()) {
            vtVar = lhVar.vt;
        } else {
            vtVar = lhVar.ouw;
        }
        if (vtVar != null) {
            return Double.valueOf(vtVar.yu * 1000.0d).longValue();
        }
        return 0L;
    }
}
