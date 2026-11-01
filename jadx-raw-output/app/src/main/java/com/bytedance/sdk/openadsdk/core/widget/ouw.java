package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"AppCompatCustomView"})
public final class ouw extends com.bytedance.sdk.openadsdk.core.le.yu {
    private int ouw;
    private int vt;

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

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    private int getRadius() {
        if (this.ouw == 0) {
            this.ouw = getWidth();
        }
        if (this.vt == 0) {
            this.vt = getHeight();
        }
        int i10 = this.ouw;
        int i11 = this.vt;
        if (i10 >= i11) {
            i10 = i11;
        }
        return i10 / 2;
    }

    public ouw(Context context) {
        super(context);
        this.ouw = 0;
        this.vt = 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmapCreateBitmap2;
        if (getDrawable() != null && getWidth() != 0 && getHeight() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        measure(0, 0);
        if (getDrawable().getClass() != NinePatchDrawable.class && (!(getDrawable() instanceof BitmapDrawable) || ((BitmapDrawable) getDrawable()).getBitmap() != null)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return;
        }
        try {
            bitmapCreateScaledBitmap = ((BitmapDrawable) getDrawable()).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        } catch (Throwable unused) {
            bitmapCreateScaledBitmap = null;
        }
        if (bitmapCreateScaledBitmap == null) {
            super.onDraw(canvas);
            return;
        }
        int radius = getRadius();
        int i10 = radius * 2;
        try {
            int width = bitmapCreateScaledBitmap.getWidth();
            int height = bitmapCreateScaledBitmap.getHeight();
            if (height > width) {
                bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateScaledBitmap, 0, (height - width) / 2, width, width);
            } else if (height < width) {
                bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateScaledBitmap, (width - height) / 2, 0, height, height);
            } else {
                bitmapCreateBitmap2 = null;
            }
            if (bitmapCreateBitmap2 != null) {
                bitmapCreateScaledBitmap = bitmapCreateBitmap2;
            }
            if (bitmapCreateScaledBitmap.getWidth() != i10 || bitmapCreateScaledBitmap.getHeight() != i10) {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, i10, i10, true);
            }
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            Paint paint = getPaint();
            Rect rect = new Rect(0, 0, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight());
            canvas2.drawARGB(0, 0, 0, 0);
            canvas2.drawCircle(bitmapCreateScaledBitmap.getWidth() / 2, bitmapCreateScaledBitmap.getHeight() / 2, bitmapCreateScaledBitmap.getWidth() / 2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas2.drawBitmap(bitmapCreateScaledBitmap, rect, rect, paint);
        } catch (Throwable unused2) {
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawBitmap(bitmapCreateBitmap, (this.ouw / 2) - radius, (this.vt / 2) - radius, (Paint) null);
        }
    }
}
