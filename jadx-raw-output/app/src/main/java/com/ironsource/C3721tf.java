package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3721tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f31319a;

    public boolean a() {
        return this.f31319a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f31319a.optBoolean(C3426d4.a.f28422o, false);
    }

    public boolean c() {
        return this.f31319a.optBoolean(C3426d4.a.f28423p, false);
    }

    public boolean d() {
        return this.f31319a.optBoolean(C3426d4.a.f28419l, false);
    }

    public boolean e() {
        return this.f31319a.optBoolean(C3426d4.a.f28421n, false);
    }

    public C3721tf(JSONObject jSONObject) {
        this.f31319a = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
    }
}
