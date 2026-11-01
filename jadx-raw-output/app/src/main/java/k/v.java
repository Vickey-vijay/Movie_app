package k;

import android.os.Bundle;
import com.facebook.ads.InterstitialAd;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f62037a;

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

    public v(l0 l0Var) {
        this.f62037a = l0Var;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        InterstitialAd interstitialAd = this.f62037a.E;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
    }
}
