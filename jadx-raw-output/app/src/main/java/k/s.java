package k;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements IUnityAdsInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f62030a;

    public s(h hVar) {
        this.f62030a = hVar;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() {
        h hVar = this.f62030a;
        UnityAds.load(hVar.F, hVar.G);
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        this.f62030a.x(str);
    }
}
