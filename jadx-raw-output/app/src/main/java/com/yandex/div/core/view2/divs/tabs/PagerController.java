package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.internal.widget.tabs.ScrollableViewPager;

/* JADX INFO: compiled from: DivTabsAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class PagerController {
    private final ScrollableViewPager scrollableViewPager;

    public final int getCurrentItemIndex() {
        return this.scrollableViewPager.getCurrentItem();
    }

    public final void smoothScrollTo(int i10) {
        this.scrollableViewPager.setCurrentItem(i10, true);
    }

    public PagerController(ScrollableViewPager scrollableViewPager) {
        this.scrollableViewPager = scrollableViewPager;
    }
}
