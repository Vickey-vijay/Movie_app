package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class NativeMedia {
    private final NativeImage image;
    private String type = "";
    private final NativeVideo video;

    public static /* synthetic */ void getType$annotations() {
    }

    public final NativeImage getImage() {
        return this.image;
    }

    public final String getType() {
        return this.type;
    }

    public final NativeVideo getVideo() {
        return this.video;
    }
}
