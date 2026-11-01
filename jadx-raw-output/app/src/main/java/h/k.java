package h;

import android.os.Bundle;
import com.yk.e.object.LifeListener;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f53655a;

    @Override // com.yk.e.object.LifeListener
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStart() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStop() {
    }

    public k(c cVar) {
        this.f53655a = cVar;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        c cVar = this.f53655a;
        if (cVar.G != null) {
            AdLog.d(cVar.E, "destroyAdView");
            cVar.G.destroy();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onPause() {
        c cVar = this.f53655a;
        cVar.K = true;
        if (cVar.G != null) {
            AdLog.d(cVar.E, "stopAutoRefresh");
            cVar.G.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            cVar.G.stopAutoRefresh();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onResume() {
        c cVar = this.f53655a;
        if (cVar.K) {
            cVar.D();
        }
    }
}
