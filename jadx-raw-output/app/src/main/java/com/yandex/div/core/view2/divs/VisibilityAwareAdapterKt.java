package com.yandex.div.core.view2.divs;

import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.DivVisibility;

/* JADX INFO: compiled from: VisibilityAwareAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class VisibilityAwareAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DivVisibility getVisibility(DivItemBuilderResult divItemBuilderResult) {
        return divItemBuilderResult.getDiv().b().getVisibility().evaluate(divItemBuilderResult.getExpressionResolver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(DivItemBuilderResult divItemBuilderResult) {
        if (getVisibility(divItemBuilderResult) == DivVisibility.VISIBLE) {
            return true;
        }
        return false;
    }
}
