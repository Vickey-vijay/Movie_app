package io.bidmachine.media3.exoplayer;

import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public interface RendererCapabilitiesList {

    public interface Factory {
        RendererCapabilitiesList createRendererCapabilitiesList();
    }

    RendererCapabilities[] getRendererCapabilities();

    void release();

    int size();
}
