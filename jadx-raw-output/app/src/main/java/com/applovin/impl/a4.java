package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6845b;

    public String a() {
        return this.f6844a;
    }

    public String b() {
        return this.f6845b;
    }

    public a4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f6844a = JsonUtils.getString(jSONObject, "id", "");
        this.f6845b = JsonUtils.getString(jSONObject, "price", null);
    }
}
