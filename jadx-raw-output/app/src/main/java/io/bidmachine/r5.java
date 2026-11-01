package io.bidmachine;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.TargetingInfo;
import io.bidmachine.utils.Gender;
import java.util.Calendar;

/* JADX INFO: compiled from: TargetingInfoImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class r5 implements TargetingInfo {

    @NonNull
    private final DataRestrictions dataRestrictions;

    @NonNull
    private final TargetingParams targetingParams;

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public String getCity() {
        if (this.dataRestrictions.canSendGeoPosition()) {
            return this.targetingParams.getCity();
        }
        return null;
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public String getCountry() {
        if (this.dataRestrictions.canSendGeoPosition()) {
            return this.targetingParams.getCountry();
        }
        return null;
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public Location getDeviceLocation() {
        if (this.dataRestrictions.canSendGeoPosition()) {
            return this.targetingParams.getDeviceLocation();
        }
        return null;
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public Gender getGender() {
        if (this.dataRestrictions.canSendUserInfo()) {
            return this.targetingParams.getGender();
        }
        return null;
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public String[] getKeywords() {
        if (this.dataRestrictions.canSendUserInfo()) {
            return this.targetingParams.getKeywords();
        }
        return null;
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public String getStoreUrl() {
        return this.targetingParams.getStoreUrl();
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public Integer getUserBirthdayYear() {
        if (this.dataRestrictions.canSendUserInfo()) {
            return this.targetingParams.getBirthdayYear();
        }
        return null;
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public String getUserId() {
        if (this.dataRestrictions.canSendUserInfo()) {
            return this.targetingParams.getUserId();
        }
        return null;
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public String getZip() {
        if (this.dataRestrictions.canSendGeoPosition()) {
            return this.targetingParams.getZip();
        }
        return null;
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public Boolean isPaid() {
        return this.targetingParams.getPaid();
    }

    public r5(@NonNull DataRestrictions dataRestrictions, @NonNull TargetingParams targetingParams) {
        this.dataRestrictions = dataRestrictions;
        this.targetingParams = targetingParams;
    }

    @Override // io.bidmachine.models.TargetingInfo
    @Nullable
    public Integer getUserAge() {
        Integer userBirthdayYear = getUserBirthdayYear();
        if (userBirthdayYear != null) {
            return Integer.valueOf(Calendar.getInstance().get(1) - userBirthdayYear.intValue());
        }
        return null;
    }
}
