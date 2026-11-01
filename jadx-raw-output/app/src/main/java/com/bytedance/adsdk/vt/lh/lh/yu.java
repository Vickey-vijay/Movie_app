package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public class yu extends ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final Paint f11183cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final Rect f11184jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> f11185ko;
    private final Rect mwh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Bitmap, Bitmap> f11186rn;
    public final com.bytedance.adsdk.vt.tlj ryl;

    public yu(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        super(blyVar, fkwVar);
        this.f11183cf = new com.bytedance.adsdk.vt.ouw.ouw(3);
        this.mwh = new Rect();
        this.f11184jg = new Rect();
        this.ryl = blyVar.yu(fkwVar.f11145ra);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        super.ouw(rectF, matrix, z10);
        if (this.ryl != null) {
            float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
            com.bytedance.adsdk.vt.tlj tljVar = this.ryl;
            rectF.set(0.0f, 0.0f, tljVar.ouw * fOuw, tljVar.vt * fOuw);
            this.ouw.mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[PHI: r0
  0x0010: PHI (r0v12 android.graphics.Bitmap) = (r0v4 android.graphics.Bitmap), (r0v14 android.graphics.Bitmap) binds: [B:11:0x0024, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public void vt(Canvas canvas, Matrix matrix, int i10) {
        Bitmap bitmapOuw;
        super.vt(canvas, matrix, i10);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Bitmap, Bitmap> ouwVar = this.f11186rn;
        Bitmap bitmap = null;
        if (ouwVar != null && (bitmapOuw = ouwVar.le()) != null) {
            bitmap = bitmapOuw;
        } else {
            String str = this.f11164lh.f11145ra;
            com.bytedance.adsdk.vt.vt.vt vtVarPno = this.vt.pno();
            if (vtVarPno != null) {
                bitmapOuw = vtVarPno.ouw(str);
            } else {
                bitmapOuw = null;
            }
            if (bitmapOuw != null) {
                bitmap = bitmapOuw;
            } else {
                com.bytedance.adsdk.vt.tlj tljVar = this.ryl;
                if (tljVar != null) {
                    bitmap = tljVar.f11341cf;
                }
            }
        }
        if (bitmap != null && !bitmap.isRecycled() && this.ryl != null) {
            float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
            this.f11183cf.setAlpha(i10);
            com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar2 = this.f11185ko;
            if (ouwVar2 != null) {
                this.f11183cf.setColorFilter(ouwVar2.le());
            }
            canvas.save();
            canvas.concat(matrix);
            this.mwh.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            if (this.vt.f11089vm) {
                Rect rect = this.f11184jg;
                com.bytedance.adsdk.vt.tlj tljVar2 = this.ryl;
                rect.set(0, 0, (int) (tljVar2.ouw * fOuw), (int) (tljVar2.vt * fOuw));
            } else {
                this.f11184jg.set(0, 0, (int) (bitmap.getWidth() * fOuw), (int) (bitmap.getHeight() * fOuw));
            }
            canvas.drawBitmap(bitmap, this.mwh, this.f11184jg, this.f11183cf);
            canvas.restore();
        }
    }
}
