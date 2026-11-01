package com.yandex.div.core.view2.items;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import ck.i;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivSizeUnit;

/* JADX INFO: compiled from: DivViewWithItems.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivViewWithItems {
    public static final Companion Companion = new Companion(null);
    private static DivViewWithItems viewForTests;
    private final int scrollOffset;
    private final int scrollRange;

    /* JADX INFO: compiled from: DivViewWithItems.kt */
    public static final class Gallery extends DivViewWithItems {
        private final Direction direction;
        private final DisplayMetrics metrics;
        private final DivRecyclerView view;

        public Gallery(DivRecyclerView divRecyclerView, Direction direction) {
            super(null);
            this.view = divRecyclerView;
            this.direction = direction;
            this.metrics = divRecyclerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return DivViewWithItemsKt.currentItem(this.view, this.direction);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            return DivViewWithItemsKt.getItemCount(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollOffset() {
            return DivViewWithItemsKt.scrollOffset(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollRange() {
            return DivViewWithItemsKt.scrollRange(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollTo(int i10, DivSizeUnit divSizeUnit, boolean z10) {
            DivViewWithItemsKt.scrollTo(this.view, i10, divSizeUnit, getMetrics(), z10);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z10) {
            DivViewWithItemsKt.scrollToTheEnd(this.view, getMetrics(), z10);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                final Context context = this.view.getContext();
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(context) { // from class: com.yandex.div.core.view2.items.DivViewWithItems$Gallery$currentItem$1$smoothScroller$1
                    private final float MILLISECONDS_PER_INCH = 50.0f;

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    public int getHorizontalSnapPreference() {
                        return -1;
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    public int getVerticalSnapPreference() {
                        return -1;
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                        return this.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
                    }
                };
                linearSmoothScroller.setTargetPosition(i10);
                RecyclerView.LayoutManager layoutManager = this.view.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll(linearSmoothScroller);
                    return;
                }
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                this.view.scrollToPosition(i10);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    /* JADX INFO: compiled from: DivViewWithItems.kt */
    public static final class Pager extends DivViewWithItems {
        private final DisplayMetrics metrics;
        private final DivPagerView view;

        public Pager(DivPagerView divPagerView) {
            super(null);
            this.view = divPagerView;
            this.metrics = divPagerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return this.view.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            RecyclerView.Adapter adapter = this.view.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z10) {
            this.view.getViewPager().setCurrentItem(getItemCount() - 1, z10);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                this.view.getViewPager().setCurrentItem(i10, true);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                this.view.getViewPager().setCurrentItem(i10, false);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    /* JADX INFO: compiled from: DivViewWithItems.kt */
    public static final class PagingGallery extends DivViewWithItems {
        private final Direction direction;
        private final DisplayMetrics metrics;
        private final DivRecyclerView view;

        public PagingGallery(DivRecyclerView divRecyclerView, Direction direction) {
            super(null);
            this.view = divRecyclerView;
            this.direction = direction;
            this.metrics = divRecyclerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return DivViewWithItemsKt.currentItem(this.view, this.direction);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            return DivViewWithItemsKt.getItemCount(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollOffset() {
            return DivViewWithItemsKt.scrollOffset(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollRange() {
            return DivViewWithItemsKt.scrollRange(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollTo(int i10, DivSizeUnit divSizeUnit, boolean z10) {
            DivViewWithItemsKt.scrollTo(this.view, i10, divSizeUnit, getMetrics(), z10);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z10) {
            DivViewWithItemsKt.scrollToTheEnd(this.view, getMetrics(), z10);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                this.view.smoothScrollToPosition(i10);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                this.view.scrollToPosition(i10);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    /* JADX INFO: compiled from: DivViewWithItems.kt */
    public static final class Tabs extends DivViewWithItems {
        private final DisplayMetrics metrics;
        private final DivTabsLayout view;

        public Tabs(DivTabsLayout divTabsLayout) {
            super(null);
            this.view = divTabsLayout;
            this.metrics = divTabsLayout.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return this.view.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            PagerAdapter adapter = this.view.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getCount();
            }
            return 0;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z10) {
            this.view.getViewPager().setCurrentItem(getItemCount() - 1, z10);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                this.view.getViewPager().setCurrentItem(i10, true);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                this.view.getViewPager().setCurrentItem(i10, false);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    private DivViewWithItems() {
    }

    public /* synthetic */ DivViewWithItems(i iVar) {
        this();
    }

    public abstract int getCurrentItem();

    public abstract int getItemCount();

    public abstract DisplayMetrics getMetrics();

    public void scrollTo(int i10, DivSizeUnit divSizeUnit, boolean z10) {
    }

    public abstract void scrollToTheEnd(boolean z10);

    public abstract void setCurrentItem(int i10);

    public abstract void setCurrentItemNoAnimation(int i10);

    /* JADX INFO: compiled from: DivViewWithItems.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: DivViewWithItems.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DivGallery.ScrollMode.values().length];
                try {
                    iArr[DivGallery.ScrollMode.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DivGallery.ScrollMode.PAGING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final DivViewWithItems getViewForTests$div_release() {
            return DivViewWithItems.viewForTests;
        }
    }

    public static /* synthetic */ void scrollTo$default(DivViewWithItems divViewWithItems, int i10, DivSizeUnit divSizeUnit, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollTo");
        }
        if ((i11 & 2) != 0) {
            divSizeUnit = DivSizeUnit.PX;
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        divViewWithItems.scrollTo(i10, divSizeUnit, z10);
    }

    public int getScrollOffset() {
        return this.scrollOffset;
    }

    public int getScrollRange() {
        return this.scrollRange;
    }
}
