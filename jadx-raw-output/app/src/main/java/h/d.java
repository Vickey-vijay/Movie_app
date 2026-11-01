package h;

import android.os.Bundle;
import com.google.android.gms.ads.AdView;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f53650a;

    @Override // com.yk.e.object.LifeListener
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStart() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStop() {
    }

    public d(n nVar) {
        this.f53650a = nVar;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        AdView adView = this.f53650a.G;
        if (adView != null) {
            adView.destroy();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onPause() {
        AdView adView = this.f53650a.G;
        if (adView != null) {
            adView.pause();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onResume() {
        AdView adView = this.f53650a.G;
        if (adView != null) {
            adView.resume();
        }
    }
}
