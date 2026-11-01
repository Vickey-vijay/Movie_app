package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.C3676r4;
import com.ironsource.Ne;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class NetworkSettings {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f29893r = "customNetwork";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f29894s = "customNetworkPackage";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f29895t = "customNetworkAdapterName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f29898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f29899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f29900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f29901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f29902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f29903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f29904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f29905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f29906k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f29908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f29909n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f29910o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f29911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f29912q;

    public NetworkSettings(String str) {
        this.f29896a = str;
        this.f29906k = str;
        this.f29897b = str;
        this.f29911p = str;
        this.f29912q = str;
        this.f29899d = IronSourceVideoBridge.jsonObjectInit();
        this.f29900e = IronSourceVideoBridge.jsonObjectInit();
        this.f29901f = IronSourceVideoBridge.jsonObjectInit();
        this.f29902g = IronSourceVideoBridge.jsonObjectInit();
        this.f29898c = IronSourceVideoBridge.jsonObjectInit();
        this.f29907l = -1;
        this.f29908m = -1;
        this.f29909n = -1;
        this.f29910o = -1;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f29901f = jSONObject;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f29900e = jSONObject;
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f29902g = jSONObject;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f29899d = jSONObject;
    }

    public String getAdSourceNameForEvents() {
        return this.f29904i;
    }

    public JSONObject getApplicationSettings() {
        return this.f29898c;
    }

    public int getBannerPriority() {
        return this.f29909n;
    }

    public JSONObject getBannerSettings() {
        return this.f29901f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f29898c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if (aVar == null && (jSONObject5 = this.f29898c) != null) {
            return jSONObject5.optString(f29895t);
        }
        if (aVar.equals(IronSource.a.REWARDED_VIDEO) && (jSONObject4 = this.f29899d) != null) {
            return jSONObject4.optString(f29895t);
        }
        if (aVar.equals(IronSource.a.INTERSTITIAL) && (jSONObject3 = this.f29900e) != null) {
            return jSONObject3.optString(f29895t);
        }
        if (aVar.equals(IronSource.a.BANNER) && (jSONObject2 = this.f29901f) != null) {
            return jSONObject2.optString(f29895t);
        }
        if (!aVar.equals(IronSource.a.NATIVE_AD) || (jSONObject = this.f29902g) == null) {
            return null;
        }
        return jSONObject.optString(f29895t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f29898c;
        return jSONObject != null ? jSONObject.optString(f29894s, "") : "";
    }

    public int getInstanceType(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("instanceType");
        }
        return 1;
    }

    public int getInterstitialPriority() {
        return this.f29908m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f29900e;
    }

    public int getMaxAdsPerSession(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt(Ne.f27129e2, 99);
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt(Ne.f27129e2, 99);
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt(Ne.f27129e2, 99);
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt(Ne.f27129e2, 99);
        }
        return 99;
    }

    public int getNativeAdPriority() {
        return this.f29910o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f29902g;
    }

    public String getProviderDefaultInstance() {
        return this.f29911p;
    }

    public String getProviderInstanceName() {
        return this.f29906k;
    }

    public String getProviderName() {
        return this.f29896a;
    }

    public String getProviderNetworkKey() {
        return this.f29912q;
    }

    public String getProviderTypeForReflection() {
        return this.f29897b;
    }

    public int getRewardedVideoPriority() {
        return this.f29907l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f29899d;
    }

    public String getSubProviderId() {
        return this.f29903h;
    }

    public boolean isMultipleInstances() {
        return this.f29905j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f29904i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f29898c = jSONObject;
    }

    public void setBannerPriority(int i10) {
        this.f29909n = i10;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f29901f.put(str, obj);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setInterstitialPriority(int i10) {
        this.f29908m = i10;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f29900e.put(str, obj);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setIsMultipleInstances(boolean z10) {
        this.f29905j = z10;
    }

    public void setNativeAdPriority(int i10) {
        this.f29910o = i10;
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.f29902g.put(str, obj);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setProviderNetworkKey(String str) {
        this.f29912q = str;
    }

    public void setRewardedVideoPriority(int i10) {
        this.f29907l = i10;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f29899d.put(str, obj);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setSubProviderId(String str) {
        this.f29903h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f29898c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }

    public boolean isBidder(IronSource.a aVar) {
        if (isCustomNetwork() || getInstanceType(aVar) != 2) {
            return false;
        }
        return true;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f29896a = str;
        this.f29906k = str;
        this.f29897b = str2;
        this.f29911p = str3;
        this.f29912q = str4;
        this.f29899d = jSONObject2;
        this.f29900e = jSONObject3;
        this.f29901f = jSONObject4;
        this.f29902g = jSONObject5;
        this.f29898c = jSONObject;
        this.f29907l = -1;
        this.f29908m = -1;
        this.f29909n = -1;
        this.f29910o = -1;
    }

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f29896a = networkSettings.getProviderName();
        this.f29906k = networkSettings.getProviderName();
        this.f29897b = networkSettings.getProviderTypeForReflection();
        this.f29899d = networkSettings.getRewardedVideoSettings();
        this.f29900e = networkSettings.getInterstitialSettings();
        this.f29901f = networkSettings.getBannerSettings();
        this.f29902g = networkSettings.getNativeAdSettings();
        this.f29898c = networkSettings.getApplicationSettings();
        this.f29907l = networkSettings.getRewardedVideoPriority();
        this.f29908m = networkSettings.getInterstitialPriority();
        this.f29909n = networkSettings.getBannerPriority();
        this.f29910o = networkSettings.getNativeAdPriority();
        this.f29911p = networkSettings.getProviderDefaultInstance();
        this.f29912q = networkSettings.getProviderNetworkKey();
    }
}
