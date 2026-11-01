package io.bidmachine.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.Util;

/* JADX INFO: compiled from: SubtitlePainter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class l0 {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final String TAG = "SubtitlePainter";
    private int backgroundColor;
    private final Paint bitmapPaint;
    private Rect bitmapRect;
    private float bottomPaddingFraction;

    @Nullable
    private Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;

    @Nullable
    private CharSequence cueText;

    @Nullable
    private Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private StaticLayout edgeLayout;
    private int edgeType;
    private int foregroundColor;
    private final float outlineWidth;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final Paint windowPaint;

    public void draw(Cue cue, CaptionStyleCompat captionStyleCompat, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        boolean z10 = cue.bitmap == null;
        int i14 = ViewCompat.MEASURED_STATE_MASK;
        if (z10) {
            if (TextUtils.isEmpty(cue.text)) {
                return;
            } else {
                i14 = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
            }
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && Util.areEqual(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && Util.areEqual(Integer.valueOf(this.cueLineAnchor), Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && Util.areEqual(Integer.valueOf(this.cuePositionAnchor), Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i14 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f10 && this.cueTextSizePx == f11 && this.bottomPaddingFraction == f12 && this.parentLeft == i10 && this.parentTop == i11 && this.parentRight == i12 && this.parentBottom == i13) {
            drawLayout(canvas, z10);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i14;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.defaultTextSizePx = f10;
        this.cueTextSizePx = f11;
        this.bottomPaddingFraction = f12;
        this.parentLeft = i10;
        this.parentTop = i11;
        this.parentRight = i12;
        this.parentBottom = i13;
        if (z10) {
            Assertions.checkNotNull(this.cueText);
            setupTextLayout();
        } else {
            Assertions.checkNotNull(this.cueBitmap);
            setupBitmapLayout();
        }
        drawLayout(canvas, z10);
    }

    private static boolean areCharSequencesEqual(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    private void drawLayout(Canvas canvas, boolean z10) {
        if (z10) {
            drawTextLayout(canvas);
            return;
        }
        Assertions.checkNotNull(this.bitmapRect);
        Assertions.checkNotNull(this.cueBitmap);
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(Canvas canvas) {
        StaticLayout staticLayout = this.textLayout;
        StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        }
        int i10 = this.edgeType;
        if (i10 == 1) {
            this.textPaint.setStrokeJoin(Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.textPaint;
            float f10 = this.shadowRadius;
            float f11 = this.shadowOffset;
            textPaint.setShadowLayer(f10, f11, f11, this.edgeColor);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.edgeColor;
            int i12 = z10 ? this.edgeColor : -1;
            float f12 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.textPaint.setShadowLayer(this.shadowRadius, f13, f13, i11);
            staticLayout2.draw(canvas);
            this.textPaint.setShadowLayer(this.shadowRadius, f12, f12, i12);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    private void setupBitmapLayout() {
        float f10;
        int i10;
        float f11;
        Bitmap bitmap = this.cueBitmap;
        int i11 = this.parentRight;
        int i12 = this.parentLeft;
        int i13 = this.parentBottom;
        int i14 = this.parentTop;
        float f12 = i11 - i12;
        float f13 = i12 + (this.cuePosition * f12);
        float f14 = i13 - i14;
        float f15 = i14 + (this.cueLine * f14);
        int iRound = Math.round(f12 * this.cueSize);
        float f16 = this.cueBitmapHeight;
        int iRound2 = f16 != -3.4028235E38f ? Math.round(f14 * f16) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i15 = this.cuePositionAnchor;
        if (i15 != 2) {
            if (i15 == 1) {
                f10 = iRound / 2;
            }
            int iRound3 = Math.round(f13);
            i10 = this.cueLineAnchor;
            if (i10 == 2) {
                if (i10 == 1) {
                    f11 = iRound2 / 2;
                }
                int iRound4 = Math.round(f15);
                this.bitmapRect = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f11 = iRound2;
            f15 -= f11;
            int iRound5 = Math.round(f15);
            this.bitmapRect = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f10 = iRound;
        f13 -= f10;
        int iRound6 = Math.round(f13);
        i10 = this.cueLineAnchor;
        if (i10 == 2) {
            if (i10 == 1) {
                f11 = iRound2 / 2;
            }
            int iRound7 = Math.round(f15);
            this.bitmapRect = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f11 = iRound2;
        f15 -= f11;
        int iRound8 = Math.round(f15);
        this.bitmapRect = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    private void setupTextLayout() {
        int i10;
        int i11;
        int iMax;
        int iMin;
        int iRound;
        int i12;
        CharSequence charSequence = this.cueText;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.cueText);
        int i13 = this.parentRight - this.parentLeft;
        int i14 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.defaultTextSizePx);
        int i15 = (int) ((this.defaultTextSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i16 = i15 * 2;
        int i17 = i13 - i16;
        float f10 = this.cueSize;
        if (f10 != -3.4028235E38f) {
            i17 = (int) (i17 * f10);
        }
        int i18 = i17;
        if (i18 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.cueTextSizePx > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.edgeType == 1) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (Color.alpha(this.backgroundColor) > 0) {
            int i19 = this.edgeType;
            if (i19 == 0 || i19 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
            }
        }
        Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i18, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int iMax2 = 0;
        for (int i20 = 0; i20 < lineCount; i20++) {
            iMax2 = Math.max((int) Math.ceil(this.textLayout.getLineWidth(i20)), iMax2);
        }
        if (this.cueSize == -3.4028235E38f || iMax2 >= i18) {
            i18 = iMax2;
        }
        int i21 = i18 + i16;
        float f11 = this.cuePosition;
        if (f11 != -3.4028235E38f) {
            int iRound2 = Math.round(i13 * f11);
            int i22 = this.parentLeft;
            int i23 = iRound2 + i22;
            int i24 = this.cuePositionAnchor;
            i10 = 1;
            if (i24 != 1) {
                i11 = 2;
                if (i24 == 2) {
                    i23 -= i21;
                }
            } else {
                i11 = 2;
                i23 = ((i23 * 2) - i21) / 2;
            }
            iMax = Math.max(i23, i22);
            iMin = Math.min(i21 + iMax, this.parentRight);
        } else {
            i10 = 1;
            i11 = 2;
            iMax = ((i13 - i21) / 2) + this.parentLeft;
            iMin = iMax + i21;
        }
        int i25 = iMin - iMax;
        if (i25 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f12 = this.cueLine;
        if (f12 != -3.4028235E38f) {
            if (this.cueLineType == 0) {
                iRound = Math.round(i14 * f12) + this.parentTop;
                int i26 = this.cueLineAnchor;
                if (i26 == i11) {
                    iRound -= height;
                } else if (i26 == i10) {
                    iRound = ((iRound * 2) - height) / i11;
                }
            } else {
                int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
                float f13 = this.cueLine;
                if (f13 >= 0.0f) {
                    iRound = Math.round(f13 * lineBottom) + this.parentTop;
                } else {
                    iRound = Math.round((f13 + 1.0f) * lineBottom) + this.parentBottom;
                    iRound -= height;
                }
            }
            int i27 = iRound + height;
            int i28 = this.parentBottom;
            if (i27 <= i28) {
                int i29 = this.parentTop;
                if (iRound < i29) {
                    i12 = i29;
                }
                this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i25, alignment2, this.spacingMult, this.spacingAdd, true);
                this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i25, alignment2, this.spacingMult, this.spacingAdd, true);
                this.textLeft = iMax;
                this.textTop = i12;
                this.textPaddingX = i15;
            }
            iRound = i28 - height;
        } else {
            iRound = (this.parentBottom - height) - ((int) (i14 * this.bottomPaddingFraction));
        }
        i12 = iRound;
        this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i25, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i25, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = iMax;
        this.textTop = i12;
        this.textPaddingX = i15;
    }

    public l0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = fRound;
        this.shadowRadius = fRound;
        this.shadowOffset = fRound;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }
}
