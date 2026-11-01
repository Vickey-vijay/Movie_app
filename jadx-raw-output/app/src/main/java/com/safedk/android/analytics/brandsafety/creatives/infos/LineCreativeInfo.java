package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
@AdNetworkIdentifier(packageName = g.f44980z)
public class LineCreativeInfo extends CreativeInfo {
    private static final long serialVersionUID = -7630682732175543532L;
    private String Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44376a;

    public LineCreativeInfo(BrandSafetyUtils.AdType adType, String id2, String creativeId, String clickUrl, String interstitialImageUrl, String placementId, String sdkVersion) {
        super(adType == null ? BrandSafetyUtils.AdType.INTERSTITIAL : adType, g.f44980z, id2, creativeId, clickUrl, null, null);
        this.f44376a = 0;
        this.Y = null;
        h(placementId);
        this.Y = interstitialImageUrl;
        this.Q = sdkVersion;
    }

    public int a() {
        return this.f44376a;
    }

    public String b() {
        return this.Y;
    }
}
