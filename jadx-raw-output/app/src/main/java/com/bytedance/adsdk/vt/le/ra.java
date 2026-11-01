package com.bytedance.adsdk.vt.le;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.vt.lh.vt.jg;

/* JADX INFO: loaded from: classes11.dex */
public final class ra {
    private static final PointF ouw = new PointF();

    public static boolean lh(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    public static float ouw(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static int ouw(int i10, int i11, float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static PointF ouw(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void ouw(jg jgVar, Path path) {
        path.reset();
        PointF pointF = jgVar.vt;
        path.moveTo(pointF.x, pointF.y);
        ouw.set(pointF.x, pointF.y);
        for (int i10 = 0; i10 < jgVar.ouw.size(); i10++) {
            com.bytedance.adsdk.vt.lh.ouw ouwVar = jgVar.ouw.get(i10);
            PointF pointF2 = ouwVar.ouw;
            PointF pointF3 = ouwVar.vt;
            PointF pointF4 = ouwVar.f11187lh;
            PointF pointF5 = ouw;
            if (pointF2.equals(pointF5) && pointF3.equals(pointF4)) {
                path.lineTo(pointF4.x, pointF4.y);
            } else {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            }
            pointF5.set(pointF4.x, pointF4.y);
        }
        if (jgVar.f11204lh) {
            path.close();
        }
    }

    public static float vt(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int ouw(int i10) {
        return Math.max(0, Math.min(255, i10));
    }

    public static int ouw(float f10, float f11) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (!((i10 ^ i11) >= 0) && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }
}
