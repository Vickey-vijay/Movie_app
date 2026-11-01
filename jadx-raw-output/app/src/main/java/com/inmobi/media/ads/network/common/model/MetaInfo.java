package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class MetaInfo {
    private String creativeType = "unknown";
    private final boolean iasEnabled;
    private final List<LandingPageParam> landingPageParams;
    private final OmSdkInfo omsdkInfo;

    public static /* synthetic */ void getCreativeType$annotations() {
    }

    public final String getCreativeType() {
        return this.creativeType;
    }

    public final boolean getIasEnabled() {
        return this.iasEnabled;
    }

    public final List<LandingPageParam> getLandingPageParams() {
        return this.landingPageParams;
    }

    public final OmSdkInfo getOmsdkInfo() {
        return this.omsdkInfo;
    }
}
