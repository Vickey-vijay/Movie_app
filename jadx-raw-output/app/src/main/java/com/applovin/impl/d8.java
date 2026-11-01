package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f7312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f7314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f7315j;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d8 d8Var = (d8) obj;
        return this.f7306a == d8Var.f7306a && this.f7307b == d8Var.f7307b && this.f7308c == d8Var.f7308c && this.f7309d == d8Var.f7309d && this.f7310e == d8Var.f7310e && this.f7311f == d8Var.f7311f && this.f7312g == d8Var.f7312g && this.f7313h == d8Var.f7313h && Float.compare(d8Var.f7314i, this.f7314i) == 0 && Float.compare(d8Var.f7315j, this.f7315j) == 0;
    }

    public float a() {
        return this.f7314i;
    }

    public long b() {
        return this.f7312g;
    }

    public float c() {
        return this.f7315j;
    }

    public long d() {
        return this.f7313h;
    }

    public int e() {
        return this.f7309d;
    }

    public int f() {
        return this.f7307b;
    }

    public int g() {
        return this.f7308c;
    }

    public long h() {
        return this.f7311f;
    }

    public int hashCode() {
        int i10 = ((((((((((((((this.f7306a * 31) + this.f7307b) * 31) + this.f7308c) * 31) + this.f7309d) * 31) + (this.f7310e ? 1 : 0)) * 31) + this.f7311f) * 31) + this.f7312g) * 31) + this.f7313h) * 31;
        float f10 = this.f7314i;
        int iFloatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f7315j;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public int i() {
        return this.f7306a;
    }

    public boolean j() {
        return this.f7310e;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f7306a + ", heightPercentOfScreen=" + this.f7307b + ", margin=" + this.f7308c + ", gravity=" + this.f7309d + ", tapToFade=" + this.f7310e + ", tapToFadeDurationMillis=" + this.f7311f + ", fadeInDurationMillis=" + this.f7312g + ", fadeOutDurationMillis=" + this.f7313h + ", fadeInDelay=" + this.f7314i + ", fadeOutDelay=" + this.f7315j + '}';
    }

    public d8(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f7306a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f7307b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f7308c = JsonUtils.getInt(jSONObject, VastAttributes.MARGIN, 20);
        this.f7309d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f7310e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f7311f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f7312g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f7313h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f7314i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f7315j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }
}
