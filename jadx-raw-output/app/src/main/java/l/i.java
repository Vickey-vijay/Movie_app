package l;

import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f63341a;

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

    public i(k kVar) {
        this.f63341a = kVar;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        NativeAd nativeAd = this.f63341a.C;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
    }
}
