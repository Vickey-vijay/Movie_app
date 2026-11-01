package io.bidmachine.rendering.ad.view;

import androidx.annotation.NonNull;
import io.bidmachine.rendering.ad.AdListener;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lio/bidmachine/rendering/ad/view/AdViewListener;", "Lio/bidmachine/rendering/ad/AdListener;", "Lio/bidmachine/rendering/ad/view/AdView;", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface AdViewListener extends AdListener<AdView> {
    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdAppeared(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdClicked(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdDisappeared(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdExpired(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdFailToLoad(@NonNull AdView adView, @NonNull Error error);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdFailToShow(@NonNull AdView adView, @NonNull Error error);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdFinished(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdLoaded(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onAdShown(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onBrokenCreativeEvent(@NonNull AdView adView, @NonNull BrokenCreativeEvent brokenCreativeEvent);

    @Override // io.bidmachine.rendering.ad.AdListener
    /* synthetic */ void onOpenPrivacySheet(@NonNull AdView adView, @NonNull PrivacySheetParams privacySheetParams);
}
