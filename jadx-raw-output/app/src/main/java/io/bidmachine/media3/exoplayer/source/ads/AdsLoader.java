package io.bidmachine.media3.exoplayer.source.ads;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.AdPlaybackState;
import io.bidmachine.media3.common.AdViewProvider;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Player;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSpec;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface AdsLoader {

    @UnstableApi
    public interface EventListener {
        default void onAdClicked() {
        }

        default void onAdLoadError(AdsMediaSource.AdLoadException adLoadException, DataSpec dataSpec) {
        }

        default void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        }

        default void onAdTapped() {
        }
    }

    public interface Provider {
        @Nullable
        AdsLoader getAdsLoader(MediaItem.AdsConfiguration adsConfiguration);
    }

    @UnstableApi
    void handlePrepareComplete(AdsMediaSource adsMediaSource, int i10, int i11);

    @UnstableApi
    void handlePrepareError(AdsMediaSource adsMediaSource, int i10, int i11, IOException iOException);

    void release();

    void setPlayer(@Nullable Player player);

    @UnstableApi
    void setSupportedContentTypes(int... iArr);

    @UnstableApi
    void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, EventListener eventListener);

    @UnstableApi
    void stop(AdsMediaSource adsMediaSource, EventListener eventListener);
}
