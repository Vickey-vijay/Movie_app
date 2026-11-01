package io.bidmachine.rendering.internal;

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
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends Drawable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f60573u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final ImageView.ScaleType f60574v = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f60575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f60576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f60577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f60578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f60579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f60580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f60581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f60582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f60583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Matrix f60584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f60585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Shader.TileMode f60586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Shader.TileMode f60587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f60588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f60589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean[] f60590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f60591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f60592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ColorStateList f60593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView.ScaleType f60594t;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60595a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f60595a = iArr;
        }
    }

    public u(Bitmap bitmap) {
        ck.p.j(bitmap, "bitmap");
        this.f60575a = bitmap;
        this.f60576b = new RectF();
        this.f60577c = new RectF();
        int width = bitmap.getWidth();
        this.f60578d = width;
        int height = bitmap.getHeight();
        this.f60579e = height;
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, width, height);
        this.f60580f = rectF;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f60581g = paint;
        this.f60582h = new RectF();
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f60583i = paint2;
        this.f60584j = new Matrix();
        this.f60585k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f60586l = tileMode;
        this.f60587m = tileMode;
        this.f60588n = true;
        this.f60590p = new boolean[]{true, true, true, true};
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        ck.p.i(colorStateListValueOf, "valueOf(DEFAULT_BORDER_COLOR)");
        this.f60593s = colorStateListValueOf;
        this.f60594t = f60574v;
        paint2.setColor(colorStateListValueOf.getColorForState(getState(), 0));
        paint2.setStrokeWidth(this.f60592r);
    }

    private final boolean a(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private final boolean b(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF;
        Paint paint;
        ck.p.j(canvas, "canvas");
        if (this.f60588n) {
            BitmapShader bitmapShader = new BitmapShader(this.f60575a, this.f60586l, this.f60587m);
            Shader.TileMode tileMode = this.f60586l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f60587m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f60584j);
            }
            this.f60581g.setShader(bitmapShader);
            this.f60588n = false;
        }
        if (this.f60591q) {
            if (this.f60592r > 0.0f) {
                canvas.drawOval(this.f60577c, this.f60581g);
                rectF = this.f60582h;
                paint = this.f60583i;
            } else {
                rectF = this.f60577c;
                paint = this.f60581g;
            }
            canvas.drawOval(rectF, paint);
            return;
        }
        if (!b(this.f60590p)) {
            canvas.drawRect(this.f60577c, this.f60581g);
            if (this.f60592r > 0.0f) {
                canvas.drawRect(this.f60582h, this.f60583i);
                return;
            }
            return;
        }
        float f10 = this.f60589o;
        if (this.f60592r <= 0.0f) {
            canvas.drawRoundRect(this.f60577c, f10, f10, this.f60581g);
            a(canvas);
        } else {
            canvas.drawRoundRect(this.f60577c, f10, f10, this.f60581g);
            canvas.drawRoundRect(this.f60582h, f10, f10, this.f60583i);
            a(canvas);
            b(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f60581g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f60581g.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f60579e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f60578d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f60593s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        ck.p.j(rect, "bounds");
        super.onBoundsChange(rect);
        this.f60576b.set(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ck.p.j(iArr, "state");
        int colorForState = this.f60593s.getColorForState(iArr, 0);
        if (this.f60583i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f60583i.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f60581g.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f60581g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f60581g.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f60581g.setFilterBitmap(z10);
        invalidateSelf();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    private final void a(Canvas canvas) {
        if (a(this.f60590p) || this.f60589o == 0.0f) {
            return;
        }
        RectF rectF = this.f60577c;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f60577c.height() + f11;
        float f12 = this.f60589o;
        if (!this.f60590p[0]) {
            this.f60585k.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.f60585k, this.f60581g);
        }
        if (!this.f60590p[1]) {
            this.f60585k.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.f60585k, this.f60581g);
        }
        if (!this.f60590p[2]) {
            this.f60585k.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.f60585k, this.f60581g);
        }
        if (this.f60590p[3]) {
            return;
        }
        this.f60585k.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.f60585k, this.f60581g);
    }

    private final void b(Canvas canvas) {
        float f10;
        if (a(this.f60590p) || this.f60589o == 0.0f) {
            return;
        }
        RectF rectF = this.f60577c;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float fWidth = rectF.width() + f11;
        float fHeight = f12 + this.f60577c.height();
        float f13 = this.f60589o;
        float f14 = this.f60592r / 2;
        if (!this.f60590p[0]) {
            canvas.drawLine(f11 - f14, f12, f11 + f13, f12, this.f60583i);
            canvas.drawLine(f11, f12 - f14, f11, f12 + f13, this.f60583i);
        }
        if (!this.f60590p[1]) {
            canvas.drawLine((fWidth - f13) - f14, f12, fWidth, f12, this.f60583i);
            canvas.drawLine(fWidth, f12 - f14, fWidth, f12 + f13, this.f60583i);
        }
        if (this.f60590p[2]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine((fWidth - f13) - f14, fHeight, fWidth + f14, fHeight, this.f60583i);
            canvas.drawLine(fWidth, fHeight - f10, fWidth, fHeight, this.f60583i);
        }
        if (this.f60590p[3]) {
            return;
        }
        canvas.drawLine(f11 - f14, fHeight, f11 + f10, fHeight, this.f60583i);
        canvas.drawLine(f11, fHeight - f10, f11, fHeight, this.f60583i);
    }

    public final u a(int i10) {
        return a(ColorStateList.valueOf(i10));
    }

    public final u b(float f10) {
        a(f10, f10, f10, f10);
        return this;
    }

    public final u a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
            ck.p.i(colorStateList, "valueOf(0)");
        }
        this.f60593s = colorStateList;
        this.f60583i.setColor(colorStateList.getColorForState(getState(), 0));
        return this;
    }

    public final u a(float f10) {
        this.f60592r = f10;
        this.f60583i.setStrokeWidth(f10);
        return this;
    }

    public final u a(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (hashSet.isEmpty()) {
                this.f60589o = 0.0f;
            } else {
                float fFloatValue = ((Number) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.f60589o = fFloatValue;
                }
            }
            boolean[] zArr = this.f60590p;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
        }
        return this;
    }

    public final u a(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = f60574v;
        }
        if (this.f60594t != scaleType) {
            this.f60594t = scaleType;
            a();
        }
        return this;
    }

    private final void a() {
        float fWidth;
        float fWidth2;
        Matrix matrix;
        RectF rectF;
        RectF rectF2;
        Matrix.ScaleToFit scaleToFit;
        int i10 = b.f60595a[this.f60594t.ordinal()];
        if (i10 == 1) {
            this.f60582h.set(this.f60576b);
            RectF rectF3 = this.f60582h;
            float f10 = this.f60592r / 2;
            rectF3.inset(f10, f10);
            this.f60584j.reset();
            this.f60584j.setTranslate(((this.f60582h.width() - this.f60578d) * 0.5f) + 0.5f, ((this.f60582h.height() - this.f60579e) * 0.5f) + 0.5f);
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 5) {
                    this.f60582h.set(this.f60580f);
                    matrix = this.f60584j;
                    rectF = this.f60580f;
                    rectF2 = this.f60576b;
                    scaleToFit = Matrix.ScaleToFit.END;
                } else if (i10 != 6) {
                    if (i10 != 7) {
                        this.f60582h.set(this.f60580f);
                        matrix = this.f60584j;
                        rectF = this.f60580f;
                        rectF2 = this.f60576b;
                        scaleToFit = Matrix.ScaleToFit.CENTER;
                    } else {
                        this.f60582h.set(this.f60576b);
                        RectF rectF4 = this.f60582h;
                        float f11 = this.f60592r / 2;
                        rectF4.inset(f11, f11);
                        this.f60584j.reset();
                    }
                    this.f60584j.setRectToRect(this.f60580f, this.f60582h, Matrix.ScaleToFit.FILL);
                } else {
                    this.f60582h.set(this.f60580f);
                    matrix = this.f60584j;
                    rectF = this.f60580f;
                    rectF2 = this.f60576b;
                    scaleToFit = Matrix.ScaleToFit.START;
                }
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
            } else {
                this.f60584j.reset();
                float fMin = (((float) this.f60578d) > this.f60576b.width() || ((float) this.f60579e) > this.f60576b.height()) ? Math.min(this.f60576b.width() / this.f60578d, this.f60576b.height() / this.f60579e) : 1.0f;
                float fWidth3 = ((this.f60576b.width() - (this.f60578d * fMin)) * 0.5f) + 0.5f;
                float fHeight = ((this.f60576b.height() - (this.f60579e * fMin)) * 0.5f) + 0.5f;
                this.f60584j.setScale(fMin, fMin);
                this.f60584j.postTranslate(fWidth3, fHeight);
                this.f60582h.set(this.f60580f);
            }
            this.f60584j.mapRect(this.f60582h);
            RectF rectF5 = this.f60582h;
            float f12 = this.f60592r / 2;
            rectF5.inset(f12, f12);
            this.f60584j.setRectToRect(this.f60580f, this.f60582h, Matrix.ScaleToFit.FILL);
        } else {
            this.f60582h.set(this.f60576b);
            RectF rectF6 = this.f60582h;
            float f13 = 2;
            float f14 = this.f60592r / f13;
            rectF6.inset(f14, f14);
            this.f60584j.reset();
            float fHeight2 = 0.0f;
            if (this.f60578d * this.f60582h.height() > this.f60582h.width() * this.f60579e) {
                fWidth = this.f60582h.height() / this.f60579e;
                fWidth2 = (this.f60582h.width() - (this.f60578d * fWidth)) * 0.5f;
            } else {
                fWidth = this.f60582h.width() / this.f60578d;
                fWidth2 = 0.0f;
                fHeight2 = (this.f60582h.height() - (this.f60579e * fWidth)) * 0.5f;
            }
            this.f60584j.setScale(fWidth, fWidth);
            Matrix matrix2 = this.f60584j;
            float f15 = this.f60592r / f13;
            matrix2.postTranslate(((int) (fWidth2 + 0.5f)) + f15, ((int) (fHeight2 + 0.5f)) + f15);
        }
        this.f60577c.set(this.f60582h);
        this.f60588n = true;
    }
}
