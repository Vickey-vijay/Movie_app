package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewOutlineProvider;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.DivBorder;

/* JADX INFO: compiled from: DivBorderSupportsMixin.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivBorderSupportsMixin implements DivBorderSupports {
    private DivBorderDrawer borderDrawer;
    private boolean needClipping = true;

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        return this.borderDrawer;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.needClipping;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, DivBorder divBorder, View view) {
        if (this.borderDrawer == null && divBorder != null) {
            this.borderDrawer = new DivBorderDrawer(bindingContext.getDivView(), view);
        }
        DivBorderDrawer divBorderDrawer = this.borderDrawer;
        if (divBorderDrawer != null) {
            divBorderDrawer.setBorder(divBorder, bindingContext.getExpressionResolver());
        }
        DivBorderDrawer divBorderDrawer2 = this.borderDrawer;
        if (divBorderDrawer2 != null) {
            divBorderDrawer2.setNeedClipping(getNeedClipping());
        }
        if (divBorder == null) {
            view.setElevation(0.0f);
            view.setClipToOutline(false);
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            releaseBorderDrawer();
            this.borderDrawer = null;
        }
        view.invalidate();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        DivBorderDrawer divBorderDrawer = this.borderDrawer;
        if (divBorderDrawer != null) {
            divBorderDrawer.setNeedClipping(z10);
        }
        this.needClipping = z10;
    }
}
