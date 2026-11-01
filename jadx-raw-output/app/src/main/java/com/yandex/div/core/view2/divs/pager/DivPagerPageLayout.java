package com.yandex.div.core.view2.divs.pager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import bk.a;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.core.widget.ViewsKt;

/* JADX INFO: compiled from: DivPagerPageLayout.kt */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ViewConstructor"})
public final class DivPagerPageLayout extends DivViewWrapper {
    private final a<Boolean> isHorizontal;

    public DivPagerPageLayout(Context context, a<Boolean> aVar) {
        super(context, null, 0, 6, null);
        this.isHorizontal = aVar;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    private final int getSpec(int i10, int i11, boolean z10) {
        return (z10 || i10 == -1 || i10 == -3) ? i11 : ViewsKt.makeUnspecifiedSpec();
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != null) {
            if (view.getVisibility() == 0) {
                BaseDivViewExtensionsKt.drawShadow(view, canvas);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    private final int getMinimumSize(int i10) {
        if (ViewsKt.isUnspecified(i10)) {
            return 0;
        }
        return View.MeasureSpec.getSize(i10);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (getChildCount() == 0) {
            super.onMeasure(i10, i11);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getChildAt(0).getLayoutParams();
        boolean zBooleanValue = this.isHorizontal.invoke().booleanValue();
        if (zBooleanValue) {
            setMinimumHeight(getMinimumSize(i11));
        } else {
            setMinimumWidth(getMinimumSize(i10));
        }
        super.onMeasure(getSpec(layoutParams.width, i10, zBooleanValue), getSpec(layoutParams.height, i11, !zBooleanValue));
    }
}
