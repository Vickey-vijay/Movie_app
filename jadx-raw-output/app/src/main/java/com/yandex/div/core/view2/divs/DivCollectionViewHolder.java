package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;

/* JADX INFO: compiled from: DivCollectionViewHolder.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DivCollectionViewHolder extends RecyclerView.ViewHolder {
    private final DivBinder divBinder;
    private Div oldDiv;
    private final BindingContext parentContext;
    private final DivViewCreator viewCreator;
    private final DivViewWrapper viewWrapper;

    public abstract void logReuseError();

    public void updateWrapperLayoutParams(View view) {
    }

    private final View createChildView(BindingContext bindingContext, Div div) {
        if (this.oldDiv != null) {
            logReuseError();
        }
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this.viewWrapper, bindingContext.getDivView());
        return this.viewCreator.create(div, bindingContext.getExpressionResolver());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    public void bind(BindingContext bindingContext, Div div, int i10, DivStatePath divStatePath) {
        View viewCreateChildView;
        BindingContext bindingContext2;
        ExpressionResolver expressionResolver;
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver2 = bindingContext.getExpressionResolver();
        if (RebindUtilsKt.tryRebindRecycleContainerChildren(this.viewWrapper, divView, div)) {
            this.oldDiv = div;
            return;
        }
        View child = this.viewWrapper.getChild();
        if (child != null) {
            View view = this.oldDiv != null ? child : null;
            if (view == null) {
                viewCreateChildView = createChildView(bindingContext, div);
                this.viewWrapper.addView(viewCreateChildView);
            } else {
                DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
                viewCreateChildView = (divHolderView == null || (bindingContext2 = divHolderView.getBindingContext()) == null || (expressionResolver = bindingContext2.getExpressionResolver()) == null || !DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, this.oldDiv, div, expressionResolver, expressionResolver2, null, 16, null)) ? false : true ? view : null;
                if (viewCreateChildView == null) {
                    viewCreateChildView = createChildView(bindingContext, div);
                    this.viewWrapper.addView(viewCreateChildView);
                }
            }
        } else {
            viewCreateChildView = createChildView(bindingContext, div);
            this.viewWrapper.addView(viewCreateChildView);
        }
        this.oldDiv = div;
        divView.getRuntimeStore$div_release().resolveRuntimeWith(divView, divStatePath, div, expressionResolver2, this.parentContext.getExpressionResolver());
        this.divBinder.bind(bindingContext, viewCreateChildView, div, divStatePath);
        updateWrapperLayoutParams(viewCreateChildView);
        divView.getRuntimeStore$div_release().showWarningIfNeeded(div.b());
    }

    public final Div getOldDiv() {
        return this.oldDiv;
    }

    public final void updateState() {
        BindingContext bindingContext;
        View child = this.viewWrapper.getChild();
        if (child == null || (bindingContext = BaseDivViewExtensionsKt.getBindingContext(child)) == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindStates(child, bindingContext, this.divBinder);
    }

    public DivCollectionViewHolder(DivViewWrapper divViewWrapper, BindingContext bindingContext, DivBinder divBinder, DivViewCreator divViewCreator) {
        super(divViewWrapper);
        this.viewWrapper = divViewWrapper;
        this.parentContext = bindingContext;
        this.divBinder = divBinder;
        this.viewCreator = divViewCreator;
    }
}
