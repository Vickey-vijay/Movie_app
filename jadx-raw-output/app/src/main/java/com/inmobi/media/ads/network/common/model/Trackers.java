package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class Trackers {
    private final String type;
    private final List<String> url = new ArrayList();

    public static /* synthetic */ void getType$annotations() {
    }

    public final String getType() {
        return this.type;
    }

    public final List<String> getUrl() {
        return this.url;
    }
}
