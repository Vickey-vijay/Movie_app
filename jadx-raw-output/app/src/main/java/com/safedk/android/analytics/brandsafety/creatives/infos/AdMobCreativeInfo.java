package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
@AdNetworkIdentifier(packageName = g.f44962h)
public class AdMobCreativeInfo extends CreativeInfo {
    private static String[] Y = {"googleusercontent.com", "/simgad/", "mts0.google.com", "gstatic.com", "pageadimg/imgad"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44311a = "AdMobCreativeInfo";
    private static final long serialVersionUID = -3498860760603370212L;

    public AdMobCreativeInfo(String id2, BrandSafetyUtils.AdType adType, String creativeId, String clickUrl, String placementId, String videoUrl, String sdkVersion, String downstreamStruct, String appPackageName) {
        super(adType, g.f44962h, id2, creativeId, clickUrl, videoUrl, downstreamStruct);
        this.K = placementId;
        this.Q = sdkVersion;
        if (o() == null && appPackageName != null) {
            q(appPackageName);
        }
    }

    public static boolean a(String str) {
        for (String str2 : Y) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        return a(str) || super.b(str);
    }
}
