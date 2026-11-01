package com.ironsource.adapters.ironsource;

import ck.i;
import ck.p;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class LoadAdData {
    private final JSONObject localAdData;

    /* JADX WARN: Multi-variable type inference failed */
    public LoadAdData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public LoadAdData(JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
    }

    public final String adUnitId() {
        String strOptString = this.localAdData.optString("adUnitId");
        p.i(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }

    public /* synthetic */ LoadAdData(JSONObject jSONObject, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : jSONObject);
    }
}
