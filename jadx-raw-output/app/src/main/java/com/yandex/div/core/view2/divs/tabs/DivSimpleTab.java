package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;

/* JADX INFO: compiled from: DivTabsAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivSimpleTab implements BaseDivTabbedCardUi.Input.TabBase {
    private final DisplayMetrics displayMetrics;
    private final DivTabs.Item item;
    private final ExpressionResolver resolver;

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    public DivAction getActionable() {
        return this.item.f49278c;
    }

    public DivTabs.Item getItem() {
        return this.item;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    public Integer getTabHeight() {
        DivSize height = this.item.f49276a.b().getHeight();
        if (height instanceof DivSize.b) {
            return Integer.valueOf(DivUtilKt.toLayoutParamsSize$default(height, this.displayMetrics, this.resolver, null, 4, null));
        }
        return null;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    public Integer getTabHeightLayoutParam() {
        return Integer.valueOf(DivUtilKt.toLayoutParamsSize$default(this.item.f49276a.b().getHeight(), this.displayMetrics, this.resolver, null, 4, null));
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    public String getTitle() {
        return this.item.f49277b.evaluate(this.resolver);
    }

    public DivSimpleTab(DivTabs.Item item, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        this.item = item;
        this.displayMetrics = displayMetrics;
        this.resolver = expressionResolver;
    }
}
