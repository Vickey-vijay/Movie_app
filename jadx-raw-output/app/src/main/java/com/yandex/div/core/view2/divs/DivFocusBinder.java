package com.yandex.div.core.view2.divs;

import android.view.View;
import ck.p;
import com.yandex.div.R$dimen;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivBorder;
import java.util.List;

/* JADX INFO: compiled from: DivFocusBinder.kt */
/* JADX INFO: loaded from: classes8.dex */
public class DivFocusBinder {
    private final DivActionBinder actionBinder;

    /* JADX INFO: compiled from: DivFocusBinder.kt */
    public final class FocusChangeListener implements View.OnFocusChangeListener {
        private List<DivAction> blurActions;
        private DivBorder blurredBorder;
        private final BindingContext context;
        private List<DivAction> focusActions;
        private DivBorder focusedBorder;

        public FocusChangeListener(BindingContext bindingContext) {
            this.context = bindingContext;
        }

        private final void applyBorder(View view, DivBorder divBorder) {
            DivFocusBinder.this.applyBorder(view, this.context, divBorder);
        }

        private final void handle(List<DivAction> list, View view, String str) {
            DivFocusBinder.this.actionBinder.handleBulkActions$div_release(this.context, view, list, str);
        }

        public final List<DivAction> getBlurActions() {
            return this.blurActions;
        }

        public final DivBorder getBlurredBorder() {
            return this.blurredBorder;
        }

        public final List<DivAction> getFocusActions() {
            return this.focusActions;
        }

        public final DivBorder getFocusedBorder() {
            return this.focusedBorder;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                applyBorder(view, this.focusedBorder);
                List<DivAction> list = this.focusActions;
                if (list != null) {
                    handle(list, view, "focus");
                    return;
                }
                return;
            }
            if (this.focusedBorder != null) {
                applyBorder(view, this.blurredBorder);
            }
            List<DivAction> list2 = this.blurActions;
            if (list2 != null) {
                handle(list2, view, "blur");
            }
        }

        public final void setActions(List<DivAction> list, List<DivAction> list2) {
            this.focusActions = list;
            this.blurActions = list2;
        }

        public final void setBorders(DivBorder divBorder, DivBorder divBorder2) {
            this.focusedBorder = divBorder;
            this.blurredBorder = divBorder2;
        }
    }

    private boolean isConstantlyEmpty(DivBorder divBorder) {
        if (divBorder == null) {
            return true;
        }
        return divBorder.f46537a == null && divBorder.f46538b == null && p.e(divBorder.f46539c, Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null)) && divBorder.f46540d == null && divBorder.f46541e == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void applyBorder(View view, BindingContext bindingContext, DivBorder divBorder) {
        if (view instanceof DivBorderSupports) {
            ((DivBorderSupports) view).setBorder(bindingContext, divBorder, view);
            return;
        }
        float dimension = 0.0f;
        if (divBorder != null && !isConstantlyEmpty(divBorder) && divBorder.f46539c.evaluate(bindingContext.getExpressionResolver()).booleanValue() && divBorder.f46540d == null) {
            dimension = view.getResources().getDimension(R$dimen.div_shadow_elevation);
        }
        view.setElevation(dimension);
    }

    public void bindDivBorder(View view, BindingContext bindingContext, DivBorder divBorder, DivBorder divBorder2) {
        applyBorder(view, bindingContext, (divBorder == null || isConstantlyEmpty(divBorder) || !view.isFocused()) ? divBorder2 : divBorder);
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        FocusChangeListener focusChangeListener = onFocusChangeListener instanceof FocusChangeListener ? (FocusChangeListener) onFocusChangeListener : null;
        if (focusChangeListener == null && isConstantlyEmpty(divBorder)) {
            return;
        }
        boolean z10 = true;
        if (focusChangeListener != null && focusChangeListener.getFocusActions() == null && focusChangeListener.getBlurActions() == null && isConstantlyEmpty(divBorder)) {
            z10 = false;
        }
        if (!z10) {
            view.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(bindingContext);
        focusChangeListener2.setBorders(divBorder, divBorder2);
        if (focusChangeListener != null) {
            focusChangeListener2.setActions(focusChangeListener.getFocusActions(), focusChangeListener.getBlurActions());
        }
        view.setOnFocusChangeListener(focusChangeListener2);
    }

    public DivFocusBinder(DivActionBinder divActionBinder) {
        this.actionBinder = divActionBinder;
    }

    public void bindDivFocusActions(View view, BindingContext bindingContext, List<DivAction> list, List<DivAction> list2) {
        FocusChangeListener focusChangeListener;
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof FocusChangeListener) {
            focusChangeListener = (FocusChangeListener) onFocusChangeListener;
        } else {
            focusChangeListener = null;
        }
        boolean z10 = false;
        boolean z11 = true;
        if (focusChangeListener == null && CollectionsKt.allIsNullOrEmpty(list, list2)) {
            return;
        }
        if (focusChangeListener != null) {
            if (focusChangeListener.getFocusedBorder() != null || !CollectionsKt.allIsNullOrEmpty(list, list2)) {
                z10 = true;
            }
            z11 = z10;
        }
        if (!z11) {
            view.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(bindingContext);
        if (focusChangeListener != null) {
            focusChangeListener2.setBorders(focusChangeListener.getFocusedBorder(), focusChangeListener.getBlurredBorder());
        }
        focusChangeListener2.setActions(list, list2);
        view.setOnFocusChangeListener(focusChangeListener2);
    }
}
