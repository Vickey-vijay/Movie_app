package com.yandex.div.core.view2.divs;

import bk.l;
import com.yandex.div.R$dimen;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivSeparator;
import mj.r;

/* JADX INFO: compiled from: DivSeparatorBinder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivSeparatorBinder extends DivViewBinder<Div.l, DivSeparator, DivSeparatorView> {
    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(DivSeparatorView divSeparatorView, DivSeparator.DelimiterStyle delimiterStyle, ExpressionResolver expressionResolver) {
        if (delimiterStyle == null) {
            divSeparatorView.setDividerColor(335544320);
            divSeparatorView.setHorizontal(true);
        } else {
            divSeparatorView.setDividerColor(delimiterStyle.f48702a.evaluate(expressionResolver).intValue());
            divSeparatorView.setHorizontal(delimiterStyle.f48703b.evaluate(expressionResolver) == DivSeparator.DelimiterStyle.Orientation.HORIZONTAL);
        }
    }

    private final void bindStyle(final DivSeparatorView divSeparatorView, final DivSeparator.DelimiterStyle delimiterStyle, DivSeparator.DelimiterStyle delimiterStyle2, final ExpressionResolver expressionResolver) {
        Expression<DivSeparator.DelimiterStyle.Orientation> expression;
        Expression<Integer> expression2;
        Disposable disposableObserve = null;
        if (ExpressionsKt.equalsToConstant(delimiterStyle != null ? delimiterStyle.f48702a : null, delimiterStyle2 != null ? delimiterStyle2.f48702a : null)) {
            if (ExpressionsKt.equalsToConstant(delimiterStyle != null ? delimiterStyle.f48703b : null, delimiterStyle2 != null ? delimiterStyle2.f48703b : null)) {
                return;
            }
        }
        applyStyle(divSeparatorView, delimiterStyle, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(delimiterStyle != null ? delimiterStyle.f48702a : null)) {
            if (ExpressionsKt.isConstantOrNull(delimiterStyle != null ? delimiterStyle.f48703b : null)) {
                return;
            }
        }
        l<? super DivSeparator.DelimiterStyle.Orientation, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSeparatorBinder$bindStyle$callback$1
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
                this.this$0.applyStyle(divSeparatorView, delimiterStyle, expressionResolver);
            }
        };
        divSeparatorView.addSubscription((delimiterStyle == null || (expression2 = delimiterStyle.f48702a) == null) ? null : expression2.observe(expressionResolver, lVar));
        if (delimiterStyle != null && (expression = delimiterStyle.f48703b) != null) {
            disposableObserve = expression.observe(expressionResolver, lVar);
        }
        divSeparatorView.addSubscription(disposableObserve);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivSeparatorView divSeparatorView, BindingContext bindingContext, DivSeparator divSeparator, DivSeparator divSeparator2) {
        BaseDivViewExtensionsKt.applyDivActions(divSeparatorView, bindingContext, divSeparator.f48673b, divSeparator.f48675d, divSeparator.f48695x, divSeparator.f48686o, divSeparator.f48692u, divSeparator.f48691t, divSeparator.B, divSeparator.A, divSeparator.f48674c, divSeparator.f48682k);
        bindStyle(divSeparatorView, divSeparator.f48684m, divSeparator2 != null ? divSeparator2.f48684m : null, bindingContext.getExpressionResolver());
        divSeparatorView.setDividerHeightResource(R$dimen.div_separator_delimiter_height);
        divSeparatorView.setDividerGravity(17);
    }

    public DivSeparatorBinder(DivBaseBinder divBaseBinder) {
        super(divBaseBinder);
    }
}
