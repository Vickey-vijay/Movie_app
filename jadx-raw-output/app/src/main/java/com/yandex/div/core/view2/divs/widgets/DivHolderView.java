package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div2.Div;

/* JADX INFO: compiled from: DivHolderView.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface DivHolderView<T extends Div> extends DivBorderSupports, TransientView, ExpressionSubscriber {
    BindingContext getBindingContext();

    T getDiv();

    void setBindingContext(BindingContext bindingContext);

    void setDiv(T t10);

    default void release() {
        super.release();
        setDiv(null);
        setBindingContext(null);
        releaseBorderDrawer();
    }
}
