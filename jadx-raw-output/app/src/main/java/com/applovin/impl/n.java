package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class n implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f8492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f8493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f8494e;

    public MaxAdFormat a() {
        return this.f8492c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.f8491b.compareToIgnoreCase(nVar.f8491b);
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f8492c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f8490a;
    }

    public String d() {
        return this.f8491b;
    }

    public String e() {
        return "\n---------- " + this.f8491b + " ----------\nIdentifier - " + this.f8490a + "\nFormat     - " + b();
    }

    public o f() {
        return this.f8493d;
    }

    public List g() {
        return this.f8494e;
    }

    public n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.f8490a = JsonUtils.getString(jSONObject, "name", "");
        this.f8491b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f8492c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f8494e = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f8494e.add(new o(jSONObject2, map, this.f8492c, kVar));
            }
        }
        this.f8493d = this.f8494e.isEmpty() ? null : (o) this.f8494e.get(0);
    }
}
