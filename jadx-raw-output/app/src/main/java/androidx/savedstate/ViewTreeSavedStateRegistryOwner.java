package androidx.savedstate;

import android.view.View;
import bk.l;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import kk.r;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: ViewTreeSavedStateRegistryOwner.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner get(View view) {
        p.j(view, "<this>");
        return (SavedStateRegistryOwner) SequencesKt___SequencesKt.D(SequencesKt___SequencesKt.L(r.p(view, new l<View, View>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1
            @Override // bk.l
            public final View invoke(View view2) {
                p.j(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new l<View, SavedStateRegistryOwner>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2
            @Override // bk.l
            public final SavedStateRegistryOwner invoke(View view2) {
                p.j(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof SavedStateRegistryOwner) {
                    return (SavedStateRegistryOwner) tag;
                }
                return null;
            }
        }));
    }

    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        p.j(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
