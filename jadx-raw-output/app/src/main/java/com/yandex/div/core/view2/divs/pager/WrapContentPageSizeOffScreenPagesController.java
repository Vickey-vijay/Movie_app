package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import ik.k;

/* JADX INFO: compiled from: WrapContentPageSizeOffScreenPagesController.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class WrapContentPageSizeOffScreenPagesController {
    private final DivPagerAdapter adapter;
    private final float itemSpacing;
    private final DivPagerPaddingsHolder paddings;
    private final DivPagerPageSizeProvider pageSizeProvider;
    private final DivPagerView parent;
    private int sidePagesCount;

    private final int calcSidePagesCount() {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(this.parent.getCurrentItem$div_release());
        if (prevNeighbourSize == null) {
            return 1;
        }
        float fFloatValue = prevNeighbourSize.floatValue();
        int currentItem$div_release = this.parent.getCurrentItem$div_release() - 1;
        int i10 = 0;
        int i11 = 0;
        while (fFloatValue > 0.0f && currentItem$div_release > 0) {
            i11++;
            Float fPageSize = pageSize(currentItem$div_release);
            if (fPageSize == null) {
                break;
            }
            fFloatValue -= fPageSize.floatValue();
            currentItem$div_release--;
        }
        if (fFloatValue > this.paddings.getStart() && currentItem$div_release == 0) {
            i11++;
            Float fPageSize2 = pageSize(currentItem$div_release);
            fFloatValue -= fPageSize2 != null ? fPageSize2.floatValue() : 0.0f;
        }
        Float nextNeighbourSize = this.pageSizeProvider.getNextNeighbourSize(this.parent.getCurrentItem$div_release());
        if (nextNeighbourSize == null) {
            return k.d(i11, 1);
        }
        float fFloatValue2 = nextNeighbourSize.floatValue();
        if (fFloatValue > this.paddings.getStart()) {
            fFloatValue2 += fFloatValue;
        }
        int currentItem$div_release2 = this.parent.getCurrentItem$div_release() + 1;
        while (fFloatValue2 > 0.0f && currentItem$div_release2 < this.adapter.getItemCount() - 1) {
            i10++;
            Float fPageSize3 = pageSize(currentItem$div_release2);
            if (fPageSize3 == null) {
                break;
            }
            fFloatValue2 -= fPageSize3.floatValue();
            currentItem$div_release2++;
        }
        if (fFloatValue2 > this.paddings.getEnd() && currentItem$div_release2 == this.adapter.getItemCount() - 1) {
            i10++;
            Float fPageSize4 = pageSize(currentItem$div_release2);
            fFloatValue2 -= fPageSize4 != null ? fPageSize4.floatValue() : 0.0f;
        }
        while (fFloatValue2 > 0.0f && currentItem$div_release >= 0) {
            i11++;
            Float fPageSize5 = pageSize(currentItem$div_release);
            if (fPageSize5 == null) {
                break;
            }
            fFloatValue2 -= fPageSize5.floatValue();
            currentItem$div_release--;
        }
        return k.d(Math.max(i11, i10), 1);
    }

    private final Float pageSize(int i10) {
        Float itemSize = this.pageSizeProvider.getItemSize(i10);
        if (itemSize != null) {
            return Float.valueOf(itemSize.floatValue() + this.itemSpacing);
        }
        return null;
    }

    public WrapContentPageSizeOffScreenPagesController(DivPagerView divPagerView, float f10, DivPagerPageSizeProvider divPagerPageSizeProvider, DivPagerPaddingsHolder divPagerPaddingsHolder, DivPagerAdapter divPagerAdapter) {
        this.parent = divPagerView;
        this.itemSpacing = f10;
        this.pageSizeProvider = divPagerPageSizeProvider;
        this.paddings = divPagerPaddingsHolder;
        this.adapter = divPagerAdapter;
        this.sidePagesCount = 1;
        this.sidePagesCount = calcSidePagesCount();
        setOffScreenPages(divPagerView);
        divPagerView.setChangePageCallbackForOffScreenPages$div_release(new DivPagerView.OffScreenPagesUpdateCallback() { // from class: com.yandex.div.core.view2.divs.pager.WrapContentPageSizeOffScreenPagesController.1
            @Override // com.yandex.div.core.view2.divs.widgets.DivPagerView.OffScreenPagesUpdateCallback, android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                WrapContentPageSizeOffScreenPagesController.this.updateOffScreenPages();
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                WrapContentPageSizeOffScreenPagesController.this.updateOffScreenPages();
            }
        });
    }

    private final void setOffScreenPages(DivPagerView divPagerView) {
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize((this.sidePagesCount * 2) + 3);
        }
        divPagerView.getViewPager().setOffscreenPageLimit(this.sidePagesCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateOffScreenPages() {
        int iCalcSidePagesCount = calcSidePagesCount();
        if (iCalcSidePagesCount <= this.sidePagesCount) {
            return;
        }
        this.sidePagesCount = iCalcSidePagesCount;
        setOffScreenPages(this.parent);
    }
}
