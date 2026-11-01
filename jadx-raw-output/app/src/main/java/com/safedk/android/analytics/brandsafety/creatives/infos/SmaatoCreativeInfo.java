package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
@AdNetworkIdentifier(packageName = g.f44976v)
public class SmaatoCreativeInfo extends CreativeInfo {
    private static final String E = "iurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44379a = "SmaatoCreativeInfo";
    private String Y;

    public String a() {
        return this.Y;
    }

    public SmaatoCreativeInfo(String id2, String creativeId, BrandSafetyUtils.AdType adType, BrandSafetyEvent.AdFormatType adFormat, String placementId, String adDomain, String iurl, String downstreamStruct, String sdkVersion, String clickUrl) {
        super(adType, g.f44976v, id2, creativeId, clickUrl, null, downstreamStruct);
        p(adFormat.toString());
        this.K = placementId;
        this.aY = adDomain;
        this.Y = iurl;
        this.Q = sdkVersion;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (!TextUtils.isEmpty(this.Y)) {
            bundleD.putString(E, this.Y);
        }
        return bundleD;
    }
}
