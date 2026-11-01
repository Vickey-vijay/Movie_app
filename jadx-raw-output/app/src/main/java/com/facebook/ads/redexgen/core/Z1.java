package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z1 extends ViewGroup {
    public static String[] A01 = {"NZkFYUXBqTyLE0uJAv5x9NXUc2VI7sJS", "uR57PzkU", "rJSYxMTue9BrtOECqhcg2GfuYah", "YyZf9NPrzEzMWmx1W7C7iqaeo0zUpAtl", "DTiQjOeLHS2Pt5vxV6oLe4amAnidYBVC", "lHnCa3run773rLwZ2hjgCXNXpXLX76yu", "KbQZcAmLw4PS1PAelm", "IRe5OrXcLx0wSVTSjdWVVTt7WICaTRCE"};
    public static final int A02 = (int) (AbstractC1680Wl.A02 * 8.0f);
    public int A00;

    public Z1(C1977dL c1977dL) {
        super(c1977dL);
        setMotionEventSplittingEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int childWidth = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < width; i15++) {
            View childAt = getChildAt(i15);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i16 = childWidth + measuredWidth;
            int xPos = A01[4].charAt(29);
            if (xPos != 66) {
                throw new RuntimeException();
            }
            A01[4] = "OfxBdDbwWwaKkhkWo9ENaAyC2bgPxB1w";
            if (i16 > i14) {
                childWidth = getPaddingLeft();
                int width = this.A00;
                paddingTop += width;
            }
            int xPos2 = childWidth + measuredWidth;
            int width2 = paddingTop + measuredHeight;
            childAt.layout(childWidth, paddingTop, xPos2, width2);
            int width3 = A02;
            childWidth += width3 + measuredWidth;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int childHeightMeasureSpec = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size = View.MeasureSpec.getSize(i11);
        int width = getPaddingTop();
        int i12 = size - width;
        int width2 = getPaddingBottom();
        int height = i12 - width2;
        int paddingLeft = getPaddingLeft();
        int i13 = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
        int width3 = getChildCount();
        int childWidth = width3 > 0 ? 1 : 0;
        for (int lineHeight = 0; lineHeight < width; lineHeight++) {
            View childAt = getChildAt(lineHeight);
            int width4 = View.MeasureSpec.makeMeasureSpec(childHeightMeasureSpec, Integer.MIN_VALUE);
            childAt.measure(width4, iMakeMeasureSpec);
            int xPos = childAt.getMeasuredWidth();
            int height2 = childAt.getMeasuredHeight();
            int width5 = A02;
            i13 = Math.max(i13, height2 + width5);
            int width6 = paddingLeft + xPos;
            if (width6 > childHeightMeasureSpec) {
                childWidth++;
                paddingLeft = getPaddingLeft();
            }
            int i14 = A02 + xPos;
            String[] strArr = A01;
            String str = strArr[5];
            String str2 = strArr[0];
            int height3 = str.charAt(28);
            int width7 = str2.charAt(28);
            if (height3 != width7) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "n9Mm7W7nMoMcqU3dmLdt8wDmLs9m7g2q";
            strArr2[0] = "514SZhPsQ7DKXYFFbCEhDr5q0ZnH7KeP";
            paddingLeft += i14;
        }
        this.A00 = i13;
        int height4 = this.A00;
        int width8 = A02;
        setMeasuredDimension(childHeightMeasureSpec, (height4 * childWidth) + width8);
    }
}
