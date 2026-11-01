package com.unity3d.ads.beta;

/* JADX INFO: compiled from: UnityAdsPrivacy.kt */
/* JADX INFO: loaded from: classes11.dex */
public enum UnityAdsPrivacyConsentValue {
    NOT_SET(0),
    CONSENT(1),
    NO_CONSENT(2);

    private final int value;

    public final int getValue() {
        return this.value;
    }

    UnityAdsPrivacyConsentValue(int i10) {
        this.value = i10;
    }
}
