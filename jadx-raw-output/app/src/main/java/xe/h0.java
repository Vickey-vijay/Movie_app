package xe;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements IUnityAdsLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f74448b;

    public h0(n nVar) {
        this.f74448b = nVar;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsAdLoaded(String str) {
        this.f74448b.D.onAdLoaded();
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        this.f74448b.v(" with error: [" + unityAdsLoadError + "] " + str2);
    }
}
