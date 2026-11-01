package androidx.lifecycle;

import android.view.View;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: ViewTreeViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeViewModelKt {
    public static final /* synthetic */ ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewTreeViewModelStoreOwner.get(view);
    }
}
