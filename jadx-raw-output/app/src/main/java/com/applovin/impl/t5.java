package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import androidx.appcompat.widget.ActivityChooserModel;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.security.ProviderInstaller;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.utils.SdksMapping;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class t5 extends i5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicBoolean f9608j = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f9609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f9610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f9611i;

    public class a extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f9612m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10, long j10) {
            super(aVar, kVar, z10);
            this.f9612m = j10;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9612m;
            t5.this.a(jSONObject);
            this.f7705a.v0().d(d2.f7207h, t5.this.a(str, jElapsedRealtime, i10, jSONObject, null));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Unable to fetch basic SDK settings: server returned " + i10);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9612m;
            t5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.f7705a.v0().d(d2.f7209i, t5.this.a(str, jElapsedRealtime, i10, jSONObject, str2));
        }
    }

    public interface b {
        void a(JSONObject jSONObject);
    }

    public class c extends i5 {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f9611i != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "Timing out fetch basic settings...");
                }
                t5.this.a(new JSONObject());
            }
        }
    }

    public t5(int i10, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.f9610h = new Object();
        this.f9609g = i10;
        this.f9611i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return r0.a((String) this.f7705a.a(x4.f9964k0), "5.0/i", b());
    }

    private String g() {
        return r0.a((String) this.f7705a.a(x4.f9955j0), "5.0/i", b());
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.k kVar = this.f7705a;
            x4 x4Var = x4.f10091z5;
            if (((Boolean) kVar.a(x4Var)).booleanValue() || ((Boolean) this.f7705a.a(x4Var)).booleanValue()) {
                jSONObject.put(ImpressionLog.f43648x, UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", j.b());
            jSONObject.put("init_count", this.f9609g);
            jSONObject.put("server_installed_at", this.f7705a.a(x4.f9997o));
            if (this.f7705a.C0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f7705a.z0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", n7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", n7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f7705a.a(x4.L3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f7705a.V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f7705a.C());
            jSONObject.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, w3.b(this.f7705a));
            Map mapG = this.f7705a.A().G();
            jSONObject.put("package_name", mapG.get("package_name"));
            jSONObject.put("app_version", mapG.get("app_version"));
            jSONObject.put("debug", mapG.get("debug"));
            jSONObject.put("tg", mapG.get("tg"));
            jSONObject.put("target_sdk", mapG.get("target_sdk"));
            jSONObject.put("session_id", mapG.get("session_id"));
            List list = (List) mapG.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            List list2 = (List) mapG.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            List<String> adUnitIds = this.f7705a.J() != null ? this.f7705a.J().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", mapG.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_gdprApplies", mapG.get("IABTCF_gdprApplies"));
            Object obj = mapG.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f7705a.x().b());
            Map mapN = this.f7705a.A().N();
            jSONObject.put("platform", mapN.get("platform"));
            jSONObject.put(Q6.F, mapN.get(Q6.F));
            jSONObject.put(CommonUrlParts.LOCALE, mapN.get(CommonUrlParts.LOCALE));
            jSONObject.put("brand", mapN.get("brand"));
            jSONObject.put("brand_name", mapN.get("brand_name"));
            jSONObject.put("hardware", mapN.get("hardware"));
            jSONObject.put("model", mapN.get("model"));
            jSONObject.put("revision", mapN.get("revision"));
            jSONObject.put("is_tablet", mapN.get("is_tablet"));
            jSONObject.put("screen_size_in", mapN.get("screen_size_in"));
            jSONObject.put("supported_abis", mapN.get("supported_abis"));
            Object obj2 = mapN.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) this.f7705a.a(x4.W3)).booleanValue()) {
                jSONObject.put("mtl", this.f7705a.m0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.k.o().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            v.a aVarF = this.f7705a.A().f();
            jSONObject.put("dnt", aVarF.c());
            jSONObject.put("dnt_code", aVarF.b().b());
            Boolean boolB = p0.c().b(a());
            if (((Boolean) this.f7705a.a(x4.G3)).booleanValue() && StringUtils.isValidString(aVarF.a()) && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfa", aVarF.a());
            }
            com.applovin.impl.sdk.l.b bVarH = this.f7705a.A().H();
            if (((Boolean) this.f7705a.a(x4.f10089z3)).booleanValue() && bVarH != null && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfv", bVarH.f9367a);
                jSONObject.put("idfv_scope", bVarH.f9368b);
            }
            if (((Boolean) this.f7705a.a(x4.C3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f7705a.u());
            }
            if (((Boolean) this.f7705a.a(x4.E3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f7705a.h0());
            }
            if (((Boolean) this.f7705a.a(x4.I3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f7705a.r());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f7705a.E());
            if (this.f7705a.s0().c()) {
                jSONObject.put("test_mode", true);
            }
            List listB = this.f7705a.s0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f7705a.n0().getExtraParameters()));
            Map mapK0 = this.f7705a.k0();
            if (!CollectionUtils.isEmpty(mapK0)) {
                jSONObject.put("segments", new JSONObject(mapK0));
            }
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Failed to create JSON body", e10);
            }
            this.f7705a.D().a(this.f7706b, "createJSONBody", e10);
        }
        return jSONObject;
    }

    public Map h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f7705a.a(x4.A5)).booleanValue() && !((Boolean) this.f7705a.a(x4.f10091z5)).booleanValue()) {
            map.put(ImpressionLog.f43648x, UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f7705a.a(x4.f9969k5)).booleanValue()) {
            map.put("sdk_key", this.f7705a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f7705a.q(), map);
        Boolean boolB = p0.b().b(a());
        if (boolB != null) {
            map.put("huc", boolB.toString());
        }
        Boolean boolB2 = p0.c().b(a());
        if (boolB2 != null) {
            map.put("aru", boolB2.toString());
        }
        Boolean boolB3 = p0.a().b(a());
        if (boolB3 != null) {
            map.put("dns", boolB3.toString());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!o0.i() && f9608j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.k.o());
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.a(this.f7706b, "Cannot update security provider", th2);
                }
            }
        }
        this.f7705a.v0().d(d2.f7205g, b(g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map mapH = h();
        com.applovin.impl.sdk.network.a.C0048a c0048aB = com.applovin.impl.sdk.network.a.a(this.f7705a).b(g()).a(f()).b(mapH).a(e()).b(((Boolean) this.f7705a.a(x4.L5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.f7705a.a(x4.f9895c3)).intValue()).b(((Integer) this.f7705a.a(x4.f9922f3)).intValue());
        com.applovin.impl.sdk.k kVar = this.f7705a;
        x4 x4Var = x4.f9886b3;
        com.applovin.impl.sdk.network.a aVarA = c0048aB.c(((Integer) kVar.a(x4Var)).intValue()).e(((Boolean) this.f7705a.a(x4.f10001o3)).booleanValue()).a(u4.a.a(((Integer) this.f7705a.a(x4.f10011p5)).intValue())).f(true).a();
        this.f7705a.q0().a(new c(this.f7705a), d6.b.TIMEOUT, ((long) ((Integer) this.f7705a.a(x4Var)).intValue()) + 250);
        a aVar = new a(aVarA, this.f7705a, d(), jElapsedRealtime);
        aVar.c(x4.f9955j0);
        aVar.b(x4.f9964k0);
        this.f7705a.q0().a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j10, int i10, JSONObject jSONObject, String str2) {
        Uri uriBuild = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, C3426d4.j.D, uriBuild.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap map = new HashMap();
        map.put("attempt_number", Integer.toString(this.f9609g));
        map.put("error_message", str2);
        map.put("url", uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put("duration_ms", Long.toString(j10));
        map.put("code", Integer.toString(i10));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f9610h) {
            bVar = this.f9611i;
            this.f9611i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
