package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
@AdNetworkIdentifier(packageName = g.f44955a)
public class AppLovinCreativeInfo extends CreativeInfo {
    private static final String Y = "is_js_tag_ad";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44312a = "AppLovinCreativeInfo";
    private static final long serialVersionUID = 909322237728593140L;
    private boolean E;

    public AppLovinCreativeInfo(BrandSafetyUtils.AdType adType, String id2, String creativeId, String clickUrl, String videoUrl, String adFormatType, String placementId, String sdkVersion, String downstreamStruct, String dspName, String eventId, String appPackageName, boolean isVideoAd, boolean isPlayable, boolean isJsTagAd) {
        super(adType, g.f44955a, id2, creativeId, clickUrl, videoUrl, downstreamStruct);
        this.E = false;
        this.K = placementId;
        p(adFormatType);
        this.Q = sdkVersion;
        this.ar = dspName;
        this.T = isVideoAd;
        this.W = isPlayable;
        if (o() == null && appPackageName != null) {
            q(appPackageName);
        }
        f(eventId);
        this.E = isJsTagAd;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (this.E) {
            bundleD.putBoolean(Y, true);
            Logger.d(f44312a, "is_js_tag_ad field is " + this.E);
        }
        return bundleD;
    }
}
