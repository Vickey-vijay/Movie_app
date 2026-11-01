package xe;

import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import gl.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements IUnityAdsShowListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f74447b;

    public h(n nVar) {
        this.f74447b = nVar;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowClick(String str) {
        this.f74447b.D.onAdClick();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this.f74447b.D.onAdClose();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        this.f74447b.v(" with error: [" + unityAdsShowError + "] " + str2);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowStart(String str) {
        n nVar = this.f74447b;
        nVar.D.onAdShow(r0.b(null, nVar.f61585f));
    }
}
