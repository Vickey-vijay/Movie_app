package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cf extends ra<PointF> {
    private final PointF fkw;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    /* JADX INFO: renamed from: vt, reason: merged with bridge method [inline-methods] */
    public PointF ouw(com.bytedance.adsdk.vt.ra.ouw<PointF> ouwVar, float f10, float f11) {
        PointF pointF;
        PointF pointF2 = ouwVar.vt;
        if (pointF2 == null || (pointF = ouwVar.f11336lh) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.yu != null) {
            ouwVar.pno.floatValue();
            lh();
            ra();
            throw null;
        }
        PointF pointF5 = this.fkw;
        float f12 = pointF3.x;
        float f13 = f12 + (f10 * (pointF4.x - f12));
        float f14 = pointF3.y;
        pointF5.set(f13, f14 + (f11 * (pointF4.y - f14)));
        return this.fkw;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        return ouw(ouwVar, f10, f10);
    }

    public cf(List<com.bytedance.adsdk.vt.ra.ouw<PointF>> list) {
        super(list);
        this.fkw = new PointF();
    }
}
