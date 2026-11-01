package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f6851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f6854e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i10) {
            if (i10 != 0) {
                return i10 != 1 ? OTHER : ATP_NETWORK;
            }
            return TCF_VENDOR;
        }
    }

    public void a(Boolean bool) {
        this.f6854e = bool;
    }

    public Boolean a() {
        return this.f6854e;
    }

    public String b() {
        return this.f6853d;
    }

    public String c() {
        return this.f6852c;
    }

    public Integer d() {
        return this.f6851b;
    }

    public String e() {
        Boolean bool = this.f6854e;
        return "\n" + this.f6853d + " - " + (bool != null ? String.valueOf(bool) : p0.b().a(com.applovin.impl.sdk.k.o()));
    }

    public a f() {
        return this.f6850a;
    }

    public a7(JSONObject jSONObject, String str) {
        this.f6853d = str;
        this.f6850a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f6851b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f6852c = JsonUtils.getString(jSONObject, "name", null);
    }
}
