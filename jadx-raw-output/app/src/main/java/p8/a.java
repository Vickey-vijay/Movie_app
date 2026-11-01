package p8;

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
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.HashSet;

/* JADX INFO: compiled from: RoundedDrawable.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f66050a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f66051b = new RectF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f66052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f66053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f66054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f66055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f66056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f66057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f66058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f66059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f66060k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Shader.TileMode f66061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Shader.TileMode f66062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f66063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f66064o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean[] f66065p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f66066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f66067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f66068s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView.ScaleType f66069t;

    public static boolean a(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: p8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RoundedDrawable.java */
    public static /* synthetic */ class C0614a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66070a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f66070a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66070a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66070a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66070a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66070a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66070a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66070a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static Bitmap c(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public static a d(Bitmap bitmap) {
        if (bitmap != null) {
            return new a(bitmap);
        }
        return null;
    }

    public static Drawable e(Drawable drawable) {
        if (drawable == null || (drawable instanceof a)) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap bitmapC = c(drawable);
            return bitmapC != null ? new a(bitmapC) : drawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i10 = 0; i10 < numberOfLayers; i10++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), e(layerDrawable.getDrawable(i10)));
        }
        return layerDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f66063n) {
            BitmapShader bitmapShader = new BitmapShader(this.f66053d, this.f66061l, this.f66062m);
            Shader.TileMode tileMode = this.f66061l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f66062m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f66059j);
            }
            this.f66054e.setShader(bitmapShader);
            this.f66063n = false;
        }
        if (this.f66066q) {
            if (this.f66067r <= 0.0f) {
                canvas.drawOval(this.f66051b, this.f66054e);
                return;
            } else {
                canvas.drawOval(this.f66051b, this.f66054e);
                canvas.drawOval(this.f66057h, this.f66058i);
                return;
            }
        }
        if (!b(this.f66065p)) {
            canvas.drawRect(this.f66051b, this.f66054e);
            if (this.f66067r > 0.0f) {
                canvas.drawRect(this.f66057h, this.f66058i);
                return;
            }
            return;
        }
        float f10 = this.f66064o;
        if (this.f66067r <= 0.0f) {
            canvas.drawRoundRect(this.f66051b, f10, f10, this.f66054e);
            f(canvas);
        } else {
            canvas.drawRoundRect(this.f66051b, f10, f10, this.f66054e);
            canvas.drawRoundRect(this.f66057h, f10, f10, this.f66058i);
            f(canvas);
            g(canvas);
        }
    }

    public final void f(Canvas canvas) {
        if (a(this.f66065p) || this.f66064o == 0.0f) {
            return;
        }
        RectF rectF = this.f66051b;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f66051b.height() + f11;
        float f12 = this.f66064o;
        if (!this.f66065p[0]) {
            this.f66060k.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.f66060k, this.f66054e);
        }
        if (!this.f66065p[1]) {
            this.f66060k.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.f66060k, this.f66054e);
        }
        if (!this.f66065p[2]) {
            this.f66060k.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.f66060k, this.f66054e);
        }
        if (this.f66065p[3]) {
            return;
        }
        this.f66060k.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.f66060k, this.f66054e);
    }

    public final void g(Canvas canvas) {
        float f10;
        if (a(this.f66065p) || this.f66064o == 0.0f) {
            return;
        }
        RectF rectF = this.f66051b;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float fWidth = rectF.width() + f11;
        float fHeight = f12 + this.f66051b.height();
        float f13 = this.f66064o;
        float f14 = this.f66067r / 2.0f;
        if (!this.f66065p[0]) {
            canvas.drawLine(f11 - f14, f12, f11 + f13, f12, this.f66058i);
            canvas.drawLine(f11, f12 - f14, f11, f12 + f13, this.f66058i);
        }
        if (!this.f66065p[1]) {
            canvas.drawLine((fWidth - f13) - f14, f12, fWidth, f12, this.f66058i);
            canvas.drawLine(fWidth, f12 - f14, fWidth, f12 + f13, this.f66058i);
        }
        if (this.f66065p[2]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine((fWidth - f13) - f14, fHeight, fWidth + f14, fHeight, this.f66058i);
            canvas.drawLine(fWidth, fHeight - f10, fWidth, fHeight, this.f66058i);
        }
        if (this.f66065p[3]) {
            return;
        }
        canvas.drawLine(f11 - f14, fHeight, f11 + f10, fHeight, this.f66058i);
        canvas.drawLine(f11, fHeight - f10, f11, fHeight, this.f66058i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f66054e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f66054e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f66056g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f66055f;
    }

    public a h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f66068s = colorStateList;
        this.f66058i.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    public a i(float f10) {
        this.f66067r = f10;
        this.f66058i.setStrokeWidth(f10);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f66068s.isStateful();
    }

    public a j(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (hashSet.isEmpty()) {
            this.f66064o = 0.0f;
        } else {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + fFloatValue);
            }
            this.f66064o = fFloatValue;
        }
        boolean[] zArr = this.f66065p;
        zArr[0] = f10 > 0.0f;
        zArr[1] = f11 > 0.0f;
        zArr[2] = f12 > 0.0f;
        zArr[3] = f13 > 0.0f;
        return this;
    }

    public a k(boolean z10) {
        this.f66066q = z10;
        return this;
    }

    public a l(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f66069t != scaleType) {
            this.f66069t = scaleType;
            o();
        }
        return this;
    }

    public a m(Shader.TileMode tileMode) {
        if (this.f66061l != tileMode) {
            this.f66061l = tileMode;
            this.f66063n = true;
            invalidateSelf();
        }
        return this;
    }

    public a n(Shader.TileMode tileMode) {
        if (this.f66062m != tileMode) {
            this.f66062m = tileMode;
            this.f66063n = true;
            invalidateSelf();
        }
        return this;
    }

    public final void o() {
        float fWidth;
        float fHeight;
        int i10 = C0614a.f66070a[this.f66069t.ordinal()];
        if (i10 == 1) {
            this.f66057h.set(this.f66050a);
            RectF rectF = this.f66057h;
            float f10 = this.f66067r;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.f66059j.reset();
            this.f66059j.setTranslate((int) (((this.f66057h.width() - this.f66055f) * 0.5f) + 0.5f), (int) (((this.f66057h.height() - this.f66056g) * 0.5f) + 0.5f));
        } else if (i10 == 2) {
            this.f66057h.set(this.f66050a);
            RectF rectF2 = this.f66057h;
            float f11 = this.f66067r;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.f66059j.reset();
            float fWidth2 = 0.0f;
            if (this.f66055f * this.f66057h.height() > this.f66057h.width() * this.f66056g) {
                fWidth = this.f66057h.height() / this.f66056g;
                fHeight = 0.0f;
                fWidth2 = (this.f66057h.width() - (this.f66055f * fWidth)) * 0.5f;
            } else {
                fWidth = this.f66057h.width() / this.f66055f;
                fHeight = (this.f66057h.height() - (this.f66056g * fWidth)) * 0.5f;
            }
            this.f66059j.setScale(fWidth, fWidth);
            Matrix matrix = this.f66059j;
            float f12 = this.f66067r;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f12 / 2.0f), ((int) (fHeight + 0.5f)) + (f12 / 2.0f));
        } else if (i10 == 3) {
            this.f66059j.reset();
            float fMin = (((float) this.f66055f) > this.f66050a.width() || ((float) this.f66056g) > this.f66050a.height()) ? Math.min(this.f66050a.width() / this.f66055f, this.f66050a.height() / this.f66056g) : 1.0f;
            float fWidth3 = (int) (((this.f66050a.width() - (this.f66055f * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.f66050a.height() - (this.f66056g * fMin)) * 0.5f) + 0.5f);
            this.f66059j.setScale(fMin, fMin);
            this.f66059j.postTranslate(fWidth3, fHeight2);
            this.f66057h.set(this.f66052c);
            this.f66059j.mapRect(this.f66057h);
            RectF rectF3 = this.f66057h;
            float f13 = this.f66067r;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.f66059j.setRectToRect(this.f66052c, this.f66057h, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.f66057h.set(this.f66052c);
            this.f66059j.setRectToRect(this.f66052c, this.f66050a, Matrix.ScaleToFit.END);
            this.f66059j.mapRect(this.f66057h);
            RectF rectF4 = this.f66057h;
            float f14 = this.f66067r;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.f66059j.setRectToRect(this.f66052c, this.f66057h, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.f66057h.set(this.f66052c);
            this.f66059j.setRectToRect(this.f66052c, this.f66050a, Matrix.ScaleToFit.START);
            this.f66059j.mapRect(this.f66057h);
            RectF rectF5 = this.f66057h;
            float f15 = this.f66067r;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.f66059j.setRectToRect(this.f66052c, this.f66057h, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.f66057h.set(this.f66052c);
            this.f66059j.setRectToRect(this.f66052c, this.f66050a, Matrix.ScaleToFit.CENTER);
            this.f66059j.mapRect(this.f66057h);
            RectF rectF6 = this.f66057h;
            float f16 = this.f66067r;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.f66059j.setRectToRect(this.f66052c, this.f66057h, Matrix.ScaleToFit.FILL);
        } else {
            this.f66057h.set(this.f66050a);
            RectF rectF7 = this.f66057h;
            float f17 = this.f66067r;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.f66059j.reset();
            this.f66059j.setRectToRect(this.f66052c, this.f66057h, Matrix.ScaleToFit.FILL);
        }
        this.f66051b.set(this.f66057h);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f66068s.getColorForState(iArr, 0);
        if (this.f66058i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f66058i.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f66054e.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f66054e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f66054e.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f66054e.setFilterBitmap(z10);
        invalidateSelf();
    }

    public a(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f66052c = rectF;
        this.f66057h = new RectF();
        this.f66059j = new Matrix();
        this.f66060k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f66061l = tileMode;
        this.f66062m = tileMode;
        this.f66063n = true;
        this.f66064o = 0.0f;
        this.f66065p = new boolean[]{true, true, true, true};
        this.f66066q = false;
        this.f66067r = 0.0f;
        this.f66068s = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.f66069t = ImageView.ScaleType.FIT_CENTER;
        this.f66053d = bitmap;
        int width = bitmap.getWidth();
        this.f66055f = width;
        int height = bitmap.getHeight();
        this.f66056g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f66054e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f66058i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f66068s.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.f66067r);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f66050a.set(rect);
        o();
    }
}
