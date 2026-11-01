package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import ck.i;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.core.widget.ViewsKt;
import ik.k;

/* JADX INFO: compiled from: SuperLineHeightTextView.kt */
/* JADX INFO: loaded from: classes2.dex */
public class SuperLineHeightTextView extends AppCompatTextView implements FixedLineHeightView {
    private final FixedLineHeightHelper fixedLineHeightHelper;
    private boolean isTightenWidth;

    public SuperLineHeightTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SuperLineHeightTextView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public SuperLineHeightTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.fixedLineHeightHelper = new FixedLineHeightHelper(this);
    }

    public int getFixedLineHeight() {
        return this.fixedLineHeightHelper.getLineHeight();
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i10) {
        this.fixedLineHeightHelper.setLineHeight(i10);
    }

    public final void setTightenWidth(boolean z10) {
        boolean z11 = this.isTightenWidth;
        this.isTightenWidth = z10;
        if (z11 != z10) {
            requestLayout();
        }
    }

    private final int getVisibleLineCount() {
        return Math.min(getLineCount(), getMaxLines());
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.fixedLineHeightHelper.getExtraPaddingBottom();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.fixedLineHeightHelper.getExtraPaddingTop();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        DivLayoutParams divLayoutParams;
        int i12;
        int iMakeExactSpec;
        super.onMeasure(i10, i11);
        FixedLineHeightHelper fixedLineHeightHelper = this.fixedLineHeightHelper;
        int iMin = Math.min(getLineCount(), getMaxLines());
        if (fixedLineHeightHelper.getLineHeight() != -1 && !ViewsKt.isExact(i11)) {
            if (iMin >= fixedLineHeightHelper.view.getLineCount()) {
                i12 = fixedLineHeightHelper.textPaddingTop + fixedLineHeightHelper.textPaddingBottom;
            } else {
                i12 = 0;
            }
            int iD = k.d(TextViewsKt.textHeight(fixedLineHeightHelper.view, iMin) + i12 + fixedLineHeightHelper.view.getPaddingTop() + fixedLineHeightHelper.view.getPaddingBottom(), fixedLineHeightHelper.view.getMinimumHeight());
            if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
                iMakeExactSpec = ViewsKt.makeAtMostSpec(Math.min(iD, View.MeasureSpec.getSize(i11)));
            } else {
                iMakeExactSpec = ViewsKt.makeExactSpec(iD);
            }
            super.setMeasuredDimension(getMeasuredWidthAndState(), iMakeExactSpec);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            divLayoutParams = (DivLayoutParams) layoutParams;
        } else {
            divLayoutParams = null;
        }
        if (divLayoutParams != null && this.isTightenWidth && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -3 && divLayoutParams.getMaxWidth() != Integer.MAX_VALUE) {
            int lineCount = getLayout().getLineCount();
            float fMax = 0.0f;
            for (int i13 = 0; i13 < lineCount; i13++) {
                fMax = Math.max(fMax, getLayout().getLineWidth(i13));
            }
            int iCeil = (int) Math.ceil(fMax + getCompoundPaddingLeft() + getCompoundPaddingRight());
            if (iCeil < getMeasuredWidth()) {
                super.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(iCeil, View.MeasureSpec.getMode(getMeasuredWidthAndState())), getMeasuredHeightAndState());
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.fixedLineHeightHelper.onFontSizeChanged();
    }
}
