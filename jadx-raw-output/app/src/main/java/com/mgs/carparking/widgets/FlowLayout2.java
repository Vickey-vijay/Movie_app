package com.mgs.carparking.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class FlowLayout2 extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<List<View>> f42297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Integer> f42298c;

    public FlowLayout2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42297b = new ArrayList();
        this.f42298c = new ArrayList();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f42297b.clear();
        this.f42298c.clear();
        int width = getWidth();
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int iMax = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredWidth + i14 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (width - getPaddingLeft()) - getPaddingRight()) {
                this.f42298c.add(Integer.valueOf(iMax));
                this.f42297b.add(arrayList);
                iMax = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + measuredHeight;
                arrayList = new ArrayList();
                i14 = 0;
            }
            i14 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            iMax = Math.max(iMax, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            arrayList.add(childAt);
        }
        this.f42298c.add(Integer.valueOf(iMax));
        this.f42297b.add(arrayList);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f42297b.size();
        for (int i16 = 0; i16 < size; i16++) {
            List<View> list = this.f42297b.get(i16);
            int iIntValue = this.f42298c.get(i16).intValue();
            for (int i17 = 0; i17 < list.size(); i17++) {
                View view = list.get(i17);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i18 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i19 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i18, i19, view.getMeasuredWidth() + i18, view.getMeasuredHeight() + i19);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            paddingLeft = getPaddingLeft();
            paddingTop += iIntValue;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i14 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            measureChild(childAt, i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i15 = size2;
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int i16 = i13 + measuredWidth;
            if (i16 > (size - getPaddingLeft()) - getPaddingRight()) {
                iMax = Math.max(iMax, i13);
                i14 += iMax2;
                iMax2 = measuredHeight;
                i13 = measuredWidth;
            } else {
                iMax2 = Math.max(iMax2, measuredHeight);
                i13 = i16;
            }
            if (i12 == childCount - 1) {
                i14 += iMax2;
                iMax = Math.max(i13, iMax);
            }
            i12++;
            size2 = i15;
        }
        int i17 = size2;
        if (mode != 1073741824) {
            size = getPaddingRight() + iMax + getPaddingLeft();
        }
        setMeasuredDimension(size, mode2 == 1073741824 ? i17 : i14 + getPaddingTop() + getPaddingBottom());
    }

    public FlowLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
