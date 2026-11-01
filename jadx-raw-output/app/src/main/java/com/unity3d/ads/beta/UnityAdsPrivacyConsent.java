package com.unity3d.ads.beta;

/* JADX INFO: compiled from: UnityAdsPrivacy.kt */
/* JADX INFO: loaded from: classes10.dex */
public enum UnityAdsPrivacyConsent {
    GDPR_CONSENT(0),
    PRIVACY_CONSENT(1),
    PIPL_CONSENT(2);

    private final int value;

    public final int getValue() {
        return this.value;
    }

    UnityAdsPrivacyConsent(int i10) {
        this.value = i10;
    }
}
