package com.yandex.div.core.view2.divs.pager;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bk.l;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import mj.r;

/* JADX INFO: compiled from: FixedPageSizeOffScreenPagesController.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FixedPageSizeOffScreenPagesController {
    private final DivPagerAdapter adapter;
    private final boolean infiniteScroll;
    private final float itemSpacing;
    private final DivPagerPaddingsHolder paddings;
    private final FixedPageSizeProvider pageSizeProvider;
    private final DivPagerView parent;
    private final int parentSize;

    private final void setOffScreenPages() {
        boolean z10 = false;
        if (this.pageSizeProvider.getItemSize() == 0.0f) {
            return;
        }
        ViewPager2 viewPager = this.parent.getViewPager();
        float itemSize = this.parentSize / (this.pageSizeProvider.getItemSize() + this.itemSpacing);
        RecyclerView recyclerView = this.parent.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize(((int) Math.ceil(itemSize)) + 2);
        }
        if (this.pageSizeProvider.getHasOffScreenPages()) {
            viewPager.setOffscreenPageLimit(Math.max((int) Math.ceil(itemSize - 1), 1));
            return;
        }
        float neighbourSize = this.pageSizeProvider.getNeighbourSize();
        if (neighbourSize > this.itemSpacing) {
            viewPager.setOffscreenPageLimit(1);
            return;
        }
        if (!this.infiniteScroll && (this.paddings.getStart() < neighbourSize || this.paddings.getEnd() < neighbourSize)) {
            z10 = true;
        }
        if (!z10) {
            viewPager.setOffscreenPageLimit(-1);
            return;
        }
        final l<Integer, r> lVar = new l<Integer, r>() { // from class: com.yandex.div.core.view2.divs.pager.FixedPageSizeOffScreenPagesController$setOffScreenPages$setOffScreenPages$1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Integer num) {
                invoke(num.intValue());
                return r.f64562a;
            }

            public final void invoke(int i10) {
                ViewPager2 viewPager2 = this.this$0.parent.getViewPager();
                int i11 = 1;
                if (i10 != 0 && i10 != this.this$0.adapter.getItemCount() - 1) {
                    i11 = -1;
                }
                viewPager2.setOffscreenPageLimit(i11);
            }
        };
        lVar.invoke(Integer.valueOf(viewPager.getCurrentItem()));
        this.parent.setChangePageCallbackForOffScreenPages$div_release(new DivPagerView.OffScreenPagesUpdateCallback() { // from class: com.yandex.div.core.view2.divs.pager.FixedPageSizeOffScreenPagesController.setOffScreenPages.1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                lVar.invoke(Integer.valueOf(i10));
            }
        });
    }

    public FixedPageSizeOffScreenPagesController(DivPagerView divPagerView, int i10, float f10, FixedPageSizeProvider fixedPageSizeProvider, DivPagerPaddingsHolder divPagerPaddingsHolder, boolean z10, DivPagerAdapter divPagerAdapter) {
        this.parent = divPagerView;
        this.parentSize = i10;
        this.itemSpacing = f10;
        this.pageSizeProvider = fixedPageSizeProvider;
        this.paddings = divPagerPaddingsHolder;
        this.infiniteScroll = z10;
        this.adapter = divPagerAdapter;
        setOffScreenPages();
    }
}
