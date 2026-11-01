package com.mbridge.msdk.videocommon.view;

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
import android.util.TypedValue;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.widget.MBImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public class RoundImageView extends MBImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f39624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Matrix f39626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BitmapShader f39627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f39629j;

    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39626g = new Matrix();
        Paint paint = new Paint();
        this.f39624e = paint;
        paint.setAntiAlias(true);
        this.f39623d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f39622c = 1;
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    private Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            q0.b("View", th2.getMessage());
            return null;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
        this.f39622c = bundle.getInt("state_type");
        this.f39623d = bundle.getInt("state_border_radius");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f39622c);
        bundle.putInt("state_border_radius", this.f39623d);
        return bundle;
    }

    public void setType(int i10) {
        if (this.f39622c != i10) {
            this.f39622c = i10;
            if (i10 != 1 && i10 != 0) {
                this.f39622c = 0;
            }
            requestLayout();
        }
    }

    private void b() {
        Bitmap bitmapA;
        try {
            Drawable drawable = getDrawable();
            if (drawable != null && (bitmapA = a(drawable)) != null && !bitmapA.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f39627h = new BitmapShader(bitmapA, tileMode, tileMode);
                int i10 = this.f39622c;
                float fMax = 1.0f;
                if (i10 == 0) {
                    fMax = (this.f39628i * 1.0f) / Math.min(bitmapA.getWidth(), bitmapA.getHeight());
                } else if (i10 == 1) {
                    fMax = Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
                }
                this.f39626g.setScale(fMax, fMax);
                this.f39627h.setLocalMatrix(this.f39626g);
                this.f39624e.setShader(this.f39627h);
            }
        } catch (Throwable th2) {
            q0.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            if (getDrawable() == null) {
                return;
            }
            b();
            if (this.f39622c == 1) {
                RectF rectF = this.f39629j;
                float f10 = this.f39623d;
                canvas.drawRoundRect(rectF, f10, f10, this.f39624e);
            } else {
                float f11 = this.f39625f;
                canvas.drawCircle(f11, f11, f11, this.f39624e);
            }
        } catch (Throwable th2) {
            q0.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f39622c == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f39628i = iMin;
            this.f39625f = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f39622c == 1) {
            this.f39629j = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i10) {
        int iA = v0.a(getContext(), i10);
        if (this.f39623d != iA) {
            this.f39623d = iA;
            invalidate();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39626g = new Matrix();
        Paint paint = new Paint();
        this.f39624e = paint;
        paint.setAntiAlias(true);
        this.f39623d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f39622c = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.f39626g = new Matrix();
        Paint paint = new Paint();
        this.f39624e = paint;
        paint.setAntiAlias(true);
        this.f39623d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f39622c = 1;
    }
}
