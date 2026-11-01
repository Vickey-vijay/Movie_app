package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.yandex.div.R$attr;
import com.yandex.div.R$color;
import com.yandex.div.R$dimen;
import com.yandex.div.R$id;
import com.yandex.div.core.view2.divs.tabs.DivTabsAdapter;

/* JADX INFO: compiled from: TabsLayout.kt */
/* JADX INFO: loaded from: classes5.dex */
public class TabsLayout extends LinearLayout {
    private DivTabsAdapter divTabsAdapter;
    private final View divider;
    private final ViewPagerFixedSizeLayout pagerLayout;
    private final TabTitlesLayoutView<?> titleLayout;
    private final ScrollableViewPager viewPager;

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public String getAccessibilityClassName() {
        return "android.widget.TabWidget";
    }

    private LinearLayout.LayoutParams createDividerLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R$dimen.div_separator_delimiter_height));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.div_horizontal_padding);
        layoutParams.leftMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.topMargin = getResources().getDimensionPixelSize(R$dimen.title_tab_title_separator_margin_top);
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(R$dimen.title_tab_title_margin_vertical);
        return layoutParams;
    }

    private LinearLayout.LayoutParams createTitleLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R$dimen.title_tab_title_height));
        layoutParams.gravity = GravityCompat.START;
        return layoutParams;
    }

    public DivTabsAdapter getDivTabsAdapter() {
        return this.divTabsAdapter;
    }

    public View getDivider() {
        return this.divider;
    }

    public ViewPagerFixedSizeLayout getPagerLayout() {
        return this.pagerLayout;
    }

    public TabTitlesLayoutView<?> getTitleLayout() {
        return this.titleLayout;
    }

    public ScrollableViewPager getViewPager() {
        return this.viewPager;
    }

    public void setDivTabsAdapter(DivTabsAdapter divTabsAdapter) {
        this.divTabsAdapter = divTabsAdapter;
    }

    public TabsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setId(R$id.div_tabs_block);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        TabTitlesLayoutView<?> tabTitlesLayoutView = new TabTitlesLayoutView<>(context, null, R$attr.divTabIndicatorLayoutStyle);
        tabTitlesLayoutView.setId(R$id.base_tabbed_title_container_scroller);
        tabTitlesLayoutView.setLayoutParams(createTitleLayoutParams());
        int dimensionPixelSize = tabTitlesLayoutView.getResources().getDimensionPixelSize(R$dimen.title_tab_title_margin_vertical);
        int dimensionPixelSize2 = tabTitlesLayoutView.getResources().getDimensionPixelSize(R$dimen.title_tab_title_margin_horizontal);
        tabTitlesLayoutView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        tabTitlesLayoutView.setClipToPadding(false);
        this.titleLayout = tabTitlesLayoutView;
        View view = new View(context);
        view.setId(R$id.div_tabs_divider);
        view.setLayoutParams(createDividerLayoutParams());
        view.setBackgroundResource(R$color.div_separator_color);
        this.divider = view;
        ScrollableViewPager scrollableViewPager = new ScrollableViewPager(context);
        scrollableViewPager.setId(R$id.div_tabs_pager_container);
        scrollableViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollableViewPager.setOverScrollMode(2);
        ViewCompat.setNestedScrollingEnabled(scrollableViewPager, true);
        this.viewPager = scrollableViewPager;
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = new ViewPagerFixedSizeLayout(context, null, 0, 6, null);
        viewPagerFixedSizeLayout.setId(R$id.div_tabs_container_helper);
        viewPagerFixedSizeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPagerFixedSizeLayout.setCollapsiblePaddingBottom(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        viewPagerFixedSizeLayout.addView(getViewPager());
        viewPagerFixedSizeLayout.addView(frameLayout);
        this.pagerLayout = viewPagerFixedSizeLayout;
        addView(getTitleLayout());
        addView(getDivider());
        addView(getPagerLayout());
    }
}
