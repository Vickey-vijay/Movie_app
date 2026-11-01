package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    void onAdEnded();

    void onAdStarted();

    void onAdVisible();

    default void onAdClosed(Map<String, Object> map) {
        onAdClosed();
    }

    default void onAdEnded(Map<String, Object> map) {
        onAdEnded();
    }

    default void onAdStarted(Map<String, Object> map) {
        onAdStarted();
    }

    default void onAdVisible(Map<String, Object> map) {
        onAdVisible();
    }
}
