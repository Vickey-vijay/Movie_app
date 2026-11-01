package xe;

import com.yk.e.inf.IComCallback;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.InterstitialAdLoader;
import sg.bigo.ads.api.InterstitialAdRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f74465a;

    public r(g gVar) {
        this.f74465a = gVar;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f74465a.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new InterstitialAdLoader.Builder().withAdLoadListener((AdLoadListener<InterstitialAd>) new e(this)).build().loadAd(new InterstitialAdRequest.Builder().withSlotId(this.f74465a.E).build());
    }
}
