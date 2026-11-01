package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes11.dex */
public interface InternalLoadListener {
    void onAdLoadFailed(@NonNull InternalAd internalAd, @NonNull BMError bMError);

    void onAdLoaded(@NonNull InternalAd internalAd, @Nullable InternalAdLoadData internalAdLoadData);
}
