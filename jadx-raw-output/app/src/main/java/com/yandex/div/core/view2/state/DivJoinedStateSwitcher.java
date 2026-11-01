package com.yandex.div.core.view2.state;

import android.view.View;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import nj.b0;

/* JADX INFO: compiled from: DivJoinedStateSwitcher.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivJoinedStateSwitcher implements DivStateSwitcher {
    private final DivBinder divBinder;
    private final Div2View divView;

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    public void switchStates(DivData.State state, List<DivStatePath> list, ExpressionResolver expressionResolver) throws StateConflictException {
        View childAt = this.divView.getChildAt(0);
        Div div = state.f46946a;
        DivStatePath divStatePathFromState$div_release = DivStatePath.Companion.fromState$div_release(state);
        DivStatePath divStatePathFindCommonPath = findCommonPath(list, divStatePathFromState$div_release);
        if (!divStatePathFindCommonPath.isRootPath()) {
            Pair<DivStateLayout, Div.n> pairTryFindStateDivAndLayout$div_release = DivPathUtils.INSTANCE.tryFindStateDivAndLayout$div_release(childAt, state, divStatePathFindCommonPath, expressionResolver);
            if (pairTryFindStateDivAndLayout$div_release == null) {
                return;
            }
            DivStateLayout divStateLayoutComponent1 = pairTryFindStateDivAndLayout$div_release.component1();
            Div.n nVarComponent2 = pairTryFindStateDivAndLayout$div_release.component2();
            if (divStateLayoutComponent1 != null) {
                DivStatePath path = divStateLayoutComponent1.getPath();
                divStatePathFromState$div_release = path == null ? divStatePathFindCommonPath : path;
                div = nVarComponent2;
                childAt = divStateLayoutComponent1;
            }
        }
        BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(childAt);
        if (bindingContext == null) {
            bindingContext = this.divView.getBindingContext$div_release();
        }
        this.divBinder.bind(bindingContext, childAt, div, divStatePathFromState$div_release.parentState());
        this.divBinder.attachIndicators$div_release();
    }

    public DivJoinedStateSwitcher(Div2View div2View, DivBinder divBinder) {
        this.divView = div2View;
        this.divBinder = divBinder;
    }

    private final DivStatePath findCommonPath(List<DivStatePath> list, DivStatePath divStatePath) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                Iterator<T> it = list.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        DivStatePath divStatePath2 = (DivStatePath) it.next();
                        next = DivStatePath.Companion.lowestCommonAncestor$div_release((DivStatePath) next, divStatePath2);
                        if (next == null) {
                            next = divStatePath;
                        }
                    }
                    return (DivStatePath) next;
                }
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            return (DivStatePath) b0.f0(list);
        }
        return divStatePath;
    }
}
