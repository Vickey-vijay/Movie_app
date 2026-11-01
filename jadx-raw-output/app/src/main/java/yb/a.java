package yb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import java.util.Arrays;

/* JADX INFO: compiled from: ShadowBitmapDrawable.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends BitmapDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f85670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f85671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RectF f85674f = new RectF();

    public void c(int i10, float f10, int i11, int i12, float[] fArr) {
        boolean z10 = (this.f85669a == i10 && this.f85670b == f10 && this.f85672d == i11 && this.f85673e == i12 && Arrays.equals(this.f85671c, fArr)) ? false : true;
        this.f85669a = i10;
        this.f85671c = fArr;
        this.f85670b = f10;
        this.f85672d = i11;
        this.f85673e = i12;
        if (z10) {
            zb.a.b(this, "setBitmap", new Class[]{Bitmap.class}, new Object[]{a((int) this.f85674f.width(), (int) this.f85674f.height(), this.f85670b, this.f85672d, this.f85673e, this.f85669a, this.f85671c)});
        }
    }

    public Bitmap a(int i10, int i11, float f10, float f11, float f12, int i12, float[] fArr) {
        if (i10 <= 0 || i11 <= 0) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF(f10, f10, i10 - f10, i11 - f10);
        rectF.top += Math.abs(f12);
        rectF.bottom -= Math.abs(f12);
        rectF.left += Math.abs(f11);
        rectF.right -= Math.abs(f11);
        Paint paint = new Paint(5);
        paint.setColor(i12);
        paint.setShadowLayer(f10, f11, f12, i12);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f85674f.set(rect.left + this.f85670b + Math.abs(this.f85672d), rect.top + this.f85670b + Math.abs(this.f85673e), (rect.right - this.f85670b) - Math.abs(this.f85672d), (rect.bottom - this.f85670b) - Math.abs(this.f85673e));
        zb.a.b(this, "setBitmap", new Class[]{Bitmap.class}, new Object[]{a((int) this.f85674f.width(), (int) this.f85674f.height(), this.f85670b, this.f85672d, this.f85673e, this.f85669a, this.f85671c)});
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect.right - rect.left > 0 && rect.bottom - rect.top > 0) {
            b(rect);
        }
    }
}
