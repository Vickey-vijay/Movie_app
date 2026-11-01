package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class wj0 implements eq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final os2 f84219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iq f84220b;

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // yads.eq
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        os2 os2Var;
        int intrinsicWidth;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                bitmap2 = bitmapDrawable.getBitmap();
            } else {
                os2Var = this.f84219a;
                os2Var.getClass();
                intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth > 0 || intrinsicHeight <= 0) {
                    iq iqVar = os2Var.f81139a;
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    iqVar.getClass();
                    bitmapCreateBitmap = Bitmap.createBitmap(1, 1, config);
                } else {
                    iq iqVar2 = os2Var.f81139a;
                    Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                    iqVar2.getClass();
                    bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
                }
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                bitmap2 = bitmapCreateBitmap;
            }
        } else {
            os2Var = this.f84219a;
            os2Var.getClass();
            intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight2 = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0) {
                iq iqVar3 = os2Var.f81139a;
                Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
                iqVar3.getClass();
                bitmapCreateBitmap = Bitmap.createBitmap(1, 1, config3);
            } else {
                iq iqVar4 = os2Var.f81139a;
                Bitmap.Config config4 = Bitmap.Config.ARGB_8888;
                iqVar4.getClass();
                bitmapCreateBitmap = Bitmap.createBitmap(1, 1, config4);
            }
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawable.draw(canvas2);
            bitmap2 = bitmapCreateBitmap;
        }
        this.f84220b.getClass();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, 1, 1, true);
        this.f84220b.getClass();
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
        int pixel = bitmapCreateScaledBitmap.getPixel(0, 0);
        int iAlpha = Color.alpha(pixel);
        int iRed = Color.red(pixel);
        int iGreen = Color.green(pixel);
        int iBlue = Color.blue(pixel);
        int pixel2 = bitmapCreateScaledBitmap2.getPixel(0, 0);
        return Math.abs(iAlpha - Color.alpha(pixel2)) <= 20 && Math.abs(iRed - Color.red(pixel2)) <= 20 && Math.abs(iGreen - Color.green(pixel2)) <= 20 && Math.abs(iBlue - Color.blue(pixel2)) <= 20;
    }

    public wj0(os2 os2Var, iq iqVar) {
        this.f84219a = os2Var;
        this.f84220b = iqVar;
    }
}
