package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3516i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f29133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29135d;

    public C3516i4(String str) {
        this.f29132a = str;
    }

    public String a() {
        return this.f29135d;
    }

    public String b() {
        return this.f29132a;
    }

    public JSONObject c() {
        return this.f29133b;
    }

    public String d() {
        return this.f29134c;
    }

    public C3516i4(String str, JSONObject jSONObject) {
        this.f29132a = str;
        this.f29133b = jSONObject;
    }

    public C3516i4(String str, String str2, String str3) {
        this.f29132a = str;
        this.f29134c = str2;
        this.f29135d = str3;
    }

    public C3516i4(String str, JSONObject jSONObject, String str2, String str3) {
        this.f29132a = str;
        this.f29133b = jSONObject;
        this.f29134c = str2;
        this.f29135d = str3;
    }
}
