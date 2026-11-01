package com.applovin.impl.sdk.ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.t1;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.u f9133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f9135c;

    public abstract JSONObject getOriginalFullResponse();

    @Override // com.applovin.impl.t1
    public void setExpired() {
        this.f9134b = true;
    }

    private long b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(x4.f9893c1)).longValue());
    }

    public boolean equals(Object obj) {
        AppLovinAd appLovinAdC;
        if ((obj instanceof c) && (appLovinAdC = ((c) obj).c()) != null) {
            obj = appLovinAdC;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject(CreativeInfo.f44321c, -1L);
    }

    public com.applovin.impl.u getAdZone() {
        com.applovin.impl.u uVar = this.f9133a;
        if (uVar != null) {
            if (uVar.f() != null && this.f9133a.g() != null) {
                return this.f9133a;
            }
            if (getSize() == null && getType() == null) {
                return this.f9133a;
            }
        }
        com.applovin.impl.u uVarA = com.applovin.impl.u.a(getSize(), getType(), getStringFromFullResponse("zone_id", null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f9133a = uVarA;
        return uVarA;
    }

    public c getDummyAd() {
        return this.f9135c;
    }

    @Nullable
    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    public String getRawFullResponse() {
        String string;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.toString();
        }
        synchronized (this.fullResponseLock) {
            string = this.fullResponse.toString();
        }
        return string;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.O();
        if (!com.applovin.impl.sdk.o.a()) {
            return false;
        }
        this.sdk.O().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public boolean isExpired() {
        return this.f9134b;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.f9135c = cVar;
    }

    public void setHasShown(boolean z10) {
        try {
            h5 h5Var = this.synchronizedAdObject;
            if (h5Var != null) {
                h5Var.a("shown", (Object) Boolean.valueOf(z10));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z10);
            }
        } catch (Throwable unused) {
        }
    }

    @NonNull
    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }

    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, jSONObject2, kVar);
    }

    public boolean canExpire() {
        if (getSize() == AppLovinAdSize.INTERSTITIAL && b() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.t1
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return b() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", null);
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }
}
