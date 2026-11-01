package com.ironsource;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class P9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27330a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f27334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f27335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Hc f27336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27337h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27331b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27332c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3520i8 f27333d = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27338i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27339j = null;

    public P9 a(boolean z10) {
        this.f27332c = z10;
        return this;
    }

    public P9 b(boolean z10) {
        this.f27338i = z10;
        return this;
    }

    public P9 c() {
        this.f27331b = true;
        return this;
    }

    public P9 a(C3520i8 c3520i8) {
        this.f27333d = c3520i8;
        return this;
    }

    public P9 b(@Nullable String str) {
        this.f27339j = str;
        return this;
    }

    public P9 c(boolean z10) {
        this.f27337h = z10;
        return this;
    }

    public P9(String str, Hc hc2) throws NullPointerException {
        this.f27330a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f27336g = (Hc) SDKUtils.requireNonNull(hc2, "AdListener name can't be null");
    }

    public P9 a(String str) {
        this.f27334e = str;
        return this;
    }

    public String b() {
        String str = this.f27334e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("name", this.f27330a);
            jSONObjectJsonObjectInit.put("rewarded", this.f27331b);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return (this.f27332c || this.f27337h) ? Z9.a() : Z9.a(jSONObjectJsonObjectInit);
    }

    public P9 a(Map<String, String> map) {
        this.f27335f = map;
        return this;
    }

    public O9 a() {
        return new O9(b(), this.f27330a, this.f27331b, this.f27332c, this.f27337h, this.f27338i, this.f27339j, this.f27335f, this.f27336g, this.f27333d);
    }
}
