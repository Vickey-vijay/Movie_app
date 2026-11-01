package com.bytedance.sdk.openadsdk.lh;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class pno extends ViewGroup implements tlj.lh {
    private final tlj ouw;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void ouw(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            FilterWord filterWord = list.get(i10);
            if (filterWord != null) {
                TextView textView = new TextView(getContext());
                textView.setTag(filterWord);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                int iOuw = osn.ouw(getContext(), 8.0f);
                marginLayoutParams.leftMargin = iOuw;
                marginLayoutParams.bottomMargin = iOuw;
                textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(255, 44, 85), ViewCompat.MEASURED_STATE_MASK}));
                textView.setText(filterWord.getName());
                textView.setPadding(iOuw, iOuw, iOuw, iOuw);
                GradientDrawable gradientDrawable = new GradientDrawable();
                float fOuw = osn.ouw(getContext(), 5.0f);
                gradientDrawable.setCornerRadius(fOuw);
                gradientDrawable.setColor(Color.parseColor("#0D000000"));
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setStroke(osn.ouw(getContext(), 1.0f), Color.parseColor("#FE2C55"));
                gradientDrawable2.setCornerRadius(fOuw);
                gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
                stateListDrawable.addState(new int[0], gradientDrawable);
                textView.setBackground(stateListDrawable);
                textView.setSelected(false);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.pno.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/lh/pno$1;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f44975u, view);
                        safedk_pno$1_onClick_00e26d484f394e07875980aa5234b92d(view);
                    }

                    public void safedk_pno$1_onClick_00e26d484f394e07875980aa5234b92d(View p10) {
                        if (pno.this.ouw != null) {
                            if (p10.isSelected()) {
                                pno.this.ouw.ouw(tlj.ouw);
                                return;
                            }
                            Object tag = p10.getTag();
                            if (tag instanceof FilterWord) {
                                pno.this.ouw.ouw((FilterWord) tag);
                            }
                        }
                    }
                });
                textView.setSelected(false);
                textView.setLayoutParams(marginLayoutParams);
                addView(textView);
            }
        }
    }

    public pno(Context context, tlj tljVar) {
        super(context);
        this.ouw = tljVar;
        tljVar.ouw(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int childCount = getChildCount();
        int i16 = i12 - i10;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i19 != 0) {
                i14 = marginLayoutParams.leftMargin;
            } else {
                i14 = 0;
            }
            if (measuredWidth + i14 + i17 < i16) {
                i15 = i17 + i14;
            } else {
                i18 += marginLayoutParams.bottomMargin + measuredHeight;
                i15 = 0;
            }
            childAt.layout(i15, marginLayoutParams.topMargin + i18, i15 + measuredWidth, measuredHeight + i18);
            i17 = i15 + measuredWidth + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        View.MeasureSpec.getMode(i10);
        View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        View.MeasureSpec.getSize(i11);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i10, i11);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i16 != 0) {
                i12 = marginLayoutParams.leftMargin;
            } else {
                i12 = 0;
            }
            if (measuredWidth + i12 + i15 < size) {
                i13 = i15 + i12;
            } else {
                i13 = 0;
            }
            if (i13 == 0) {
                i14 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i15 = i13 + measuredWidth + marginLayoutParams.rightMargin;
        }
        setMeasuredDimension(size, i14);
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.lh
    public final void ouw(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                if (tlj.ouw.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }
}
