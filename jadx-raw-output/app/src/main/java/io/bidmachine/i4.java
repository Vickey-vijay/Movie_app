package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.TargetingInfo;

/* JADX INFO: compiled from: InitializationParamsImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class i4 implements InitializationParams {

    @NonNull
    private final DataRestrictions dataRestrictions;

    @NonNull
    private final TargetingInfo targetingInfo;

    @Override // io.bidmachine.InitializationParams, io.bidmachine.GeneralParams
    @NonNull
    public DataRestrictions getDataRestrictions() {
        return this.dataRestrictions;
    }

    @Override // io.bidmachine.InitializationParams, io.bidmachine.GeneralParams
    @NonNull
    public TargetingInfo getTargetingInfo() {
        return this.targetingInfo;
    }

    public i4(@NonNull TargetingParams targetingParams, @NonNull DataRestrictions dataRestrictions) {
        this.targetingInfo = new r5(dataRestrictions, targetingParams);
        this.dataRestrictions = dataRestrictions;
    }

    @Override // io.bidmachine.InitializationParams, io.bidmachine.GeneralParams
    public boolean isTestMode() {
        return j2.get().isTestMode();
    }
}
