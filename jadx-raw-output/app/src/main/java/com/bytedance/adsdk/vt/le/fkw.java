package com.bytedance.adsdk.vt.le;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes5.dex */
public final class fkw extends ouw implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bytedance.adsdk.vt.ra f11123le;
    public float ouw = 1.0f;
    private boolean bly = false;
    private long tlj = 0;
    public float vt = 0.0f;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public float f11124lh = 0.0f;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11122cf = 0;
    public float yu = -2.14748365E9f;
    public float fkw = 2.14748365E9f;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f11125ra = false;
    public boolean pno = false;

    public final void bly() {
        lh(true);
        vt(ko());
    }

    public final void cf() {
        this.f11125ra = true;
        rn();
        this.tlj = 0L;
        if (ko() && this.f11124lh == ryl()) {
            ouw(mwh());
        } else if (!ko() && this.f11124lh == mwh()) {
            ouw(ryl());
        }
        fkw();
    }

    public final void ouw(float f10) {
        if (this.vt == f10) {
            return;
        }
        float fVt = ra.vt(f10, ryl(), mwh());
        this.vt = fVt;
        if (this.pno) {
            fVt = (float) Math.floor(fVt);
        }
        this.f11124lh = fVt;
        this.tlj = 0L;
        lh();
    }

    public final void pno() {
        this.f11125ra = true;
        ouw(ko());
        ouw((int) (ko() ? mwh() : ryl()));
        this.tlj = 0L;
        this.f11122cf = 0;
        rn();
    }

    public final void ra() {
        this.f11123le = null;
        this.yu = -2.14748365E9f;
        this.fkw = 2.14748365E9f;
    }

    public final void tlj() {
        lh(true);
        yu();
    }

    public final void vt(float f10) {
        ouw(this.yu, f10);
    }

    private void jg() {
        this.ouw = -this.ouw;
    }

    private boolean ko() {
        return this.ouw < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fRyl;
        float fMwh;
        float fRyl2;
        if (this.f11123le == null) {
            return 0.0f;
        }
        if (ko()) {
            fRyl = mwh() - this.f11124lh;
            fMwh = mwh();
            fRyl2 = ryl();
        } else {
            fRyl = this.f11124lh - ryl();
            fMwh = mwh();
            fRyl2 = ryl();
        }
        return fRyl / (fMwh - fRyl2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        com.bytedance.adsdk.vt.ra raVar = this.f11123le;
        if (raVar == null) {
            return 0L;
        }
        return (long) raVar.ouw();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f11125ra;
    }

    public final float le() {
        com.bytedance.adsdk.vt.ra raVar = this.f11123le;
        if (raVar == null) {
            return 0.0f;
        }
        float f10 = this.f11124lh;
        float f11 = raVar.tlj;
        return (f10 - f11) / (raVar.f11316cf - f11);
    }

    public final float mwh() {
        com.bytedance.adsdk.vt.ra raVar = this.f11123le;
        if (raVar == null) {
            return 0.0f;
        }
        float f10 = this.fkw;
        return f10 == 2.14748365E9f ? raVar.f11316cf : f10;
    }

    public final float ryl() {
        com.bytedance.adsdk.vt.ra raVar = this.f11123le;
        if (raVar == null) {
            return 0.0f;
        }
        float f10 = this.yu;
        return f10 == -2.14748365E9f ? raVar.tlj : f10;
    }

    @Override // com.bytedance.adsdk.vt.le.ouw
    public final void vt() {
        super.vt();
        vt(ko());
    }

    private void lh(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f11125ra = false;
        }
    }

    private void rn() {
        if (isRunning()) {
            lh(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        vt();
        lh(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        float fAbs;
        float fRyl;
        float fMwh;
        rn();
        if (this.f11123le != null && isRunning()) {
            com.bytedance.adsdk.vt.fkw.ouw("LottieValueAnimator#doFrame");
            long j11 = this.tlj;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            com.bytedance.adsdk.vt.ra raVar = this.f11123le;
            if (raVar == null) {
                fAbs = Float.MAX_VALUE;
            } else {
                fAbs = (1.0E9f / raVar.ryl) / Math.abs(this.ouw);
            }
            float f10 = j12 / fAbs;
            float f11 = this.vt;
            if (ko()) {
                f10 = -f10;
            }
            float f12 = f11 + f10;
            boolean z10 = !ra.lh(f12, ryl(), mwh());
            float f13 = this.vt;
            float fVt = ra.vt(f12, ryl(), mwh());
            this.vt = fVt;
            if (this.pno) {
                fVt = (float) Math.floor(fVt);
            }
            this.f11124lh = fVt;
            this.tlj = j10;
            if (!this.pno || this.vt != f13) {
                lh();
            }
            if (z10) {
                if (getRepeatCount() != -1 && this.f11122cf >= getRepeatCount()) {
                    if (this.ouw < 0.0f) {
                        fMwh = ryl();
                    } else {
                        fMwh = mwh();
                    }
                    this.vt = fMwh;
                    this.f11124lh = fMwh;
                    lh(true);
                    vt(ko());
                } else {
                    ouw();
                    this.f11122cf++;
                    if (getRepeatMode() == 2) {
                        this.bly = !this.bly;
                        jg();
                    } else {
                        if (ko()) {
                            fRyl = mwh();
                        } else {
                            fRyl = ryl();
                        }
                        this.vt = fRyl;
                        this.f11124lh = fRyl;
                    }
                    this.tlj = j10;
                }
            }
            if (this.f11123le != null) {
                float f14 = this.f11124lh;
                if (f14 < this.yu || f14 > this.fkw) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.yu), Float.valueOf(this.fkw), Float.valueOf(this.f11124lh)));
                }
            }
            com.bytedance.adsdk.vt.fkw.vt("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(le());
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.bly) {
            this.bly = false;
            jg();
        }
    }

    public final void ouw(int i10) {
        ouw(i10, (int) this.fkw);
    }

    public final void ouw(float f10, float f11) {
        if (f10 <= f11) {
            com.bytedance.adsdk.vt.ra raVar = this.f11123le;
            float f12 = raVar == null ? -3.4028235E38f : raVar.tlj;
            float f13 = raVar == null ? Float.MAX_VALUE : raVar.f11316cf;
            float fVt = ra.vt(f10, f12, f13);
            float fVt2 = ra.vt(f11, f12, f13);
            if (fVt == this.yu && fVt2 == this.fkw) {
                return;
            }
            this.yu = fVt;
            this.fkw = fVt2;
            ouw((int) ra.vt(this.f11124lh, fVt, fVt2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }
}
