package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface RewardedVideoSmashListener {
    void onRewardedVideoAdClicked();

    void onRewardedVideoAdClosed();

    void onRewardedVideoAdEnded();

    void onRewardedVideoAdOpened();

    void onRewardedVideoAdRewarded();

    void onRewardedVideoAdShowFailed(IronSourceError ironSourceError);

    void onRewardedVideoAdStarted();

    void onRewardedVideoAdVisible();

    void onRewardedVideoAvailabilityChanged(boolean z10);

    void onRewardedVideoInitFailed(IronSourceError ironSourceError);

    void onRewardedVideoInitSuccess();

    void onRewardedVideoLoadFailed(IronSourceError ironSourceError);

    void onRewardedVideoLoadSuccess();

    default void onRewardedVideoAdClicked(Map<String, Object> map) {
        onRewardedVideoAdClicked();
    }

    default void onRewardedVideoAdClosed(Map<String, Object> map) {
        onRewardedVideoAdClosed();
    }

    default void onRewardedVideoAdEnded(Map<String, Object> map) {
        onRewardedVideoAdEnded();
    }

    default void onRewardedVideoAdOpened(Map<String, Object> map) {
        onRewardedVideoAdOpened();
    }

    default void onRewardedVideoAdRewarded(Map<String, Object> map) {
        onRewardedVideoAdRewarded();
    }

    default void onRewardedVideoAdShowFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onRewardedVideoAdShowFailed(ironSourceError);
    }

    default void onRewardedVideoAdStarted(Map<String, Object> map) {
        onRewardedVideoAdStarted();
    }

    default void onRewardedVideoAdVisible(Map<String, Object> map) {
        onRewardedVideoAdVisible();
    }

    default void onRewardedVideoAvailabilityChanged(boolean z10, Map<String, Object> map) {
        onRewardedVideoAvailabilityChanged(z10);
    }

    default void onRewardedVideoInitFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onRewardedVideoInitFailed(ironSourceError);
    }

    default void onRewardedVideoInitSuccess(Map<String, Object> map) {
        onRewardedVideoInitSuccess();
    }

    default void onRewardedVideoLoadFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onRewardedVideoLoadFailed(ironSourceError);
    }

    default void onRewardedVideoLoadSuccess(Map<String, Object> map) {
        onRewardedVideoLoadSuccess();
    }
}
