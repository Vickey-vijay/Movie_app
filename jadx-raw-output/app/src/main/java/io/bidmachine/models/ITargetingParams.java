package io.bidmachine.models;

import android.location.Location;
import androidx.annotation.NonNull;
import io.bidmachine.ExternalUserId;
import io.bidmachine.utils.Gender;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ITargetingParams<SelfType> extends IBlockedParams<SelfType> {
    @Override // io.bidmachine.models.IBlockedParams
    /* synthetic */ SelfType addBlockedAdvertiserDomain(@NonNull String str);

    @Override // io.bidmachine.models.IBlockedParams
    /* synthetic */ SelfType addBlockedAdvertiserIABCategory(@NonNull String str);

    @Override // io.bidmachine.models.IBlockedParams
    /* synthetic */ SelfType addBlockedApplication(@NonNull String str);

    SelfType setBirthdayYear(Integer num);

    SelfType setCity(String str);

    SelfType setCountry(String str);

    SelfType setDeviceLocation(Location location);

    SelfType setExternalUserIds(List<ExternalUserId> list);

    SelfType setFramework(String str);

    SelfType setGender(Gender gender);

    SelfType setKeywords(String... strArr);

    SelfType setPaid(Boolean bool);

    SelfType setStoreCategory(String str);

    SelfType setStoreSubCategories(String... strArr);

    SelfType setStoreUrl(String str);

    SelfType setUserId(String str);

    SelfType setZip(String str);
}
