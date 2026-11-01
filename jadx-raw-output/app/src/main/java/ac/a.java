package ac;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PaintDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f3526b;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void a(int i10) {
        this.f3526b.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f3526b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3526b.setColorFilter(colorFilter);
    }

    public a() {
        Paint paint = new Paint();
        this.f3526b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3526b.setAntiAlias(true);
        this.f3526b.setColor(-5592406);
    }
}
