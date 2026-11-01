package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes11.dex */
public final class th extends Drawable {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11374lh;
    private Paint ouw;
    private int vt;
    private RectF yu;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        RectF rectF = this.yu;
        int i10 = this.f11374lh;
        canvas.drawRoundRect(rectF, i10, i10, this.ouw);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.ouw.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.ouw.setColorFilter(colorFilter);
    }

    public th(int i10, int i11) {
        this.f11374lh = i10;
        this.vt = i11;
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setColor(0);
        this.ouw.setAntiAlias(true);
        this.ouw.setShadowLayer(i11, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        this.ouw.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = this.vt;
        this.yu = new RectF(i10 + i14, i11 + i14, i12 - i14, i13 - i14);
    }
}
