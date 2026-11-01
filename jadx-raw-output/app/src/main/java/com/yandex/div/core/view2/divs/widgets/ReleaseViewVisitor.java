package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import ck.p;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.util.Iterator;
import oe.e2;

/* JADX INFO: compiled from: ReleaseViewVisitor.kt */
/* JADX INFO: loaded from: classes3.dex */
public class ReleaseViewVisitor extends DivViewVisitor {
    private final DivCustomContainerViewAdapter divCustomContainerViewAdapter;
    private final DivExtensionController divExtensionController;
    private final Div2View divView;

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivPagerView divPagerView) {
        super.visit(divPagerView);
        divPagerView.getViewPager().setAdapter(null);
    }

    private void releaseInternal(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        if (e2Var != null && expressionResolver != null) {
            this.divExtensionController.unbindView(this.divView, expressionResolver, view, e2Var);
        }
        release$div_release(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void defaultVisit(DivHolderView<?> divHolderView) {
        p.h(divHolderView, "null cannot be cast to non-null type android.view.View");
        View view = (View) divHolderView;
        Div div = divHolderView.getDiv();
        e2 e2VarB = div != null ? div.b() : null;
        BindingContext bindingContext = divHolderView.getBindingContext();
        releaseInternal(view, e2VarB, bindingContext != null ? bindingContext.getExpressionResolver() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting(otherwise = 2)
    public void release$div_release(View view) {
        if (view instanceof Releasable) {
            ((Releasable) view).release();
        }
        Iterable<Releasable> releasableList = ReleasablesKt.getReleasableList(view);
        if (releasableList != null) {
            Iterator<Releasable> it = releasableList.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
        }
    }

    public ReleaseViewVisitor(Div2View div2View, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivExtensionController divExtensionController) {
        this.divView = div2View;
        this.divCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.divExtensionController = divExtensionController;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivRecyclerView divRecyclerView) {
        super.visit(divRecyclerView);
        divRecyclerView.setAdapter(null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivCustomWrapper divCustomWrapper) {
        BindingContext bindingContext;
        ExpressionResolver expressionResolver;
        Div.c div = divCustomWrapper.getDiv();
        if (div == null || (bindingContext = divCustomWrapper.getBindingContext()) == null || (expressionResolver = bindingContext.getExpressionResolver()) == null) {
            return;
        }
        release$div_release(divCustomWrapper);
        View customView = divCustomWrapper.getCustomView();
        if (customView != null) {
            this.divExtensionController.unbindView(this.divView, expressionResolver, customView, div.c());
            this.divCustomContainerViewAdapter.release(customView, div.c());
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(View view) {
        release$div_release(view);
    }
}
