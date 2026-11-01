package com.yandex.mobile.ads.video.playback.model;

import yads.cf3;

/* JADX INFO: loaded from: classes5.dex */
public interface MediaFile extends cf3 {
    int getAdHeight();

    int getAdWidth();

    String getApiFramework();

    Integer getBitrate();

    String getMediaType();

    @Override // yads.cf3
    String getUrl();
}
