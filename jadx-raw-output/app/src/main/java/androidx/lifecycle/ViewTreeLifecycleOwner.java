package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
import bk.l;
import ck.p;
import kk.r;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: ViewTreeLifecycleOwner.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        p.j(view, "<this>");
        return (LifecycleOwner) SequencesKt___SequencesKt.D(SequencesKt___SequencesKt.L(r.p(view, new l<View, View>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1
            @Override // bk.l
            public final View invoke(View view2) {
                p.j(view2, "currentView");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new l<View, LifecycleOwner>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2
            @Override // bk.l
            public final LifecycleOwner invoke(View view2) {
                p.j(view2, "viewParent");
                Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof LifecycleOwner) {
                    return (LifecycleOwner) tag;
                }
                return null;
            }
        }));
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        p.j(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
