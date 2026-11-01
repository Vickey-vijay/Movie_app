package c;

import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import gl.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements IUnityAdsShowListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f5582b;

    public n(z zVar) {
        this.f5582b = zVar;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowClick(String str) {
        this.f5582b.C.onAdClick();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        unityAdsShowCompletionState.equals(UnityAds.UnityAdsShowCompletionState.COMPLETED);
        this.f5582b.C.onReward("");
        this.f5582b.C.onAdVideoComplete();
        this.f5582b.C.onAdClose();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        this.f5582b.v(" with error: [" + unityAdsShowError + "] " + str2);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowStart(String str) {
        z zVar = this.f5582b;
        zVar.C.onAdShow(r0.b(null, zVar.f61585f));
    }
}
