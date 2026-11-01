package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class JsonAssetObject {
    private final Image adChoice;
    private final AppMetrics appMetrics;
    private final CTA cta;
    private final Description description;
    private final Icon icon;
    private final NativeMedia media;
    private final Sponsored sponsored;
    private final Title title;

    public final Image getAdChoice() {
        return this.adChoice;
    }

    public final AppMetrics getAppMetrics() {
        return this.appMetrics;
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final Description getDescription() {
        return this.description;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final NativeMedia getMedia() {
        return this.media;
    }

    public final Sponsored getSponsored() {
        return this.sponsored;
    }

    public final Title getTitle() {
        return this.title;
    }
}
