package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fkw extends yu {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        byte b10;
        ArrayList arrayList = new ArrayList();
        switch (this.vt.vpp) {
            case "both":
                b10 = 0;
                break;
            case "none":
                b10 = 3;
                break;
            case "forwards":
                b10 = 1;
                break;
            case "backwards":
                b10 = 2;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.vt.zin)).setDuration(((int) (this.vt.vt * 1000.0d)) / 2);
            duration.setInterpolator(new LinearInterpolator());
            duration.setRepeatMode(2);
            this.vt.f11467ra *= 2;
            arrayList.add(ouw(duration));
        } else if (b10 == 1) {
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.yu, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.vt.zin)).setDuration((int) (this.vt.vt * 1000.0d));
            duration2.setInterpolator(new BounceInterpolator());
            arrayList.add(ouw(duration2));
        } else if (b10 != 2) {
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.yu, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.vt.zin)).setDuration((int) (this.vt.vt * 1000.0d));
            duration3.setInterpolator(new BounceInterpolator());
            duration3.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.fkw.2
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    fkw.this.yu.setTranslationY(0.0f);
                }
            });
            arrayList.add(ouw(duration3));
        } else {
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.yu, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.vt.zin)).setDuration((int) (this.vt.vt * 1000.0d));
            duration4.setInterpolator(new BounceInterpolator());
            duration4.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.fkw.1
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    fkw.this.yu.setTranslationY(0.0f);
                }
            });
            arrayList.add(ouw(duration4));
        }
        return arrayList;
    }

    public fkw(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }
}
