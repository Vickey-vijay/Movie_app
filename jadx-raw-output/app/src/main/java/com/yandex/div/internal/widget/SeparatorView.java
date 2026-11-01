package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.core.content.ContextCompat;
import ck.i;
import com.yandex.div.internal.Assert;

/* JADX INFO: compiled from: SeparatorView.kt */
/* JADX INFO: loaded from: classes8.dex */
public class SeparatorView extends View {
    private int dividerGravity;
    private final Paint dividerPaint;
    private final Rect dividerRect;
    private int dividerThickness;
    private boolean isDividerRectChanged;
    private boolean isHorizontal;

    public SeparatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SeparatorView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void getDividerGravity$annotations() {
    }

    public SeparatorView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Paint paint = new Paint();
        paint.setColor(0);
        this.dividerPaint = paint;
        this.dividerRect = new Rect();
        this.isHorizontal = true;
        this.dividerGravity = 17;
    }

    private final boolean isDividerVisible() {
        return Color.alpha(this.dividerPaint.getColor()) > 0;
    }

    private final void updateDividerRect() {
        if (this.isDividerRectChanged) {
            int paddingTop = this.isHorizontal ? getPaddingTop() : getPaddingLeft();
            int paddingBottom = this.isHorizontal ? getPaddingBottom() : getPaddingRight();
            int height = this.isHorizontal ? getHeight() : getWidth();
            int i10 = (height - paddingTop) - paddingBottom;
            int i11 = this.dividerGravity;
            if (i11 == 17) {
                paddingTop += (i10 - this.dividerThickness) / 2;
            } else if (i11 != 8388611) {
                if (i11 != 8388613) {
                    Assert.fail("Unknown divider gravity value");
                    paddingTop = 0;
                } else {
                    paddingTop = (height - paddingBottom) - this.dividerThickness;
                }
            }
            if (this.isHorizontal) {
                Rect rect = this.dividerRect;
                rect.top = paddingTop;
                rect.bottom = paddingTop + Math.min(i10, this.dividerThickness);
                this.dividerRect.left = getPaddingLeft();
                this.dividerRect.right = getWidth() - getPaddingRight();
            } else {
                Rect rect2 = this.dividerRect;
                rect2.left = paddingTop;
                rect2.right = paddingTop + Math.min(i10, this.dividerThickness);
                this.dividerRect.top = getPaddingTop();
                this.dividerRect.bottom = getHeight() - getPaddingBottom();
            }
            this.isDividerRectChanged = false;
        }
    }

    public final int getDividerColor() {
        return this.dividerPaint.getColor();
    }

    public final int getDividerGravity() {
        return this.dividerGravity;
    }

    public final int getDividerThickness() {
        return this.dividerThickness;
    }

    public final void setDividerColor(int i10) {
        if (this.dividerPaint.getColor() != i10) {
            this.dividerPaint.setColor(i10);
            invalidate();
        }
    }

    public final void setDividerGravity(int i10) {
        if (this.dividerGravity != i10) {
            this.dividerGravity = i10;
            this.isDividerRectChanged = true;
            invalidate();
        }
    }

    public final void setDividerThickness(int i10) {
        if (this.dividerThickness != i10) {
            this.dividerThickness = i10;
            this.isDividerRectChanged = true;
            requestLayout();
        }
    }

    public final void setHorizontal(boolean z10) {
        if (this.isHorizontal != z10) {
            this.isHorizontal = z10;
            this.isDividerRectChanged = true;
            requestLayout();
        }
    }

    private final int calcSize(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                return size;
            }
            return i10;
        }
        return Math.min(i10, size);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isDividerVisible()) {
            updateDividerRect();
            canvas.drawRect(this.dividerRect, this.dividerPaint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.isHorizontal) {
            paddingTop += this.dividerThickness;
        } else {
            paddingLeft += this.dividerThickness;
        }
        setMeasuredDimension(calcSize(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10), calcSize(Math.max(paddingTop, getSuggestedMinimumHeight()), i11));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.isDividerRectChanged = true;
    }

    public final void setDividerColorResource(@ColorRes int i10) {
        setDividerColor(ContextCompat.getColor(getContext(), i10));
    }

    public final void setDividerHeightResource(@DimenRes int i10) {
        setDividerThickness(getResources().getDimensionPixelSize(i10));
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        this.isDividerRectChanged = true;
    }
}
