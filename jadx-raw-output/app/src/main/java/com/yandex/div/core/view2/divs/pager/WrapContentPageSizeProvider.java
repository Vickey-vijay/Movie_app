package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div2.DivPager;

/* JADX INFO: compiled from: WrapContentPageSizeProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class WrapContentPageSizeProvider extends DivPagerPageSizeProvider {
    private final boolean isHorizontal;
    private final RecyclerView recyclerView;

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    public Float getItemSize(int i10) {
        View viewFindViewByPosition;
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (viewFindViewByPosition = layoutManager.findViewByPosition(i10)) == null) {
            return null;
        }
        return Float.valueOf(this.isHorizontal ? viewFindViewByPosition.getWidth() : viewFindViewByPosition.getHeight());
    }

    public WrapContentPageSizeProvider(RecyclerView recyclerView, boolean z10, int i10, DivPagerPaddingsHolder divPagerPaddingsHolder, DivPager.ItemAlignment itemAlignment) {
        super(i10, divPagerPaddingsHolder, itemAlignment);
        this.recyclerView = recyclerView;
        this.isHorizontal = z10;
    }
}
