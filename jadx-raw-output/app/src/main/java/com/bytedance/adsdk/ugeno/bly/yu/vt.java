package com.bytedance.adsdk.ugeno.bly.yu;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class vt extends Drawable {
    private final RectF bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final Matrix f10791cf;
    private final Bitmap fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private Shader.TileMode f10792jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f10793ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final Paint f10794le;
    private Shader.TileMode mwh;
    public boolean ouw;
    private final int pno;
    private ImageView.ScaleType qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final int f10796ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private float f10797rn;
    private final RectF ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private ColorStateList f10798th;
    private final Paint tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private float f10799vm;
    private final RectF yu;
    private final boolean[] zih;
    private final RectF vt = new RectF();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final RectF f10795lh = new RectF();

    public static vt ouw(Bitmap bitmap) {
        if (bitmap != null) {
            return new vt(bitmap);
        }
        return null;
    }

    private static Bitmap vt(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            th2.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.bly.yu.vt$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ouw = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static Drawable ouw(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof vt) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), ouw(layerDrawable.getDrawable(i10)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapVt = vt(drawable);
        return bitmapVt != null ? new vt(bitmapVt) : drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f10793ko) {
            BitmapShader bitmapShader = new BitmapShader(this.fkw, this.mwh, this.f10792jg);
            Shader.TileMode tileMode = this.mwh;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f10792jg == tileMode2) {
                bitmapShader.setLocalMatrix(this.f10791cf);
            }
            this.f10794le.setShader(bitmapShader);
            this.f10793ko = false;
        }
        if (this.ouw) {
            if (this.f10799vm <= 0.0f) {
                canvas.drawOval(this.f10795lh, this.f10794le);
                return;
            } else {
                canvas.drawOval(this.f10795lh, this.f10794le);
                canvas.drawOval(this.bly, this.tlj);
                return;
            }
        }
        if (!ouw(this.zih)) {
            canvas.drawRect(this.f10795lh, this.f10794le);
            if (this.f10799vm > 0.0f) {
                canvas.drawRect(this.bly, this.tlj);
                return;
            }
            return;
        }
        float f10 = this.f10797rn;
        if (this.f10799vm <= 0.0f) {
            canvas.drawRoundRect(this.f10795lh, f10, f10, this.f10794le);
            ouw(canvas);
            return;
        }
        canvas.drawRoundRect(this.f10795lh, f10, f10, this.f10794le);
        canvas.drawRoundRect(this.bly, f10, f10, this.tlj);
        ouw(canvas);
        if (vt(this.zih) || this.f10797rn == 0.0f) {
            return;
        }
        RectF rectF = this.f10795lh;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float fWidth = f11 + rectF.width();
        float fHeight = f12 + this.f10795lh.height();
        float f13 = this.f10797rn;
        float f14 = this.f10799vm / 2.0f;
        if (!this.zih[0]) {
            canvas.drawLine(f11 - f14, f12, f11 + f13, f12, this.tlj);
            canvas.drawLine(f11, f12 - f14, f11, f12 + f13, this.tlj);
        }
        if (!this.zih[1]) {
            canvas.drawLine((fWidth - f13) - f14, f12, fWidth, f12, this.tlj);
            canvas.drawLine(fWidth, f12 - f14, fWidth, f12 + f13, this.tlj);
        }
        if (!this.zih[2]) {
            canvas.drawLine((fWidth - f13) - f14, fHeight, fWidth + f14, fHeight, this.tlj);
            canvas.drawLine(fWidth, fHeight - f13, fWidth, fHeight, this.tlj);
        }
        if (this.zih[3]) {
            return;
        }
        canvas.drawLine(f11 - f14, fHeight, f11 + f13, fHeight, this.tlj);
        canvas.drawLine(f11, fHeight - f13, f11, fHeight, this.tlj);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f10794le.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f10794le.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.pno;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f10796ra;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f10798th.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.f10798th.getColorForState(iArr, 0);
        if (this.tlj.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.tlj.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f10794le.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10794le.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f10794le.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f10794le.setFilterBitmap(z10);
        invalidateSelf();
    }

    private vt(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.yu = rectF;
        this.bly = new RectF();
        this.f10791cf = new Matrix();
        this.ryl = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.mwh = tileMode;
        this.f10792jg = tileMode;
        this.f10793ko = true;
        this.f10797rn = 0.0f;
        this.zih = new boolean[]{true, true, true, true};
        this.ouw = false;
        this.f10799vm = 0.0f;
        this.f10798th = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.qbp = ImageView.ScaleType.FIT_CENTER;
        this.fkw = bitmap;
        int width = bitmap.getWidth();
        this.f10796ra = width;
        int height = bitmap.getHeight();
        this.pno = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f10794le = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.tlj = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f10798th.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.f10799vm);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.vt.set(rect);
        ouw();
    }

    public final vt vt(Shader.TileMode tileMode) {
        if (this.f10792jg != tileMode) {
            this.f10792jg = tileMode;
            this.f10793ko = true;
            invalidateSelf();
        }
        return this;
    }

    private void ouw() {
        float fWidth;
        float fHeight;
        int i10 = AnonymousClass1.ouw[this.qbp.ordinal()];
        if (i10 == 1) {
            this.bly.set(this.vt);
            RectF rectF = this.bly;
            float f10 = this.f10799vm;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.f10791cf.reset();
            this.f10791cf.setTranslate((int) (((this.bly.width() - this.f10796ra) * 0.5f) + 0.5f), (int) (((this.bly.height() - this.pno) * 0.5f) + 0.5f));
        } else if (i10 == 2) {
            this.bly.set(this.vt);
            RectF rectF2 = this.bly;
            float f11 = this.f10799vm;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.f10791cf.reset();
            float fWidth2 = 0.0f;
            if (this.f10796ra * this.bly.height() > this.bly.width() * this.pno) {
                fWidth = this.bly.height() / this.pno;
                fHeight = 0.0f;
                fWidth2 = (this.bly.width() - (this.f10796ra * fWidth)) * 0.5f;
            } else {
                fWidth = this.bly.width() / this.f10796ra;
                fHeight = (this.bly.height() - (this.pno * fWidth)) * 0.5f;
            }
            this.f10791cf.setScale(fWidth, fWidth);
            Matrix matrix = this.f10791cf;
            float f12 = this.f10799vm;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f12 / 2.0f), ((int) (fHeight + 0.5f)) + (f12 / 2.0f));
        } else if (i10 == 3) {
            this.f10791cf.reset();
            float fMin = (((float) this.f10796ra) > this.vt.width() || ((float) this.pno) > this.vt.height()) ? Math.min(this.vt.width() / this.f10796ra, this.vt.height() / this.pno) : 1.0f;
            float fWidth3 = (int) (((this.vt.width() - (this.f10796ra * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.vt.height() - (this.pno * fMin)) * 0.5f) + 0.5f);
            this.f10791cf.setScale(fMin, fMin);
            this.f10791cf.postTranslate(fWidth3, fHeight2);
            this.bly.set(this.yu);
            this.f10791cf.mapRect(this.bly);
            RectF rectF3 = this.bly;
            float f13 = this.f10799vm;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.f10791cf.setRectToRect(this.yu, this.bly, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.bly.set(this.yu);
            this.f10791cf.setRectToRect(this.yu, this.vt, Matrix.ScaleToFit.END);
            this.f10791cf.mapRect(this.bly);
            RectF rectF4 = this.bly;
            float f14 = this.f10799vm;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.f10791cf.setRectToRect(this.yu, this.bly, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.bly.set(this.yu);
            this.f10791cf.setRectToRect(this.yu, this.vt, Matrix.ScaleToFit.START);
            this.f10791cf.mapRect(this.bly);
            RectF rectF5 = this.bly;
            float f15 = this.f10799vm;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.f10791cf.setRectToRect(this.yu, this.bly, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.bly.set(this.yu);
            this.f10791cf.setRectToRect(this.yu, this.vt, Matrix.ScaleToFit.CENTER);
            this.f10791cf.mapRect(this.bly);
            RectF rectF6 = this.bly;
            float f16 = this.f10799vm;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.f10791cf.setRectToRect(this.yu, this.bly, Matrix.ScaleToFit.FILL);
        } else {
            this.bly.set(this.vt);
            RectF rectF7 = this.bly;
            float f17 = this.f10799vm;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.f10791cf.reset();
            this.f10791cf.setRectToRect(this.yu, this.bly, Matrix.ScaleToFit.FILL);
        }
        this.f10795lh.set(this.bly);
        this.f10793ko = true;
    }

    private static boolean vt(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private void ouw(Canvas canvas) {
        if (vt(this.zih) || this.f10797rn == 0.0f) {
            return;
        }
        RectF rectF = this.f10795lh;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f10795lh.height() + f11;
        float f12 = this.f10797rn;
        if (!this.zih[0]) {
            this.ryl.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.ryl, this.f10794le);
        }
        if (!this.zih[1]) {
            this.ryl.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.ryl, this.f10794le);
        }
        if (!this.zih[2]) {
            this.ryl.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.ryl, this.f10794le);
        }
        if (this.zih[3]) {
            return;
        }
        this.ryl.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.ryl, this.f10794le);
    }

    public final vt ouw(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.f10797rn = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.f10797rn = 0.0f;
            }
            boolean[] zArr = this.zih;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public final vt ouw(float f10) {
        this.f10799vm = f10;
        this.tlj.setStrokeWidth(f10);
        return this;
    }

    public final vt ouw(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f10798th = colorStateList;
        this.tlj.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    public final vt ouw(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.qbp != scaleType) {
            this.qbp = scaleType;
            ouw();
        }
        return this;
    }

    public final vt ouw(Shader.TileMode tileMode) {
        if (this.mwh != tileMode) {
            this.mwh = tileMode;
            this.f10793ko = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean ouw(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
