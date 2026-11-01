package com.yandex.div.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import ck.i;
import ck.p;
import com.yandex.div.R$styleable;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;

/* JADX INFO: compiled from: EllipsizedTextView.kt */
/* JADX INFO: loaded from: classes6.dex */
public class EllipsizedTextView extends SuperLineHeightTextView {
    public static final Companion Companion = new Companion(null);
    private boolean autoEllipsize;
    private final AutoEllipsizeHelper autoEllipsizeHelper;
    private float cachedEllipsisWidth;
    private CharSequence displayText;
    private CharSequence ellipsis;
    private TextUtils.TruncateAt ellipsisLocation;
    private CharSequence ellipsizedText;
    private boolean isEllipsizeRequested;
    private boolean isInternalTextChange;
    private boolean isRemeasureNeeded;
    private int lastMeasuredHeight;
    private int lastMeasuredWidth;
    private CharSequence originalText;

    /* JADX INFO: compiled from: EllipsizedTextView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public EllipsizedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EllipsizedTextView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final CharSequence ellipsize(CharSequence charSequence) {
        CharSequence charSequence2;
        int iCalculateFittedSymbols;
        if ((charSequence == null || charSequence.length() == 0) || (iCalculateFittedSymbols = calculateFittedSymbols(charSequence, (charSequence2 = this.ellipsis))) <= 0) {
            return null;
        }
        if (iCalculateFittedSymbols == charSequence.length()) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, 0, iCalculateFittedSymbols);
        spannableStringBuilder.append(charSequence2);
        return spannableStringBuilder;
    }

    private static /* synthetic */ void getAutoEllipsizeHelper$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDisplayText$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEllipsizedText$annotations() {
    }

    private final void requestEllipsize() {
        this.isEllipsizeRequested = true;
    }

    private final void setTextInternal(CharSequence charSequence) {
        this.isInternalTextChange = true;
        super.setText(charSequence);
        this.isInternalTextChange = false;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public EllipsizedTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        CharSequence charSequence = "…";
        this.ellipsis = "…";
        this.ellipsisLocation = TextUtils.TruncateAt.END;
        this.lastMeasuredWidth = -1;
        this.lastMeasuredHeight = -1;
        this.cachedEllipsisWidth = -1.0f;
        this.autoEllipsizeHelper = new AutoEllipsizeHelper(this);
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EllipsizedTextView, i10, 0);
            try {
                CharSequence text = typedArrayObtainStyledAttributes.getText(R$styleable.EllipsizedTextView_ellipsis);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        onEllipsisChanged(this.ellipsis);
    }

    private final void ellipsizeIfNeeded() {
        CharSequence charSequence = this.ellipsizedText;
        boolean z10 = noMaxLines() || p.e(this.ellipsis, "…");
        if (this.ellipsizedText != null || !z10) {
            if (z10) {
                CharSequence charSequence2 = this.originalText;
                if (charSequence2 != null) {
                    this.isRemeasureNeeded = !p.e(charSequence2, charSequence);
                } else {
                    charSequence2 = null;
                }
                setEllipsizedText(charSequence2);
            } else {
                setEllipsizedText(ellipsize(this.originalText));
            }
        }
        this.isEllipsizeRequested = false;
    }

    private final void invalidateEllipsis() {
        this.cachedEllipsisWidth = -1.0f;
        this.isRemeasureNeeded = false;
    }

    private final Layout layoutText(CharSequence charSequence, int i10) {
        return new StaticLayout(charSequence, getPaint(), i10, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true);
    }

    public static /* synthetic */ Layout layoutText$default(EllipsizedTextView ellipsizedTextView, CharSequence charSequence, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layoutText");
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return ellipsizedTextView.layoutText(charSequence, i10);
    }

    private final void setEllipsizedText(CharSequence charSequence) {
        this.ellipsizedText = charSequence;
        setTextInternal(charSequence);
    }

    private final void sizeChangeInternal(int i10, int i11, int i12, int i13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        requestEllipsize();
    }

    public final boolean getAutoEllipsize() {
        return this.autoEllipsize;
    }

    public final CharSequence getDisplayText() {
        return this.displayText;
    }

    public final DrawingPassOverrideStrategy getDrawingPassOverrideStrategy$div_release() {
        return this.autoEllipsizeHelper.getDrawingPassOverrideStrategy();
    }

    public final CharSequence getEllipsis() {
        return this.ellipsis;
    }

    public final TextUtils.TruncateAt getEllipsisLocation() {
        return this.ellipsisLocation;
    }

    public final CharSequence getEllipsizedText() {
        return this.ellipsizedText;
    }

