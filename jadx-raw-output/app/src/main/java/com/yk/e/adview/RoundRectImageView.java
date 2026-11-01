package com.yk.e.adview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes11.dex */
public class RoundRectImageView extends ImageView {
    public final Paint IL1Iii;

    public RoundRectImageView(Context context) {
        this(context, null);
    }

    public RoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundRectImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.IL1Iii = new Paint();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap.Config config;
        Bitmap bitmapCreateBitmap;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (drawable.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            drawable.draw(new Canvas(bitmapCreateBitmap2));
            int width = getWidth();
            int height = getHeight();
            if (bitmapCreateBitmap2 == null) {
                bitmapCreateBitmap = null;
            } else {
                float f10 = width;
                float width2 = (f10 * 1.0f) / bitmapCreateBitmap2.getWidth();
                float f11 = height;
                float height2 = (1.0f * f11) / bitmapCreateBitmap2.getHeight();
                Matrix matrix = new Matrix();
                matrix.setScale(width2, height2);
                bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint(1);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap2, tileMode, tileMode);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                float f12 = 0;
                float f13 = 7;
                canvas2.drawRoundRect(new RectF(f12, f12, f10, f11), f13, f13, paint);
            }
            Rect rect = new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            Rect rect2 = new Rect(0, 0, getWidth(), getHeight());
            this.IL1Iii.reset();
            canvas.drawBitmap(bitmapCreateBitmap, rect, rect2, this.IL1Iii);
            return;
        }
        super.onDraw(canvas);
    }
}
