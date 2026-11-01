package com.yandex.mobile.ads.video.playback;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes9.dex */
@MainThread
public interface VideoAdPlaybackListener {
    void onAdClicked(VideoAd videoAd);

    void onAdCompleted(VideoAd videoAd);

    void onAdError(VideoAd videoAd);

    void onAdPaused(VideoAd videoAd);

    void onAdPrepared(VideoAd videoAd);

    void onAdResumed(VideoAd videoAd);

    void onAdSkipped(VideoAd videoAd);

    void onAdStarted(VideoAd videoAd);

    void onAdStopped(VideoAd videoAd);

    void onImpression(VideoAd videoAd);

    void onVolumeChanged(VideoAd videoAd, float f10);
}
