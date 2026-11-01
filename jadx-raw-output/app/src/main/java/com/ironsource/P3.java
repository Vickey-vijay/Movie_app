package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class P3 implements X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f27321a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27322a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f27323b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f27324c = "curlError";

        private a() {
        }
    }

    @Override // com.ironsource.X5
    public boolean b() {
        return this.f27321a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.f27321a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.f27321a.optBoolean("reportController", true);
    }

    public P3(JSONObject jSONObject) {
        this.f27321a = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
    }
}
