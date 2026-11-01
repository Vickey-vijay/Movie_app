package e;

import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f52297a;

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

    public i(b0 b0Var) {
        this.f52297a = b0Var;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        NativeAd nativeAd = this.f52297a.M;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
    }
}
