package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public final class TrackersV2 {
    private final String type;
    private final List<String> url = new ArrayList();
    private final List<String> imExts = new ArrayList();

    public static /* synthetic */ void getType$annotations() {
    }

    public final List<String> getImExts() {
        return this.imExts;
    }

    public final String getType() {
        return this.type;
    }

    public final List<String> getUrl() {
        return this.url;
    }
}
