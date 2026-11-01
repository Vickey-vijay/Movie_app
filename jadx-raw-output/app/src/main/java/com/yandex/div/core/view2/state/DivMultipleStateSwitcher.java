package com.yandex.div.core.view2.state;

import android.view.View;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: DivMultipleStateSwitcher.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivMultipleStateSwitcher implements DivStateSwitcher {
    private final DivBinder divBinder;
    private final Div2View divView;

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    public void switchStates(DivData.State state, List<DivStatePath> list, ExpressionResolver expressionResolver) throws StateConflictException {
        View childAt = this.divView.getChildAt(0);
        Div div = state.f46946a;
        List<DivStatePath> listCompactPathList$div_release = DivPathUtils.INSTANCE.compactPathList$div_release(list);
        ArrayList<DivStatePath> arrayList = new ArrayList();
        for (Object obj : listCompactPathList$div_release) {
            if (!((DivStatePath) obj).isRootPath()) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (DivStatePath divStatePath : arrayList) {
            Pair<DivStateLayout, Div.n> pairTryFindStateDivAndLayout$div_release = DivPathUtils.INSTANCE.tryFindStateDivAndLayout$div_release(childAt, state, divStatePath, expressionResolver);
            if (pairTryFindStateDivAndLayout$div_release == null) {
                return;
            }
            DivStateLayout divStateLayoutComponent1 = pairTryFindStateDivAndLayout$div_release.component1();
            Div.n nVarComponent2 = pairTryFindStateDivAndLayout$div_release.component2();
            if (divStateLayoutComponent1 != null && !linkedHashSet.contains(divStateLayoutComponent1)) {
                DivStatePath path = divStateLayoutComponent1.getPath();
                if (path != null) {
                    divStatePath = path;
                }
                BindingContext bindingContext = divStateLayoutComponent1.getBindingContext();
                if (bindingContext == null) {
                    bindingContext = this.divView.getBindingContext$div_release();
                }
                this.divBinder.bind(bindingContext, divStateLayoutComponent1, nVarComponent2, divStatePath.parentState());
                linkedHashSet.add(divStateLayoutComponent1);
            }
        }
        if (linkedHashSet.isEmpty()) {
            this.divBinder.bind(this.divView.getBindingContext$div_release(), childAt, div, DivStatePath.Companion.fromState$div_release(state));
        }
        this.divBinder.attachIndicators$div_release();
    }

    public DivMultipleStateSwitcher(Div2View div2View, DivBinder divBinder) {
        this.divView = div2View;
        this.divBinder = divBinder;
    }
}
