package dp;

import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f52257a;

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

    public j0(a0 a0Var) {
        this.f52257a = a0Var;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        NativeAd nativeAd = this.f52257a.G;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
    }
}
