package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Q3 implements X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f27407a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27408a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f27409b = false;

        private a() {
        }
    }

    @Override // com.ironsource.X5
    public boolean b() {
        return this.f27407a.optBoolean("clickCheck", false);
    }

    public Q3(JSONObject jSONObject) {
        this.f27407a = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
    }
}
