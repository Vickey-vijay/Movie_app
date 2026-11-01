package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f55937g;

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f55931a + "', kitBuildNumber='" + this.f55932b + "', appVersion='" + this.f55933c + "', appBuild='" + this.f55934d + "', osVersion='" + this.f55935e + "', apiLevel=" + this.f55936f + ", attributionId=" + this.f55937g + ')';
    }

    public Tk(JSONObject jSONObject) {
        this.f55931a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f55932b = jSONObject.optString("kitBuildNumber", "");
        this.f55933c = jSONObject.optString("appVer", "");
        this.f55934d = jSONObject.optString("appBuild", "");
        this.f55935e = jSONObject.optString("osVer", "");
        this.f55936f = jSONObject.optInt("osApiLev", -1);
        this.f55937g = jSONObject.optInt("attribution_id", 0);
    }
}
