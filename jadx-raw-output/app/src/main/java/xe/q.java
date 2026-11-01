package xe;

import android.os.Bundle;
import com.facebook.ads.InterstitialAd;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f74464a;

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

    public q(c0 c0Var) {
        this.f74464a = c0Var;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        InterstitialAd interstitialAd = this.f74464a.D;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
    }
}
