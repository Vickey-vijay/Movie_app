package com.yandex.div.core.view2.divs.pager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ek.b;

/* JADX INFO: compiled from: FixedPageSizeItemDecoration.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class FixedPageSizeItemDecoration extends RecyclerView.ItemDecoration {
    private final int offsetBottom;
    private final int offsetLeft;
    private final int offsetRight;
    private final int offsetTop;
    private final FixedPageSizeProvider sizeProvider;

    private final int toOffset(Integer num) {
        return num != null ? num.intValue() : b.c(this.sizeProvider.getNeighbourSize());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(this.offsetLeft, this.offsetTop, this.offsetRight, this.offsetBottom);
    }

    public FixedPageSizeItemDecoration(DivPagerPaddingsHolder divPagerPaddingsHolder, FixedPageSizeProvider fixedPageSizeProvider) {
        this.sizeProvider = fixedPageSizeProvider;
        this.offsetLeft = toOffset(divPagerPaddingsHolder.getAlignedLeft());
        this.offsetTop = toOffset(divPagerPaddingsHolder.getAlignedTop());
        this.offsetRight = toOffset(divPagerPaddingsHolder.getAlignedRight());
        this.offsetBottom = toOffset(divPagerPaddingsHolder.getAlignedBottom());
    }
}
