package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public final class LandingPageParam {
    private final InlineParams aParams;
    private final String openMode = "DEFAULT";
    private final boolean supportLockScreen;

    public static /* synthetic */ void getOpenMode$annotations() {
    }

    public final InlineParams getAParams() {
        return this.aParams;
    }

    public final String getOpenMode() {
        return this.openMode;
    }

    public final boolean getSupportLockScreen() {
        return this.supportLockScreen;
    }
}
