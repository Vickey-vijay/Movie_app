package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface AdapterAdRewardListener extends AdapterAdInteractionListener {
    void onAdRewarded();

    default void onAdRewarded(Map<String, Object> map) {
        onAdRewarded();
    }
}
