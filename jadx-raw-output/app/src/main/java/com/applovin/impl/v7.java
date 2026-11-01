package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class v7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9751b;

    public static v7 a(p8 p8Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new v7((String) p8Var.a().get(VastAttributes.API_FRAMEWORK), p8Var.d());
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastJavaScriptResource", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastJavaScriptResource", th2);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v7 v7Var = (v7) obj;
        String str = this.f9750a;
        if (str == null ? v7Var.f9750a != null : !str.equals(v7Var.f9750a)) {
            return false;
        }
        String str2 = this.f9751b;
        String str3 = v7Var.f9751b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public String b() {
        return this.f9750a;
    }

    public String c() {
        return this.f9751b;
    }

    public int hashCode() {
        String str = this.f9750a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9751b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f9750a + "', javascriptResourceUrl='" + this.f9751b + "'}";
    }

    private v7(String str, String str2) {
        this.f9750a = str;
        this.f9751b = str2;
    }

    public static v7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        return new v7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f9750a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f9751b);
        return jSONObject;
    }
}
