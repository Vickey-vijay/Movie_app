package androidx.activity;

import android.view.View;
import android.view.Window;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes11.dex */
class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(Window window) {
        ck.p.j(window, "window");
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z10, boolean z11) {
        ck.p.j(systemBarStyle, "statusBarStyle");
        ck.p.j(systemBarStyle2, "navigationBarStyle");
        ck.p.j(window, "window");
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }
}
