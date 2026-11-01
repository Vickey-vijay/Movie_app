package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.lh.bly;
import com.bytedance.sdk.component.adexpress.le.zih;

/* JADX INFO: loaded from: classes10.dex */
public final class vt implements View.OnTouchListener {
    private bly fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno f11407le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private long f11408lh;
    private float ouw;
    private float vt;
    private boolean yu;

    public vt(bly blyVar, com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar) {
        this.fkw = blyVar;
        this.f11407le = pnoVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        bly blyVar;
        View view2;
        ValueAnimator valueAnimator;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (Math.abs(x10 - this.ouw) >= com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), 10.0f) || Math.abs(y10 - this.vt) >= com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), 10.0f)) {
                        this.yu = true;
                        blyVar = this.fkw;
                        if (blyVar.ouw != null && TextUtils.equals(blyVar.f11388lh, "2")) {
                            view2 = blyVar.ouw;
                            if (view2 instanceof com.bytedance.sdk.component.adexpress.le.lh) {
                                com.bytedance.sdk.component.adexpress.le.lh lhVar = (com.bytedance.sdk.component.adexpress.le.lh) view2;
                                valueAnimator = lhVar.ouw.ouw;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                zih zihVar = lhVar.ouw;
                                zihVar.f11557lh = true;
                                zihVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (this.yu) {
                    return false;
                }
                if (System.currentTimeMillis() - this.f11408lh >= 1500) {
                    com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar = this.f11407le;
                    if (pnoVar != null) {
                        pnoVar.ouw();
                    }
                } else {
                    blyVar = this.fkw;
                    if (blyVar.ouw != null) {
                        view2 = blyVar.ouw;
                        if (view2 instanceof com.bytedance.sdk.component.adexpress.le.lh) {
                            com.bytedance.sdk.component.adexpress.le.lh lhVar2 = (com.bytedance.sdk.component.adexpress.le.lh) view2;
                            valueAnimator = lhVar2.ouw.ouw;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            zih zihVar2 = lhVar2.ouw;
                            zihVar2.f11557lh = true;
                            zihVar2.invalidate();
                        }
                    }
                }
            }
        } else {
            this.f11408lh = System.currentTimeMillis();
            this.ouw = motionEvent.getX();
            this.vt = motionEvent.getY();
            bly blyVar2 = this.fkw;
            if (blyVar2.ouw != null && TextUtils.equals(blyVar2.f11388lh, "2")) {
                View view3 = blyVar2.ouw;
                if (view3 instanceof com.bytedance.sdk.component.adexpress.le.lh) {
                    zih zihVar3 = ((com.bytedance.sdk.component.adexpress.le.lh) view3).ouw;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
                    zihVar3.ouw = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration(zihVar3.vt);
                    zihVar3.ouw.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.le.zih.1
                        public AnonymousClass1() {
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            zih.this.f11558ra = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            zih.this.requestLayout();
                        }
                    });
                    zihVar3.ouw.start();
                }
            }
        }
        return true;
    }
}
