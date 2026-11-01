package k;

import android.os.Bundle;
import com.mbridge.msdk.out.MBSplashHandler;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f62016a;

    @Override // com.yk.e.object.LifeListener
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStart() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStop() {
    }

    public l(z0 z0Var) {
        this.f62016a = z0Var;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        MBSplashHandler mBSplashHandler = this.f62016a.K;
        if (mBSplashHandler != null) {
            mBSplashHandler.onDestroy();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onPause() {
        MBSplashHandler mBSplashHandler = this.f62016a.K;
        if (mBSplashHandler != null) {
            mBSplashHandler.onPause();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onResume() {
        MBSplashHandler mBSplashHandler = this.f62016a.K;
        if (mBSplashHandler != null) {
            mBSplashHandler.onResume();
        }
    }
}
