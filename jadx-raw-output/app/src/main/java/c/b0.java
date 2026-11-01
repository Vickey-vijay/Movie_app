package c;

import com.yk.e.inf.IComCallback;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.RewardVideoAdLoader;
import sg.bigo.ads.api.RewardVideoAdRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f5562a;

    public b0(p pVar) {
        this.f5562a = pVar;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f5562a.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new RewardVideoAdLoader.Builder().withAdLoadListener((AdLoadListener<RewardVideoAd>) new s(this)).build().loadAd(new RewardVideoAdRequest.Builder().withSlotId(this.f5562a.D).build());
    }
}
