package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;

/* JADX INFO: compiled from: DivCollectionHolder.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivCollectionHolderMixin implements DivCollectionHolder {
    private List<DivItemBuilderResult> items;

    @Override // com.yandex.div.core.view2.divs.widgets.DivCollectionHolder
    public List<DivItemBuilderResult> getItems() {
        return this.items;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivCollectionHolder
    public void setItems(List<DivItemBuilderResult> list) {
        this.items = list;
    }
}
