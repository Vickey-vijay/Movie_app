package f;

import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f52732a;

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

    public b(z zVar) {
        this.f52732a = zVar;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        NativeAd nativeAd = this.f52732a.E;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
    }
}
