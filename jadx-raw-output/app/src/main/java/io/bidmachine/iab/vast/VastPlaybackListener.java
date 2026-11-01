package io.bidmachine.iab.vast;

import androidx.annotation.FloatRange;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public interface VastPlaybackListener extends Serializable {
    void onVideoCompleted();

    void onVideoFirstQuartile();

    void onVideoMidpoint();

    void onVideoPaused();

    void onVideoResumed();

    void onVideoSkipped();

    void onVideoStarted(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11);

    void onVideoThirdQuartile();

    void onVideoVolumeChanged(@FloatRange(from = 0.0d, to = 1.0d) float f10);
}
