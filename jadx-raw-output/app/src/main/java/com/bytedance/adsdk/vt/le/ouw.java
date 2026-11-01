package com.bytedance.adsdk.vt.le;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ouw extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> ouw = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> vt = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Set<Animator.AnimatorPauseListener> f11126lh = new CopyOnWriteArraySet();

    final void ouw(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.vt) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z10);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    final void vt(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.vt) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.vt.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f11126lh.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ouw.add(animatorUpdateListener);
    }

    final void fkw() {
        Iterator<Animator.AnimatorPauseListener> it = this.f11126lh.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void lh() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.ouw.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.vt.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.ouw.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.vt.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f11126lh.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ouw.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    final void yu() {
        Iterator<Animator.AnimatorPauseListener> it = this.f11126lh.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    final void ouw() {
        Iterator<Animator.AnimatorListener> it = this.vt.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void vt() {
        Iterator<Animator.AnimatorListener> it = this.vt.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }
}
