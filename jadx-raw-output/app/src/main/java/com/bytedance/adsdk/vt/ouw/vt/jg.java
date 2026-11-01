package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class jg extends ouw<PointF, PointF> {
    private final ouw<Float, Float> bly;
    public com.bytedance.adsdk.vt.ra.vt<Float> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bytedance.adsdk.vt.ra.vt<Float> f11292le;
    private final PointF pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final PointF f11293ra;
    private final ouw<Float, Float> tlj;

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ PointF ouw(com.bytedance.adsdk.vt.ra.ouw<PointF> ouwVar, float f10) {
        return le();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    /* JADX INFO: renamed from: pno, reason: merged with bridge method [inline-methods] */
    public PointF le() {
        com.bytedance.adsdk.vt.ra.ouw<Float> ouwVarVt;
        com.bytedance.adsdk.vt.ra.ouw<Float> ouwVarVt2;
        if (this.fkw != null && (ouwVarVt2 = this.bly.vt()) != null) {
            this.bly.yu();
            Float f10 = ouwVarVt2.pno;
            if (f10 == null) {
                throw null;
            }
            f10.floatValue();
            throw null;
        }
        if (this.f11292le == null || (ouwVarVt = this.tlj.vt()) == null) {
            this.pno.set(this.f11293ra.x, 0.0f);
            PointF pointF = this.pno;
            pointF.set(pointF.x, this.f11293ra.y);
            return this.pno;
        }
        this.tlj.yu();
        Float f11 = ouwVarVt.pno;
        if (f11 == null) {
            throw null;
        }
        f11.floatValue();
        throw null;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final void ouw(float f10) {
        this.bly.ouw(f10);
        this.tlj.ouw(f10);
        this.f11293ra.set(this.bly.le().floatValue(), this.tlj.le().floatValue());
        for (int i10 = 0; i10 < this.ouw.size(); i10++) {
            this.ouw.get(i10).ouw();
        }
    }

    public jg(ouw<Float, Float> ouwVar, ouw<Float, Float> ouwVar2) {
        super(Collections.emptyList());
        this.f11293ra = new PointF();
        this.pno = new PointF();
        this.bly = ouwVar;
        this.tlj = ouwVar2;
        ouw(ra());
    }
}
