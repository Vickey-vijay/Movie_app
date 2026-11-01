package com.unity3d.ads.core.data.model;

import ck.p;
import com.unity3d.ads.UnityAds;

/* JADX INFO: compiled from: Listeners.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface Listeners {

    /* JADX INFO: compiled from: Listeners.kt */
    public static final class DefaultImpls {
        public static void onClick(Listeners listeners, String str) {
            p.j(str, "placementId");
        }

        public static void onComplete(Listeners listeners, String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            p.j(str, "placementId");
            p.j(unityAdsShowCompletionState, "state");
        }

        public static void onError(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            p.j(str, "placementId");
            p.j(unityAdsShowError, "error");
            p.j(str2, "message");
        }

        public static void onLeftApplication(Listeners listeners, String str) {
            p.j(str, "placementId");
        }

        public static void onStart(Listeners listeners, String str) {
            p.j(str, "placementId");
        }
    }

    void onClick(String str);

    void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onLeftApplication(String str);

    void onStart(String str);
}
