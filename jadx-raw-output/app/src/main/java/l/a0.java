package l;

import android.os.Bundle;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f63316a;

    @Override // com.yk.e.object.LifeListener
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStart() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStop() {
    }

    public a0(i0 i0Var) {
        this.f63316a = i0Var;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f63316a.D;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.release();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onPause() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f63316a.D;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onPause();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onResume() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f63316a.D;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onResume();
        }
    }
}
