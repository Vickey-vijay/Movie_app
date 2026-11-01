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
import android.util.Log;
import android.widget.ImageView;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: StraightImageView.kt */
/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"AppCompatCustomView"})
public final class StraightImageView extends ImageView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f42383j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f42386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f42388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BitmapShader f42389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f42391i;

    /* JADX INFO: compiled from: StraightImageView.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StraightImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.f42384b = 1;
        this.f42388f = new Matrix();
        Paint paint = new Paint();
        this.f42386d = paint;
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
        Log.e("TAG", "onDraw");
        if (getDrawable() == null) {
            return;
        }
        b();
        if (this.f42384b != 1) {
            int i10 = this.f42387e;
            canvas.drawCircle(i10, i10, i10, this.f42386d);
        } else {
            RectF rectF = this.f42391i;
            p.g(rectF);
            int i11 = this.f42385c;
            canvas.drawRoundRect(rectF, i11, i11, this.f42386d);
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
        this.f42384b = bundle.getInt("state_type");
        this.f42385c = bundle.getInt("state_border_radius");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f42384b);
        bundle.putInt("state_border_radius", this.f42385c);
        return bundle;
    }

    public final void setBorderRadius(int i10) {
        fb.a aVar = fb.a.f52935a;
        Context context = getContext();
        p.i(context, "getContext(...)");
        int iA = aVar.a(context, i10);
        if (this.f42385c != iA) {
            this.f42385c = iA;
            invalidate();
        }
    }

    public final void setType(int i10) {
        if (this.f42384b != i10) {
            this.f42384b = i10;
            if (i10 != 1 && i10 != 0) {
                this.f42384b = 0;
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
        this.f42389g = new BitmapShader(bitmapA, tileMode, tileMode);
        int i10 = this.f42384b;
        float fMax = 1.0f;
        if (i10 == 0) {
            fMax = (this.f42390h * 1.0f) / Math.min(bitmapA.getWidth(), bitmapA.getHeight());
        } else if (i10 == 1 && (bitmapA.getWidth() != getWidth() || bitmapA.getHeight() != getHeight())) {
            fMax = Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
        }
        this.f42388f.setScale(fMax, fMax);
        BitmapShader bitmapShader = this.f42389g;
        p.g(bitmapShader);
        bitmapShader.setLocalMatrix(this.f42388f);
        this.f42386d.setShader(this.f42389g);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f42384b == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f42390h = iMin;
            this.f42387e = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f42384b == 1) {
            this.f42391i = new RectF(0.0f, 0.0f, i10, i11);
        }
    }
}
