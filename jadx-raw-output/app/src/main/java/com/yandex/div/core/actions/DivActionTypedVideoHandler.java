package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivActionVideo;

/* JADX INFO: compiled from: DivActionTypedVideoHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivActionTypedVideoHandler implements DivActionTypedHandler {
    private final void handleVideoAction(DivActionVideo divActionVideo, Div2View div2View, ExpressionResolver expressionResolver) {
        div2View.applyVideoCommand(divActionVideo.f46415b.evaluate(expressionResolver), DivActionVideo.Action.Converter.b(divActionVideo.f46414a.evaluate(expressionResolver)), expressionResolver);
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.v)) {
            return false;
        }
        handleVideoAction(((DivActionTyped.v) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }
}
