package c;

import android.app.Activity;
import com.facebook.ads.RewardedVideoAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f5591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f5592b;

    public r(w wVar, Activity activity) {
        this.f5592b = wVar;
        this.f5591a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f5592b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f5592b.C = new RewardedVideoAd(this.f5591a.getApplicationContext(), this.f5592b.D);
        RewardedVideoAd rewardedVideoAd = this.f5592b.C;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this.f5592b.E).build());
    }
}
