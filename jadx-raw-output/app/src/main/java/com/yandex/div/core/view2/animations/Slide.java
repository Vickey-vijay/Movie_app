package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.R$id;
import ek.b;
import mj.r;

/* JADX INFO: compiled from: Slide.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Slide extends OutlineAwareVisibility {
    private final int distance;
    private final SlideCalculator slideCalculator;
    private final int slideEdge;
    public static final Companion Companion = new Companion(null);
    private static final Slide$Companion$calculatorLeft$1 calculatorLeft = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorLeft$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationX() - Slide.Companion.exactValueBy(i10, view.getRight());
        }
    };
    private static final Slide$Companion$calculatorTop$1 calculatorTop = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorTop$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationY() - Slide.Companion.exactValueBy(i10, view.getBottom());
        }
    };
    private static final Slide$Companion$calculatorRight$1 calculatorRight = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorRight$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationX() + Slide.Companion.exactValueBy(i10, viewGroup.getWidth() - view.getLeft());
        }
    };
    private static final Slide$Companion$calculatorBottom$1 calculatorBottom = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorBottom$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationY() + Slide.Companion.exactValueBy(i10, viewGroup.getHeight() - view.getTop());
        }
    };

    /* JADX INFO: compiled from: Slide.kt */
    public interface SlideCalculator {
        float getGoneX(ViewGroup viewGroup, View view, int i10);

        float getGoneY(ViewGroup viewGroup, View view, int i10);
    }

    /* JADX INFO: compiled from: Slide.kt */
    public static final class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final View movingView;
        private final View originalView;
        private float pausedX;
        private float pausedY;
        private final int startX;
        private final int startY;
        private final float terminalX;
        private final float terminalY;
        private int[] transitionPosition;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.transitionPosition == null) {
                this.transitionPosition = new int[]{this.startX + b.c(this.movingView.getTranslationX()), this.startY + b.c(this.movingView.getTranslationY())};
            }
            this.originalView.setTag(R$id.div_transition_position, this.transitionPosition);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.pausedX = this.movingView.getTranslationX();
            this.pausedY = this.movingView.getTranslationY();
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.movingView.setTranslationX(this.pausedX);
            this.movingView.setTranslationY(this.pausedY);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
            transition.removeListener(this);
        }

        public TransitionPositionListener(View view, View view2, int i10, int i11, float f10, float f11) {
            int[] iArr;
            this.originalView = view;
            this.movingView = view2;
            this.terminalX = f10;
            this.terminalY = f11;
            this.startX = i10 - b.c(view2.getTranslationX());
            this.startY = i11 - b.c(view2.getTranslationY());
            int i12 = R$id.div_transition_position;
            Object tag = view.getTag(i12);
            if (tag instanceof int[]) {
                iArr = (int[]) tag;
            } else {
                iArr = null;
            }
            this.transitionPosition = iArr;
            if (iArr != null) {
                view.setTag(i12, null);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Slide() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public /* synthetic */ Slide(int i10, int i11, int i12, i iVar) {
        this((i12 & 1) != 0 ? -1 : i10, (i12 & 2) != 0 ? 80 : i11);
    }

    private final Animator createTranslateAnimator(View view, Transition transition, TransitionValues transitionValues, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator) {
        float f14;
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = transitionValues.view.getTag(R$id.div_transition_position);
        int[] iArr = tag instanceof int[] ? (int[]) tag : null;
        if (iArr != null) {
            f14 = (iArr[0] - i10) + translationX;
            f15 = (iArr[1] - i11) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int iC = i10 + b.c(f14 - translationX);
        int iC2 = i11 + b.c(f15 - translationY);
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12) {
            if (f15 == f13) {
                return null;
            }
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f15, f13));
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(transitionValues.view, view, iC, iC2, translationX, translationY);
        transition.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        Object obj = transitionValues2.values.get("yandex:slide:screenPosition");
        p.h(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return createTranslateAnimator(ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, this, iArr), this, transitionValues2, iArr[0], iArr[1], this.slideCalculator.getGoneX(viewGroup, view, this.distance), this.slideCalculator.getGoneY(viewGroup, view, this.distance), view.getTranslationX(), view.getTranslationY(), getInterpolator());
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        Object obj = transitionValues.values.get("yandex:slide:screenPosition");
        p.h(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return createTranslateAnimator(UtilsKt.getViewForAnimate(this, view, viewGroup, transitionValues, "yandex:slide:screenPosition"), this, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.slideCalculator.getGoneX(viewGroup, view, this.distance), this.slideCalculator.getGoneY(viewGroup, view, this.distance), getInterpolator());
    }

    /* JADX INFO: compiled from: Slide.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int exactValueBy(int i10, int i11) {
            return i10 == -1 ? i11 : i10;
        }
    }

    /* JADX INFO: compiled from: Slide.kt */
    public static abstract class HorizontalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationY();
        }
    }

    /* JADX INFO: compiled from: Slide.kt */
    public static abstract class VerticalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationX();
        }
    }

    public Slide(int i10, int i11) {
        this.distance = i10;
        this.slideEdge = i11;
        this.slideCalculator = i11 != 3 ? i11 != 5 ? i11 != 48 ? calculatorBottom : calculatorTop : calculatorRight : calculatorLeft;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(final TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new l<int[], r>() { // from class: com.yandex.div.core.view2.animations.Slide.captureEndValues.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(int[] iArr) {
                invoke2(iArr);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(int[] iArr) {
                transitionValues.values.put("yandex:slide:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(final TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new l<int[], r>() { // from class: com.yandex.div.core.view2.animations.Slide.captureStartValues.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(int[] iArr) {
                invoke2(iArr);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(int[] iArr) {
                transitionValues.values.put("yandex:slide:screenPosition", iArr);
            }
        });
    }
}
