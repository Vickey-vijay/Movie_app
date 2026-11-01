package com.yandex.div.core.state;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;

/* JADX INFO: compiled from: UpdateStateScrollListener.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UpdateStateScrollListener extends RecyclerView.OnScrollListener {
    private final String blockId;
    private final DivViewState divViewState;
    private final DivGalleryItemHelper layoutManager;

    public UpdateStateScrollListener(String str, DivViewState divViewState, DivGalleryItemHelper divGalleryItemHelper) {
        this.blockId = str;
        this.divViewState = divViewState;
        this.layoutManager = divGalleryItemHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        int iCalcScrollOffset;
        View view;
        super.onScrolled(recyclerView, i10, i11);
        int iFirstVisibleItemPosition = this.layoutManager.firstVisibleItemPosition();
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(iFirstVisibleItemPosition);
        if (viewHolderFindViewHolderForLayoutPosition != null && (view = viewHolderFindViewHolderForLayoutPosition.itemView) != null) {
            iCalcScrollOffset = this.layoutManager.calcScrollOffset(view);
        } else {
            iCalcScrollOffset = 0;
        }
        this.divViewState.putBlockState(this.blockId, new GalleryState(iFirstVisibleItemPosition, iCalcScrollOffset));
    }
}
