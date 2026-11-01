package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.C3426d4;
import com.ironsource.C3784xa;
import com.ironsource.G5;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.PangleVideoBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class jqy implements vpp<com.bytedance.sdk.openadsdk.yu.ouw> {
    private final Context ouw;

    public static class vt {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.core.model.fvf f12697lh;
        public final int ouw;
        public final boolean vt;

        public static vt ouw(JSONObject jSONObject) {
            int iOptInt = jSONObject.optInt("code");
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.fvf fvfVar = new com.bytedance.sdk.openadsdk.core.model.fvf();
            if (jSONObjectOptJSONObject != null) {
                try {
                    fvfVar.ouw = jSONObjectOptJSONObject.optInt("reason");
                    fvfVar.vt = jSONObjectOptJSONObject.optInt("corp_type");
                    fvfVar.f12756lh = jSONObjectOptJSONObject.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT);
                    fvfVar.yu = jSONObjectOptJSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", th2.getMessage());
                }
            }
            return new vt(iOptInt, zOptBoolean, fvfVar);
        }

        private vt(int i10, boolean z10, com.bytedance.sdk.openadsdk.core.model.fvf fvfVar) {
            this.ouw = i10;
            this.vt = z10;
            this.f12697lh = fvfVar;
        }
    }

    private static boolean fkw(JSONObject jSONObject) {
        try {
            return jSONObject.optString("message").equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean lh(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @DungeonFlag
    private JSONObject ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, int i10) {
        int i11;
        int i12;
        JSONArray jSONArray;
        int i13;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strLe = (kscVar == null || TextUtils.isEmpty(kscVar.ouw)) ? com.bytedance.sdk.openadsdk.utils.uoy.le() : kscVar.ouw;
            if (i10 == 7) {
                if (kscVar != null && (i13 = kscVar.vt) > 0) {
                    jSONObject2.put("req_type", i13);
                }
            } else if (i10 == 8) {
                if (kscVar != null && (i12 = kscVar.f12776lh) > 0) {
                    jSONObject2.put("req_type", i12);
                }
            } else if (i10 == 3 && kscVar != null && (i11 = kscVar.yu) > 0) {
                jSONObject2.put("req_type", i11);
            }
            try {
                String strLe2 = zih.yu().le();
                String strMwh = zih.yu().mwh();
                if (strLe2 != null && strMwh != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version", strLe2);
                    jSONObject3.put("param", strMwh);
                    jSONObject2.put("abtest", jSONObject3);
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put(CommonUrlParts.REQUEST_ID, strLe);
            com.bytedance.sdk.openadsdk.utils.uoy.ouw(jSONObject2);
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("js_render_ver", com.bytedance.sdk.openadsdk.core.bly.ryl.vt());
            jSONObject2.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.bly.ryl.lh());
            jSONObject2.put("source_type", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            jSONObject2.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, vt());
            JSONObject jSONObjectOuw = DeviceUtils.ouw(this.ouw, true);
            com.bytedance.sdk.component.utils.ko.ouw("NetApiImpl", "device info:", jSONObjectOuw);
            jSONObject2.put(C3426d4.i.G, jSONObjectOuw);
            jSONObject2.put("user", ouw(adSlot));
            jSONObject2.put(Q6.f27422d0, com.bytedance.sdk.openadsdk.utils.uoy.fkw());
            jSONObject2.put("channel", C3426d4.i.Z);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(ouw(adSlot, i10, kscVar));
            jSONObject2.put("adslots", jSONArray2);
            if (kscVar != null && (jSONArray = kscVar.fkw) != null) {
                try {
                    jSONObject2.put("source_temai_product_ids", jSONArray);
                } catch (Exception unused2) {
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject2.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (adSlot.getCodeId() != null && strLe != null) {
                strConcat = String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strLe);
            }
            jSONObject2.put("req_sign", com.bytedance.sdk.component.utils.fkw.ouw(strConcat));
            if (com.bytedance.sdk.openadsdk.core.tlj.lh.fkw() != 0) {
                jSONObject2.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.tlj.lh.fkw()));
            }
            jSONObject2.put("adx_id", bly.ouw().vm());
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw(jSONObject2);
            jSONObject = ouw(PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject2);
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.yu("body data exception", th2);
        }
        return jSONObject;
    }

    @NonNull
    private static Map<String, String> yu(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json; charset=utf-8");
        if (lh(jSONObject)) {
            map.put("Content-Encoding", "union_sdk_encode");
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.bytedance.sdk.openadsdk.core.jqy] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.bytedance.sdk.openadsdk.core.jqy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map] */
    public final void vt(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ksc kscVar, final int i10, final vpp.ouw ouwVar) {
        Object vtVar;
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar2;
        boolean z10 = this;
        if (!zih.yu().tc()) {
            ouwVar.ouw(40060, pno.ouw(40060));
            return;
        }
        boolean zVt = com.bytedance.sdk.openadsdk.vpp.ouw.vt();
        if (!zVt) {
            jg.le();
        }
        final com.bytedance.sdk.openadsdk.core.model.lh lhVar = new com.bytedance.sdk.openadsdk.core.model.lh();
        lhVar.fkw = adSlot;
        if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            if (ouwVar != null) {
                ouwVar.ouw(1000, "Ad request is temporarily paused, Please contact your AM");
                lhVar.vt = 1000;
                com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
                return;
            }
            return;
        }
        if (!zih.yu().vpp()) {
            if (ouwVar != null) {
                ouwVar.ouw(-16, pno.ouw(-16));
                lhVar.vt = 1001;
                com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
                return;
            }
            return;
        }
        if (ouwVar == null) {
            return;
        }
        if (vt(adSlot.getCodeId())) {
            ouwVar.ouw(-8, pno.ouw(-8));
            return;
        }
        z10 = 0;
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !kscVar.f12775le) {
            lhVar.f12782lh = 2;
            lhVar.ouw = adSlot.getBidAdm();
            if (com.bytedance.sdk.component.utils.ko.yu()) {
                com.bytedance.sdk.component.utils.ko.vt("bidding", "getAd bidAdm is valid，it will directly parse the returned advertisement: BidAdm->MD5->" + com.bykv.vk.openvk.ouw.ouw.ouw.ra.vt.ouw(adSlot.getBidAdm()));
            }
            if (zih.yu().ex() && pd.ouw().yu() == 1) {
                com.bytedance.sdk.openadsdk.utils.uoy.ouw("Pangle_Debug_Mode", adSlot.getBidAdm(), z10.ouw);
            }
            try {
                JSONObject jSONObjectOuw = z10.ouw(PangleVideoBridge.jsonObjectInit(adSlot.getBidAdm()));
                if (jSONObjectOuw == null) {
                    lhVar.f12783ra = 12;
                    ouw(ouwVar, lhVar);
                    return;
                }
                ouw ouwVarOuw = ouw.ouw(jSONObjectOuw, adSlot, kscVar);
                lhVar.yu = ouwVarOuw.tlj;
                ryl.ouw(ouwVarOuw.bly);
                int i11 = ouwVarOuw.yu;
                if (i11 != 20000) {
                    ouwVar.ouw(i11, ouwVarOuw.fkw);
                    lhVar.vt = ouwVarOuw.yu;
                    lhVar.f12783ra = 9;
                    com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.ouw ouwVar3 = ouwVarOuw.pno;
                if (ouwVar3 == null) {
                    lhVar.f12783ra = 13;
                    ouw(ouwVar, lhVar);
                    return;
                }
                List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar3.yu;
                if (list != null && !list.isEmpty()) {
                    com.bytedance.sdk.openadsdk.rn.lh.ouw(ouwVarOuw.pno.yu.get(0));
                }
                ouw(ouwVarOuw.pno);
                if (z10.ouw(ouwVarOuw.pno, ouwVar)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(ouwVarOuw.pno);
                ouwVar.ouw(ouwVarOuw.pno, lhVar);
                Map<String, com.bytedance.sdk.openadsdk.core.model.vpp> mapOuw = com.bytedance.sdk.openadsdk.core.model.ouw.ouw(ouwVarOuw.pno);
                if (mapOuw != null) {
                    com.bytedance.sdk.openadsdk.ra.vt.ouw().ouw(mapOuw);
                }
                z10.vt(ouwVarOuw.pno);
                com.bytedance.sdk.openadsdk.core.fkw.ouw.C0123ouw.ouw.ouw(ouwVarOuw.pno);
                return;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.ouw("NetApiImpl", "get ad error: ", th2);
                lhVar.f12783ra = 14;
                lhVar.f12781le = th2.getMessage();
                ouw(ouwVar, lhVar);
                return;
            }
        }
        if (kscVar != null && !TextUtils.isEmpty(kscVar.ryl)) {
            try {
                JSONObject jSONObjectOuw2 = z10.ouw(PangleVideoBridge.jsonObjectInit(kscVar.ryl));
                if (jSONObjectOuw2 != null) {
                    ouw ouwVarOuw2 = ouw.ouw(jSONObjectOuw2, adSlot, kscVar);
                    qbp qbpVar = kscVar.mwh;
                    if (qbpVar != null && (ouwVar2 = ouwVarOuw2.pno) != null && qbpVar.ouw(ouwVar2)) {
                        com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(ouwVar2);
                        ouwVar.ouw(ouwVar2, lhVar);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObjectOuw3 = ouw(adSlot, kscVar, i10);
        if (jSONObjectOuw3 == null) {
            ouwVar.ouw(-9, pno.ouw(-9));
            lhVar.vt = -9;
            com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
            return;
        }
        if (zih.yu().ex() && pd.ouw().yu() == 1) {
            com.bytedance.sdk.openadsdk.utils.uoy.ouw("Pangle_Debug_Mode", jSONObjectOuw3.toString(), z10.ouw);
        }
        String strOuw = com.bytedance.sdk.openadsdk.utils.uoy.ouw("/api/ad/union/sdk/get_ads/", true, false);
        final com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
        try {
            yuVarOuw.ouw(com.bytedance.sdk.openadsdk.bly.lh.ouw(strOuw));
        } catch (Exception unused2) {
        }
        yuVarOuw.ouw(jSONObjectOuw3.toString(), zih.yu().pno());
        Map<String, String> mapOuw2 = com.bytedance.sdk.openadsdk.core.tlj.lh.ouw(strOuw, jSONObjectOuw3.toString());
        if (mapOuw2 != null && mapOuw2.size() > 0) {
            for (String str : mapOuw2.keySet()) {
                try {
                    yuVarOuw.vt(str, mapOuw2.get(str));
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e10.getMessage());
                }
            }
        }
        try {
            yuVarOuw.vt("User-Agent", com.bytedance.sdk.openadsdk.utils.uoy.fkw());
            ouw(yuVarOuw, jSONObjectOuw3);
        } catch (Exception unused3) {
        }
        final com.bytedance.sdk.openadsdk.utils.fak fakVarOuw = com.bytedance.sdk.openadsdk.utils.fak.ouw();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z11 = bly.ouw().jg() && requestExtraMap != null;
        if (z11) {
            requestExtraMap.put("pgad_start", fakVarOuw);
        }
        yuVarOuw.f11911ra = 10;
        yuVarOuw.f11910le = "get_ad";
        com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.8
            @Override // com.bytedance.sdk.openadsdk.vm.yu
            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar4 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                ouwVar4.f13464lh = "get_ad";
                ouwVar4.f13465ra = adSlot.getCodeId();
                ouwVar4.pno = com.bytedance.sdk.openadsdk.utils.uoy.lh(adSlot.getDurationSlotType());
                return ouwVar4;
            }
        });
        if (com.bytedance.sdk.component.utils.ko.yu()) {
            com.bytedance.sdk.component.utils.ko.vt("NetApiImpl", "canSyncRequest:" + zVt + ",run in " + Thread.currentThread().getName() + " thread");
        }
        if (zVt) {
            try {
                com.bytedance.sdk.component.ra.vt vtVarOuw = yuVarOuw.ouw();
                if (vtVarOuw == null) {
                    vtVar = new com.bytedance.sdk.component.ra.vt(false, 5001, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L);
                }
                com.bytedance.sdk.component.ra.vt vtVar2 = vtVarOuw;
                try {
                    if (vtVar2.pno) {
                        vtVar = requestExtraMap;
                        ouw(yuVarOuw, vtVar2, z11, requestExtraMap, fakVarOuw, adSlot, lhVar, ouwVar, kscVar, i10);
                    } else {
                        Map<String, Object> map = requestExtraMap;
                        ouw(yuVarOuw, new IOException(vtVar2.vt), vtVar2, adSlot, z11, map, ouwVar, lhVar);
                        com.bytedance.sdk.openadsdk.utils.zin.ouw(yuVarOuw.fkw());
                        vtVar = map;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ouw(yuVarOuw, new IOException(th.getMessage()), new com.bytedance.sdk.component.ra.vt(false, 5002, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, z11, vtVar, ouwVar, lhVar);
                }
            } catch (Throwable th4) {
                th = th4;
                vtVar = requestExtraMap;
                z10 = 0;
            }
        } else {
            final boolean z12 = z11;
            yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.vt() { // from class: com.bytedance.sdk.openadsdk.core.jqy.9
                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar2, com.bytedance.sdk.component.ra.vt vtVar3) {
                    jqy.this.ouw(lhVar2, vtVar3, z12, requestExtraMap, fakVarOuw, adSlot, lhVar, ouwVar, kscVar, i10);
                }

                @Override // com.bytedance.sdk.component.ra.ouw.vt
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar2, IOException iOException, com.bytedance.sdk.component.ra.vt vtVar3) {
                    jqy.this.ouw(yuVarOuw, iOException, vtVar3, adSlot, z12, requestExtraMap, ouwVar, lhVar);
                    if (lhVar2 != null) {
                        com.bytedance.sdk.openadsdk.utils.zin.ouw(lhVar2.fkw());
                    }
                }
            });
            z10 = 0;
        }
        com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(z10);
    }

    public static class ouw {
        public final String bly;
        public final String fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public final int f12694le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final long f12695lh;
        public final int ouw;

        @Nullable
        public final com.bytedance.sdk.openadsdk.core.model.ouw pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public final String f12696ra;
        public final ArrayList<Integer> tlj;
        public final long vt;
        public final int yu;

        public static ouw ouw(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar) {
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String strOptString3 = jSONObject.optString(CommonUrlParts.REQUEST_ID);
            int iOptInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.ouw, ArrayList<Integer>> pairOuw = com.bytedance.sdk.openadsdk.core.vt.ouw(jSONObject, adSlot, kscVar);
            return pairOuw == null ? new ouw(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null) : new ouw(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (com.bytedance.sdk.openadsdk.core.model.ouw) pairOuw.first, jOptLong, jOptLong2, (ArrayList) pairOuw.second);
        }

        private ouw(String str, int i10, int i11, String str2, int i12, String str3, @Nullable com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, long j10, long j11, ArrayList<Integer> arrayList) {
            this.ouw = i10;
            this.yu = i11;
            this.fkw = str2;
            this.f12696ra = str3;
            this.pno = ouwVar;
            this.bly = str;
            this.f12694le = i12;
            this.vt = j10;
            this.f12695lh = j11;
            this.tlj = arrayList;
        }
    }

    private static byte[] fkw(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(str.getBytes(G5.N));
                            try {
                                gZIPOutputStream2.close();
                            } catch (IOException e10) {
                                com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e10.toString());
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e11) {
                            e = e11;
                            gZIPOutputStream = gZIPOutputStream2;
                            com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e12) {
                                    com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e12.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return byteArray;
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e13) {
                                    com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e13.toString());
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            byteArrayOutputStream.toByteArray();
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e14) {
                                com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e14.toString());
                                throw th;
                            }
                        }
                    } catch (IOException e15) {
                        e = e15;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e16) {
                com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e16.toString());
            }
        } catch (IOException e17) {
            e = e17;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        return byteArray;
    }

    private static JSONArray lh(String str) {
        try {
            Set<String> setVt = com.bytedance.sdk.component.adexpress.ouw.vt.vt.vt(str);
            if (setVt != null && setVt.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = setVt.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVarOuw = com.bytedance.sdk.component.adexpress.ouw.vt.vt.ouw(it.next());
                    if (vtVarOuw != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", vtVarOuw.vt);
                        jSONObject.put("md5", vtVarOuw.f11569lh);
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.ouw("NetApiImpl", "getParentTplIds: ", e10);
            return null;
        }
    }

    public jqy(Context context) {
        this.ouw = context;
    }

    private static JSONArray yu(String str) {
        try {
            com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw();
            Set<com.bytedance.sdk.openadsdk.core.cf.ouw.ouw> setOuw = com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw(str);
            if (setOuw != null && setOuw.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.cf.ouw.ouw ouwVar : setOuw) {
                    if (ouwVar != null && !TextUtils.isEmpty(ouwVar.fkw)) {
                        JSONObject jSONObject = new JSONObject();
                        String[] strArrSplit = ouwVar.ouw.split("_");
                        if (strArrSplit.length == 2) {
                            jSONObject.put("id", strArrSplit[1]);
                            jSONObject.put("md5", ouwVar.vt);
                            jSONArray.put(jSONObject);
                        } else {
                            continue;
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.ouw("NetApiImpl", "getUgenParentTplIds: ", e10);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, int i10, qbp qbpVar) {
        if (!kscVar.f12775le && TextUtils.isEmpty(adSlot.getBidAdm())) {
            if (!(kscVar.vt == 2 || kscVar.f12776lh == 2 || kscVar.yu == 2)) {
                String strOuw = qbpVar.ouw();
                if (!TextUtils.isEmpty(strOuw)) {
                    kscVar.ryl = strOuw;
                    kscVar.mwh = qbpVar;
                }
            }
            ouw(adSlot, kscVar, i10, (vpp.ouw) qbpVar);
            return;
        }
        ouw(adSlot, kscVar, i10, (vpp.ouw) qbpVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void ouw(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ksc kscVar, final int i10, vpp.ouw ouwVar) {
        if (kscVar != null && (kscVar.vt == 2 || kscVar.f12776lh == 2 || kscVar.yu == 2)) {
            adSlot.setPreload(true);
        }
        final com.bytedance.sdk.openadsdk.core.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.core.vt.ouw(ouwVar, adSlot, (adSlot.isPreload() || kscVar == null || kscVar.f12775le) ? false : true);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jg.vt().post(new com.bytedance.sdk.component.pno.pno("getAd") { // from class: com.bytedance.sdk.openadsdk.core.jqy.1
                @Override // java.lang.Runnable
                public final void run() {
                    jqy.this.vt(adSlot, kscVar, i10, ouwVar2);
                }
            });
        } else {
            vt(adSlot, kscVar, i10, ouwVar2);
        }
        if (com.bytedance.sdk.openadsdk.vpp.ouw.vt()) {
            jg.ra();
        }
    }

    private static void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVarLh;
        if (ouwVar == null || (vppVarLh = ouwVar.lh()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.settings.cf.vpp(vppVarLh.mwh);
    }

    public final void ouw(com.bytedance.sdk.component.ra.vt.yu yuVar, IOException iOException, com.bytedance.sdk.component.ra.vt vtVar, final AdSlot adSlot, boolean z10, Map<String, Object> map, vpp.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
        String message;
        com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.10
            @Override // com.bytedance.sdk.openadsdk.vm.yu
            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                ouwVar2.f13464lh = "get_ad";
                ouwVar2.f13465ra = adSlot.getCodeId();
                ouwVar2.pno = com.bytedance.sdk.openadsdk.utils.uoy.lh(adSlot.getDurationSlotType());
                ouwVar2.vt = BuildConfig.VERSION_NAME;
                return ouwVar2;
            }
        });
        if (vtVar != null) {
            message = vtVar.vt;
        } else {
            message = iOException != null ? iOException.getMessage() : "";
        }
        com.bytedance.sdk.openadsdk.utils.fak fakVarOuw = com.bytedance.sdk.openadsdk.utils.fak.ouw();
        if (z10) {
            map.put("pgad_end", Long.valueOf(fakVarOuw.ouw));
        }
        if (zih.yu().ex() && pd.ouw().yu() == 1) {
            com.bytedance.sdk.openadsdk.utils.uoy.ouw("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.ouw);
        }
        int i10 = 601;
        if (vtVar != null) {
            i10 = vtVar.ouw;
        } else if (iOException != null && (iOException instanceof SocketTimeoutException)) {
            i10 = 602;
        }
        if (ouwVar != null) {
            ouwVar.ouw(i10, message);
        }
        com.bytedance.sdk.component.utils.ko.vt("NetApiImpl", "onFailure: ", Integer.valueOf(i10));
        lhVar.vt = i10;
        lhVar.f12783ra = 10;
        lhVar.f12781le = message;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
        com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("get_ad", yuVar.fkw(), i10, message);
    }

    public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar, boolean z10, Map<String, Object> map, com.bytedance.sdk.openadsdk.utils.fak fakVar, final AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.lh lhVar2, vpp.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, int i10) {
        String str;
        com.bytedance.sdk.openadsdk.utils.fak fakVar2;
        ouw ouwVar2;
        com.bytedance.sdk.openadsdk.utils.fak fakVar3;
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list;
        com.bytedance.sdk.openadsdk.core.model.uq uqVar;
        if (z10) {
            map.put("pgad_end", fakVar);
        }
        if (vtVar == null) {
            return;
        }
        if (vtVar.pno) {
            com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.11
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar3.f13464lh = "get_ad";
                    ouwVar3.f13465ra = adSlot.getCodeId();
                    ouwVar3.pno = com.bytedance.sdk.openadsdk.utils.uoy.lh(adSlot.getDurationSlotType());
                    ouwVar3.vt = BuildConfig.VERSION_NAME;
                    return ouwVar3;
                }
            });
            try {
                com.bytedance.sdk.openadsdk.utils.fak fakVarOuw = com.bytedance.sdk.openadsdk.utils.fak.ouw();
                String str2 = vtVar.yu;
                lhVar2.ouw = str2;
                JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str2);
                if (zih.yu().ex() && pd.ouw().yu() == 1) {
                    com.bytedance.sdk.openadsdk.utils.uoy.ouw("Pangle_Debug_Mode", jSONObjectJsonObjectInit.toString(), this.ouw);
                }
                JSONObject jSONObjectOuw = ouw(jSONObjectJsonObjectInit);
                if (jSONObjectOuw == null) {
                    lhVar2.f12783ra = 12;
                    ouw(ouwVar, lhVar2);
                    return;
                }
                ouw ouwVarOuw = ouw.ouw(jSONObjectOuw, adSlot, kscVar);
                lhVar2.yu = ouwVarOuw.tlj;
                ryl.ouw(ouwVarOuw.bly);
                int i11 = ouwVarOuw.yu;
                if (i11 != 20000) {
                    lhVar2.vt = i11;
                    if (!zih.yu().pno.fkw && ouwVarOuw.yu == 40029) {
                        ouwVar.ouw(-100, pno.ouw(-100));
                    } else {
                        ouwVar.ouw(ouwVarOuw.yu, ouwVarOuw.fkw);
                    }
                    lhVar2.f12783ra = 9;
                    com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar2);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.ouw ouwVar3 = ouwVarOuw.pno;
                if (ouwVar3 == null) {
                    lhVar2.f12783ra = 13;
                    ouw(ouwVar, lhVar2);
                    return;
                }
                if (ouw(ouwVar3, ouwVar)) {
                    return;
                }
                ouwVarOuw.pno.f12792cf = str2;
                com.bytedance.sdk.openadsdk.utils.fak fakVarOuw2 = com.bytedance.sdk.openadsdk.utils.fak.ouw();
                if (kscVar != null && (uqVar = kscVar.f12774cf) != null) {
                    uqVar.ouw(fakVar, fakVarOuw, ouwVarOuw.ouw, fakVarOuw2);
                }
                boolean z11 = com.bytedance.sdk.openadsdk.vpp.ouw.lh() && i10 == 1;
                if (!z11 || (list = ouwVarOuw.pno.yu) == null || list.isEmpty()) {
                    fakVar2 = fakVarOuw2;
                    ouwVar2 = ouwVarOuw;
                    fakVar3 = fakVarOuw;
                    str = "get_ad";
                } else {
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar = ouwVarOuw.pno.yu.get(0);
                    String strLh = com.bytedance.sdk.openadsdk.utils.uoy.lh(i10);
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    long jOuw = 0;
                    if (kscVar != null) {
                        try {
                            com.bytedance.sdk.openadsdk.utils.fak fakVar4 = kscVar.tlj;
                            try {
                                fakVarOuw2 = fakVarOuw2;
                                if (fakVar4.ouw > 0) {
                                    jOuw = fakVarOuw2.ouw(fakVar4);
                                }
                            } catch (Exception unused) {
                                fakVar2 = fakVarOuw2;
                                ouwVar2 = ouwVarOuw;
                                fakVar3 = fakVarOuw;
                                str = "get_ad";
                            }
                        } catch (Exception unused2) {
                            fakVar2 = fakVarOuw2;
                        }
                    }
                    long j10 = jOuw;
                    if (vppVar != null) {
                        boolean zTh = vppVar.th();
                        jSONObject2.put("is_new_engine", zTh ? 1 : 0);
                        jSONObject2.put("webview_cache_size", zTh ? com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().yu() : com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().lh());
                    }
                    com.bytedance.sdk.openadsdk.utils.fak fakVar5 = fakVarOuw2;
                    fakVar3 = fakVarOuw;
                    str = "get_ad";
                    try {
                        try {
                            ouw(vtVar.tlj, kscVar, fakVar, fakVarOuw, ouwVarOuw.ouw, fakVarOuw2, vppVar, strLh, jSONObject2, true);
                            jSONObject.put("duration", j10);
                            jSONObject.put("extra_data", jSONObject2);
                            jSONObject.put("tag", strLh);
                            fakVar2 = fakVar5;
                            try {
                                jSONObject.put("callback_start", fakVar2.vt);
                                ouwVar2 = ouwVarOuw;
                                try {
                                    ouwVar2.pno.f12795ra = jSONObject;
                                } catch (Exception unused3) {
                                }
                            } catch (Exception unused4) {
                                ouwVar2 = ouwVarOuw;
                            }
                        } catch (Exception unused5) {
                            fakVar2 = fakVar5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.qbp.ouw("NetApiImpl", "get ad error: ", th);
                        lhVar2.f12781le = th.getMessage();
                        lhVar2.f12783ra = 14;
                        ouw(ouwVar, lhVar2);
                        com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw(str, lhVar.fkw(), -9, th.getMessage());
                        ApmHelper.reportCustomError("", "parse_error", th);
                        return;
                    }
                }
                com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(ouwVar2.pno);
                ouwVar.ouw(ouwVar2.pno, lhVar2);
                vt(ouwVar2.pno);
                com.bytedance.sdk.openadsdk.core.fkw.ouw.C0123ouw.ouw.ouw(ouwVar2.pno);
                Map<String, com.bytedance.sdk.openadsdk.core.model.vpp> mapOuw = com.bytedance.sdk.openadsdk.core.model.ouw.ouw(ouwVar2.pno);
                if (mapOuw != null) {
                    com.bytedance.sdk.openadsdk.ra.vt.ouw().ouw(mapOuw);
                }
                List<com.bytedance.sdk.openadsdk.core.model.vpp> list2 = ouwVar2.pno.yu;
                if (list2 == null || list2.isEmpty() || z11) {
                    return;
                }
                ouw(vtVar.tlj, kscVar, fakVar, fakVar3, ouwVar2.ouw, fakVar2, ouwVar2.pno.yu.get(0), com.bytedance.sdk.openadsdk.utils.uoy.lh(i10));
            } catch (Throwable th3) {
                th = th3;
                str = "get_ad";
            }
        } else {
            com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.12
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar4 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar4.f13464lh = "get_ad";
                    ouwVar4.f13465ra = adSlot.getCodeId();
                    ouwVar4.pno = com.bytedance.sdk.openadsdk.utils.uoy.lh(adSlot.getDurationSlotType());
                    ouwVar4.vt = BuildConfig.VERSION_NAME;
                    return ouwVar4;
                }
            });
            int i12 = vtVar.ouw;
            String str3 = vtVar.vt;
            ouwVar.ouw(i12, str3);
            lhVar2.vt = i12;
            lhVar2.f12783ra = 11;
            lhVar2.f12781le = str3;
            com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar2);
            com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("get_ad", lhVar.fkw(), i12, str3);
        }
    }

    @DungeonFlag
    private static JSONObject vt(@NonNull String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            jSONObjectJsonObjectInit.put(Q6.V0, com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
            jSONObject3.put("extra", jSONObjectJsonObjectInit.toString());
            jSONObject3.put("filter_words", ouw(list));
            jSONObject3.put("dislike_source", str3);
            if (jSONObject != null && !TextUtils.isEmpty(str2)) {
                jSONObject3.put("creative_info", com.bytedance.sdk.component.utils.ouw.ouw(jSONObject).toString());
                jSONObject3.put("feedback_type", 1);
                jSONObject3.put("user_description", str2);
            }
            com.bytedance.sdk.component.utils.ko.ouw("NetApiImpl", "dislike_source is：", str3);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0096  */
    /* JADX WARN: Code duplicated, block: B:14:0x0098  */
    /* JADX WARN: Code duplicated, block: B:17:0x009e A[Catch: JSONException -> 0x00ce, TryCatch #2 {JSONException -> 0x00ce, blocks: (B:3:0x0005, B:5:0x003a, B:11:0x005f, B:15:0x0099, B:17:0x009e, B:27:0x00c0, B:10:0x0048, B:7:0x0042), top: B:35:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
    @DungeonFlag
    private static JSONObject vt() {
        int i10;
        int i11;
        int rotation;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", bly.ouw().yu());
            jSONObject.put("name", bly.ouw().pno());
            try {
                jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.uoy.ra());
                jSONObject.put("version_code", com.bytedance.sdk.openadsdk.utils.uoy.pno());
                jSONObject.put("version", com.bytedance.sdk.openadsdk.utils.uoy.bly());
            } catch (Exception unused) {
            }
            Context contextOuw = zih.ouw();
            String packageResourcePath = "";
            if (contextOuw != null) {
                try {
                    packageResourcePath = contextOuw.getPackageResourcePath();
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", "failed to get the application installation package path. error: " + th2.getMessage());
                }
                jSONObject.put("package_install_path", packageResourcePath);
                i10 = 0;
                jSONObject.put("is_paid_app", false);
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.lh.vt());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - jg.ouw()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.bly());
                if (jg.fkw()) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                jSONObject.put("is_init", i11);
                if (contextOuw != null) {
                    rotation = ((WindowManager) contextOuw.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        i10 = 1;
                    } else if (rotation != 1) {
                        i10 = 3;
                    } else if (rotation != 2) {
                        i10 = 2;
                    } else if (rotation != 3) {
                        i10 = 4;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i10));
                }
            } else {
                jSONObject.put("package_install_path", packageResourcePath);
                i10 = 0;
                jSONObject.put("is_paid_app", false);
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.lh.vt());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - jg.ouw()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.bly());
                if (jg.fkw()) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                jSONObject.put("is_init", i11);
                if (contextOuw != null) {
                    rotation = ((WindowManager) contextOuw.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        i10 = 1;
                    } else if (rotation != 1) {
                        i10 = 3;
                    } else if (rotation != 2) {
                        i10 = 2;
                    } else if (rotation != 3) {
                        i10 = 4;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i10));
                }
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    private static String vt(AdSlot adSlot) {
        String strRyl = bly.ouw().ryl();
        if (adSlot == null) {
            return TextUtils.isEmpty(strRyl) ? "" : strRyl;
        }
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(strRyl)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return strRyl;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString("name", null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(strRyl);
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i11);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return strRyl;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final com.bytedance.sdk.openadsdk.yu.fkw vt(JSONObject jSONObject) {
        int i10;
        boolean z10;
        String strOptString = "error unknown";
        System.currentTimeMillis();
        if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw() || !zih.yu().tc() || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
        boolean z11 = false;
        int i11 = 0;
        try {
            JSONObject jSONObjectOuw = ouw(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            yuVarOuw.ouw(jSONObjectOuw.toString(), zih.yu().pno());
            yuVarOuw.ouw(com.bytedance.sdk.openadsdk.utils.uoy.vt("/api/ad/union/sdk/stats/batch/"));
            ouw(yuVarOuw, jSONObjectOuw);
            yuVarOuw.vt("User-Agent", com.bytedance.sdk.openadsdk.utils.uoy.fkw());
            boolean z12 = true;
            if ((com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw("perf_con_adlog_turn_off_retry_stats", 0) == 1) != false) {
                yuVarOuw.vt("_disable_retry", "1");
            }
            com.bytedance.sdk.component.ra.vt vtVarOuw = yuVarOuw.ouw();
            try {
                if (vtVarOuw == null) {
                    return new com.bytedance.sdk.openadsdk.yu.fkw(false, 0, "error unknown", false);
                }
                if (!vtVarOuw.pno || TextUtils.isEmpty(vtVarOuw.yu)) {
                    z12 = false;
                    z10 = false;
                } else {
                    JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(vtVarOuw.yu);
                    int iOptInt = jSONObjectJsonObjectInit.optInt("code", -1);
                    strOptString = jSONObjectJsonObjectInit.optString("data", "");
                    z10 = iOptInt == 20000;
                    if (iOptInt != 60005) {
                        z12 = false;
                    }
                }
                try {
                    i11 = vtVarOuw.ouw;
                    if (!vtVarOuw.pno) {
                        strOptString = vtVarOuw.vt;
                        com.bytedance.sdk.openadsdk.utils.zin.ouw(yuVarOuw.fkw());
                    }
                } catch (Throwable unused) {
                    i10 = i11;
                    z11 = z10;
                    z10 = z11;
                    i11 = i10;
                }
                return new com.bytedance.sdk.openadsdk.yu.fkw(z10, i11, strOptString, z12);
            } catch (Throwable unused2) {
                i10 = 0;
                z12 = false;
            }
        } catch (Throwable unused3) {
            return new com.bytedance.sdk.openadsdk.yu.fkw(false, 0, "error unknown", false);
        }
    }

    private boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, vpp.ouw ouwVar2) {
        if (ouwVar == null) {
            ouwVar2.ouw(40053, pno.ouw(40053));
            return true;
        }
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (list.isEmpty()) {
            return false;
        }
        for (final com.bytedance.sdk.openadsdk.core.model.vpp vppVar : list) {
            if (TextUtils.isEmpty(vppVar.f12852hk.vt) || TextUtils.isEmpty(vppVar.f12852hk.f12893lh)) {
                ouwVar2.ouw(40053, pno.ouw(40053));
                com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, com.bytedance.sdk.openadsdk.utils.uoy.ouw(vppVar), "material_error", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.jqy.13
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ad_label", vppVar.f12852hk.ouw());
                            return jSONObject;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    private static void ouw(String str, int i10, int i11, com.bytedance.sdk.openadsdk.core.model.zih zihVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(str).fkw(com.bytedance.sdk.openadsdk.utils.osn.le(zih.ouw())).yu(com.bytedance.sdk.openadsdk.utils.osn.yu(zih.ouw()))).ouw(i10).vt(i11).fkw(com.bytedance.sdk.openadsdk.utils.osn.le(zih.ouw())).yu(com.bytedance.sdk.openadsdk.utils.osn.yu(zih.ouw())).lh(1).ouw(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, str, null));
        } else {
            if (zihVar == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(zihVar.ouw).ouw(zihVar.vt).vt(zihVar.f12895lh).fkw(com.bytedance.sdk.openadsdk.utils.osn.le(zih.ouw())).yu(com.bytedance.sdk.openadsdk.utils.osn.yu(zih.ouw())).ouw(zihVar.f12894le)).lh(1).ouw(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, zihVar.ouw, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    private static void ouw(com.bytedance.sdk.component.vt.ouw.tlj tljVar, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, com.bytedance.sdk.openadsdk.utils.fak fakVar, com.bytedance.sdk.openadsdk.utils.fak fakVar2, int i10, com.bytedance.sdk.openadsdk.utils.fak fakVar3, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str) {
        if (zih.yu().jae()) {
            JSONObject jSONObject = new JSONObject();
            long jOuw = 0;
            if (kscVar != null) {
                try {
                    com.bytedance.sdk.openadsdk.utils.fak fakVar4 = kscVar.tlj;
                    if (fakVar4.ouw > 0) {
                        jOuw = fakVar3.ouw(fakVar4);
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            ouw(tljVar, kscVar, fakVar, fakVar2, i10, fakVar3, vppVar, str, jSONObject, false);
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str, "load_ad_time", jOuw, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void vt(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
        yuVarOuw.ouw(str);
        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
        yuVarOuw.vt("cypher", (String) pairGenerateRequestHeader.first);
        yuVarOuw.vt("transfer-param", (String) pairGenerateRequestHeader.second);
        yuVarOuw.vt("x-pangle-target-idc", zih.yu().lso());
        yuVarOuw.ouw(jSONObject);
        yuVarOuw.f11911ra = 5;
        yuVarOuw.f11910le = "apm_pv";
        yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.jqy.7
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                com.bytedance.sdk.component.utils.ko.vt("execPVToApm fail", iOException.toString());
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                com.bytedance.sdk.component.utils.ko.vt("execPVToApm success", vtVar.yu);
            }
        });
    }

    private static void ouw(com.bytedance.sdk.component.vt.ouw.tlj tljVar, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, com.bytedance.sdk.openadsdk.utils.fak fakVar, com.bytedance.sdk.openadsdk.utils.fak fakVar2, int i10, com.bytedance.sdk.openadsdk.utils.fak fakVar3, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, JSONObject jSONObject, boolean z10) throws JSONException {
        if (kscVar != null) {
            com.bytedance.sdk.openadsdk.utils.fak fakVar4 = kscVar.tlj;
            if (fakVar4.ouw > 0) {
                jSONObject.put("client_start_time", fakVar.ouw(fakVar4));
            }
        }
        jSONObject.put("network_time", fakVar2.ouw(fakVar));
        jSONObject.put("sever_time", i10);
        jSONObject.put("client_end_time", fakVar3.ouw(fakVar2));
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", vppVar.ra() ? 1 : 0);
        }
        if (vppVar != null) {
            jSONObject.put("render_control_type", vppVar.rn());
        }
        jSONObject.put("webview_cache_size", com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().lh());
        jSONObject.put("sync_barrier_open", z10 ? 1 : 0);
        long j10 = tljVar.vt;
        if (j10 > 0) {
            jSONObject.put("enqueue_2_run_ts", tljVar.f11961lh - j10);
            jSONObject.put("run_2_connect_end_ts", tljVar.fkw - tljVar.vt);
            jSONObject.put("connect_end_2_response_end_ts", tljVar.f11960le - tljVar.fkw);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - tljVar.f11960le);
        }
    }

    private static boolean vt(String str) {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.lh.ouw.vt() : com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().vt()) {
            return true;
        }
        if (!(com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.lh.ouw.ouw(str) : com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().ouw(str))) {
            return false;
        }
        String strLh = com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.lh.ouw.lh() : com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().lh();
        if (!TextUtils.isEmpty(strLh)) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(strLh, System.currentTimeMillis());
        }
        return true;
    }

    private void vt(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = list.get(i10);
            if (vppVar != null && vppVar.qjg == null) {
                ouw("", 0, 0, vppVar.fak, vppVar);
                ouw("", 0, 0, vppVar.uoy, vppVar);
                List<com.bytedance.sdk.openadsdk.core.model.zih> list2 = vppVar.f12877tc;
                if (list2 != null && list2.size() > 0) {
                    for (int i11 = 0; i11 < list2.size(); i11++) {
                        com.bytedance.sdk.openadsdk.core.model.zih zihVar = list2.get(i11);
                        com.bytedance.sdk.component.utils.ko.lh("imgCache", "loadImgAndReport: ");
                        if (zihVar != null) {
                            com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(zihVar.ouw).ouw(zihVar.vt).vt(zihVar.f12895lh).fkw(com.bytedance.sdk.openadsdk.utils.osn.le(zih.ouw())).yu(com.bytedance.sdk.openadsdk.utils.osn.yu(zih.ouw())).ouw(zihVar.f12894le)).lh(1).ouw(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, zihVar.ouw, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.core.jqy.14
                                @Override // com.bytedance.sdk.component.fkw.rn
                                public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
                                    com.bytedance.sdk.component.utils.ko.lh("imgCache", "loadImgAndReport: success");
                                }

                                @Override // com.bytedance.sdk.component.fkw.rn
                                public final void ouw(int i12, String str, @Nullable Throwable th2) {
                                    com.bytedance.sdk.component.utils.ko.lh("imgCache", "loadImgAndReport: fail");
                                }
                            }));
                        }
                    }
                }
                com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f12874sd;
                if (vtVar != null) {
                    ouw(vtVar.f10457le, vtVar.vt, vtVar.ouw, (com.bytedance.sdk.openadsdk.core.model.zih) null, vppVar);
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.bytedance.sdk.openadsdk.core.vpp
    @WorkerThread
    @DungeonFlag
    public final com.bytedance.sdk.openadsdk.yu.fkw ouw(JSONObject jSONObject, String str) {
        byte[] bArr;
        boolean z10;
        String str2;
        byte[] bArr2;
        Object obj;
        Object obj2;
        try {
            System.currentTimeMillis();
            if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
                return null;
            }
            com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
            yuVarOuw.ouw(str);
            if (com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw("perf_con_adlog_turn_off_retry_ad", 0) == 1) {
                yuVarOuw.vt("_disable_retry", "1");
            }
            Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(fkw(jSONObject.toString()));
            if (pairEncryptType4WithoutBase64 != null && (obj2 = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj2).length > 0) {
                bArr = (byte[]) obj2;
                tc.vt(true);
            } else {
                int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                tc.vt(false);
                tc.ouw(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                bArr = null;
            }
            if (bArr != null) {
                yuVarOuw.vt("Content-Encoding", "union_sdk_encode");
                yuVarOuw.vt("x-pgli18n", "4");
                yuVarOuw.ouw("application/octet-stream;tt-data=a", bArr);
            }
            if (bArr == null) {
                try {
                    JSONObject jSONObjectOuw = com.bytedance.sdk.component.utils.ouw.ouw(jSONObject);
                    if (!lh(jSONObjectOuw)) {
                        jSONObjectOuw = jSONObject;
                    }
                    ouw(yu(jSONObjectOuw), yuVarOuw);
                    yuVarOuw.ouw(jSONObjectOuw.toString(), zih.yu().pno());
                } catch (OutOfMemoryError e10) {
                    com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e10.toString());
                    return new com.bytedance.sdk.openadsdk.yu.fkw(false, -2, "encrypt_error", false);
                }
            }
            com.bytedance.sdk.component.ra.vt vtVarOuw = yuVarOuw.ouw();
            boolean zFkw = (vtVarOuw == null || !vtVarOuw.pno || TextUtils.isEmpty(vtVarOuw.yu)) ? false : fkw(PangleVideoBridge.jsonObjectInit(vtVarOuw.yu));
            String str3 = "error unknown";
            int i10 = vtVarOuw != null ? vtVarOuw.ouw : 0;
            if (zFkw || i10 != 200) {
                if (vtVarOuw != null && (str2 = vtVarOuw.vt) != null) {
                    str3 = str2;
                }
                z10 = false;
            } else {
                str3 = "server say not success";
                z10 = true;
            }
            if (vtVarOuw == null) {
                com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("applog", str, -1, "response is null");
            } else if (!vtVarOuw.pno) {
                com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("applog", str, i10, vtVarOuw.vt);
            }
            if ("5001121".contains(bly.ouw().vt)) {
                try {
                    jSONObject.getJSONObject("header").put(C3784xa.f31580b, "4562");
                } catch (Exception e11) {
                    com.bytedance.sdk.component.utils.qbp.yu("NetApiImpl", "reportETEvent error", e11.getMessage());
                }
                com.bytedance.sdk.component.ra.vt.yu yuVarOuw2 = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
                yuVarOuw2.ouw(com.bytedance.sdk.openadsdk.utils.uoy.vpp());
                Pair<Integer, byte[]> pairEncryptType4WithoutBase65 = PangleEncryptManager.encryptType4WithoutBase64(fkw(jSONObject.toString()));
                if (pairEncryptType4WithoutBase65 != null && (obj = pairEncryptType4WithoutBase65.second) != null && ((byte[]) obj).length > 0) {
                    bArr2 = (byte[]) obj;
                    tc.vt(true);
                } else {
                    int iIntValue2 = pairEncryptType4WithoutBase65 != null ? ((Integer) pairEncryptType4WithoutBase65.first).intValue() : 0;
                    tc.vt(false);
                    tc.ouw(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue2);
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    yuVarOuw2.vt("Content-Encoding", "union_sdk_encode");
                    yuVarOuw2.vt("x-pgli18n", "4");
                    yuVarOuw2.ouw("application/octet-stream;tt-data=a", bArr2);
                }
                if (bArr2 == null) {
                    JSONObject jSONObjectOuw2 = com.bytedance.sdk.component.utils.ouw.ouw(jSONObject);
                    if (!lh(jSONObjectOuw2)) {
                        jSONObjectOuw2 = jSONObject;
                    }
                    ouw(yu(jSONObjectOuw2), yuVarOuw2);
                    yuVarOuw2.ouw(jSONObjectOuw2.toString(), zih.yu().pno());
                }
                yuVarOuw2.f11911ra = 7;
                yuVarOuw2.f11910le = "et_applog";
                try {
                    yuVarOuw2.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.jqy.15
                        @Override // com.bytedance.sdk.component.ra.ouw.ouw
                        public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                            com.bytedance.sdk.component.utils.ko.vt("NetApiImpl", "onFailure: ", iOException.getMessage());
                        }

                        @Override // com.bytedance.sdk.component.ra.ouw.ouw
                        public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                            if (vtVar == null || !vtVar.pno) {
                                com.bytedance.sdk.component.utils.ko.lh("NetApiImpl", "onResponse: NetResponse is null");
                            } else {
                                com.bytedance.sdk.component.utils.ko.vt("NetApiImpl", "onResponse: ", vtVar.yu);
                            }
                        }
                    });
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return new com.bytedance.sdk.openadsdk.yu.fkw(zFkw, i10, str3, z10);
        } catch (Throwable th3) {
            th = th3;
        }
        com.bytedance.sdk.component.utils.qbp.ouw("NetApiImpl", "uploadEvent error", th);
        return new com.bytedance.sdk.openadsdk.yu.fkw(false, 509, "service_busy", false);
    }

    private static void ouw(Map<String, String> map, com.bytedance.sdk.component.ra.vt.yu yuVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    yuVar.vt(entry.getKey(), entry.getValue());
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.qbp.yu("NetApiImpl", "ADD header exceptopn", e10.getMessage());
                }
            }
        }
        try {
            yuVar.vt("User-Agent", com.bytedance.sdk.openadsdk.utils.uoy.fkw());
        } catch (Exception e11) {
            com.bytedance.sdk.component.utils.qbp.yu("NetApiImpl", "ADD header exceptopn", e11.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void ouw(@NonNull String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        if (com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            JSONObject jSONObjectVt = vt(str, list, jSONObject, str2, str3);
            com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
            final String strVt = com.bytedance.sdk.openadsdk.utils.uoy.vt("/api/ad/union/dislike_event/");
            JSONObject jSONObjectOuw = ouw(PangleEncryptConstant.CryptDataScene.DISLIKE, jSONObjectVt);
            String string = jSONObjectOuw != null ? jSONObjectOuw.toString() : null;
            ouw(yuVarOuw, jSONObjectOuw);
            yuVarOuw.ouw(strVt);
            yuVarOuw.lh(string);
            yuVarOuw.f11911ra = 7;
            yuVarOuw.f11910le = "dislike";
            com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.2
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.f13464lh = "dislike";
                    return ouwVar;
                }
            });
            yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.jqy.3
                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("dislike", strVt, -1, iOException != null ? iOException.getMessage() : "null");
                    if (lhVar != null) {
                        com.bytedance.sdk.openadsdk.utils.zin.ouw(lhVar.fkw());
                    }
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.3.4
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f13464lh = "dislike";
                            return ouwVar;
                        }
                    });
                }

                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                    if (vtVar != null) {
                        if (vtVar.pno) {
                            com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.3.1
                                @Override // com.bytedance.sdk.openadsdk.vm.yu
                                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                    ouwVar.f13464lh = "dislike";
                                    return ouwVar;
                                }
                            });
                            return;
                        } else {
                            com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.3.2
                                @Override // com.bytedance.sdk.openadsdk.vm.yu
                                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                    ouwVar.f13464lh = "dislike";
                                    return ouwVar;
                                }
                            });
                            com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("dislike", strVt, vtVar.ouw, vtVar.vt);
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("dislike", strVt, -1, "response is null");
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.3.3
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f13464lh = "dislike";
                            return ouwVar;
                        }
                    });
                }
            });
            try {
                String strOptString = PangleVideoBridge.jsonObjectInit(str).optString("cid", "");
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("dislike", strOptString, (String) null, (String) null);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.qbp.yu(e10.getMessage(), new Object[0]);
            }
        }
    }

    private static JSONObject ouw(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new ex(cryptDataScene));
        tc.ouw(jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    private static JSONArray ouw(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    private static void ouw(vpp.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
        ouwVar.ouw(-1, pno.ouw(-1));
        lhVar.vt = -1;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
    }

    public static JSONObject ouw(AdSlot adSlot) {
        jae jaeVar;
        JSONObject jSONObject = new JSONObject();
        try {
            int iOuw = zih.yu().pno.ouw("privacy_personalized_ad", Integer.MAX_VALUE);
            if (iOuw == Integer.MAX_VALUE) {
                int iTc = com.bytedance.sdk.openadsdk.utils.uoy.tc();
                if (iTc == 1 || iTc == 2) {
                    iOuw = 2;
                } else {
                    iOuw = iTc != 3 ? 0 : 1;
                }
            }
            jSONObject.put("personalized_ad", iOuw);
            jSONObject.put("lmt", DeviceUtils.lh());
            jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, bly.ouw().tlj());
            jSONObject.put("pa_consent", bly.ouw().f12503ra);
            jSONObject.put("is_gdpr_user", zih.yu().pno.ouw("isGdprUser", -1));
            if (adSlot != null && jae.ouw.containsKey(Integer.valueOf(adSlot.getCodeId())) && (jaeVar = jae.ouw.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", jaeVar.vt);
                jSONObject.put("lastbundle", jaeVar.f12686lh);
                jSONObject.put("lastclick", jaeVar.yu);
                jSONObject.put("lastskip", jaeVar.fkw);
            }
            String strVt = vt(adSlot);
            if (!TextUtils.isEmpty(strVt)) {
                jSONObject.put("data", strVt);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static JSONObject ouw(AdSlot adSlot, int i10, com.bytedance.sdk.openadsdk.core.model.ksc kscVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("id", adSlot.getCodeId());
            jSONObject3.put("adtype", i10);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject4 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject4.put(CreativeInfo.f44321c, adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject4.put("creative_id", adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject4.put("ext", adSlot.getExt());
                }
                jSONObject3.put("preview_ads", jSONObject4);
            }
            if (kscVar != null) {
                jSONObject3.put("render_method", kscVar.bly);
                int i11 = kscVar.bly;
                if (i11 == 1) {
                    ouw(jSONObject3, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i11 == 2) {
                    float expressViewAcceptedWidth = adSlot.getExpressViewAcceptedWidth();
                    float expressViewAcceptedHeight = adSlot.getExpressViewAcceptedHeight();
                    if (expressViewAcceptedWidth >= 0.0f && expressViewAcceptedHeight >= 0.0f) {
                        JSONObject jSONObject5 = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        try {
                            jSONObject5.put("width", (int) expressViewAcceptedWidth);
                            jSONObject5.put("height", (int) expressViewAcceptedHeight);
                            jSONArray.put(jSONObject5);
                            jSONObject3.put("accepted_size", jSONArray);
                        } catch (Exception unused) {
                        }
                    }
                }
            } else {
                jSONObject3.put("render_method", 1);
                ouw(jSONObject3, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject3.put("ptpl_ids", lh(adSlot.getCodeId()));
            jSONObject3.put("ugen_ptpl_ids", yu(adSlot.getCodeId()));
            jSONObject3.put("ptpl_ids_v3", yu(adSlot.getCodeId() + "_v3"));
            jSONObject3.put("pos", AdSlot.getPosition(i10));
            jSONObject3.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (i10 == 1 || i10 == 5) {
                jSONObject3.put("is_origin_ad", true);
            }
            if (kscVar != null && (jSONObject2 = kscVar.f12777ra) != null) {
                jSONObject3.put("session_params", jSONObject2);
            }
            if (kscVar != null && (jSONObject = kscVar.pno) != null) {
                jSONObject3.put("common_params", jSONObject);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i10 == 7 || i10 == 8) {
                adCount = 1;
            }
            if (kscVar != null && kscVar.fkw != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject3.put("ad_count", adCount);
            if (i10 == 1) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject6.put("rotate_time", adSlot.getRotateTime());
                jSONObject6.put("rotate_order", adSlot.getRotateOrder());
                jSONObject6.put("type", adSlot.getBannerType());
                jSONObject3.put("banner", jSONObject6);
            }
        } catch (Exception unused2) {
        }
        return jSONObject3;
    }

    private static void ouw(JSONObject jSONObject, String str, int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i10);
            jSONObject2.put("height", i11);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void ouw(JSONObject jSONObject, final vpp.vt vtVar) {
        if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            vtVar.ouw(1000, "Ad request is temporarily paused, Please contact your AM");
            return;
        }
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOuw = ouw(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
        com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
        try {
            yuVarOuw.ouw(com.bytedance.sdk.openadsdk.bly.lh.ouw(com.bytedance.sdk.openadsdk.utils.uoy.vt("/api/ad/union/sdk/reward_video/reward/")));
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e10.getMessage());
        }
        ouw(yuVarOuw, jSONObjectOuw);
        yuVarOuw.lh(jSONObjectOuw != null ? jSONObjectOuw.toString() : "");
        yuVarOuw.f11911ra = 10;
        yuVarOuw.f11910le = "reward";
        com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.4
            @Override // com.bytedance.sdk.openadsdk.vm.yu
            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                ouwVar.f13464lh = "reward";
                return ouwVar;
            }
        });
        yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.jqy.5
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                String message = iOException != null ? iOException.getMessage() : "";
                vtVar.ouw(-2, message);
                if (lhVar != null) {
                    String strFkw = lhVar.fkw();
                    com.bytedance.sdk.openadsdk.utils.zin.ouw(strFkw);
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("reward", strFkw, -1, message);
                }
                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.5.4
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f13464lh = "reward";
                        return ouwVar;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar2) throws JSONException {
                if (vtVar2 != null) {
                    if (vtVar2.pno && !TextUtils.isEmpty(vtVar2.yu)) {
                        try {
                            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(vtVar2.yu);
                            String strOuw = jqy.ouw(jSONObjectJsonObjectInit.optInt("cypher", -1), jSONObjectJsonObjectInit.optString("message"));
                            if (!TextUtils.isEmpty(strOuw)) {
                                try {
                                    jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(strOuw);
                                } catch (Throwable unused) {
                                }
                            }
                            vt vtVarOuw = vt.ouw(jSONObjectJsonObjectInit);
                            int i10 = vtVarOuw.ouw;
                            if (i10 != 20000) {
                                vtVar.ouw(i10, pno.ouw(i10));
                            } else if (vtVarOuw.f12697lh == null) {
                                jqy.ouw(vtVar);
                            } else {
                                vtVar.ouw(vtVarOuw);
                                com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.5.1
                                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                        ouwVar.f13464lh = "reward";
                                        return ouwVar;
                                    }
                                });
                            }
                        } catch (JSONException e11) {
                            com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e11.getMessage());
                            jqy.ouw(vtVar);
                        }
                    } else {
                        String strOuw2 = pno.ouw(-2);
                        int i11 = vtVar2.ouw;
                        if (!vtVar2.pno && !TextUtils.isEmpty(vtVar2.vt)) {
                            strOuw2 = vtVar2.vt;
                        }
                        vtVar.ouw(i11, strOuw2);
                        com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.5.2
                            @Override // com.bytedance.sdk.openadsdk.vm.yu
                            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                ouwVar.f13464lh = "reward";
                                return ouwVar;
                            }
                        });
                        if (vtVar2.pno) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("reward", lhVar.fkw(), i11, strOuw2);
                    }
                } else {
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.5.3
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f13464lh = "reward";
                            return ouwVar;
                        }
                    });
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("reward", lhVar.fkw(), -1, "response is null");
                    jqy.ouw(vtVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final JSONObject ouw(JSONObject jSONObject) throws JSONException {
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString("message");
            String strOptString2 = jSONObject.optString("auction_price", "");
            String strOuw = ouw(iOptInt, strOptString);
            if (TextUtils.isEmpty(strOuw)) {
                return jSONObject;
            }
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(strOuw);
            try {
                jSONObjectJsonObjectInit.put("auction_price", strOptString2);
            } catch (Throwable unused) {
            }
            return jSONObjectJsonObjectInit;
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    @Nullable
    public static String ouw(int i10, String str) {
        Object obj;
        if (i10 == 3) {
            return com.bytedance.sdk.component.utils.ouw.vt(str);
        }
        if (i10 == 4) {
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(str);
            if (pairDecryptType4 != null && (obj = pairDecryptType4.second) != null) {
                String str2 = (String) obj;
                tc.ouw(true);
                return str2;
            }
            tc.ouw(false);
            tc.ouw(2, PangleEncryptConstant.CryptDataScene.GET_ADS, pairDecryptType4 != null ? ((Integer) pairDecryptType4.first).intValue() : 0);
        }
        return null;
    }

    private static void ouw(com.bytedance.sdk.component.ra.vt.yu yuVar, JSONObject jSONObject) {
        try {
            if (lh(jSONObject) && jSONObject.optInt("cypher") == 4) {
                yuVar.vt("x-pgli18n", "4");
                yuVar.vt("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouw() {
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarOuw = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            return null;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tpl_fetch_model", "date", 0L);
        String strOuw = zih.yu().pno.ouw("dyn_draw_engine_url", com.bytedance.sdk.openadsdk.core.settings.cf.yu);
        String strVt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tpl_fetch_model", "last_url", "");
        int iOuw = zih.yu().pno.ouw("fetch_tpl_second", 0);
        if (jCurrentTimeMillis <= (iOuw > 0 ? iOuw : 0) && jCurrentTimeMillis >= 0 && TextUtils.equals(strOuw, strVt)) {
            String strVt2 = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(strVt2)) {
                    return com.bytedance.sdk.component.adexpress.ouw.lh.ouw.ouw(strVt2);
                }
            } catch (Exception unused) {
            }
        }
        try {
            com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
            String strOuw2 = com.bytedance.sdk.openadsdk.bly.lh.ouw(strOuw);
            vtVarVt.ouw(strOuw2);
            com.bytedance.sdk.component.ra.vt vtVarOuw = vtVarVt.ouw();
            if (vtVarOuw == null || !vtVarOuw.pno) {
                return null;
            }
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(vtVarOuw.yu);
            jSONObjectJsonObjectInit.put("template_fetch_url", strOuw2);
            ouwVarOuw = com.bytedance.sdk.component.adexpress.ouw.lh.ouw.ouw(jSONObjectJsonObjectInit);
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tpl_fetch_model", "model", jSONObjectJsonObjectInit.toString());
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tpl_fetch_model", "last_url", strOuw);
            return ouwVarOuw;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", th2.getMessage());
            return ouwVarOuw;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void ouw(String str) {
        com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
        vtVarVt.ouw(str);
        vtVarVt.f11910le = "upload_bidding";
        vtVarVt.f11911ra = 7;
        vtVarVt.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.jqy.6
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                com.bytedance.sdk.component.utils.ko.vt("client bidding fail", iOException.toString());
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                com.bytedance.sdk.component.utils.ko.vt("client bidding success", vtVar.yu);
            }
        });
    }

    public static /* synthetic */ void ouw(vpp.vt vtVar) {
        vtVar.ouw(-1, pno.ouw(-1));
    }
}
