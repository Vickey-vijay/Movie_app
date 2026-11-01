package com.bytedance.sdk.openadsdk.yu;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ouw implements com.bytedance.sdk.component.le.ouw.yu.ouw.vt {
    private int bly;
    private String ex;
    private long fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private String f13551jg;
    private int jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private String f13552ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final String f13553le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f13554lh;
    private JSONObject mwh;
    public final String ouw;
    private int pno;
    private com.bytedance.sdk.openadsdk.yu.vt.ouw qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f13555ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private String f13556rn;
    private final AtomicBoolean ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private String f13557th;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private String f13558vm;
    private String vpp;
    public final JSONObject vt;
    private long yu;
    private String zih;
    private String zin;
    private static final Set<String> tlj = new HashSet(Arrays.asList("insight_log"));

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private static final Map<String, String> f13550cf = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put(IronSourceConstants.EVENTS_ERROR_CODE, "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.yu.ouw$ouw, reason: collision with other inner class name */
    public static final class C0158ouw {
        public JSONObject bly;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public final int f13559cf;
        public String fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public int f13560jg;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        public int f13561ko;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public String f13562le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f13563lh;
        public com.bytedance.sdk.openadsdk.yu.vt.ouw mwh;
        public String ouw;
        public String pno;
        private final long qbp;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public String f13564ra;

        /* JADX INFO: renamed from: rn, reason: collision with root package name */
        public int f13565rn;
        public String ryl;

        /* JADX INFO: renamed from: th, reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.yu.vt.vt f13566th;
        public String tlj;

        /* JADX INFO: renamed from: vm, reason: collision with root package name */
        public String f13567vm;
        public String vt;
        public String yu;
        public boolean zih;

        public final C0158ouw ouw(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.bly = jSONObject;
            return this;
        }

        public final void ouw(com.bytedance.sdk.openadsdk.yu.vt.ouw ouwVar) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw(this.f13563lh, this.f13567vm, this.f13562le, this.vt);
            this.mwh = ouwVar;
            final ouw ouwVar2 = new ouw(this);
            try {
                com.bytedance.sdk.openadsdk.yu.vt.vt vtVar = this.f13566th;
                if (vtVar != null) {
                    vtVar.ouw(ouwVar2.vt, this.qbp);
                } else {
                    new com.bytedance.sdk.openadsdk.yu.vt.lh().ouw(ouwVar2.vt, this.qbp);
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ko.lh("AdEvent", th2);
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                bs.lh(new com.bytedance.sdk.component.pno.pno("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ouw.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(ouwVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(ouwVar2);
            }
        }

        public C0158ouw(long j10, vpp vppVar) {
            this.f13560jg = -1;
            this.f13561ko = -1;
            this.f13565rn = -1;
            if (vppVar != null) {
                this.zih = od.vt(vppVar);
                this.f13560jg = vppVar.bs;
                this.f13561ko = vppVar.fvf;
                this.f13565rn = vppVar.ucs;
            }
            this.qbp = j10;
            this.f13559cf = ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
        }
    }

    public ouw(String str, JSONObject jSONObject) {
        this.f13553le = "adiff";
        this.ryl = new AtomicBoolean(false);
        this.mwh = new JSONObject();
        this.ouw = str;
        this.vt = jSONObject;
    }

    private static boolean ouw(String str) {
        str.hashCode();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private static boolean ouw(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.hashCode();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    public final boolean le() {
        Set<String> setEy;
        if (this.vt == null || (setEy = com.bytedance.sdk.openadsdk.core.zih.yu().ey()) == null) {
            return false;
        }
        String strOptString = this.vt.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setEy.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.f13552ko)) {
            return false;
        }
        return setEy.contains(this.f13552ko);
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw.vt
    public final long lh() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw.vt
    public final long vt() {
        return this.fkw;
    }

    public JSONObject yu() {
        if (this.ryl.get()) {
            return this.vt;
        }
        try {
            this.vt.putOpt("app_log_url", this.ex);
            this.vt.putOpt("tag", this.f13551jg);
            this.vt.putOpt("label", this.f13552ko);
            this.vt.putOpt("category", this.f13556rn);
            if (!TextUtils.isEmpty(this.zih)) {
                try {
                    this.vt.putOpt("value", Long.valueOf(Long.parseLong(this.zih)));
                } catch (NumberFormatException unused) {
                    this.vt.putOpt("value", 0L);
                }
            }
            if (!TextUtils.isEmpty(this.f13557th)) {
                try {
                    this.vt.putOpt("ext_value", Long.valueOf(Long.parseLong(this.f13557th)));
                } catch (Exception unused2) {
                }
            }
            if (!TextUtils.isEmpty(this.vpp)) {
                this.vt.putOpt("log_extra", this.vpp);
            }
            if (!TextUtils.isEmpty(this.zin)) {
                try {
                    this.vt.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.zin)));
                } catch (NumberFormatException unused3) {
                }
            }
            JSONObject jSONObject = this.vt;
            String str = this.f13552ko;
            try {
                Set<String> set = tlj;
                if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                    jSONObject.putOpt("is_ad_event", "1");
                }
            } catch (Throwable th2) {
                qbp.yu("AdEvent", th2);
            }
            try {
                this.vt.putOpt("nt", Integer.valueOf(this.jqy));
            } catch (Exception unused4) {
            }
            Iterator<String> itKeys = this.mwh.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.vt.putOpt(next, this.mwh.opt(next));
            }
            if (this.vt.has("ad_extra_data")) {
                Object objOpt = this.vt.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            com.bytedance.sdk.component.utils.ko.fkw("AdEvent", "ad_extra_data is JSONObject");
                            this.vt.put("ad_extra_data", ouw((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.vt.put("ad_extra_data", ouw(PangleVideoBridge.jsonObjectInit((String) objOpt)).toString());
                        }
                    } catch (JSONException e10) {
                        qbp.yu("AdEvent", "json error", e10.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("adiff", this.ouw);
                    if (this.f13554lh) {
                        jSONObject2.put("interaction_method", this.f13555ra);
                        jSONObject2.put("real_interaction_method", this.pno);
                        jSONObject2.put("image_mode", this.bly);
                    }
                    this.vt.put("ad_extra_data", jSONObject2.toString());
                } catch (JSONException e11) {
                    qbp.yu("AdEvent", "json error", e11.getMessage());
                }
            }
            this.ryl.set(true);
        } catch (Throwable th3) {
            com.bytedance.sdk.component.utils.ko.lh("AdEvent", th3);
        }
        return this.vt;
    }

    public final JSONObject fkw() {
        JSONObject jSONObjectYu = yu();
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(jSONObjectYu.toString());
            JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.remove("app_log_url");
            }
            return jSONObjectJsonObjectInit;
        } catch (JSONException e10) {
            qbp.lh("AdEvent", e10.getMessage());
            return jSONObjectYu;
        }
    }

    private JSONObject ouw(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.ouw);
            }
            if (this.f13554lh) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.f13555ra);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.pno);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.bly);
                }
            }
            for (String str : f13550cf.keySet()) {
                try {
                    if (jSONObject.has(str)) {
                        Object objOpt = jSONObject.opt(str);
                        jSONObject.remove(str);
                        jSONObject.put(f13550cf.get(str), objOpt);
                    }
                } catch (Throwable unused) {
                }
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.ouw + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th2) {
            qbp.lh("AdEvent", th2.getMessage() == null ? "error " : th2.getMessage());
            return jSONObject;
        }
    }

    public ouw(C0158ouw c0158ouw) {
        this.f13553le = "adiff";
        this.ryl = new AtomicBoolean(false);
        this.mwh = new JSONObject();
        if (TextUtils.isEmpty(c0158ouw.ouw)) {
            this.ouw = ex.ouw();
        } else {
            this.ouw = c0158ouw.ouw;
        }
        this.qbp = c0158ouw.mwh;
        this.vpp = c0158ouw.fkw;
        this.f13551jg = c0158ouw.vt;
        this.f13552ko = c0158ouw.f13563lh;
        if (TextUtils.isEmpty(c0158ouw.yu)) {
            this.f13556rn = "app_union";
        } else {
            this.f13556rn = c0158ouw.yu;
        }
        this.zin = c0158ouw.tlj;
        this.zih = c0158ouw.f13564ra;
        this.f13557th = c0158ouw.pno;
        this.f13558vm = c0158ouw.f13562le;
        this.jqy = c0158ouw.f13559cf;
        this.ex = c0158ouw.ryl;
        JSONObject jSONObject = c0158ouw.bly;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        c0158ouw.bly = jSONObject;
        this.mwh = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        this.vt = jSONObject2;
        if (!TextUtils.isEmpty(c0158ouw.ryl)) {
            try {
                jSONObject2.put("app_log_url", c0158ouw.ryl);
            } catch (JSONException e10) {
                qbp.lh("AdEvent", e10.getMessage());
            }
        }
        this.f13555ra = c0158ouw.f13560jg;
        this.pno = c0158ouw.f13561ko;
        this.bly = c0158ouw.f13565rn;
        this.f13554lh = c0158ouw.zih;
        this.fkw = System.currentTimeMillis();
        JSONObject jSONObject3 = this.mwh;
        if (jSONObject3 == null) {
            if (!ouw(this.zih, this.f13556rn, this.vpp)) {
                return;
            }
        } else {
            String strOptString = jSONObject3.optString("value");
            String strOptString2 = this.mwh.optString("category");
            String strOptString3 = this.mwh.optString("log_extra");
            if (ouw(this.zih, this.f13556rn, this.vpp)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !ouw(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.zih) || TextUtils.equals(this.zih, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.f13556rn) || !ouw(this.f13556rn)) && (TextUtils.isEmpty(strOptString2) || !ouw(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.vpp) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        }
        this.yu = com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw.incrementAndGet();
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw.vt
    public final JSONObject ouw() {
        return yu();
    }
}
