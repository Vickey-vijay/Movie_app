package com.yandex.div.core.view2.divs;

import android.view.KeyEvent;
import android.widget.TextView;
import bk.l;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivInput;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import mj.r;

/* JADX INFO: compiled from: DivInputBinder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivInputBinder$observeEnterTypeAndActions$callback$1 extends Lambda implements l<Object, r> {
    public final /* synthetic */ BindingContext $bindingContext;
    public final /* synthetic */ DivInput $div;
    public final /* synthetic */ ExpressionResolver $resolver;
    public final /* synthetic */ DivInputView $this_observeEnterTypeAndActions;
    public final /* synthetic */ DivInputBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivInputBinder$observeEnterTypeAndActions$callback$1(DivInput divInput, ExpressionResolver expressionResolver, DivInputView divInputView, DivInputBinder divInputBinder, BindingContext bindingContext) {
        super(1);
        this.$div = divInput;
        this.$resolver = expressionResolver;
        this.$this_observeEnterTypeAndActions = divInputView;
        this.this$0 = divInputBinder;
        this.$bindingContext = bindingContext;
    }

    @Override // bk.l
    public /* bridge */ /* synthetic */ r invoke(Object obj) {
        invoke2(obj);
        return r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$0(DivInputBinder divInputBinder, BindingContext bindingContext, DivInputView divInputView, List list, TextView textView, int i10, KeyEvent keyEvent) {
        if ((i10 & 255) == 0) {
            return false;
        }
        divInputBinder.actionBinder.handleBulkActions$div_release(bindingContext, divInputView, list, "enter");
        return false;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Object obj) {
        DivInput.EnterKeyType enterKeyTypeEvaluate = this.$div.f47834l.evaluate(this.$resolver);
        DivInputView divInputView = this.$this_observeEnterTypeAndActions;
        divInputView.setImeOptions(divInputView.getImeOptions() + this.this$0.getImeAction(enterKeyTypeEvaluate));
        final List<DivAction> list = this.$div.f47833k;
        if (list == null || list.isEmpty()) {
            this.$this_observeEnterTypeAndActions.setOnEditorActionListener(null);
            return;
        }
        final DivInputView divInputView2 = this.$this_observeEnterTypeAndActions;
        final DivInputBinder divInputBinder = this.this$0;
        final BindingContext bindingContext = this.$bindingContext;
        divInputView2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.div.core.view2.divs.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return DivInputBinder$observeEnterTypeAndActions$callback$1.invoke$lambda$0(divInputBinder, bindingContext, divInputView2, list, textView, i10, keyEvent);
            }
        });
    }
}
