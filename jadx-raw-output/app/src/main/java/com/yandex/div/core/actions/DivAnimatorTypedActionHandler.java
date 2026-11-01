package com.yandex.div.core.actions;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewLocator;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;
import java.util.List;
import nj.b0;

/* JADX INFO: compiled from: DivAnimatorTypedActionHandler.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivAnimatorTypedActionHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.a)) {
            if (!(divActionTyped instanceof DivActionTyped.b)) {
                return false;
            }
            if (str == null) {
                return true;
            }
            div2View.getViewComponent$div_release().getAnimatorController().stopAnimator(str, ((DivActionTyped.b) divActionTyped).c().f46080a);
            return true;
        }
        if (str == null) {
            return true;
        }
        List<View> listFindViewsWithTag = ViewLocator.findViewsWithTag(div2View, str);
        if (listFindViewsWithTag.size() != 1) {
            return true;
        }
        div2View.getViewComponent$div_release().getAnimatorController().startAnimator(str, (View) b0.f0(listFindViewsWithTag), ((DivActionTyped.a) divActionTyped).c(), expressionResolver);
        return true;
    }
}
