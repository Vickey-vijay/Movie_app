package io.bidmachine.unified;

import androidx.annotation.NonNull;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.DeviceInfo;
import io.bidmachine.models.TargetingInfo;
import io.bidmachine.nativead.NativeAdRequestParameters;

/* JADX INFO: loaded from: classes5.dex */
public interface UnifiedNativeAdRequestParams extends UnifiedAdRequestParams {
    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
    @NonNull
    NativeAdRequestParameters getAdRequestParameters();

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
