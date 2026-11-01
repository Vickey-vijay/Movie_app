package io.bidmachine.rendering.ad.fullscreen;

import androidx.annotation.NonNull;
import io.bidmachine.rendering.ad.AdListener;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;

/* JADX INFO: loaded from: classes2.dex */
public interface FullScreenAdListener extends AdListener<FullScreenAd> {
    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdAppeared(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdClicked(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdDisappeared(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdExpired(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdFailToLoad(@NonNull FullScreenAd fullScreenAd, @NonNull Error error);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdFailToShow(@NonNull FullScreenAd fullScreenAd, @NonNull Error error);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdFinished(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdLoaded(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdShown(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onBrokenCreativeEvent(@NonNull FullScreenAd fullScreenAd, @NonNull BrokenCreativeEvent brokenCreativeEvent);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onOpenPrivacySheet(@NonNull FullScreenAd fullScreenAd, @NonNull PrivacySheetParams privacySheetParams);
}
