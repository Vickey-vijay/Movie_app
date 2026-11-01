package com.yandex.div.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ck.i;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.internal.widget.TransientViewMixin;
import com.yandex.div2.DivBorder;

/* JADX INFO: compiled from: DivViewWrapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public class DivViewWrapper extends FrameContainerLayout implements DivBorderSupports, TransientView {
    private final /* synthetic */ TransientViewMixin $$delegate_0;

    public DivViewWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivViewWrapper(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivViewWrapper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new TransientViewMixin();
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setImportantForAccessibility(2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (getChildCount() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            super.addView(view, 0, layoutParams);
            return;
        }
        throw new IllegalArgumentException("ViewWrapper can host only one child view".toString());
    }

    public final View getChild() {
        boolean z10;
        if (getChildCount() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        return getChildAt(0);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        DivBorderSupports divBorderSupports;
        KeyEvent.Callback child = getChild();
        if (child instanceof DivBorderSupports) {
            divBorderSupports = (DivBorderSupports) child;
        } else {
            divBorderSupports = null;
        }
        if (divBorderSupports == null) {
            return null;
        }
        return divBorderSupports.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        DivBorderSupports divBorderSupports;
        KeyEvent.Callback child = getChild();
        if (child instanceof DivBorderSupports) {
            divBorderSupports = (DivBorderSupports) child;
        } else {
            divBorderSupports = null;
        }
        if (divBorderSupports != null) {
            return divBorderSupports.getNeedClipping();
        }
        return true;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, DivBorder divBorder, View view) {
        DivBorderSupports divBorderSupports;
        KeyEvent.Callback child = getChild();
        if (child instanceof DivBorderSupports) {
            divBorderSupports = (DivBorderSupports) child;
        } else {
            divBorderSupports = null;
        }
        if (divBorderSupports != null) {
            divBorderSupports.setBorder(bindingContext, divBorder, view);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        DivBorderSupports divBorderSupports;
        KeyEvent.Callback child = getChild();
        if (child instanceof DivBorderSupports) {
            divBorderSupports = (DivBorderSupports) child;
        } else {
            divBorderSupports = null;
        }
        if (divBorderSupports != null) {
            divBorderSupports.setNeedClipping(z10);
        }
    }
}
