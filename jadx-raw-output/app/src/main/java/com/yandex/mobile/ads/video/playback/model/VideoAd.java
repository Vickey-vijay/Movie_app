package com.yandex.mobile.ads.video.playback.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface VideoAd {
    VideoAdInfo getAdInfo();

    AdPodInfo getAdPodInfo();

    long getDuration();

    VideoAdExtensions getExtensions();

    String getInfo();

    MediaFile getMediaFile();

    List<MediaFile> getMediaFiles();

    SkipInfo getSkipInfo();
}
