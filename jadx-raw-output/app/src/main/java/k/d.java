package k;

import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements IUnityAdsShowListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f62001b;

    public d(h hVar) {
        this.f62001b = hVar;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowClick(String str) {
        this.f62001b.D.onAdClick();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this.f62001b.D.onAdComplete();
        this.f62001b.D.onAdClose();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        this.f62001b.v(" with error: [" + unityAdsShowError + "] " + str2);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowStart(String str) {
        h hVar = this.f62001b;
        hVar.D.onAdShow(gl.r0.b(null, hVar.f61585f));
    }
}
