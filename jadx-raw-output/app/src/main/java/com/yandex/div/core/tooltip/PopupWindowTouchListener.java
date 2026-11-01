package com.yandex.div.core.tooltip;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DivTooltipController.kt */
/* JADX INFO: loaded from: classes6.dex */
final class PopupWindowTouchListener implements View.OnTouchListener {
    private final BindingContext bindingContext;
    private final Rect hitRect = new Rect();
    private final boolean isModal;
    private final PopupWindow popupWindow;
    private final boolean shouldDismissByOutsideTouch;
    private final List<DivAction> tapOutsideActions;
    private final View tooltipView;

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.tooltipView.getHitRect(this.hitRect);
        if (this.hitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            List<DivAction> list = this.tapOutsideActions;
            if (list != null) {
                ExpressionResolver expressionResolver = this.bindingContext.getExpressionResolver();
                Div2View divView = this.bindingContext.getDivView();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((DivAction) obj).f46031b.evaluate(expressionResolver).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    divView.getDiv2Component$div_release().getActionHandler().handleActionWithReason((DivAction) it.next(), divView, expressionResolver, "click");
                }
            }
            if (this.shouldDismissByOutsideTouch) {
                this.popupWindow.dismiss();
            }
        }
        return this.isModal;
    }

    public PopupWindowTouchListener(PopupWindow popupWindow, View view, boolean z10, boolean z11, List<DivAction> list, BindingContext bindingContext) {
        this.popupWindow = popupWindow;
        this.tooltipView = view;
        this.isModal = z10;
        this.shouldDismissByOutsideTouch = z11;
        this.tapOutsideActions = list;
        this.bindingContext = bindingContext;
    }
}
