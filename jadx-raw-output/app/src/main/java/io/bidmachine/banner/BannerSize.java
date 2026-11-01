package io.bidmachine.banner;

import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes10.dex */
public enum BannerSize {
    Size_320x50(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50),
    Size_300x250(d.f44769a, 250),
    Size_728x90(728, 90);

    public final int height;
    public final int width;

    BannerSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }
}
