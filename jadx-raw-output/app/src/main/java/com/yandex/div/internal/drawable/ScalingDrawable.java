package com.yandex.div.internal.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ik.k;

/* JADX INFO: compiled from: ScalingDrawable.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ScalingDrawable extends Drawable {
    private boolean isDirtyRect;
    private Bitmap originalBitmap;
    private Picture originalPicture;
    private float xTranslate;
    private float yTranslate;
    private ScaleType customScaleType = ScaleType.NO_SCALE;
    private AlignmentHorizontal alignmentHorizontal = AlignmentHorizontal.LEFT;
    private AlignmentVertical alignmentVertical = AlignmentVertical.TOP;
    private final Paint paint = new Paint(3);
    private Matrix thumbTransformMatrix = new Matrix();
    private float xScale = 1.0f;
    private float yScale = 1.0f;

    /* JADX INFO: compiled from: ScalingDrawable.kt */
    public enum AlignmentHorizontal {
        LEFT,
        CENTER,
        RIGHT
    }

    /* JADX INFO: compiled from: ScalingDrawable.kt */
    public enum AlignmentVertical {
        TOP,
        CENTER,
        BOTTOM
    }

    /* JADX INFO: compiled from: ScalingDrawable.kt */
    public enum ScaleType {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* JADX INFO: compiled from: ScalingDrawable.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.NO_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlignmentHorizontal.values().length];
            try {
                iArr2[AlignmentHorizontal.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AlignmentHorizontal.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AlignmentVertical.values().length];
            try {
                iArr3[AlignmentVertical.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AlignmentVertical.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private final void reset() {
        this.isDirtyRect = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    public final void setAlignmentHorizontal(AlignmentHorizontal alignmentHorizontal) {
        this.alignmentHorizontal = alignmentHorizontal;
    }

    public final void setAlignmentVertical(AlignmentVertical alignmentVertical) {
        this.alignmentVertical = alignmentVertical;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
        invalidateSelf();
    }

    public final void setBitmap(Bitmap bitmap) {
        this.originalBitmap = bitmap;
        this.originalPicture = null;
        reset();
    }

    public final void setCustomScaleType(ScaleType scaleType) {
        this.customScaleType = scaleType;
    }

    public final void setPicture(Picture picture) {
        this.originalPicture = picture;
        this.originalBitmap = null;
        reset();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int width;
        int height;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        canvas.save();
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null) {
            width = bitmap.getWidth();
        } else {
            Picture picture = this.originalPicture;
            if (picture != null) {
                width = picture.getWidth();
            } else {
                width = 0;
            }
        }
        Bitmap bitmap2 = this.originalBitmap;
        if (bitmap2 != null) {
            height = bitmap2.getHeight();
        } else {
            Picture picture2 = this.originalPicture;
            if (picture2 != null) {
                height = picture2.getHeight();
            } else {
                height = 0;
            }
        }
        if (height > 0 && width > 0) {
            if (this.isDirtyRect) {
                float fWidth = getBounds().width();
                float fHeight = getBounds().height();
                float f15 = width;
                this.xScale = fWidth / f15;
                float f16 = height;
                this.yScale = fHeight / f16;
                int i11 = WhenMappings.$EnumSwitchMapping$0[this.customScaleType.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            this.xScale = 1.0f;
                            this.yScale = 1.0f;
                        }
                    } else {
                        float f17 = k.f(this.xScale, this.yScale);
                        this.xScale = f17;
                        this.yScale = f17;
                    }
                } else {
                    float fC = k.c(this.xScale, this.yScale);
                    this.xScale = fC;
                    this.yScale = fC;
                }
                float f18 = f15 * this.xScale;
                float f19 = f16 * this.yScale;
                int i12 = WhenMappings.$EnumSwitchMapping$1[this.alignmentHorizontal.ordinal()];
                float f20 = 0.0f;
                if (i12 != 1) {
                    if (i12 != 2) {
                        f12 = 0.0f;
                    } else {
                        f10 = fWidth - f18;
                        f11 = this.xScale;
                    }
                    this.xTranslate = f12;
                    i10 = WhenMappings.$EnumSwitchMapping$2[this.alignmentVertical.ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            f13 = fHeight - f19;
                            f14 = this.yScale;
                        }
                        this.yTranslate = f20;
                        this.isDirtyRect = false;
                    } else {
                        f13 = (fHeight - f19) / 2;
                        f14 = this.yScale;
                    }
                    f20 = f13 / f14;
                    this.yTranslate = f20;
                    this.isDirtyRect = false;
                } else {
                    f10 = (fWidth - f18) / 2;
                    f11 = this.xScale;
                }
                f12 = f10 / f11;
                this.xTranslate = f12;
                i10 = WhenMappings.$EnumSwitchMapping$2[this.alignmentVertical.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        f13 = fHeight - f19;
                        f14 = this.yScale;
                    }
                    this.yTranslate = f20;
                    this.isDirtyRect = false;
                } else {
                    f13 = (fHeight - f19) / 2;
                    f14 = this.yScale;
                }
                f20 = f13 / f14;
                this.yTranslate = f20;
                this.isDirtyRect = false;
            }
            canvas.scale(this.xScale, this.yScale);
            canvas.translate(this.xTranslate, this.yTranslate);
            Bitmap bitmap3 = this.originalBitmap;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, this.thumbTransformMatrix, this.paint);
            }
            Picture picture3 = this.originalPicture;
            if (picture3 != null) {
                canvas.drawPicture(picture3);
            }
            canvas.restore();
            return;
        }
        Bitmap bitmap4 = this.originalBitmap;
        if (bitmap4 != null) {
            canvas.drawBitmap(bitmap4, this.thumbTransformMatrix, this.paint);
        }
        Picture picture4 = this.originalPicture;
        if (picture4 != null) {
            canvas.drawPicture(picture4);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        reset();
    }
}
