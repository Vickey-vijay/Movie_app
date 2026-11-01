package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.TargetingInfo;

/* JADX INFO: loaded from: classes5.dex */
public interface GeneralParams {
    @NonNull
    DataRestrictions getDataRestrictions();

    @NonNull
    TargetingInfo getTargetingInfo();

    boolean isTestMode();
}
