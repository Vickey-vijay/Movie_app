package com.mgs.carparking.widgets.cardbanner.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: RoundedImageView.kt */
/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"AppCompatCustomView"})
public final class RoundedImageView extends ImageView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f42374j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f42377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f42379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BitmapShader f42380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f42382i;

    /* JADX INFO: compiled from: RoundedImageView.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.f42375b = 1;
        this.f42376c = 6;
        this.f42379f = new Matrix();
        Paint paint = new Paint();
        this.f42377d = paint;
        paint.setAntiAlias(true);
    }

    public final Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            p.i(bitmap, "getBitmap(...)");
            return bitmap;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        p.i(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        p.j(canvas, "canvas");
        if (getDrawable() == null) {
            return;
        }
        b();
        if (this.f42375b != 1) {
            int i10 = this.f42378e;
            canvas.drawCircle(i10, i10, i10, this.f42377d);
        } else {
            RectF rectF = this.f42382i;
            p.g(rectF);
            int i11 = this.f42376c;
            canvas.drawRoundRect(rectF, i11, i11, this.f42377d);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        p.j(parcelable, "state");
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
        this.f42375b = bundle.getInt("state_type");
        this.f42376c = bundle.getInt("state_border_radius");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f42375b);
        bundle.putInt("state_border_radius", this.f42376c);
        return bundle;
    }

    public final void setBorderRadius(int i10) {
        fb.a aVar = fb.a.f52935a;
        Context context = getContext();
        p.i(context, "getContext(...)");
        int iA = aVar.a(context, i10);
        if (this.f42376c != iA) {
            this.f42376c = iA;
            invalidate();
        }
    }

    public final void setType(int i10) {
        if (this.f42375b != i10) {
            this.f42375b = i10;
            if (i10 != 1 && i10 != 0) {
                this.f42375b = 0;
            }
            requestLayout();
        }
    }

    public final void b() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        Bitmap bitmapA = a(drawable);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f42380g = new BitmapShader(bitmapA, tileMode, tileMode);
        int i10 = this.f42375b;
        float fMax = 1.0f;
        if (i10 == 0) {
            fMax = (this.f42381h * 1.0f) / Math.min(bitmapA.getWidth(), bitmapA.getHeight());
        } else if (i10 == 1 && (bitmapA.getWidth() != getWidth() || bitmapA.getHeight() != getHeight())) {
            fMax = Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
        }
        this.f42379f.setScale(fMax, fMax);
        BitmapShader bitmapShader = this.f42380g;
        p.g(bitmapShader);
        bitmapShader.setLocalMatrix(this.f42379f);
        this.f42377d.setShader(this.f42380g);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f42375b == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f42381h = iMin;
            this.f42378e = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f42375b == 1) {
            this.f42382i = new RectF(0.0f, 0.0f, i10, i11);
        }
    }
}
