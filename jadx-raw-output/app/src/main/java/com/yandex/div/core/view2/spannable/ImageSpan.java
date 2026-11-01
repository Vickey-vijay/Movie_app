package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import ck.p;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import ek.b;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ImageSpan.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ImageSpan extends PositionAwareReplacementSpan {
    private final Accessibility accessibility;
    private final TextVerticalAlignment alignment;
    private final RectF boundsInText = new RectF();
    private final int height;
    private Drawable image;
    private final int lineHeight;
    private final int width;

    /* JADX INFO: compiled from: ImageSpan.kt */
    public static final class Accessibility {
        private final String accessibilityType;
        private final String contentDescription;
        private final OnAccessibilityClickAction onClickAction;

        public final String getAccessibilityType() {
            return this.accessibilityType;
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }

        public final OnAccessibilityClickAction getOnClickAction() {
            return this.onClickAction;
        }

        public Accessibility(String str, String str2, OnAccessibilityClickAction onAccessibilityClickAction) {
            this.accessibilityType = str;
            this.contentDescription = str2;
            this.onClickAction = onAccessibilityClickAction;
        }
    }

    /* JADX INFO: compiled from: ImageSpan.kt */
    public interface OnAccessibilityClickAction {
        void perform();
    }

    /* JADX INFO: compiled from: ImageSpan.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextVerticalAlignment.values().length];
            try {
                iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Rect getBoundsInText(Rect rect) {
        rect.set(b.c(this.boundsInText.left), b.c(this.boundsInText.top), b.c(this.boundsInText.right), b.c(this.boundsInText.bottom));
        return rect;
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds;
        Rect bounds2;
        if (fontMetricsInt == null || this.lineHeight > 0) {
            return this.width;
        }
        int iC = b.c(paint.ascent());
        int iC2 = b.c(paint.descent());
        Drawable drawable = this.image;
        int iHeight = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? this.height : bounds2.height();
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i12 == 1) {
            iC2 = iC + iHeight;
        } else if (i12 == 2) {
            iC2 = ((iC + iC2) + iHeight) / 2;
        } else if (i12 == 3) {
            iC2 = 0;
        } else if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i13 = iC2 - iHeight;
        int i14 = fontMetricsInt.top;
        int i15 = fontMetricsInt.ascent;
        int i16 = fontMetricsInt.bottom - fontMetricsInt.descent;
        fontMetricsInt.ascent = Math.min(i13, i15);
        int iMax = Math.max(iC2, fontMetricsInt.descent);
        fontMetricsInt.descent = iMax;
        fontMetricsInt.top = fontMetricsInt.ascent + (i14 - i15);
        fontMetricsInt.bottom = iMax + i16;
        Drawable drawable2 = this.image;
        return (drawable2 == null || (bounds = drawable2.getBounds()) == null) ? this.width : bounds.width();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Drawable drawable = this.image;
        if (drawable == null) {
            return;
        }
        canvas.save();
        int iHeight = drawable.getBounds().height();
        int i15 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i15 == 1) {
            i13 = i12 + iHeight;
        } else if (i15 == 2) {
            i13 = ((i12 + i14) + iHeight) / 2;
        } else if (i15 != 3) {
            if (i15 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = i14;
        }
        float f11 = i13 - iHeight;
        this.boundsInText.set(drawable.getBounds());
        this.boundsInText.offset(f10, f11);
        canvas.translate(f10, f11);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final Accessibility getAccessibility$div_release() {
        return this.accessibility;
    }

    public final void setImage(Drawable drawable) {
        if (p.e(this.image, drawable)) {
            return;
        }
        this.image = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.width, this.height);
        }
        this.boundsInText.setEmpty();
    }

    public ImageSpan(Drawable drawable, @Px int i10, @Px int i11, @Px int i12, TextVerticalAlignment textVerticalAlignment, Accessibility accessibility) {
        this.width = i10;
        this.height = i11;
        this.lineHeight = i12;
        this.alignment = textVerticalAlignment;
        this.accessibility = accessibility;
        this.image = drawable;
    }

    public final RectF getBoundsInText(RectF rectF) {
        rectF.set(this.boundsInText);
        return rectF;
    }
}
