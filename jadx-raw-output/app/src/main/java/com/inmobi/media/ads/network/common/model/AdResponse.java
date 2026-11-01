package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import com.inmobi.media.Ue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public final class AdResponse {
    private String requestId = "";
    private final long placementId = -1;

    @Ue
    private final List<AdSet> adSets = new ArrayList();

    public final List<AdSet> getAdSets() {
        return this.adSets;
    }

    public final long getPlacementId() {
        return this.placementId;
    }

    public final String getRequestId() {
        return this.requestId;
    }
}
