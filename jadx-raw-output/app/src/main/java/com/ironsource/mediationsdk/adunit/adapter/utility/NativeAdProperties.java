package com.ironsource.mediationsdk.adunit.adapter.utility;

import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.C3676r4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeAdProperties {
    private final AdOptionsPosition adOptionsPosition;
    private final AdOptionsPosition defaultAdOptionPosition;

    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public NativeAdProperties(JSONObject jSONObject) {
        p.j(jSONObject, "config");
        this.defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(jSONObject);
    }

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            p.i(strOptString, C3426d4.i.L);
            return AdOptionsPosition.valueOf(strOptString);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return this.defaultAdOptionPosition;
        }
    }
}
