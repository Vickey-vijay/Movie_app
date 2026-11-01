package com.yandex.div.core.view2.divs.tabs;

import androidx.viewpager.widget.ViewPager;
import ck.i;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;

/* JADX INFO: compiled from: DivTabsEventManager.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivTabsEventManager implements ViewPager.OnPageChangeListener, BaseDivTabbedCardUi.ActiveTabClickListener<DivAction> {
    private static final Companion Companion = new Companion(null);
    private final DivActionBinder actionBinder;
    private final BindingContext context;
    private int currentPagePosition = -1;
    private DivTabs div;
    private final Div2Logger div2Logger;
    private final DivTabsLayout tabLayout;
    private final DivVisibilityActionTracker visibilityActionTracker;

    /* JADX INFO: compiled from: DivTabsEventManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.ActiveTabClickListener
    public void onActiveTabClicked(DivAction divAction, int i10) {
        if (divAction.f46034e != null) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivTabsEventManager", "non-null menuItems ignored in title click action");
            }
        }
        this.div2Logger.logActiveTabTitleClick(this.context.getDivView(), this.context.getExpressionResolver(), i10, divAction);
        DivActionBinder.handleAction$div_release$default(this.actionBinder, this.context.getDivView(), this.context.getExpressionResolver(), divAction, "click", null, null, 48, null);
    }

    public final void onPageDisplayed(int i10) {
        int i11 = this.currentPagePosition;
        if (i10 == i11) {
            return;
        }
        if (i11 != -1) {
            this.visibilityActionTracker.cancelTrackingViewsHierarchy(this.context, this.tabLayout, this.div.f49264q.get(i11).f49276a);
            this.context.getDivView().unbindViewFromDiv$div_release(this.tabLayout);
        }
        DivTabs.Item item = this.div.f49264q.get(i10);
        this.visibilityActionTracker.startTrackingViewsHierarchy(this.context, this.tabLayout, item.f49276a);
        this.context.getDivView().bindViewToDiv$div_release(this.tabLayout, item.f49276a);
        this.currentPagePosition = i10;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
        this.div2Logger.logTabPageChanged(this.context.getDivView(), i10);
        onPageDisplayed(i10);
    }

    public final void setDiv(DivTabs divTabs) {
        this.div = divTabs;
    }

    public DivTabsEventManager(BindingContext bindingContext, DivActionBinder divActionBinder, Div2Logger div2Logger, DivVisibilityActionTracker divVisibilityActionTracker, DivTabsLayout divTabsLayout, DivTabs divTabs) {
        this.context = bindingContext;
        this.actionBinder = divActionBinder;
        this.div2Logger = div2Logger;
        this.visibilityActionTracker = divVisibilityActionTracker;
        this.tabLayout = divTabsLayout;
        this.div = divTabs;
    }
}
