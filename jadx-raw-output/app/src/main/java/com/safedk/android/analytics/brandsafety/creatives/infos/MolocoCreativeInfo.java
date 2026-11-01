package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
@AdNetworkIdentifier(packageName = g.D)
public class MolocoCreativeInfo extends CreativeInfo {
    public MolocoCreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String id2, String creativeId, String downstreamStruct, String sdkVersion, String placementId, String packageName, String adDomain, String eventId) {
        super(adType, sdk, id2, creativeId, null, null, downstreamStruct);
        this.Q = sdkVersion;
        this.K = placementId;
        this.M = packageName;
        this.aY = adDomain;
        f(eventId);
    }
}
