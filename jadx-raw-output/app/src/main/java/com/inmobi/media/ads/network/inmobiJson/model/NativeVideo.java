package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class NativeVideo {
    private final boolean required;
    private final String vastTag = "";
    private final VideoExperience experience = new VideoExperience();
    private final List<TrackingInfo> trackers = new ArrayList();

    public final VideoExperience getExperience() {
        return this.experience;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final List<TrackingInfo> getTrackers() {
        return this.trackers;
    }

    public final String getVastTag() {
        return this.vastTag;
    }
}
