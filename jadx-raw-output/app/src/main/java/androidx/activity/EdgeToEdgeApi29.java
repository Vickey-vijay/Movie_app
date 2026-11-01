package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(29)
class EdgeToEdgeApi29 extends EdgeToEdgeApi28 {
    @Override // androidx.activity.EdgeToEdgeApi26, androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z10, boolean z11) {
        ck.p.j(systemBarStyle, "statusBarStyle");
        ck.p.j(systemBarStyle2, "navigationBarStyle");
        ck.p.j(window, "window");
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        boolean z12 = false;
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(systemBarStyle.getScrimWithEnforcedContrast$activity_release(z10));
        window.setNavigationBarColor(systemBarStyle2.getScrimWithEnforcedContrast$activity_release(z11));
        window.setStatusBarContrastEnforced(false);
        if (systemBarStyle2.getNightMode$activity_release() == 0) {
            z12 = true;
        }
        window.setNavigationBarContrastEnforced(z12);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(!z10);
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(true ^ z11);
    }
}
