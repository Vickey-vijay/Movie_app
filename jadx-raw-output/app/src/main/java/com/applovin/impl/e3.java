package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class e3 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final List D;
    private final Map E;
    private final boolean F;
    private final a7 G;
    private final boolean H;
    private final String I;
    private final Map J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f7375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f7379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f7380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f7382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f7383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f7384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f7385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f7386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f7387n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f7388o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f7389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f7390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f7391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f7392s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f7393t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f7394u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f7395v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f7396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f7397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f7398y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f7399z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7405a;

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f7405a;
        }

        a(String str) {
            this.f7405a = str;
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", SupportMenu.CATEGORY_MASK, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", SupportMenu.CATEGORY_MASK, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", SupportMenu.CATEGORY_MASK, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f7414c;

        public String b() {
            return this.f7414c;
        }

        public String c() {
            return this.f7412a;
        }

        public int d() {
            return this.f7413b;
        }

        b(String str, int i10, String str2) {
            this.f7412a = str;
            this.f7413b = i10;
            this.f7414c = str2;
        }
    }

    private a a() {
        a aVar;
        if (!this.f7377d) {
            aVar = this.f7378e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        } else if (this.f7378e) {
            aVar = a.COMPLETE;
        } else {
            aVar = this.f7380g ? a.MISSING : a.INCOMPLETE_INTEGRATION;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f7399z.iterator();
        while (it.hasNext()) {
            if (!((p4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((k1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        if (!this.f7388o || com.applovin.impl.sdk.k.F0()) {
            return E() ? a.INCOMPLETE_INTEGRATION : aVar;
        }
        return a.INVALID_INTEGRATION;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x0257  */
    /* JADX WARN: Code duplicated, block: B:71:0x0269  */
    /* JADX WARN: Code duplicated, block: B:72:0x0275  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:78:0x02c8  */
    public e3(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String adapterVersion;
        String strA;
        boolean zEquals;
        String string;
        boolean zIsBeta;
        boolean z10;
        boolean z11;
        int iLastIndexOf;
        String lowerCase;
        Integer numA;
        JSONObject jSONObject2;
        String string2;
        boolean z12;
        this.f7374a = kVar;
        String string3 = JsonUtils.getString(jSONObject, "name", "");
        this.f7389p = string3;
        this.f7390q = JsonUtils.getString(jSONObject, "display_name", "");
        this.f7391r = JsonUtils.getString(jSONObject, "adapter_class", "");
        this.f7394u = JsonUtils.getString(jSONObject, "latest_adapter_version", "");
        this.B = a(jSONObject);
        Boolean bool = Boolean.FALSE;
        this.f7384k = JsonUtils.getBoolean(jSONObject, "hide_if_missing", bool).booleanValue();
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, com.safedk.android.utils.i.f44984c, new JSONObject());
        this.f7399z = a(jSONObject3, kVar);
        this.f7388o = JsonUtils.getBoolean(jSONObject3, "java_8_required", bool).booleanValue();
        this.F = JsonUtils.getBoolean(jSONObject3, "hide_initialization_status", bool).booleanValue();
        this.f7387n = JsonUtils.getBoolean(jSONObject3, "check_sdk_adapter_version_mismatch", Boolean.TRUE).booleanValue();
        this.C = JsonUtils.getList(jSONObject3, "live_network_filtering_names", null);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject3, "test_mode", new JSONObject());
        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "network_names", (JSONObject) null);
        if (jSONObject5 == null || jSONObject5.length() <= 0) {
            this.D = Arrays.asList(string3);
            this.E = null;
        } else {
            ArrayList arrayList = new ArrayList(Arrays.asList(string3));
            HashMap map = new HashMap(jSONObject5.length());
            Iterator<String> itKeys = jSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                MaxAdFormat fromString = MaxAdFormat.formatFromString(next);
                String string4 = JsonUtils.getString(jSONObject5, next, null);
                if (fromString != null && !TextUtils.isEmpty(string4)) {
                    arrayList.add(string4);
                    map.put(fromString, string4);
                }
            }
            this.D = arrayList;
            this.E = map;
        }
        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject, "test_mode", new JSONObject());
        Boolean bool2 = Boolean.TRUE;
        this.f7382i = JsonUtils.getBoolean(jSONObject6, "supported", bool2).booleanValue();
        this.f7383j = JsonUtils.getBoolean(jSONObject, "test_mode_requires_init", Boolean.FALSE).booleanValue();
        this.f7395v = JsonUtils.getString(jSONObject6, "message", null);
        this.G = new a7(JsonUtils.getJSONObject(jSONObject3, "tcf_config"), this.f7390q);
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f7377d = n7.a(list);
        } else {
            this.f7377d = n7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
        List listEmptyList = Collections.emptyList();
        String str = this.f7391r;
        String string5 = JsonUtils.getString(jSONObject3, "init_adapter_class", null);
        if (string5 != null) {
            this.f7391r = string5;
        }
        MaxAdapter maxAdapterA = w3.a(str, kVar);
        if (maxAdapterA != null) {
            this.f7378e = true;
            try {
                adapterVersion = maxAdapterA.getAdapterVersion();
                try {
                    strA = w3.a(maxAdapterA);
                    try {
                        this.f7381h = w3.a(maxAdapterA, this.f7391r);
                        listEmptyList = a(maxAdapterA, JsonUtils.getBoolean(jSONObject4, "is_mrec_supported", bool2).booleanValue());
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONObject3, "native_ad_view_config", (JSONObject) null);
                        if (jSONObject7 != null) {
                            String string6 = JsonUtils.getString(jSONObject7, "min_adapter_version", null);
                            z12 = string6 == null || n7.a(adapterVersion, string6) >= 0;
                            try {
                                string = JsonUtils.getString(jSONObject7, BrandSafetyEvent.f44576ad, null);
                            } catch (Throwable th2) {
                                th = th2;
                                string = null;
                                com.applovin.impl.sdk.o.h("MediatedNetwork", "Failed to load adapter for network " + this.f7389p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                                z10 = z12;
                                zIsBeta = false;
                                Class<?> cls = Class.forName(this.f7391r);
                                zEquals = cls.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls);
                                this.f7393t = adapterVersion;
                                this.f7392s = strA;
                                this.f7398y = listEmptyList;
                                this.f7385l = zEquals;
                                this.f7386m = z10;
                                this.f7396w = string;
                                this.A = a(jSONObject3, adapterVersion, kVar);
                                this.f7380g = n7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                                this.f7375b = a();
                                if (adapterVersion.equals(this.f7394u)) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                this.f7379f = z11;
                                Context contextO = com.applovin.impl.sdk.k.o();
                                iLastIndexOf = this.f7389p.lastIndexOf("_");
                                if (iLastIndexOf != -1) {
                                    lowerCase = this.f7389p.toLowerCase().substring(0, iLastIndexOf);
                                } else {
                                    lowerCase = this.f7389p.toLowerCase();
                                }
                                this.f7397x = contextO.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextO.getPackageName());
                                this.f7376c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                                AppLovinCommunicator.getInstance(contextO).subscribe(this, "adapter_initialization_status");
                                numA = kVar.S().a(this.f7391r);
                                if (numA != null) {
                                    this.f7376c = numA.intValue();
                                }
                                jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                                if (jSONObject2 != null) {
                                }
                                this.H = false;
                                this.I = null;
                                this.J = null;
                                return;
                            }
                        } else {
                            string = null;
                            z12 = false;
                        }
                        try {
                            z10 = z12;
                            zIsBeta = maxAdapterA.isBeta();
                        } catch (Throwable th3) {
                            th = th3;
                            com.applovin.impl.sdk.o.h("MediatedNetwork", "Failed to load adapter for network " + this.f7389p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                            z10 = z12;
                            zIsBeta = false;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        string = null;
                        z12 = false;
                        com.applovin.impl.sdk.o.h("MediatedNetwork", "Failed to load adapter for network " + this.f7389p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                        z10 = z12;
                        zIsBeta = false;
                        Class<?> cls2 = Class.forName(this.f7391r);
                        zEquals = cls2.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls2);
                        this.f7393t = adapterVersion;
                        this.f7392s = strA;
                        this.f7398y = listEmptyList;
                        this.f7385l = zEquals;
                        this.f7386m = z10;
                        this.f7396w = string;
                        this.A = a(jSONObject3, adapterVersion, kVar);
                        this.f7380g = n7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                        this.f7375b = a();
                        if (adapterVersion.equals(this.f7394u)) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        this.f7379f = z11;
                        Context contextO2 = com.applovin.impl.sdk.k.o();
                        iLastIndexOf = this.f7389p.lastIndexOf("_");
                        if (iLastIndexOf != -1) {
                            lowerCase = this.f7389p.toLowerCase().substring(0, iLastIndexOf);
                        } else {
                            lowerCase = this.f7389p.toLowerCase();
                        }
                        this.f7397x = contextO2.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextO2.getPackageName());
                        this.f7376c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                        AppLovinCommunicator.getInstance(contextO2).subscribe(this, "adapter_initialization_status");
                        numA = kVar.S().a(this.f7391r);
                        if (numA != null) {
                            this.f7376c = numA.intValue();
                        }
                        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                        if (jSONObject2 != null) {
                        }
                        this.H = false;
                        this.I = null;
                        this.J = null;
                        return;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    strA = "";
                }
            } catch (Throwable th6) {
                th = th6;
                adapterVersion = "";
                strA = adapterVersion;
            }
            try {
                Class<?> cls3 = Class.forName(this.f7391r);
                zEquals = cls3.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls3);
            } catch (Throwable th7) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", th7);
                }
                zEquals = false;
            }
        } else {
            this.f7378e = false;
            adapterVersion = "";
            strA = adapterVersion;
            zEquals = false;
            string = null;
            zIsBeta = false;
            z10 = false;
        }
        this.f7393t = adapterVersion;
        this.f7392s = strA;
        this.f7398y = listEmptyList;
        this.f7385l = zEquals;
        this.f7386m = z10;
        this.f7396w = string;
        this.A = a(jSONObject3, adapterVersion, kVar);
        this.f7380g = n7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
        this.f7375b = a();
        if (adapterVersion.equals(this.f7394u) || zIsBeta) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f7379f = z11;
        Context contextO3 = com.applovin.impl.sdk.k.o();
        iLastIndexOf = this.f7389p.lastIndexOf("_");
        if (iLastIndexOf != -1) {
            lowerCase = this.f7389p.toLowerCase().substring(0, iLastIndexOf);
        } else {
            lowerCase = this.f7389p.toLowerCase();
        }
        this.f7397x = contextO3.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextO3.getPackageName());
        this.f7376c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
        AppLovinCommunicator.getInstance(contextO3).subscribe(this, "adapter_initialization_status");
        numA = kVar.S().a(this.f7391r);
        if (numA != null) {
            this.f7376c = numA.intValue();
        }
        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
        if (jSONObject2 != null || !this.f7377d) {
            this.H = false;
            this.I = null;
            this.J = null;
            return;
        }
        this.H = true;
        this.I = JsonUtils.getString(jSONObject2, "test_mode_app_id", null);
        JSONObject jSONObject8 = JsonUtils.getJSONObject(jSONObject2, "test_mode_slot_ids", new JSONObject());
        HashMap map2 = new HashMap(jSONObject8.length());
        Iterator<String> itKeys2 = jSONObject8.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            MaxAdFormat fromString2 = MaxAdFormat.formatFromString(next2);
            JSONObject jSONObject9 = JsonUtils.getJSONObject(jSONObject8, next2, (JSONObject) null);
            if (fromString2 != null && jSONObject9 != null && (string2 = JsonUtils.getString(jSONObject9, CommonUrlParts.UUID, null)) != null) {
                map2.put(fromString2, new x(string2, jSONObject9, fromString2));
            }
        }
        this.J = map2;
    }

    public boolean A() {
        return this.f7379f;
    }

    public boolean B() {
        return this.f7381h;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.f7388o;
    }

    public boolean E() {
        if (!this.f7387n || !StringUtils.isValidString(this.f7392s)) {
            return false;
        }
        return !n7.d(this.f7392s).equals(n7.a(this.f7393t, this.f7392s.split("\\.").length));
    }

    public boolean F() {
        return this.f7377d;
    }

    public boolean G() {
        return this.f7375b == a.MISSING && this.f7384k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.f7385l;
    }

    public boolean J() {
        return this.f7386m;
    }

    public String b() {
        return this.f7391r;
    }

    public String c() {
        return this.f7393t;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.f7390q;
    }

    public int h() {
        return this.f7397x;
    }

    public int i() {
        return this.f7376c;
    }

    public final String j() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n---------- ");
        sb2.append(this.f7389p);
        sb2.append(" ----------");
        sb2.append("\nStatus  - ");
        sb2.append(this.f7375b.b());
        sb2.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb2.append((!this.f7377d || TextUtils.isEmpty(this.f7392s)) ? "UNAVAILABLE" : this.f7392s);
        sb2.append("\nAdapter - ");
        if (this.f7378e && !TextUtils.isEmpty(this.f7393t)) {
            str = this.f7393t;
        }
        sb2.append(str);
        for (p4 p4Var : n()) {
            if (!p4Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(p4Var.b());
                sb2.append(": ");
                sb2.append(p4Var.a());
            }
        }
        for (k1 k1Var : f()) {
            if (!k1Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(k1Var.b());
                sb2.append(": ");
                sb2.append(k1Var.a());
            }
        }
        return sb2.toString();
    }

    public String k() {
        return this.f7394u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.f7389p;
    }

    public List n() {
        return this.f7399z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.f7374a;
    }

    public String p() {
        return this.f7392s;
    }

    public a q() {
        return this.f7375b;
    }

    public List r() {
        return this.f7398y;
    }

    public List s() {
        return this.B;
    }

    public a7 t() {
        return this.G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f7389p + ", displayName=" + this.f7390q + ", sdkAvailable=" + this.f7377d + ", sdkVersion=" + this.f7392s + ", adapterAvailable=" + this.f7378e + ", adapterVersion=" + this.f7393t + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.f7395v;
    }

    public String w() {
        return this.f7396w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.f7382i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f7375b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !F() || !z())) {
            return b.INVALID_INTEGRATION;
        }
        if (this.f7374a.s0().c()) {
            return (this.f7383j && (this.f7376c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f7376c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY;
        }
        return b.DISABLED;
    }

    public boolean z() {
        return this.f7378e;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f7391r.equals(string)) {
            this.f7376c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = w3.a(string, this.f7374a);
            if (maxAdapterA != null) {
                String strA = w3.a(maxAdapterA);
                if (!this.f7392s.equals(strA)) {
                    this.f7392s = strA;
                    this.f7374a.t().a(this.f7392s, string);
                }
            }
        }
    }

    private List a(MaxAdapter maxAdapter, boolean z10) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z10) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f7391r.equals(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f44047i)) {
            p4 p4Var = new p4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.k.o());
            if (p4Var.c()) {
                arrayList.add(p4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new p4(next, jSONObject2.getString(next), com.applovin.impl.sdk.k.o()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new k1(jSONObject2, kVar));
            }
        }
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && k1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new k1(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e3 e3Var) {
        return this.f7390q.compareToIgnoreCase(e3Var.f7390q);
    }
}
