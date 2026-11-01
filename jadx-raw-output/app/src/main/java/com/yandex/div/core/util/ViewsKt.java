package com.yandex.div.core.util;

import android.view.View;
import androidx.core.view.ViewCompat;
import ik.g;
import ik.k;

/* JADX INFO: compiled from: Views.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View farthestLayoutCaller(View view) {
        View view2 = null;
        while (view != null) {
            if (!isActuallyLaidOut(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }

    public static final g getIndices(View view, int i10, int i11) {
        int i12 = i11 + i10;
        if (isLayoutRtl(view)) {
            return k.m(i12 - 1, i10);
        }
        return k.q(i10, i12);
    }

    public static final boolean isActuallyLaidOut(View view) {
        if (view.getWidth() <= 0 && view.getHeight() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean isHierarchyLaidOut(View view) {
        if (farthestLayoutCaller(view) == null) {
            return true;
        }
        return false;
    }

    public static final boolean isLayoutRtl(View view) {
        if (ViewCompat.getLayoutDirection(view) == 1) {
            return true;
        }
        return false;
    }
}
