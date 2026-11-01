package io.bidmachine.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface DataRestrictions {
    boolean canSendBmIfv();

    boolean canSendDeviceInfo();

    boolean canSendGeoPosition();

    boolean canSendIfa();

    boolean canSendUserInfo();

    @Nullable
    List<Integer> getGPPIds();

    @Nullable
    String getGPPString();

    @NonNull
    String getIABGDPRString();

    @Nullable
    String getUSPrivacyString();

    boolean hasConsent();

    boolean isUserAgeRestricted();

    boolean isUserGdprProtected();

    boolean isUserHasCcpaConsent();

    boolean isUserHasConsent();

    boolean isUserInCcpaScope();

    boolean isUserInGdprScope();
}
