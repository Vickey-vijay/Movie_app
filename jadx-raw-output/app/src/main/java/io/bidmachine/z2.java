package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.models.DataRestrictions;

/* JADX INFO: compiled from: DeviceInfoImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class z2 implements io.bidmachine.models.DeviceInfo {

    @NonNull
    private final DataRestrictions dataRestrictions;

    @Override // io.bidmachine.models.DeviceInfo
    @Nullable
    public String getHttpAgent(@NonNull Context context) {
        if (this.dataRestrictions.canSendDeviceInfo()) {
            return UserAgentManager.getUserAgent(context);
        }
        return null;
    }

    @Override // io.bidmachine.models.DeviceInfo
    @Nullable
    public String getIfa(@NonNull Context context) {
        return AdvertisingDataManager.getAdvertisingId(context, !this.dataRestrictions.canSendIfa());
    }

    public z2(@NonNull DataRestrictions dataRestrictions) {
        this.dataRestrictions = dataRestrictions;
    }

    @Override // io.bidmachine.models.DeviceInfo
    public boolean isLimitAdTrackingEnabled() {
        return AdvertisingDataManager.isLimitAdTrackingEnabled();
    }
}
