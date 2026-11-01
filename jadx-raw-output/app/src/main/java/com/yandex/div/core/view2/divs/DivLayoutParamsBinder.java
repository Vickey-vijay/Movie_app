package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import bk.l;
import ck.p;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivMatchParentSize;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSizeUnitValue;
import java.util.Arrays;
import mj.r;
import oe.e2;

/* JADX INFO: compiled from: DivLayoutParamsBinder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivLayoutParamsBinder {
    private final ErrorCollectors errorCollectors;

    public final void bindLayoutParams(BindingContext bindingContext, View view, e2 e2Var, e2 e2Var2, ExpressionSubscriber expressionSubscriber) {
        bindLayoutParams(view, e2Var, e2Var2, bindingContext.getExpressionResolver(), expressionSubscriber, this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData()));
    }

    private final DivSizeUnitValue getMaxSize(DivSize divSize) {
        if (divSize instanceof DivSize.d) {
            return ((DivSize.d) divSize).c().f50126b;
        }
        if (divSize instanceof DivSize.c) {
            return ((DivSize.c) divSize).c().f48059a;
        }
        return null;
    }

    private final DivSizeUnitValue getMinSize(DivSize divSize) {
        if (divSize instanceof DivSize.d) {
            return ((DivSize.d) divSize).c().f50127c;
        }
        if (divSize instanceof DivSize.c) {
            return ((DivSize.c) divSize).c().f48060b;
        }
        return null;
    }

    private final float getWeight(DivSize divSize, ExpressionResolver expressionResolver) {
        DivMatchParentSize divMatchParentSizeC;
        Expression<Double> expression;
        DivSize.c cVar = divSize instanceof DivSize.c ? (DivSize.c) divSize : null;
        if (cVar == null || (divMatchParentSizeC = cVar.c()) == null || (expression = divMatchParentSizeC.f48061c) == null) {
            return 0.0f;
        }
        return (float) expression.evaluate(expressionResolver).doubleValue();
    }

    private final String toString(DivSizeUnitValue divSizeUnitValue, ExpressionResolver expressionResolver) {
        return divSizeUnitValue.f48817b.evaluate(expressionResolver).longValue() + DivSizeUnit.Converter.b(divSizeUnitValue.f48816a.evaluate(expressionResolver));
    }

    public DivLayoutParamsBinder(ErrorCollectors errorCollectors) {
        this.errorCollectors = errorCollectors;
    }

    private final boolean applyHeight(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        int layoutParamsSize = DivUtilKt.toLayoutParamsSize(e2Var.getHeight(), view.getResources().getDisplayMetrics(), expressionResolver, view.getLayoutParams());
        if (view.getLayoutParams().height == layoutParamsSize) {
            return false;
        }
        view.getLayoutParams().height = layoutParamsSize;
        return true;
    }

    private final boolean applyHeightConstraints(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        int px;
        int px2;
        DivLayoutParams divLayoutParams;
        DivSizeUnitValue minSize = getMinSize(e2Var.getHeight());
        boolean z10 = false;
        if (minSize != null) {
            px = BaseDivViewExtensionsKt.toPx(minSize, view.getResources().getDisplayMetrics(), expressionResolver);
        } else {
            px = 0;
        }
        DivSizeUnitValue maxSize = getMaxSize(e2Var.getHeight());
        int i10 = Integer.MAX_VALUE;
        if (maxSize != null) {
            px2 = BaseDivViewExtensionsKt.toPx(maxSize, view.getResources().getDisplayMetrics(), expressionResolver);
        } else {
            px2 = Integer.MAX_VALUE;
        }
        if (px > px2) {
            px = 0;
        } else {
            i10 = px2;
        }
        if (view.getMinimumHeight() != px) {
            view.setMinimumHeight(px);
            z10 = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            divLayoutParams = (DivLayoutParams) layoutParams;
        } else {
            divLayoutParams = null;
        }
        if (divLayoutParams == null) {
            return z10;
        }
        if (divLayoutParams.getMaxHeight() != i10) {
            divLayoutParams.setMaxHeight(i10);
            return true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHeightProperties(View view, e2 e2Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        boolean z10;
        checkConstraints(e2Var.getHeight(), "height", e2Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
        boolean zApplyHeight = applyHeight(view, e2Var, expressionResolver);
        boolean z11 = false;
        if (!applyVerticalWeightValue(view, e2Var, expressionResolver) && !zApplyHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (applyHeightConstraints(view, e2Var, expressionResolver) || z10) {
            z11 = true;
        }
        if (z11) {
            view.requestLayout();
            BaseDivViewExtensionsKt.applyTransform(view, e2Var, expressionResolver);
        }
    }

    private final boolean applyHorizontalWeightValue(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        DivLayoutParams divLayoutParams;
        boolean z10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            divLayoutParams = (DivLayoutParams) layoutParams;
        } else {
            divLayoutParams = null;
        }
        if (divLayoutParams == null) {
            return false;
        }
        float weight = getWeight(e2Var.getWidth(), expressionResolver);
        if (divLayoutParams.getHorizontalWeight() == weight) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        divLayoutParams.setHorizontalWeight(weight);
        return true;
    }

    private final boolean applyVerticalWeightValue(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        DivLayoutParams divLayoutParams;
        boolean z10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            divLayoutParams = (DivLayoutParams) layoutParams;
        } else {
            divLayoutParams = null;
        }
        if (divLayoutParams == null) {
            return false;
        }
        float weight = getWeight(e2Var.getHeight(), expressionResolver);
        if (divLayoutParams.getVerticalWeight() == weight) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        divLayoutParams.setVerticalWeight(weight);
        return true;
    }

    private final boolean applyWidth(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        int layoutParamsSize = DivUtilKt.toLayoutParamsSize(e2Var.getWidth(), view.getResources().getDisplayMetrics(), expressionResolver, view.getLayoutParams());
        if (view.getLayoutParams().width == layoutParamsSize) {
            return false;
        }
        view.getLayoutParams().width = layoutParamsSize;
        return true;
    }

    private final boolean applyWidthConstraints(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        int px;
        int px2;
        DivLayoutParams divLayoutParams;
        DivSizeUnitValue minSize = getMinSize(e2Var.getWidth());
        boolean z10 = false;
        if (minSize != null) {
            px = BaseDivViewExtensionsKt.toPx(minSize, view.getResources().getDisplayMetrics(), expressionResolver);
        } else {
            px = 0;
        }
        DivSizeUnitValue maxSize = getMaxSize(e2Var.getWidth());
        int i10 = Integer.MAX_VALUE;
        if (maxSize != null) {
            px2 = BaseDivViewExtensionsKt.toPx(maxSize, view.getResources().getDisplayMetrics(), expressionResolver);
        } else {
            px2 = Integer.MAX_VALUE;
        }
        if (px > px2) {
            px = 0;
        } else {
            i10 = px2;
        }
        if (view.getMinimumWidth() != px) {
            view.setMinimumWidth(px);
            z10 = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            divLayoutParams = (DivLayoutParams) layoutParams;
        } else {
            divLayoutParams = null;
        }
        if (divLayoutParams == null) {
            return z10;
        }
        if (divLayoutParams.getMaxWidth() != i10) {
            divLayoutParams.setMaxWidth(i10);
            return true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyWidthProperties(View view, e2 e2Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        boolean z10;
        checkConstraints(e2Var.getWidth(), "width", e2Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
        boolean zApplyWidth = applyWidth(view, e2Var, expressionResolver);
        boolean z11 = false;
        if (!applyHorizontalWeightValue(view, e2Var, expressionResolver) && !zApplyWidth) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (applyWidthConstraints(view, e2Var, expressionResolver) || z10) {
            z11 = true;
        }
        if (z11) {
            view.requestLayout();
            BaseDivViewExtensionsKt.applyTransform(view, e2Var, expressionResolver);
        }
    }

    private final void bindHeight(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, final ErrorCollector errorCollector) {
        DivSize height;
        DivSize height2 = e2Var.getHeight();
        if (e2Var2 != null) {
            height = e2Var2.getHeight();
        } else {
            height = null;
        }
        if (DivDataExtensionsKt.equalsToConstant(height2, height)) {
            checkConstraints(e2Var.getHeight(), "height", e2Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
            return;
        }
        applyHeightProperties(view, e2Var, expressionResolver, errorCollector);
        if (DivDataExtensionsKt.isConstant(e2Var.getHeight())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, e2Var.getHeight(), expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder.bindHeight.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivLayoutParamsBinder.this.applyHeightProperties(view, e2Var, expressionResolver, errorCollector);
            }
        });
    }

    private final void bindLayoutParams(View view, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, ErrorCollector errorCollector) {
        if (view.getLayoutParams() == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("LayoutParams should be initialized before view binding");
            }
            view.setLayoutParams(new DivLayoutParams(-1, -2));
        }
        bindWidth(view, e2Var, e2Var2, expressionResolver, expressionSubscriber, errorCollector);
        bindHeight(view, e2Var, e2Var2, expressionResolver, expressionSubscriber, errorCollector);
    }

    private final void bindWidth(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, final ErrorCollector errorCollector) {
        DivSize width;
        DivSize width2 = e2Var.getWidth();
        if (e2Var2 != null) {
            width = e2Var2.getWidth();
        } else {
            width = null;
        }
        if (DivDataExtensionsKt.equalsToConstant(width2, width)) {
            checkConstraints(e2Var.getWidth(), "width", e2Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
            return;
        }
        applyWidthProperties(view, e2Var, expressionResolver, errorCollector);
        if (DivDataExtensionsKt.isConstant(e2Var.getWidth())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, e2Var.getWidth(), expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder.bindWidth.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivLayoutParamsBinder.this.applyWidthProperties(view, e2Var, expressionResolver, errorCollector);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    private final void checkConstraints(DivSize divSize, String str, String str2, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        DivSizeUnitValue maxSize;
        String str3;
        DivSizeUnitValue minSize = getMinSize(divSize);
        if (minSize == null || (maxSize = getMaxSize(divSize)) == null || BaseDivViewExtensionsKt.toPx(minSize, displayMetrics, expressionResolver) <= BaseDivViewExtensionsKt.toPx(maxSize, displayMetrics, expressionResolver)) {
            return;
        }
        if (str2 != null) {
            str3 = String.format("Id: '%s', ", Arrays.copyOf(new Object[]{str2}, 1));
            p.i(str3, "format(...)");
            if (str3 == null) {
                str3 = "";
            }
        } else {
            str3 = "";
        }
        String str4 = String.format("Element has incorrect %s constraints (min size is bigger than max size). %sminSize: %s, maxSize: %s.", Arrays.copyOf(new Object[]{str, str3, toString(minSize, expressionResolver), toString(maxSize, expressionResolver)}, 4));
        p.i(str4, "format(...)");
        errorCollector.logError(new Throwable(str4));
    }
}
