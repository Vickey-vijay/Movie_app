package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class rn implements cf, fkw, mwh, tlj, com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw {
    private final com.bytedance.adsdk.vt.ouw.vt.rn bly;
    private final String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final boolean f11275le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.bly f11276lh;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> f11277ra;
    private yu tlj;
    private final com.bytedance.adsdk.vt.lh.lh.ouw yu;
    private final Matrix ouw = new Matrix();
    private final Path vt = new Path();

    @Override // com.bytedance.adsdk.vt.ouw.ouw.tlj
    public final void ouw(ListIterator<lh> listIterator) {
        if (this.tlj != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.tlj = new yu(this.f11276lh, this.yu, "Repeater", this.f11275le, arrayList, null);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        Path pathYu = this.tlj.yu();
        this.vt.reset();
        float fFloatValue = this.f11277ra.le().floatValue();
        float fFloatValue2 = this.pno.le().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.ouw.set(this.bly.ouw(i10 + fFloatValue2));
            this.vt.addPath(pathYu, this.ouw);
        }
        return this.vt;
    }

    public rn(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.ryl rylVar) {
        this.f11276lh = blyVar;
        this.yu = ouwVar;
        this.fkw = rylVar.ouw;
        this.f11275le = rylVar.fkw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = rylVar.vt.ouw();
        this.f11277ra = ouwVarOuw;
        ouwVar.ouw(ouwVarOuw);
        ouwVarOuw.ouw(this);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw2 = rylVar.f11215lh.ouw();
        this.pno = ouwVarOuw2;
        ouwVar.ouw(ouwVarOuw2);
        ouwVarOuw2.ouw(this);
        com.bytedance.adsdk.vt.ouw.vt.rn rnVarOuw = rylVar.yu.ouw();
        this.bly = rnVarOuw;
        rnVarOuw.ouw(ouwVar);
        rnVarOuw.ouw(this);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        this.tlj.ouw(list, list2);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = this.f11277ra.le().floatValue();
        float fFloatValue2 = this.pno.le().floatValue();
        float fFloatValue3 = this.bly.pno.le().floatValue() / 100.0f;
        float fFloatValue4 = this.bly.bly.le().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.ouw.set(matrix);
            float f10 = i11;
            this.ouw.preConcat(this.bly.ouw(f10 + fFloatValue2));
            this.tlj.ouw(canvas, this.ouw, (int) (i10 * com.bytedance.adsdk.vt.le.ra.ouw(fFloatValue3, fFloatValue4, f10 / fFloatValue)));
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        this.tlj.ouw(rectF, matrix, z10);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        this.f11276lh.invalidateSelf();
    }
}
