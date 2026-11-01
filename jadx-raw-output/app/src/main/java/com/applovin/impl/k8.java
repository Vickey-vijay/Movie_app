package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f7819c;

    public String a() {
        return this.f7817a;
    }

    public String b() {
        return this.f7818b;
    }

    public List c() {
        return this.f7819c;
    }

    public k8(JSONObject jSONObject) {
        this.f7817a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f7818b = JsonUtils.getString(jSONObject, CommonUrlParts.DEVICE_TYPE, "all");
        this.f7819c = JsonUtils.getStringList(jSONObject, "segments", null);
    }
}
