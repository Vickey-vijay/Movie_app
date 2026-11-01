package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.viewpool.PseudoViewPool;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTabs;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class TabTitlesLayoutView<ACTION> extends BaseIndicatorTabLayout implements BaseDivTabbedCardUi.AbstractTabBar<ACTION> {

    @Nullable
    private List<? extends BaseDivTabbedCardUi.Input.TabBase<ACTION>> mDataList;

    @NonNull
    private final PseudoViewPool mDefaultViewPool;

    @Nullable
    private BaseDivTabbedCardUi.AbstractTabBar.Host<ACTION> mHost;

    @Nullable
    private OnScrollChangedListener mOnScrollChangedListener;
    private boolean mShouldDispatchScroll;

    @NonNull
    private String mTabHeaderTag;

    @Nullable
    private DivTabs.TabTitleStyle mTabTitleStyle;

    @NonNull
    private ViewPool mViewPool;

    public interface OnScrollChangedListener {
        void onScrolled();
    }

    public static class TabViewFactory implements ViewFactory<TabView> {

        @NonNull
        private final Context mContext;

        @Override // com.yandex.div.internal.viewpool.ViewFactory
        @NonNull
        public TabView createView() {
            return new TabView(this.mContext);
        }

        public TabViewFactory(@NonNull Context context) {
            this.mContext = context;
        }
    }

    public TabTitlesLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setIntermediateState(int i10, float f10) {
    }

    public TabTitlesLayoutView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mShouldDispatchScroll = false;
        setTabMode(0);
        setTabIndicatorHeight(0);
        setOnTabSelectedListener(new BaseIndicatorTabLayout.OnTabSelectedListener() { // from class: com.yandex.div.internal.widget.tabs.TabTitlesLayoutView.1
            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            public void onTabUnselected(BaseIndicatorTabLayout.Tab tab) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            public void onTabReselected(BaseIndicatorTabLayout.Tab tab) {
                if (TabTitlesLayoutView.this.mHost == null) {
                    return;
                }
                int position = tab.getPosition();
                if (TabTitlesLayoutView.this.mDataList != null) {
                    BaseDivTabbedCardUi.Input.TabBase tabBase = (BaseDivTabbedCardUi.Input.TabBase) TabTitlesLayoutView.this.mDataList.get(position);
                    Object actionable = tabBase == null ? null : tabBase.getActionable();
                    if (actionable != null) {
                        TabTitlesLayoutView.this.mHost.onActiveTabClicked(actionable, position);
                    }
                }
            }

            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            public void onTabSelected(BaseIndicatorTabLayout.Tab tab) {
                if (TabTitlesLayoutView.this.mHost == null) {
                    return;
                }
                TabTitlesLayoutView.this.mHost.setCurrentPage(tab.getPosition(), false);
            }
        });
        PseudoViewPool pseudoViewPool = new PseudoViewPool();
        this.mDefaultViewPool = pseudoViewPool;
        pseudoViewPool.register("TabTitlesLayoutView.TAB_HEADER", new TabViewFactory(getContext()), 0);
        this.mViewPool = pseudoViewPool;
        this.mTabHeaderTag = "TabTitlesLayoutView.TAB_HEADER";
    }

    private void observeTabTitleStyle(TabView tabView, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivTabs.TabTitleStyle tabTitleStyle = this.mTabTitleStyle;
        if (tabTitleStyle == null) {
            return;
        }
        DivTabsBinderKt.observeStyle(tabView, tabTitleStyle, expressionResolver, expressionSubscriber);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout
    public TabView createTabView(@NonNull Context context) {
        return (TabView) this.mViewPool.obtain(this.mTabHeaderTag);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setData(@NonNull List<? extends BaseDivTabbedCardUi.Input.TabBase<ACTION>> list, int i10, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber) {
        this.mDataList = list;
        removeAllTabs();
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            i10 = 0;
        }
        int i11 = 0;
        while (i11 < size) {
            BaseIndicatorTabLayout.Tab text = newTab().setText(list.get(i11).getTitle());
            observeTabTitleStyle(text.getTabView(), expressionResolver, expressionSubscriber);
            addTab(text, i11 == i10);
            i11++;
        }
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setHost(@NonNull BaseDivTabbedCardUi.AbstractTabBar.Host<ACTION> host) {
        this.mHost = host;
    }

    public void setOnScrollChangedListener(@Nullable OnScrollChangedListener onScrollChangedListener) {
        this.mOnScrollChangedListener = onScrollChangedListener;
    }

    public void setTabTitleStyle(@Nullable DivTabs.TabTitleStyle tabTitleStyle) {
        this.mTabTitleStyle = tabTitleStyle;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setViewPool(@NonNull ViewPool viewPool, @NonNull String str) {
        this.mViewPool = viewPool;
        this.mTabHeaderTag = str;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.mShouldDispatchScroll = true;
        }
        return zDispatchTouchEvent;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void fixScrollPosition(int i10) {
        selectTab(i10);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    @Nullable
    public ViewPager.OnPageChangeListener getCustomPageChangeListener() {
        BaseIndicatorTabLayout.TabLayoutOnPageChangeListener pageChangeListener = getPageChangeListener();
        pageChangeListener.reset();
        return pageChangeListener;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void manuallyScroll(int i10) {
        selectTab(i10);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        OnScrollChangedListener onScrollChangedListener = this.mOnScrollChangedListener;
        if (onScrollChangedListener != null && this.mShouldDispatchScroll) {
            onScrollChangedListener.onScrolled();
            this.mShouldDispatchScroll = false;
        }
    }

    public void setTabColors(@ColorInt int i10, @ColorInt int i11, @ColorInt int i12, @ColorInt int i13) {
        setTabTextColors(i12, i10);
        setSelectedTabIndicatorColor(i11);
        setTabBackgroundColor(i13);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
        bindTypefaceProvider(divTypefaceProvider);
    }
}
