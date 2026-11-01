package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public final class qbp extends ouw {
    private final String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final boolean f11269le;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> f11270ra;
    private final com.bytedance.adsdk.vt.lh.lh.ouw yu;

    public qbp(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.vm vmVar) {
        super(blyVar, ouwVar, vmVar.f11226ra.ouw(), vmVar.pno.ouw(), vmVar.bly, vmVar.fkw, vmVar.f11224le, vmVar.f11225lh, vmVar.vt);
        this.yu = ouwVar;
        this.fkw = vmVar.ouw;
        this.f11269le = vmVar.tlj;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw = vmVar.yu.ouw();
        this.f11270ra = ouwVarOuw;
        ouwVarOuw.ouw(this);
        ouwVar.ouw(ouwVarOuw);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i10) {
        if (this.f11269le) {
            return;
        }
        this.vt.setColor(((com.bytedance.adsdk.vt.ouw.vt.vt) this.f11270ra).pno());
        com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar = this.pno;
        if (ouwVar != null) {
            this.vt.setColorFilter(ouwVar.le());
        }
        super.ouw(canvas, matrix, i10);
    }
}
