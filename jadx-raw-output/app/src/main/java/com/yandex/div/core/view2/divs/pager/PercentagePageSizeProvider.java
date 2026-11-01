package com.yandex.div.core.view2.divs.pager;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivPageSize;
import com.yandex.div2.DivPager;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: PercentagePageSizeProvider.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class PercentagePageSizeProvider extends DivPagerPageSizeProvider implements FixedPageSizeProvider {
    private final boolean hasOffScreenPages;
    private final float itemSize;
    private final float neighbourSize;
    private final double pageWidthPercentage;

    /* JADX INFO: compiled from: PercentagePageSizeProvider.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivPager.ItemAlignment.values().length];
            try {
                iArr[DivPager.ItemAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivPager.ItemAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivPager.ItemAlignment.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getItemSize() {
        return this.itemSize;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public boolean getHasOffScreenPages() {
        return this.hasOffScreenPages;
    }

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    public Float getItemSize(int i10) {
        return Float.valueOf(getItemSize());
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getNeighbourSize() {
        return this.neighbourSize;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    public PercentagePageSizeProvider(DivPageSize divPageSize, ExpressionResolver expressionResolver, int i10, DivPagerPaddingsHolder divPagerPaddingsHolder, DivPager.ItemAlignment itemAlignment) {
        float start;
        float itemSize;
        float itemSize2;
        super(i10, divPagerPaddingsHolder, itemAlignment);
        double dDoubleValue = divPageSize.f48138a.f48371a.evaluate(expressionResolver).doubleValue();
        this.pageWidthPercentage = dDoubleValue;
        this.itemSize = (float) ((((double) i10) * dDoubleValue) / ((double) 100));
        int i11 = WhenMappings.$EnumSwitchMapping$0[itemAlignment.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    start = i10 - divPagerPaddingsHolder.getEnd();
                    itemSize = getItemSize();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                itemSize2 = (i10 - getItemSize()) / 2;
            }
            this.neighbourSize = itemSize2;
            this.hasOffScreenPages = dDoubleValue < 100.0d;
        }
        start = i10 - divPagerPaddingsHolder.getStart();
        itemSize = getItemSize();
        itemSize2 = start - itemSize;
        this.neighbourSize = itemSize2;
        this.hasOffScreenPages = dDoubleValue < 100.0d;
    }
}
