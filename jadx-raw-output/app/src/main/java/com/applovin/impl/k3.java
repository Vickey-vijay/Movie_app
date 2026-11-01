package com.applovin.impl;

import android.os.Bundle;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f7799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f7800b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f7802d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f7804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h5 f7805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h5 f7806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f7807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f7808j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7801c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7803e = new Object();

    public JSONObject a() {
        JSONObject jSONObject;
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f7803e) {
            jSONObject = this.f7802d;
        }
        return jSONObject;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.f7805g;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f7801c) {
            bool2 = JsonUtils.getBoolean(this.f7800b, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean zHas;
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f7803e) {
            zHas = this.f7802d.has(str);
        }
        return zHas;
    }

    public boolean d(String str) {
        boolean zHas;
        h5 h5Var = this.f7805g;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f7801c) {
            zHas = this.f7800b.has(str);
        }
        return zHas;
    }

    public Object e(String str) {
        Object objOpt;
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            return h5Var.b(str);
        }
        synchronized (this.f7803e) {
            objOpt = this.f7802d.opt(str);
        }
        return objOpt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        h5 h5Var = this.f7805g;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f7801c) {
            jSONObject = this.f7800b;
        }
        return jSONObject;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f7799a.a(r3.f8931b8)).intValue()));
    }

    public void f(String str) {
        this.f7808j = str;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f7807i;
    }

    public Map i() {
        return this.f7804f;
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            h5 h5Var = this.f7806h;
            bundle = h5Var != null ? (Bundle) h5Var.a(new Function() { // from class: com.applovin.impl.gb
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return k3.a((h5) obj);
                }
            }) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f7799a.n0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f7799a.a(r3.f8964x7)).longValue());
    }

    public Boolean n() {
        String str = this.f7799a.n0().getExtraParameters().get("huc");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        return c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f7799a.n0().getExtraParameters().get("dns");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        return c("dns") ? a("dns", Boolean.FALSE) : b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }

    public k3(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            if (jSONObject2 != null) {
                if (jSONObject != null) {
                    this.f7799a = kVar;
                    if (((Boolean) kVar.a(x4.C6)).booleanValue()) {
                        this.f7805g = new h5(jSONObject2);
                        this.f7806h = new h5(jSONObject);
                        this.f7800b = null;
                        this.f7802d = null;
                    } else {
                        this.f7800b = jSONObject2;
                        this.f7802d = jSONObject;
                        this.f7805g = null;
                        this.f7806h = null;
                    }
                    this.f7804f = map;
                    return;
                }
                throw new IllegalArgumentException("No ad object specified");
            }
            throw new IllegalArgumentException("No full response specified");
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public String k() {
        return c().split("_")[0];
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f7803e) {
            bool2 = JsonUtils.getBoolean(this.f7802d, str, bool);
        }
        return bool2;
    }

    public int b(String str, int i10) {
        int i11;
        h5 h5Var = this.f7805g;
        if (h5Var != null) {
            return h5Var.a(str, i10);
        }
        synchronized (this.f7801c) {
            i11 = JsonUtils.getInt(this.f7800b, str, i10);
        }
        return i11;
    }

    public void c(String str, int i10) {
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            h5Var.b(str, i10);
            return;
        }
        synchronized (this.f7803e) {
            JsonUtils.putInt(this.f7802d, str, i10);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f7799a.r0().j();
    }

    public String e() {
        return this.f7808j;
    }

    public void g(String str) {
        this.f7807i = str;
    }

    public float a(String str, float f10) {
        float f11;
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            return h5Var.a(str, f10);
        }
        synchronized (this.f7803e) {
            f11 = JsonUtils.getFloat(this.f7802d, str, f10);
        }
        return f11;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.f7805g;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f7801c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f7800b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, long j10) {
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            h5Var.b(str, j10);
            return;
        }
        synchronized (this.f7803e) {
            JsonUtils.putLong(this.f7802d, str, j10);
        }
    }

    public int a(String str, int i10) {
        int i11;
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            return h5Var.a(str, i10);
        }
        synchronized (this.f7803e) {
            i11 = JsonUtils.getInt(this.f7802d, str, i10);
        }
        return i11;
    }

    public long b(String str, long j10) {
        long j11;
        h5 h5Var = this.f7805g;
        if (h5Var != null) {
            return h5Var.a(str, j10);
        }
        synchronized (this.f7801c) {
            j11 = JsonUtils.getLong(this.f7800b, str, j10);
        }
        return j11;
    }

    public void c(String str, String str2) {
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            h5Var.b(str, str2);
            return;
        }
        synchronized (this.f7803e) {
            JsonUtils.putString(this.f7802d, str, str2);
        }
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f7803e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f7802d, str, jSONArray);
        }
        return jSONArray2;
    }

    public String b(String str, String str2) {
        String string;
        h5 h5Var = this.f7805g;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f7801c) {
            string = JsonUtils.getString(this.f7800b, str, str2);
        }
        return string;
    }

    public String c() {
        return a("name", (String) null);
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            return h5Var.a(str, jSONObject);
        }
        synchronized (this.f7803e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f7802d, str, jSONObject);
        }
        return jSONObject2;
    }

    public String b() {
        return a(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, (String) null);
    }

    public List b(String str) {
        List listOptList;
        List listOptList2;
        if (str != null) {
            h5 h5Var = this.f7805g;
            if (h5Var != null) {
                listOptList = h5Var.b(str, Collections.emptyList());
            } else {
                listOptList = JsonUtils.optList(b(str, new JSONArray()), Collections.emptyList());
            }
            h5 h5Var2 = this.f7806h;
            if (h5Var2 != null) {
                listOptList2 = h5Var2.b(str, Collections.emptyList());
            } else {
                listOptList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.emptyList());
            }
            ArrayList arrayList = new ArrayList(listOptList.size() + listOptList2.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public long a(String str, long j10) {
        long j11;
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            return h5Var.a(str, j10);
        }
        synchronized (this.f7803e) {
            j11 = JsonUtils.getLong(this.f7802d, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f7803e) {
            string = JsonUtils.getString(this.f7802d, str, str2);
        }
        return string;
    }

    public void a(String str, Object obj) {
        h5 h5Var = this.f7806h;
        if (h5Var != null) {
            h5Var.a(str, obj);
            return;
        }
        synchronized (this.f7803e) {
            JsonUtils.putObject(this.f7802d, str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(h5 h5Var) {
        return JsonUtils.toBundle(h5Var.a("server_parameters", (JSONObject) null));
    }

    public String a(String str) {
        String strA = a(str, "");
        return StringUtils.isValidString(strA) ? strA : b(str, "");
    }
}
