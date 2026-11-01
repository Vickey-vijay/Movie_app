package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import bk.l;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import kk.r;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: ViewTreeViewModelStoreOwner.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        p.j(view, "<this>");
        return (ViewModelStoreOwner) SequencesKt___SequencesKt.D(SequencesKt___SequencesKt.L(r.p(view, new l<View, View>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1
            @Override // bk.l
            public final View invoke(View view2) {
                p.j(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new l<View, ViewModelStoreOwner>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2
            @Override // bk.l
            public final ViewModelStoreOwner invoke(View view2) {
                p.j(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                Object tag = view2.getTag(R.id.view_tree_view_model_store_owner);
                if (tag instanceof ViewModelStoreOwner) {
                    return (ViewModelStoreOwner) tag;
                }
                return null;
            }
        }));
    }

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        p.j(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
