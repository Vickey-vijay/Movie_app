package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface AdapterAdListener {
    void onAdClicked();

    void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str);

    void onAdLoadSuccess();

    void onAdOpened();

    void onAdShowFailed(int i10, String str);

    default void onAdClicked(Map<String, Object> map) {
        onAdClicked();
    }

    default void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str, Map<String, Object> map) {
        onAdLoadFailed(adapterErrorType, i10, str);
    }

    default void onAdLoadSuccess(Map<String, Object> map) {
        onAdLoadSuccess();
    }

    default void onAdOpened(Map<String, Object> map) {
        onAdOpened();
    }

    default void onAdShowFailed(int i10, String str, Map<String, Object> map) {
        onAdShowFailed(i10, str);
    }
}
