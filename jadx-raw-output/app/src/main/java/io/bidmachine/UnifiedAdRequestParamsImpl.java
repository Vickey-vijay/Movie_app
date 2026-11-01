package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.TargetingInfo;
import io.bidmachine.unified.UnifiedAdRequestParams;

/* JADX INFO: loaded from: classes2.dex */
public class UnifiedAdRequestParamsImpl<AdRequestParametersType extends AdRequestParameters> implements UnifiedAdRequestParams {

    @NonNull
    private final AdRequestParametersType adRequestParameters;

    @NonNull
    private final DataRestrictions dataRestrictions;

    @NonNull
    private final io.bidmachine.models.DeviceInfo deviceInfo;

    @NonNull
    private final TargetingInfo targetingInfo;

    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
    @NonNull
    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.GeneralParams
    @NonNull
    public DataRestrictions getDataRestrictions() {
        return this.dataRestrictions;
    }

    @Override // io.bidmachine.unified.UnifiedAdRequestParams
    @NonNull
    public io.bidmachine.models.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.GeneralParams
    @NonNull
    public TargetingInfo getTargetingInfo() {
        return this.targetingInfo;
    }

    public UnifiedAdRequestParamsImpl(@NonNull AdRequestParametersType adrequestparameterstype, @NonNull TargetingParams targetingParams, @NonNull DataRestrictions dataRestrictions) {
        this.adRequestParameters = adrequestparameterstype;
        this.targetingInfo = new r5(dataRestrictions, targetingParams);
        this.deviceInfo = new z2(dataRestrictions);
        this.dataRestrictions = dataRestrictions;
    }

    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.GeneralParams
    public boolean isTestMode() {
        return j2.get().isTestMode();
    }
}
