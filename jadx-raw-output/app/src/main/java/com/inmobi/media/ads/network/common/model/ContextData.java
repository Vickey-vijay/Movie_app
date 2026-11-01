package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public final class ContextData {
    private final String advertisedContent;
    private final Long bidderId;
    private final int casAdTypeId = -1;
    private final boolean enabled;

    public final String getAdvertisedContent() {
        return this.advertisedContent;
    }

    public final Long getBidderId() {
        return this.bidderId;
    }

    public final int getCasAdTypeId() {
        return this.casAdTypeId;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
