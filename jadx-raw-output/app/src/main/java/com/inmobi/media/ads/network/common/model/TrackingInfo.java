package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public final class TrackingInfo {
    private final String imBaseUrl = "";
    private final List<TrackersV2> trackers = new ArrayList();

    public final String getImBaseUrl() {
        return this.imBaseUrl;
    }

    public final List<TrackersV2> getTrackers() {
        return this.trackers;
    }
}
