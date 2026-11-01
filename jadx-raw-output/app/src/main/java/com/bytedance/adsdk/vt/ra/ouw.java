package com.bytedance.adsdk.vt.ra;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.vt.ra;

/* JADX INFO: loaded from: classes4.dex */
public class ouw<T> {
    public float bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f11332cf;
    public final Interpolator fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public PointF f11333jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private float f11334ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final Interpolator f11335le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public T f11336lh;
    public PointF mwh;
    private final ra ouw;
    public Float pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final float f11337ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private float f11338rn;
    public int ryl;
    public float tlj;
    public final T vt;
    public final Interpolator yu;

    public ouw(ra raVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f11332cf = 784923401;
        this.ryl = 784923401;
        this.f11334ko = Float.MIN_VALUE;
        this.f11338rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f11333jg = null;
        this.ouw = raVar;
        this.vt = t10;
        this.f11336lh = t11;
        this.yu = interpolator;
        this.fkw = null;
        this.f11335le = null;
        this.f11337ra = f10;
        this.pno = f11;
    }

    public final float lh() {
        if (this.ouw == null) {
            return 1.0f;
        }
        if (this.f11338rn == Float.MIN_VALUE) {
            if (this.pno == null) {
                this.f11338rn = 1.0f;
            } else {
                this.f11338rn = vt() + ((this.pno.floatValue() - this.f11337ra) / this.ouw.vt());
            }
        }
        return this.f11338rn;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.vt + ", endValue=" + this.f11336lh + ", startFrame=" + this.f11337ra + ", endFrame=" + this.pno + ", interpolator=" + this.yu + '}';
    }

    public final float vt() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return 0.0f;
        }
        if (this.f11334ko == Float.MIN_VALUE) {
            this.f11334ko = (this.f11337ra - raVar.tlj) / raVar.vt();
        }
        return this.f11334ko;
    }

    public final boolean yu() {
        return this.yu == null && this.fkw == null && this.f11335le == null;
    }

    public final boolean ouw(float f10) {
        if (f10 >= vt() && f10 < lh()) {
            return true;
        }
        return false;
    }

    public ouw(ra raVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f11332cf = 784923401;
        this.ryl = 784923401;
        this.f11334ko = Float.MIN_VALUE;
        this.f11338rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f11333jg = null;
        this.ouw = raVar;
        this.vt = t10;
        this.f11336lh = t11;
        this.yu = null;
        this.fkw = interpolator;
        this.f11335le = interpolator2;
        this.f11337ra = f10;
        this.pno = f11;
    }

    public ouw(ra raVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f11332cf = 784923401;
        this.ryl = 784923401;
        this.f11334ko = Float.MIN_VALUE;
        this.f11338rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f11333jg = null;
        this.ouw = raVar;
        this.vt = t10;
        this.f11336lh = t11;
        this.yu = interpolator;
        this.fkw = interpolator2;
        this.f11335le = interpolator3;
        this.f11337ra = f10;
        this.pno = f11;
    }

    public ouw(T t10) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f11332cf = 784923401;
        this.ryl = 784923401;
        this.f11334ko = Float.MIN_VALUE;
        this.f11338rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f11333jg = null;
        this.ouw = null;
        this.vt = t10;
        this.f11336lh = t10;
        this.yu = null;
        this.fkw = null;
        this.f11335le = null;
        this.f11337ra = Float.MIN_VALUE;
        this.pno = Float.valueOf(Float.MAX_VALUE);
    }

    public ouw(T t10, T t11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f11332cf = 784923401;
        this.ryl = 784923401;
        this.f11334ko = Float.MIN_VALUE;
        this.f11338rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f11333jg = null;
        this.ouw = null;
        this.vt = t10;
        this.f11336lh = t11;
        this.yu = null;
        this.fkw = null;
        this.f11335le = null;
        this.f11337ra = Float.MIN_VALUE;
        this.pno = Float.valueOf(Float.MAX_VALUE);
    }
}
