package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
@AdNetworkIdentifier(packageName = g.f44960f)
public class IronSourceCreativeInfo extends CreativeInfo {
    private static final String Y = "playableAd";
    private static final String Z = "creativeURL&quot;:&quot;";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44372a = "cpvi";
    private static final long serialVersionUID = 583040939198244951L;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private String f44373aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private String f44374ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private String f44375ac;

    public IronSourceCreativeInfo(String id2, String creativeId, String clickUrl, String videoUrl, String adType, String playableAd, String adFormat, String placementId, String endCardUrl, String sdkVersion, String buyerID) {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, g.f44960f, id2, creativeId, clickUrl, videoUrl, adType);
        this.f44373aa = playableAd;
        z(this.f44373aa);
        p(adFormat);
        this.K = placementId;
        this.Q = sdkVersion;
        this.f44374ab = adType;
        this.ar = buyerID;
        this.T = false;
        this.W = !TextUtils.isEmpty(playableAd);
        this.at = endCardUrl;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        boolean z10 = TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
        if (!z10) {
            switch (this.f44374ab) {
                case "cpvi":
                    return TextUtils.isEmpty(this.J);
                case "playableAd":
                    return TextUtils.isEmpty(this.f44373aa);
                default:
                    return z10;
            }
        }
        return z10;
    }

    public String a() {
        return this.f44375ac;
    }

    public String b() {
        return this.f44374ab;
    }

    public String aj() {
        return this.f44373aa;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void F(String str) {
        super.F(str);
        if (str != null && str.indexOf(Z) > -1) {
            this.f44375ac = str.split(Z)[1].split("&quot;,&quot;")[0];
        }
    }
}
