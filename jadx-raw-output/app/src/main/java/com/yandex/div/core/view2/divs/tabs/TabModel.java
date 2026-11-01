package com.yandex.div.core.view2.divs.tabs;

import android.view.View;
import com.yandex.div2.Div;

/* JADX INFO: compiled from: DivTabsAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
final class TabModel {
    private final Div div;
    private final int index;
    private final View view;

    public final Div getDiv() {
        return this.div;
    }

    public final int getIndex() {
        return this.index;
    }

    public final View getView() {
        return this.view;
    }

    public TabModel(int i10, Div div, View view) {
        this.index = i10;
        this.div = div;
        this.view = view;
    }
}
