package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import bk.l;
import ck.p;
import com.yandex.div.R$id;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCustom;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: DivCustomBinder.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivCustomBinder extends DivViewBinder<Div.c, DivCustom, DivCustomWrapper> {
    private final DivBaseBinder baseBinder;
    private final jj.a<DivBinder> divBinder;
    private final DivCustomContainerViewAdapter divCustomContainerViewAdapter;
    private final DivExtensionController extensionController;

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    private final void bind(DivCustomWrapper divCustomWrapper, View view, DivCustom divCustom, DivCustom divCustom2, BindingContext bindingContext, bk.a<? extends View> aVar, l<? super View, r> lVar) {
        View viewInvoke;
        List<Div> nonNullItems;
        DivCustom divCustomC;
        if (view == null) {
            viewInvoke = aVar.invoke();
            viewInvoke.setTag(R$id.div_custom_tag, divCustom2);
        } else {
            Div.c div = divCustomWrapper.getDiv();
            if (p.e((div == null || (divCustomC = div.c()) == null) ? null : divCustomC.f46874j, divCustom2.f46874j)) {
                boolean z10 = false;
                if (divCustom != null && (nonNullItems = DivCollectionExtensionsKt.getNonNullItems(divCustom)) != null && nonNullItems.size() == DivCollectionExtensionsKt.getNonNullItems(divCustom2).size()) {
                    z10 = true;
                }
                if (z10) {
                    viewInvoke = view;
                } else {
                    viewInvoke = aVar.invoke();
                    viewInvoke.setTag(R$id.div_custom_tag, divCustom2);
                }
            } else {
                viewInvoke = aVar.invoke();
                viewInvoke.setTag(R$id.div_custom_tag, divCustom2);
            }
        }
        Div2View divView = bindingContext.getDivView();
        if (!p.e(view, viewInvoke)) {
            replaceInParent(divCustomWrapper, viewInvoke, divView);
        }
        lVar.invoke(viewInvoke);
        this.baseBinder.bindId$div_release(divView, viewInvoke, divCustom2.getId());
        this.extensionController.bindView(divView, bindingContext.getExpressionResolver(), viewInvoke, divCustom2);
    }

    public void bindView(BindingContext bindingContext, DivCustomWrapper divCustomWrapper, Div.c cVar, final DivStatePath divStatePath) {
        BindingContext bindingContext2;
        ExpressionResolver expressionResolver;
        View customView = divCustomWrapper.getCustomView();
        Div.c div = divCustomWrapper.getDiv();
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver2 = bindingContext.getExpressionResolver();
        if (div == cVar) {
            BaseDivViewExtensionsKt.bindStates(divCustomWrapper, bindingContext, this.divBinder.get());
            return;
        }
        if (customView != null && div != null && (bindingContext2 = divCustomWrapper.getBindingContext()) != null && (expressionResolver = bindingContext2.getExpressionResolver()) != null) {
            this.extensionController.unbindView(divView, expressionResolver, customView, div.b());
        }
        this.baseBinder.bindView(bindingContext, divCustomWrapper, cVar, div);
        this.baseBinder.bindId$div_release(divView, divCustomWrapper, null);
        final DivCustom divCustomC = cVar.c();
        if (this.divCustomContainerViewAdapter.isCustomTypeSupported(divCustomC.f46874j)) {
            bind(divCustomWrapper, customView, div != null ? div.c() : null, divCustomC, bindingContext, new bk.a<View>() { // from class: com.yandex.div.core.view2.divs.DivCustomBinder.bindView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final View invoke() {
                    return DivCustomBinder.this.divCustomContainerViewAdapter.createView(divCustomC, divView, expressionResolver2, divStatePath);
                }
            }, new l<View, r>() { // from class: com.yandex.div.core.view2.divs.DivCustomBinder.bindView.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(View view) {
                    invoke2(view);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View view) {
                    DivCustomBinder.this.divCustomContainerViewAdapter.bindView(view, divCustomC, divView, expressionResolver2, divStatePath);
                }
            });
        }
    }

    public DivCustomBinder(DivBaseBinder divBaseBinder, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivExtensionController divExtensionController, jj.a<DivBinder> aVar) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.divCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.divBinder = aVar;
    }

    private final void replaceInParent(ViewGroup viewGroup, View view, Div2View div2View) {
        boolean z10;
        if (viewGroup.getChildCount() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), ViewGroupKt.get(viewGroup, 0));
            viewGroup.removeViewAt(0);
        }
        viewGroup.addView(view);
    }
}
