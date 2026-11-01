package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.flow.v0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes2.dex */
public class InneractiveAdRequest extends v0 {
    public static final double FLOOR_PRICE_MAX_VALUE = 400000.0d;
    public static final double FLOOR_PRICE_MIN_VALUE = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f15290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f15291e;

    public Double getFloorPrice() {
        return this.f15291e;
    }

    public s0 getSelectedUnitConfig() {
        return this.f15290d;
    }

    public String getSpotId() {
        return this.f15289c;
    }

    public void setSelectedUnitConfig(s0 s0Var) {
        this.f15290d = s0Var;
    }

    public InneractiveAdRequest(String str) {
        this.f15289c = str;
    }

    @Deprecated
    public boolean getMuteVideo() {
        return InneractiveAdManager.getMuteVideo();
    }

    @Deprecated
    public InneractiveUserConfig getUserParams() {
        return InneractiveAdManager.getUserParams();
    }

    public void setFloorPrice(double d10) {
        double dMax = 0.0d;
        if (!Double.isNaN(d10)) {
            dMax = Math.max(0.0d, Math.min(d10, 400000.0d));
        }
        if (dMax != d10) {
            IAlog.f("Invalid floor price: %.2f — adjusted to %.2f.", Double.valueOf(d10), Double.valueOf(dMax));
        }
        this.f15291e = Double.valueOf(dMax);
    }

    @Deprecated
    public void setMuteVideo(boolean z10) {
        InneractiveAdManager.setMuteVideo(z10);
    }

    @Deprecated
    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
