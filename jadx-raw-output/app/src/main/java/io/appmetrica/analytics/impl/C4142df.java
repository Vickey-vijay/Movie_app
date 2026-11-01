package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4142df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f56594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T7 f56595c;

    public final String toString() {
        return "Candidate{trackingId='" + this.f56593a + "', additionalParams=" + this.f56594b + ", source=" + this.f56595c + '}';
    }

    public C4142df(String str, JSONObject jSONObject, T7 t10) {
        this.f56593a = str;
        this.f56594b = jSONObject;
        this.f56595c = t10;
    }
}
