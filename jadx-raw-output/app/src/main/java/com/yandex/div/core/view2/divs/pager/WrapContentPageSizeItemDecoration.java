package com.yandex.div.core.view2.divs.pager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div2.DivPager;
import ek.b;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: WrapContentPageSizeItemDecoration.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class WrapContentPageSizeItemDecoration extends RecyclerView.ItemDecoration {
    private final DivPager.ItemAlignment alignment;
    private final DivPagerPaddingsHolder paddings;
    private final int parentSize;

    /* JADX INFO: compiled from: WrapContentPageSizeItemDecoration.kt */
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

    private final int getBottomOffset(View view) {
        float start;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 == 1) {
            start = (this.parentSize - this.paddings.getStart()) - view.getMeasuredHeight();
        } else if (i10 == 2) {
            start = (this.parentSize - view.getMeasuredHeight()) / 2.0f;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = this.paddings.getEnd();
        }
        return b.c(start);
    }

    private final int getHorizontalOffset(View view) {
        float start;
        int measuredWidth;
        float measuredWidth2;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                measuredWidth2 = (this.parentSize - view.getMeasuredWidth()) / 2.0f;
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                start = this.parentSize - this.paddings.getEnd();
                measuredWidth = view.getMeasuredWidth();
            }
            return b.c(measuredWidth2);
        }
        start = this.parentSize - this.paddings.getStart();
        measuredWidth = view.getMeasuredWidth();
        measuredWidth2 = start - measuredWidth;
        return b.c(measuredWidth2);
    }

    private final int getTopOffset(View view) {
        float start;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 == 1) {
            start = this.paddings.getStart();
        } else if (i10 == 2) {
            start = (this.parentSize - view.getMeasuredHeight()) / 2.0f;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = (this.parentSize - this.paddings.getEnd()) - view.getMeasuredHeight();
        }
        return b.c(start);
    }

    public WrapContentPageSizeItemDecoration(int i10, DivPagerPaddingsHolder divPagerPaddingsHolder, DivPager.ItemAlignment itemAlignment) {
        this.parentSize = i10;
        this.paddings = divPagerPaddingsHolder;
        this.alignment = itemAlignment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        DivPagerPageLayout divPagerPageLayout;
        View child;
        int horizontalOffset;
        int topOffset;
        int horizontalOffset2;
        int bottomOffset;
        int width = recyclerView.getWidth();
        DivPagerPaddingsHolder divPagerPaddingsHolder = this.paddings;
        int iC = width - b.c(divPagerPaddingsHolder.getLeft() + divPagerPaddingsHolder.getRight());
        int height = recyclerView.getHeight();
        DivPagerPaddingsHolder divPagerPaddingsHolder2 = this.paddings;
        view.measure(ViewsKt.makeExactSpec(iC), ViewsKt.makeExactSpec(height - b.c(divPagerPaddingsHolder2.getTop() + divPagerPaddingsHolder2.getBottom())));
        if (view instanceof DivPagerPageLayout) {
            divPagerPageLayout = (DivPagerPageLayout) view;
        } else {
            divPagerPageLayout = null;
        }
        if (divPagerPageLayout != null && (child = divPagerPageLayout.getChild()) != null) {
            Integer alignedLeft = this.paddings.getAlignedLeft();
            if (alignedLeft != null) {
                horizontalOffset = alignedLeft.intValue();
            } else {
                horizontalOffset = getHorizontalOffset(child);
            }
            Integer alignedTop = this.paddings.getAlignedTop();
            if (alignedTop != null) {
                topOffset = alignedTop.intValue();
            } else {
                topOffset = getTopOffset(child);
            }
            Integer alignedRight = this.paddings.getAlignedRight();
            if (alignedRight != null) {
                horizontalOffset2 = alignedRight.intValue();
            } else {
                horizontalOffset2 = getHorizontalOffset(child);
            }
            Integer alignedBottom = this.paddings.getAlignedBottom();
            if (alignedBottom != null) {
                bottomOffset = alignedBottom.intValue();
            } else {
                bottomOffset = getBottomOffset(child);
            }
            rect.set(horizontalOffset, topOffset, horizontalOffset2, bottomOffset);
        }
    }
}
