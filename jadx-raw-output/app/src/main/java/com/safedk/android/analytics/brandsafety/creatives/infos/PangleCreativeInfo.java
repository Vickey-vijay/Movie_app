package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public class PangleCreativeInfo extends CreativeInfo {
    public PangleCreativeInfo(BrandSafetyUtils.AdType adType, String id2, String creativeId, String clickUrl, String videoUrl, String endCardUrl, boolean isPlayable, String placementId, String sdkVersion, String packageName, String downstreamStruct) {
        super(adType, g.f44975u, id2, creativeId, clickUrl, videoUrl, downstreamStruct);
        this.Q = sdkVersion;
        this.K = placementId;
        this.W = isPlayable;
        this.at = endCardUrl;
        this.M = packageName;
    }
}
