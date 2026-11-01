package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public final class Image {
    private int height;
    private final Link link;
    private int width;
    private final String url = "";
    private final List<TrackingInfo> trackers = new ArrayList();

    public final int getHeight() {
        return this.height;
    }

    public final Link getLink() {
        return this.link;
    }

    public final List<TrackingInfo> getTrackers() {
        return this.trackers;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }
}
