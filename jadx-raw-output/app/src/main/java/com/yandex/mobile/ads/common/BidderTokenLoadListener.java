package com.yandex.mobile.ads.common;

import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes2.dex */
public interface BidderTokenLoadListener {
    @MainThread
    void onBidderTokenFailedToLoad(String str);

    @MainThread
    void onBidderTokenLoaded(String str);
}
