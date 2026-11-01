package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.util.ViewsKt;
import java.util.HashMap;

/* JADX INFO: compiled from: RtlViewPager.kt */
/* JADX INFO: loaded from: classes5.dex */
public class RtlViewPager extends ViewPager {
    private final HashMap<ViewPager.OnPageChangeListener, ReversingOnPageChangeListener> pageChangeListeners;

    /* JADX INFO: compiled from: RtlViewPager.kt */
    public final class ReversingOnPageChangeListener implements ViewPager.OnPageChangeListener {
        private final ViewPager.OnPageChangeListener listener;

        public ReversingOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
            this.listener = onPageChangeListener;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            this.listener.onPageScrollStateChanged(i10);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(RtlViewPager.this) && adapter != null) {
                int count = adapter.getCount();
                int width = ((int) (RtlViewPager.this.getWidth() * (1 - adapter.getPageWidth(i10)))) + i11;
                while (i10 < count && width > 0) {
                    i10++;
                    width -= (int) (RtlViewPager.this.getWidth() * adapter.getPageWidth(i10));
                }
                i10 = (count - i10) - 1;
                i11 = -width;
                f10 = i11 / (RtlViewPager.this.getWidth() * adapter.getPageWidth(i10));
            }
            this.listener.onPageScrolled(i10, f10, i11);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(RtlViewPager.this) && adapter != null) {
                i10 = (adapter.getCount() - i10) - 1;
            }
            this.listener.onPageSelected(i10);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10, boolean z10) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            i10 = (adapter.getCount() - i10) - 1;
        }
        super.setCurrentItem(i10, z10);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        ReversingOnPageChangeListener reversingOnPageChangeListener = new ReversingOnPageChangeListener(onPageChangeListener);
        this.pageChangeListeners.put(onPageChangeListener, reversingOnPageChangeListener);
        super.addOnPageChangeListener(reversingOnPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        ReversingOnPageChangeListener reversingOnPageChangeListenerRemove = this.pageChangeListeners.remove(onPageChangeListener);
        if (reversingOnPageChangeListenerRemove != null) {
            super.removeOnPageChangeListener(reversingOnPageChangeListenerRemove);
        }
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pageChangeListeners = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.pageChangeListeners.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            return (adapter.getCount() - currentItem) - 1;
        }
        return currentItem;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            i10 = (adapter.getCount() - i10) - 1;
        }
        super.setCurrentItem(i10);
    }
}
