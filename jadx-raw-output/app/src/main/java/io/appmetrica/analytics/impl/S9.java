package io.appmetrica.analytics.impl;

import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class S9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55860c;

    public S9(JSONObject jSONObject) {
        this.f55858a = jSONObject.getString("name");
        this.f55860c = jSONObject.getBoolean(VastAttributes.REQUIRED);
        this.f55859b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S9.class != obj.getClass()) {
            return false;
        }
        S9 s10 = (S9) obj;
        if (this.f55859b != s10.f55859b || this.f55860c != s10.f55860c) {
            return false;
        }
        String str = this.f55858a;
        String str2 = s10.f55858a;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public final int hashCode() {
        String str = this.f55858a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f55859b) * 31) + (this.f55860c ? 1 : 0);
    }

    public S9(String str, int i10, boolean z10) {
        this.f55858a = str;
        this.f55859b = i10;
        this.f55860c = z10;
    }
}
