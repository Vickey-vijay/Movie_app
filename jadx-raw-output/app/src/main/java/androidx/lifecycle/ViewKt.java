package androidx.lifecycle;

import android.view.View;
import ck.p;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewKt {
    public static final /* synthetic */ LifecycleOwner findViewTreeLifecycleOwner(View view) {
        p.j(view, "<this>");
        return ViewTreeLifecycleOwner.get(view);
    }
}
