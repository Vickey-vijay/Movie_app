package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.MainThread;
import com.bytedance.sdk.openadsdk.common.ra;

/* JADX INFO: loaded from: classes11.dex */
public interface PAGLoadListener<Ad> extends ra {
    @MainThread
    void onAdLoaded(Ad ad2);

    @Override // com.bytedance.sdk.openadsdk.common.ra
    @MainThread
    void onError(int i10, String str);
}
