package com.unity3d.ads.beta;

import ck.p;

/* JADX INFO: compiled from: UnityAdsPrivacy.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class UnityAdsPrivacy {
    public static final void set(UnityAdsPrivacyConsent unityAdsPrivacyConsent, UnityAdsPrivacyConsentValue unityAdsPrivacyConsentValue) {
        p.j(unityAdsPrivacyConsent, "consent");
        p.j(unityAdsPrivacyConsentValue, "value");
    }

    public static final void set(UnityAdsPrivacyFlag unityAdsPrivacyFlag, UnityAdsPrivacyValue unityAdsPrivacyValue) {
        p.j(unityAdsPrivacyFlag, "privacy");
        p.j(unityAdsPrivacyValue, "value");
    }

    public static final void setPrivacy(String str, UnityAdsPrivacyConsentValue unityAdsPrivacyConsentValue) {
        p.j(str, "flag");
        p.j(unityAdsPrivacyConsentValue, "value");
    }

    public static final void setPrivacy(String str, UnityAdsPrivacyValue unityAdsPrivacyValue) {
        p.j(str, "flag");
        p.j(unityAdsPrivacyValue, "consent");
    }
}
