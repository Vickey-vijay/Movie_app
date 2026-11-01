package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.IAd;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes2.dex */
public interface AdListener<AdType extends IAd> {
    void onAdClicked(@NonNull AdType adtype);

    void onAdExpired(@NonNull AdType adtype);

    void onAdImpression(@NonNull AdType adtype);

    void onAdLoadFailed(@NonNull AdType adtype, @NonNull BMError bMError);

    void onAdLoaded(@NonNull AdType adtype);

    void onAdShowFailed(@NonNull AdType adtype, @NonNull BMError bMError);
}
