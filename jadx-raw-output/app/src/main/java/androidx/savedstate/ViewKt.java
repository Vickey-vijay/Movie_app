package androidx.savedstate;

import android.view.View;
import ck.p;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewKt {
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        p.j(view, "<this>");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
