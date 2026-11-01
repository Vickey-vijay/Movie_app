package l;

import android.os.Bundle;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f63345a;

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

    public o(y yVar) {
        this.f63345a = yVar;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        NativeBannerAd nativeBannerAd = this.f63345a.D;
        if (nativeBannerAd != null) {
            nativeBannerAd.destroy();
        }
    }
}
