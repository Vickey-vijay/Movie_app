package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.transition.TransitionValues;
import bk.l;
import ck.i;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: VerticalTranslation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class VerticalTranslation extends OutlineAwareVisibility {
    public static final Companion Companion = new Companion(null);
    private final float stableValue;
    private final float translatedValue;

    /* JADX INFO: compiled from: VerticalTranslation.kt */
    public static final class AnimationEndListener extends AnimatorListenerAdapter {
        private final View view;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.view.setTranslationY(0.0f);
            ViewCompat.setClipBounds(this.view, null);
        }

        public AnimationEndListener(View view) {
            this.view = view;
        }
    }

    /* JADX INFO: compiled from: VerticalTranslation.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: VerticalTranslation.kt */
    @VisibleForTesting
    public static final class TranslationYClipBounds extends Property<View, Float> {
        private final Rect clipBounds;
        private float clipFactor;

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f10) {
            set(view, f10.floatValue());
        }

        public TranslationYClipBounds(View view) {
            super(Float.TYPE, "ClipBoundsTop");
            this.clipBounds = new Rect(0, 0, view.getWidth(), view.getHeight());
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(this.clipFactor);
        }

        public void set(View view, float f10) {
            this.clipFactor = f10;
            if (f10 < 0.0f) {
                this.clipBounds.set(0, (int) ((-f10) * (view.getHeight() - 1)), view.getWidth(), view.getHeight());
            } else if (f10 > 0.0f) {
                float f11 = 1;
                this.clipBounds.set(0, 0, view.getWidth(), (int) (((f11 - this.clipFactor) * view.getHeight()) + f11));
            } else {
                this.clipBounds.set(0, 0, view.getWidth(), view.getHeight());
            }
            ViewCompat.setClipBounds(view, this.clipBounds);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VerticalTranslation() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public /* synthetic */ VerticalTranslation(float f10, float f11, int i10, i iVar) {
        this((i10 & 1) != 0 ? -1.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }

    public VerticalTranslation(float f10, float f11) {
        this.translatedValue = f10;
        this.stableValue = f11;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        float height = view.getHeight();
        float f10 = this.translatedValue * height;
        float f11 = this.stableValue * height;
        Object obj = transitionValues2.values.get("yandex:verticalTranslation:screenPosition");
        p.h(obj, "null cannot be cast to non-null type kotlin.IntArray");
        View viewCreateOrGetVisualCopy = ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, this, (int[]) obj);
        viewCreateOrGetVisualCopy.setTranslationY(f10);
        TranslationYClipBounds translationYClipBounds = new TranslationYClipBounds(viewCreateOrGetVisualCopy);
        translationYClipBounds.set(viewCreateOrGetVisualCopy, this.translatedValue);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewCreateOrGetVisualCopy, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f10, f11), PropertyValuesHolder.ofFloat(translationYClipBounds, this.translatedValue, this.stableValue));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(UtilsKt.getViewForAnimate(this, view, viewGroup, transitionValues, "yandex:verticalTranslation:screenPosition"), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.stableValue, this.translatedValue * view.getHeight()), PropertyValuesHolder.ofFloat(new TranslationYClipBounds(view), this.stableValue, this.translatedValue));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(final TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new l<int[], r>() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation.captureEndValues.1
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
                transitionValues.values.put("yandex:verticalTranslation:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(final TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new l<int[], r>() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation.captureStartValues.1
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
                transitionValues.values.put("yandex:verticalTranslation:screenPosition", iArr);
            }
        });
    }
}
