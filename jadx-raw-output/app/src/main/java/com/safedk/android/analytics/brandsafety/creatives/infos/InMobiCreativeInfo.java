package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class InMobiCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44370a = "advertised_content";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f44371aa = "InMobiCreativeInfo";
    private static final long serialVersionUID = 5552604508381236855L;
    private int E;
    private String Y;
    private String Z;

    public String a() {
        return this.Y;
    }

    public InMobiCreativeInfo(String id2, String creativeId, String placementId, String sdkVersion, BrandSafetyUtils.AdType adType, int multiAds, BrandSafetyEvent.AdFormatType adFormat, String eventId, String advertisedContent) {
        BrandSafetyEvent.AdFormatType adFormat2;
        super(adType, g.f44963i, id2, creativeId, null, null, null);
        this.K = placementId;
        this.Y = id2;
        this.Q = sdkVersion;
        this.E = multiAds;
        if (adFormat != null) {
            p(adFormat == BrandSafetyEvent.AdFormatType.LEADER ? BrandSafetyEvent.AdFormatType.BANNER.name() : adFormat.name());
        } else if (adType != null && (adFormat2 = BrandSafetyUtils.a(adType)) != null) {
            p(adFormat2.name());
        }
        f(eventId);
        this.Z = advertisedContent;
    }

    public int b() {
        return this.E;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (this.aw != null && !this.aw.isEmpty()) {
            synchronized (this.aw) {
                bundleD.putStringArrayList(BrandSafetyEvent.f44602u, new ArrayList<>(this.aw));
            }
        }
        if (!TextUtils.isEmpty(this.Z)) {
            bundleD.putString(f44370a, this.Z);
        }
        return bundleD;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        if (str == null) {
            return false;
        }
        return super.b(str.split(C3426d4.j.f28584c)[0]);
    }

    public InMobiCreativeInfo aj() {
        return new InMobiCreativeInfo(L(), N(), this.K, this.Q, K(), this.E, BrandSafetyEvent.AdFormatType.valueOf(I()), m(), this.Z);
    }
}
