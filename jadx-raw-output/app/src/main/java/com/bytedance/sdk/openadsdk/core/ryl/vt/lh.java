package com.bytedance.sdk.openadsdk.core.ryl.vt;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class lh {
    private static final Map<String, vt> ouw = new ConcurrentHashMap();
    private static final AtomicBoolean yu = new AtomicBoolean(false);
    private final boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private EnumC0134lh f13029le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f13030lh;
    public final String vt;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ryl.vt.lh$lh, reason: collision with other inner class name */
    public enum EnumC0134lh {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private EnumC0134lh f13036lh = EnumC0134lh.TRACKING_URL;
        public boolean ouw = false;
        private final String vt;

        public final lh ouw() {
            return new lh(this.vt, this.f13036lh, Boolean.valueOf(this.ouw));
        }

        public ouw(String str) {
            this.vt = str;
        }
    }

    public static class vt {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f13037lh;
        public final vpp ouw;
        public String vt;

        public vt(String str, vpp vppVar) {
            this(str, vppVar, -1.0f);
        }

        public vt(String str, vpp vppVar, float f10) {
            this.vt = str;
            this.ouw = vppVar;
            this.f13037lh = f10;
        }

        public final String toString() {
            return super.toString();
        }
    }

    public static List<com.bytedance.sdk.openadsdk.core.ryl.vt.ouw> lh(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.ryl.vt.ouw.C0135ouw(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).ouw());
                }
            }
        }
        return arrayList;
    }

    public static List<String> ouw(vpp vppVar, @NonNull List<lh> list, @Nullable com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar, @Nullable long j10, @Nullable String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (lh lhVar : list) {
            if (lhVar != null && (!lhVar.f13030lh || lhVar.fkw)) {
                arrayList.add(lhVar.vt);
                lhVar.ouw();
            }
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        com.bytedance.sdk.openadsdk.core.ryl.lh.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.ryl.lh.lh(arrayList, vppVar);
        if (ouwVar != null) {
            lhVar2.ouw.put(com.bytedance.sdk.openadsdk.core.ryl.lh.vt.ERRORCODE, String.valueOf(ouwVar.pno));
        }
        if (j10 >= 0) {
            String strOuw = com.bytedance.sdk.openadsdk.core.ryl.lh.lh.ouw(j10);
            if (!TextUtils.isEmpty(strOuw)) {
                lhVar2.ouw.put(com.bytedance.sdk.openadsdk.core.ryl.lh.vt.CONTENTPLAYHEAD, strOuw);
            }
        }
        com.bytedance.sdk.openadsdk.core.ryl.lh.lh lhVarOuw = lhVar2.ouw(str);
        if (!TextUtils.isEmpty(str2)) {
            lhVarOuw.ouw.put(com.bytedance.sdk.openadsdk.core.ryl.lh.vt.__MRC_IMPRESSION_ID__, str2);
        }
        return lhVarOuw.ouw();
    }

    static {
        ksc.ouw(new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.core.ryl.vt.lh.1
            @Override // com.bytedance.sdk.component.utils.ksc.ouw
            public final void ouw(boolean z10, int i10) {
                if (i10 == 0 || lh.ouw.size() <= 0) {
                    return;
                }
                lh.lh();
            }
        }, zih.ouw());
    }

    public static void vt(vpp vppVar, @NonNull List<lh> list, @Nullable com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar, @Nullable long j10, @Nullable String str, String str2) {
        ouw(vppVar, list, ouwVar, j10, str, null, str2);
    }

    public lh(String str, EnumC0134lh enumC0134lh, Boolean bool) {
        this.vt = str;
        this.f13029le = enumC0134lh;
        this.fkw = bool.booleanValue();
    }

    public static List<com.bytedance.sdk.openadsdk.core.ryl.vt.vt> vt(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.ryl.vt.vt.ouw(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).ouw());
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ void lh() {
        if (yu.compareAndSet(false, true)) {
            Map<String, vt> map = ouw;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    ouw((String) entry.getKey(), (vt) entry.getValue(), true);
                }
            }
            yu.set(false);
        }
    }

    public static boolean ouw(vpp vppVar, @NonNull List<lh> list, @Nullable com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar, @Nullable long j10, @Nullable String str, vt vtVar, @Nullable String str2) {
        List<String> listOuw = ouw(vppVar, list, ouwVar, j10, str, str2);
        ouw(listOuw, vtVar);
        return !listOuw.isEmpty();
    }

    public static void ouw(List<String> list, vt vtVar) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (!TextUtils.isEmpty(str)) {
                ouw(str, vtVar, false);
            }
        }
    }

    private static void ouw(final String str, final vt vtVar, final boolean z10) {
        com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
        vtVarVt.f11915lh = true;
        vtVarVt.ouw(str);
        vtVarVt.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.ryl.vt.lh.2
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar2) {
                int i10;
                vt vtVar3 = vtVar;
                if (vtVar3 == null || vtVar3.ouw == null) {
                    return;
                }
                boolean z11 = false;
                String str2 = null;
                if (vtVar2 != null && vtVar2.pno) {
                    z11 = true;
                } else if (vtVar2 != null) {
                    str2 = vtVar2.ouw + StringUtils.PROCESS_POSTFIX_DELIMITER + vtVar2.vt;
                    if (!z10 && ((i10 = vtVar2.ouw) <= 300 || i10 >= 400)) {
                        lh.ouw.put(str, vtVar);
                    }
                }
                lh.ouw(z11, str2, uoy.lh(vtVar.ouw.uoy()), vtVar, str, z10);
                if (!z11 || lh.ouw.isEmpty()) {
                    return;
                }
                lh.lh();
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                vpp vppVar;
                vt vtVar2 = vtVar;
                if (vtVar2 != null && (vppVar = vtVar2.ouw) != null) {
                    lh.ouw(false, iOException != null ? iOException.getMessage() : null, uoy.lh(vppVar.uoy()), vtVar, str, z10);
                }
                if (z10 || vtVar == null) {
                    return;
                }
                lh.ouw.put(str, vtVar);
            }
        });
    }

    public static JSONArray ouw(List<lh> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            jSONArray.put(list.get(i10).vt);
        }
        return jSONArray;
    }

    public static List<lh> ouw(JSONArray jSONArray) {
        return ouw(jSONArray, false);
    }

    public static List<lh> ouw(JSONArray jSONArray, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    ouw ouwVar = new ouw(strOptString);
                    ouwVar.ouw = z10;
                    arrayList.add(ouwVar.ouw());
                }
            }
        }
        return arrayList;
    }

    public void ouw() {
        this.f13030lh = true;
    }

    public static /* synthetic */ void ouw(final boolean z10, final String str, final String str2, final vt vtVar, final String str3, final boolean z11) {
        vpp vppVar;
        if (vtVar == null || (vppVar = vtVar.ouw) == null) {
            return;
        }
        final boolean zCd = vppVar.cd();
        final String str4 = zCd ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new pno(str4) { // from class: com.bytedance.sdk.openadsdk.core.ryl.vt.lh.3
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", vtVar.vt);
                    jSONObject.put("success", z10);
                    jSONObject.put("url", str3);
                    if (zCd) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put(UnifiedMediationParams.KEY_DESCRIPTION, str);
                        }
                        float f10 = vtVar.f13037lh;
                        if (f10 >= 0.0f) {
                            jSONObject.put("progress", ((double) Math.round(f10 * 100.0f)) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vtVar.ouw, str2, str4, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.ryl.vt.lh.3.1
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject lh() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() {
                        if (!z11) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        });
    }
}
