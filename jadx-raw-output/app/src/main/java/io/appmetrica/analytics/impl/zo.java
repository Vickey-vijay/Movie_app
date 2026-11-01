package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Co f58077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Co f58078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ao f58079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f58080d;

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        if (this.f58080d == null) {
            JSONObject jSONObjectA = this.f58079c.a(a(this.f58077a), a(this.f58078b));
            this.f58080d = jSONObjectA;
            a(jSONObjectA);
        }
        jSONObject = this.f58080d;
        if (jSONObject == null) {
            ck.p.B("fileContents");
            jSONObject = null;
        }
        return jSONObject;
    }

    public zo(Co co2, Co co3, Ao ao2) {
        this.f58077a = co2;
        this.f58078b = co3;
        this.f58079c = ao2;
    }

    public static JSONObject a(Co co2) {
        try {
            String strA = co2.a();
            return strA != null ? new JSONObject(strA) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String string = jSONObject.toString();
        try {
            this.f58077a.a(string);
        } catch (Throwable unused) {
        }
        try {
            this.f58078b.a(string);
        } catch (Throwable unused2) {
        }
    }
}
