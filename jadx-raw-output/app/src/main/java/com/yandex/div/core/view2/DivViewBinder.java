package com.yandex.div.core.view2;

import android.view.View;
import ck.p;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div2.Div;
import mj.r;
import oe.e2;

/* JADX INFO: compiled from: DivViewBinder.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivViewBinder<TData extends Div, TDataValue extends e2, TView extends View> {
    private final DivBaseBinder baseBinder;

    public void bind(TView tview, BindingContext bindingContext, TDataValue tdatavalue, TDataValue tdatavalue2) {
    }

    public void bind(TView tview, BindingContext bindingContext, TDataValue tdatavalue, TDataValue tdatavalue2, DivStatePath divStatePath) {
        bind(tview, bindingContext, tdatavalue, tdatavalue2);
    }

    public void bindView(BindingContext bindingContext, TView tview, TData tdata) {
        bindViewInternal(bindingContext, tview, tdata, null);
    }

    private final void bindViewInternal(BindingContext bindingContext, TView tview, TData tdata, DivStatePath divStatePath) {
        r rVar;
        p.h(tview, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<TData of com.yandex.div.core.view2.DivViewBinder>");
        Div div = ((DivHolderView) tview).getDiv();
        if (tdata == div) {
            return;
        }
        this.baseBinder.bindView(bindingContext, tview, tdata, div);
        if (divStatePath != null) {
            e2 e2VarB = tdata.b();
            p.h(e2VarB, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder.bindViewInternal$lambda$0");
            bind(tview, bindingContext, e2VarB, div != null ? div.b() : null, divStatePath);
            rVar = r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            e2 e2VarB2 = tdata.b();
            p.h(e2VarB2, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder");
            bind(tview, bindingContext, e2VarB2, div != null ? div.b() : null);
        }
    }

    public void bindView(BindingContext bindingContext, TView tview, TData tdata, DivStatePath divStatePath) {
        bindViewInternal(bindingContext, tview, tdata, divStatePath);
    }

    public DivViewBinder(DivBaseBinder divBaseBinder) {
        this.baseBinder = divBaseBinder;
    }
}
