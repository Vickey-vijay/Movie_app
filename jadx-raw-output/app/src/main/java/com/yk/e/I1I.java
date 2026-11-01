package com.yk.e;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes.dex */
public final class I1I implements IUnityAdsInitializationListener {
    public final /* synthetic */ IUnityAdsInitializationListener IL1Iii;

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() {
        AbstractC4043il.IL1Iii = true;
        AdLog.i("unityAd init success");
        IUnityAdsInitializationListener iUnityAdsInitializationListener = this.IL1Iii;
        if (iUnityAdsInitializationListener != null) {
            iUnityAdsInitializationListener.onInitializationComplete();
        }
    }

    public I1I(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        this.IL1Iii = iUnityAdsInitializationListener;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        AdLog.e("unityAd init failed " + str);
        IUnityAdsInitializationListener iUnityAdsInitializationListener = this.IL1Iii;
        if (iUnityAdsInitializationListener != null) {
            iUnityAdsInitializationListener.onInitializationFailed(unityAdsInitializationError, str);
        }
    }
}
