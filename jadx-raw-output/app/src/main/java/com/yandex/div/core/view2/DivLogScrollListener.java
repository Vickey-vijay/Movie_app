package com.yandex.div.core.view2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: DivLogScrollListener.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivLogScrollListener extends RecyclerView.OnScrollListener {
    private final boolean isVertical;
    private final LinearLayoutManager layoutManager;
    private final OnViewHolderVisibleListener listener;
    private final int scrollGap;
    private int totalScroll;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        int width;
        super.onScrolled(recyclerView, i10, i11);
        int i12 = this.totalScroll;
        if (this.isVertical) {
            i10 = i11;
        }
        this.totalScroll = i12 + Math.abs(i10);
        if (this.isVertical) {
            width = this.layoutManager.getHeight();
        } else {
            width = this.layoutManager.getWidth();
        }
        if (this.totalScroll > width / this.scrollGap) {
            this.totalScroll = 0;
            int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
            for (int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                this.listener.onViewHolderVisible(iFindFirstVisibleItemPosition);
            }
        }
    }
}
