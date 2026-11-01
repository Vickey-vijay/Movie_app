package bc;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ArrowDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends ac.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5324c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5325d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f5326e = new Path();

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (this.f5324c != iWidth || this.f5325d != iHeight) {
            this.f5326e.reset();
            float f10 = (iWidth * 30) / 225;
            float f11 = f10 * 0.70710677f;
            float f12 = f10 / 0.70710677f;
            float f13 = iWidth;
            float f14 = f13 / 2.0f;
            float f15 = iHeight;
            this.f5326e.moveTo(f14, f15);
            float f16 = f15 / 2.0f;
            this.f5326e.lineTo(0.0f, f16);
            float f17 = f16 - f11;
            this.f5326e.lineTo(f11, f17);
            float f18 = f10 / 2.0f;
            float f19 = f14 - f18;
            float f20 = (f15 - f12) - f18;
            this.f5326e.lineTo(f19, f20);
            this.f5326e.lineTo(f19, 0.0f);
            float f21 = f14 + f18;
            this.f5326e.lineTo(f21, 0.0f);
            this.f5326e.lineTo(f21, f20);
            this.f5326e.lineTo(f13 - f11, f17);
            this.f5326e.lineTo(f13, f16);
            this.f5326e.close();
            this.f5324c = iWidth;
            this.f5325d = iHeight;
        }
        canvas.drawPath(this.f5326e, this.f3526b);
    }
}
