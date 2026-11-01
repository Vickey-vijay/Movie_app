package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class NativeImage {
    private final List<Image> assets = new ArrayList();
    private final boolean required;

    public final List<Image> getAssets() {
        return this.assets;
    }

    public final boolean getRequired() {
        return this.required;
    }
}
