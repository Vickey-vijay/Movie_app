package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.g;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class MintegralCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f44377aa = "MintegralCreativeInfo";
    private static final long serialVersionUID = 5780851683333587923L;
    private String Y;
    private String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44378a;

    public String a() {
        return this.f44378a;
    }

    public void a(String str) {
        this.f44378a = str;
    }

    public String b() {
        return this.Y;
    }

    public void H(String str) {
        this.Y = str;
    }

    public String aj() {
        return this.Z;
    }

    public void I(String str) {
        this.Z = str;
    }

    public MintegralCreativeInfo(String id2, BrandSafetyUtils.AdType adType, String creativeId, String clickUrl, String videoUrl, String imageUrl, String adFormat, String placementId, String sdkVersion, String downstreamStruct, boolean playableAd, String packageName) {
        super(adType, g.f44969o, id2, creativeId, clickUrl, videoUrl, downstreamStruct);
        this.f44378a = null;
        this.Y = null;
        this.Z = null;
        p(adFormat);
        this.K = placementId;
        this.Q = sdkVersion;
        this.M = packageName;
        this.W = playableAd;
        z(imageUrl);
    }

    public void b(String str, Set<String> set) {
        a(str, set);
        this.ay = true;
    }
}
