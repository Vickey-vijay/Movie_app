package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.DivBorder;

/* JADX INFO: compiled from: DivBorderSupports.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface DivBorderSupports {
    DivBorderDrawer getDivBorderDrawer();

    boolean getNeedClipping();

    void setBorder(BindingContext bindingContext, DivBorder divBorder, View view);

    void setNeedClipping(boolean z10);

    default void invalidateBorder() {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.invalidateBorder();
        }
    }

    default void onBoundsChanged(int i10, int i11) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.onBoundsChanged(i10, i11);
        }
    }

    default void releaseBorderDrawer() {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.release();
        }
    }
}
