package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3803yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JSONObject f31660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, JSONObject> f31661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f31662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f31663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f31664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C3803yc f31665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final mj.g f31666l;

    /* JADX INFO: renamed from: com.ironsource.yc$a */
    public static final class a extends Lambda implements bk.a<NetworkSettings> {
        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String strJ = C3803yc.this.j();
            String strL = C3803yc.this.l();
            String strH = C3803yc.this.h();
            String strK = C3803yc.this.k();
            JSONObject jSONObjectC = C3803yc.this.c();
            C3803yc c3803yc = C3803yc.this.f31665k;
            JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC, c3803yc != null ? c3803yc.c() : null);
            JSONObject jSONObjectM = C3803yc.this.m();
            C3803yc c3803yc2 = C3803yc.this.f31665k;
            JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectM, c3803yc2 != null ? c3803yc2.m() : null);
            JSONObject jSONObjectE = C3803yc.this.e();
            C3803yc c3803yc3 = C3803yc.this.f31665k;
            JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectE, c3803yc3 != null ? c3803yc3.e() : null);
            JSONObject jSONObjectD = C3803yc.this.d();
            C3803yc c3803yc4 = C3803yc.this.f31665k;
            JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectD, c3803yc4 != null ? c3803yc4.d() : null);
            JSONObject jSONObjectG = C3803yc.this.g();
            C3803yc c3803yc5 = C3803yc.this.f31665k;
            NetworkSettings networkSettings = new NetworkSettings(strJ, strL, strH, strK, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4, IronSourceUtils.b(jSONObjectG, c3803yc5 != null ? c3803yc5.g() : null));
            networkSettings.setIsMultipleInstances(C3803yc.this.o());
            networkSettings.setSubProviderId(C3803yc.this.n());
            networkSettings.setAdSourceNameForEvents(C3803yc.this.b());
            return networkSettings;
        }
    }

    public final String b() {
        return this.f31663i;
    }

    public C3803yc(String str, JSONObject jSONObject) {
        ck.p.j(str, "providerName");
        ck.p.j(jSONObject, "networkSettings");
        this.f31655a = str;
        this.f31656b = str;
        String strOptString = jSONObject.optString("providerLoadName", str);
        ck.p.i(strOptString, "networkSettings.optStrin…,\n          providerName)");
        this.f31657c = strOptString;
        String strOptString2 = jSONObject.optString("providerDefaultInstance", strOptString);
        ck.p.i(strOptString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.f31658d = strOptString2;
        Object objOpt = jSONObject.opt("providerNetworkKey");
        this.f31659e = objOpt instanceof String ? (String) objOpt : null;
        this.f31660f = jSONObject.optJSONObject("application");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(adFormatArrValues.length);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            arrayList.add(C3772wf.a(adFormat));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str2 = (String) obj;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adFormats");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str2) : null;
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = IronSourceVideoBridge.jsonObjectInit();
            }
            linkedHashMap.put(obj, jSONObjectOptJSONObject2);
        }
        this.f31661g = linkedHashMap;
        String strOptString3 = jSONObject.optString("spId", "0");
        ck.p.i(strOptString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.f31662h = strOptString3;
        String strOptString4 = jSONObject.optString("adSourceName");
        ck.p.i(strOptString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.f31663i = strOptString4;
        this.f31664j = jSONObject.optBoolean("mpis", false);
        this.f31666l = kotlin.b.a(new a());
    }

    public final Map<String, JSONObject> a() {
        return this.f31661g;
    }

    public final void b(C3803yc c3803yc) {
        this.f31665k = c3803yc;
    }

    public final JSONObject c() {
        return this.f31660f;
    }

    public final JSONObject d() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f31661g.get("banner"), this.f31660f);
        ck.p.i(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final JSONObject e() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f31661g.get("interstitial"), this.f31660f);
        ck.p.i(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final NetworkSettings f() {
        return (NetworkSettings) this.f31666l.getValue();
    }

    public final JSONObject g() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f31661g.get("nativeAd"), this.f31660f);
        ck.p.i(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final String h() {
        return this.f31658d;
    }

    public final String i() {
        return this.f31656b;
    }

    public final String j() {
        return this.f31655a;
    }

    public final String k() {
        return this.f31659e;
    }

    public final String l() {
        return this.f31657c;
    }

    public final JSONObject m() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f31661g.get("rewarded"), this.f31660f);
        ck.p.i(jSONObjectB, "mergeJsons(\n            …     applicationSettings)");
        return jSONObjectB;
    }

    public final String n() {
        return this.f31662h;
    }

    public final boolean o() {
        return this.f31664j;
    }
}
