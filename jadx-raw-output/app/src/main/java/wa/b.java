package wa;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PaintDrawable.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f73943b;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f73943b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f73943b.setColorFilter(colorFilter);
    }

    public b() {
        Paint paint = new Paint();
        this.f73943b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f73943b.setAntiAlias(true);
        this.f73943b.setColor(-5592406);
    }
}
