package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* JADX INFO: loaded from: classes6.dex */
public class PAGBiddingRequest {
    private PAGBannerSize ouw = null;
    private String vt = null;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private String f12185lh = null;

    public String getAdxId() {
        return this.f12185lh;
    }

    public PAGBannerSize getBannerSize() {
        return this.ouw;
    }

    public String getSlotId() {
        return this.vt;
    }

    public void setAdxId(String str) {
        this.f12185lh = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.ouw = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.vt = str;
    }
}
