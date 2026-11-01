package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: classes6.dex */
@MainThread
public interface NativeAdEventListener {
    void onAdClicked();

    void onImpression(ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
