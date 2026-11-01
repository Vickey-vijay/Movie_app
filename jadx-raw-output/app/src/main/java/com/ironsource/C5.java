package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class C5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f26076e = "euid";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f26077f = "esat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f26078g = "esfr";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f26079h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f26081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f26083d;

    public C5(D5 d10, JSONObject jSONObject) {
        this(d10.b(), jSONObject);
    }

    public String a() {
        return this.f26083d.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5 c10 = (C5) obj;
        return this.f26080a == c10.f26080a && this.f26081b == c10.f26081b && this.f26082c == c10.f26082c && C3767wa.a(this.f26083d, c10.f26083d);
    }

    public C5(int i10, JSONObject jSONObject) {
        this(i10, new InterfaceC3710t4.a().a(), jSONObject);
    }

    public void a(int i10) {
        this.f26080a = i10;
    }

    public JSONObject b() {
        return this.f26083d;
    }

    public int c() {
        return this.f26080a;
    }

    public long d() {
        return this.f26081b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f26080a) * 31) + Long.hashCode(this.f26081b)) * 31) + this.f26083d.toString().hashCode()) * 31) + this.f26082c;
    }

    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + StringUtils.COMMA + a().substring(1) + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e).replace(StringUtils.COMMA, "\n");
    }

    public C5(int i10, long j10, String str) throws JSONException {
        this(i10, j10, IronSourceVideoBridge.jsonObjectInit(str));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f26083d.put(str, obj);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public C5(D5 d10, long j10, JSONObject jSONObject) {
        this(d10.b(), j10, jSONObject);
    }

    public C5(int i10, long j10, JSONObject jSONObject) {
        this.f26082c = 1;
        this.f26080a = i10;
        this.f26081b = j10;
        jSONObject = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
        this.f26083d = jSONObject;
        if (!jSONObject.has(f26076e)) {
            a(f26076e, UUID.randomUUID().toString());
        }
        if (jSONObject.has(f26077f)) {
            this.f26082c = jSONObject.optInt(f26077f, 1);
        } else {
            a(f26077f, Integer.valueOf(this.f26082c));
        }
    }

    public void a(String str) {
        a(f26078g, str);
        int i10 = this.f26082c + 1;
        this.f26082c = i10;
        a(f26077f, Integer.valueOf(i10));
    }
}
