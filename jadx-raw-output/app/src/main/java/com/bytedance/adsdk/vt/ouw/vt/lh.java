package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes11.dex */
public final class lh implements ouw.InterfaceC0078ouw {
    private final ouw<Float, Float> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final ouw<Float, Float> f11294le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final ouw<Float, Float> f11295lh;
    private final ouw.InterfaceC0078ouw ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f11296ra = true;
    private final ouw<Integer, Integer> vt;
    private final ouw<Float, Float> yu;

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        this.f11296ra = true;
        this.ouw.ouw();
    }

    public lh(ouw.InterfaceC0078ouw interfaceC0078ouw, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.fkw.tlj tljVar) {
        this.ouw = interfaceC0078ouw;
        ouw<Integer, Integer> ouwVarOuw = tljVar.ouw.ouw();
        this.vt = ouwVarOuw;
        ouwVarOuw.ouw(this);
        ouwVar.ouw(ouwVarOuw);
        ouw<Float, Float> ouwVarOuw2 = tljVar.vt.ouw();
        this.f11295lh = ouwVarOuw2;
        ouwVarOuw2.ouw(this);
        ouwVar.ouw(ouwVarOuw2);
        ouw<Float, Float> ouwVarOuw3 = tljVar.f11097lh.ouw();
        this.yu = ouwVarOuw3;
        ouwVarOuw3.ouw(this);
        ouwVar.ouw(ouwVarOuw3);
        ouw<Float, Float> ouwVarOuw4 = tljVar.yu.ouw();
        this.fkw = ouwVarOuw4;
        ouwVarOuw4.ouw(this);
        ouwVar.ouw(ouwVarOuw4);
        ouw<Float, Float> ouwVarOuw5 = tljVar.fkw.ouw();
        this.f11294le = ouwVarOuw5;
        ouwVarOuw5.ouw(this);
        ouwVar.ouw(ouwVarOuw5);
    }

    public final void ouw(Paint paint) {
        if (this.f11296ra) {
            this.f11296ra = false;
            double dFloatValue = ((double) this.yu.le().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.fkw.le().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.vt.le().intValue();
            paint.setShadowLayer(this.f11294le.le().floatValue(), fSin, fCos, Color.argb(Math.round(this.f11295lh.le().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
