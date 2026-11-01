package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;

/* JADX INFO: loaded from: classes6.dex */
@AdNetworkIdentifier(packageName = "com.facebook.ads")
public class FacebookAudienceNetworkCreativeInfo extends CreativeInfo {
    public static final String E = "unknown";
    public static final String Y = "template";
    public static final String Z = "markup";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44362a = "placementId";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    public static final String f44363aa = "end_card_markup";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final String f44364ab = "template_carousel";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    String f44365ac;

    public FacebookAudienceNetworkCreativeInfo(BrandSafetyUtils.AdType adType, String id2, String clickUrl, String videoUrl, String placementId, String downstreamStruct) {
        super(adType, "com.facebook.ads", id2, null, clickUrl, videoUrl, downstreamStruct);
        this.H = true;
        this.f44365ac = placementId;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String G() {
        return super.G() + this.f44365ac;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        bundleD.putString("placementId", this.f44365ac);
        return bundleD;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(this.f44365ac) || (TextUtils.isEmpty(M()) && TextUtils.isEmpty(this.J));
    }
}
