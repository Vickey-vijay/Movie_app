package com.unity3d.ads.beta;

/* JADX INFO: compiled from: UnityAdsPrivacy.kt */
/* JADX INFO: loaded from: classes11.dex */
public enum UnityAdsPrivacyValue {
    NOT_SET(0),
    TRUE(1),
    FALSE(2);

    private final int value;

    public final int getValue() {
        return this.value;
    }

    UnityAdsPrivacyValue(int i10) {
        this.value = i10;
    }
}
