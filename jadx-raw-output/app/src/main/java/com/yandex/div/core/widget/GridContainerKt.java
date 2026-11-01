package com.yandex.div.core.widget;

import com.yandex.div.internal.widget.DivLayoutParams;

/* JADX INFO: compiled from: GridContainer.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class GridContainerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float getColumnWeight(DivLayoutParams divLayoutParams) {
        return divLayoutParams.getHorizontalWeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getRowWeight(DivLayoutParams divLayoutParams) {
        return divLayoutParams.getVerticalWeight();
    }
}
