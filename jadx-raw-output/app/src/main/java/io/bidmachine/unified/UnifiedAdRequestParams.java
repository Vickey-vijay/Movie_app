package io.bidmachine.unified;

import androidx.annotation.NonNull;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.GeneralParams;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.DeviceInfo;
import io.bidmachine.models.TargetingInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface UnifiedAdRequestParams extends GeneralParams {
    @NonNull
    AdRequestParameters getAdRequestParameters();

    @Override // io.bidmachine.GeneralParams
    @NonNull
    /* synthetic */ DataRestrictions getDataRestrictions();

    @NonNull
    DeviceInfo getDeviceInfo();

    @Override // io.bidmachine.GeneralParams
    @NonNull
    /* synthetic */ TargetingInfo getTargetingInfo();

    @Override // io.bidmachine.GeneralParams
    /* synthetic */ boolean isTestMode();
}
