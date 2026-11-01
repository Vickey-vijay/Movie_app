package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f9038f = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9039a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f9041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f9042d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f9040b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f9043e = System.currentTimeMillis();

    public List a() {
        return this.f9040b;
    }

    public JSONObject b() {
        return this.f9041c;
    }

    public long c() {
        return this.f9043e;
    }

    public int d() {
        return this.f9040b.size();
    }

    public JSONObject e() {
        return this.f9042d;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f9041c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f9038f;
    }

    public int g() {
        return n7.c(JsonUtils.getInt(this.f9041c, "video_completion_percent", -1));
    }

    public s7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        this.f9039a = kVar;
        this.f9041c = jSONObject;
        this.f9042d = jSONObject2;
    }
}
