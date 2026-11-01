package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f15191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f15192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f15193c = null;

    public static k a(JSONObject jSONObject) {
        Vendor vendorFromValue;
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("pausePct", Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt("playPct", Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        k kVar = new k();
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        kVar.f15191a = numValueOf;
        if (iOptInt2 == Integer.MIN_VALUE) {
            numValueOf2 = null;
        }
        kVar.f15192b = numValueOf2;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("vendor");
        if (jSONArrayOptJSONArray != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                String strOptString = jSONArrayOptJSONArray.optString(i10, null);
                if (!TextUtils.isEmpty(strOptString) && (vendorFromValue = Vendor.fromValue(strOptString)) != null) {
                    linkedHashSet.add(vendorFromValue);
                }
            }
            kVar.f15193c = linkedHashSet;
        }
        return kVar;
    }
}
