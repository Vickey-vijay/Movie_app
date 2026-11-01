package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.rendering.model.PrivacySheetParams;

/* JADX INFO: loaded from: classes10.dex */
public interface MraidInterstitialListener {
    void onCalendarEvent(@NonNull MraidInterstitial mraidInterstitial, @NonNull String str, @NonNull IabClickCallback iabClickCallback);

    void onClose(@NonNull MraidInterstitial mraidInterstitial);

    void onExpired(@NonNull MraidInterstitial mraidInterstitial, @NonNull IabError iabError);

    void onLoadFailed(@NonNull MraidInterstitial mraidInterstitial, @NonNull IabError iabError);

    void onLoaded(@NonNull MraidInterstitial mraidInterstitial);

    void onOpenPrivacySheet(@NonNull MraidInterstitial mraidInterstitial, @NonNull PrivacySheetParams privacySheetParams);

    void onOpenUrl(@NonNull MraidInterstitial mraidInterstitial, @NonNull String str, @NonNull IabClickCallback iabClickCallback);

    void onPlayVideo(@NonNull MraidInterstitial mraidInterstitial, @NonNull String str);

    void onShowFailed(@NonNull MraidInterstitial mraidInterstitial, @NonNull IabError iabError);

    void onShown(@NonNull MraidInterstitial mraidInterstitial);

    void onStorePicture(@NonNull MraidInterstitial mraidInterstitial, @NonNull String str, @NonNull IabClickCallback iabClickCallback);
}
