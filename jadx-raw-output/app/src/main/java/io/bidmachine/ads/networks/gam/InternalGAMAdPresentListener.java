package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes7.dex */
public interface InternalGAMAdPresentListener {
    void onAdClicked();

    void onAdExpired();

    void onAdShowFailed(@NonNull BMError bMError);

    void onAdShown();
}
