package com.inmobi.ads.core;

import androidx.annotation.Keep;
import java.util.List;
import nj.s;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class TrackingInfo {
    private final String imBaseUrl = "";
    private final List<Trackers> trackers = s.k();

    public final String getImBaseUrl() {
        return this.imBaseUrl;
    }

    public final List<Trackers> getTrackers() {
        return this.trackers;
    }
}
