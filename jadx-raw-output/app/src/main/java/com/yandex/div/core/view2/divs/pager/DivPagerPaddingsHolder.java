package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivPager;
import ek.b;

/* JADX INFO: compiled from: DivPagerPaddingsHolder.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivPagerPaddingsHolder {
    private final Integer alignedBottom;
    private final Integer alignedLeft;
    private final Integer alignedRight;
    private final Integer alignedTop;
    private final float bottom;
    private final float end;
    private final boolean hasRelativePaddings;
    private final float left;
    private final DisplayMetrics metrics;
    private final ExpressionResolver resolver;
    private final float right;
    private final float start;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    private final float f45837top;

    private final float toPadding(Expression<Long> expression) {
        if (expression != null) {
            return BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(expression.evaluate(this.resolver).longValue()), this.metrics);
        }
        return 0.0f;
    }

    public final Integer getAlignedBottom() {
        return this.alignedBottom;
    }

    public final Integer getAlignedLeft() {
        return this.alignedLeft;
    }

    public final Integer getAlignedRight() {
        return this.alignedRight;
    }

    public final Integer getAlignedTop() {
        return this.alignedTop;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getTop() {
        return this.f45837top;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    public DivPagerPaddingsHolder(DivEdgeInsets divEdgeInsets, ExpressionResolver expressionResolver, View view, DisplayMetrics displayMetrics, boolean z10, DivPager.ItemAlignment itemAlignment) {
        Expression<Long> expression;
        boolean z11;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        Expression<Long> expression5;
        float f10;
        float f11;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Expression<Long> expression6;
        this.resolver = expressionResolver;
        this.metrics = displayMetrics;
        if (divEdgeInsets != null) {
            expression = divEdgeInsets.f47058e;
        } else {
            expression = null;
        }
        if (expression == null) {
            if (divEdgeInsets != null) {
                expression6 = divEdgeInsets.f47055b;
            } else {
                expression6 = null;
            }
            if (expression6 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        this.hasRelativePaddings = z11;
        if (!z11) {
            if (divEdgeInsets != null) {
                expression2 = divEdgeInsets.f47056c;
            } else {
                expression2 = null;
            }
        } else if (ViewsKt.isLayoutRtl(view)) {
            if (divEdgeInsets == null) {
                expression2 = null;
            } else {
                expression2 = divEdgeInsets.f47055b;
            }
        } else if (divEdgeInsets == null) {
            expression2 = null;
        } else {
            expression2 = divEdgeInsets.f47058e;
        }
        float padding = toPadding(expression2);
        this.left = padding;
        if (divEdgeInsets != null) {
            expression3 = divEdgeInsets.f47059f;
        } else {
            expression3 = null;
        }
        float padding2 = toPadding(expression3);
        this.f45837top = padding2;
        if (!z11) {
            if (divEdgeInsets != null) {
                expression4 = divEdgeInsets.f47057d;
            } else {
                expression4 = null;
            }
        } else if (ViewsKt.isLayoutRtl(view)) {
            if (divEdgeInsets == null) {
                expression4 = null;
            } else {
                expression4 = divEdgeInsets.f47058e;
            }
        } else if (divEdgeInsets == null) {
            expression4 = null;
        } else {
            expression4 = divEdgeInsets.f47055b;
        }
        float padding3 = toPadding(expression4);
        this.right = padding3;
        if (divEdgeInsets != null) {
            expression5 = divEdgeInsets.f47054a;
        } else {
            expression5 = null;
        }
        float padding4 = toPadding(expression5);
        this.bottom = padding4;
        if (!z10) {
            f10 = padding2;
        } else if (ViewsKt.isLayoutRtl(view)) {
            f10 = padding3;
        } else {
            f10 = padding;
        }
        this.start = f10;
        if (!z10) {
            f11 = padding4;
        } else if (ViewsKt.isLayoutRtl(view)) {
            f11 = padding;
        } else {
            f11 = padding3;
        }
        this.end = f11;
        if (z10 && ((itemAlignment != DivPager.ItemAlignment.START || ViewsKt.isLayoutRtl(view)) && (itemAlignment != DivPager.ItemAlignment.END || !ViewsKt.isLayoutRtl(view)))) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(b.c(padding));
        }
        this.alignedLeft = numValueOf;
        if (!z10 && itemAlignment != DivPager.ItemAlignment.START) {
            numValueOf2 = null;
        } else {
            numValueOf2 = Integer.valueOf(b.c(padding2));
        }
        this.alignedTop = numValueOf2;
        if (z10 && ((itemAlignment != DivPager.ItemAlignment.START || !ViewsKt.isLayoutRtl(view)) && (itemAlignment != DivPager.ItemAlignment.END || ViewsKt.isLayoutRtl(view)))) {
            numValueOf3 = null;
        } else {
            numValueOf3 = Integer.valueOf(b.c(padding3));
        }
        this.alignedRight = numValueOf3;
        this.alignedBottom = (z10 || itemAlignment == DivPager.ItemAlignment.END) ? Integer.valueOf(b.c(padding4)) : null;
    }
}
