package e;

import android.os.Bundle;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f52304a;

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

    public n(r rVar) {
        this.f52304a = rVar;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        NativeBannerAd nativeBannerAd = this.f52304a.N;
        if (nativeBannerAd != null) {
            nativeBannerAd.destroy();
        }
    }
}
