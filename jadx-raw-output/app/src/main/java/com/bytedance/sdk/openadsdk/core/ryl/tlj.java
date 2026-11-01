package com.bytedance.sdk.openadsdk.core.ryl;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class tlj {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final String f13028lh;
    public final String ouw;
    public final URL vt;
    private final String yu;

    public final JSONObject ouw() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VastAttributes.API_FRAMEWORK, CampaignEx.KEY_OMID);
            jSONObject.put("javascriptResourceUrl", this.vt.toString());
            if (!TextUtils.isEmpty(this.ouw)) {
                jSONObject.put("vendorKey", this.ouw);
            }
            if (!TextUtils.isEmpty(this.f13028lh)) {
                jSONObject.put("verificationParameters", this.f13028lh);
            }
            if (!TextUtils.isEmpty(this.yu)) {
                jSONObject.put("verificationNotExecuted", this.yu);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlj)) {
            return false;
        }
        tlj tljVar = (tlj) obj;
        if (Objects.equals(this.ouw, tljVar.ouw) && Objects.equals(this.vt, tljVar.vt) && Objects.equals(this.f13028lh, tljVar.f13028lh)) {
            return Objects.equals(this.yu, tljVar.yu);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.ouw;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.vt.hashCode()) * 31;
        String str2 = this.f13028lh;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.yu;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    private tlj(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.ouw = str2;
        this.vt = new URL(str);
        this.f13028lh = str3;
        this.yu = str4;
    }

    public static tlj ouw(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new tlj(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static tlj ouw(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString(VastAttributes.API_FRAMEWORK);
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new tlj(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<tlj> ouw(JSONArray jSONArray) {
        HashSet<tlj> hashSet = new HashSet<>();
        if (jSONArray == null) {
            return hashSet;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                hashSet.add(ouw(jSONArray.getJSONObject(i10)));
            } catch (Throwable unused) {
            }
        }
        return hashSet;
    }
}
