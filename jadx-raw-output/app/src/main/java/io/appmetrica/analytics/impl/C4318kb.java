package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4318kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f57094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f57097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f57098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f57099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f57100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f57101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f57102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f57103j;

    public C4318kb(@NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f57094a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f57095b = jSONObject2.getString("name");
        this.f57096c = jSONObject2.getInt("bytes_truncated");
        this.f57103j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f57097d = new HashMap();
        if (strOptString != null) {
            try {
                HashMap mapC = AbstractC4241hb.c(strOptString);
                if (mapC != null) {
                    for (Map.Entry entry : mapC.entrySet()) {
                        this.f57097d.put(M3.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f57098e = jSONObject3.getString("package_name");
        this.f57099f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f57100g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f57101h = jSONObject4.getString("api_key");
        this.f57102i = a(jSONObject4);
    }

    public final String a() {
        return this.f57101h;
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public final int b() {
        return this.f57096c;
    }

    public final byte[] c() {
        return this.f57094a;
    }

    @Nullable
    public final String d() {
        return this.f57103j;
    }

    public final String e() {
        return this.f57095b;
    }

    public final String f() {
        return this.f57098e;
    }

    public final Integer g() {
        return this.f57099f;
    }

    public final String h() {
        return this.f57100g;
    }

    @NonNull
    public final CounterConfigurationReporterType i() {
        return this.f57102i;
    }

    @NonNull
    public final HashMap<M3, Integer> j() {
        return this.f57097d;
    }

    public final String k() throws JSONException {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f57097d.entrySet()) {
            map.put(((M3) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f57099f).put("psid", this.f57100g).put("package_name", this.f57098e)).put("reporter_configuration", new JSONObject().put("api_key", this.f57101h).put("reporter_type", this.f57102i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f57094a, 0)).put("name", this.f57095b).put("bytes_truncated", this.f57096c).put("trimmed_fields", AbstractC4241hb.b(map)).putOpt("environment", this.f57103j)).toString();
    }

    public C4318kb(@NonNull Q5 q10, @NonNull I3 i10, @Nullable HashMap<M3, Integer> map) {
        this.f57094a = q10.getValueBytes();
        this.f57095b = q10.getName();
        this.f57096c = q10.getBytesTruncated();
        if (map != null) {
            this.f57097d = map;
        } else {
            this.f57097d = new HashMap();
        }
        Cf cfA = i10.a();
        this.f57098e = cfA.e();
        this.f57099f = cfA.f();
        this.f57100g = cfA.g();
        CounterConfiguration counterConfigurationB = i10.b();
        this.f57101h = counterConfigurationB.getApiKey();
        this.f57102i = counterConfigurationB.getReporterType();
        this.f57103j = q10.f();
    }
}
