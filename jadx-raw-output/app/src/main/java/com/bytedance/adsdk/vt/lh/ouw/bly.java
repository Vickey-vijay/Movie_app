package com.bytedance.adsdk.vt.lh.ouw;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bly implements mwh<PointF, PointF> {
    private final vt ouw;
    private final vt vt;

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public final List<com.bytedance.adsdk.vt.ra.ouw<PointF>> lh() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouw() {
        return new com.bytedance.adsdk.vt.ouw.vt.jg(this.ouw.ouw(), this.vt.ouw());
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public final boolean vt() {
        return this.ouw.vt() && this.vt.vt();
    }

    public bly(vt vtVar, vt vtVar2) {
        this.ouw = vtVar;
        this.vt = vtVar2;
    }
}
