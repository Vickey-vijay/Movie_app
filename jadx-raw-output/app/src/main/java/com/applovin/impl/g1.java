package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f7526a;

    public Integer a() {
        return JsonUtils.getInteger(this.f7526a, "dark_mode_toolbar_color", null);
    }

    public String b() {
        return JsonUtils.getString(this.f7526a, "digital_asset_link_url", null);
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f7526a, "instant_apps_enabled", null);
    }

    public String d() {
        return JsonUtils.getString(this.f7526a, "referrer", null);
    }

    public Integer e() {
        return JsonUtils.getInteger(this.f7526a, "session_url_relation", null);
    }

    public Integer f() {
        return JsonUtils.getInteger(this.f7526a, "share_state", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f7526a, "should_show_title", null);
    }

    public Integer h() {
        return JsonUtils.getInteger(this.f7526a, "toolbar_color", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f7526a, "url_bar_hiding_enabled", null);
    }

    public g1(JSONObject jSONObject) {
        this.f7526a = jSONObject;
    }
}
