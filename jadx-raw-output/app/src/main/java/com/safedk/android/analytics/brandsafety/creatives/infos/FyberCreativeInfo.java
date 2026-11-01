package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@AdNetworkIdentifier(packageName = g.f44970p)
public class FyberCreativeInfo extends CreativeInfo {
    private static final String Y = "FyberCreativeInfo";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f44366aa = "alternative_click_url";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final List<String> f44367ac = Arrays.asList("www.serveroute.com/log_string", "column=", "line=", "ad_exchange=inneractive&mraid_version=");
    private static final long serialVersionUID = -5726627304425536096L;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private String f44368ad;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private String f44369ag;

    public String a() {
        return this.f44368ad;
    }

    public String b() {
        return this.f44369ag;
    }

    public FyberCreativeInfo(String id2, String creativeId, String campaignId, String clickUrl, String videoUrl, String adFormat, BrandSafetyUtils.AdType adType, String spotId, String sdkVersion, String adNetwork, String adDomain, String alternativeClickUrl, String eventId) {
        super(adType, g.f44970p, id2, creativeId, clickUrl, videoUrl, "");
        this.K = spotId;
        Logger.d(Y, "FyberCreativeInfo ctor started");
        p(adFormat);
        this.f44368ad = campaignId;
        this.Q = sdkVersion;
        this.ar = adNetwork;
        this.aY = adDomain;
        this.f44369ag = alternativeClickUrl;
        f(eventId);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (!TextUtils.isEmpty(this.f44368ad)) {
            bundleD.putString(CreativeInfo.D, this.f44368ad);
        }
        if (!TextUtils.isEmpty(this.f44369ag)) {
            bundleD.putString(f44366aa, this.f44369ag);
        }
        return bundleD;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void b(List<String> list) {
        Logger.d(Y, "classifyPrefetchUrl started, urlList=" + list);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strD = D(it.next());
                boolean z10 = false;
                if (!TextUtils.isEmpty(strD)) {
                    if (b(strD)) {
                        z(strD);
                        z10 = true;
                    } else if (v(strD) && !strD.equals(M())) {
                        x(strD);
                        z10 = true;
                    }
                    if (!z10) {
                        Logger.d(Y, "classifyPrefetchUrl url is unclassified and will be dropped : " + strD);
                    }
                }
            }
        }
    }
}
