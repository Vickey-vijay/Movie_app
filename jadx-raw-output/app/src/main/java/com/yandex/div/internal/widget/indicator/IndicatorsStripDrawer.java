package com.yandex.div.internal.widget.indicator;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer;
import ik.e;
import ik.g;
import ik.j;
import ik.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import nj.b0;
import nj.g0;
import nj.s;
import nj.t;
import nj.x;

/* JADX INFO: compiled from: IndicatorsStripDrawer.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class IndicatorsStripDrawer {
    private final IndicatorAnimator animator;
    private float baseYOffset;
    private int itemsCount;
    private int maxVisibleCount;
    private float selectedItemFraction;
    private int selectedItemPosition;
    private final SingleIndicatorDrawer singleIndicatorDrawer;
    private float spaceBetweenCenters;
    private final IndicatorParams$Style styleParams;
    private final View view;
    private int viewportHeight;
    private int viewportWidth;
    private final IndicatorsRibbon ribbon = new IndicatorsRibbon();
    private float itemWidthMultiplier = 1.0f;

    /* JADX INFO: compiled from: IndicatorsStripDrawer.kt */
    public static final class Indicator {
        private final boolean active;
        private final float centerOffset;
        private final IndicatorParams$ItemSize itemSize;
        private final int position;
        private final float scaleFactor;

        public Indicator(int i10, boolean z10, float f10, IndicatorParams$ItemSize indicatorParams$ItemSize, float f11) {
            this.position = i10;
            this.active = z10;
            this.centerOffset = f10;
            this.itemSize = indicatorParams$ItemSize;
            this.scaleFactor = f11;
        }

        public static /* synthetic */ Indicator copy$default(Indicator indicator, int i10, boolean z10, float f10, IndicatorParams$ItemSize indicatorParams$ItemSize, float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = indicator.position;
            }
            if ((i11 & 2) != 0) {
                z10 = indicator.active;
            }
            boolean z11 = z10;
            if ((i11 & 4) != 0) {
                f10 = indicator.centerOffset;
            }
            float f12 = f10;
            if ((i11 & 8) != 0) {
                indicatorParams$ItemSize = indicator.itemSize;
            }
            IndicatorParams$ItemSize indicatorParams$ItemSize2 = indicatorParams$ItemSize;
            if ((i11 & 16) != 0) {
                f11 = indicator.scaleFactor;
            }
            return indicator.copy(i10, z11, f12, indicatorParams$ItemSize2, f11);
        }

        public final Indicator copy(int i10, boolean z10, float f10, IndicatorParams$ItemSize indicatorParams$ItemSize, float f11) {
            return new Indicator(i10, z10, f10, indicatorParams$ItemSize, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Indicator)) {
                return false;
            }
            Indicator indicator = (Indicator) obj;
            return this.position == indicator.position && this.active == indicator.active && Float.compare(this.centerOffset, indicator.centerOffset) == 0 && p.e(this.itemSize, indicator.itemSize) && Float.compare(this.scaleFactor, indicator.scaleFactor) == 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.position) * 31;
            boolean z10 = this.active;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return ((((((iHashCode + r10) * 31) + Float.hashCode(this.centerOffset)) * 31) + this.itemSize.hashCode()) * 31) + Float.hashCode(this.scaleFactor);
        }

        public String toString() {
            return "Indicator(position=" + this.position + ", active=" + this.active + ", centerOffset=" + this.centerOffset + ", itemSize=" + this.itemSize + ", scaleFactor=" + this.scaleFactor + ')';
        }

        public final boolean getActive() {
            return this.active;
        }

        public final float getCenterOffset() {
            return this.centerOffset;
        }

        public final IndicatorParams$ItemSize getItemSize() {
            return this.itemSize;
        }

        public final float getLeft() {
            return this.centerOffset - (this.itemSize.getWidth() / 2.0f);
        }

        public final int getPosition() {
            return this.position;
        }

        public final float getRight() {
            return this.centerOffset + (this.itemSize.getWidth() / 2.0f);
        }

        public final float getScaleFactor() {
            return this.scaleFactor;
        }

        public /* synthetic */ Indicator(int i10, boolean z10, float f10, IndicatorParams$ItemSize indicatorParams$ItemSize, float f11, int i11, i iVar) {
            this(i10, z10, f10, indicatorParams$ItemSize, (i11 & 16) != 0 ? 1.0f : f11);
        }
    }

    /* JADX INFO: compiled from: IndicatorsStripDrawer.kt */
    public final class IndicatorsRibbon {
        private final List<Indicator> allItems = new ArrayList();
        private final List<Indicator> visibleItems = new ArrayList();

        public IndicatorsRibbon() {
        }

        private final float calcOffsetShiftFor(int i10, float f10) {
            float centerOffset;
            if (this.allItems.size() <= IndicatorsStripDrawer.this.maxVisibleCount) {
                return (IndicatorsStripDrawer.this.viewportWidth / 2.0f) - (((Indicator) b0.r0(this.allItems)).getRight() / 2);
            }
            float f11 = IndicatorsStripDrawer.this.viewportWidth / 2.0f;
            float centerOffset2 = 0.0f;
            if (ViewsKt.isLayoutRtl(IndicatorsStripDrawer.this.view)) {
                if (i10 != -1) {
                    List<Indicator> list = this.allItems;
                    centerOffset2 = list.get((list.size() - 1) - i10).getCenterOffset();
                }
                centerOffset = (f11 - centerOffset2) + (IndicatorsStripDrawer.this.spaceBetweenCenters * f10);
            } else {
                centerOffset = (f11 - (i10 != -1 ? this.allItems.get(i10).getCenterOffset() : 0.0f)) - (IndicatorsStripDrawer.this.spaceBetweenCenters * f10);
            }
            return IndicatorsStripDrawer.this.maxVisibleCount % 2 == 0 ? centerOffset + (IndicatorsStripDrawer.this.spaceBetweenCenters / 2) : centerOffset;
        }

        private final float calcScaleFraction(float f10) {
            float f11 = IndicatorsStripDrawer.this.spaceBetweenCenters + 0.0f;
            if (f10 > f11) {
                f10 = k.f(IndicatorsStripDrawer.this.viewportWidth - f10, f11);
            }
            if (f10 > f11) {
                return 1.0f;
            }
            return k.j(f10 / (f11 - 0.0f), 0.0f, 1.0f);
        }

        private final void downscaleAndDisperse(List<Indicator> list) {
            int iNextIndex;
            Indicator indicator;
            IndicatorsStripDrawer indicatorsStripDrawer = IndicatorsStripDrawer.this;
            int i10 = 0;
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    s.u();
                }
                Indicator indicator2 = (Indicator) obj;
                float fCalcScaleFraction = calcScaleFraction(indicator2.getCenterOffset());
                list.set(i11, (indicator2.getPosition() == 0 || indicator2.getPosition() == indicatorsStripDrawer.itemsCount - 1 || indicator2.getActive()) ? Indicator.copy$default(indicator2, 0, false, 0.0f, null, fCalcScaleFraction, 15, null) : scaleItem(indicator2, fCalcScaleFraction));
                i11 = i12;
            }
            Iterator<Indicator> it = list.iterator();
            int i13 = 0;
            while (true) {
                iNextIndex = -1;
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (it.next().getScaleFactor() == 1.0f) {
                    break;
                } else {
                    i13++;
                }
            }
            Integer numValueOf = Integer.valueOf(i13);
            if (!(numValueOf.intValue() >= 0)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                ListIterator<Indicator> listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().getScaleFactor() == 1.0f) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                Integer numValueOf2 = Integer.valueOf(iNextIndex);
                Integer num = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
                if (num != null) {
                    int i14 = iIntValue - 1;
                    int iIntValue2 = num.intValue() + 1;
                    IndicatorsStripDrawer indicatorsStripDrawer2 = IndicatorsStripDrawer.this;
                    for (Object obj2 : list) {
                        int i15 = i10 + 1;
                        if (i10 < 0) {
                            s.u();
                        }
                        Indicator indicator3 = (Indicator) obj2;
                        if (i10 < i14) {
                            Indicator indicator4 = (Indicator) b0.i0(list, i14);
                            if (indicator4 != null) {
                                list.set(i10, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() - (indicatorsStripDrawer2.spaceBetweenCenters * (1.0f - indicator4.getScaleFactor())), null, 0.0f, 27, null));
                                if (i10 <= iIntValue2) {
                                }
                            }
                        } else if (i10 <= iIntValue2 && (indicator = (Indicator) b0.i0(list, iIntValue2)) != null) {
                            list.set(i10, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() + (indicatorsStripDrawer2.spaceBetweenCenters * (1.0f - indicator.getScaleFactor())), null, 0.0f, 27, null));
                        }
                        i10 = i15;
                    }
                }
            }
        }

        public final List<Indicator> getVisibleItems() {
            return this.visibleItems;
        }

        public final void relayout(int i10, float f10) {
            this.allItems.clear();
            this.visibleItems.clear();
            if (IndicatorsStripDrawer.this.itemsCount <= 0) {
                return;
            }
            g indices = ViewsKt.getIndices(IndicatorsStripDrawer.this.view, 0, IndicatorsStripDrawer.this.itemsCount);
            int iE = indices.e();
            IndicatorsStripDrawer indicatorsStripDrawer = IndicatorsStripDrawer.this;
            Iterator<Integer> it = indices.iterator();
            while (it.hasNext()) {
                int iNextInt = ((g0) it).nextInt();
                IndicatorParams$ItemSize itemSizeAt = indicatorsStripDrawer.getItemSizeAt(iNextInt);
                this.allItems.add(new Indicator(iNextInt, iNextInt == i10, iNextInt == iE ? itemSizeAt.getWidth() / 2.0f : ((Indicator) b0.r0(this.allItems)).getCenterOffset() + indicatorsStripDrawer.spaceBetweenCenters, itemSizeAt, 0.0f, 16, null));
            }
            this.visibleItems.addAll(relayoutVisibleItems(i10, f10));
        }

        private final List<Indicator> relayoutVisibleItems(int i10, float f10) {
            float fCalcOffsetShiftFor = calcOffsetShiftFor(i10, f10);
            List<Indicator> list = this.allItems;
            ArrayList arrayList = new ArrayList(t.v(list, 10));
            for (Indicator indicator : list) {
                arrayList.add(Indicator.copy$default(indicator, 0, false, indicator.getCenterOffset() + fCalcOffsetShiftFor, null, 0.0f, 27, null));
            }
            List<Indicator> listR0 = b0.R0(arrayList);
            if (listR0.size() <= IndicatorsStripDrawer.this.maxVisibleCount) {
                return listR0;
            }
            final e<Float> eVarB = j.b(0.0f, IndicatorsStripDrawer.this.viewportWidth);
            int i11 = 0;
            if (eVarB.contains(Float.valueOf(((Indicator) b0.f0(listR0)).getLeft()))) {
                float f11 = -((Indicator) b0.f0(listR0)).getLeft();
                for (Object obj : listR0) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        s.u();
                    }
                    Indicator indicator2 = (Indicator) obj;
                    listR0.set(i11, Indicator.copy$default(indicator2, 0, false, indicator2.getCenterOffset() + f11, null, 0.0f, 27, null));
                    i11 = i12;
                }
            } else if (eVarB.contains(Float.valueOf(((Indicator) b0.r0(listR0)).getRight()))) {
                float right = IndicatorsStripDrawer.this.viewportWidth - ((Indicator) b0.r0(listR0)).getRight();
                for (Object obj2 : listR0) {
                    int i13 = i11 + 1;
                    if (i11 < 0) {
                        s.u();
                    }
                    Indicator indicator3 = (Indicator) obj2;
                    listR0.set(i11, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() + right, null, 0.0f, 27, null));
                    i11 = i13;
                }
            }
            x.I(listR0, new l<Indicator, Boolean>() { // from class: com.yandex.div.internal.widget.indicator.IndicatorsStripDrawer$IndicatorsRibbon$relayoutVisibleItems$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public final Boolean invoke(IndicatorsStripDrawer.Indicator indicator4) {
                    return Boolean.valueOf(!eVarB.contains(Float.valueOf(indicator4.getCenterOffset())));
                }
            });
            downscaleAndDisperse(listR0);
            return listR0;
        }

        private final Indicator scaleItem(Indicator indicator, float f10) {
            IndicatorParams$ItemSize itemSize = indicator.getItemSize();
            float width = itemSize.getWidth() * f10;
            if (width <= IndicatorsStripDrawer.this.styleParams.getMinimumShape().getItemSize().getWidth()) {
                return Indicator.copy$default(indicator, 0, false, 0.0f, IndicatorsStripDrawer.this.styleParams.getMinimumShape().getItemSize(), f10, 7, null);
            }
            if (width < itemSize.getWidth()) {
                if (itemSize instanceof IndicatorParams$ItemSize.RoundedRect) {
                    IndicatorParams$ItemSize.RoundedRect roundedRect = (IndicatorParams$ItemSize.RoundedRect) itemSize;
                    return Indicator.copy$default(indicator, 0, false, 0.0f, IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect, width, (width / roundedRect.getItemWidth()) * roundedRect.getItemHeight(), 0.0f, 4, null), f10, 7, null);
                }
                if (itemSize instanceof IndicatorParams$ItemSize.Circle) {
                    return Indicator.copy$default(indicator, 0, false, 0.0f, ((IndicatorParams$ItemSize.Circle) itemSize).copy((itemSize.getWidth() * f10) / 2.0f), f10, 7, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return indicator;
        }
    }

    public final void calculateMaximumVisibleItems(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.viewportWidth = i10;
        this.viewportHeight = i11;
        calculateMaximumVisibleItems();
        adjustItemsPlacement();
        this.baseYOffset = i11 / 2.0f;
        adjustVisibleItems(this.selectedItemPosition, this.selectedItemFraction);
    }

    private final void adjustItemsPlacement() {
        IndicatorParams$ItemPlacement itemsPlacement = this.styleParams.getItemsPlacement();
        if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Default) {
            this.spaceBetweenCenters = ((IndicatorParams$ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters();
            this.itemWidthMultiplier = 1.0f;
        } else if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Stretch) {
            IndicatorParams$ItemPlacement.Stretch stretch = (IndicatorParams$ItemPlacement.Stretch) itemsPlacement;
            float itemSpacing = (this.viewportWidth + stretch.getItemSpacing()) / this.maxVisibleCount;
            this.spaceBetweenCenters = itemSpacing;
            this.itemWidthMultiplier = (itemSpacing - stretch.getItemSpacing()) / this.styleParams.getActiveShape().getItemSize().getWidth();
        }
        this.animator.updateSpaceBetweenCenters(this.spaceBetweenCenters);
    }

    private final void adjustVisibleItems(int i10, float f10) {
        this.ribbon.relayout(i10, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndicatorParams$ItemSize getItemSizeAt(int i10) {
        IndicatorParams$ItemSize itemSizeAt = this.animator.getItemSizeAt(i10);
        if ((this.itemWidthMultiplier == 1.0f) || !(itemSizeAt instanceof IndicatorParams$ItemSize.RoundedRect)) {
            return itemSizeAt;
        }
        IndicatorParams$ItemSize.RoundedRect roundedRect = (IndicatorParams$ItemSize.RoundedRect) itemSizeAt;
        IndicatorParams$ItemSize.RoundedRect roundedRectCopy$default = IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect, roundedRect.getItemWidth() * this.itemWidthMultiplier, 0.0f, 0.0f, 6, null);
        this.animator.overrideItemWidth(roundedRectCopy$default.getItemWidth());
        return roundedRectCopy$default;
    }

    public final void onDraw(Canvas canvas) {
        Object next;
        RectF selectedItemRect;
        for (Indicator indicator : this.ribbon.getVisibleItems()) {
            this.singleIndicatorDrawer.draw(canvas, indicator.getCenterOffset(), this.baseYOffset, indicator.getItemSize(), this.animator.getColorAt(indicator.getPosition()), this.animator.getBorderWidthAt(indicator.getPosition()), this.animator.getBorderColorAt(indicator.getPosition()));
        }
        Iterator<T> it = this.ribbon.getVisibleItems().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Indicator) next).getActive());
        Indicator indicator2 = (Indicator) next;
        if (indicator2 == null || (selectedItemRect = this.animator.getSelectedItemRect(indicator2.getCenterOffset(), this.baseYOffset, this.viewportWidth, ViewsKt.isLayoutRtl(this.view))) == null) {
            return;
        }
        this.singleIndicatorDrawer.drawSelected(canvas, selectedItemRect);
    }

    public final void onPageScrolled(int i10, float f10) {
        this.selectedItemPosition = i10;
        this.selectedItemFraction = f10;
        this.animator.onPageScrolled(i10, f10);
        adjustVisibleItems(i10, f10);
    }

    public final void onPageSelected(int i10) {
        this.selectedItemPosition = i10;
        this.selectedItemFraction = 0.0f;
        this.animator.onPageSelected(i10);
        adjustVisibleItems(i10, 0.0f);
    }

    public final void setItemsCount(int i10) {
        this.itemsCount = i10;
        this.animator.setItemsCount(i10);
        calculateMaximumVisibleItems();
        this.baseYOffset = this.viewportHeight / 2.0f;
    }

    public IndicatorsStripDrawer(IndicatorParams$Style indicatorParams$Style, SingleIndicatorDrawer singleIndicatorDrawer, IndicatorAnimator indicatorAnimator, View view) {
        this.styleParams = indicatorParams$Style;
        this.singleIndicatorDrawer = singleIndicatorDrawer;
        this.animator = indicatorAnimator;
        this.view = view;
        this.baseYOffset = indicatorParams$Style.getInactiveShape().getItemSize().getWidth();
    }

    private final void calculateMaximumVisibleItems() {
        int maxVisibleItems;
        IndicatorParams$ItemPlacement itemsPlacement = this.styleParams.getItemsPlacement();
        if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Default) {
            maxVisibleItems = (int) (this.viewportWidth / ((IndicatorParams$ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters());
        } else {
            if (!(itemsPlacement instanceof IndicatorParams$ItemPlacement.Stretch)) {
                throw new NoWhenBranchMatchedException();
            }
            maxVisibleItems = ((IndicatorParams$ItemPlacement.Stretch) itemsPlacement).getMaxVisibleItems();
        }
        this.maxVisibleCount = k.g(maxVisibleItems, this.itemsCount);
    }
}
