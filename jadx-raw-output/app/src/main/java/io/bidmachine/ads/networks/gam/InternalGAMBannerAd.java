package io.bidmachine.ads.networks.gam;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;

/* JADX INFO: loaded from: classes11.dex */
public abstract class InternalGAMBannerAd extends InternalGAMAd {
    @Nullable
    public abstract View getAdView();

    public InternalGAMBannerAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        super(gAMLoader, adsFormat, gAMUnitData);
    }
}
