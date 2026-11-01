package yads;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k13 {
    public static final float a(g13 g13Var, RectF rectF, RectF rectF2) {
        float f10;
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        float fHeight2 = rectF2.height();
        float fWidth2 = rectF2.width();
        if (fHeight == 0.0f || fWidth == 0.0f || fHeight2 == 0.0f || fWidth2 == 0.0f) {
            return Float.MAX_VALUE;
        }
        if (fWidth2 / fHeight2 > fWidth / fHeight) {
            f10 = fHeight / fHeight2;
        } else {
            f10 = fWidth / fWidth2;
        }
        float fMin = Math.min(1.0f, f10);
        float f11 = g13Var.f77588c * fMin;
        if (fWidth < ((int) f11) || fHeight < ((int) (g13Var.f77589d * fMin))) {
            return Float.MAX_VALUE;
        }
        return Math.abs(fHeight - (g13Var.f77589d * fMin)) + Math.abs(fWidth - f11);
    }
}
