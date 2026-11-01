package io.bidmachine.unified;

import androidx.annotation.NonNull;
import io.bidmachine.FullScreenAdRequestParameters;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.DeviceInfo;
import io.bidmachine.models.TargetingInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface UnifiedFullscreenAdRequestParams extends UnifiedAdRequestParams {
    @NonNull
    FullScreenAdRequestParameters getAdRequestParameters();

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
