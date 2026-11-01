package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public final class Title {
    private final Link link;
    private final boolean required;
    private final String text = "";
    private final List<TrackingInfo> trackers = new ArrayList();

    public final Link getLink() {
        return this.link;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getText() {
        return this.text;
    }

    public final List<TrackingInfo> getTrackers() {
        return this.trackers;
    }
}
