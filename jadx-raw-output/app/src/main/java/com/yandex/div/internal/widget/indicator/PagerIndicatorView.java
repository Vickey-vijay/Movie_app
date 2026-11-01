package com.yandex.div.internal.widget.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ck.i;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.widget.indicator.PagerIndicatorView;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimatorKt;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawerKt;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: PagerIndicatorView.kt */
/* JADX INFO: loaded from: classes9.dex */
public class PagerIndicatorView extends View {
    private DivPagerView divPager;
    private final ViewPager2.OnPageChangeCallback onPageChangeListener;
    private IndicatorsStripDrawer stripDrawer;
    private IndicatorParams$Style style;

    public PagerIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PagerIndicatorView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public PagerIndicatorView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.onPageChangeListener = new ViewPager2.OnPageChangeCallback() { // from class: com.yandex.div.internal.widget.indicator.PagerIndicatorView$onPageChangeListener$1
            private final int toRealPosition(int i11) {
                DivPagerAdapter currentAdapter = this.this$0.getCurrentAdapter();
                return currentAdapter == null ? i11 : currentAdapter.realItemPosition(i11);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i11, float f10, int i12) {
                IndicatorsStripDrawer indicatorsStripDrawer = this.this$0.stripDrawer;
                if (indicatorsStripDrawer != null) {
                    PagerIndicatorView pagerIndicatorView = this.this$0;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    } else if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    indicatorsStripDrawer.onPageScrolled(toRealPosition(i11), f10);
                    pagerIndicatorView.invalidate();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i11) {
                IndicatorsStripDrawer indicatorsStripDrawer = this.this$0.stripDrawer;
                if (indicatorsStripDrawer != null) {
                    PagerIndicatorView pagerIndicatorView = this.this$0;
                    indicatorsStripDrawer.onPageSelected(toRealPosition(i11));
                    pagerIndicatorView.invalidate();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachPager$lambda$3(PagerIndicatorView pagerIndicatorView) {
        IndicatorsStripDrawer indicatorsStripDrawer = pagerIndicatorView.stripDrawer;
        if (indicatorsStripDrawer != null) {
            pagerIndicatorView.update(indicatorsStripDrawer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DivPagerAdapter getCurrentAdapter() {
        ViewPager2 viewPager;
        DivPagerView divPagerView = this.divPager;
        RecyclerView.Adapter adapter = (divPagerView == null || (viewPager = divPagerView.getViewPager()) == null) ? null : viewPager.getAdapter();
        if (adapter instanceof DivPagerAdapter) {
            return (DivPagerAdapter) adapter;
        }
        return null;
    }

    public final void attachPager(DivPagerView divPagerView) {
        DivPagerView divPagerView2 = this.divPager;
        if (divPagerView2 != null) {
            divPagerView2.removeChangePageCallbackForIndicators(this.onPageChangeListener);
        }
        divPagerView.addChangePageCallbackForIndicators(this.onPageChangeListener);
        if (divPagerView == this.divPager) {
            return;
        }
        this.divPager = divPagerView;
        if (divPagerView.getViewPager().getAdapter() == null) {
            throw new IllegalArgumentException("Attached pager adapter is null!".toString());
        }
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            update(indicatorsStripDrawer);
        }
        divPagerView.setPagerOnItemsCountChange$div_release(new DivPagerView.OnItemsUpdatedCallback() { // from class: ie.a
            @Override // com.yandex.div.core.view2.divs.widgets.DivPagerView.OnItemsUpdatedCallback
            public final void onItemsUpdated() {
                PagerIndicatorView.attachPager$lambda$3(this.f54122a);
            }
        });
    }

    public final void setStyle(IndicatorParams$Style indicatorParams$Style) {
        this.style = indicatorParams$Style;
        IndicatorsStripDrawer indicatorsStripDrawer = new IndicatorsStripDrawer(indicatorParams$Style, SingleIndicatorDrawerKt.getIndicatorDrawer(indicatorParams$Style), IndicatorAnimatorKt.getIndicatorAnimator(indicatorParams$Style), this);
        indicatorsStripDrawer.calculateMaximumVisibleItems((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        update(indicatorsStripDrawer);
        this.stripDrawer = indicatorsStripDrawer;
        requestLayout();
    }

    private final void update(IndicatorsStripDrawer indicatorsStripDrawer) {
        DivPagerAdapter currentAdapter = getCurrentAdapter();
        if (currentAdapter != null) {
            indicatorsStripDrawer.setItemsCount(currentAdapter.getVisibleItems().size());
            indicatorsStripDrawer.onPageSelected(currentAdapter.realItemPosition(currentAdapter.getCurrentItem()));
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            indicatorsStripDrawer.onDraw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        float height;
        float height2;
        float height3;
        IndicatorParams$ItemPlacement itemsPlacement;
        int paddingLeft;
        int paddingRight;
        int i12;
        IndicatorsStripDrawer indicatorsStripDrawer;
        int itemCount;
        ViewPager2 viewPager;
        RecyclerView.Adapter adapter;
        IndicatorParams$Shape activeShape;
        IndicatorParams$ItemSize itemSize;
        IndicatorParams$Shape minimumShape;
        IndicatorParams$ItemSize itemSize2;
        IndicatorParams$Shape inactiveShape;
        IndicatorParams$ItemSize itemSize3;
        IndicatorParams$Shape activeShape2;
        IndicatorParams$ItemSize itemSize4;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        IndicatorParams$Style indicatorParams$Style = this.style;
        float width = 0.0f;
        if (indicatorParams$Style != null && (activeShape2 = indicatorParams$Style.getActiveShape()) != null && (itemSize4 = activeShape2.getItemSize()) != null) {
            height = itemSize4.getHeight();
        } else {
            height = 0.0f;
        }
        IndicatorParams$Style indicatorParams$Style2 = this.style;
        if (indicatorParams$Style2 != null && (inactiveShape = indicatorParams$Style2.getInactiveShape()) != null && (itemSize3 = inactiveShape.getItemSize()) != null) {
            height2 = itemSize3.getHeight();
        } else {
            height2 = 0.0f;
        }
        IndicatorParams$Style indicatorParams$Style3 = this.style;
        if (indicatorParams$Style3 != null && (minimumShape = indicatorParams$Style3.getMinimumShape()) != null && (itemSize2 = minimumShape.getItemSize()) != null) {
            height3 = itemSize2.getHeight();
        } else {
            height3 = 0.0f;
        }
        int iMax = (int) (Math.max(height, Math.max(height2, height3)) + getPaddingTop() + getPaddingBottom());
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = iMax;
            }
        } else {
            size = Math.min(iMax, size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        IndicatorParams$Style indicatorParams$Style4 = this.style;
        if (indicatorParams$Style4 != null && (activeShape = indicatorParams$Style4.getActiveShape()) != null && (itemSize = activeShape.getItemSize()) != null) {
            width = itemSize.getWidth();
        }
        IndicatorParams$Style indicatorParams$Style5 = this.style;
        if (indicatorParams$Style5 != null) {
            itemsPlacement = indicatorParams$Style5.getItemsPlacement();
        } else {
            itemsPlacement = null;
        }
        if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Default) {
            float spaceBetweenCenters = ((IndicatorParams$ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters();
            DivPagerView divPagerView = this.divPager;
            if (divPagerView != null && (viewPager = divPagerView.getViewPager()) != null && (adapter = viewPager.getAdapter()) != null) {
                itemCount = adapter.getItemCount();
            } else {
                itemCount = 0;
            }
            paddingLeft = ((int) ((spaceBetweenCenters * itemCount) + width)) + getPaddingLeft();
            paddingRight = getPaddingRight();
        } else {
            if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Stretch) {
                i12 = size2;
            } else if (itemsPlacement == null) {
                paddingLeft = ((int) width) + getPaddingLeft();
                paddingRight = getPaddingRight();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 1073741824) {
                    size2 = i12;
                }
            } else {
                size2 = Math.min(i12, size2);
            }
            setMeasuredDimension(size2, size);
            indicatorsStripDrawer = this.stripDrawer;
            if (indicatorsStripDrawer != null) {
                indicatorsStripDrawer.calculateMaximumVisibleItems((size2 - getPaddingLeft()) - getPaddingRight(), (size - getPaddingTop()) - getPaddingBottom());
            }
        }
        i12 = paddingLeft + paddingRight;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = i12;
            }
        } else {
            size2 = Math.min(i12, size2);
        }
        setMeasuredDimension(size2, size);
        indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            indicatorsStripDrawer.calculateMaximumVisibleItems((size2 - getPaddingLeft()) - getPaddingRight(), (size - getPaddingTop()) - getPaddingBottom());
        }
    }
}
