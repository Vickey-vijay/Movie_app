package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements sg.bigo.ads.api.core.b.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f70698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f70699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f70700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f70701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f70702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f70703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f70704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f70705h;

    public o(@NonNull JSONObject jSONObject) {
        this.f70698a = jSONObject.optString("imageurl");
        this.f70699b = jSONObject.optString("clickurl");
        this.f70700c = jSONObject.optString("longlegaltext");
        this.f70701d = jSONObject.optString("ad_info");
        this.f70702e = jSONObject.optString("ad_link");
        this.f70703f = jSONObject.optInt("percent");
        this.f70704g = jSONObject.optString("rec_rule");
        this.f70705h = jSONObject.optString("user_privacy");
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String a() {
        return this.f70698a;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String b() {
        return this.f70699b;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String c() {
        return this.f70700c;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String d() {
        return this.f70701d;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String e() {
        return this.f70702e;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final int f() {
        return this.f70703f;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String g() {
        return this.f70704g;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String h() {
        return this.f70705h;
    }
}
