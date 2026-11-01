package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class vt extends GradientDrawable {
    public Path ouw;
    private final Paint vt;

    public vt() {
        this.ouw = new Path();
        Paint paint = new Paint(1);
        this.vt = paint;
        paint.setColor(-1);
    }

    public void ouw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Path path = this.ouw;
        if (path == null || path.isEmpty()) {
            ouw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.vt, 31);
        ouw(canvas);
        this.vt.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.ouw, this.vt);
        this.vt.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public final void ouw(int i10, int i11, int i12, int i13) {
        this.ouw.addRect(i10, i11, i12, i13, Path.Direction.CW);
        invalidateSelf();
    }

    public vt(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        super(orientation, iArr);
        this.ouw = new Path();
        Paint paint = new Paint(1);
        this.vt = paint;
        paint.setColor(-1);
    }
}
