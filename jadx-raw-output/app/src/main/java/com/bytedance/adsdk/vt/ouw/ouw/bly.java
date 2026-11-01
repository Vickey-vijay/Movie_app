package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class bly extends ouw {
    private final com.bytedance.adsdk.vt.lh.vt.ra bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> f11236cf;
    private final boolean fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.zih f11237jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f11238le;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> mwh;
    private final RectF pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f11239ra;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ryl;
    private final int tlj;
    private final String yu;

    @Override // com.bytedance.adsdk.vt.ouw.ouw.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i10) {
        RadialGradient radialGradient;
        if (this.fkw) {
            return;
        }
        ouw(this.pno, matrix, false);
        if (this.bly == com.bytedance.adsdk.vt.lh.vt.ra.LINEAR) {
            long jVt = vt();
            radialGradient = this.f11238le.get(jVt);
            if (radialGradient == null) {
                PointF pointFLe = this.ryl.le();
                PointF pointFLe2 = this.mwh.le();
                com.bytedance.adsdk.vt.lh.vt.yu yuVarLe = this.f11236cf.le();
                radialGradient = new LinearGradient(pointFLe.x, pointFLe.y, pointFLe2.x, pointFLe2.y, ouw(yuVarLe.vt), yuVarLe.ouw, Shader.TileMode.CLAMP);
                this.f11238le.put(jVt, (LinearGradient) radialGradient);
            }
        } else {
            long jVt2 = vt();
            radialGradient = this.f11239ra.get(jVt2);
            if (radialGradient == null) {
                PointF pointFLe3 = this.ryl.le();
                PointF pointFLe4 = this.mwh.le();
                com.bytedance.adsdk.vt.lh.vt.yu yuVarLe2 = this.f11236cf.le();
                int[] iArrOuw = ouw(yuVarLe2.vt);
                float[] fArr = yuVarLe2.ouw;
                float f10 = pointFLe3.x;
                float f11 = pointFLe3.y;
                radialGradient = new RadialGradient(f10, f11, (float) Math.hypot(pointFLe4.x - f10, pointFLe4.y - f11), iArrOuw, fArr, Shader.TileMode.CLAMP);
                this.f11239ra.put(jVt2, (RadialGradient) radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.vt.setShader(radialGradient);
        super.ouw(canvas, matrix, i10);
    }

    public bly(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.le leVar) {
        super(blyVar, ouwVar, leVar.pno.ouw(), leVar.bly.ouw(), leVar.tlj, leVar.yu, leVar.f11210ra, leVar.f11207cf, leVar.ryl);
        this.f11238le = new LongSparseArray<>();
        this.f11239ra = new LongSparseArray<>();
        this.pno = new RectF();
        this.yu = leVar.ouw;
        this.bly = leVar.vt;
        this.fkw = leVar.mwh;
        this.tlj = (int) (blyVar.ouw.ouw() / 32.0f);
        com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> ouwVarOuw = leVar.f11209lh.ouw();
        this.f11236cf = ouwVarOuw;
        ouwVarOuw.ouw(this);
        ouwVar.ouw(ouwVarOuw);
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw2 = leVar.fkw.ouw();
        this.ryl = ouwVarOuw2;
        ouwVarOuw2.ouw(this);
        ouwVar.ouw(ouwVarOuw2);
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw3 = leVar.f11208le.ouw();
        this.mwh = ouwVarOuw3;
        ouwVarOuw3.ouw(this);
        ouwVar.ouw(ouwVarOuw3);
    }

    private int vt() {
        int iRound = Math.round(this.ryl.ra() * this.tlj);
        int iRound2 = Math.round(this.mwh.ra() * this.tlj);
        int iRound3 = Math.round(this.f11236cf.ra() * this.tlj);
        int i10 = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private int[] ouw(int[] iArr) {
        if (this.f11237jg == null) {
            return iArr;
        }
        throw null;
    }
}
