package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import kd.e;
import kd.g;
import kd.j;

/* JADX INFO: loaded from: classes9.dex */
public class TransformImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f45726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f45727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f45728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Matrix f45729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f45732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f45733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f45734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f45738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f45739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Uri f45740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Uri f45741q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public hd.b f45742r;

    public class a implements fd.c.a<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f45743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f45744b;

        public a(Uri uri, Uri uri2) {
            this.f45743a = uri;
            this.f45744b = uri2;
        }

        @Override // fd.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            if (bitmap == null) {
                TransformImageView.this.n(this.f45743a, this.f45744b);
            } else {
                TransformImageView.this.j(bitmap.copy(bitmap.getConfig(), true), new hd.b(0, 0, 0), this.f45743a, this.f45744b);
            }
        }
    }

    public class b implements gd.b {
        public b() {
        }

        @Override // gd.b
        public void a(@NonNull Bitmap bitmap, @NonNull hd.b bVar, @NonNull Uri uri, @Nullable Uri uri2) {
            TransformImageView.this.j(bitmap, bVar, uri, uri2);
        }

        @Override // gd.b
        public void onFailure(@NonNull Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            c cVar = TransformImageView.this.f45732h;
            if (cVar != null) {
                cVar.b(exc);
            }
        }
    }

    public interface c {
        void a();

        void b(@NonNull Exception exc);

        void c(float f10);

        void d(float f10);
    }

    public TransformImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public float b(@NonNull Matrix matrix) {
        return (float) (-(Math.atan2(d(matrix, 1), d(matrix, 0)) * 57.29577951308232d));
    }

    public float c(@NonNull Matrix matrix) {
        return (float) Math.sqrt(Math.pow(d(matrix, 0), 2.0d) + Math.pow(d(matrix, 3), 2.0d));
    }

    public void g(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f45729e.postRotate(f10, f11, f12);
            setImageMatrix(this.f45729e);
            c cVar = this.f45732h;
            if (cVar != null) {
                cVar.d(b(this.f45729e));
            }
        }
    }

    public void h(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f45729e.postScale(f10, f10, f11, f12);
            setImageMatrix(this.f45729e);
            c cVar = this.f45732h;
            if (cVar != null) {
                cVar.c(c(this.f45729e));
            }
        }
    }

    public void i(float f10, float f11) {
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        this.f45729e.postTranslate(f10, f11);
        setImageMatrix(this.f45729e);
    }

    public TransformImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45726b = new float[8];
        this.f45727c = new float[2];
        this.f45728d = new float[9];
        this.f45729e = new Matrix();
        this.f45735k = false;
        this.f45736l = false;
        this.f45737m = 0;
        e();
    }

    public float d(@NonNull Matrix matrix, @IntRange(from = 0, to = 9) int i10) {
        matrix.getValues(this.f45728d);
        return this.f45728d[i10];
    }

    public void e() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public float getCurrentAngle() {
        return b(this.f45729e);
    }

    public float getCurrentScale() {
        return c(this.f45729e);
    }

    public hd.b getExifInfo() {
        return this.f45742r;
    }

    public String getImageInputPath() {
        return this.f45738n;
    }

    public Uri getImageInputUri() {
        return this.f45740p;
    }

    public String getImageOutputPath() {
        return this.f45739o;
    }

    public Uri getImageOutputUri() {
        return this.f45741q;
    }

    public int getMaxBitmapSize() {
        if (this.f45737m <= 0) {
            this.f45737m = kd.a.a(getContext());
        }
        return this.f45737m;
    }

    public void j(@NonNull Bitmap bitmap, @NonNull hd.b bVar, @NonNull Uri uri, @Nullable Uri uri2) {
        String string;
        this.f45740p = uri;
        this.f45741q = uri2;
        this.f45738n = j.j(uri.toString()) ? uri.toString() : uri.getPath();
        if (uri2 != null) {
            string = j.j(uri2.toString()) ? uri2.toString() : uri2.getPath();
        } else {
            string = null;
        }
        this.f45739o = string;
        this.f45742r = bVar;
        this.f45735k = true;
        setImageBitmap(bitmap);
    }

    public void k(@NonNull Uri uri, @Nullable Uri uri2, boolean z10) {
        if (fd.b.f52944a == null || !z10) {
            n(uri, uri2);
        } else {
            m(uri, uri2);
        }
    }

    public final void l() {
        this.f45729e.mapPoints(this.f45726b, this.f45733i);
        this.f45729e.mapPoints(this.f45727c, this.f45734j);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new e(bitmap));
    }

    public void setMaxBitmapSize(int i10) {
        this.f45737m = i10;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(c cVar) {
        this.f45732h = cVar;
    }

    public void f() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Log.d("TransformImageView", String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.f45733i = g.b(rectF);
        this.f45734j = g.a(rectF);
        this.f45736l = true;
        c cVar = this.f45732h;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Nullable
    public Bitmap getViewBitmap() {
        if (getDrawable() != null && (getDrawable() instanceof e)) {
            return ((e) getDrawable()).a();
        }
        return null;
    }

    public final void m(@NonNull Uri uri, @Nullable Uri uri2) {
        int[] iArrI = kd.a.i(getContext(), uri);
        if (iArrI[0] > 0 && iArrI[1] > 0) {
            fd.b.f52944a.b(getContext(), uri, iArrI[0], iArrI[1], new a(uri, uri2));
        } else {
            n(uri, uri2);
        }
    }

    public final void n(@NonNull Uri uri, @Nullable Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        kd.a.e(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new b());
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 || (this.f45735k && !this.f45736l)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f45730f = width - paddingLeft;
            this.f45731g = height - paddingTop;
            f();
        }
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f45729e.set(matrix);
        l();
    }
}
