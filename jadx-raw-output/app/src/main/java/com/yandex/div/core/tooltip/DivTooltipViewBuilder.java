package com.yandex.div.core.tooltip;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import oe.e2;

/* JADX INFO: compiled from: DivTooltipViewBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
public class DivTooltipViewBuilder {
    private final jj.a<Div2Builder> div2Builder;

    public DivTooltipViewBuilder(jj.a<Div2Builder> aVar) {
        this.div2Builder = aVar;
    }

    private View prepareTooltipView(BindingContext bindingContext, Div div) {
        e2 e2VarB = div.b();
        View viewBuildView = this.div2Builder.get().buildView(div, bindingContext, DivStatePath.Companion.fromRootDiv$div_release(0L, div));
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DisplayMetrics displayMetrics = viewBuildView.getContext().getResources().getDisplayMetrics();
        viewBuildView.setLayoutParams(new RelativeLayout.LayoutParams(DivUtilKt.toLayoutParamsSize$default(e2VarB.getWidth(), displayMetrics, expressionResolver, null, 4, null), DivUtilKt.toLayoutParamsSize$default(e2VarB.getHeight(), displayMetrics, expressionResolver, null, 4, null)));
        viewBuildView.setFocusable(true);
        return viewBuildView;
    }

    public DivTooltipContainer buildTooltipView(BindingContext bindingContext, Div div, int i10, int i11) {
        View viewPrepareTooltipView = prepareTooltipView(bindingContext, div);
        DivTooltipContainer divTooltipContainer = new DivTooltipContainer(bindingContext.getDivView().getContext(), null, 0, 6, null);
        divTooltipContainer.addView(viewPrepareTooltipView);
        divTooltipContainer.setLayoutParams(new ViewGroup.LayoutParams(i10, i11));
        return divTooltipContainer;
    }
}
