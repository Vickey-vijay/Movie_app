package xb;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: RoundDrawable.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f74405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f74408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f74409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f74410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f74411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f74412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Path f74413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f74414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f74415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f74416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f74417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f74418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView.ScaleType f74419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f74420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f74421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f74422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f74423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f74424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float[] f74425u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f74426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f74427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f74428x;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: xb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RoundDrawable.java */
    public static /* synthetic */ class C0789a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74429a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f74429a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74429a[ImageView.ScaleType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74429a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74429a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74429a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74429a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74429a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static Bitmap a(Drawable drawable) {
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
            return null;
        }
    }

    public static a b(Bitmap bitmap) {
        if (bitmap != null) {
            return new a(bitmap);
        }
        return null;
    }

    public static Drawable c(Drawable drawable) {
        if (drawable == null || (drawable instanceof a)) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap bitmapA = a(drawable);
            return bitmapA != null ? new a(bitmapA) : drawable;
        }
        Drawable.ConstantState constantState = drawable.mutate().getConstantState();
        if (constantState != null) {
            drawable = constantState.newDrawable();
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i10 = 0; i10 < numberOfLayers; i10++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), c(layerDrawable.getDrawable(i10)));
        }
        return layerDrawable;
    }

    public static Matrix.ScaleToFit d(ImageView.ScaleType scaleType) {
        int i10 = C0789a.f74429a[scaleType.ordinal()];
        if (i10 == 4) {
            return Matrix.ScaleToFit.CENTER;
        }
        if (i10 == 5) {
            return Matrix.ScaleToFit.END;
        }
        if (i10 != 6) {
            return i10 != 7 ? Matrix.ScaleToFit.CENTER : Matrix.ScaleToFit.FILL;
        }
        return Matrix.ScaleToFit.START;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f74417m) {
            Bitmap bitmap = this.f74405a;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(this.f74418n);
            this.f74409e.setShader(bitmapShader);
            this.f74417m = false;
        }
        if (!this.f74428x) {
            i();
            canvas.drawPath(this.f74413i, this.f74409e);
            if (this.f74426v > 0.0f) {
                g();
                canvas.drawPath(this.f74413i, this.f74410f);
                return;
            }
            return;
        }
        float fWidth = this.f74412h.width() / 2.0f;
        RectF rectF = this.f74412h;
        float f10 = fWidth + rectF.left;
        float fHeight = rectF.height() / 2.0f;
        RectF rectF2 = this.f74412h;
        canvas.drawCircle(f10, fHeight + rectF2.top, Math.min(Math.min(this.f74407c, this.f74406b), Math.min(rectF2.width() / 2.0f, this.f74412h.height() / 2.0f)), this.f74409e);
        if (this.f74426v > 0.0f) {
            float fWidth2 = this.f74411g.width() / 2.0f;
            RectF rectF3 = this.f74411g;
            float f11 = fWidth2 + rectF3.left;
            float fHeight2 = rectF3.height() / 2.0f;
            RectF rectF4 = this.f74411g;
            canvas.drawCircle(f11, fHeight2 + rectF4.top, Math.min(Math.min(this.f74407c, this.f74406b), Math.min(rectF4.width() / 2.0f, this.f74411g.height() / 2.0f)), this.f74410f);
        }
    }

    public void e(ImageView.ScaleType scaleType, float f10, int i10, boolean z10, float f11, float f12, float f13, float f14, float f15) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f74419o != scaleType) {
            this.f74419o = scaleType;
        }
        this.f74426v = f10;
        this.f74427w = i10;
        f();
        this.f74428x = z10;
        this.f74420p = f11;
        this.f74421q = f12;
        this.f74422r = f13;
        this.f74423s = f14;
        this.f74424t = f15;
        h();
        j();
        invalidateSelf();
    }

    public final void f() {
        this.f74410f.setColor(this.f74427w);
        this.f74410f.setStrokeWidth(this.f74426v);
    }

    public final void g() {
        this.f74413i.reset();
        this.f74413i.addRoundRect(this.f74411g, this.f74425u, Path.Direction.CCW);
    }

    public final void h() {
        float f10 = this.f74420p;
        int i10 = 0;
        if (f10 < 0.0f) {
            if (f10 < 0.0f) {
                float[] fArr = this.f74425u;
                float f11 = this.f74421q;
                fArr[0] = f11;
                fArr[1] = f11;
                float f12 = this.f74422r;
                fArr[2] = f12;
                fArr[3] = f12;
                float f13 = this.f74424t;
                fArr[4] = f13;
                fArr[5] = f13;
                float f14 = this.f74423s;
                fArr[6] = f14;
                fArr[7] = f14;
                return;
            }
            return;
        }
        while (true) {
            float[] fArr2 = this.f74425u;
            if (i10 >= fArr2.length) {
                return;
            }
            fArr2[i10] = this.f74420p;
            i10++;
        }
    }

    public final void i() {
        this.f74413i.reset();
        this.f74413i.addRoundRect(this.f74412h, this.f74425u, Path.Direction.CCW);
    }

    public final void j() {
        float fMin;
        float fHeight;
        int i10;
        float fWidth;
        float fWidth2;
        float fHeight2;
        float f10 = this.f74426v / 2.0f;
        this.f74415k.set(this.f74416l);
        int i11 = C0789a.f74429a[this.f74419o.ordinal()];
        if (i11 != 1) {
            float fWidth3 = 0.0f;
            if (i11 == 2) {
                float fMin2 = Math.min(this.f74415k.height(), this.f74408d.height());
                float fMin3 = Math.min(this.f74415k.width(), this.f74408d.width());
                float fHeight3 = (this.f74415k.height() - this.f74408d.height()) / 2.0f;
                float fWidth4 = (this.f74415k.width() - this.f74408d.width()) / 2.0f;
                float f11 = fHeight3 > 0.0f ? fHeight3 : 0.0f;
                fWidth3 = fWidth4 > 0.0f ? fWidth4 : 0.0f;
                RectF rectF = new RectF(fWidth3, f11, fMin3 + fWidth3, fMin2 + f11);
                this.f74414j = rectF;
                boolean z10 = this.f74428x;
                rectF.inset(z10 ? this.f74426v : f10, z10 ? this.f74426v : f10);
                this.f74418n.reset();
                this.f74418n.postTranslate(((int) (fWidth4 + 0.5f)) + f10, ((int) (fHeight3 + 0.5f)) + f10);
            } else if (i11 == 3) {
                this.f74414j.set(this.f74415k);
                RectF rectF2 = this.f74414j;
                boolean z11 = this.f74428x;
                rectF2.inset(z11 ? this.f74426v : f10, z11 ? this.f74426v : f10);
                if (this.f74406b * this.f74414j.height() > this.f74414j.width() * this.f74407c) {
                    fWidth2 = this.f74414j.height() / this.f74407c;
                    fWidth3 = (this.f74414j.width() - (this.f74406b * fWidth2)) * 0.5f;
                    fHeight2 = 0.0f;
                } else {
                    fWidth2 = this.f74414j.width() / this.f74406b;
                    fHeight2 = (this.f74414j.height() - (this.f74407c * fWidth2)) * 0.5f;
                }
                this.f74418n.reset();
                this.f74418n.setScale(fWidth2, fWidth2);
                this.f74418n.postTranslate(((int) (fWidth3 + 0.5f)) + f10, ((int) (fHeight2 + 0.5f)) + f10);
            } else if (i11 != 7) {
                RectF rectF3 = this.f74415k;
                boolean z12 = this.f74428x;
                rectF3.inset(z12 ? this.f74426v : f10, z12 ? this.f74426v : f10);
                this.f74414j.set(this.f74408d);
                this.f74418n.setRectToRect(this.f74408d, this.f74415k, d(this.f74419o));
                this.f74418n.mapRect(this.f74414j);
                this.f74418n.setRectToRect(this.f74408d, this.f74414j, Matrix.ScaleToFit.FILL);
            } else {
                RectF rectF4 = this.f74415k;
                boolean z13 = this.f74428x;
                rectF4.inset(z13 ? this.f74426v : f10, z13 ? this.f74426v : f10);
                this.f74414j.set(this.f74415k);
                this.f74418n.reset();
                this.f74418n.setRectToRect(this.f74408d, this.f74414j, Matrix.ScaleToFit.FILL);
            }
        } else {
            if (this.f74406b > this.f74415k.width() || this.f74407c > this.f74415k.height()) {
                fMin = Math.min(this.f74415k.width() / this.f74406b, this.f74415k.height() / this.f74407c);
                if (this.f74415k.height() < this.f74415k.width()) {
                    fHeight = this.f74415k.height();
                    i10 = this.f74406b;
                } else if (this.f74415k.height() > this.f74415k.width()) {
                    fHeight = this.f74407c * fMin;
                    fWidth = this.f74415k.width();
                } else {
                    fHeight = this.f74407c * fMin;
                    i10 = this.f74406b;
                }
                fWidth = i10 * fMin;
            } else {
                fMin = 1.0f;
                fHeight = this.f74407c;
                fWidth = this.f74406b;
            }
            float fWidth5 = (int) (((this.f74415k.width() - (this.f74406b * fMin)) * 0.5f) + 0.5f);
            float fHeight4 = (int) (((this.f74415k.height() - (this.f74407c * fMin)) * 0.5f) + 0.5f);
            RectF rectF5 = new RectF(fWidth5, fHeight4, fWidth + fWidth5, fHeight + fHeight4);
            this.f74414j = rectF5;
            boolean z14 = this.f74428x;
            rectF5.inset(z14 ? this.f74426v : f10, z14 ? this.f74426v : f10);
            this.f74418n.reset();
            this.f74418n.setScale(fMin, fMin);
            this.f74418n.postTranslate(fWidth5, fHeight4);
        }
        if (this.f74428x) {
            RectF rectF6 = this.f74411g;
            RectF rectF7 = this.f74414j;
            rectF6.set(rectF7.left - f10, rectF7.top - f10, rectF7.right + f10, rectF7.bottom + f10);
        } else {
            this.f74411g.set(this.f74416l);
            this.f74411g.inset(f10, f10);
        }
        this.f74412h.set(this.f74414j);
        this.f74417m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f74409e.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f74409e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public a(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f74408d = rectF;
        this.f74411g = new RectF();
        this.f74412h = new RectF();
        this.f74413i = new Path();
        this.f74414j = new RectF();
        this.f74415k = new RectF();
        this.f74416l = new RectF();
        this.f74417m = true;
        this.f74418n = new Matrix();
        this.f74419o = ImageView.ScaleType.FIT_CENTER;
        this.f74420p = -1.0f;
        this.f74421q = 0.0f;
        this.f74422r = 0.0f;
        this.f74423s = 0.0f;
        this.f74424t = 0.0f;
        this.f74425u = new float[8];
        this.f74426v = 0.0f;
        this.f74427w = ViewCompat.MEASURED_STATE_MASK;
        this.f74428x = true;
        this.f74405a = bitmap;
        int width = bitmap.getWidth();
        this.f74406b = width;
        int height = bitmap.getHeight();
        this.f74407c = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint(1);
        this.f74409e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint(1);
        this.f74410f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        f();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f74416l.set(rect);
        j();
        h();
    }
}
