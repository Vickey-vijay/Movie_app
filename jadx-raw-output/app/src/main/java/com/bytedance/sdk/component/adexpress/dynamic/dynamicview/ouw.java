package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes4.dex */
public final class ouw extends vt {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Bitmap f11373lh;
    private final Rect vt = new Rect();
    private final Paint yu = new Paint(1);

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vt
    public final void ouw(Canvas canvas) {
        canvas.drawBitmap(this.f11373lh, this.vt, getBounds(), this.yu);
    }

    public ouw(Bitmap bitmap, vt vtVar) {
        this.f11373lh = bitmap;
        if (vtVar != null) {
            this.ouw = vtVar.ouw;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.f11373lh.getWidth();
        int height = this.f11373lh.getHeight();
        this.vt.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.vt;
                int i10 = (width - iWidth) / 2;
                rect2.left = i10;
                rect2.right = i10 + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.vt;
                int i11 = (height - iHeight) / 2;
                rect3.top = i11;
                rect3.bottom = i11 + iHeight;
                return;
            }
            return;
        }
        float f10 = iHeight;
        float f11 = f10 * 1.0f;
        float f12 = height;
        float f13 = f11 / f12;
        float f14 = iWidth;
        float f15 = 1.0f * f14;
        float f16 = width;
        if (Math.max(f13, f15 / f16) > f13) {
            int i12 = (int) ((f11 / f14) * f16);
            Rect rect4 = this.vt;
            int i13 = (height - i12) / 2;
            rect4.top = i13;
            rect4.bottom = i13 + i12;
            return;
        }
        int i14 = (int) ((f15 / f10) * f12);
        Rect rect5 = this.vt;
        int i15 = (width - i14) / 2;
        rect5.left = i15;
        rect5.right = i15 + i14;
    }
}
