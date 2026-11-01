package com.yandex.div.core.view2.divs.pager;

import androidx.viewpager2.widget.ViewPager2;
import bk.a;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivAction;
import java.util.List;
import mj.r;
import nj.i;

/* JADX INFO: compiled from: PagerSelectedActionsDispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class PagerSelectedActionsDispatcher {
    private final DivActionBinder divActionBinder;
    private final Div2View divView;
    private final List<DivItemBuilderResult> items;
    private ViewPager2.OnPageChangeCallback pageSelectionTracker;

    /* JADX INFO: compiled from: PagerSelectedActionsDispatcher.kt */
    public final class PageSelectionTracker extends ViewPager2.OnPageChangeCallback {
        private int currentPage = -1;
        private final i<Integer> selectedPages = new i<>();

        public PageSelectionTracker() {
        }

        private final void trackSelectedPages() {
            while (!this.selectedPages.isEmpty()) {
                int iIntValue = this.selectedPages.removeFirst().intValue();
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.DEBUG)) {
                    kLog.print(3, "Ya:PagerSelectedActionsTracker", "dispatch selected actions for page " + iIntValue);
                }
                PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher = PagerSelectedActionsDispatcher.this;
                pagerSelectedActionsDispatcher.dispatchSelectedActions((DivItemBuilderResult) pagerSelectedActionsDispatcher.items.get(iIntValue));
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            if (i10 == 0) {
                trackSelectedPages();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.DEBUG)) {
                kLog.print(3, "Ya:PagerSelectedActionsTracker", "onPageSelected(" + i10 + ')');
            }
            if (this.currentPage == i10) {
                return;
            }
            if (i10 != -1) {
                this.selectedPages.add(Integer.valueOf(i10));
            }
            if (this.currentPage == -1) {
                trackSelectedPages();
            }
            this.currentPage = i10;
        }
    }

    public final void attach(ViewPager2 viewPager2) {
        PageSelectionTracker pageSelectionTracker = new PageSelectionTracker();
        viewPager2.registerOnPageChangeCallback(pageSelectionTracker);
        this.pageSelectionTracker = pageSelectionTracker;
    }

    public final void detach(ViewPager2 viewPager2) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.pageSelectionTracker;
        if (onPageChangeCallback != null) {
            viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
        }
        this.pageSelectionTracker = null;
    }

    public PagerSelectedActionsDispatcher(Div2View div2View, List<DivItemBuilderResult> list, DivActionBinder divActionBinder) {
        this.divView = div2View;
        this.items = list;
        this.divActionBinder = divActionBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchSelectedActions(final DivItemBuilderResult divItemBuilderResult) {
        final List<DivAction> listS = divItemBuilderResult.getDiv().b().s();
        if (listS != null) {
            this.divView.bulkActions$div_release(new a<r>() { // from class: com.yandex.div.core.view2.divs.pager.PagerSelectedActionsDispatcher$dispatchSelectedActions$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DivActionBinder.handleActions$div_release$default(this.this$0.divActionBinder, this.this$0.divView, divItemBuilderResult.getExpressionResolver(), listS, "selection", null, 16, null);
                }
            });
        }
    }
}
