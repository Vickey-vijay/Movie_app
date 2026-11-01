package com.ironsource;

import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<String> f26101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f26106g;

    public D1(JSONObject jSONObject) throws JSONException {
        ck.p.j(jSONObject, "applicationCrashReporterSettings");
        this.f26100a = jSONObject.optBoolean("enabled", false);
        List<String> listB = C3575la.b(jSONObject.optJSONArray("keysToInclude"));
        this.f26101b = listB != null ? nj.b0.M0(listB) : null;
        String strOptString = jSONObject.optString("reporterURL");
        ck.p.i(strOptString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.f26102c = strOptString;
        String strOptString2 = jSONObject.optString("reporterKeyword");
        ck.p.i(strOptString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.f26103d = strOptString2;
        this.f26104e = jSONObject.optBoolean("includeANR", false);
        this.f26105f = jSONObject.optInt("timeout", 5000);
        this.f26106g = jSONObject.optBoolean("setIgnoreDebugger", false);
    }

    public final int a() {
        return this.f26105f;
    }

    public final HashSet<String> b() {
        return this.f26101b;
    }

    public final String c() {
        return this.f26103d;
    }

    public final String d() {
        return this.f26102c;
    }

    public final boolean e() {
        return this.f26104e;
    }

    public final boolean f() {
        return this.f26100a;
    }

    public final boolean g() {
        return this.f26106g;
    }
}
