package kd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: FastBitmapDrawable.java */
/* JADX INFO: loaded from: classes9.dex */
public class e extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f62760b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f62762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62763e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f62759a = new Paint(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62761c = 255;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public Bitmap a() {
        return this.f62760b;
    }

    public void b(Bitmap bitmap) {
        this.f62760b = bitmap;
        if (bitmap != null) {
            this.f62762d = bitmap.getWidth();
            this.f62763e = this.f62760b.getHeight();
        } else {
            this.f62763e = 0;
            this.f62762d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f62760b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f62760b, (Rect) null, getBounds(), this.f62759a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f62761c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f62763e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f62762d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f62763e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f62762d;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f62761c = i10;
        this.f62759a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f62759a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f62759a.setFilterBitmap(z10);
    }

    public e(Bitmap bitmap) {
        b(bitmap);
    }
}
