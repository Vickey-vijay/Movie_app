package io.bidmachine.models;

import android.location.Location;
import androidx.annotation.Nullable;
import io.bidmachine.utils.Gender;

/* JADX INFO: loaded from: classes9.dex */
public interface TargetingInfo {
    @Nullable
    String getCity();

    @Nullable
    String getCountry();

    @Nullable
    Location getDeviceLocation();

    @Nullable
    Gender getGender();

    @Nullable
    String[] getKeywords();

    @Nullable
    String getStoreUrl();

    @Nullable
    Integer getUserAge();

    @Nullable
    Integer getUserBirthdayYear();

    @Nullable
    String getUserId();

    @Nullable
    String getZip();

    @Nullable
    Boolean isPaid();
}
