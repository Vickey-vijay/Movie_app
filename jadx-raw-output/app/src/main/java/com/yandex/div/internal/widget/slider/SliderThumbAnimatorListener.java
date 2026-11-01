package com.yandex.div.internal.widget.slider;

import android.animation.Animator;
import bk.l;
import mj.r;

/* JADX INFO: compiled from: SliderThumbAnimatorListener.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class SliderThumbAnimatorListener implements Animator.AnimatorListener {
    private boolean hasCanceled;
    private final l<Boolean, r> onAnimationEnd;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.hasCanceled = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.hasCanceled = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.onAnimationEnd.invoke(Boolean.valueOf(this.hasCanceled));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SliderThumbAnimatorListener(l<? super Boolean, r> lVar) {
        this.onAnimationEnd = lVar;
    }
}
