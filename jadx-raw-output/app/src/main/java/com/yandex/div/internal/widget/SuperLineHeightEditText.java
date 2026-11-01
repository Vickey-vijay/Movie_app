package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import ck.i;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.core.widget.ViewsKt;
import ik.k;

/* JADX INFO: compiled from: SuperLineHeightEditText.kt */
/* JADX INFO: loaded from: classes9.dex */
public class SuperLineHeightEditText extends AppCompatEditText implements FixedLineHeightView {
    private int currentLineCount;
    private final FixedLineHeightHelper fixedLineHeightHelper;
    private boolean horizontalScrollingEnabled;
    private boolean isDisallowInterceptTouchEvent;
    private boolean isTextFitting;

    public SuperLineHeightEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SuperLineHeightEditText(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public SuperLineHeightEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isTextFitting = true;
        this.fixedLineHeightHelper = new FixedLineHeightHelper(this);
    }

    private final boolean getInterceptTouchEventNeeded() {
        return (this.horizontalScrollingEnabled || this.isTextFitting) ? false : true;
    }

    private final void requestDisallowInterceptTouchEvent(boolean z10) {
        this.isDisallowInterceptTouchEvent = z10;
        getParent().requestDisallowInterceptTouchEvent(z10);
    }

    public static /* synthetic */ void updateFittingText$default(SuperLineHeightEditText superLineHeightEditText, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateFittingText");
        }
        if ((i11 & 1) != 0) {
            i10 = superLineHeightEditText.getHeight();
        }
        superLineHeightEditText.updateFittingText(i10);
    }

    public int getFixedLineHeight() {
        return this.fixedLineHeightHelper.getLineHeight();
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i10) {
        this.fixedLineHeightHelper.setLineHeight(i10);
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean z10) {
        this.horizontalScrollingEnabled = z10;
        super.setHorizontallyScrolling(z10);
    }

    private final int getVisibleLineCount() {
        if (getLineCount() == 0) {
            return 1;
        }
        if (getLineCount() > getMaxLines()) {
            return getMaxLines();
        }
        return getLineCount();
    }

    private final void remeasureWrapContentConstrained() {
        int lineCount;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        boolean z10 = false;
        int lineCount2 = 1;
        if (layoutParams != null && layoutParams.height == -3) {
            z10 = true;
        }
        if (!z10) {
            if (getLineCount() != 0) {
                if (getLineCount() > getMaxLines()) {
                    lineCount2 = getMaxLines();
                } else {
                    lineCount2 = getLineCount();
                }
            }
            this.currentLineCount = lineCount2;
            return;
        }
        int i10 = this.currentLineCount;
        if (getLineCount() == 0) {
            lineCount = 1;
        } else if (getLineCount() > getMaxLines()) {
            lineCount = getMaxLines();
        } else {
            lineCount = getLineCount();
        }
        if (i10 != lineCount) {
            if (getLineCount() != 0) {
                if (getLineCount() > getMaxLines()) {
                    lineCount2 = getMaxLines();
                } else {
                    lineCount2 = getLineCount();
                }
            }
            this.currentLineCount = lineCount2;
            requestLayout();
        }
    }

    private final void updateFittingText(int i10) {
        boolean z10;
        if (getLayout() != null && i10 != 0) {
            if ((i10 - getCompoundPaddingTop()) - getCompoundPaddingBottom() >= TextViewsKt.textHeight(this, getLayout().getLineCount())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.isTextFitting = z10;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.fixedLineHeightHelper.getExtraPaddingBottom();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.fixedLineHeightHelper.getExtraPaddingTop();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int lineCount;
        int i12;
        int iMakeExactSpec;
        super.onMeasure(i10, i11);
        FixedLineHeightHelper fixedLineHeightHelper = this.fixedLineHeightHelper;
        if (getLineCount() == 0) {
            lineCount = 1;
        } else if (getLineCount() > getMaxLines()) {
            lineCount = getMaxLines();
        } else {
            lineCount = getLineCount();
        }
        if (fixedLineHeightHelper.getLineHeight() != -1 && !ViewsKt.isExact(i11)) {
            if (lineCount >= fixedLineHeightHelper.view.getLineCount()) {
                i12 = fixedLineHeightHelper.textPaddingTop + fixedLineHeightHelper.textPaddingBottom;
            } else {
                i12 = 0;
            }
            int iD = k.d(TextViewsKt.textHeight(fixedLineHeightHelper.view, lineCount) + i12 + fixedLineHeightHelper.view.getPaddingTop() + fixedLineHeightHelper.view.getPaddingBottom(), fixedLineHeightHelper.view.getMinimumHeight());
            if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
                iMakeExactSpec = ViewsKt.makeAtMostSpec(Math.min(iD, View.MeasureSpec.getSize(i11)));
            } else {
                iMakeExactSpec = ViewsKt.makeExactSpec(iD);
            }
            super.setMeasuredDimension(getMeasuredWidthAndState(), iMakeExactSpec);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        updateFittingText(i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (Build.VERSION.SDK_INT < 28) {
            remeasureWrapContentConstrained();
        }
        updateFittingText$default(this, 0, 1, null);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!getInterceptTouchEventNeeded()) {
            if (this.isDisallowInterceptTouchEvent) {
                requestDisallowInterceptTouchEvent(false);
            }
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1 || action == 3) {
                requestDisallowInterceptTouchEvent(false);
            }
        } else {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.fixedLineHeightHelper.onFontSizeChanged();
    }
}
