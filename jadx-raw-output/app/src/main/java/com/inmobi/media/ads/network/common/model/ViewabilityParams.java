package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class ViewabilityParams {
    private final byte type;
    private final String view = "";
    private final String time = "";
    private final String pixel = "";
    private final int[] frame = {0, 0, 0, 0};

    public static /* synthetic */ void getType$annotations() {
    }

    public final int[] getFrame() {
        return this.frame;
    }

    public final String getPixel() {
        return this.pixel;
    }

    public final String getTime() {
        return this.time;
    }

    public final byte getType() {
        return this.type;
    }

    public final String getView() {
        return this.view;
    }
}
