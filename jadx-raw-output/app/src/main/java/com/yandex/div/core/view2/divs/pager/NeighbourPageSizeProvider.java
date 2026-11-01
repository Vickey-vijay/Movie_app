package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivNeighbourPageSize;
import com.yandex.div2.DivPager;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: NeighbourPageSizeProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class NeighbourPageSizeProvider extends DivPagerPageSizeProvider implements FixedPageSizeProvider {
    private final boolean hasOffScreenPages;
    private final float itemSize;
    private final float neighbourPageWidth;
    private final float neighbourSize;

    /* JADX INFO: compiled from: NeighbourPageSizeProvider.kt */
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

    public NeighbourPageSizeProvider(DivNeighbourPageSize divNeighbourPageSize, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics, int i10, float f10, DivPagerPaddingsHolder divPagerPaddingsHolder, DivPager.ItemAlignment itemAlignment) {
        float start;
        float neighbourSize;
        super(i10, divPagerPaddingsHolder, itemAlignment);
        float pxF = BaseDivViewExtensionsKt.toPxF(divNeighbourPageSize.f48070a, displayMetrics, expressionResolver);
        this.neighbourPageWidth = pxF;
        this.neighbourSize = f10 + pxF;
        int i11 = WhenMappings.$EnumSwitchMapping$0[itemAlignment.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    start = i10 - divPagerPaddingsHolder.getEnd();
                    neighbourSize = getNeighbourSize();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                start = i10;
                neighbourSize = getNeighbourSize() * 2;
            }
        } else {
            start = i10 - divPagerPaddingsHolder.getStart();
            neighbourSize = getNeighbourSize();
        }
        this.itemSize = start - neighbourSize;
        this.hasOffScreenPages = pxF > 0.0f;
    }
}
