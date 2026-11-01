package com.vungle.ads;

import kotlin.Metadata;

/* JADX INFO: compiled from: BidTokenCallback.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/vungle/ads/BidTokenCallback;", "", "", "bidToken", "Lmj/r;", "onBidTokenCollected", "errorMessage", "onBidTokenError", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public interface BidTokenCallback {
    void onBidTokenCollected(String str);

    void onBidTokenError(String str);
}
