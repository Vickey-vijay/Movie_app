package c;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements IUnityAdsLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f5575b;

    public i(z zVar) {
        this.f5575b = zVar;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsAdLoaded(String str) {
        this.f5575b.C.onAdVideoCache();
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        this.f5575b.v(" with error: [" + unityAdsLoadError + "] " + str2);
    }
}
