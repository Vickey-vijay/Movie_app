package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.lh;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes7.dex */
public final class PAGBannerSize {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f12184lh = 1;
    private int ouw;
    private int vt;
    private int yu;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(d.f44769a, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.yu = i11;
        pAGBannerSize.f12184lh = 3;
        return pAGBannerSize;
    }

    public final int getHeight() {
        return this.vt;
    }

    public final int getMaxHeight() {
        return this.yu;
    }

    public final int getType() {
        return this.f12184lh;
    }

    public final int getWidth() {
        return this.ouw;
    }

    public PAGBannerSize(int i10, int i11) {
        this.ouw = i10;
        this.vt = i11;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        int iOuw = lh.ouw(context, i10);
        if (iOuw == lh.ouw) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, iOuw);
        pAGBannerSize.f12184lh = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iOuw = lh.ouw(context);
        if (iOuw == lh.ouw) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.yu = iOuw;
        pAGBannerSize.f12184lh = 3;
        return pAGBannerSize;
    }
}
