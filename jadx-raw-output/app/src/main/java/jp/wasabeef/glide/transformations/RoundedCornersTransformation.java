package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public class RoundedCornersTransformation extends BitmapTransformation {
    private static final String ID = "jp.wasabeef.glide.transformations.RoundedCornersTransformation.1";
    private static final int VERSION = 1;
    private final CornerType cornerType;
    private final int diameter;
    private final int margin;
    private final int radius;

    public enum CornerType {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public RoundedCornersTransformation(int i10, int i11) {
        this(i10, i11, CornerType.ALL);
    }

    /* JADX INFO: renamed from: jp.wasabeef.glide.transformations.RoundedCornersTransformation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType;

        static {
            int[] iArr = new int[CornerType.values().length];
            $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType = iArr;
            try {
                iArr[CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.OTHER_TOP_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.OTHER_TOP_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.OTHER_BOTTOM_LEFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.DIAGONAL_FROM_TOP_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[CornerType.DIAGONAL_FROM_TOP_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public RoundedCornersTransformation(int i10, int i11, CornerType cornerType) {
        this.radius = i10;
        this.diameter = i10 * 2;
        this.margin = i11;
        this.cornerType = cornerType;
    }

    private void drawBottomLeftRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.margin;
        int i11 = this.diameter;
        RectF rectF = new RectF(i10, f11 - i11, i10 + i11, f11);
        int i12 = this.radius;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.margin;
        canvas.drawRect(new RectF(i13, i13, i13 + this.diameter, f11 - this.radius), paint);
        int i14 = this.margin;
        canvas.drawRect(new RectF(this.radius + i14, i14, f10, f11), paint);
    }

    private void drawBottomRightRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.diameter;
        RectF rectF = new RectF(f10 - i10, f11 - i10, f10, f11);
        int i11 = this.radius;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        int i12 = this.margin;
        canvas.drawRect(new RectF(i12, i12, f10 - this.radius, f11), paint);
        int i13 = this.radius;
        canvas.drawRect(new RectF(f10 - i13, this.margin, f10, f11 - i13), paint);
    }

    private void drawBottomRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        RectF rectF = new RectF(this.margin, f11 - this.diameter, f10, f11);
        int i10 = this.radius;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        int i11 = this.margin;
        canvas.drawRect(new RectF(i11, i11, f10, f11 - this.radius), paint);
    }

    private void drawDiagonalFromTopLeftRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.margin;
        int i11 = this.diameter;
        RectF rectF = new RectF(i10, i10, i10 + i11, i10 + i11);
        int i12 = this.radius;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.diameter;
        RectF rectF2 = new RectF(f10 - i13, f11 - i13, f10, f11);
        int i14 = this.radius;
        canvas.drawRoundRect(rectF2, i14, i14, paint);
        int i15 = this.margin;
        int i16 = this.radius;
        canvas.drawRect(new RectF(i15, i15 + i16, f10 - i16, f11), paint);
        int i17 = this.margin;
        int i18 = this.radius;
        canvas.drawRect(new RectF(i17 + i18, i17, f10, f11 - i18), paint);
    }

    private void drawDiagonalFromTopRightRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.diameter;
        int i11 = this.margin;
        RectF rectF = new RectF(f10 - i10, i11, f10, i11 + i10);
        int i12 = this.radius;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.margin;
        int i14 = this.diameter;
        RectF rectF2 = new RectF(i13, f11 - i14, i13 + i14, f11);
        int i15 = this.radius;
        canvas.drawRoundRect(rectF2, i15, i15, paint);
        int i16 = this.margin;
        int i17 = this.radius;
        canvas.drawRect(new RectF(i16, i16, f10 - i17, f11 - i17), paint);
        int i18 = this.margin;
        int i19 = this.radius;
        canvas.drawRect(new RectF(i18 + i19, i18 + i19, f10, f11), paint);
    }

    private void drawLeftRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.margin;
        RectF rectF = new RectF(i10, i10, i10 + this.diameter, f11);
        int i11 = this.radius;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        int i12 = this.margin;
        canvas.drawRect(new RectF(this.radius + i12, i12, f10, f11), paint);
    }

    private void drawOtherBottomLeftRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.margin;
        RectF rectF = new RectF(i10, i10, f10, i10 + this.diameter);
        int i11 = this.radius;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        RectF rectF2 = new RectF(f10 - this.diameter, this.margin, f10, f11);
        int i12 = this.radius;
        canvas.drawRoundRect(rectF2, i12, i12, paint);
        int i13 = this.margin;
        int i14 = this.radius;
        canvas.drawRect(new RectF(i13, i13 + i14, f10 - i14, f11), paint);
    }

    private void drawOtherBottomRightRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.margin;
        RectF rectF = new RectF(i10, i10, f10, i10 + this.diameter);
        int i11 = this.radius;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        int i12 = this.margin;
        RectF rectF2 = new RectF(i12, i12, i12 + this.diameter, f11);
        int i13 = this.radius;
        canvas.drawRoundRect(rectF2, i13, i13, paint);
        int i14 = this.margin;
        int i15 = this.radius;
        canvas.drawRect(new RectF(i14 + i15, i14 + i15, f10, f11), paint);
    }

    private void drawOtherTopLeftRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        RectF rectF = new RectF(this.margin, f11 - this.diameter, f10, f11);
        int i10 = this.radius;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        RectF rectF2 = new RectF(f10 - this.diameter, this.margin, f10, f11);
        int i11 = this.radius;
        canvas.drawRoundRect(rectF2, i11, i11, paint);
        int i12 = this.margin;
        int i13 = this.radius;
        canvas.drawRect(new RectF(i12, i12, f10 - i13, f11 - i13), paint);
    }

    private void drawOtherTopRightRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.margin;
        RectF rectF = new RectF(i10, i10, i10 + this.diameter, f11);
        int i11 = this.radius;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        RectF rectF2 = new RectF(this.margin, f11 - this.diameter, f10, f11);
        int i12 = this.radius;
        canvas.drawRoundRect(rectF2, i12, i12, paint);
        int i13 = this.margin;
        int i14 = this.radius;
        canvas.drawRect(new RectF(i13 + i14, i13, f10, f11 - i14), paint);
    }

    private void drawRightRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        RectF rectF = new RectF(f10 - this.diameter, this.margin, f10, f11);
        int i10 = this.radius;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        int i11 = this.margin;
        canvas.drawRect(new RectF(i11, i11, f10 - this.radius, f11), paint);
    }

    private void drawRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.margin;
        float f12 = f10 - i10;
        float f13 = f11 - i10;
        switch (AnonymousClass1.$SwitchMap$jp$wasabeef$glide$transformations$RoundedCornersTransformation$CornerType[this.cornerType.ordinal()]) {
            case 1:
                int i11 = this.margin;
                RectF rectF = new RectF(i11, i11, f12, f13);
                int i12 = this.radius;
                canvas.drawRoundRect(rectF, i12, i12, paint);
                break;
            case 2:
                drawTopLeftRoundRect(canvas, paint, f12, f13);
                break;
            case 3:
                drawTopRightRoundRect(canvas, paint, f12, f13);
                break;
            case 4:
                drawBottomLeftRoundRect(canvas, paint, f12, f13);
                break;
            case 5:
                drawBottomRightRoundRect(canvas, paint, f12, f13);
                break;
            case 6:
                drawTopRoundRect(canvas, paint, f12, f13);
                break;
            case 7:
                drawBottomRoundRect(canvas, paint, f12, f13);
                break;
            case 8:
                drawLeftRoundRect(canvas, paint, f12, f13);
                break;
            case 9:
                drawRightRoundRect(canvas, paint, f12, f13);
                break;
            case 10:
                drawOtherTopLeftRoundRect(canvas, paint, f12, f13);
                break;
            case 11:
                drawOtherTopRightRoundRect(canvas, paint, f12, f13);
                break;
            case 12:
                drawOtherBottomLeftRoundRect(canvas, paint, f12, f13);
                break;
            case 13:
                drawOtherBottomRightRoundRect(canvas, paint, f12, f13);
                break;
            case 14:
                drawDiagonalFromTopLeftRoundRect(canvas, paint, f12, f13);
                break;
            case 15:
                drawDiagonalFromTopRightRoundRect(canvas, paint, f12, f13);
                break;
            default:
                int i13 = this.margin;
                RectF rectF2 = new RectF(i13, i13, f12, f13);
                int i14 = this.radius;
                canvas.drawRoundRect(rectF2, i14, i14, paint);
                break;
        }
    }

    private void drawTopLeftRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.margin;
        int i11 = this.diameter;
        RectF rectF = new RectF(i10, i10, i10 + i11, i10 + i11);
        int i12 = this.radius;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.margin;
        int i14 = this.radius;
        canvas.drawRect(new RectF(i13, i13 + i14, i13 + i14, f11), paint);
        int i15 = this.margin;
        canvas.drawRect(new RectF(this.radius + i15, i15, f10, f11), paint);
    }

    private void drawTopRightRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.diameter;
        int i11 = this.margin;
        RectF rectF = new RectF(f10 - i10, i11, f10, i11 + i10);
        int i12 = this.radius;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.margin;
        canvas.drawRect(new RectF(i13, i13, f10 - this.radius, f11), paint);
        int i14 = this.radius;
        canvas.drawRect(new RectF(f10 - i14, this.margin + i14, f10, f11), paint);
    }

    private void drawTopRoundRect(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.margin;
        RectF rectF = new RectF(i10, i10, f10, i10 + this.diameter);
        int i11 = this.radius;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        int i12 = this.margin;
        canvas.drawRect(new RectF(i12, i12 + this.radius, f10, f11), paint);
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof RoundedCornersTransformation) {
            RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) obj;
            if (roundedCornersTransformation.radius == this.radius && roundedCornersTransformation.diameter == this.diameter && roundedCornersTransformation.margin == this.margin && roundedCornersTransformation.cornerType == this.cornerType) {
                return true;
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 425235636 + (this.radius * 10000) + (this.diameter * 1000) + (this.margin * 100) + (this.cornerType.ordinal() * 10);
    }

    public String toString() {
        return "RoundedTransformation(radius=" + this.radius + ", margin=" + this.margin + ", diameter=" + this.diameter + ", cornerType=" + this.cornerType.name() + ")";
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update((ID + this.radius + this.diameter + this.margin + this.cornerType).getBytes(Key.CHARSET));
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation
    public Bitmap transform(@NonNull Context context, @NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmap2 = bitmapPool.get(width, height, Bitmap.Config.ARGB_8888);
        bitmap2.setHasAlpha(true);
        setCanvasBitmapDensity(bitmap, bitmap2);
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        drawRoundRect(canvas, paint, width, height);
        return bitmap2;
    }
}
