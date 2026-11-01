package c;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f5563c;

    public c(i0 i0Var) {
        this.f5563c = i0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        RewardedAd rewardedAd2 = rewardedAd;
        super.onAdLoaded(rewardedAd2);
        i0 i0Var = this.f5563c;
        i0Var.D = rewardedAd2;
        i0Var.E();
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f5563c.x(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }
}
