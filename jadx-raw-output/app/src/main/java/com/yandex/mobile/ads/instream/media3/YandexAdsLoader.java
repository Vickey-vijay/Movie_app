package com.yandex.mobile.ads.instream.media3;

import androidx.annotation.MainThread;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.Player;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.io.IOException;
import yads.aj2;

/* JADX INFO: loaded from: classes6.dex */
@MainThread
public final class YandexAdsLoader extends aj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f51044a = new a(0);

    public static final class a {
        public /* synthetic */ a(int i10) {
            this();
        }

        private a() {
        }
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareComplete(AdsMediaSource adsMediaSource, int i10, int i11) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareError(AdsMediaSource adsMediaSource, int i10, int i11, IOException iOException) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void release() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setPlayer(Player player) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setSupportedContentTypes(int... iArr) {
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, AdsLoader.EventListener eventListener) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void stop(AdsMediaSource adsMediaSource, AdsLoader.EventListener eventListener) {
        throw null;
    }
}
