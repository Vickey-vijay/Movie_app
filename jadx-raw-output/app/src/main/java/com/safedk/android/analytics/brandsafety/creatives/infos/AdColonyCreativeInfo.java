package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
@AdNetworkIdentifier(packageName = g.f44956b)
public class AdColonyCreativeInfo extends CreativeInfo {
    private static final String Y = "AdColonyCreativeInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44309a = "manifest_url";
    private static final long serialVersionUID = -5937630405018276749L;
    private String Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private String f44310aa;

    public String a() {
        return this.Z;
    }

    public String b() {
        return this.f44310aa;
    }

    public AdColonyCreativeInfo(String id2, String creativeId, String campaignId, String clickUrl, String videoUrl, String adFormat, String placementId, String sdkVersion, boolean isPlayable, String struct) {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, g.f44956b, id2, creativeId, clickUrl, videoUrl, struct);
        this.Z = campaignId;
        p(adFormat);
        this.K = placementId;
        this.Q = sdkVersion;
        this.W = isPlayable;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    public void a(String str) {
        this.f44310aa = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (!TextUtils.isEmpty(this.Z)) {
            bundleD.putString(CreativeInfo.D, this.Z);
        }
        if (this.f44310aa != null && !this.f44310aa.isEmpty()) {
            bundleD.putString(f44309a, this.f44310aa);
        }
        return bundleD;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void a(Object obj) {
        if (this.aW != null) {
            Logger.d(Y, "ci matching object address was not set because it was already set previously to: " + this.aW);
        } else if (obj != null) {
            this.aX = obj.getClass().getCanonicalName();
            this.aW = BrandSafetyUtils.a(obj);
            Logger.d(Y, "set matching object - type: " + this.aX + ", address: " + this.aW + ", ad id: " + L());
        }
    }
}
