package io.bidmachine.unified;

import androidx.annotation.NonNull;
import io.bidmachine.banner.BannerAdRequestParameters;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.DeviceInfo;
import io.bidmachine.models.TargetingInfo;

/* JADX INFO: loaded from: classes3.dex */
public interface UnifiedBannerAdRequestParams extends UnifiedAdRequestParams {
    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
    @NonNull
    BannerAdRequestParameters getAdRequestParameters();

    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.GeneralParams
    @NonNull
    /* synthetic */ DataRestrictions getDataRestrictions();

    @Override // io.bidmachine.unified.UnifiedAdRequestParams
    @NonNull
    /* synthetic */ DeviceInfo getDeviceInfo();

    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.GeneralParams
    @NonNull
    /* synthetic */ TargetingInfo getTargetingInfo();

    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.GeneralParams
    /* synthetic */ boolean isTestMode();
}
