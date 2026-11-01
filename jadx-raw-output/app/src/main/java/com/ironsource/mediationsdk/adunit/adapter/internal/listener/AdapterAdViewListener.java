package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface AdapterAdViewListener extends AdapterAdListener {
    void onAdLeftApplication();

    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);

    void onAdScreenDismissed();

    void onAdScreenPresented();

    default void onAdLeftApplication(Map<String, Object> map) {
        onAdLeftApplication();
    }

    default void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        onAdLoadSuccess(view, layoutParams);
    }

    default void onAdScreenDismissed(Map<String, Object> map) {
        onAdScreenDismissed();
    }

    default void onAdScreenPresented(Map<String, Object> map) {
        onAdScreenPresented();
    }
}