    public final int getLastMeasuredHeight() {
        return this.lastMeasuredHeight;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public CharSequence getText() {
        CharSequence charSequence = this.originalText;
        return charSequence == null ? "" : charSequence;
    }

    public final void setAutoEllipsize(boolean z10) {
        this.autoEllipsize = z10;
        this.autoEllipsizeHelper.setEnabled(z10);
    }

    public final void setDrawingPassOverrideStrategy$div_release(DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.autoEllipsizeHelper.setDrawingPassOverrideStrategy(drawingPassOverrideStrategy);
    }

    public final void setEllipsisLocation(TextUtils.TruncateAt truncateAt) {
        this.ellipsisLocation = truncateAt;
        if (truncateAt == null) {
            setAutoEllipsize(false);
        }
        onEllipsisChanged(this.ellipsis);
    }

    public final void setInternalTextChange(boolean z10) {
        this.isInternalTextChange = z10;
    }

    public final void setLastMeasuredHeight(int i10) {
        this.lastMeasuredHeight = i10;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.displayText = charSequence;
        super.setText(charSequence, bufferType);
    }

    private final int calculateFittedSymbols(CharSequence charSequence, CharSequence charSequence2) {
        boolean z10;
        int iAvailableWidth;
        Layout layoutLayoutText;
        boolean z11;
        if (charSequence.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || getMaxLines() == 0 || (iAvailableWidth = availableWidth()) <= 0) {
            return 0;
        }
        if (TextViewsKt.isHyphenationEnabled(this)) {
            layoutLayoutText = layoutTextWithHyphenation(charSequence, iAvailableWidth);
        } else {
            layoutLayoutText = layoutText(charSequence, iAvailableWidth);
        }
        int lineCount = layoutLayoutText.getLineCount();
        float lineWidth = layoutLayoutText.getLineWidth(lineCount - 1);
        if (lineCount >= getMaxLines() && (lineCount != getMaxLines() || lineWidth > iAvailableWidth)) {
            if (this.cachedEllipsisWidth == -1.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.cachedEllipsisWidth = layoutText$default(this, charSequence2, 0, 2, null).getLineWidth(0);
            }
            this.isRemeasureNeeded = true;
            float f10 = iAvailableWidth - this.cachedEllipsisWidth;
            int offsetForHorizontal = layoutLayoutText.getOffsetForHorizontal(getMaxLines() - 1, f10);
            while (layoutLayoutText.getPrimaryHorizontal(offsetForHorizontal) > f10 && offsetForHorizontal > 0) {
                offsetForHorizontal--;
            }
            if (offsetForHorizontal > 0 && Character.isHighSurrogate(charSequence.charAt(offsetForHorizontal - 1))) {
                return offsetForHorizontal - 1;
            }
            return offsetForHorizontal;
        }
        this.isRemeasureNeeded = true;
        return charSequence.length();
    }

    @RequiresApi(23)
    private final Layout layoutTextWithHyphenation(CharSequence charSequence, int i10) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i10).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(true).setHyphenationFrequency(getHyphenationFrequency()).build();
    }

    private final boolean noMaxLines() {
        if (getMaxLines() >= 0 && getMaxLines() != Integer.MAX_VALUE) {
            return false;
        }
        return true;
    }

    private final void onEllipsisChanged(CharSequence charSequence) {
        if (noMaxLines()) {
            super.setEllipsize(null);
        } else if (p.e(charSequence, "…")) {
            super.setEllipsize(this.ellipsisLocation);
        } else {
            super.setEllipsize(null);
            requestEllipsize();
            invalidateEllipsis();
        }
        requestLayout();
    }

    public final int availableWidth() {
        return (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.autoEllipsizeHelper.onViewAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.autoEllipsizeHelper.onViewDetachedFromWindow();
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        sizeChangeInternal(getMeasuredWidth(), getMeasuredHeight(), this.lastMeasuredWidth, this.lastMeasuredHeight);
        if (this.isEllipsizeRequested) {
            ellipsizeIfNeeded();
            CharSequence charSequence = this.ellipsizedText;
            if (charSequence != null) {
                if (!this.isRemeasureNeeded) {
                    charSequence = null;
                }
                if (charSequence != null) {
                    super.onMeasure(i10, i11);
                }
            }
        }
        this.lastMeasuredWidth = getMeasuredWidth();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        sizeChangeInternal(i10, i11, i12, i13);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (this.isInternalTextChange) {
            return;
        }
        this.originalText = charSequence;
        requestLayout();
        requestEllipsize();
    }

    public final void setEllipsis(CharSequence charSequence) {
        onEllipsisChanged(charSequence);
        this.ellipsis = charSequence;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 == getMaxLines()) {
            return;
        }
        super.setMaxLines(i10);
        onEllipsisChanged(this.ellipsis);
        requestEllipsize();
        invalidateEllipsis();
    }
}
