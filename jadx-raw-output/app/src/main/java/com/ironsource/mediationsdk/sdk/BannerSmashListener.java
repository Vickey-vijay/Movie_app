package com.ironsource.mediationsdk.sdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface BannerSmashListener {
    void onBannerAdClicked();

    void onBannerAdLeftApplication();

    void onBannerAdLoadFailed(IronSourceError ironSourceError);

    void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams);

    void onBannerAdScreenDismissed();

    void onBannerAdScreenPresented();

    void onBannerAdShown();

    void onBannerInitFailed(IronSourceError ironSourceError);

    void onBannerInitSuccess();

    default void onBannerAdClicked(Map<String, Object> map) {
        onBannerAdClicked();
    }

    default void onBannerAdLeftApplication(Map<String, Object> map) {
        onBannerAdLeftApplication();
    }

    default void onBannerAdLoadFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onBannerAdLoadFailed(ironSourceError);
    }

    default void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        onBannerAdLoaded(view, layoutParams);
    }

    default void onBannerAdScreenDismissed(Map<String, Object> map) {
        onBannerAdScreenDismissed();
    }

    default void onBannerAdScreenPresented(Map<String, Object> map) {
        onBannerAdScreenPresented();
    }

    default void onBannerAdShown(Map<String, Object> map) {
        onBannerAdShown();
    }

    default void onBannerInitFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onBannerInitFailed(ironSourceError);
    }

    default void onBannerInitSuccess(Map<String, Object> map) {
        onBannerInitSuccess();
    }
}
