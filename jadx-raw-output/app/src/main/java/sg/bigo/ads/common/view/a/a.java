package sg.bigo.ads.common.view.a;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends sg.bigo.ads.common.i.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f70218b;

    @Override // sg.bigo.ads.common.i.a, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f69741a;
        if (drawable == null) {
            return;
        }
        if (!(drawable instanceof d.a) || (!((d.a) drawable).f70247a.f70234e)) {
            if (this.f70218b == null) {
                super.draw(canvas);
                return;
            }
            Path path = new Path();
            float[] fArr = new float[8];
            Rect rect = new Rect();
            this.f70218b.a(fArr);
            this.f70218b.a(rect);
            Rect bounds = getBounds();
            Rect rect2 = new Rect(rect.left, rect.top, bounds.width() - rect.right, bounds.height() - rect.bottom);
            path.addRoundRect(new RectF(rect2), fArr, Path.Direction.CW);
            canvas.clipPath(path);
            super.draw(canvas);
            Drawable drawableE = this.f70218b.e();
            if (drawableE != null) {
                drawableE.setBounds(rect2);
                drawableE.draw(canvas);
            }
        }
    }
}
