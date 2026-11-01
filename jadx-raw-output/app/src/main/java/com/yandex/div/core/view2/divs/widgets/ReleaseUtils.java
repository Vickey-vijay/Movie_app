package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;

/* JADX INFO: compiled from: ReleaseUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ReleaseUtils {
    public static final ReleaseUtils INSTANCE = new ReleaseUtils();

    private ReleaseUtils() {
    }

    public final void releaseAndRemoveChildren$div_release(ViewGroup viewGroup, Div2View div2View) {
        releaseChildren$div_release(viewGroup, div2View);
        viewGroup.removeAllViews();
    }

    public final void releaseChildren$div_release(ViewGroup viewGroup, Div2View div2View) {
        Iterator<View> it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), it.next());
        }
    }

    public final void releaseMedia$div_release(ViewGroup viewGroup, Div2View div2View) {
        Iterator<View> it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            DivViewVisitorKt.visitViewTree(div2View.getMediaReleaseViewVisitor$div_release(), it.next());
        }
    }
}
