package com.bytedance.sdk.openadsdk.core.widget;

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
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public class zih extends com.bytedance.sdk.openadsdk.core.le.yu {
    private final RectF fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private BitmapShader f13161le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f13162lh;
    private final Paint ouw;
    private int vt;
    private final Matrix yu;

    public zih(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.yu, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.yu, android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private zih(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void setXRound(int i10) {
        this.vt = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.f13162lh = i10;
        postInvalidate();
    }

    private zih(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, 0);
        this.vt = 25;
        this.f13162lh = 25;
        this.fkw = new RectF();
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.yu = new Matrix();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int intrinsicWidth;
        int intrinsicHeight;
        Bitmap bitmap;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f13161le == null) {
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
                this.f13161le = new BitmapShader(bitmap, tileMode, tileMode);
                float fMax = 1.0f;
                if (bitmap.getWidth() != getWidth() || bitmap.getHeight() != getHeight()) {
                    fMax = Math.max((getWidth() * 1.0f) / bitmap.getWidth(), (getHeight() * 1.0f) / bitmap.getHeight());
                }
                this.yu.setScale(fMax, fMax);
                this.f13161le.setLocalMatrix(this.yu);
            }
        }
        BitmapShader bitmapShader = this.f13161le;
        if (bitmapShader != null) {
            this.ouw.setShader(bitmapShader);
            canvas.drawRoundRect(this.fkw, this.vt, this.f13162lh, this.ouw);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.fkw.set(0.0f, 0.0f, i10, i11);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.f13161le = null;
    }
}
