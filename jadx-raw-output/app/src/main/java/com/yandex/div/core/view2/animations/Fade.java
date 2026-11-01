package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.core.view.ViewCompat;
import androidx.transition.TransitionValues;
import bk.l;
import ck.i;
import ck.p;
import java.util.Map;
import mj.r;

/* JADX INFO: compiled from: Fade.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class Fade extends OutlineAwareVisibility {
    private static final Companion Companion = new Companion(null);
    private final float alpha;

    /* JADX INFO: compiled from: Fade.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Fade.kt */
    public static final class FadeAnimatorListener extends AnimatorListenerAdapter {
        private boolean isLayerTypeChanged;
        private final float nonTransitionAlpha;
        private final View view;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.view.setAlpha(this.nonTransitionAlpha);
            if (this.isLayerTypeChanged) {
                this.view.setLayerType(0, null);
            }
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.view.setVisibility(0);
            if (ViewCompat.hasOverlappingRendering(this.view) && this.view.getLayerType() == 0) {
                this.isLayerTypeChanged = true;
                this.view.setLayerType(2, null);
            }
        }

        public FadeAnimatorListener(View view, float f10) {
            this.view = view;
            this.nonTransitionAlpha = f10;
        }
    }

    public Fade() {
        this(0.0f, 1, null);
    }

    public /* synthetic */ Fade(float f10, int i10, i iVar) {
        this((i10 & 1) != 0 ? 0.0f : f10);
    }

    private final float getCapturedAlpha(TransitionValues transitionValues, float f10) {
        Map<String, Object> map;
        Object obj = (transitionValues == null || (map = transitionValues.values) == null) ? null : map.get("yandex:fade:alpha");
        Float f11 = obj instanceof Float ? (Float) obj : null;
        return f11 != null ? f11.floatValue() : f10;
    }

    public Fade(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.alpha = f10;
    }

    private final Animator createFadeAnimator(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        view.setAlpha(f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f10, f11);
        objectAnimatorOfFloat.addListener(new FadeAnimatorListener(view, view.getAlpha()));
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        float capturedAlpha = getCapturedAlpha(transitionValues, this.alpha);
        float capturedAlpha2 = getCapturedAlpha(transitionValues2, 1.0f);
        Object obj = transitionValues2.values.get("yandex:fade:screenPosition");
        p.h(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return createFadeAnimator(ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, this, (int[]) obj), capturedAlpha, capturedAlpha2);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        return createFadeAnimator(UtilsKt.getViewForAnimate(this, view, viewGroup, transitionValues, "yandex:fade:screenPosition"), getCapturedAlpha(transitionValues, 1.0f), getCapturedAlpha(transitionValues2, this.alpha));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(final TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        int mode = getMode();
        if (mode != 1) {
            if (mode == 2) {
                transitionValues.values.put("yandex:fade:alpha", Float.valueOf(this.alpha));
            }
        } else {
            transitionValues.values.put("yandex:fade:alpha", Float.valueOf(transitionValues.view.getAlpha()));
        }
        UtilsKt.capturePosition(transitionValues, new l<int[], r>() { // from class: com.yandex.div.core.view2.animations.Fade.captureEndValues.1
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
                transitionValues.values.put("yandex:fade:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(final TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        int mode = getMode();
        if (mode != 1) {
            if (mode == 2) {
                transitionValues.values.put("yandex:fade:alpha", Float.valueOf(transitionValues.view.getAlpha()));
            }
        } else {
            transitionValues.values.put("yandex:fade:alpha", Float.valueOf(this.alpha));
        }
        UtilsKt.capturePosition(transitionValues, new l<int[], r>() { // from class: com.yandex.div.core.view2.animations.Fade.captureStartValues.1
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
                transitionValues.values.put("yandex:fade:screenPosition", iArr);
            }
        });
    }
}
