package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@AdNetworkIdentifier(packageName = "com.unity3d.ads")
public class UnityAdsCreativeInfo extends CreativeInfo {
    private static final String E = "UnityAdsCreativeInfo";
    private static final String Z = "playableUrl";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String[] f44380ah = {g.f44962h, "com.unity3d.ads"};
    private static final long serialVersionUID = 7447619620074487878L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44381a;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private String f44382ac;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private String f44383ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private String f44384af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private String f44385ag;

    public String a() {
        return this.f44381a;
    }

    public String b() {
        return this.f44383ae;
    }

    public String aj() {
        return this.f44384af;
    }

    public UnityAdsCreativeInfo(String id2, String creativeId, String clickUrl, String videoUrl, String playableAd, String contentType, String adDomain, String adFormat, String placementId, String sdkVersion, String bundleId, String buyerId, String endCardUrl) {
        super(BrandSafetyEvent.AdFormatType.BANNER.name().equals(adFormat) ? BrandSafetyUtils.AdType.BANNER : BrandSafetyUtils.AdType.INTERSTITIAL, "com.unity3d.ads", id2, creativeId, clickUrl, videoUrl, contentType);
        this.f44381a = null;
        this.f44382ac = playableAd;
        this.aY = adDomain;
        p(adFormat);
        this.K = placementId;
        this.Q = sdkVersion;
        if (TextUtils.isEmpty(this.M)) {
            this.M = bundleId;
        }
        this.ar = buyerId;
        this.at = endCardUrl;
        this.W = !TextUtils.isEmpty(this.f44382ac);
    }

    public String ak() {
        return this.at;
    }

    public String al() {
        return this.f44382ac;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String n() {
        return this.aY;
    }

    public void c(String str, String str2) {
        this.f44383ae = str;
        this.f44384af = str2;
        if (!TextUtils.isEmpty(str2)) {
            this.T = true;
        }
    }

    public void a(String str) {
        this.f44385ag = str;
        if (!TextUtils.isEmpty(str)) {
            this.T = true;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (!TextUtils.isEmpty(this.f44382ac)) {
            bundleD.putString(Z, this.f44382ac);
        }
        if (N() == null || (this.I && this.f44383ae != null)) {
            bundleD.putString("creative_id", this.f44383ae);
        }
        if (this.J == null || (this.I && this.f44384af != null)) {
            bundleD.putString("video_url", this.f44384af);
        }
        return bundleD;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean v(String str) {
        return (this.F.contains(l.f44222b) || this.F.contains(l.f44223c)) ? e.a(f44380ah, str) : super.v(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        if (this.F.contains(l.f44222b) || this.F.contains(l.f44223c)) {
            return AdMobCreativeInfo.a(str) || k.a(str, (Map<String, String>) null) || k.p(str);
        }
        return super.b(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String aa() {
        return N() + (this.f44383ae != null ? ", " + this.f44383ae : "");
    }

    public void H(String str) {
        this.f44381a = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void a(CreativeInfo creativeInfo) {
        Logger.d(E, "mergeScarAdmobCi started");
        l(creativeInfo.Q());
        c(new ArrayList(creativeInfo.s()));
        Iterator<String> it = creativeInfo.p().iterator();
        while (it.hasNext()) {
            x(it.next());
        }
        Iterator<String> it2 = creativeInfo.u().iterator();
        while (it2.hasNext()) {
            C(it2.next());
        }
        Logger.d(E, "mergeScarAdmobCi admob's click url is: " + creativeInfo.M());
        if (creativeInfo.M() != null) {
            Logger.d(E, "mergeScarAdmobCi: setting this object with current ci");
            t(creativeInfo.M());
        }
        if (creativeInfo.v()) {
            d(true);
        }
        if (creativeInfo.H() != null) {
            o(creativeInfo.H());
        }
        if (creativeInfo.g()) {
            Z();
            F(creativeInfo.A());
        }
        if (creativeInfo.N() != null) {
            i(creativeInfo.N());
        }
        if (creativeInfo.U() != null) {
            u(creativeInfo.U());
        }
    }
}
