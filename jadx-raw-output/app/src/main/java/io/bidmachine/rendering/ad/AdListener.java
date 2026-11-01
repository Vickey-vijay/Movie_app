package io.bidmachine.rendering.ad;

import androidx.annotation.NonNull;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;

/* JADX INFO: loaded from: classes10.dex */
public interface AdListener<Ad> {
    void onAdAppeared(@NonNull Ad ad2);

    void onAdClicked(@NonNull Ad ad2);

    void onAdDisappeared(@NonNull Ad ad2);

    void onAdExpired(@NonNull Ad ad2);

    void onAdFailToLoad(@NonNull Ad ad2, @NonNull Error error);

    void onAdFailToShow(@NonNull Ad ad2, @NonNull Error error);

    void onAdFinished(@NonNull Ad ad2);

    void onAdLoaded(@NonNull Ad ad2);

    void onAdShown(@NonNull Ad ad2);

    void onBrokenCreativeEvent(@NonNull Ad ad2, @NonNull BrokenCreativeEvent brokenCreativeEvent);

    void onOpenPrivacySheet(@NonNull Ad ad2, @NonNull PrivacySheetParams privacySheetParams);
}
