package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes8.dex */
public final class tc extends ImageView {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11533lh;
    private Paint ouw;
    private int vt;
    private Matrix yu;

    public tc(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private tc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setXRound(int i10) {
        this.vt = i10;
        postInvalidate();
    }

    public final void setYRound(int i10) {
        this.f11533lh = i10;
        postInvalidate();
    }

    private tc(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, 0);
        this.vt = 25;
        this.f11533lh = 25;
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setAntiAlias(true);
        this.ouw.setFilterBitmap(true);
        this.yu = new Matrix();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int intrinsicWidth;
        int intrinsicHeight;
        Bitmap bitmap;
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                if (drawable.getIntrinsicWidth() <= 0) {
                    intrinsicWidth = getWidth();
                } else {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                if (drawable.getIntrinsicHeight() <= 0) {
                    intrinsicHeight = getHeight();
                } else {
                    intrinsicHeight = drawable.getIntrinsicHeight();
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable.draw(canvas2);
                bitmap = bitmapCreateBitmap;
            }
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                float fMax = 1.0f;
                if (bitmap.getWidth() != getWidth() || bitmap.getHeight() != getHeight()) {
                    fMax = Math.max((getWidth() * 1.0f) / bitmap.getWidth(), (getHeight() * 1.0f) / bitmap.getHeight());
                }
                this.yu.setScale(fMax, fMax);
                bitmapShader.setLocalMatrix(this.yu);
                this.ouw.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.vt, this.f11533lh, this.ouw);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }
}
