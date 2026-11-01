package com.yandex.div.core.view2.reuse.util;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.Div;
import java.util.List;
import jj.a;

/* JADX INFO: compiled from: RebindUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class RebindUtilsKt {
    public static final boolean tryRebindPlainContainerChildren(ViewGroup viewGroup, Div2View div2View, List<DivItemBuilderResult> list, a<DivViewCreator> aVar) {
        ReusableTokenList currentRebindReusableList$div_release = div2View.getCurrentRebindReusableList$div_release();
        if (currentRebindReusableList$div_release == null) {
            return false;
        }
        viewGroup.removeAllViews();
        for (DivItemBuilderResult divItemBuilderResult : list) {
            View uniqueViewForDiv = currentRebindReusableList$div_release.getUniqueViewForDiv(divItemBuilderResult.getDiv());
            if (uniqueViewForDiv == null) {
                uniqueViewForDiv = aVar.get().create(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            viewGroup.addView(uniqueViewForDiv);
        }
        return true;
    }

    public static final boolean tryRebindRecycleContainerChildren(ViewGroup viewGroup, Div2View div2View, Div div) {
        View uniqueViewForDiv;
        ReusableTokenList currentRebindReusableList$div_release = div2View.getCurrentRebindReusableList$div_release();
        if (currentRebindReusableList$div_release != null && (uniqueViewForDiv = currentRebindReusableList$div_release.getUniqueViewForDiv(div)) != null) {
            viewGroup.addView(uniqueViewForDiv);
            return true;
        }
        return false;
    }
}
