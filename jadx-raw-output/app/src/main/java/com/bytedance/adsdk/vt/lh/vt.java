package com.bytedance.adsdk.vt.lh;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes10.dex */
public final class vt {
    public int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f11192cf;
    public int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public float f11193le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public float f11194lh;
    public PointF mwh;
    public String ouw;
    public int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public float f11195ra;
    public PointF ryl;
    public float tlj;
    public String vt;
    public ouw yu;

    public enum ouw {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public vt(String str, String str2, float f10, ouw ouwVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.ouw = str;
        this.vt = str2;
        this.f11194lh = f10;
        this.yu = ouwVar;
        this.fkw = i10;
        this.f11193le = f11;
        this.f11195ra = f12;
        this.pno = i11;
        this.bly = i12;
        this.tlj = f13;
        this.f11192cf = z10;
        this.ryl = pointF;
        this.mwh = pointF2;
    }

    public final int hashCode() {
        int iHashCode = (((((int) ((((this.ouw.hashCode() * 31) + this.vt.hashCode()) * 31) + this.f11194lh)) * 31) + this.yu.ordinal()) * 31) + this.fkw;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f11193le);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.pno;
    }

    public vt() {
    }
}
