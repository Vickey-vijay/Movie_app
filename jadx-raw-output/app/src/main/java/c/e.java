package c;

import android.app.Activity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdPreloader;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f5567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f5568b;

    public e(i0 i0Var, Activity activity) {
        this.f5568b = i0Var;
        this.f5567a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f5568b.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        if (!RewardedAdPreloader.isAdAvailable(this.f5568b.G)) {
            AdRequest adRequestBuild = new AdRequest.Builder().build();
            Activity activity = this.f5567a;
            i0 i0Var = this.f5568b;
            RewardedAd.load(activity, i0Var.G, adRequestBuild, i0Var.I);
            return;
        }
        AdLog.i("Preloaded rewarded ad " + this.f5568b.G + " AD_UNIT_ID is available.");
        i0 i0Var2 = this.f5568b;
        i0Var2.D = RewardedAdPreloader.pollAd(i0Var2.G);
        this.f5568b.E();
    }
}
