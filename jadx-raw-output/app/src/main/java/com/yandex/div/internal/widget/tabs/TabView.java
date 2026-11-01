package com.yandex.div.internal.widget.tabs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.ActionBar;
import androidx.core.view.ViewCompat;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.widget.SuperLineHeightTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class TabView extends SuperLineHeightTextView {

    @Nullable
    private DivTypefaceType mActiveTypefaceType;
    private boolean mBoldTextOnSelection;
    private boolean mEllipsizeEnabled;

    @Nullable
    private DivTypefaceType mInactiveTypefaceType;

    @Nullable
    private InputFocusTracker mInputFocusTracker;
    private boolean mIsActiveType;

    @NonNull
    private MaxWidthProvider mMaxWidthProvider;

    @Nullable
    private OnUpdateListener mOnUpdateListener;

    @Nullable
    private BaseIndicatorTabLayout.Tab mTab;

    @StyleRes
    private int mTextAppearance;

    @Nullable
    private DivTypefaceProvider mTypefaceProvider;

    public interface MaxWidthProvider {
        int getMaxWidth();
    }

    public interface OnUpdateListener {
        void onUpdated(@NonNull TabView tabView);
    }

    public TabView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0() {
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(View view) {
    }

    public void reset() {
        setTab(null);
        setSelected(false);
    }

    public TabView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Nullable
    private Typeface getDefaultTypeface() {
        DivTypefaceProvider divTypefaceProvider = this.mTypefaceProvider;
        if (divTypefaceProvider != null) {
            if (this.mIsActiveType) {
                DivTypefaceType divTypefaceType = this.mActiveTypefaceType;
                if (divTypefaceType != null) {
                    return divTypefaceType.getTypeface(divTypefaceProvider);
                }
            } else {
                DivTypefaceType divTypefaceType2 = this.mInactiveTypefaceType;
                if (divTypefaceType2 != null) {
                    return divTypefaceType2.getTypeface(divTypefaceProvider);
                }
            }
        }
        if (divTypefaceProvider != null) {
            return divTypefaceProvider.getMedium();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ActionBar.Tab.class.getName();
    }

    public void setActiveTypefaceType(@Nullable DivTypefaceType divTypefaceType) {
        this.mActiveTypefaceType = divTypefaceType;
    }

    public void setBoldTextOnSelection(boolean z10) {
        this.mBoldTextOnSelection = z10;
    }

    public void setEllipsizeEnabled(boolean z10) {
        this.mEllipsizeEnabled = z10;
        setEllipsize(z10 ? TextUtils.TruncateAt.END : null);
    }

    public void setInactiveTypefaceType(@Nullable DivTypefaceType divTypefaceType) {
        this.mInactiveTypefaceType = divTypefaceType;
    }

    public void setInputFocusTracker(InputFocusTracker inputFocusTracker) {
        this.mInputFocusTracker = inputFocusTracker;
    }

    public void setMaxWidthProvider(@NonNull MaxWidthProvider maxWidthProvider) {
        this.mMaxWidthProvider = maxWidthProvider;
    }

    public void setOnUpdateListener(@Nullable OnUpdateListener onUpdateListener) {
        this.mOnUpdateListener = onUpdateListener;
    }

    public void setTab(@Nullable BaseIndicatorTabLayout.Tab tab) {
        if (tab != this.mTab) {
            this.mTab = tab;
            update();
        }
    }

    public void setTextColorList(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setTextTypeface(@Nullable DivTypefaceProvider divTypefaceProvider, @StyleRes int i10) {
        this.mTypefaceProvider = divTypefaceProvider;
        this.mTextAppearance = i10;
        setupTypeface();
    }

    public void setTypefaceType(boolean z10) {
        boolean z11 = this.mIsActiveType != z10;
        this.mIsActiveType = z10;
        if (z11) {
            requestLayout();
        }
    }

    public void update() {
        BaseIndicatorTabLayout.Tab tab = this.mTab;
        setText(tab == null ? null : tab.getText());
        OnUpdateListener onUpdateListener = this.mOnUpdateListener;
        if (onUpdateListener != null) {
            onUpdateListener.onUpdated(this);
        }
    }

    public TabView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mMaxWidthProvider = new MaxWidthProvider() { // from class: com.yandex.div.internal.widget.tabs.j
            @Override // com.yandex.div.internal.widget.tabs.TabView.MaxWidthProvider
            public final int getMaxWidth() {
                return TabView.lambda$new$0();
            }
        };
        setGravity(8388627);
        setClickable(true);
        setMaxLines(1);
        setSingleLine(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.internal.widget.tabs.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TabView.lambda$new$1(view);
            }
        });
    }

    @SuppressLint({"WrongCall"})
    private void fixTextEllipsis(int i10, int i11) {
        BaseIndicatorTabLayout.Tab tab;
        CharSequence text;
        TextPaint paint;
        Layout layout = getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0 || (tab = this.mTab) == null || (text = tab.getText()) == null || (paint = layout.getPaint()) == null) {
            return;
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod != null) {
            text = transformationMethod.getTransformation(text, this);
        }
        if (text == null) {
            return;
        }
        setText(TextUtils.ellipsize(text, paint, ((int) layout.getLineMax(0)) - paint.measureText("..."), TextUtils.TruncateAt.END));
        super.onMeasure(i10, i11);
    }

    private void setupTypeface() {
        if (!isSelected()) {
            setTextAppearance(getContext(), this.mTextAppearance);
        }
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Typeface defaultTypeface;
        TextPaint paint = getPaint();
        if (paint != null && (defaultTypeface = getDefaultTypeface()) != null) {
            paint.setTypeface(defaultTypeface);
        }
        if (!this.mEllipsizeEnabled) {
            super.onMeasure(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int maxWidth = this.mMaxWidthProvider.getMaxWidth();
        if (maxWidth > 0 && (mode == 0 || size > maxWidth)) {
            i10 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        fixTextEllipsis(i10, i11);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean zPerformClick = super.performClick();
        InputFocusTracker inputFocusTracker = this.mInputFocusTracker;
        if (inputFocusTracker != null) {
            BaseDivViewExtensionsKt.clearFocusOnClick(this, inputFocusTracker);
        }
        BaseIndicatorTabLayout.Tab tab = this.mTab;
        if (tab != null) {
            tab.select();
            return true;
        }
        return zPerformClick;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        float f10;
        super.setEnabled(z10);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        setAlpha(f10);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z10) {
        boolean z11;
        if (isSelected() != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.setSelected(z10);
        setTypefaceType(z10);
        if (this.mBoldTextOnSelection && z11) {
            setupTypeface();
        }
    }

    public void setTabPadding(int i10, int i11, int i12, int i13) {
        ViewCompat.setPaddingRelative(this, i10, i11, i12, i13);
    }
}
