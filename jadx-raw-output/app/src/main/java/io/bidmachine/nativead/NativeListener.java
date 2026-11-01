package io.bidmachine.nativead;

import androidx.annotation.NonNull;
import io.bidmachine.AdListener;
import io.bidmachine.IAd;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes2.dex */
public interface NativeListener extends AdListener<NativeAd> {
    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdClicked(@NonNull IAd iAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdExpired(@NonNull IAd iAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdImpression(@NonNull IAd iAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoadFailed(@NonNull IAd iAd, @NonNull BMError bMError);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoaded(@NonNull IAd iAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdShowFailed(@NonNull IAd iAd, @NonNull BMError bMError);
}
