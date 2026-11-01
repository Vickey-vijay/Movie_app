package f;

import android.os.Bundle;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f52731a;

    @Override // com.yk.e.object.LifeListener
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStart() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStop() {
    }

    public a0(q qVar) {
        this.f52731a = qVar;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f52731a.F;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.release();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onPause() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f52731a.F;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onPause();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onResume() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f52731a.F;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onResume();
        }
    }
}
