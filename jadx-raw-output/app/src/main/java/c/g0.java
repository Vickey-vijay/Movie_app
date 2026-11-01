package c;

import android.os.Bundle;
import com.facebook.ads.RewardedVideoAd;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f5572a;

    @Override // com.yk.e.object.LifeListener
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onPause() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onResume() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStart() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStop() {
    }

    public g0(w wVar) {
        this.f5572a = wVar;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        RewardedVideoAd rewardedVideoAd = this.f5572a.C;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }
}
