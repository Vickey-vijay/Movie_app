package c;

import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements OnUserEarnedRewardListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f5576a;

    public j(i0 i0Var) {
        this.f5576a = i0Var;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
        this.f5576a.C.onReward("");
    }
}
