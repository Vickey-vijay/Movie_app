package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalantis.ucrop.R$styleable;
import gd.c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kd.g;

/* JADX INFO: loaded from: classes5.dex */
public class CropImageView extends TransformImageView {
    public float A;
    public int B;
    public int C;
    public long D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RectF f45667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Matrix f45668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f45669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f45670v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f45671w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Runnable f45672x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Runnable f45673y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f45674z;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<CropImageView> f45675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f45676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f45677d = System.currentTimeMillis();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f45678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f45679f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f45680g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f45681h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f45682i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f45683j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f45684k;

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = this.f45675b.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.f45676c, System.currentTimeMillis() - this.f45677d);
            float fB = kd.b.b(fMin, 0.0f, this.f45680g, this.f45676c);
            float fB2 = kd.b.b(fMin, 0.0f, this.f45681h, this.f45676c);
            float fA = kd.b.a(fMin, 0.0f, this.f45683j, this.f45676c);
            if (fMin < this.f45676c) {
                float[] fArr = cropImageView.f45727c;
                cropImageView.i(fB - (fArr[0] - this.f45678e), fB2 - (fArr[1] - this.f45679f));
                if (!this.f45684k) {
                    cropImageView.C(this.f45682i + fA, cropImageView.f45667s.centerX(), cropImageView.f45667s.centerY());
                }
                if (cropImageView.u()) {
                    return;
                }
                cropImageView.post(this);
            }
        }

        public a(CropImageView cropImageView, long j10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
            this.f45675b = new WeakReference<>(cropImageView);
            this.f45676c = j10;
            this.f45678e = f10;
            this.f45679f = f11;
            this.f45680g = f12;
            this.f45681h = f13;
            this.f45682i = f14;
            this.f45683j = f15;
            this.f45684k = z10;
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<CropImageView> f45685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f45686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f45687d = System.currentTimeMillis();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f45688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f45689f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f45690g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f45691h;

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = this.f45685b.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.f45686c, System.currentTimeMillis() - this.f45687d);
            float fA = kd.b.a(fMin, 0.0f, this.f45689f, this.f45686c);
            if (fMin >= this.f45686c) {
                cropImageView.y();
            } else {
                cropImageView.C(this.f45688e + fA, this.f45690g, this.f45691h);
                cropImageView.post(this);
            }
        }

        public b(CropImageView cropImageView, long j10, float f10, float f11, float f12, float f13) {
            this.f45685b = new WeakReference<>(cropImageView);
            this.f45686c = j10;
            this.f45688e = f10;
            this.f45689f = f11;
            this.f45690g = f12;
            this.f45691h = f13;
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void t(@NonNull Bitmap.CompressFormat compressFormat, int i10, @Nullable gd.a aVar) {
        s();
        setImageToWrapCropBounds(false);
        hd.c cVar = new hd.c(this.f45667s, g.d(this.f45726b), getCurrentScale(), getCurrentAngle());
        hd.a aVar2 = new hd.a(this.B, this.C, compressFormat, i10, getImageInputPath(), getImageOutputPath(), getExifInfo());
        aVar2.j(getImageInputUri());
        aVar2.k(getImageOutputUri());
        new jd.a(getContext(), getViewBitmap(), cVar, aVar2, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void y() {
        setImageToWrapCropBounds(true);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45667s = new RectF();
        this.f45668t = new Matrix();
        this.f45670v = 10.0f;
        this.f45673y = null;
        this.B = 0;
        this.C = 0;
        this.D = 500L;
    }

    public void B(float f10) {
        C(f10, this.f45667s.centerX(), this.f45667s.centerY());
    }

    public void D(float f10) {
        E(f10, this.f45667s.centerX(), this.f45667s.centerY());
    }

    @Nullable
    public c getCropBoundsChangeListener() {
        return this.f45671w;
    }

    public float getMaxScale() {
        return this.f45674z;
    }

    public float getMinScale() {
        return this.A;
    }

    public float getTargetAspectRatio() {
        return this.f45669u;
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void h(float f10, float f11, float f12) {
        if (f10 > 1.0f && getCurrentScale() * f10 <= getMaxScale()) {
            super.h(f10, f11, f12);
        } else {
            if (f10 >= 1.0f || getCurrentScale() * f10 < getMinScale()) {
                return;
            }
            super.h(f10, f11, f12);
        }
    }

    public final float[] p() {
        this.f45668t.reset();
        this.f45668t.setRotate(-getCurrentAngle());
        float[] fArr = this.f45726b;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        float[] fArrB = g.b(this.f45667s);
        this.f45668t.mapPoints(fArrCopyOf);
        this.f45668t.mapPoints(fArrB);
        RectF rectFD = g.d(fArrCopyOf);
        RectF rectFD2 = g.d(fArrB);
        float f10 = rectFD.left - rectFD2.left;
        float f11 = rectFD.top - rectFD2.top;
        float f12 = rectFD.right - rectFD2.right;
        float f13 = rectFD.bottom - rectFD2.bottom;
        float[] fArr2 = new float[4];
        if (f10 <= 0.0f) {
            f10 = 0.0f;
        }
        fArr2[0] = f10;
        if (f11 <= 0.0f) {
            f11 = 0.0f;
        }
        fArr2[1] = f11;
        if (f12 >= 0.0f) {
            f12 = 0.0f;
        }
        fArr2[2] = f12;
        if (f13 >= 0.0f) {
            f13 = 0.0f;
        }
        fArr2[3] = f13;
        this.f45668t.reset();
        this.f45668t.setRotate(getCurrentAngle());
        this.f45668t.mapPoints(fArr2);
        return fArr2;
    }

    public final void r(float f10, float f11) {
        float fMin = Math.min(Math.min(this.f45667s.width() / f10, this.f45667s.width() / f11), Math.min(this.f45667s.height() / f11, this.f45667s.height() / f10));
        this.A = fMin;
        this.f45674z = fMin * this.f45670v;
    }

    public void s() {
        removeCallbacks(this.f45672x);
        removeCallbacks(this.f45673y);
    }

    public void setCropBoundsChangeListener(@Nullable c cVar) {
        this.f45671w = cVar;
    }

    public void setImageToWrapCropBounds(boolean z10) {
        float f10;
        float fMax;
        float f11;
        if (!this.f45736l || u()) {
            return;
        }
        float[] fArr = this.f45727c;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float currentScale = getCurrentScale();
        float fCenterX = this.f45667s.centerX() - f12;
        float fCenterY = this.f45667s.centerY() - f13;
        this.f45668t.reset();
        this.f45668t.setTranslate(fCenterX, fCenterY);
        float[] fArr2 = this.f45726b;
        float[] fArrCopyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.f45668t.mapPoints(fArrCopyOf);
        boolean zV = v(fArrCopyOf);
        if (zV) {
            float[] fArrP = p();
            float f14 = -(fArrP[0] + fArrP[2]);
            f11 = -(fArrP[1] + fArrP[3]);
            f10 = f14;
            fMax = 0.0f;
        } else {
            RectF rectF = new RectF(this.f45667s);
            this.f45668t.reset();
            this.f45668t.setRotate(getCurrentAngle());
            this.f45668t.mapRect(rectF);
            float[] fArrC = g.c(this.f45726b);
            f10 = fCenterX;
            fMax = (Math.max(rectF.width() / fArrC[0], rectF.height() / fArrC[1]) * currentScale) - currentScale;
            f11 = fCenterY;
        }
        if (z10) {
            a aVar = new a(this, this.D, f12, f13, f10, f11, currentScale, fMax, zV);
            this.f45672x = aVar;
            post(aVar);
        } else {
            i(f10, f11);
            if (zV) {
                return;
            }
            C(currentScale + fMax, this.f45667s.centerX(), this.f45667s.centerY());
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(@IntRange(from = 100) long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.D = j10;
    }

    public void setMaxResultImageSizeX(@IntRange(from = 10) int i10) {
        this.B = i10;
    }

    public void setMaxResultImageSizeY(@IntRange(from = 10) int i10) {
        this.C = i10;
    }

    public void setMaxScaleMultiplier(float f10) {
        this.f45670v = f10;
    }

    public boolean u() {
        return v(this.f45726b);
    }

    public boolean v(float[] fArr) {
        this.f45668t.reset();
        this.f45668t.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        this.f45668t.mapPoints(fArrCopyOf);
        float[] fArrB = g.b(this.f45667s);
        this.f45668t.mapPoints(fArrB);
        return g.d(fArrCopyOf).contains(g.d(fArrB));
    }

    public void w(float f10) {
        g(f10, this.f45667s.centerX(), this.f45667s.centerY());
    }

    public void x(@NonNull TypedArray typedArray) {
        float fAbs = Math.abs(typedArray.getFloat(R$styleable.ucrop_UCropView_ucrop_aspect_ratio_x, 0.0f));
        float fAbs2 = Math.abs(typedArray.getFloat(R$styleable.ucrop_UCropView_ucrop_aspect_ratio_y, 0.0f));
        if (fAbs == 0.0f || fAbs2 == 0.0f) {
            this.f45669u = 0.0f;
        } else {
            this.f45669u = fAbs / fAbs2;
        }
    }

    public final void z(float f10, float f11) {
        float fWidth = this.f45667s.width();
        float fHeight = this.f45667s.height();
        float fMax = Math.max(this.f45667s.width() / f10, this.f45667s.height() / f11);
        RectF rectF = this.f45667s;
        float f12 = ((fWidth - (f10 * fMax)) / 2.0f) + rectF.left;
        float f13 = ((fHeight - (f11 * fMax)) / 2.0f) + rectF.top;
        this.f45729e.reset();
        this.f45729e.postScale(fMax, fMax);
        this.f45729e.postTranslate(f12, f13);
        setImageMatrix(this.f45729e);
    }

    public void A(float f10, float f11, float f12, long j10) {
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b bVar = new b(this, j10, currentScale, f10 - currentScale, f11, f12);
        this.f45673y = bVar;
        post(bVar);
    }

    public void C(float f10, float f11, float f12) {
        if (f10 <= getMaxScale()) {
            h(f10 / getCurrentScale(), f11, f12);
        }
    }

    public void E(float f10, float f11, float f12) {
        if (f10 >= getMinScale()) {
            h(f10 / getCurrentScale(), f11, f12);
        }
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void f() {
        super.f();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.f45669u == 0.0f) {
            this.f45669u = intrinsicWidth / intrinsicHeight;
        }
        int i10 = this.f45730f;
        float f10 = this.f45669u;
        int i11 = (int) (i10 / f10);
        int i12 = this.f45731g;
        if (i11 > i12) {
            int i13 = (int) (i12 * f10);
            int i14 = (i10 - i13) / 2;
            this.f45667s.set(i14, 0.0f, i13 + i14, i12);
        } else {
            int i15 = (i12 - i11) / 2;
            this.f45667s.set(0.0f, i15, i10, i11 + i15);
        }
        r(intrinsicWidth, intrinsicHeight);
        z(intrinsicWidth, intrinsicHeight);
        c cVar = this.f45671w;
        if (cVar != null) {
            cVar.a(this.f45669u);
        }
        TransformImageView.c cVar2 = this.f45732h;
        if (cVar2 != null) {
            cVar2.c(getCurrentScale());
            this.f45732h.d(getCurrentAngle());
        }
    }

    public final void q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        r(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public void setCropRect(RectF rectF) {
        this.f45669u = rectF.width() / rectF.height();
        this.f45667s.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        q();
        y();
    }

    public void setTargetAspectRatio(float f10) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.f45669u = f10;
            return;
        }
        if (f10 == 0.0f) {
            this.f45669u = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        } else {
            this.f45669u = f10;
        }
        c cVar = this.f45671w;
        if (cVar != null) {
            cVar.a(this.f45669u);
        }
    }
}
