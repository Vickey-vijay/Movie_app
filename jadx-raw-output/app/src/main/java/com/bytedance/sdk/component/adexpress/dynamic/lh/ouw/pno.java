package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.ko;

/* JADX INFO: loaded from: classes11.dex */
public final class pno implements View.OnTouchListener {
    private float fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f11401le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final int f11402lh = 10;
    private final com.bytedance.sdk.component.adexpress.dynamic.lh.pno ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private float f11403ra;
    private final boolean vt;
    private float yu;

    public pno(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar, boolean z10) {
        this.ouw = pnoVar;
        this.vt = z10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f11401le = motionEvent.getX();
                this.f11403ra = motionEvent.getY();
                ko.ouw("ValidateSlideUpTouch", "mEndX: ", Float.valueOf(this.f11401le), ", mEndY: " + this.f11403ra);
                if (!this.vt && (pnoVar2 = this.ouw) != null) {
                    pnoVar2.ouw();
                    ko.vt("ValidateSlideUpTouch", "mInteractValidate is false, trigger mInteractListener.onInteractTouch()");
                } else {
                    float f10 = this.f11401le - this.yu;
                    float f11 = this.f11403ra - this.fkw;
                    float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
                    ko.ouw("ValidateSlideUpTouch", "slideDistancePx: ", Float.valueOf(fSqrt));
                    float fVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), Math.abs(fSqrt));
                    ko.ouw("ValidateSlideUpTouch", "slideDistanceDp:", Float.valueOf(fVt), " and ", "mSlideThreshold:", 10);
                    if (fVt > 10.0f && (pnoVar = this.ouw) != null) {
                        pnoVar.ouw();
                        ko.vt("ValidateSlideUpTouch", "trigger mInteractListener.onInteractTouch()");
                    }
                }
            }
        } else {
            this.yu = motionEvent.getX();
            this.fkw = motionEvent.getY();
            ko.ouw("ValidateSlideUpTouch", "mStartX: ", Float.valueOf(this.yu), ", mStartY: " + this.fkw);
        }
        return true;
    }
}
